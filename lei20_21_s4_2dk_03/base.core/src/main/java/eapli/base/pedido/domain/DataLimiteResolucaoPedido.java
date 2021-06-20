package eapli.base.pedido.domain;

import eapli.base.utils.ConversaoDatas;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;

/**
 * The type Data limite resolucao pedido.
 */
@Embeddable
public class DataLimiteResolucaoPedido implements ValueObject, Comparable<DataLimiteResolucaoPedido> {
    private static final long serialVersionUID = 1L;
    @Temporal(TemporalType.DATE)
    private Calendar dataLimiteResolucao;

    /**
     * Instantiates a new Data limite resolucao pedido.
     */
    protected DataLimiteResolucaoPedido() {
        //ORM
    }

    /**
     * Instantiates a new Data limite resolucao pedido.
     *
     * @param data the data
     */
    public DataLimiteResolucaoPedido(final String data) {
        if (StringPredicates.isNullOrEmpty(data)) {
            throw new IllegalArgumentException("Data limite de resolução não pode ter valor null e deve ser preenchido.");
        }
        if (!validaData(data)) {
            throw new IllegalArgumentException("Formato de data inválido para data limite resolução.");

        }
        this.dataLimiteResolucao = ConversaoDatas.stringData(data);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataLimiteResolucaoPedido)) {
            return false;
        }

        final DataLimiteResolucaoPedido that = (DataLimiteResolucaoPedido) o;
        return this.dataLimiteResolucao.equals(that.dataLimiteResolucao);
    }

    @Override
    public int compareTo(final DataLimiteResolucaoPedido arg0) {
        return dataLimiteResolucao.compareTo(arg0.dataLimiteResolucao);
    }

    @Override
    public String toString() {
        return dataLimiteResolucao.get(Calendar.DAY_OF_MONTH) + "/" +
        dataLimiteResolucao.get(Calendar.MONTH) + "/" +
        dataLimiteResolucao.get(Calendar.YEAR);
    }

    private boolean validaData(String data) {
        Calendar c = Calendar.getInstance();
        //Validação de formato
        if (data.charAt(2) != 47 || data.charAt(5) != 47 || data.trim().length() != 10) {
            return false;
        }
        //Validação relativamente a ser maior que a atual
        return c.compareTo(ConversaoDatas.stringData(data)) < 0;
    }
}
