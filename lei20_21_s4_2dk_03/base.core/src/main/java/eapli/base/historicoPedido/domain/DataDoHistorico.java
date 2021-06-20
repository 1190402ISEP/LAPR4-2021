package eapli.base.historicoPedido.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Data do historico.
 */
@Embeddable
public class DataDoHistorico implements ValueObject, Comparable<DataDoHistorico> {
    private static final long serialVersionUID = 1L;
    private String dataDoHistorico;

    protected DataDoHistorico() {
        // for ORM
    }

    /**
     * Instantiates a new Data do historico.
     *
     * @param dataDoHistorico the data do historico
     */
    public DataDoHistorico(final String dataDoHistorico) {
        if (StringPredicates.isNullOrEmpty(dataDoHistorico)) {
            throw new IllegalArgumentException("DataDoHistorico should neither be null nor empty");
        }
        this.dataDoHistorico = dataDoHistorico;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataDoHistorico)) {
            return false;
        }

        final DataDoHistorico that = (DataDoHistorico) o;
        return this.dataDoHistorico.equals(that.dataDoHistorico);
    }

    @Override
    public int hashCode() {
        return this.dataDoHistorico.hashCode();
    }

    @Override
    public String toString() {
        return this.dataDoHistorico;
    }

    @Override
    public int compareTo(final DataDoHistorico arg0) {
        return dataDoHistorico.compareTo(arg0.dataDoHistorico);
    }
}
