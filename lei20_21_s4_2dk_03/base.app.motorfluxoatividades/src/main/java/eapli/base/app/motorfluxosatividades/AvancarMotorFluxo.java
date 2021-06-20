package eapli.base.app.motorfluxosatividades;

import eapli.base.atividade.domain.Atividade;
import eapli.base.atividade.domain.EstadoAtividade;
import eapli.base.fluxodeatividade.domain.FluxoDeAtividade;
import eapli.base.pedido.domain.EstadoPedido;
import eapli.base.pedido.domain.Pedido;
import eapli.framework.validations.Preconditions;

/**
 * The type Avancar motor fluxo.
 */
public class AvancarMotorFluxo {

    private Pedido pedido;

    private FluxoDeAtividade fluxo;

    /**
     * Instantiates a new Avancar motor fluxo.
     *
     * @param pedido the pedido
     * @param fluxo  the fluxo
     */
    public AvancarMotorFluxo(Pedido pedido, FluxoDeAtividade fluxo) {
        Preconditions.noneNull(pedido, fluxo);
        this.pedido = pedido;
        this.fluxo = fluxo;
    }

    /**
     * Verifica os Estados das Atividades no fluxo.
     * A primeira que retornar um estado NAO_INICIADA, que deverá ser por ordem de entrada no fluxo,
     * será retornado o seu index
     *
     * @return index tarefa NAO_INICIADA. -1 se não houverem tarefas NAO_INICIADA
     */
    public int verificarEstadosAtividades() {

        int i = 0;
        for (Atividade ativ : fluxo.getAtividades()) {
            if (ativ.getEstadoAtividade().equals(EstadoAtividade.NAO_INICIADA)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /**
     * Atualizar estado pedido.
     *
     * @param estado the estado
     */
    public void atualizarEstadoPedido(EstadoPedido estado) {
        this.pedido.setEstadoPedido(estado);
    }

    /**
     * Mudar estado atividade.
     *
     * @param done  the done
     * @param index the index
     */
    public void mudarEstadoAtividade(boolean done, int index) {
        if (done) {
            this.fluxo.getAtividades().get(index).setEstadoAtividade(EstadoAtividade.TERMINADA);
        } else {
            this.fluxo.getAtividades().get(index).setEstadoAtividade(EstadoAtividade.INICIADA);
        }
    }
}

