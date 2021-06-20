package eapli.base.servico.repository;


import eapli.base.servico.domain.CodigoUnicoServico;
import eapli.base.servico.domain.Servico;
import eapli.framework.domain.repositories.DomainRepository;

/**
 * The interface Servico repository.
 */
public interface ServicoRepository
        extends DomainRepository<CodigoUnicoServico, Servico> {

}
