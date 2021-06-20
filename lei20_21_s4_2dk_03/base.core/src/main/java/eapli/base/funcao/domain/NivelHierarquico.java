package eapli.base.funcao.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Nivel hierarquico.
 */
@Embeddable
public class NivelHierarquico implements ValueObject, Comparable<NivelHierarquico> {
    private static final long serialVersionUID = 1L;
    private String nivelHierarquico;

    /**
     * Instantiates a new Nivel hierarquico.
     */
    protected NivelHierarquico() {
        //ORM
    }

    /**
     * Instantiates a new Nivel hierarquico.
     *
     * @param nivelHierarquico the nivel hierarquico
     */
    public NivelHierarquico(String nivelHierarquico) {
        if (StringPredicates.isNullOrEmpty(nivelHierarquico)) {
            throw new IllegalArgumentException("Nivel Hierarquico nao pode ser nulo nem vazio.");
        }
        this.nivelHierarquico = nivelHierarquico;

    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NivelHierarquico)) {
            return false;
        }

        final NivelHierarquico that = (NivelHierarquico) o;
        return this.nivelHierarquico.equals(that.nivelHierarquico);
    }

    @Override
    public int hashCode() {
        return this.nivelHierarquico.hashCode();
    }

    @Override
    public int compareTo(NivelHierarquico o) {
        return this.nivelHierarquico.compareTo(o.nivelHierarquico);
    }

    @Override
    public String toString() {
        return this.nivelHierarquico;
    }
}
