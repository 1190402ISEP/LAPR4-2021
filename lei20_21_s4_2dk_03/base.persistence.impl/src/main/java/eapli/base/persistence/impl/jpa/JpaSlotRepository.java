package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.slot.domain.Slot;
import eapli.base.slot.repository.SlotRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaSlotRepository extends JpaAutoTxRepository<Slot, Long, Long> implements SlotRepository {
    public JpaSlotRepository(final TransactionalContext autoTx) {
        super(autoTx, "id");
    }

    public JpaSlotRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(), "id");
    }
}
