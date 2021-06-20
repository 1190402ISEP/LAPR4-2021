package eapli.base.pedido.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * The type Ficheiro anexado pedido.
 */
@Entity
public class FicheiroAnexadoPedido implements ValueObject, Comparable<FicheiroAnexadoPedido> {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private int idKey;
    private String ficheiroAnexadoPedido;

    /**
     * Instantiates a new Ficheiro anexado pedido.
     */
    protected FicheiroAnexadoPedido() {
        // for ORM
    }

    /**
     * Instantiates a new Ficheiro anexado pedido.
     *
     * @param ficheiroAnexadoPedido the ficheiro anexado pedido
     */
    public FicheiroAnexadoPedido(final String ficheiroAnexadoPedido) {
        if (StringPredicates.isNullOrEmpty(ficheiroAnexadoPedido)) {
            throw new IllegalArgumentException("O ficheiro anexado pedido não pode ter valor null e deve ser preenchido.");
        }
        this.ficheiroAnexadoPedido = ficheiroAnexadoPedido;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FicheiroAnexadoPedido)) {
            return false;
        }

        final FicheiroAnexadoPedido that = (FicheiroAnexadoPedido) o;
        return this.ficheiroAnexadoPedido.equals(that.ficheiroAnexadoPedido);
    }

    @Override
    public int hashCode() {
        return this.ficheiroAnexadoPedido.hashCode();
    }

    @Override
    public int compareTo(final FicheiroAnexadoPedido arg0) {
        return ficheiroAnexadoPedido.compareTo(arg0.ficheiroAnexadoPedido);
    }

    @Override
    public String toString() {
        return this.ficheiroAnexadoPedido;
    }
}
