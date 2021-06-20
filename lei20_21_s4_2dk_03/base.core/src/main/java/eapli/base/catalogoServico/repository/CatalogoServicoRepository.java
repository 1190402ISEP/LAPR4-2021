package eapli.base.catalogoServico.repository;

import eapli.base.catalogoServico.domain.CatalogoServico;
import eapli.base.catalogoServico.domain.IdentificadorCatalogo;
import eapli.framework.domain.repositories.DomainRepository;

public interface CatalogoServicoRepository
        extends DomainRepository<IdentificadorCatalogo, CatalogoServico> {

}
