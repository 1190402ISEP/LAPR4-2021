package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.formulario.domain.Formulario;
import eapli.base.formulario.repository.FormularioRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaFormularioRepository extends JpaAutoTxRepository<Formulario, Long, Long>
        implements FormularioRepository {

    public JpaFormularioRepository(final TransactionalContext autoTx) {
        super(autoTx, "identificadorFormulario");
    }

    public JpaFormularioRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(), "identificadorFormulario");
    }

}
