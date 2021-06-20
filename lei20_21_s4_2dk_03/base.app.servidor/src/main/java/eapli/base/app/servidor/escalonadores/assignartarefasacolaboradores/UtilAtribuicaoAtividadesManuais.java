package eapli.base.app.servidor.escalonadores.assignartarefasacolaboradores;

import eapli.base.atividade.domain.AtividadeManual;
import eapli.base.atividade.repositories.AtividadeRepository;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.equipa.domain.Equipa;
import eapli.base.infrastructure.persistence.PersistenceContext;

/**
 * The type Util atribuicao atividades manuais.
 */
public class UtilAtribuicaoAtividadesManuais {
    public UtilAtribuicaoAtividadesManuais() {
    }

    private final AtividadeRepository arep = PersistenceContext.repositories().atividade();

    /**
     * Colaboradores permitidos para atividade.
     *
     * @param atividadeManual the atividade manual
     */
    void colaboradoresPermitidosParaAtividade(AtividadeManual atividadeManual) {
        //TODO
    }

    public Colaborador colaboradorComUltimaTarefaAtribuidaAMaisDias(String idEquipa, Long idAtividade) {
        Colaborador colab;
        colab = arep.findColabAMenosTempoComTarefaAtribuida(idEquipa, idAtividade);
        if (colab != null) {
            return colab;
        }

        System.err.println("Nenhum colaborador que satisfaça o pedido");

        return null;
    }

    public void assignarAtivColab(Colaborador colab, AtividadeManual ativManual) {
        ativManual.associarColaborador(colab);
    }

    public Equipa getEquipaResponsavelAtividade(AtividadeManual atividadeManual) {
        return arep.findEquipaResponsavelAtividade(atividadeManual);
    }
}

/*
    o metodo do escalonador faz totalDiasSemTarefasAtribuidas(String idEquipa, Long idAtividade) --> para ir buscar o colab
    e depois assignarAtivColab(Colaborador colab, AtividadeManual ativManual); -->atividade que queremos escalonar

    //antes de fazer esta query faz o totalDiasSemTarefasAtribuidas(String idEquipa, Long idAtividade)
        assignarAtivColab(colab, ativManual);
    //aqui fica a real query de atribuir o colab à atividade em questao, que vem do escalonador--
    //nao se esta parte precisa de ser query
*/
