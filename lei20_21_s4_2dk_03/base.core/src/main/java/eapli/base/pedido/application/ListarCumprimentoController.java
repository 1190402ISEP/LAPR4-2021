package eapli.base.pedido.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.pedido.domain.Pedido;
import eapli.base.pedido.repositories.PedidoRepository;
import eapli.base.utils.ConversaoDatas;

import java.util.Calendar;
import java.util.List;

public class ListarCumprimentoController {

    private final PedidoRepository pRepo = PersistenceContext.repositories().pedido();

    public void listarCumprimento(String dataInicial, String dataFinal) {
        Calendar first = ConversaoDatas.stringData(dataInicial);
        Calendar last = ConversaoDatas.stringData(dataFinal);

        List<Pedido> listaPedidos = pRepo.getPedidosBetweenDatesCump(first, last);

        if (!listaPedidos.isEmpty()) {
            for (Pedido p :listaPedidos) {
                System.out.println(p);
            }
        } else {
            throw new IllegalArgumentException("Sem pedidos cumpridos corretamente no período em que inseriu.");
        }
    }

    public void listarIncumprimento(String dataInicial, String dataFinal) {
        Calendar first = ConversaoDatas.stringData(dataInicial);
        Calendar last = ConversaoDatas.stringData(dataFinal);

        List<Pedido> listaPedidos = pRepo.getPedidosBetweenDatesIncump(first, last);

        if (!listaPedidos.isEmpty()) {
            for (Pedido p :listaPedidos) {
                System.out.println(p);
            }
        } else {
            throw new IllegalArgumentException("Sem pedidos não cumpridos corretamente no período em que inseriu.");
        }
    }
}
