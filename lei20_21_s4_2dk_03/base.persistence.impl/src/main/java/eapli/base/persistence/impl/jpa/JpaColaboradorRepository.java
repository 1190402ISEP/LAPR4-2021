package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.domain.EmailColaborador;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.TypedQuery;

public class JpaColaboradorRepository extends JpaAutoTxRepository<Colaborador, MecanographicNumber, MecanographicNumber> implements ColaboradorRepository {
    public JpaColaboradorRepository(TransactionalContext autoTx) {
        super(autoTx, "mecanographicNumber");
    }

    public JpaColaboradorRepository(String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(), "mecanographicNumber");
    }

    @Override
    public Colaborador findByUsername(String username) {
        final TypedQuery<Colaborador> q = createQuery("Select e from Colaborador e where e.systemUser.username.value = :username", Colaborador.class);
        q.setParameter("username", username);
        return q.getResultStream().findFirst().get();
    }

    @Override
    public Colaborador findByEmail(String email) {
        final TypedQuery<Colaborador> q = createQuery("Select e From Colaborador e where e.emailColaborador =:email ", Colaborador.class);
        q.setParameter("email", new EmailColaborador(email));
        return q.getResultStream().findFirst().get();
    }



}
