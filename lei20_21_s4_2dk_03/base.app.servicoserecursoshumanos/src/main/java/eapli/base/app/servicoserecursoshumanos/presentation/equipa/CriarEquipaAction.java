package eapli.base.app.servicoserecursoshumanos.presentation.equipa;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * The type Criar equipa action.
 */
public class CriarEquipaAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new CriarEquipaUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
