package eapli.base.app.servicoserecursoshumanos.presentation.servico;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * The type Especificar servico action.
 */
public class EspecificarServicoAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new EspecificarServicoUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
