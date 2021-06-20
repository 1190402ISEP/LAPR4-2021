package eapli.base.catalogoServico.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Titulo catalogo.
 */
@Embeddable
public class TituloCatalogo implements ValueObject, Comparable<TituloCatalogo> {
    private String tituloCatalogo;

    /**
     * Instantiates a new Titulo catalogo.
     */
    protected TituloCatalogo() {
        // for ORM
    }

    /**
     * Instantiates a new Titulo catalogo.
     *
     * @param tituloCatalogo the titulo catalogo
     */
    public TituloCatalogo(final String tituloCatalogo) {
        if (StringPredicates.isNullOrEmpty(tituloCatalogo)) {
            throw new IllegalArgumentException("Titulo não pode ter valor null e deve ser preenchido.");
        }
        if (tituloCatalogo.length() > 50) {
            throw new IllegalArgumentException("Titulo não pode ter mais de 50 carateres alfanuméricos.");
        }
        this.tituloCatalogo = tituloCatalogo;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TituloCatalogo)) {
            return false;
        }

        final TituloCatalogo that = (TituloCatalogo) o;
        return this.tituloCatalogo.equals(that.tituloCatalogo);
    }

    @Override
    public int hashCode() {
        return this.tituloCatalogo.hashCode();
    }

    @Override
    public int compareTo(final TituloCatalogo arg0) {
        return tituloCatalogo.compareTo(arg0.tituloCatalogo);
    }

    @Override
    public String toString() {
        return this.tituloCatalogo;
    }
}
