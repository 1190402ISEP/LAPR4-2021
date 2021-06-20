package eapli.base.app.servicoserecursoshumanos.presentation.tipoequipa;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * The type Criar tipo equipa action.
 */
public class CriarTipoEquipaAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new CriarTipoEquipaUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
