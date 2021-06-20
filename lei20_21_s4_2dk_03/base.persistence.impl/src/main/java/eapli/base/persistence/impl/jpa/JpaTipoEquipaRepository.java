package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.tipoequipa.domain.CodigoInternoUnicoTipoEquipa;
import eapli.base.tipoequipa.domain.TipoEquipa;
import eapli.base.tipoequipa.repositories.TipoEquipaRepository;
import eapli.base.utils.Cor;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class JpaTipoEquipaRepository extends JpaAutoTxRepository<TipoEquipa, CodigoInternoUnicoTipoEquipa, CodigoInternoUnicoTipoEquipa>
        implements TipoEquipaRepository {

    public JpaTipoEquipaRepository(final TransactionalContext autoTx) {
        super(autoTx, "codigoInternoUnicoTipoEquipa");
    }

    public JpaTipoEquipaRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(), "codigoInternoUnicoTipoEquipa");
    }

    @Override
    public Optional<TipoEquipa> findByColor(String cor) {
        final Map<String, Object> params = new HashMap<>();
        Cor corAux = new Cor(cor);
        params.put("cor", corAux);
        return matchOne("e.cor=:cor", params);
    }

}
