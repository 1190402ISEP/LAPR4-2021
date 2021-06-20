package eapli.base.tipoequipa.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Codigo interno unico tipo equipa.
 */
@Embeddable
public class CodigoInternoUnicoTipoEquipa implements ValueObject, Comparable<CodigoInternoUnicoTipoEquipa> {
    private static final long serialVersionUID = 1L;

    private String codigoInternoUnicoTipoEquipa;

    /**
     * Instantiates a new Codigo interno unico tipo equipa.
     */
    protected CodigoInternoUnicoTipoEquipa() {
        // for ORM
    }

    /**
     * Instantiates a new Codigo interno unico tipo equipa.
     *
     * @param codigoInternoUnicoTipoEquipa the codigo interno unico tipo equipa
     */
    public CodigoInternoUnicoTipoEquipa(final String codigoInternoUnicoTipoEquipa) {
        if (StringPredicates.isNullOrEmpty(codigoInternoUnicoTipoEquipa)) {
            throw new IllegalArgumentException("Código interno único não pode ter valor null e deve ser preenchido.");
        }
        if (codigoInternoUnicoTipoEquipa.length() > 15) {
            throw new IllegalArgumentException("Código interno único não pode ter mais de 15 carateres alfanuméricos.");
        }
        this.codigoInternoUnicoTipoEquipa = codigoInternoUnicoTipoEquipa;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CodigoInternoUnicoTipoEquipa)) {
            return false;
        }

        final CodigoInternoUnicoTipoEquipa that = (CodigoInternoUnicoTipoEquipa) o;
        return this.codigoInternoUnicoTipoEquipa.equals(that.codigoInternoUnicoTipoEquipa);
    }

    @Override
    public int hashCode() {
        return this.codigoInternoUnicoTipoEquipa.hashCode();
    }

    @Override
    public String toString() {
        return this.codigoInternoUnicoTipoEquipa;
    }

    @Override
    public int compareTo(final CodigoInternoUnicoTipoEquipa arg0) {
        return codigoInternoUnicoTipoEquipa.compareTo(arg0.codigoInternoUnicoTipoEquipa);
    }
}
