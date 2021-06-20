package eapli.base.catalogoServico.application;

import eapli.base.catalogoServico.domain.CatalogoServico;
import eapli.base.catalogoServico.domain.CriterioAcessoCatalogo;
import eapli.base.catalogoServico.repository.CatalogoServicoRepository;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.equipa.domain.Equipa;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servico.domain.EstadoServico;
import eapli.base.servico.domain.KeyWordServico;
import eapli.base.servico.domain.Servico;
import eapli.base.servico.repository.ServicoRepository;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.Username;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Consultar controller.
 */
public class ConsultarController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final CatalogoServicoRepository catalogoServicoRepository = PersistenceContext.repositories().catalogosServico();
    private final ColaboradorRepository colaboradorRepository = PersistenceContext.repositories().colaboradores();
    private final ServicoRepository servicoRepository = PersistenceContext.repositories().servico();
    private String keyword = "";
    private final List<String> listKeys = new ArrayList<>();

    /**
     * Show services in catalogs.
     */
    public void showServicesInCatalogs() {
        List<Equipa> equipasColab = checkColab();
        boolean VF = true;

        Iterable<CatalogoServico> catalogos = catalogoServicoRepository.findAll();
        if (catalogos.iterator().hasNext()) {
            for (CatalogoServico cat : catalogos) {
                for (CriterioAcessoCatalogo crit : cat.getCriteriosAcessoCatalogo()) {
                    for (Equipa eq : equipasColab) {
                        if (crit.toString().equals(eq.identity().toString())) {
                            System.out.println();
                            System.out.println("CATALOGO:");
                            System.out.println(cat);
                            for (Servico ser : cat.getServicos()) {
                                if (VF) {
                                    System.out.println("SERVIÇOS:");
                                    VF = false;
                                }
                                System.out.println(ser);
                                if (ser.getEstado().equals(EstadoServico.INCOMPLETO)) {
                                    System.out.println(StringColors.BLUE + "**Brevemente Disponível**" + StringColors.RESET);
                                }
                            }
                            VF = true;
                        }
                    }
                }
            }
            System.out.println();
        } else {
            throw new IllegalStateException("Não existem catálogos.");
        }
    }

    /**
     * Show keys.
     */
    public void showKeys() {
        List<String> keys = new ArrayList<>();
        for (Servico ser : servicoRepository.findAll()) {
            for (KeyWordServico key : ser.getKeyWords()) {
                if (!keys.contains(key.toString())) {
                    keys.add(key.toString());
                }
            }
        }
        listKeys.addAll(keys);
        System.out.println(StringColors.PURPLE);
        System.out.println("==================Keys==================");
        for (int i = 0; i < keys.size(); i++) {
            System.out.printf("%d-> %s\n", i, keys.get(i));
        }
        System.out.print(StringColors.RESET);
    }

    /**
     * Confirm key.
     *
     * @param escolhaKey the escolha key
     */
    public void confirmKey(String escolhaKey) {
        if (listKeys.contains(escolhaKey)) {
            this.keyword = escolhaKey;
        } else {
            throw new IllegalArgumentException("Key não existente.");
        }
    }

    /**
     * Show servicos com key.
     */
    public void showServicosComKey() {
        List<Equipa> equipasColab = checkColab();

        boolean firstCheck = true;
        Iterable<CatalogoServico> catalogos = catalogoServicoRepository.findAll();
        if (catalogos.iterator().hasNext()) {
            for (CatalogoServico cat : catalogos) {
                for (CriterioAcessoCatalogo crit : cat.getCriteriosAcessoCatalogo()) {
                    for (Equipa eq : equipasColab) {
                        if (crit.toString().equals(eq.identity().toString())) {
                            for (Servico ser : cat.getServicos()) {
                                for (KeyWordServico keyAux : ser.getKeyWords()) {
                                    if (keyAux.toString().equals(this.keyword)) {
                                        if (firstCheck) {
                                            System.out.println();
                                            System.out.println("CATALOGO:");
                                            System.out.println(cat);
                                        }
                                        System.out.println("SERVIÇOS:");
                                        System.out.println(ser);
                                        if (ser.getEstado().equals(EstadoServico.INCOMPLETO)) {
                                            System.out.println("**Brevemente Disponível**");
                                        }
                                        firstCheck = false;
                                    }
                                }
                            }
                            firstCheck = true;
                        }
                    }
                }
            }
            System.out.println();
        } else {
            throw new IllegalStateException("Não existem catálogos.");
        }
    }

    /**
     * Check colab list.
     *
     * @return the list
     */
    public List<Equipa> checkColab() {
        Username username;
        List<Equipa> equipasColab;
        if ((authz.session()).isPresent()) {
            username = ((authz.session()).get()).authenticatedUser().username();
            for (Colaborador colab : colaboradorRepository.findAll()) {
                if (colab.user().identity().equals(username)) {
                    equipasColab = colab.getEquipas();
                    if (!equipasColab.isEmpty()) {
                        return equipasColab;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Não foram encontradas equipas associadas ao colaborador.");
    }
}
