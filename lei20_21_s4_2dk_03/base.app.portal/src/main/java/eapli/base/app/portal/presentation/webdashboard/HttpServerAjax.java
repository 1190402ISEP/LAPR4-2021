package eapli.base.app.portal.presentation.webdashboard;

import eapli.base.atividade.domain.AtividadeManual;
import eapli.base.atividade.repositories.AtividadeRepository;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.infrastructure.persistence.PersistenceContext;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

/**
 * +
 *
 * @author ANDRE MOREIRA (asc@isep.ipp.pt)
 */
public class HttpServerAjax extends Thread {
    static private final String BASE_FOLDER = "base.app.portal/src/main/java/eapli/base/app/portal/presentation/webdashboard/www";
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
            sock = new ServerSocket(55555);
        } catch (IOException ex) {
            System.err.println("Server failed to open local port " + 55555);
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
    private static AtividadeRepository atividadeRepository = PersistenceContext.repositories().atividade();

    public void setColab(Colaborador colab) {
        HttpServerAjax.colab = colab;
    }

    private static synchronized void incAccessesCounter() {
        accessesCounter++;
    }

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

    public static synchronized String getInformacaoColabStandingInHTML() {
        return " <div class=\"topnav whiteText\" id=\"InformacaoColab\">\n" +
                "    <span class=\"active\">Dashboard</span>\n" +
                "    <span id=\"colabName\">Nome: " + colab.getNomeCompletoColaborador() + "</span>\n" +
                "    <span id=\"colabId\">Numero Mecanografico: " + colab.getMecanographicNumber() + "</span>\n" +
                "    <span id=\"colabEmail\">Email: " + colab.getEmailColaborador() + "</span>\n" +
                "</div> ";
    }

    public static synchronized String getTarefasColaborador() {
        StringBuilder s = new StringBuilder();
        List<AtividadeManual> atividades = atividadeRepository.findByColab(colab.getMecanographicNumber().toString());
        for (AtividadeManual pos : atividades) {
            //s.append("<tbody>\n" +"<tr>\n"+"<td>").append(pos.identity()).append("</td>\n").append("<td>").append(pos.delayDaAtividade()).append("</td>\n").append("<td>").append(pos.getDescricao()).append("</td>\n").append("</tbody>\n" +"</tr>\n");
            s.append("<tr>\n");
            s.append(String.format("<td>%s</td>%n", pos.identity()));
            s.append(String.format("<td>%s</td>%n", pos.delayDaAtividade()));
            s.append(String.format("<td>%s</td>%n", pos.getDescricao()));
            s.append("</tr>\n");
        }
        return s.toString();
    }

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
