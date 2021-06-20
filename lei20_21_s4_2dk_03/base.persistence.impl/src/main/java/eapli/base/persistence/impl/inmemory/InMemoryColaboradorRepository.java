package eapli.base.persistence.impl.inmemory;

import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryColaboradorRepository extends InMemoryDomainRepository<Colaborador, MecanographicNumber>
        implements ColaboradorRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Colaborador findByUsername(String username) {
        return null;
    }

    @Override
    public Colaborador findByEmail(String email) {
        return null;
    }
}
