package eapli.base.app.servicoserecursoshumanos.presentation.authz;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * The type Add user action.
 */
public class AddUserAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new AddUserUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
