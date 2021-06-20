package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.atividade.domain.Atividade;
import eapli.base.atividade.domain.AtividadeAutomatica;
import eapli.base.atividade.domain.AtividadeManual;
import eapli.base.atividade.domain.EstadoAtividade;
import eapli.base.atividade.repositories.AtividadeRepository;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.equipa.domain.CodigoUnicoEquipa;
import eapli.base.equipa.domain.Equipa;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * The type Jpa atividade repository.
 */
public class JpaAtividadeRepository extends JpaAutoTxRepository<Atividade, Long, Long> implements AtividadeRepository {
    /**
     * Instantiates a new Jpa atividade repository.
     *
     * @param autoTx the auto tx
     */
    public JpaAtividadeRepository(final TransactionalContext autoTx) {
        super(autoTx, "id");
    }

    /**
     * Instantiates a new Jpa atividade repository.
     *
     * @param puname the puname
     */
    public JpaAtividadeRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(), "id");
    }

    @Override
    public List<AtividadeManual> findByColab(String mecNumber) {
        final TypedQuery<AtividadeManual> q = createQuery("SELECT a from AtividadeManual a where a.colaboradorAssignado.mecanographicNumber = :numMec and a.estadoAtividade = :estado",
                AtividadeManual.class);
        q.setParameter("numMec", new MecanographicNumber(mecNumber));
        q.setParameter("estado", EstadoAtividade.NAO_INICIADA);
        return q.getResultList();
    }

    @Override
    public List<AtividadeManual> getTarefasPendentesManuaisDaEquipa(String codUniEq) {
        final TypedQuery<AtividadeManual> q = createQuery("SELECT a from AtividadeManual a where a.equipaResponsavel.codigoUnicoEquipa = :codUniEq and a.estadoAtividade = :estado",
                AtividadeManual.class);
        q.setParameter("codUniEq", new CodigoUnicoEquipa(codUniEq));
        q.setParameter("estado", EstadoAtividade.NAO_INICIADA);
        return q.getResultList();
    }

    @Override
    public List<AtividadeAutomatica> findByAutomaticas() {
        final TypedQuery<AtividadeAutomatica> q = createQuery("SELECT a from AtividadeAutomatica a",
                AtividadeAutomatica.class);
        return q.getResultList();
    }

    @Override
    public Equipa findEquipaResponsavelAtividade(AtividadeManual atividadeManual) {
        final TypedQuery<Equipa> q = createQuery("Select at.equipaResponsavel from AtividadeManual at where at.id:=idAt",
                Equipa.class);
        q.setParameter("idAt", atividadeManual.identity());

        return q.getResultStream().findFirst().get();
    }

    @Override
    public Colaborador findColabAMenosTempoComTarefaAtribuida(String idEquipa, Long idAtividade) { //
        if (!StringPredicates.isNullOrEmpty(idEquipa)) {

            final TypedQuery<Colaborador> q =
                    createQuery("Select col\n" +
                            "from Colaborador col in\n" +
                            "where col.mecanographicNumber = cc.mecanographicNumber\n" +
                            "    (Select x.mecanographicNumber max(a.dataAtribuicao) from AtividadeManual a where a.colaboradorAssignado.mecanographicNumber:=x.mecanographicNumber\n" +
                            "                            group by (Select e.colaboradores from Equipa e where e.codigoUnicoEquipa=: idEquipa)x)y\n" +
                            "order by y.dataAtribuicao ASC)) cc", Colaborador.class);
            q.setParameter("idEquipa", new CodigoUnicoEquipa(idEquipa));
            return q.getResultStream().findFirst().get();
        }

        final TypedQuery<Colaborador> q = createQuery("Select e.colaboradorResponsavel From AtividadeManual where e.id=:idAtividade", Colaborador.class);
        q.setParameter("id", idAtividade);
        return q.getResultStream().findFirst().get();
    }


    @Override
    public Colaborador colaboradoremMelhorSituacaoParaTerminarTarefa(String idEquipa, Long idAtividade) {

        if (!StringPredicates.isNullOrEmpty(idEquipa)) {
            final TypedQuery<Colaborador> q =
                    createQuery("Select col\n" +
                            "from Colaborador col\n" +
                            "where col.mecanographicNumber = cc.mecanographicNumber in\n" +
                            "    (Select x.mecanographicNumber , SUM(a.delay) as soma from AtividadeManual a where a.colaboradorAssignado.mecanographicNumber:=x.mecanographicNumber\n" +
                            "                            group by (Select e.colaboradores from Equipa e where e.codigoUnicoEquipa=: idEquipa)x order by soma)y ASC)) cc", Colaborador.class);
            q.setParameter("idEquipa", new CodigoUnicoEquipa(idEquipa));
            return q.getResultStream().findFirst().get();
        }

        final TypedQuery<Colaborador> q = createQuery("Select e.colaboradorResponsavel From AtividadeManual where e.id=:idAtividade", Colaborador.class);
        q.setParameter("id", idAtividade);
        return q.getResultStream().findFirst().get();
    }
}
