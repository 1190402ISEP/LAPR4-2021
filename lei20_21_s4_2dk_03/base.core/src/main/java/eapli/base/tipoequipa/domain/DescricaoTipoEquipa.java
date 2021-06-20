package eapli.base.tipoequipa.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;

/**
 * The type Descricao tipo equipa.
 */
@Embeddable
public class DescricaoTipoEquipa implements ValueObject, Comparable<DescricaoTipoEquipa> {

    private String descricaoTipoEquipa;

    /**
     * Instantiates a new Descricao tipo equipa.
     */
    protected DescricaoTipoEquipa() {
        // for ORM
    }

    /**
     * Instantiates a new Descricao tipo equipa.
     *
     * @param descricaoTipoEquipa the descricao tipo equipa
     */
    public DescricaoTipoEquipa(final String descricaoTipoEquipa) {
        if (StringPredicates.isNullOrEmpty(descricaoTipoEquipa)) {
            throw new IllegalArgumentException("Descrição não pode ter valor null e deve ser preenchido.");
        }
        if (descricaoTipoEquipa.length() > 50) {
            throw new IllegalArgumentException("Descrição não pode ter mais de 50 carateres alfanuméricos.");
        }
        this.descricaoTipoEquipa = descricaoTipoEquipa;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DescricaoTipoEquipa)) {
            return false;
        }

        final DescricaoTipoEquipa that = (DescricaoTipoEquipa) o;
        return this.descricaoTipoEquipa.equals(that.descricaoTipoEquipa);
    }

    @Override
    public int hashCode() {
        return this.descricaoTipoEquipa.hashCode();
    }

    @Override
    public String toString() {
        return this.descricaoTipoEquipa;
    }

    @Override
    public int compareTo(final DescricaoTipoEquipa arg0) {
        return descricaoTipoEquipa.compareTo(arg0.descricaoTipoEquipa);
    }
}
