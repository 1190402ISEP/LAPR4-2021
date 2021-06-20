package eapli.base.app.servicoserecursoshumanos.motorFluxoDashboard.application;

import eapli.base.app.servicoserecursoshumanos.motorFluxoDashboard.HttpServerAjax;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 * The type Motor fluxo dashboard controller.
 */
public class MotorFluxoDashboardController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final HttpServerAjax server = new HttpServerAjax();

    /**
     * Show colaborador.
     */
    public void showColaborador() {
        String email = authz.session().get().authenticatedUser().email().toString();
        ColaboradorRepository cRepo = PersistenceContext.repositories().colaboradores();

        Colaborador colab = cRepo.findByEmail(email);
        server.setColab(colab);
        server.start();
    }
}
