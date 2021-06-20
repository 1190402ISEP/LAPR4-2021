package eapli.base.app.motorfluxosatividades.servidores;

import eapli.base.app.motorfluxosatividades.application.MotorFluxoAtividadeController;
import eapli.base.app.motorfluxosatividades.client.MotorFluxosDeAtividadesTCPClient;
import eapli.base.app.motorfluxosatividades.escalonadores.EscalonadorSettings;
import eapli.base.app.motorfluxosatividades.escalonadores.assignartarefasacolaboradores.EscalonadoresAssignarTarefas;
import eapli.base.app.motorfluxosatividades.escalonadores.atividadespelasinstancias.EscalonadorAtividadesAutomaticasExecutor;
import eapli.base.app.motorfluxosatividades.protocol.InformacaoUtilizador;
import eapli.base.app.motorfluxosatividades.utils.Constantes;
import eapli.base.atividade.domain.AtividadeAutomatica;
import eapli.base.atividade.repositories.AtividadeRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.pedido.repositories.PedidoRepository;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class MotorFluxoDeAtividadesTcpServerConn extends Thread implements Constantes {
    private final Socket aSocket;
    private DataInputStream aDataInputStream;
    private DataOutputStream aDataOutputStream;
    private EscalonadorSettings settings;
    private EscalonadorAtividadesAutomaticasExecutor escalonadorAtividadesAutomaticasExecutor;
    private EscalonadoresAssignarTarefas escalonadoresAssignarTarefas;
    private MotorFluxosDeAtividadesTCPClient motorFluxosDeAtividadesTCPClient = new MotorFluxosDeAtividadesTCPClient();
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

    public static synchronized void sendLastMessagesToCli(Socket s) throws Exception {
        InformacaoUtilizador.sendLast(mapaClientes.get(s), false);
    }

    /*ESTRUTURA DE DADOS*/
    public MotorFluxoDeAtividadesTcpServerConn(Socket cli_s) {
        aSocket = cli_s;
        this.settings = new EscalonadorSettings();
        this.escalonadorAtividadesAutomaticasExecutor = settings.escalonadorTarefasInstancia();//tarefas por executor
        this.escalonadoresAssignarTarefas = settings.atribuidorDeTarefas(); //tarefas mas para colaborador
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
                        if (!checkVersion(aDataInputStream.read())) {
                            fim = true;
                            break;
                        }
                    }
                    if (i == POSICAO_CODIGO) {
                        if (!tratamentoCampoCodigo(aDataInputStream.read())) {
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
        if (this.request == DASHBOARD_WEB) {
            return tratamentoUserDashboard(dataSize);
        } else if (this.request == AVANCAR_NO_MOTOR_FLUXO) {
            return avancarPedido();
        } else if (this.request == EXECUTAR_TAREFA_AUTOMATICA) {
            return executarAtividadeAutomatica(dataSize);
        }
        return true;
    }


    private boolean executarAtividadeAutomatica(int dataSize) {
        AtividadeRepository ATREP = PersistenceContext.repositories().atividade();
        PedidoRepository PR = PersistenceContext.repositories().pedido();

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
                    //o input será o pedido da atividade que se irá delegar ao executor de tarefas automaticas
                    //escrever o input long id da atividade para um ficheiro de texto

                    AtividadeAutomatica atividade = (AtividadeAutomatica) ATREP.ofIdentity(input).get();
                    //start da thread executarTarefaAutomatica
                    this.escalonadorAtividadesAutomaticasExecutor.adicionarTrabalho(atividade);

                    //avancar o fluxo no motor
                    MotorFluxoAtividadeController theController = new MotorFluxoAtividadeController();
                    System.out.println("Atividade automatica com ID:" + input + " irá ser enviada ao executor de tarefas automáticas!\n\n");
                    //dataSize é o id do pedido cujo fluxo se quer avançar
                    theController.avancarMotorDeFluxo(dataSize);

                    //escritor e leitor usar semaforo

                    motorFluxosDeAtividadesTCPClient.start();
                }
            } while (input != EXIT_SUCCESS);
        } catch (IOException ex) {
            System.err.println("IOException");
        }
        return true;
    }

    public synchronized void escreverNoFicheiro(long input) throws FileNotFoundException {
        File file = new File("idAtividade.txt");
        PrintWriter escritor = new PrintWriter(file);
        escritor.printf(String.valueOf(input));
    }

    private synchronized boolean avancarPedido() {
        int idPedido = readBytesToInt();
        if (idPedido == -1) return false;
        MotorFluxoAtividadeController theController = new MotorFluxoAtividadeController();
        System.out.println("Pedido com ID:" + idPedido + " irá ter a sua primeira tarefa começada.");
        theController.avancarMotorDeFluxo(idPedido);
        return true;
    }

    private boolean checkVersion(int num) {
        if (num != VERSAO) {
            return invokeRemCli("Versão Errada!!", "Erro na remoção do cliente! -- Versão", false);
        }
        return true;
    }

    private synchronized boolean tratamentoUserDashboard(int dataSize) {
        try {
            sendLastMessagesToCli(this.aSocket);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String username;
        if ((username = readByteToString(dataSize)) == null) {
            return false;
        }
        System.out.println(username);
        MotorFluxoAtividadeController theController = new MotorFluxoAtividadeController();
        String userInfo = theController.gerirMotorUserDashboard(username);
        System.out.println(userInfo);
        InformacaoUtilizador.push(userInfo);

        if (!writeStringtoByte(userInfo)) return false;

        try {
            InformacaoUtilizador.sendLast(mapaClientes.get(aSocket), false);
        } catch (IOException e) {
            e.printStackTrace();
            invokeRemCli("Ultima mensagem a enviar falhou.", "Erro Remoção Cliente!! -- Tratamento UD", false);
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
            } else if (num == DASHBOARD_WEB) {
                writeIntToBytes(num);
                this.request = num;
            } else if (num == AVANCAR_NO_MOTOR_FLUXO) {
                writeIntToBytes(num);
                this.request = num;
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