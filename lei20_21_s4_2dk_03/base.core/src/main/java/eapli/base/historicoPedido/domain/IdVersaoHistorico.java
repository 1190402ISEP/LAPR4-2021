package eapli.base.historicoPedido.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Id versao historico.
 */
@Embeddable
public class IdVersaoHistorico implements ValueObject, Comparable<IdVersaoHistorico> {
    private static final long serialVersionUID = 1L;
    private String id;

    protected IdVersaoHistorico() {
        //ORM
    }

    /**
     * Instantiates a new Identificador funcao.
     *
     * @param id the id
     */
    public IdVersaoHistorico(String id) {
        if (StringPredicates.isNullOrEmpty(id)) {
            throw new IllegalArgumentException("ID nao pode ser nulo nem vazio!");
        }
        if (id.trim().length() > 15) {
            throw new IllegalArgumentException("O ID da versao nao pode ter mais de 15 caracteres!");
        }
        this.id = id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdVersaoHistorico)) {
            return false;
        }

        final IdVersaoHistorico that = (IdVersaoHistorico) o;
        return this.id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    @Override
    public int compareTo(IdVersaoHistorico o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return this.id;
    }


}
