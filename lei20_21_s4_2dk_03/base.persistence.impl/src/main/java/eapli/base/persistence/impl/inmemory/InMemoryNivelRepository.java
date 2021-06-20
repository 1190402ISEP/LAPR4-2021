package eapli.base.persistence.impl.inmemory;

import eapli.base.nivelCriticidade.domain.Etiqueta;
import eapli.base.nivelCriticidade.domain.Nivel;
import eapli.base.nivelCriticidade.repository.NivelRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryNivelRepository extends
        InMemoryDomainRepository<Nivel, Etiqueta> implements NivelRepository {

    static {
        InMemoryInitializer.init();
    }

}
