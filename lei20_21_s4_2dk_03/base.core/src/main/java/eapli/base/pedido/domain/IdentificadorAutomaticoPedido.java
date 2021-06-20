package eapli.base.pedido.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import java.util.Calendar;

/**
 * The type Identificador automatico pedido.
 */
@Embeddable
public class IdentificadorAutomaticoPedido implements ValueObject, Comparable<IdentificadorAutomaticoPedido> {
    private static final long serialVersionUID = 1L;
    private String id;

    /**
     * Instantiates a new Identificador automatico pedido.
     */
    protected IdentificadorAutomaticoPedido() {
        // for ORM
    }

    /**
     * Instantiates a new Identificador pedido.
     *
     * @param list the list
     */
    public IdentificadorAutomaticoPedido(Iterable<Pedido> list) {
        int number = 0;
        Calendar rightNow = Calendar.getInstance();
        for (Pedido ignored : list) {
            number++;
        }
        this.id = String.format("%d/%05d", rightNow.get(Calendar.YEAR), number + 1);
    }

    /**
     * Instantiates a new Identificador automatico pedido.
     *
     * @param identificador the identificador
     */
    public IdentificadorAutomaticoPedido(String identificador) {
        this.id = identificador;
    }

    /**
     * Instantiates a new Identificador automatico pedido.
     *
     * @param id the id
     */
    public IdentificadorAutomaticoPedido(long id) {
        this.id = id + "";
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentificadorAutomaticoPedido)) {
            return false;
        }

        final IdentificadorAutomaticoPedido that = (IdentificadorAutomaticoPedido) o;
        return this.id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    @Override
    public int compareTo(IdentificadorAutomaticoPedido o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return this.id;
    }
}
