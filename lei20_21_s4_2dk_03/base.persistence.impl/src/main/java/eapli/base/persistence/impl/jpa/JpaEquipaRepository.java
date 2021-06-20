package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.equipa.domain.CodigoUnicoEquipa;
import eapli.base.equipa.domain.Equipa;
import eapli.base.equipa.repositories.EquipaRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaEquipaRepository
        extends JpaAutoTxRepository<Equipa, CodigoUnicoEquipa, CodigoUnicoEquipa>
        implements EquipaRepository {

    public JpaEquipaRepository(final TransactionalContext autoTx) {
        super(autoTx, "codigoUnicoEquipa");
    }

    public JpaEquipaRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(), "codigoUnicoEquipa");
    }
}
