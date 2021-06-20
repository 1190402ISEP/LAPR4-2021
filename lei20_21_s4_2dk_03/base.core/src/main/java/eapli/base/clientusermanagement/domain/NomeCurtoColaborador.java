package eapli.base.clientusermanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Nome curto colaborador.
 */
@Embeddable
public class NomeCurtoColaborador implements ValueObject, Comparable<NomeCurtoColaborador> {
    private String nomeCurto;

    /**
     * Instantiates a new Nome curto colaborador.
     */
    protected NomeCurtoColaborador() {
        //ORM
    }

    /**
     * Instantiates a new Nome curto colaborador.
     *
     * @param nomeCurto the nome curto
     */
    public NomeCurtoColaborador(String nomeCurto) {
        if (StringPredicates.isNullOrEmpty(nomeCurto)) {
            throw new IllegalArgumentException("O nome curto não pode ser nulo ou vazio!");
        }
        if (nomeCurto.trim().length() > 30) {
            throw new IllegalArgumentException("O nome curto não pode ter mais de 30 caracteres!");
        }
        this.nomeCurto = nomeCurto;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NomeCurtoColaborador)) {
            return false;
        }
        final NomeCurtoColaborador that = (NomeCurtoColaborador) o;
        return this.nomeCurto.equalsIgnoreCase(that.nomeCurto);
    }

    @Override
    public int hashCode() {
        return this.nomeCurto.hashCode();
    }

    @Override
    public int compareTo(final NomeCurtoColaborador arg0) {
        return nomeCurto.compareTo(arg0.nomeCurto);
    }

    @Override
    public String toString() {
        return this.nomeCurto;
    }
}
