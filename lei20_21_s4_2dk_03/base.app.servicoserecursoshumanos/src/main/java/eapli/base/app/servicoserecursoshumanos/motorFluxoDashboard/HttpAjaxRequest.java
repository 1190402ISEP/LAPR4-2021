package eapli.base.app.servicoserecursoshumanos.motorFluxoDashboard;

import java.io.*;
import java.net.Socket;

/**
 * The type Http ajax request.
 *
 * @author ANDRE MOREIRA (asc@isep.ipp.pt)
 */
public class HttpAjaxRequest extends Thread {
    /**
     * The Base folder.
     */
    String baseFolder;
    /**
     * The Sock.
     */
    Socket sock;
    /**
     * The In s.
     */
    DataInputStream inS;
    /**
     * The Out s.
     */
    DataOutputStream outS;

    /**
     * Instantiates a new Http ajax request.
     *
     * @param s the s
     * @param f the f
     */
    public HttpAjaxRequest(Socket s, String f) {
        baseFolder = f;
        sock = s;
    }


    public void run() {
        try {
            outS = new DataOutputStream(sock.getOutputStream());
            inS = new DataInputStream(sock.getInputStream());
        } catch (IOException ex) {
            System.out.println("Thread error on data streams creation");
        }
        try {
            HTTPmessage request = new HTTPmessage(inS);
            HTTPmessage response = new HTTPmessage();

            if (request.getMethod().equals("GET")) {
                if (request.getURI().equals("/InformacaoColab")) {
                    response.setContentFromString(HttpServerAjax.getInformacaoColabStandingInHTML(), "text/html");
                    response.setResponseStatus("200 Ok");
                } else if (request.getURI().equals("/votes")) {
                    response.setContentFromString(HttpServerAjax.getVotesStandingInHTML(), "text/html");
                    response.setResponseStatus("200 Ok");
                } else if (request.getURI().equals("/InformacaoMotorFluxo")) {
                    response.setContentFromString(HttpServerAjax.getInfoMotorFluxo(), "text/html");
                    response.setResponseStatus("200 Ok");
                } else {
                    String fullname = baseFolder + "/";
                    if (request.getURI().equals("/")) {
                        fullname = fullname + "index.html";
                    } else {
                        fullname = fullname + request.getURI();
                    }
                    if (response.setContentFromFile(fullname)) {
                        response.setResponseStatus("200 Ok");
                    } else {
                        response.setContentFromString(
                                "<html><body><h1>404 File not found</h1></body></html>",
                                "text/html");
                        response.setResponseStatus("404 Not Found");
                    }
                }
                response.send(outS);
            } else { // NOT GET
                if ((request.getMethod().equals("PUT") && request.getURI().startsWith("/votes/"))) {
                    HttpServerAjax.castVote(request.getURI().substring(7));
                    response.setResponseStatus("200 Ok");
                } else {
                    response.setContentFromString(
                            "<html><body><h1>ERROR: 405 Method Not Allowed</h1></body></html>",
                            "text/html");
                    response.setResponseStatus("405 Method Not Allowed");
                }
                response.send(outS);
            }
        } catch (IOException ex) {
            System.out.println("Thread error when reading request");
        }
        try {
            sock.close();
        } catch (IOException ex) {
            System.out.println("CLOSE IOException");
        }
    }
}

