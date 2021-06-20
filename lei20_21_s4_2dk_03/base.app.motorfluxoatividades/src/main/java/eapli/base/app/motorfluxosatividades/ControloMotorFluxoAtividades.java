package eapli.base.app.motorfluxosatividades;

import eapli.base.app.motorfluxosatividades.escalonadores.EscalonadorSettings;
import eapli.base.app.motorfluxosatividades.escalonadores.assignartarefasacolaboradores.EscalonadoresAssignarTarefas;
import eapli.base.app.motorfluxosatividades.escalonadores.atividadespelasinstancias.EscalonadorAtividadesAutomaticasExecutor;
import eapli.base.atividade.domain.Atividade;
import eapli.base.atividade.domain.AtividadeAutomatica;
import eapli.base.atividade.domain.AtividadeManual;
import eapli.base.atividade.domain.EstadoAtividade;
import eapli.base.fluxodeatividade.domain.FluxoDeAtividade;
import eapli.base.pedido.domain.EstadoPedido;
import eapli.base.pedido.domain.Pedido;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * The type Controlo motor fluxo atividades.
 */
public class ControloMotorFluxoAtividades {

    private final Pedido pedido;
    private final FluxoDeAtividade fluxo;
    static EscalonadorSettings settings = new EscalonadorSettings();
    private EscalonadorAtividadesAutomaticasExecutor escalonadorAtividadesAutomaticasExecutor;
    private EscalonadoresAssignarTarefas escalonadoresAssignarTarefas;

    /**
     * Instantiates a new Controlo motor fluxo atividades.
     *
     * @param pedido the pedido
     * @param fluxo  the fluxo
     */
    public ControloMotorFluxoAtividades(Pedido pedido, FluxoDeAtividade fluxo) {
        this.pedido = pedido;
        this.fluxo = fluxo;
        this.escalonadorAtividadesAutomaticasExecutor = settings.escalonadorTarefasInstancia();
        this.escalonadoresAssignarTarefas = settings.atribuidorDeTarefas();
    }

    /**
     * Verificar estado pedido boolean.
     *
     * @return the boolean
     */
    public boolean verificarEstadoPedido() {
        return this.pedido.estadoPedido.equals(EstadoPedido.CONCLUIDO);
    }

    /**
     * Exec tarefa boolean.
     *
     * @param atividade the atividade
     * @return the boolean
     */
    public boolean execTarefa(Atividade atividade) {

        //delega-se a atividade automática ao executor de tarefas automáticas
        if (atividade instanceof AtividadeAutomatica) {
            escalonadorAtividadesAutomaticasExecutor.adicionarTrabalho((AtividadeAutomatica) atividade);//escalonar
            return true;
        }

        //aqui a atividade manual é executada
        /*else*/
        if (atividade instanceof AtividadeManual) {
            escalonadoresAssignarTarefas.escalonarAtividade((AtividadeManual) atividade);//atribuir
        }

        return false;
    }

    private static class AvisarFimDeTarefa implements Runnable {
        private final long idAtividade;

        /**
         * Instantiates a new Avisar fim de tarefa.
         *
         * @param idAtividade the id atividade
         */
        public AvisarFimDeTarefa(long idAtividade) {
            this.idAtividade = idAtividade;
        }

        public void run() {
            System.out.printf("Acabou a tarefa! O seu id: %d", idAtividade);
        }
    }

    private void executarDelay(int delayDaAtividade, long idAtividade) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        service.schedule(new AvisarFimDeTarefa(idAtividade), delayDaAtividade, TimeUnit.HOURS);
    }

    /**
     * Verificar estado tarefa boolean.
     *
     * @param idTarefa the id tarefa
     * @return the boolean
     */
    public boolean verificarEstadoTarefa(int idTarefa) {
        return this.fluxo.getAtividades().get(idTarefa).getEstadoAtividade().equals(EstadoAtividade.INICIADA);
    }

}
