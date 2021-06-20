package eapli.base.persistence.impl.inmemory;

import eapli.base.equipa.domain.CodigoUnicoEquipa;
import eapli.base.equipa.domain.Equipa;
import eapli.base.equipa.repositories.EquipaRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryEquipaRepository extends InMemoryDomainRepository<Equipa, CodigoUnicoEquipa>
        implements EquipaRepository {

    static {
        InMemoryInitializer.init();
    }
}
