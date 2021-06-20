package eapli.base.servico.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Titulo servico.
 */
@Embeddable
public class TituloServico implements ValueObject, Comparable<TituloServico> {
    private static final long serialVersionUID = 1L;
    private String titulo;

    /**
     * Instantiates a new Titulo servico.
     */
    protected TituloServico() {
        // for ORM
    }

    /**
     * Instantiates a new Titulo servico.
     *
     * @param titulo the titulo
     */
    public TituloServico(final String titulo) {
        if (StringPredicates.isNullOrEmpty(titulo)) {
            throw new IllegalArgumentException("Titulo nao pode ser nulo ou vazio.");
        }
        if (titulo.trim().length() > 50) {
            throw new IllegalArgumentException("O titulo nao pode ter mais de 50 caracteres.");

        }
        this.titulo = titulo;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TituloServico)) {
            return false;
        }

        final TituloServico that = (TituloServico) o;
        return this.titulo.equals(that.titulo);
    }

    @Override
    public int hashCode() {
        return this.titulo.hashCode();
    }

    @Override
    public int compareTo(final TituloServico arg0) {
        return titulo.compareTo(arg0.titulo);
    }

    @Override
    public String toString() {
        return this.titulo;
    }
}
