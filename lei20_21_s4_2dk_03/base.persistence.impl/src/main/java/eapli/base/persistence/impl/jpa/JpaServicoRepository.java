package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.servico.domain.CodigoUnicoServico;
import eapli.base.servico.domain.Servico;
import eapli.base.servico.repository.ServicoRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaServicoRepository extends JpaAutoTxRepository<Servico, CodigoUnicoServico, CodigoUnicoServico> implements ServicoRepository {

    public JpaServicoRepository(final TransactionalContext autoTx) {
        super(autoTx, "codigoUnicoServico");
    }

    public JpaServicoRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(), "codigoUnicoServico");
    }

}
