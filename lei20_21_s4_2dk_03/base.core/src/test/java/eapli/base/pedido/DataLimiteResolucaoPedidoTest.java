package eapli.base.pedido;

import eapli.base.pedido.domain.DataLimiteResolucaoPedido;
import org.junit.Test;

import java.util.Calendar;

public class DataLimiteResolucaoPedidoTest {
    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDataLimiteResolucaoNula() {
        DataLimiteResolucaoPedido data = new DataLimiteResolucaoPedido((String) null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDataLimiteResolucaoVazia() {
        DataLimiteResolucaoPedido data = new DataLimiteResolucaoPedido("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDataLimiteResolucaoTamanhoMenorQueLegal() {
        DataLimiteResolucaoPedido data = new DataLimiteResolucaoPedido("26/12/20");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDataLimiteResolucaoSemBarra() {
        DataLimiteResolucaoPedido data = new DataLimiteResolucaoPedido("26=12=2001");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDataLimiteResolucaoMenorAtual() {
        DataLimiteResolucaoPedido data = new DataLimiteResolucaoPedido("26/12/2001");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDataLimiteResolucaoIgualAtual() {
        Calendar c = Calendar.getInstance();
        String data = c.get(Calendar.DAY_OF_MONTH) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR);
        DataLimiteResolucaoPedido date = new DataLimiteResolucaoPedido(data);
    }

    @Test
    public void aceitarDataLimiteResolucaoValida() {
        DataLimiteResolucaoPedido data = new DataLimiteResolucaoPedido("26/12/2099");
    }

}
