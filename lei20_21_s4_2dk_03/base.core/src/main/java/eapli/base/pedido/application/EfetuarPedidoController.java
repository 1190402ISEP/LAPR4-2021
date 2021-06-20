package eapli.base.pedido.application;

import eapli.base.catalogoServico.domain.CatalogoServico;
import eapli.base.catalogoServico.domain.CriterioAcessoCatalogo;
import eapli.base.catalogoServico.domain.IdentificadorCatalogo;
import eapli.base.catalogoServico.repository.CatalogoServicoRepository;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.equipa.domain.Equipa;
import eapli.base.equipa.repositories.EquipaRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.pedido.domain.Pedido;
import eapli.base.pedido.domain.PedidoBuilder;
import eapli.base.pedido.domain.UrgenciaPedido;
import eapli.base.pedido.repositories.PedidoRepository;
import eapli.base.servico.domain.CodigoUnicoServico;
import eapli.base.servico.domain.Servico;
import eapli.base.servico.repository.ServicoRepository;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * The type Efetuar pedido controller.
 */
public class EfetuarPedidoController {

    private final PedidoBuilder pBuild = new PedidoBuilder();
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final EquipaRepository eRepo = PersistenceContext.repositories().equipa();
    private final CatalogoServicoRepository csRepo = PersistenceContext.repositories().catalogosServico();
    private final ServicoRepository sRepo = PersistenceContext.repositories().servico();
    private final PedidoRepository pRepo = PersistenceContext.repositories().pedido();
    private final ColaboradorRepository cRepo = PersistenceContext.repositories().colaboradores();

    private Colaborador col;

    /**
     * Mostrar catalogos disponiveis para colaborador.
     */
    public void mostrarCatalogosDisponiveisParaColaborador() {
        MecanographicNumber numeroMecanografico = cRepo.findByUsername(authz.session().get().authenticatedUser().identity().toString()).identity();

        if (cRepo.containsOfIdentity(numeroMecanografico)) {
            col = cRepo.ofIdentity(numeroMecanografico).get();
            pBuild.withColaborador(col);
        }

        List<Equipa> listaEquipasUser = new ArrayList<>();
        Iterable<Equipa> listaEquipas = eRepo.findAll();
        if (listaEquipas.iterator().hasNext()) {
            for (Equipa e : listaEquipas) {
                for (Colaborador col : e.getColaboradores()) {
                    if (col.identity().toString().equals(numeroMecanografico.toString())) {
                        listaEquipasUser.add(e);
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Não se encontra em nenhuma equipa.");
        }

        if (listaEquipasUser.isEmpty()) {
            throw new IllegalArgumentException("Não se encontra em nenhuma equipa.");
        }

        Iterable<CatalogoServico> listaCatalogos = csRepo.findAll();
        for (CatalogoServico cs : listaCatalogos) {
            for (Equipa e : listaEquipasUser) {
                for (CriterioAcessoCatalogo cas : cs.getCriteriosAcessoCatalogo()) {
                    if (cas.toString().equals(e.identity().toString())) {
                        System.out.println(cs);
                    }
                }
            }
        }
    }

    /**
     * Mostrar servicos catalogo.
     *
     * @param identificadorCatalogo the identificador catalogo
     */
    public void mostrarServicosCatalogo(String identificadorCatalogo) {
        CatalogoServico cs;
        if (csRepo.containsOfIdentity(new IdentificadorCatalogo(identificadorCatalogo))) {
            cs = csRepo.ofIdentity(new IdentificadorCatalogo(identificadorCatalogo)).get();
        } else {
            throw new IllegalStateException("Identificador único inválido.");
        }

        if (!cs.getServicos().isEmpty()) {
            for (Servico s : cs.getServicos()) {
                System.out.println(s);
            }
        } else {
            throw new IllegalStateException("O catálogo não tem serviços.");
        }
    }

    /**
     * Iniciar pedido.
     *
     * @param codigoUnicoServico the codigo unico servico
     */
    public void iniciarPedido(String codigoUnicoServico) {
        Servico servico;
        if (sRepo.containsOfIdentity(new CodigoUnicoServico(codigoUnicoServico))) {
            servico = sRepo.ofIdentity(new CodigoUnicoServico(codigoUnicoServico)).get();
        } else {
            throw new IllegalStateException("Código único inválido.");
        }

        pBuild.withServico(servico);
    }

    /**
     * Mostrar urgencias.
     */
    public void mostrarUrgencias() {
        System.out.printf("\nOpção 1: %s", UrgenciaPedido.URGENTE);
        System.out.printf("\nOpção 2: %s", UrgenciaPedido.MODERADA);
        System.out.printf("\nOpção 3: %s\n", UrgenciaPedido.REDUZIDA);
    }

    /**
     * Associar informacoes.
     *
     * @param urgenciaPedido            the urgencia pedido
     * @param dataLimiteResolucaoPedido the data limite resolucao pedido
     */
    public void associarInformacoes(String urgenciaPedido, String dataLimiteResolucaoPedido) {
        UrgenciaPedido up = UrgenciaPedido.valueOf(urgenciaPedido.toUpperCase(Locale.ROOT));
        pBuild.withUrgencia(up);
        pBuild.withDataLimiteResolucao(dataLimiteResolucaoPedido);
    }

    /**
     * Adicionar ficheiro.
     *
     * @param nomeFicheiro the nome ficheiro
     */
    public void adicionarFicheiro(String nomeFicheiro) {
        pBuild.withFicheiro(nomeFicheiro);
    }

    /**
     * Efetuar pedido.
     */
    public long efetuarPedido() throws FileNotFoundException {
        Pedido pedido = pBuild.build();
        pRepo.save(pedido);
        col.addPedido(pRepo.ofIdentity(pedido.identity()).get());
        cRepo.save(col);
        String[] tratar = pedido.identity().toString().split("/");
        return Long.parseLong(tratar[0]) * 100000 + Long.parseLong(tratar[1]);
    }

}
