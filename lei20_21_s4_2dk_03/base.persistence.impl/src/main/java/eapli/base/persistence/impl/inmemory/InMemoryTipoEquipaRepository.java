package eapli.base.persistence.impl.inmemory;

import eapli.base.tipoequipa.domain.CodigoInternoUnicoTipoEquipa;
import eapli.base.tipoequipa.domain.TipoEquipa;
import eapli.base.tipoequipa.repositories.TipoEquipaRepository;
import eapli.base.utils.Cor;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

public class InMemoryTipoEquipaRepository extends InMemoryDomainRepository<TipoEquipa, CodigoInternoUnicoTipoEquipa>
        implements TipoEquipaRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Optional<TipoEquipa> findByColor(String cor) {
        return matchOne(tp -> tp.cor().equals(new Cor(cor)));
    }

}
