package eapli.base.persistence.impl.inmemory;

import eapli.base.pedido.domain.IdentificadorAutomaticoPedido;
import eapli.base.pedido.domain.Pedido;
import eapli.base.pedido.repositories.PedidoRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Calendar;
import java.util.List;

public class InMemoryPedidoRepository extends
        InMemoryDomainRepository<Pedido, IdentificadorAutomaticoPedido> implements PedidoRepository {

    static {
        InMemoryInitializer.init();
    }

    @Override
    public Iterable<Pedido> totalByYear(Calendar first, Calendar last) {
        return null;
    }

    @Override
    public List<Pedido> findPedByColab(String mecNumber) {
        return null;
    }

    @Override
    public List<Pedido> findHistoByColab(String mecNumber) {
        return null;
    }

    @Override
    public List<Pedido> getPedidosBetweenDatesCump(Calendar first, Calendar last) {
        return null;
    }

    @Override
    public List<Pedido> getPedidosBetweenDatesIncump(Calendar first, Calendar last) {
        return null;
    }

    @Override
    public List<Pedido> findHistoByColabWithoutFeed(String mecNumber) {
        return null;
    }

    @Override
    public Double calcularMediaTemposAprovacao() {
        return 0.0;
    }

    @Override
    public Double calcularMediaTemposResolucaoResolvidos() {
        return 0.0;
    }

    @Override
    public Double calcularMediaTemposResolucaoNaoResolvidos() {
        return 0.0;
    }
}
