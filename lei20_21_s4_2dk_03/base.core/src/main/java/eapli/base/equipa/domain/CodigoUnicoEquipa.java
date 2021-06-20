package eapli.base.equipa.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Codigo unico equipa.
 */
@Embeddable
public class CodigoUnicoEquipa implements ValueObject, Comparable<CodigoUnicoEquipa> {
    private static final long serialVersionUID = 1L;
    private String codigoUnicoEquipa;

    /**
     * Instantiates a new Codigo unico equipa.
     */
    protected CodigoUnicoEquipa() {
        // for ORM
    }

    /**
     * Instantiates a new Codigo unico equipa.
     *
     * @param codigoUnicoEquipa the codigo unico equipa
     */
    public CodigoUnicoEquipa(final String codigoUnicoEquipa) {
        if (StringPredicates.isNullOrEmpty(codigoUnicoEquipa)) {
            throw new IllegalArgumentException("O código único de equipa não pode ter valor null e deve ser preenchido.");
        }
        if (codigoUnicoEquipa.trim().length() > 15) {
            throw new IllegalArgumentException("O código único de equipa não pode ter mais de 15 caracteres.");
        }
        this.codigoUnicoEquipa = codigoUnicoEquipa;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CodigoUnicoEquipa)) {
            return false;
        }

        final CodigoUnicoEquipa that = (CodigoUnicoEquipa) o;
        return this.codigoUnicoEquipa.equals(that.codigoUnicoEquipa);
    }

    @Override
    public int hashCode() {
        return this.codigoUnicoEquipa.hashCode();
    }

    @Override
    public String toString() {
        return this.codigoUnicoEquipa;
    }

    @Override
    public int compareTo(final CodigoUnicoEquipa arg0) {
        return codigoUnicoEquipa.compareTo(arg0.codigoUnicoEquipa);
    }
}
