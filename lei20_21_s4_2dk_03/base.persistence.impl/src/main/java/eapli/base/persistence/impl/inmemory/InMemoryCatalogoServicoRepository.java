package eapli.base.persistence.impl.inmemory;

import eapli.base.catalogoServico.domain.CatalogoServico;
import eapli.base.catalogoServico.domain.IdentificadorCatalogo;
import eapli.base.catalogoServico.repository.CatalogoServicoRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryCatalogoServicoRepository extends InMemoryDomainRepository<CatalogoServico, IdentificadorCatalogo>
        implements CatalogoServicoRepository {

    static {
        InMemoryInitializer.init();
    }

}
