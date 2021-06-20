package eapli.base.app.servicoserecursoshumanos.presentation.listarCumprimento;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * The type Listar cumprimento action.
 */
public class ListarCumprimentoAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new ListarCumprimentoUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
