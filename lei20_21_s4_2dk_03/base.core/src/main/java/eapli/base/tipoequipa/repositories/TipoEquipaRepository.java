package eapli.base.tipoequipa.repositories;

import eapli.base.tipoequipa.domain.CodigoInternoUnicoTipoEquipa;
import eapli.base.tipoequipa.domain.TipoEquipa;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

/**
 * The interface Tipo equipa repository.
 */
public interface TipoEquipaRepository
        extends DomainRepository<CodigoInternoUnicoTipoEquipa, TipoEquipa> {

    /**
     * Find by color optional.
     *
     * @param cor the cor
     * @return the optional
     */
    Optional<TipoEquipa> findByColor(String cor);

}
