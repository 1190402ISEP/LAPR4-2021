package eapli.base.tipoequipa.domain;

import eapli.base.utils.Cor;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Version;

/**
 * The type Tipo equipa.
 */
@Entity
public class TipoEquipa implements AggregateRoot<CodigoInternoUnicoTipoEquipa> {
    @Version
    private Long version;
    @EmbeddedId
    private CodigoInternoUnicoTipoEquipa codigoInternoUnicoTipoEquipa;
    @Embedded
    private DescricaoTipoEquipa descricaoTipoEquipa;
    @Embedded
    private Cor cor;

    /**
     * Instantiates a new Tipo equipa.
     */
    protected TipoEquipa() {
        // for ORM
    }

    /**
     * Instantiates a new Tipo equipa.
     *
     * @param codigoInternoUnicoTipoEquipa the codigo interno unico tipo equipa
     * @param descricaoTipoEquipa          the descricao tipo equipa
     * @param cor                          the cor
     */
    public TipoEquipa(final CodigoInternoUnicoTipoEquipa codigoInternoUnicoTipoEquipa, DescricaoTipoEquipa descricaoTipoEquipa, Cor cor) {
        this.codigoInternoUnicoTipoEquipa = codigoInternoUnicoTipoEquipa;
        this.descricaoTipoEquipa = descricaoTipoEquipa;
        this.cor = cor;
    }

    /**
     * Instantiates a new Tipo equipa.
     *
     * @param codigoInternoUnicoTipoEquipa the codigo interno unico tipo equipa
     * @param descricaoTipoEquipa          the descricao tipo equipa
     * @param cor                          the cor
     */
    public TipoEquipa(String codigoInternoUnicoTipoEquipa, String descricaoTipoEquipa, String cor) {
        this.codigoInternoUnicoTipoEquipa = new CodigoInternoUnicoTipoEquipa(codigoInternoUnicoTipoEquipa);
        this.descricaoTipoEquipa = new DescricaoTipoEquipa(descricaoTipoEquipa);
        this.cor = new Cor(cor);
    }

    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public CodigoInternoUnicoTipoEquipa identity() {
        return this.codigoInternoUnicoTipoEquipa;
    }

    @Override
    public String toString() {
        return "\n--------------------------TipoEquipa--------------------------" +
                "\nCódigo único -> " + codigoInternoUnicoTipoEquipa +
                "\nDescrição -> " + descricaoTipoEquipa +
                "\nCor -> " + cor.toString() +
                '\n';
    }

    /**
     * Cor cor.
     *
     * @return the cor
     */
    public Cor cor() {
        return this.cor;
    }
}
