package eapli.base.pedido.repositories;

import eapli.base.pedido.domain.IdentificadorAutomaticoPedido;
import eapli.base.pedido.domain.Pedido;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Calendar;
import java.util.List;

/**
 * The interface Pedido repository.
 */
public interface PedidoRepository
        extends DomainRepository<IdentificadorAutomaticoPedido, Pedido> {

    /**
     * Total by year iterable.
     *
     * @param first the first
     * @param last  the last
     * @return the iterable
     */
    Iterable<Pedido> totalByYear(Calendar first, Calendar last);

    /**
     * Find ped by colab list.
     *
     * @param mecNumber the mec number
     * @return the list
     */
    List<Pedido> findPedByColab(String mecNumber);

    /**
     * Find histo by colab list.
     *
     * @param mecNumber the mec number
     * @return the list
     */
    List<Pedido> findHistoByColab(String mecNumber);

    /**
     * Gets pedidos between dates cump.
     *
     * @param first the first
     * @param last  the last
     * @return the pedidos between dates cump
     */
    List<Pedido> getPedidosBetweenDatesCump(Calendar first, Calendar last);

    /**
     * Gets pedidos between dates incump.
     *
     * @param first the first
     * @param last  the last
     * @return the pedidos between dates incump
     */
    List<Pedido> getPedidosBetweenDatesIncump(Calendar first, Calendar last);

    /**
     * Find histo by colab without feed list.
     *
     * @param toString the to string
     * @return the list
     */
    List<Pedido> findHistoByColabWithoutFeed(String toString);

    /**
     * Calcular media tempos aprovacao double.
     *
     * @return the double
     */
    Double calcularMediaTemposAprovacao();

    /**
     * Calcular media tempos resolucao resolvidos double.
     *
     * @return the double
     */
    Double calcularMediaTemposResolucaoResolvidos();

    /**
     * Calcular media tempos resolucao nao resolvidos double.
     *
     * @return the double
     */
    Double calcularMediaTemposResolucaoNaoResolvidos();
}
