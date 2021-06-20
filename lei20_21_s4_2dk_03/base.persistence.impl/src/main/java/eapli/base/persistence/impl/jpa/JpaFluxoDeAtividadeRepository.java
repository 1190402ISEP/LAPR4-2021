package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.fluxodeatividade.domain.FluxoDeAtividade;
import eapli.base.fluxodeatividade.repository.FluxoDeAtividadeRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaFluxoDeAtividadeRepository extends JpaAutoTxRepository<FluxoDeAtividade, Long, Long>
        implements FluxoDeAtividadeRepository {


    public JpaFluxoDeAtividadeRepository(TransactionalContext autoTx) {
        super(autoTx, "id");
    }

    public JpaFluxoDeAtividadeRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(), "id");
    }

}
