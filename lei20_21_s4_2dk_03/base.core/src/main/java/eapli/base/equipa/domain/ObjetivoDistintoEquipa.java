package eapli.base.equipa.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Objetivo distinto equipa.
 */
@Embeddable
public class ObjetivoDistintoEquipa implements ValueObject, Comparable<ObjetivoDistintoEquipa> {
    private static final long serialVersionUID = 1L;
    private String objetivoDistintoEquipa;

    /**
     * Instantiates a new Objetivo distinto equipa.
     */
    protected ObjetivoDistintoEquipa() {
        // for ORM
    }

    /**
     * Instantiates a new Objetivo distinto equipa.
     *
     * @param objetivoDistintoEquipa the objetivo distinto equipa
     */
    public ObjetivoDistintoEquipa(final String objetivoDistintoEquipa) {
        if (StringPredicates.isNullOrEmpty(objetivoDistintoEquipa)) {
            throw new IllegalArgumentException("ObjetivoDistintoEquipa should neither be null nor empty");
        }
        this.objetivoDistintoEquipa = objetivoDistintoEquipa;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjetivoDistintoEquipa)) {
            return false;
        }

        final ObjetivoDistintoEquipa that = (ObjetivoDistintoEquipa) o;
        return this.objetivoDistintoEquipa.equals(that.objetivoDistintoEquipa);
    }

    @Override
    public int hashCode() {
        return this.objetivoDistintoEquipa.hashCode();
    }

    @Override
    public String toString() {
        return this.objetivoDistintoEquipa;
    }

    @Override
    public int compareTo(final ObjetivoDistintoEquipa arg0) {
        return objetivoDistintoEquipa.compareTo(arg0.objetivoDistintoEquipa);
    }
}
