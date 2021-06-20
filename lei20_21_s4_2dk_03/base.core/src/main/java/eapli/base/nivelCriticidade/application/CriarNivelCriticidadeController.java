package eapli.base.nivelCriticidade.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.nivelCriticidade.domain.Etiqueta;
import eapli.base.nivelCriticidade.domain.Nivel;
import eapli.base.nivelCriticidade.repository.NivelRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

/**
 * The type Criar nivel criticidade controller.
 */
public class CriarNivelCriticidadeController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final NivelRepository repository = PersistenceContext.repositories().niveis();

    /**
     * Adicionar nivel.
     *
     * @param etiqueta         the etiqueta
     * @param cor              the cor
     * @param valorEscala      the valor escala
     * @param objetivoDistinto the objetivo distinto
     * @param designacaoNivel  the designacao nivel
     */
    public void adicionarNivel(String etiqueta, String cor, int valorEscala, String objetivoDistinto, String designacaoNivel) {

        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.GESTOR_SERVICOS_HELPDESK);

        if (!repository.containsOfIdentity(new Etiqueta(etiqueta))) {
            final Nivel novoNivel = new Nivel(etiqueta, cor, valorEscala, objetivoDistinto, designacaoNivel);
            this.repository.save(novoNivel);
        } else {
            throw new IllegalStateException("Nível já existe com etiqueta: " + etiqueta);
        }
    }
}
