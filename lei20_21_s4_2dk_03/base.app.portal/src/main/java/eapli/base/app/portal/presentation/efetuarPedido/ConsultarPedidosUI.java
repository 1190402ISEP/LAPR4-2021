package eapli.base.app.portal.presentation.efetuarPedido;

import eapli.base.pedido.application.ConsultarPedidosController;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

/**
 * The type Consultar pedidos ui.
 */
public class ConsultarPedidosUI extends AbstractUI {
    private final ConsultarPedidosController theController = new ConsultarPedidosController();

    @Override
    protected boolean doShow() {
        final int decisaoKeys = Console.readInteger("\nDeseja procurar por:\n\n1-Pedido\n2-Histórico");
        if (decisaoKeys == 2) {
            theController.getHistorico();
        }
        if (decisaoKeys == 1) {
            theController.getPedidosEmAberto();
        }

        System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                "Consulta feita com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
        return false;
    }

    @Override
    public String headline() {
        return "ConsultarPedidosUI";
    }
}
