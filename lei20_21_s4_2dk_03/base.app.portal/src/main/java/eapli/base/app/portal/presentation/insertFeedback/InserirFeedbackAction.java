package eapli.base.app.portal.presentation.insertFeedback;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * The type Inserir feedback action.
 */
public class InserirFeedbackAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new InserirFeedbackUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
