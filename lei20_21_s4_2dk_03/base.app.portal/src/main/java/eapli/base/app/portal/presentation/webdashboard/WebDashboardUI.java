package eapli.base.app.portal.presentation.webdashboard;

import eapli.base.app.portal.presentation.webdashboard.application.DashboardController;
import eapli.framework.presentation.console.AbstractUI;
import utils.Constantes;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class WebDashboardUI extends AbstractUI implements Constantes {
    DashboardController theController = new DashboardController();

    @Override
    protected boolean doShow() {
        theController.showColaborador();
        URI uri;
        try {
            uri = new URI(WEBDASHBOARD_URL);
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public String headline() {
        return "Dashboard";
    }
}
