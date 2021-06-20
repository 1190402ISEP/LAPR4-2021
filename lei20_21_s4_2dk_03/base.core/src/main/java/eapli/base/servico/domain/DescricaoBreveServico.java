package eapli.base.servico.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Descricao breve servico.
 */
@Embeddable
public class DescricaoBreveServico implements ValueObject, Comparable<DescricaoBreveServico> {
    private static final long serialVersionUID = 1L;
    private String descricaoBreveServico;

    /**
     * Instantiates a new Descricao breve servico.
     */
    protected DescricaoBreveServico() {
        // for ORM
    }

    /**
     * Instantiates a new Descricao breve servico.
     *
     * @param descricaoBreveServico the descricao breve servico
     */
    public DescricaoBreveServico(final String descricaoBreveServico) {
        if (StringPredicates.isNullOrEmpty(descricaoBreveServico)) {
            throw new IllegalArgumentException("A descricao curta não pode ser nula ou vazia.");
        }

        if (descricaoBreveServico.trim().length() > 40) {
            throw new IllegalArgumentException("A descricao curta não pode exceder os 40 caracteres.");

        }
        this.descricaoBreveServico = descricaoBreveServico;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DescricaoBreveServico)) {
            return false;
        }

        final DescricaoBreveServico that = (DescricaoBreveServico) o;
        return this.descricaoBreveServico.equals(that.descricaoBreveServico);
    }

    @Override
    public int hashCode() {
        return this.descricaoBreveServico.hashCode();
    }

    @Override
    public int compareTo(final DescricaoBreveServico arg0) {
        return descricaoBreveServico.compareTo(arg0.descricaoBreveServico);
    }

    @Override
    public String toString() {
        return this.descricaoBreveServico;
    }
}
