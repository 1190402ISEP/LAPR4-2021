package eapli.base.app.servicoserecursoshumanos.presentation.clientuser;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * Created by AJS on 08/04/2016.
 */
public class AcceptRefuseSignupRequestAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new AcceptRefuseSignupRequestUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
