package eapli.base.pedido.application;

import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.pedido.domain.Pedido;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

public class ConsultarPedidosController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ColaboradorRepository colabRepo = PersistenceContext.repositories().colaboradores();

    public void getHistorico() {
        //verificacao para ir buscar so o colaborador que deu login
        String email = authz.session().get().authenticatedUser().email().toString();
        Colaborador colab = colabRepo.findByEmail(email);
        for (Pedido pedido : colab.getPedidosHistorico()) {
            System.out.println("PEDIDOS:");
            System.out.println(pedido);
        }
        System.out.println();
    }

    public void getPedidosEmAberto() {
        //verificacao para ir buscar so o colaborador que deu login
        String email = authz.session().get().authenticatedUser().email().toString();
        Colaborador colab = colabRepo.findByEmail(email);
        for (Pedido pedido : colab.getPedidos()) {
            System.out.println("PEDIDOS:");
            System.out.println(pedido);
        }
        System.out.println();
    }

}
