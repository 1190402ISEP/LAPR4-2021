package eapli.base.persistence.impl.inmemory;

import eapli.base.servico.domain.CodigoUnicoServico;
import eapli.base.servico.domain.Servico;
import eapli.base.servico.repository.ServicoRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryServicoRepository extends InMemoryDomainRepository<Servico, CodigoUnicoServico>
        implements ServicoRepository {

    static {
        InMemoryInitializer.init();
    }

}
