package eapli.base.app.portal.presentation.efetuarPedido;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * The type Consultar pedidos action.
 */
public class ConsultarPedidosAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new ConsultarPedidosUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
