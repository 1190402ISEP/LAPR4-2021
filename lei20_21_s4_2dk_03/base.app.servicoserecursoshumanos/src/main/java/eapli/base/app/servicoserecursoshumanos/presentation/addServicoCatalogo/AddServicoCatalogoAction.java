package eapli.base.app.servicoserecursoshumanos.presentation.addServicoCatalogo;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * The type Add servico catalogo action.
 */
public class AddServicoCatalogoAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new AddServicoCatalogoUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
