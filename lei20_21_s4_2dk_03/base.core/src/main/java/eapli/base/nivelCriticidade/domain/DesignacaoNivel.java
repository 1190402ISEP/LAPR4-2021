package eapli.base.nivelCriticidade.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Designacao nivel.
 */
@Embeddable
public class DesignacaoNivel implements ValueObject, Comparable<DesignacaoNivel> {
    private static final long serialVersionUID = 1L;
    private String designacaoNivel;

    /**
     * Instantiates a new Designacao nivel.
     */
    protected DesignacaoNivel() {
        // for ORM
    }

    /**
     * Instantiates a new Designacao nivel.
     *
     * @param designacaoNivel the designacao nivel
     */
    public DesignacaoNivel(final String designacaoNivel) {
        if (StringPredicates.isNullOrEmpty(designacaoNivel)) {
            throw new IllegalArgumentException("A designação não pode ter valor null e deve ser preenchido.");
        }
        if (designacaoNivel.trim().length() > 15) {
            throw new IllegalArgumentException("A designação não pode ter mais de 15 caracteres!");
        }
        this.designacaoNivel = designacaoNivel;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DesignacaoNivel)) {
            return false;
        }

        final DesignacaoNivel that = (DesignacaoNivel) o;
        return this.designacaoNivel.equals(that.designacaoNivel);
    }

    @Override
    public int hashCode() {
        return this.designacaoNivel.hashCode();
    }

    @Override
    public String toString() {
        return this.designacaoNivel;
    }

    @Override
    public int compareTo(final DesignacaoNivel arg0) {
        return designacaoNivel.compareTo(arg0.designacaoNivel);
    }

}
