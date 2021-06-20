package eapli.base.app.portal.presentation.efetuarPedido;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * The type Efetuar pedido action.
 */
public class EfetuarPedidoAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new EfetuarPedidoUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
