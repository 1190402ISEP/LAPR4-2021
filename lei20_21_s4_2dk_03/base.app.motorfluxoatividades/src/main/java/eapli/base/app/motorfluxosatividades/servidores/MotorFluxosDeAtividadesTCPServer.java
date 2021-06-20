package eapli.base.app.motorfluxosatividades.servidores;

import eapli.base.app.motorfluxosatividades.utils.Constantes;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import java.io.IOException;
import java.net.Socket;

public class MotorFluxosDeAtividadesTCPServer extends Thread implements Constantes {
    int serverPort;

    public MotorFluxosDeAtividadesTCPServer(int serverPort) {
        this.serverPort = serverPort;
    }

    @Override
    public void run() {
        SSLServerSocket sock = null;
        Socket cliSock;
        // Trust these certificates provided by authorized clients
        System.setProperty("javax.net.ssl.trustStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.trustStorePassword", KEYSTORE_PASS);

        // Use this certificate and private key as server certificate
        System.setProperty("javax.net.ssl.keyStore", TRUSTED_STORE);
        System.setProperty("javax.net.ssl.keyStorePassword", KEYSTORE_PASS);

        SSLServerSocketFactory sslF = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        try {
            sock = (SSLServerSocket) sslF.createServerSocket(PORTO_Executor_Tarefas_Automaticas);
            sock.setNeedClientAuth(true);
        } catch (IOException ex) {
            System.out.println("Server failed to open local port " + PORTO_Executor_Tarefas_Automaticas);
            System.exit(EXIT_FAILURE);
        }
        System.out.println("Servidor TCP: pronto, a receber a porta local." + serverPort);

        while (true) {
            try {
                cliSock = sock.accept();
            } catch (IOException e) {
                System.out.println("Servidor TCP: falha na ligação com o cliente.");
                cliSock = null;
            }
            if (cliSock != null) {
                Thread cli = new MotorFluxoDeAtividadesTcpServerConn(cliSock);
                cli.start();
                System.out.println("Servidor TCP: novo cliente ligado através de " + cliSock.getInetAddress().getHostAddress() +
                        ", porta numero " + cliSock.getPort());
            }
        }

    }
}

