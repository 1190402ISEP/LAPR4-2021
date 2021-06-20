package eapli.base.pedido.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;

@Embeddable
public class DataAprovacaoPedido implements ValueObject, Comparable<DataAprovacaoPedido> {
    private static final long serialVersionUID = 1L;
    @Temporal(TemporalType.TIMESTAMP)
    private final Calendar dataAprovacao;

    /**
     * Instantiates a new Data resolucao pedido.
     */
    public DataAprovacaoPedido() {
        this.dataAprovacao = Calendar.getInstance();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataAprovacaoPedido)) {
            return false;
        }

        final DataAprovacaoPedido that = (DataAprovacaoPedido) o;
        return this.dataAprovacao.equals(that.dataAprovacao);
    }

    @Override
    public String toString() {
        return dataAprovacao.get(Calendar.DAY_OF_MONTH) + "/" +
                dataAprovacao.get(Calendar.MONTH) + "/" +
                dataAprovacao.get(Calendar.YEAR);
    }

    @Override
    public int compareTo(final DataAprovacaoPedido arg0) {
        return dataAprovacao.compareTo(arg0.dataAprovacao);
    }
}
