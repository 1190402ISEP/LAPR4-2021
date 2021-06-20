package eapli.base.clientusermanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Nome completo colaborador.
 */
@Embeddable

public class NomeCompletoColaborador implements ValueObject, Comparable<NomeCompletoColaborador> {
    private String nomeCompleto;

    /**
     * Instantiates a new Nome completo colaborador.
     */
    protected NomeCompletoColaborador() {
        //ORM
    }

    /**
     * Instantiates a new Nome completo colaborador.
     *
     * @param nomeCompleto the nome completo
     */
    public NomeCompletoColaborador(String nomeCompleto) {
        if (StringPredicates.isNullOrEmpty(nomeCompleto)) {
            throw new IllegalArgumentException("O nome completo não pode ser nulo ou vazio!");
        }
        if (nomeCompleto.trim().length() > 80) {
            throw new IllegalArgumentException("O nome completo não pode ter mais de 80 caracteres!");
        }
        this.nomeCompleto = nomeCompleto;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NomeCompletoColaborador)) {
            return false;
        }
        final NomeCompletoColaborador that = (NomeCompletoColaborador) o;
        return this.nomeCompleto.equalsIgnoreCase(that.nomeCompleto);
    }

    @Override
    public int hashCode() {
        return this.nomeCompleto.hashCode();
    }

    @Override
    public int compareTo(final NomeCompletoColaborador arg0) {
        return nomeCompleto.compareTo(arg0.nomeCompleto);
    }

    @Override
    public String toString() {
        return this.nomeCompleto;
    }
}
