package eapli.base.app.servicoserecursoshumanos.motorFluxoDashboard;

import eapli.base.app.servicoserecursoshumanos.utils.Constantes;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.pedido.repositories.PedidoRepository;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

/**
 * +
 *
 * @author ANDRE MOREIRA (asc@isep.ipp.pt)
 */
public class HttpServerAjax extends Thread implements Constantes {
    static private final String BASE_FOLDER = "base.app.servicoserecursoshumanos/src/main/java/eapli/base/app/servicoserecursoshumanos/motorFluxoDashboard/www";
    static private ServerSocket sock;

    @Override
    public void run() {
        Socket cliSock = null;

        accessesCounter = 0;
        for (int i = 0; i < candidatesNumber; i++) {
            candidateName[i] = "Candidate " + i;
            candidateVotes[i] = 0;
        }

        try {
            sock = new ServerSocket(PORTO_MOTOR_FLUXO_DASHBOARD);
        } catch (IOException ex) {
            System.err.println("Server failed to open local port " + PORTO_MOTOR_FLUXO_DASHBOARD);
        }
        while (true) {
            try {
                cliSock = sock.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }
            HttpAjaxRequest req = new HttpAjaxRequest(cliSock, BASE_FOLDER);
            req.start();
            incAccessesCounter();
        }
    }

    // DATA ACCESSED BY THREADS - LOCKING REQUIRED

    private static final int candidatesNumber = 4;
    private static final String[] candidateName = new String[candidatesNumber];
    private static final int[] candidateVotes = new int[candidatesNumber];
    private static int accessesCounter;
    private static Colaborador colab;
    private static final PedidoRepository pedidoRepository = PersistenceContext.repositories().pedido();

    /**
     * Sets colab.
     *
     * @param colab the colab
     */
    public void setColab(Colaborador colab) {
        HttpServerAjax.colab = colab;
    }

    private static synchronized void incAccessesCounter() {
        accessesCounter++;
    }

    /**
     * Gets votes standing in html.
     *
     * @return the votes standing in html
     */
    public static synchronized String getVotesStandingInHTML() {
        String textHtml = "<ul class=\"whiteText\">";
        for (int i = 0; i < candidatesNumber; i++) {
            textHtml = textHtml + "<li><button type=button onclick=voteFor(" + (i + 1) +
                    ")>Vote for " + candidateName[i] + "</button> " +
                    " - " + candidateVotes[i] + " votes </li>";
        }
        textHtml = textHtml + "</ul><p class=\"whiteText\">HTTP server accesses counter: " + accessesCounter + "</p>";
        return textHtml;
    }

    /**
     * Gets informacao colab standing in html.
     *
     * @return the informacao colab standing in html
     */
    public static synchronized String getInformacaoColabStandingInHTML() {

        return " <div class=\"topnav whiteText\" id=\"Inf\">\n" +
                "    <span id=\"colabName\">Nome: " + colab.getNomeCompletoColaborador() + "</span>\n" +
                "<br>\n<br><br>" +
                "    <span id=\"colabId\">Numero Mecanografico: " + colab.getMecanographicNumber() + "</span>\n" +
                "<br>\n<br><br>" +
                "    <span id=\"colabEmail\">Email: " + colab.getEmailColaborador() + "</span>\n" +
                "</div> ";
    }

    /**
     * Gets info motor fluxo.
     *
     * @return the info motor fluxo
     */
    public static synchronized String getInfoMotorFluxo() {
        return "<div class=\"topnav whiteText\" id=\"InformacaoMotorFluxo\">\n" +
                "    <span id=\"x1\">Media de aprovacao de pedidos: " + pedidoRepository.calcularMediaTemposAprovacao() + "</span>\n" +
                "<br>\n<br><br>" +
                "    <span id=\"x2\">Media de nao resolucao de pedidos: " + pedidoRepository.calcularMediaTemposResolucaoNaoResolvidos() + "</span>\n" +
                "<br>\n<br><br>" +
                "    <span id=\"x3\">Media de resolucao de pedidos: " + pedidoRepository.calcularMediaTemposResolucaoResolvidos() + "</span>\n" +
                "</div> ";
    }

    /**
     * Cast vote.
     *
     * @param i the
     */
    public static synchronized void castVote(String i) {
        int cN;
        try {
            cN = Integer.parseInt(i);
        } catch (NumberFormatException ne) {
            return;
        }
        cN--;
        if (cN >= 0 && cN < candidatesNumber) candidateVotes[cN]++;
    }

}
