package eapli.base.historicoPedido.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Version;
import java.util.Objects;

/**
 * The type Historico pedido.
 */
@Entity
public class HistoricoPedido implements AggregateRoot<IdVersaoHistorico> {

    @Version
    private Long version;
    @EmbeddedId
    private IdVersaoHistorico idVersaoHistorico;

    @Embedded
    private DataDoHistorico dataDoHistorico;


    /**
     * Instantiates a new Historico pedido.
     *
     * @param idVersaoHistorico the id versao historico
     * @param dataDoHistorico   the data do historico
     */
    public HistoricoPedido(IdVersaoHistorico idVersaoHistorico, DataDoHistorico dataDoHistorico) {
        this.idVersaoHistorico = idVersaoHistorico;
        this.dataDoHistorico = dataDoHistorico;
    }


    public HistoricoPedido() {
        //ORM
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HistoricoPedido)) {
            return false;
        }
        final HistoricoPedido that = (HistoricoPedido) o;
        return this.idVersaoHistorico == that.idVersaoHistorico;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVersaoHistorico);
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public IdVersaoHistorico identity() {
        return this.idVersaoHistorico;
    }

    @Override
    public String toString() {
        return "\n--------------------------Atividade--------------------------" +
                "\nIdentificador -> " + idVersaoHistorico +
                "\nData do historico -> " + dataDoHistorico +
                '\n';
    }


}
