package eapli.base.pedido.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Atributo formulario preenchido.
 */
@Embeddable
public class AtributoFormularioPreenchido implements ValueObject, Comparable<AtributoFormularioPreenchido> {
    private static final long serialVersionUID = 1L;
    private String atributoFormularioPreenchido;

    /**
     * Instantiates a new Atributo formulario preenchido.
     */
    protected AtributoFormularioPreenchido() {
        // for ORM
    }

    /**
     * Instantiates a new Atributo formulario preenchido.
     *
     * @param atributoFormularioPreenchido the atributo formulario preenchido
     */
    public AtributoFormularioPreenchido(final String atributoFormularioPreenchido) {
        if (StringPredicates.isNullOrEmpty(atributoFormularioPreenchido)) {
            throw new IllegalArgumentException("O atributo não pode ter valor null e deve ser preenchido.");
        }
        this.atributoFormularioPreenchido = atributoFormularioPreenchido;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AtributoFormularioPreenchido)) {
            return false;
        }

        final AtributoFormularioPreenchido that = (AtributoFormularioPreenchido) o;
        return this.atributoFormularioPreenchido.equals(that.atributoFormularioPreenchido);
    }

    @Override
    public int hashCode() {
        return this.atributoFormularioPreenchido.hashCode();
    }

    @Override
    public int compareTo(final AtributoFormularioPreenchido arg0) {
        return atributoFormularioPreenchido.compareTo(arg0.atributoFormularioPreenchido);
    }

    @Override
    public String toString() {
        return this.atributoFormularioPreenchido;
    }
}
