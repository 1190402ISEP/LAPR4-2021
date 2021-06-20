package eapli.base.app.servicoserecursoshumanos.presentation.nivelCatalago;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * The type Aplicar nivel action.
 */
public class AplicarNivelAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new AplicarNivelUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
