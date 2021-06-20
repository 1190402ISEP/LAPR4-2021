/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package eapli.base.app.servicoserecursoshumanos.presentation.authz;

import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.Action;

/**
 * The type Deactivate user action.
 *
 * @author Fernando
 */
public class DeactivateUserAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new DeactivateUserUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf(StringColors.RED + "\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n" + StringColors.RESET, e.getMessage());
            return false;
        }
    }
}
