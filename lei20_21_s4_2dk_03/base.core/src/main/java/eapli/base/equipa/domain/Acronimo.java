package eapli.base.equipa.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Acronimo.
 */
@Embeddable
public class Acronimo implements ValueObject, Comparable<Acronimo> {
    private static final long serialVersionUID = 1L;
    private String acronimo;

    /**
     * Instantiates a new Acronimo.
     */
    protected Acronimo() {
        // for ORM
    }

    /**
     * Instantiates a new Acronimo.
     *
     * @param acronimo the acrónimo
     */
    public Acronimo(final String acronimo) {
        if (StringPredicates.isNullOrEmpty(acronimo)) {
            throw new IllegalArgumentException("O acrónimo não pode ter valor null e deve ser preenchido.");
        }
        if (acronimo.trim().length() > 10) {
            throw new IllegalArgumentException("O acrónimo não pode ter mais de 10 caracteres.");
        }
        this.acronimo = acronimo;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Acronimo)) {
            return false;
        }

        final Acronimo that = (Acronimo) o;
        return this.acronimo.equals(that.acronimo);
    }

    @Override
    public int hashCode() {
        return this.acronimo.hashCode();
    }

    @Override
    public String toString() {
        return this.acronimo;
    }

    @Override
    public int compareTo(final Acronimo arg0) {
        return acronimo.compareTo(arg0.acronimo);
    }
}
