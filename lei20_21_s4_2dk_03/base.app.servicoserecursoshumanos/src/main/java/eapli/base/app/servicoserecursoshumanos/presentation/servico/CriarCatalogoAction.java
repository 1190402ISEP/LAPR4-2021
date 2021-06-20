package eapli.base.app.servicoserecursoshumanos.presentation.servico;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * The type Criar catalogo action.
 */
public class CriarCatalogoAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new CriarCatalogoUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
