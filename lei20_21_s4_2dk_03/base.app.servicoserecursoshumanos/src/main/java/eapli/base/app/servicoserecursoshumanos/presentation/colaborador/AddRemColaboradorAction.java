package eapli.base.app.servicoserecursoshumanos.presentation.colaborador;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * The type Add rem colaborador action.
 */
public class AddRemColaboradorAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new AddRemColaboradorUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
