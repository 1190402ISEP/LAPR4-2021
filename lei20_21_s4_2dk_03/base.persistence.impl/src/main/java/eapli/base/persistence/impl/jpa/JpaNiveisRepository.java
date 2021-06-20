package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.nivelCriticidade.domain.Etiqueta;
import eapli.base.nivelCriticidade.domain.Nivel;
import eapli.base.nivelCriticidade.repository.NivelRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaNiveisRepository extends JpaAutoTxRepository<Nivel, Etiqueta, Etiqueta> implements NivelRepository {

    public JpaNiveisRepository(final TransactionalContext autoTx) {
        super(autoTx, "etiqueta");
    }

    public JpaNiveisRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(), "etiqueta");
    }

}
