package eapli.base.app.portal.presentation.consultar;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * The type Consultar action.
 */
public class ConsultarAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new ConsultarUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
