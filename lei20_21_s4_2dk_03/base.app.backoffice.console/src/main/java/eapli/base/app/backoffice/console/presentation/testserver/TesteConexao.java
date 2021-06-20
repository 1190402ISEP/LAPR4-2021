package eapli.base.app.backoffice.console.presentation.testserver;


import utils.Constantes;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TesteConexao implements Constantes {

    public static void main(String[] args) throws IOException, InterruptedException {
        doShow();
    }

    protected static boolean doShow() throws IOException, InterruptedException {
        System.out.println("Iniciar comunicação com o servidor");
        InetAddress serverIP = null;
        String frase;
        try {
            serverIP = InetAddress.getByName("Local Host");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        assert serverIP != null;
        Socket socket = null;

        try {
            //TODO alterar porto
            socket = new Socket(serverIP, PORTO_Executor_Tarefas_Automaticas);
        } catch (IOException excep) {
            System.out.println("Falha na conexao");
            System.exit(1);
        }

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

        System.out.println("Ligado ao servidor");

        //Thread conServer = new Thread(new TcpChatCliConn(socket));

        return true;
    }

}
