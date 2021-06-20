package eapli.base.clientusermanagement.repositories;

import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.framework.domain.repositories.DomainRepository;

public interface ColaboradorRepository
        extends DomainRepository<MecanographicNumber, Colaborador> {

    Colaborador findByUsername(String username);

    Colaborador findByEmail(String email);
}
