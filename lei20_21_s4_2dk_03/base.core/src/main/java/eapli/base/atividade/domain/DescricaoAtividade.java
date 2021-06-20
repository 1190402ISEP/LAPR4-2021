package eapli.base.atividade.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Descricao atividade.
 */
@Embeddable
public class DescricaoAtividade implements ValueObject, Comparable<DescricaoAtividade> {
    private String descricaoAtividade;


    protected DescricaoAtividade() {
        //ORM
    }

    /**
     * Instantiates a new Descricao atividade.
     *
     * @param descricaoCompleta the descricao completa
     */
    public DescricaoAtividade(String descricaoCompleta) {
        if (StringPredicates.isNullOrEmpty(descricaoCompleta)) {
            throw new IllegalArgumentException("A descrição não pode ser nula ou vazia.");
        }

        if (descricaoCompleta.trim().length() > 500) {
            throw new IllegalArgumentException("A descrição não pode exceder os 500 caracteres.");

        }
        this.descricaoAtividade = descricaoCompleta;
    }

    /**
     * Value of descricao atividade.
     *
     * @param descricaoCompleta the descricao completa
     * @return the descricao atividade
     */
    public static DescricaoAtividade valueOf(final String descricaoCompleta) {
        return new DescricaoAtividade(descricaoCompleta);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DescricaoAtividade)) {
            return false;
        }
        final DescricaoAtividade that = (DescricaoAtividade) o;
        return this.descricaoAtividade.equalsIgnoreCase(that.descricaoAtividade);
    }

    @Override
    public int compareTo(DescricaoAtividade o) {
        return this.descricaoAtividade.compareTo(o.descricaoAtividade);
    }

    @Override
    public String toString() {
        return descricaoAtividade;
    }
}
