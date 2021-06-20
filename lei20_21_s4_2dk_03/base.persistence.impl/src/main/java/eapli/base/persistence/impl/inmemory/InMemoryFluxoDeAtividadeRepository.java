package eapli.base.persistence.impl.inmemory;

import eapli.base.fluxodeatividade.domain.FluxoDeAtividade;
import eapli.base.fluxodeatividade.repository.FluxoDeAtividadeRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryFluxoDeAtividadeRepository extends InMemoryDomainRepository<FluxoDeAtividade, Long>
        implements FluxoDeAtividadeRepository {

    static {
        InMemoryInitializer.init();
    }
}
