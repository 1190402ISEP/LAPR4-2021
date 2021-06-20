package eapli.base.catalogoServico.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * The type Criterio acesso catalogo.
 */
@Entity
public class CriterioAcessoCatalogo implements ValueObject, Comparable<CriterioAcessoCatalogo> {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private int idKey;
    private String criterioAcessoCatalogo;

    /**
     * Instantiates a new Criterio acesso catalogo.
     */
    protected CriterioAcessoCatalogo() {
        // for ORM
    }

    /**
     * Instantiates a new Criterio acesso catalogo.
     *
     * @param criterioAcessoCatalogo the criterio acesso catalogo
     */
    public CriterioAcessoCatalogo(final String criterioAcessoCatalogo) {
        if (StringPredicates.isNullOrEmpty(criterioAcessoCatalogo)) {
            throw new IllegalArgumentException("Critério de acesso não pode ter valor null e deve ser preenchido.");
        }
        if (criterioAcessoCatalogo.length() > 50) {
            throw new IllegalArgumentException("Critério de acesso não pode ter mais de 50 carateres alfanuméricos.");
        }
        this.criterioAcessoCatalogo = criterioAcessoCatalogo;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CriterioAcessoCatalogo)) {
            return false;
        }

        final CriterioAcessoCatalogo that = (CriterioAcessoCatalogo) o;
        return this.criterioAcessoCatalogo.equals(that.criterioAcessoCatalogo);
    }

    @Override
    public int hashCode() {
        return this.criterioAcessoCatalogo.hashCode();
    }

    @Override
    public int compareTo(CriterioAcessoCatalogo o) {
        return this.criterioAcessoCatalogo.compareTo(o.criterioAcessoCatalogo);
    }

    @Override
    public String toString() {
        return this.criterioAcessoCatalogo;
    }
}
