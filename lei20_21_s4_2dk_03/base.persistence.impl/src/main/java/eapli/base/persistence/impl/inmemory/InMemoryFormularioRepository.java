package eapli.base.persistence.impl.inmemory;

import eapli.base.formulario.domain.Formulario;
import eapli.base.formulario.repository.FormularioRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryFormularioRepository extends InMemoryDomainRepository<Formulario, Long>
        implements FormularioRepository {

    static {
        InMemoryInitializer.init();
    }
}
