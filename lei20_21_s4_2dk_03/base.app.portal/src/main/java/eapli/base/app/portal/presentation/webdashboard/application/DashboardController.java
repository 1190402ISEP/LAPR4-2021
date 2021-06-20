package eapli.base.app.portal.presentation.webdashboard.application;

import eapli.base.app.portal.presentation.webdashboard.HttpServerAjax;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

public class DashboardController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final HttpServerAjax server = new HttpServerAjax();

    public void showColaborador() {
        String email = authz.session().get().authenticatedUser().email().toString();
        ColaboradorRepository cRepo = PersistenceContext.repositories().colaboradores();

        Colaborador colab = cRepo.findByEmail(email);
        server.setColab(colab);
        server.start();
    }

    //se usar o optional faz isto (Optional<Colaborador> colab = cRepo.findByUsername(username);) q resolve mas lixa o serverAjax
    //se deixar o colaborador o serverAjax e o controller ficam bem mas nao sei se esta a ir buscar correto
}
