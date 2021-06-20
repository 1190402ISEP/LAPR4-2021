package eapli.base.funcao.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;


/**
 * The type Identificador funcao.
 */
@Embeddable
public class IdentificadorFuncao implements ValueObject, Comparable<IdentificadorFuncao> {
    private static final long serialVersionUID = 1L;
    private String id;


    /**
     * Instantiates a new Identificador funcao.
     */
    protected IdentificadorFuncao() {
        //ORM
    }

    /**
     * Instantiates a new Identificador funcao.
     *
     * @param id the id
     */
    public IdentificadorFuncao(String id) {
        if (StringPredicates.isNullOrEmpty(id)) {
            throw new IllegalArgumentException("ID nao pode ser nulo nem vazio!");
        }
        if (id.trim().length() > 15) {
            throw new IllegalArgumentException("O ID da função nao pode ter mais de 15 caracteres!");
        }
        this.id = id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentificadorFuncao)) {
            return false;
        }

        final IdentificadorFuncao that = (IdentificadorFuncao) o;
        return this.id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    @Override
    public int compareTo(IdentificadorFuncao o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return this.id;
    }
}
