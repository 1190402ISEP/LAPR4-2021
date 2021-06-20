package eapli.base.persistence.impl.inmemory;

import eapli.base.funcao.domain.Funcao;
import eapli.base.funcao.domain.IdentificadorFuncao;
import eapli.base.funcao.repositories.FuncaoRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryFuncaoRepository extends InMemoryDomainRepository<Funcao, IdentificadorFuncao>
        implements FuncaoRepository {

}
