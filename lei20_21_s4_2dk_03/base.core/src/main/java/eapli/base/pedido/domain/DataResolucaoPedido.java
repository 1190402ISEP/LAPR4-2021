package eapli.base.pedido.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;

/**
 * The type Data resolucao pedido.
 */
@Embeddable
public class DataResolucaoPedido implements ValueObject, Comparable<DataResolucaoPedido> {
    private static final long serialVersionUID = 1L;
    @Temporal(TemporalType.TIMESTAMP)
    private final Calendar dataResolucao;

    /**
     * Instantiates a new Data resolucao pedido.
     */
    public DataResolucaoPedido() {
        this.dataResolucao = Calendar.getInstance();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataResolucaoPedido)) {
            return false;
        }

        final DataResolucaoPedido that = (DataResolucaoPedido) o;
        return this.dataResolucao.equals(that.dataResolucao);
    }

    @Override
    public String toString() {
        return dataResolucao.get(Calendar.DAY_OF_MONTH) + "/" +
                dataResolucao.get(Calendar.MONTH) + "/" +
                dataResolucao.get(Calendar.YEAR);
    }

    @Override
    public int compareTo(final DataResolucaoPedido arg0) {
        return dataResolucao.compareTo(arg0.dataResolucao);
    }
}
