package eapli.base.app.executortarefasautomaticas.comunicacao;


import eapli.base.app.executortarefasautomaticas.ExecutorTarefasAutomaticas;
import eapli.base.app.executortarefasautomaticas.protocol.InformacaoUtilizador;
import eapli.base.app.executortarefasautomaticas.utils.Constantes;
import eapli.base.atividade.domain.AtividadeAutomatica;
import eapli.base.atividade.repositories.AtividadeRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class ExecutorTarefasAutomaticasTCPServerConn extends Thread implements Constantes {

    private final Socket aSocket;
    private DataInputStream aDataInputStream;
    private DataOutputStream aDataOutputStream;

    private int request;
    private static final HashMap<Socket, DataOutputStream> mapaClientes = new HashMap<>();

    public static synchronized void removeCliente(Socket s) throws Exception {
        mapaClientes.get(s).write(0);
        mapaClientes.remove(s);
        s.close();
    }

    public static synchronized void adicionarCliente(Socket s) throws Exception {
        mapaClientes.put(s, new DataOutputStream(s.getOutputStream()));
    }

    public static synchronized void sendLastMessagesToCli(Socket s) throws IOException {
        InformacaoUtilizador.sendLast(mapaClientes.get(s), false);
    }

    /*ESTRUTURA DE DADOS*/
    public ExecutorTarefasAutomaticasTCPServerConn(Socket cli_s) {
        aSocket = cli_s;
    }

    @Override
    public void run() {

        InetAddress clientIP;
        clientIP = aSocket.getInetAddress();
        System.out.println("Nova conexão cliente com IP " + clientIP.getHostAddress() + ", PORTA" + aSocket.getPort());
        int num, dataSize;
        boolean fim = false;

        try {
            aDataOutputStream = new DataOutputStream(aSocket.getOutputStream());
            aDataInputStream = new DataInputStream(aSocket.getInputStream());

            try {
                adicionarCliente(aSocket);
            } catch (Exception e) {
                e.printStackTrace();
            }

            while (!fim) {
                dataSize = 0;
                num = 0;
                for (int i = 0; i < NUMERO_MAXIMO_BYTE; i++) {
                    if (i != POSICAO_INICIAL_DADOS && i != POSICAO_NUMERO_BYTES_DADOS) {
                        num = readBytesToInt();
                        if (num == -1) {
                            fim = true;
                            break;
                        }
                    }
                    if (i == POSICAO_VERSAO) {
                        if (!checkVersion(num)) {
                            fim = true;
                            break;
                        }
                    }
                    if (i == POSICAO_CODIGO) {
                        if (!tratamentoCampoCodigo(num)) {
                            fim = true;
                            break;
                        }
                    }
                    if (i == POSICAO_NUMERO_BYTES_DADOS) {
                        dataSize = aDataInputStream.read();
                    }
                    if (i == POSICAO_INICIAL_DADOS) {
                        if (!requestHandler(dataSize)) break;
                    }
                }
            }
            System.out.println("Client " + clientIP.getHostAddress() + ", port number: " + aSocket.getPort() + " disconnected");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*                                                VALIDAÇÕES                                                */

    private boolean requestHandler(int dataSize) {
        if (this.request == EXECUTAR_TAREFA_AUTOMATICA) {
            return executarAtividadeAutomatica();
        }
        return true;
    }

    private boolean executarAtividadeAutomatica() {
        /*Decide qual o algoritmo a usar de acordo com o ficheiro de configurações*/

        AtividadeRepository ATREP = PersistenceContext.repositories().atividade();
        long t, k, num, input;
        try {
            do {
                num = 0;
                t = 1;
                for (k = 0; k < 4; k++) {
                    num = num + t * aDataInputStream.read(); //esta a ler o q lhe é enviado do client
                    t = t * 256;
                }
                input = num;
                if (!ATREP.containsOfIdentity(input)) {
                    int error = ERROR;
                    for (k = 0; k < 4; k++) {
                        aDataOutputStream.write((byte) (error % 256)); //informa do erro
                        error = error / 256;
                    }
                } else {

                    AtividadeAutomatica atividade = (AtividadeAutomatica) ATREP.ofIdentity(input).get();

                    //start da thread executarTarefaAutomatica para escalonar atividade automatica
                    ExecutorTarefasAutomaticas executorTarefasAutomaticas = new ExecutorTarefasAutomaticas(false,1);
                    executorTarefasAutomaticas.associarTrabalho(atividade);
                    executorTarefasAutomaticas.start();

                }
            } while (input != EXIT_SUCCESS);
        } catch (IOException ex) {
            System.err.println("IOException");
        }
        return true;
    }

    private boolean checkVersion(int num) {
        if (num != VERSAO) {
            return invokeRemCli("Versão Errada!!", "Erro na remoção do cliente! -- Versão", false);
        }
        return true;
    }

    private boolean tratamentoCampoCodigo(int num) {
        try {
            if (num == TEST) {
                writeIntToBytes(ENTENDIDO);
                request = 0;
            } else if (num == FIM) {
                writeIntToBytes(ENTENDIDO);
                removeCliente(this.aSocket);
                return false;
            } else if (num == EXECUTAR_TAREFA_AUTOMATICA) {
                writeIntToBytes(num);
                this.request = num;
            } else {
                invokeRemCli("CÓDIGO NO CAMPO CÓDIGO É INVÁLIDO!", "Erro na remoção do cliente! -- Códigos", false);
                throw new IllegalArgumentException();
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return invokeRemCli("Erro Tratammento Campo Código!", "Erro Remoção Cliente!! -- Campo Código!", false);
        }
    }

    private String readByteToString(int dataSize) {
        try {
            byte[] usernameBytes = new byte[dataSize];
            aDataInputStream.read(usernameBytes, 0, dataSize);
            return new String(usernameBytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            invokeRemCli("Erro no tratamento da User Dashboard!", "Erro na remoção do cliente! -- UserDashboard Byte to String", false);
        }
        return null;
    }

    private boolean writeStringtoByte(String string) {
        byte[] data;
        data = string.getBytes();
        try {
            aDataOutputStream.write((byte) string.length());
            aDataOutputStream.write(data, 0, (byte) string.length());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            invokeRemCli("Erro no tratamento da User Dashboard!", "Erro na remoção do cliente! -- UserDashboard String to Byte", false);
            return false;
        }
    }

    private boolean writeIntToBytes(int n) {
        try {
            for (int p = 0; p < 4; p++) {
                aDataOutputStream.write((byte) (n % 256));
                n = n / 256;
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            invokeRemCli("Erro na escrita de Int para Bytes.", "Erro na remoção do cliente! -- Escrita Int Byte", false);
            return false;
        }
    }

    private int readBytesToInt() {
        int num = 0;
        int f = 1;
        try {
            for (int k = 0; k < 4; k++) {
                num = num + f * aDataInputStream.read();
                f = f * 256;
            }
            return num;
        } catch (IOException e) {
            e.printStackTrace();
            return (int) invokeRemCli("Erro na leitura de Bytes para Int", "Erro na remoção do cliente! -- Leitura Byte Int", -1);
        }
    }

    private Number invokeRemCli(String errorReason, String catchMessage, Number value) {
        try {
            System.out.println(errorReason);
            removeCliente(this.aSocket);
        } catch (Exception e) {
            System.err.println(catchMessage);
            e.printStackTrace();
        }
        return value;
    }

    private boolean invokeRemCli(String errorReason, String catchMessage, boolean value) {
        try {
            System.out.println(errorReason);
            removeCliente(this.aSocket);
        } catch (Exception e) {
            System.err.println(catchMessage);
            e.printStackTrace();
        }
        return value;
    }

}
