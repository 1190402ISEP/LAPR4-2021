package eapli.base.app.servidor.presentation;

import eapli.base.pedido.domain.Pedido;

import java.util.List;

/**
 * The type Gerir motor fluxo.
 */
public class GerirMotorFluxo {
    /**
     * Instantiates a new Gerir motor fluxo.
     */
    public GerirMotorFluxo() {

    }

    /**
     * Dados pedidos dashboard string.
     *
     * @param list the list
     * @return the string
     */
    public String dadosPedidosDashboard(List<Pedido> list) {
        StringBuilder dadosInfo = new StringBuilder();

        if (list.isEmpty()) {
            return null;
        }

        for (Pedido pedido : list) {
            dadosInfo.append(pedido.toString());
        }

        return dadosInfo.toString();
    }
}
