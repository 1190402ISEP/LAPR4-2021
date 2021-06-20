package eapli.base.persistence.impl.inmemory;


import eapli.base.slot.domain.Slot;
import eapli.base.slot.repository.SlotRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemorySlotRepository extends InMemoryDomainRepository<Slot, Long> implements SlotRepository {
    static {
        InMemoryInitializer.init();
    }
}
