package eapli.base.catalogoServico.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Descricao breve catalogo.
 */
@Embeddable

public class DescricaoBreveCatalogo implements ValueObject, Comparable<DescricaoBreveCatalogo> {
    private String descricaoBreveCatalogo;

    /**
     * Instantiates a new Descricao breve catalogo.
     */
    protected DescricaoBreveCatalogo() {
        // for ORM
    }

    /**
     * Instantiates a new Descricao breve catalogo.
     *
     * @param descricaoBreveCatalogo the descricao breve catalogo
     */
    public DescricaoBreveCatalogo(final String descricaoBreveCatalogo) {
        if (StringPredicates.isNullOrEmpty(descricaoBreveCatalogo)) {
            throw new IllegalArgumentException("Descrição não pode ter valor null e deve ser preenchido.");
        }
        if (descricaoBreveCatalogo.length() > 40) {
            throw new IllegalArgumentException("Descrição não pode ter mais de 40 carateres alfanuméricos.");
        }
        this.descricaoBreveCatalogo = descricaoBreveCatalogo;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DescricaoBreveCatalogo)) {
            return false;
        }

        final DescricaoBreveCatalogo that = (DescricaoBreveCatalogo) o;
        return this.descricaoBreveCatalogo.equals(that.descricaoBreveCatalogo);
    }

    @Override
    public int hashCode() {
        return this.descricaoBreveCatalogo.hashCode();
    }

    @Override
    public int compareTo(final DescricaoBreveCatalogo arg0) {
        return descricaoBreveCatalogo.compareTo(arg0.descricaoBreveCatalogo);
    }

    @Override
    public String toString() {
        return this.descricaoBreveCatalogo;
    }
}
