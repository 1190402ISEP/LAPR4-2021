package eapli.base.nivelCriticidade.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Etiqueta.
 */
@Embeddable
public class Etiqueta implements ValueObject, Comparable<Etiqueta> {
    private static final long serialVersionUID = 1L;
    private String etiqueta;

    /**
     * Instantiates a new Etiqueta.
     */
    protected Etiqueta() {
        // for ORM
    }

    /**
     * Instantiates a new Etiqueta.
     *
     * @param etiqueta the etiqueta
     */
    public Etiqueta(final String etiqueta) {
        if (StringPredicates.isNullOrEmpty(etiqueta)) {
            throw new IllegalArgumentException("Etiqueta should neither be null nor empty");
        }
        if (etiqueta.trim().length() > 15) {
            throw new IllegalArgumentException("O Etiqueta não pode ter mais de 15 caracteres!");
        }
        this.etiqueta = etiqueta;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Etiqueta)) {
            return false;
        }

        final Etiqueta that = (Etiqueta) o;
        return this.etiqueta.equals(that.etiqueta);
    }

    @Override
    public int hashCode() {
        return this.etiqueta.hashCode();
    }

    @Override
    public String toString() {
        return this.etiqueta;
    }

    @Override
    public int compareTo(final Etiqueta arg0) {
        return etiqueta.compareTo(arg0.etiqueta);
    }
}
