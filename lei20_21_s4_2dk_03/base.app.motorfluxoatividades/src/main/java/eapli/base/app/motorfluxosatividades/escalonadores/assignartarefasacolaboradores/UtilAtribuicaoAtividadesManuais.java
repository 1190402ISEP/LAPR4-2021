package eapli.base.app.motorfluxosatividades.escalonadores.assignartarefasacolaboradores;

import eapli.base.atividade.domain.AtividadeManual;
import eapli.base.atividade.repositories.AtividadeRepository;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.equipa.domain.Equipa;
import eapli.base.infrastructure.persistence.PersistenceContext;

/**
 * The type Util atribuicao atividades manuais.
 */
public class UtilAtribuicaoAtividadesManuais {
    /**
     * Instantiates a new Util atribuicao atividades manuais.
     */
    public UtilAtribuicaoAtividadesManuais() {
    }

    private final AtividadeRepository arep = PersistenceContext.repositories().atividade();


    /**
     * Colaborador com ultima tarefa atribuida a mais dias colaborador.
     *
     * @param idEquipa    the id equipa
     * @param idAtividade the id atividade
     * @return the colaborador
     */
    public Colaborador colaboradorComUltimaTarefaAtribuidaAMaisDias(String idEquipa, Long idAtividade) {
        Colaborador colab;
        colab = arep.findColabAMenosTempoComTarefaAtribuida(idEquipa, idAtividade);
        if (colab != null) {
            return colab;
        }
        //TODO testar querie
        System.err.println("Nenhum colaborador que satisfaça o pedido");

        return null;
    }

    /**
     * Assignar ativ colab.
     *
     * @param colab      the colab
     * @param ativManual the ativ manual
     */
/*
        o metodo do escalonador faz totalDiasSemTarefasAtribuidas(String idEquipa, Long idAtividade) --> para ir buscar o colab
        e depois assignarAtivColab(Colaborador colab, AtividadeManual ativManual); -->atividade que queremos escalonar

        //antes de fazer esta query faz o totalDiasSemTarefasAtribuidas(String idEquipa, Long idAtividade)
            assignarAtivColab(colab, ativManual);
        //aqui fica a real query de atribuir o colab à atividade em questao, que vem do escalonador--
        //nao se esta parte precisa de ser query
    */
    public void assignarAtivColab(Colaborador colab, AtividadeManual ativManual) {
        ativManual.associarColaborador(colab);
    }

    /**
     * Gets equipa responsavel atividade.
     *
     * @param atividadeManual the atividade manual
     * @return the equipa responsavel atividade
     */
    public Equipa getEquipaResponsavelAtividade(AtividadeManual atividadeManual) {
        return arep.findEquipaResponsavelAtividade(atividadeManual);
    }

    /**
     * Colaboradorem melhor situacao para terminar tarefa colaborador.
     *
     * @param idEquipa    the id equipa
     * @param idAtividade the id atividade
     * @return the colaborador
     */
    public Colaborador colaboradoremMelhorSituacaoParaTerminarTarefa(String idEquipa, Long idAtividade) {
        Colaborador colab;

        colab = arep.colaboradoremMelhorSituacaoParaTerminarTarefa(idEquipa, idAtividade);
        if (colab != null) {
            return colab;
        }
        System.err.println("Nenhum colaborador que satisfaça o pedido");
        return null;
    }
}


