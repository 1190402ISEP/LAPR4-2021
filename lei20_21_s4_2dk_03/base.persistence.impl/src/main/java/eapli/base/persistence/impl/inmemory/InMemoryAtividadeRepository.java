package eapli.base.persistence.impl.inmemory;

import eapli.base.atividade.domain.Atividade;
import eapli.base.atividade.domain.AtividadeAutomatica;
import eapli.base.atividade.domain.AtividadeManual;
import eapli.base.atividade.repositories.AtividadeRepository;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.equipa.domain.Equipa;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.List;

/**
 * The type In memory atividade repository.
 */
public class InMemoryAtividadeRepository extends InMemoryDomainRepository<Atividade, Long>
        implements AtividadeRepository {
    static {
        InMemoryInitializer.init();
    }

    @Override
    public List<AtividadeManual> findByColab(String mecNumber) {
        return null;
    }

    @Override
    public List<AtividadeManual> getTarefasPendentesManuaisDaEquipa(String codUniEq) {
        return null;
    }

    @Override
    public List<AtividadeAutomatica> findByAutomaticas() {
        return null;
    }

    @Override
    public Equipa findEquipaResponsavelAtividade(AtividadeManual atividadeManual) {
        return null;
    }

    @Override
    public Colaborador findColabAMenosTempoComTarefaAtribuida(String idEquipa, Long idAtividade) {
        return null;
    }

    @Override
    public Colaborador colaboradoremMelhorSituacaoParaTerminarTarefa(String idEquipa, Long idAtividade) {
        return null;
    }


}
