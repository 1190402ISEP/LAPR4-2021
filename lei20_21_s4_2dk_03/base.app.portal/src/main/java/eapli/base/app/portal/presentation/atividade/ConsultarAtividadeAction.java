package eapli.base.app.portal.presentation.atividade;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * The type Consultar atividade action.
 */
public class ConsultarAtividadeAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new ConsultarAtividadeUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
