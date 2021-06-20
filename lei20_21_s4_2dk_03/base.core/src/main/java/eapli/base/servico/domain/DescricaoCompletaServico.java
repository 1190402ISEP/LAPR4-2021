package eapli.base.servico.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Descricao completa servico.
 */
@Embeddable
public class DescricaoCompletaServico implements ValueObject, Comparable<DescricaoCompletaServico> {
    private String descricaoCompleta;

    /**
     * Instantiates a new Descricao completa servico.
     */
    protected DescricaoCompletaServico() {
        //ORM
    }

    /**
     * Instantiates a new Descricao completa servico.
     *
     * @param descricaoCompleta the descricao completa
     */
    public DescricaoCompletaServico(String descricaoCompleta) {
        if (StringPredicates.isNullOrEmpty(descricaoCompleta)) {
            throw new IllegalArgumentException("A descrição completa não pode ser nula ou vazia.");
        }

        if (descricaoCompleta.trim().length() > 500) {
            throw new IllegalArgumentException("A descrição completa não pode exceder os 500 caracteres.");

        }
        this.descricaoCompleta = descricaoCompleta;
    }

    /**
     * Value of descricao completa servico.
     *
     * @param descricaoCompleta the descricao completa
     * @return the descricao completa servico
     */
    public static DescricaoCompletaServico valueOf(final String descricaoCompleta) {
        return new DescricaoCompletaServico(descricaoCompleta);
    }

    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DescricaoCompletaServico)) {
            return false;
        }
        final DescricaoCompletaServico that = (DescricaoCompletaServico) o;
        return this.descricaoCompleta.equalsIgnoreCase(that.descricaoCompleta);
    }

    @Override
    public int compareTo(DescricaoCompletaServico o) {
        return this.descricaoCompleta.compareTo(o.descricaoCompleta);
    }

    @Override
    public String toString() {
        return descricaoCompleta;
    }
}
