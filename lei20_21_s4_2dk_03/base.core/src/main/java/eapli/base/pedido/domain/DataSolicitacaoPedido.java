package eapli.base.pedido.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;

/**
 * The type Data solicitação pedido.
 */
@Embeddable
public class DataSolicitacaoPedido implements ValueObject, Comparable<DataSolicitacaoPedido> {
    private static final long serialVersionUID = 1L;
    @Temporal(TemporalType.TIMESTAMP)
    private final Calendar dataSolicitacao;

    /**
     * Instantiates a new Data solicitação pedido.
     */
    public DataSolicitacaoPedido() {
        this.dataSolicitacao = Calendar.getInstance();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataSolicitacaoPedido)) {
            return false;
        }

        final DataSolicitacaoPedido that = (DataSolicitacaoPedido) o;
        return this.dataSolicitacao.equals(that.dataSolicitacao);
    }

    @Override
    public String toString() {
        return dataSolicitacao.get(Calendar.DAY_OF_MONTH) + "/" +
                dataSolicitacao.get(Calendar.MONTH) + "/" +
                dataSolicitacao.get(Calendar.YEAR);
    }

    @Override
    public int compareTo(final DataSolicitacaoPedido arg0) {
        return dataSolicitacao.compareTo(arg0.dataSolicitacao);
    }
}
