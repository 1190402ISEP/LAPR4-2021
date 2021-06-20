package eapli.base.app.motorfluxosatividades.escalonadores.assignartarefasacolaboradores;

import eapli.base.atividade.domain.AtividadeManual;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.equipa.domain.Equipa;

/**
 * The type Atribuidor de tarefas fcfs.
 */
public class AtribuidorDeTarefasFCFS implements EscalonadoresAssignarTarefas {
    private final UtilAtribuicaoAtividadesManuais util;
    private AtividadeManual atManual;

    /**
     * Instantiates a new Atribuidor de tarefas fcfs.
     */
    public AtribuidorDeTarefasFCFS() {
        util = new UtilAtribuicaoAtividadesManuais();
    }

    @Override
    public void escalonarAtividade(AtividadeManual atividadeManual) {
        this.atManual = atividadeManual;
        Equipa eq = util.getEquipaResponsavelAtividade(atividadeManual);
        if (eq == null) {
            atribuirAtividadesManuaisAutomaticamente("");
        } else {
            atribuirAtividadesManuaisAutomaticamente(eq.identity().toString());
        }
    }

    @Override
    public void atribuirAtividadesManuaisAutomaticamente(String idEquipa) {
        Colaborador colab = util.colaboradorComUltimaTarefaAtribuidaAMaisDias(idEquipa, atManual.identity());
        util.assignarAtivColab(colab, atManual);
    }
}
