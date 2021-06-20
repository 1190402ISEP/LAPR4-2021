package eapli.base.app.motorfluxosatividades.client;

import eapli.base.app.motorfluxosatividades.utils.Constantes;
import eapli.base.utils.scriptreader.StringColors;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * The type Motor fluxos tcp client.
 */
public class MotorFluxosDeAtividadesTCPClient extends Thread implements Constantes {

    static InetAddress ipServidor;
    static SSLSocket socket;

    @Override
    public synchronized void run() {
        long input = 0;

        File file = new File("idAtividade.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                input = scanner.nextLong();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        // Trust these certificates provided by servers
        System.setProperty("javax.net.ssl.trustStore", MOTOR_FLUXOS_ATIVIDADES_TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword", EXECUTOR_KEY_PASS);

        // Use this certificate and private key for client certificate when requested by the server
        System.setProperty("javax.net.ssl.keyStore", MOTOR_FLUXOS_ATIVIDADES_TRUSTED_STORE);
        System.setProperty("javax.net.ssl.keyStorePassword", EXECUTOR_KEY_PASS);

        SSLSocketFactory sf = (SSLSocketFactory) SSLSocketFactory.getDefault();

        try {
            ipServidor = InetAddress.getByName(IP_SERVIDOR_EXECUTOR_TAREFAS_AUTOMATICAS);
        } catch (UnknownHostException ex) {
            System.err.println("Invalid server specified: " + IP_SERVIDOR_EXECUTOR_TAREFAS_AUTOMATICAS);
            System.exit(EXIT_FAILURE);
        }

        try {
            socket = (SSLSocket) sf.createSocket(ipServidor, PORTO_SERVIDORES_EXECUTOR_TAREFAS_AUTOMATICAS);
        } catch (IOException ex) {
            System.err.println("Failed to connect to: " + IP_SERVIDOR_EXECUTOR_TAREFAS_AUTOMATICAS + ":" + PORTO_SERVIDORES_EXECUTOR_TAREFAS_AUTOMATICAS);
            System.err.println("Application aborted.");
            System.exit(EXIT_FAILURE);
        }

        System.out.println(StringColors.GREEN + "Connected to: " + IP_SERVIDOR_EXECUTOR_TAREFAS_AUTOMATICAS + ":" + PORTO_SERVIDORES_EXECUTOR_TAREFAS_AUTOMATICAS + StringColors.RESET);

        try {
            socket.startHandshake();
        } catch (IOException e) {
            e.printStackTrace();
        }

        DataOutputStream sOut = null;
        try {
            sOut = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Connected to server");

        // utiliza o id da atividade automatica e envia-o num pacote tcp ao servidor do executor de tarefas automaticas
        while (true) {

            if (input == 0) {
                try {
                    sOut.write(0);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }

            //escreve na mensagem a versão, o código, o nr de bytes e os dados
            //versao
            try {
                for (int p = 0; p < 1; p++) {
                    sOut.write((byte) (VERSAO));
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Erro na escrita da versão!");
            }

            //o codigo
            try {
                for (int p = 0; p < 1; p++) {
                    sOut.write((byte) (EXECUTAR_TAREFA_AUTOMATICA));
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Erro na escrita do código de execucao de tarefa automatica para Bytes!");
            }

            //o nr de bytes
            try {
                for (int p = 0; p < 1; p++) {
                    //um long (id da atividade) tem 4 bytes
                    sOut.write((byte) (4));
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Erro na escrita do numero de bytes de um long para Bytes!");
            }

            //os dados da mensagem
            try {
                for (int p = 0; p < 4; p++) {
                    sOut.write((byte) (input % 256));
                    input = input / 256;
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Erro na escrita de long (id da atividade automática) para Bytes!");
            }
        }

        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

