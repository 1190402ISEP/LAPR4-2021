package eapli.base.formulario.domain;

import eapli.base.servico.domain.DescricaoCompletaServico;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Nome formulario.
 */
@Embeddable
public class NomeFormulario implements ValueObject, Comparable<NomeFormulario> {
    private String nomeFormulario;

    /**
     * Instantiates a new Nome formulario.
     */
    protected NomeFormulario() {
        //ORM
    }

    /**
     * Instantiates a new Nome formulario.
     *
     * @param nomeFormulario the nome formulario
     */
    public NomeFormulario(String nomeFormulario) {
        if (StringPredicates.isNullOrEmpty(nomeFormulario)) {
            throw new IllegalArgumentException("O titulo não pode ser nula ou vazia!");
        }

        if (nomeFormulario.trim().length() > 50) {
            throw new IllegalArgumentException("O titulo não pode exceder os 50 caracteres!");

        }
        this.nomeFormulario = nomeFormulario;
    }

    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NomeFormulario)) {
            return false;
        }
        final NomeFormulario that = (NomeFormulario) o;
        return this.nomeFormulario.equalsIgnoreCase(that.nomeFormulario);
    }

    @Override
    public String toString() {
        return nomeFormulario;
    }

    @Override
    public int compareTo(NomeFormulario o) {
        return this.nomeFormulario.compareToIgnoreCase(o.nomeFormulario);
    }
}
