package eapli.base.app.portal.presentation.webdashboard;

import eapli.framework.actions.Action;

public class WebDashboardAction implements Action {

    @Override
    public boolean execute() {
        try {
            return new WebDashboardUI().show();
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.printf("\n\n--------------------------ERROR--------------------------\n" +
                    "%s\n--------------------------ERROR--------------------------\n\n", e.getMessage());
            return false;
        }
    }
}
