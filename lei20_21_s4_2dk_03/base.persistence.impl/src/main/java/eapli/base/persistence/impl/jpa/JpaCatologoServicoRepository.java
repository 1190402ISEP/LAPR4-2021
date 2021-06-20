package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.catalogoServico.domain.CatalogoServico;
import eapli.base.catalogoServico.domain.IdentificadorCatalogo;
import eapli.base.catalogoServico.repository.CatalogoServicoRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaCatologoServicoRepository
        extends JpaAutoTxRepository<CatalogoServico, IdentificadorCatalogo, IdentificadorCatalogo>
        implements CatalogoServicoRepository {

    public JpaCatologoServicoRepository(final TransactionalContext autoTx) {
        super(autoTx, "identificadorCatalogo");
    }

    public JpaCatologoServicoRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(), "identificadorCatalogo");
    }

}
