package eapli.base.nivelCriticidade.domain;

import eapli.base.utils.Cor;
import eapli.framework.domain.model.DomainFactory;

/**
 * The type Nivel builder.
 */
public class NivelBuilder implements DomainFactory<Nivel> {
    private Etiqueta etiqueta;
    private Cor cor;
    private int valorEscala;
    private ObjetivoDistinto objetivoDistinto;
    private DesignacaoNivel designacaoNivel;

    /**
     * With etiqueta nivel builder.
     *
     * @param etiqueta the etiqueta
     * @return the nivel builder
     */
    public NivelBuilder withEtiqueta(String etiqueta) {
        this.etiqueta = new Etiqueta(etiqueta);
        return this;
    }

    /**
     * With valor escala nivel builder.
     *
     * @param valorEscala the valor escala
     * @return the nivel builder
     */
    public NivelBuilder withValorEscala(int valorEscala) {
        this.valorEscala = valorEscala;
        return this;
    }

    /**
     * With cor nivel builder.
     *
     * @param cor the cor
     * @return the nivel builder
     */
    public NivelBuilder withCor(String cor) {
        this.cor = new Cor(cor);
        return this;
    }

    /**
     * With objetivo distinto nivel builder.
     *
     * @param objetivoDistinto the objetivo distinto
     * @return the nivel builder
     */
    public NivelBuilder withObjetivoDistinto(String objetivoDistinto) {
        this.objetivoDistinto = new ObjetivoDistinto(objetivoDistinto);
        return this;
    }

    /**
     * With designacao nivel nivel builder.
     *
     * @param designacaoNivel the designacao nivel
     * @return the nivel builder
     */
    public NivelBuilder withDesignacaoNivel(String designacaoNivel) {
        this.designacaoNivel = new DesignacaoNivel(designacaoNivel);
        return this;
    }

    @Override
    public Nivel build() {
        return new Nivel(etiqueta, cor, valorEscala, objetivoDistinto, designacaoNivel);
    }
}
