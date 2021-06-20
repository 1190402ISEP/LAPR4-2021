package eapli.base.nivelCriticidade.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Etiqueta.
 */
@Embeddable
public class ObjetivoDistinto implements ValueObject, Comparable<ObjetivoDistinto> {
    private static final long serialVersionUID = 1L;
    private String objetivoDistinto;

    /**
     * Instantiates a new Objetivo distinto.
     */
    protected ObjetivoDistinto() {
        // for ORM
    }

    /**
     * Instantiates a new Objetivo distinto.
     *
     * @param objetivoDistinto the objetivo distinto
     */
    public ObjetivoDistinto(final String objetivoDistinto) {
        if (StringPredicates.isNullOrEmpty(objetivoDistinto)) {
            throw new IllegalArgumentException("ObjetivoDistinto should neither be null nor empty");
        }
        if (objetivoDistinto.trim().length() > 50) {
            throw new IllegalArgumentException("O ObjetivoDistinto não pode ter mais de 50 caracteres!");
        }
        this.objetivoDistinto = objetivoDistinto;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjetivoDistinto)) {
            return false;
        }

        final ObjetivoDistinto that = (ObjetivoDistinto) o;
        return this.objetivoDistinto.equals(that.objetivoDistinto);
    }

    @Override
    public int hashCode() {
        return this.objetivoDistinto.hashCode();
    }

    @Override
    public String toString() {
        return this.objetivoDistinto;
    }

    @Override
    public int compareTo(final ObjetivoDistinto arg0) {
        return objetivoDistinto.compareTo(arg0.objetivoDistinto);
    }
}
