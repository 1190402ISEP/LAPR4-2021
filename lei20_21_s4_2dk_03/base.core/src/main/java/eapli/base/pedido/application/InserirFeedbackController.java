package eapli.base.pedido.application;

import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.pedido.domain.IdentificadorAutomaticoPedido;
import eapli.base.pedido.domain.Pedido;
import eapli.base.pedido.repositories.PedidoRepository;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.List;

/**
 * The type Inserir feedback controller.
 */
public class InserirFeedbackController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ColaboradorRepository cRepo = PersistenceContext.repositories().colaboradores();
    private final PedidoRepository pRepo = PersistenceContext.repositories().pedido();
    private Pedido pedido;

    /**
     * Mostrar pedidos concluidos.
     */
    public void mostrarPedidosConcluidos() {
        Colaborador colaborador = cRepo.findByUsername(authz.session().get().authenticatedUser().identity().toString());
        List<Pedido> listaPedidos = pRepo.findHistoByColabWithoutFeed(colaborador.identity().toString());
        if (!listaPedidos.isEmpty()) {
            for (Pedido pedido : listaPedidos) {
                System.out.println(pedido);
            }
        } else {
            throw new IllegalArgumentException("Não existem pedidos concluídos associados ao user.");
        }
    }

    /**
     * Associar pedido.
     *
     * @param identificadorPedido the identificador pedido
     */
    public void associarPedido(String identificadorPedido) {
        if (pRepo.containsOfIdentity(new IdentificadorAutomaticoPedido(identificadorPedido))) {
            this.pedido = pRepo.ofIdentity(new IdentificadorAutomaticoPedido(identificadorPedido)).get();
        } else {
            throw new IllegalArgumentException("Identificador introduzido não é válido.");
        }
    }

    /**
     * Save feedback.
     *
     * @param feedback the feedback
     */
    public void saveFeedback(String feedback) {
        this.pedido.associarFeedback(feedback);
        this.pRepo.save(this.pedido);
    }
}
