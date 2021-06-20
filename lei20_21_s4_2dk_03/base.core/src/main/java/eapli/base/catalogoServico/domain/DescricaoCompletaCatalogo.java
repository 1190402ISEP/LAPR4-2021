package eapli.base.catalogoServico.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Descricao completa catalogo.
 */
@Embeddable

public class DescricaoCompletaCatalogo implements ValueObject, Comparable<DescricaoCompletaCatalogo> {
    private String descricaoCompletaCatalogo;

    /**
     * Instantiates a new Descricao completa catalogo.
     */
    protected DescricaoCompletaCatalogo() {
        // for ORM
    }

    /**
     * Instantiates a new Descricao completa catalogo.
     *
     * @param descricaoCompletaCatalogo the descricao completa catalogo
     */
    public DescricaoCompletaCatalogo(final String descricaoCompletaCatalogo) {
        if (StringPredicates.isNullOrEmpty(descricaoCompletaCatalogo)) {
            throw new IllegalArgumentException("Descrição completa não pode ter valor null e deve ser preenchido.");
        }
        if (descricaoCompletaCatalogo.length() > 100) {
            throw new IllegalArgumentException("Descrição completa não pode ter mais de 100 carateres alfanuméricos.");
        }
        this.descricaoCompletaCatalogo = descricaoCompletaCatalogo;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DescricaoCompletaCatalogo)) {
            return false;
        }

        final DescricaoCompletaCatalogo that = (DescricaoCompletaCatalogo) o;
        return this.descricaoCompletaCatalogo.equals(that.descricaoCompletaCatalogo);
    }

    @Override
    public int hashCode() {
        return this.descricaoCompletaCatalogo.hashCode();
    }

    @Override
    public int compareTo(final DescricaoCompletaCatalogo arg0) {
        return descricaoCompletaCatalogo.compareTo(arg0.descricaoCompletaCatalogo);
    }

    @Override
    public String toString() {
        return this.descricaoCompletaCatalogo;
    }
}
