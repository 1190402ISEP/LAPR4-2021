package eapli.base.pedido.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Resposta formulario preenchido.
 */
@Embeddable
public class RespostaFormularioPreenchido implements ValueObject, Comparable<RespostaFormularioPreenchido> {
    private static final long serialVersionUID = 1L;
    private String respostaFormularioPreenchido;

    /**
     * Instantiates a new Resposta formulario preenchido.
     */
    protected RespostaFormularioPreenchido() {
        // for ORM
    }

    /**
     * Instantiates a new Resposta formulario preenchido.
     *
     * @param respostaFormularioPreenchido the resposta formulario preenchido
     */
    public RespostaFormularioPreenchido(final String respostaFormularioPreenchido) {
        if (StringPredicates.isNullOrEmpty(respostaFormularioPreenchido)) {
            throw new IllegalArgumentException("A resposta não pode ter valor null e deve ser preenchido.");
        }
        this.respostaFormularioPreenchido = respostaFormularioPreenchido;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RespostaFormularioPreenchido)) {
            return false;
        }

        final RespostaFormularioPreenchido that = (RespostaFormularioPreenchido) o;
        return this.respostaFormularioPreenchido.equals(that.respostaFormularioPreenchido);
    }

    @Override
    public int hashCode() {
        return this.respostaFormularioPreenchido.hashCode();
    }

    @Override
    public int compareTo(final RespostaFormularioPreenchido arg0) {
        return respostaFormularioPreenchido.compareTo(arg0.respostaFormularioPreenchido);
    }

    @Override
    public String toString() {
        return this.respostaFormularioPreenchido;
    }
}
