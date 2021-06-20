package eapli.base.app.motorfluxosatividades.escalonadores.assignartarefasacolaboradores;

import eapli.base.atividade.domain.AtividadeManual;

/**
 * The interface Escalonadores assignar tarefas.
 */
public interface EscalonadoresAssignarTarefas {
    /**
     * Atribuir atividades manuais automaticamente.
     *
     * @param idEquipa the id equipa
     */
    void atribuirAtividadesManuaisAutomaticamente(String idEquipa);

    void escalonarAtividade(AtividadeManual atividadeManual);
}
