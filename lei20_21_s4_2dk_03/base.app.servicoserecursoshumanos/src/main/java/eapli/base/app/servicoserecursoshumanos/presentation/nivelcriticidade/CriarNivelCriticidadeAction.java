package eapli.base.app.servicoserecursoshumanos.presentation.nivelcriticidade;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * The type Criar nivel criticidade action.
 */
public class CriarNivelCriticidadeAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new CriarNivelCriticidadeUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
