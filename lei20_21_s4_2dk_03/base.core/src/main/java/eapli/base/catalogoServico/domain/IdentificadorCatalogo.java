package eapli.base.catalogoServico.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Identificador catalogo.
 */
@Embeddable
public class IdentificadorCatalogo implements ValueObject, Comparable<IdentificadorCatalogo> {
    private static final long serialVersionUID = 1L;
    private String identificadorCatalogo;

    /**
     * Instantiates a new Identificador catalogo.
     */
    protected IdentificadorCatalogo() {
        // for ORM
    }

    /**
     * Instantiates a new Identificador catalogo.
     *
     * @param identificadorCatalogo the identificador catalogo
     */
    public IdentificadorCatalogo(final String identificadorCatalogo) {
        if (StringPredicates.isNullOrEmpty(identificadorCatalogo)) {
            throw new IllegalArgumentException("Identificador não pode ter valor null e deve ser preenchido.");
        }
        if (identificadorCatalogo.length() > 15) {
            throw new IllegalArgumentException("Identificador não pode ter mais de 15 carateres alfanuméricos.");
        }
        this.identificadorCatalogo = identificadorCatalogo;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentificadorCatalogo)) {
            return false;
        }

        final IdentificadorCatalogo that = (IdentificadorCatalogo) o;
        return this.identificadorCatalogo.equals(that.identificadorCatalogo);
    }

    @Override
    public int hashCode() {
        return this.identificadorCatalogo.hashCode();
    }

    @Override
    public int compareTo(final IdentificadorCatalogo arg0) {
        return identificadorCatalogo.compareTo(arg0.identificadorCatalogo);
    }

    @Override
    public String toString() {
        return this.identificadorCatalogo;
    }
}
