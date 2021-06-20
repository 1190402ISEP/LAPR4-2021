package eapli.base.formulario.domain;

import eapli.base.servico.domain.DescricaoCompletaServico;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Descricao ajuda atributo.
 */
@Embeddable
public class DescricaoAjudaAtributo implements ValueObject, Comparable<DescricaoAjudaAtributo> {
    private String descricaoAjudaAtributo;

    /**
     * Instantiates a new Descricao ajuda atributo.
     */
    protected DescricaoAjudaAtributo() {
        //ORM
    }

    /**
     * Instantiates a new Descricao ajuda atributo.
     *
     * @param descricaoAjudaAtributo the descricao ajuda atributo
     */
    public DescricaoAjudaAtributo(String descricaoAjudaAtributo) {

        if (StringPredicates.isNullOrEmpty(descricaoAjudaAtributo)) {
            throw new IllegalArgumentException("A descrição de ajuda não pode ser nula ou vazia!");
        }

        if (descricaoAjudaAtributo.trim().length() > 50) {
            throw new IllegalArgumentException("A descrição de ajuda não pode exceder os 50 caracteres!");

        }
        this.descricaoAjudaAtributo = descricaoAjudaAtributo;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DescricaoAjudaAtributo)) {
            return false;
        }
        final DescricaoAjudaAtributo that = (DescricaoAjudaAtributo) o;
        return this.descricaoAjudaAtributo.equalsIgnoreCase(that.descricaoAjudaAtributo);
    }

    @Override
    public int compareTo(DescricaoAjudaAtributo o) {
        return this.descricaoAjudaAtributo.compareToIgnoreCase(o.descricaoAjudaAtributo);
    }

    @Override
    public String toString() {
        return descricaoAjudaAtributo;
    }
}
