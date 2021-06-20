package eapli.base.tipoequipa.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.tipoequipa.domain.CodigoInternoUnicoTipoEquipa;
import eapli.base.tipoequipa.domain.TipoEquipa;
import eapli.base.tipoequipa.repositories.TipoEquipaRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

public class CriarTipoEquipaController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final TipoEquipaRepository repository = PersistenceContext.repositories().tipoEquipas();

    public void adicionarTipoEquipa(String codigoInternoUnicoTipoEquipa, String descricaoTipoEquipa, String cor) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.RESPONSAVEL_RECURSOS_HUMANOS);

        if (!repository.containsOfIdentity(new CodigoInternoUnicoTipoEquipa(codigoInternoUnicoTipoEquipa))) {
            if (!repository.findByColor(cor).isPresent()) {
                final TipoEquipa novoTipoEquipa = new TipoEquipa(codigoInternoUnicoTipoEquipa, descricaoTipoEquipa, cor);
                this.repository.save(novoTipoEquipa);
            } else {
                throw new IllegalStateException("Tipo de Equipa já existe com cor: " + cor);
            }
        } else {
            throw new IllegalStateException("Tipo de Equipa já existe com código interno único: " + codigoInternoUnicoTipoEquipa);
        }
    }
}
