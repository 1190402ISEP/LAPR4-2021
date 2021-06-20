package eapli.base.atividade.repositories;

import eapli.base.atividade.domain.Atividade;
import eapli.base.atividade.domain.AtividadeAutomatica;
import eapli.base.atividade.domain.AtividadeManual;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.equipa.domain.Equipa;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.List;


/**
 * The interface Atividade repository.
 */
public interface AtividadeRepository extends DomainRepository<Long, Atividade> {
    /**
     * Find by colab list.
     *
     * @param mecNumber the mec number
     * @return the list
     */
    List<AtividadeManual> findByColab(String mecNumber);

    /**
     * Gets tarefas pendentes manuais da equipa.
     *
     * @param codUniEq the cod uni eq
     * @return the tarefas pendentes manuais da equipa
     */
    List<AtividadeManual> getTarefasPendentesManuaisDaEquipa(String codUniEq);

    /**
     * Find by automaticas list.
     *
     * @return the list
     */
    List<AtividadeAutomatica> findByAutomaticas();

    /**
     * Find equipa responsavel atividade equipa.
     *
     * @param atividadeManual the atividade manual
     * @return the equipa
     */
    Equipa findEquipaResponsavelAtividade(AtividadeManual atividadeManual);

    /**
     * Find colab a menos tempo com tarefa atribuida colaborador.
     *
     * @param idEquipa    the id equipa
     * @param idAtividade the id atividade
     * @return the colaborador
     */
    Colaborador findColabAMenosTempoComTarefaAtribuida(String idEquipa, Long idAtividade);

    /**
     * Colaboradorem melhor situacao para terminar tarefa colaborador.
     *
     * @param idEquipa    the id equipa
     * @param idAtividade the id atividade
     * @return the colaborador
     */
    Colaborador colaboradoremMelhorSituacaoParaTerminarTarefa(String idEquipa, Long idAtividade);
}
