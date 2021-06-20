package eapli.base.clientusermanagement.domain;


import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import java.util.Objects;

/**
 * The type Local residencia colaborador.
 */
@Embeddable
public class LocalResidenciaColaborador implements ValueObject, Comparable<LocalResidenciaColaborador> {
    private String distrito;
    private String concelho;

    /**
     * Instantiates a new Local residencia colaborador.
     */
    public LocalResidenciaColaborador() {
        //ORM
    }

    /**
     * Instantiates a new Local residencia colaborador.
     *
     * @param distrito the distrito
     * @param concelho the concelho
     */
    public LocalResidenciaColaborador(String distrito, String concelho) {
        if (StringPredicates.isNullOrEmpty(distrito)) {
            throw new IllegalArgumentException("Distrito não pode ser nulo nem vazio!");
        }
        this.distrito = distrito;
        if (StringPredicates.isNullOrEmpty(concelho)) {
            throw new IllegalArgumentException("Concelho não pode ser nulo nem vazio!");
        }
        this.concelho = concelho;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LocalResidenciaColaborador)) {
            return false;
        }

        final LocalResidenciaColaborador that = (LocalResidenciaColaborador) o;
        return this.distrito.equalsIgnoreCase(that.distrito)
                && this.concelho.equalsIgnoreCase(that.concelho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distrito, concelho);
    }

    @Override
    public int compareTo(final LocalResidenciaColaborador other) {
        int calc1 = this.distrito.compareTo(other.distrito);
        if (calc1 == 0) {
            return this.concelho.compareTo(other.concelho);
        } else {
            return calc1;
        }
    }

    @Override
    public String toString() {
        return String.format("%s -> %s ", distrito, concelho);
    }
}
