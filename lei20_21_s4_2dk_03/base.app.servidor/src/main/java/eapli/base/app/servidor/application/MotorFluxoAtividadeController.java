package eapli.base.app.servidor.application;

import eapli.base.app.servidor.AvancarMotorFluxo;
import eapli.base.app.servidor.ControloMotorFluxoAtividades;
import eapli.base.app.servidor.presentation.GerirMotorFluxo;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.fluxodeatividade.domain.FluxoDeAtividade;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.pedido.domain.EstadoPedido;
import eapli.base.pedido.domain.IdentificadorAutomaticoPedido;
import eapli.base.pedido.domain.Pedido;
import eapli.base.pedido.repositories.PedidoRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.validations.Preconditions;

import java.util.List;

/**
 * The type Motor fluxo atividade controller.
 */
public class MotorFluxoAtividadeController {
    private final UserRepository userRepo = PersistenceContext.repositories().users();
    private final PedidoRepository pedRepo = PersistenceContext.repositories().pedido();
    private final ColaboradorRepository cRepo = PersistenceContext.repositories().colaboradores();

    /**
     * Instantiates a new Motor fluxo atividade controller.
     */
    public MotorFluxoAtividadeController() {

    }

    /**
     * Responsável por avançar o fluxo de atividades de um pedido.
     *
     * @param idPedido id do Pedido ao qual se pretende avançar o fluxo.
     */
    public void avancarMotorDeFluxo(long idPedido) {

        if (pedRepo.containsOfIdentity(new IdentificadorAutomaticoPedido(idPedido))) {

            Pedido pedido = pedRepo.ofIdentity(new IdentificadorAutomaticoPedido(idPedido)).get();
            FluxoDeAtividade fluxo = pedido.getFluxoDeAtividade();
            AvancarMotorFluxo motor = new AvancarMotorFluxo(pedido, fluxo);
            int idTarefa = motor.verificarEstadosAtividades();

            if (idTarefa != -1) {
                motor.atualizarEstadoPedido(EstadoPedido.EM_RESOLUCAO);
                ControloMotorFluxoAtividades controlo = new ControloMotorFluxoAtividades(pedido, fluxo);

                if (controlo.verificarEstadoPedido() && controlo.verificarEstadoTarefa(idTarefa)) {
                    boolean done = controlo.execTarefa(fluxo.getAtividades().get(idTarefa));
                    motor.mudarEstadoAtividade(done, idTarefa);
                }
            } else {
                motor.atualizarEstadoPedido(EstadoPedido.APROVADO);
                System.out.println("\nPedido aprovado.\n");
            }
        } else {
            throw new IllegalArgumentException("Pedido não encontrado.");
        }
    }

    /**
     * Gerir motor user dashboard string.
     *
     * @param user the user
     * @return the string
     */
    public String gerirMotorUserDashboard(String user) {
        Preconditions.noneNull(user);
        Colaborador colab = cRepo.findByUsername(user);
        List<Pedido> listPedido = pedRepo.findPedByColab(colab.identity().toString());
        GerirMotorFluxo gerirMotor = new GerirMotorFluxo();
        if (listPedido.isEmpty()) {
            return "O cliente não tem pedidos feitos.";
        }
        return gerirMotor.dadosPedidosDashboard(listPedido);
    }

    /**
     * Gets user by username string.
     *
     * @param username the username
     * @return the user by username string
     */
    public Username getUserByUsernameString(String username) {
        Iterable<SystemUser> list = userRepo.findAll();
        for (SystemUser user : list) {
            if (user.username().toString().equals(username)) {
                return user.username();
            }
        }
        return null;
    }
}
