package eapli.base.app.servicoserecursoshumanos.motorFluxoDashboard;

import eapli.base.app.servicoserecursoshumanos.motorFluxoDashboard.application.MotorFluxoDashboardController;
import eapli.base.app.servicoserecursoshumanos.utils.Constantes;
import eapli.framework.presentation.console.AbstractUI;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * The type Motor fluxo dashboard ui.
 */
public class MotorFluxoDashboardUI extends AbstractUI implements Constantes {
    /**
     * The The controller.
     */
    MotorFluxoDashboardController theController = new MotorFluxoDashboardController();

    @Override
    protected boolean doShow() {
        theController.showColaborador();
        URI uri;
        try {
            uri = new URI(MOTORDASHBOARD_URL);
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public String headline() {
        return "MotorFluxoDashboard";
    }
}
