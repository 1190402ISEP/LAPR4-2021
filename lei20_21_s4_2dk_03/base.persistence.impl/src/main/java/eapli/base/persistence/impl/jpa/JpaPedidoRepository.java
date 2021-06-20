package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.pedido.domain.EstadoPedido;
import eapli.base.pedido.domain.IdentificadorAutomaticoPedido;
import eapli.base.pedido.domain.Pedido;
import eapli.base.pedido.repositories.PedidoRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.TypedQuery;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class JpaPedidoRepository extends JpaAutoTxRepository<Pedido, IdentificadorAutomaticoPedido, IdentificadorAutomaticoPedido> implements PedidoRepository {

    public JpaPedidoRepository(final TransactionalContext autoTx) {
        super(autoTx, "identificadorAutomaticoPedido");
    }

    public JpaPedidoRepository(final String puname) {
        super(puname, Application.settings().getExtendedPersistenceProperties(), "identificadorAutomaticoPedido");
    }

    @Override
    public Iterable<Pedido> totalByYear(Calendar first, Calendar last) {
        final TypedQuery<Pedido> e = createQuery("Select e from Pedido e where e.dataSolicitacaoPedido.dataSolicitacao >= :first and e.dataSolicitacaoPedido.dataSolicitacao <= :last", Pedido.class);
        e.setParameter("first", first);
        e.setParameter("last", last);
        return e.getResultStream().collect(Collectors.toSet());
    }

    @Override
    public List<Pedido> findPedByColab(String mecNumber) {
        final TypedQuery<Pedido> q = createQuery("SELECT a from Pedido a where a.colaborador.mecanographicNumber = :numMec and a.estadoPedido != :estadoConcluido", Pedido.class);
        q.setParameter("numMec", new MecanographicNumber(mecNumber));
        q.setParameter("estadoConcluido", EstadoPedido.CONCLUIDO);
        return q.getResultList();
    }

    @Override
    public List<Pedido> findHistoByColab(String mecNumber) {
        final TypedQuery<Pedido> q = createQuery("SELECT a from Pedido a where a.colaborador.mecanographicNumber = :numMec and a.estadoPedido = :estadoConcluido", Pedido.class);
        q.setParameter("numMec", new MecanographicNumber(mecNumber));
        q.setParameter("estadoConcluido", EstadoPedido.CONCLUIDO);
        return q.getResultList();
    }

    @Override
    public List<Pedido> getPedidosBetweenDatesCump(Calendar first, Calendar last) {
        final TypedQuery<Pedido> q = createQuery("SELECT a from Pedido a where a.dataSolicitacaoPedido.dataSolicitacaoPedido >= :first and a.dataSolicitacaoPedido.dataSolicitacaoPedido <= :last and a.estadoPedido = :estadoConcluido and a.dataLimiteResolucaoPedido.dataLimiteResolucao >= a.dataResolucaoPedido.dataResolucao", Pedido.class);
        q.setParameter("first", first);
        q.setParameter("last", last);
        q.setParameter("estadoConcluido", EstadoPedido.CONCLUIDO);
        return q.getResultList();
    }

    @Override
    public List<Pedido> getPedidosBetweenDatesIncump(Calendar first, Calendar last) {
        final TypedQuery<Pedido> q = createQuery("SELECT a from Pedido a where a.dataSolicitacaoPedido.dataSolicitacaoPedido >= :first and a.dataSolicitacaoPedido.dataSolicitacaoPedido <= :last and a.estadoPedido = :estadoConcluido and a.dataLimiteResolucaoPedido.dataLimiteResolucao < a.dataResolucaoPedido.dataResolucao", Pedido.class);
        q.setParameter("first", first);
        q.setParameter("last", last);
        q.setParameter("estadoConcluido", EstadoPedido.CONCLUIDO);
        return q.getResultList();
    }

    @Override
    public List<Pedido> findHistoByColabWithoutFeed(String mecNumber) {
        final TypedQuery<Pedido> q = createQuery("SELECT a from Pedido a where a.colaborador.mecanographicNumber = :numMec and a.estadoPedido = :estadoConcluido and a.feedBack = null", Pedido.class);
        q.setParameter("numMec", new MecanographicNumber(mecNumber));
        q.setParameter("estadoConcluido", EstadoPedido.CONCLUIDO);
        return q.getResultList();
    }

    @Override
    public Double calcularMediaTemposAprovacao() {
        final TypedQuery<Double> q = createQuery("SELECT AVG(day(a.dataSolicitacaoPedido.dataSolicitacao) - day(a.dataAprovacaoPedido.dataAprovacao)) from Pedido a where a.dataSolicitacaoPedido != null and a.dataAprovacaoPedido != null", Double.class);
        if (q.getSingleResult() == null) {
            return 0.0;
        }
        return q.getSingleResult();
    }

    @Override
    public Double calcularMediaTemposResolucaoResolvidos() {
        final TypedQuery<Double> q = createQuery("SELECT AVG(day(a.dataAprovacaoPedido.dataAprovacao) - day(a.dataResolucaoPedido.dataResolucao)) from Pedido a where a.estadoPedido = :estado and a.dataAprovacaoPedido != null and a.dataResolucaoPedido != null", Double.class);
        q.setParameter("estado", EstadoPedido.CONCLUIDO);
        if (q.getSingleResult() == null) {
            return 0.0;
        }
        return q.getSingleResult();
    }

    @Override
    public Double calcularMediaTemposResolucaoNaoResolvidos() {
        final TypedQuery<Double> q = createQuery("SELECT AVG(day(a.dataAprovacaoPedido.dataAprovacao) - day(CURRENT_DATE)) from Pedido a where a.estadoPedido = :estado and a.dataAprovacaoPedido != null", Double.class);
        q.setParameter("estado", EstadoPedido.EM_RESOLUCAO);
        if (q.getSingleResult() == null) {
            return 0.0;
        }
        return q.getSingleResult();
    }
}
