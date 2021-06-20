package eapli.base.servico.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Objetivo servico.
 */
@Embeddable
public class ObjetivoServico implements ValueObject, Comparable<ObjetivoServico> {
    private static final long serialVersionUID = 1L;
    private String objetivoServico;

    /**
     * Instantiates a new Objetivo servico.
     */
    protected ObjetivoServico() {
        // for ORM
    }

    /**
     * Instantiates a new Objetivo servico.
     *
     * @param objetivoServico the objetivo servico
     */
    public ObjetivoServico(final String objetivoServico) {
        if (StringPredicates.isNullOrEmpty(objetivoServico)) {
            throw new IllegalArgumentException("O objetivo do serviço nao pode ser nula ou vazia.");
        }

        if (objetivoServico.trim().length() > 50) {
            throw new IllegalArgumentException("O objetivo do serviço nao pode exceder os 50 caracteres.");
        }
        this.objetivoServico = objetivoServico;
    }

    /**
     * Value of objetivo servico.
     *
     * @param objetivoServico the objetivo servico
     * @return the objetivo servico
     */
    public static ObjetivoServico valueOf(final String objetivoServico) {
        return new ObjetivoServico(objetivoServico);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjetivoServico)) {
            return false;
        }

        final ObjetivoServico that = (ObjetivoServico) o;
        return this.objetivoServico.equals(that.objetivoServico);
    }

    @Override
    public int hashCode() {
        return this.objetivoServico.hashCode();
    }

    @Override
    public int compareTo(final ObjetivoServico arg0) {
        return objetivoServico.compareTo(arg0.objetivoServico);
    }

    @Override
    public String toString() {
        return this.objetivoServico;
    }
}
