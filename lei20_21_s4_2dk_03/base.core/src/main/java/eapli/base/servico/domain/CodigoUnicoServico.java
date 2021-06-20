package eapli.base.servico.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Codigo unico servico.
 */
@Embeddable
public class CodigoUnicoServico implements ValueObject, Comparable<CodigoUnicoServico> {
    private static final long serialVersionUID = 1L;
    private String codigoUnicoServico;

    /**
     * Instantiates a new Codigo unico servico.
     */
    protected CodigoUnicoServico() {
        //ORM
    }

    /**
     * Instantiates a new Codigo unico servico.
     *
     * @param codigoUnicoServico the codigo unico servico
     */
    public CodigoUnicoServico(final String codigoUnicoServico) {
        if (StringPredicates.isNullOrEmpty(codigoUnicoServico)) {
            throw new IllegalArgumentException("O código único nao deve ser nulo ou vazio.");
        }
        if (codigoUnicoServico.trim().length() > 15) {
            throw new IllegalArgumentException("O código único nao pode ter mais de 15 caracteres.");

        }
        this.codigoUnicoServico = codigoUnicoServico;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CodigoUnicoServico)) {
            return false;
        }

        final CodigoUnicoServico that = (CodigoUnicoServico) o;
        return this.codigoUnicoServico.equalsIgnoreCase(that.codigoUnicoServico);
    }

    @Override
    public int hashCode() {
        return this.codigoUnicoServico.hashCode();
    }

    @Override
    public int compareTo(CodigoUnicoServico o) {
        return this.codigoUnicoServico.compareToIgnoreCase(o.codigoUnicoServico);
    }

    @Override
    public String toString() {
        return codigoUnicoServico;
    }
}
