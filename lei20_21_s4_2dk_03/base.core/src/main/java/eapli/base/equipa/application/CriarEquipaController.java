package eapli.base.equipa.application;

import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.equipa.domain.CodigoUnicoEquipa;
import eapli.base.equipa.domain.Equipa;
import eapli.base.equipa.repositories.EquipaRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.tipoequipa.domain.TipoEquipa;
import eapli.base.tipoequipa.repositories.TipoEquipaRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Criar equipa controller.
 */
public class CriarEquipaController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final EquipaRepository repository = PersistenceContext.repositories().equipa();
    private final TipoEquipaRepository teRepo = PersistenceContext.repositories().tipoEquipas();
    private final ColaboradorRepository colabRepo = PersistenceContext.repositories().colaboradores();

    /**
     * Adicionar equipa.
     *
     * @param codigoUnicoEquipa            the codigo unico equipa
     * @param designacaoEquipa             the designacao equipa
     * @param objetivoDistintoEquipa       the objetivo distinto equipa
     * @param acronimo                     the acronimo
     * @param codigoInternoUnicoTipoEquipa the codigo interno unico tipo equipa
     * @param colaboradores                the colaboradores
     */
    public void adicionarEquipa(String codigoUnicoEquipa, String designacaoEquipa, String objetivoDistintoEquipa,
                                String acronimo, String codigoInternoUnicoTipoEquipa, List<String> colaboradores) {

        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.RESPONSAVEL_RECURSOS_HUMANOS);

        List<Colaborador> listColabor = new ArrayList<>();

        if (!repository.containsOfIdentity(new CodigoUnicoEquipa(codigoUnicoEquipa))) {
            final Equipa novaEquipa = new Equipa(codigoUnicoEquipa, designacaoEquipa, objetivoDistintoEquipa, acronimo, codigoInternoUnicoTipoEquipa);
            if (!colaboradores.isEmpty()) {
                for (String colab : colaboradores) {
                    if (colabRepo.containsOfIdentity(new MecanographicNumber(colab))) {
                        novaEquipa.addColaboradores((colabRepo.ofIdentity(new MecanographicNumber(colab))).get());
                        listColabor.add((colabRepo.ofIdentity(new MecanographicNumber(colab))).get());
                    } else {
                        System.out.println("Nenhum colaborador com número mecanográfico: " + colab);
                    }
                }
            }

            this.repository.save(novaEquipa);
            if (!listColabor.isEmpty()) {
                for (Colaborador colab : listColabor) {
                    colab.associarEquipa(this.repository.ofIdentity(novaEquipa.identity()).get());
                    colabRepo.save(colab);
                }
            }
        } else {
            throw new IllegalStateException("Equipa já existe com código interno único: " + codigoUnicoEquipa);
        }
    }

    /**
     * Gets tipos equipa.
     */
    public void getTiposEquipa() {
        Iterable<TipoEquipa> iterable = teRepo.findAll();
        for (Object tipoEquipa : iterable) {
            System.out.printf("%s", tipoEquipa);
        }
    }

    /**
     * Gets colaboradores.
     *
     * @return the colaboradores
     */
    public int getColaboradores() {
        int nr = 0;
        Iterable<Colaborador> iterable = colabRepo.findAll();
        for (Object colab : iterable) {
            nr++;
            System.out.printf("%s", colab);
        }
        return nr;
    }
}
