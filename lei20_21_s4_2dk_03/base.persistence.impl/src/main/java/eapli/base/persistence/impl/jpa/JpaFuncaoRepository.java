package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.funcao.domain.Funcao;
import eapli.base.funcao.domain.IdentificadorFuncao;
import eapli.base.funcao.repositories.FuncaoRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaFuncaoRepository extends JpaAutoTxRepository<Funcao, IdentificadorFuncao, IdentificadorFuncao> implements FuncaoRepository {

    public JpaFuncaoRepository(final TransactionalContext autoTx) {
        super(autoTx, "identificadorFuncao");
    }

    public JpaFuncaoRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(), "identificadorFuncao");
    }

}
