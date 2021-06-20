package eapli.base.app.servicoserecursoshumanos.motorFluxoDashboard;

import eapli.framework.actions.Action;

/**
 * The type Motor fluxo dashboard action.
 */
public class MotorFluxoDashboardAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new MotorFluxoDashboardUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf("\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n", e.getMessage());
            return false;
        }
    }
}
