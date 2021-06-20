package eapli.base.servico.domain;

import eapli.base.catalogoServico.domain.CatalogoServico;
import eapli.base.fluxodeatividade.domain.FluxoDeAtividade;
import eapli.base.formulario.domain.Formulario;
import eapli.base.nivelCriticidade.domain.Nivel;
import eapli.framework.domain.model.DomainFactory;

import javax.swing.*;
import java.util.List;

/**
 * The type Servico builder.
 */
public class ServicoBuilder implements DomainFactory<Servico> {
    private CodigoUnicoServico codigoUnicoServico;
    private TituloServico tituloServico;
    private CatalogoServico catalogoServico;
    private DescricaoBreveServico descricaoBreveServico;
    private DescricaoCompletaServico descricaoCompletaServico;
    private EstadoServico estadoServico;
    private Formulario formulario;
    private List<KeyWordServico> keyWords;
    private ImageIcon icon;
    private ObjetivoServico objetivoServico;
    private Servico servico;
    private FluxoDeAtividade fluxoDeAtividade;
    private Nivel nivel;

    /**
     * With codigo unico servico servico builder.
     *
     * @param codigoUnicoServico the codigo unico servico
     * @return the servico builder
     */
    public ServicoBuilder withCodigoUnicoServico(CodigoUnicoServico codigoUnicoServico) {
        this.codigoUnicoServico = codigoUnicoServico;
        return this;
    }

    /**
     * With codigo unico servico servico builder.
     *
     * @param codigoUnicoServico the codigo unico servico
     * @return the servico builder
     */
    public ServicoBuilder withCodigoUnicoServico(String codigoUnicoServico) {
        this.codigoUnicoServico = new CodigoUnicoServico(codigoUnicoServico);
        return this;
    }

    /**
     * With titulo servico servico builder.
     *
     * @param tituloServico the titulo servico
     * @return the servico builder
     */
    public ServicoBuilder withTituloServico(TituloServico tituloServico) {
        this.tituloServico = tituloServico;
        return this;
    }

    /**
     * With titulo servico servico builder.
     *
     * @param tituloServico the titulo servico
     * @return the servico builder
     */
    public ServicoBuilder withTituloServico(String tituloServico) {
        this.tituloServico = new TituloServico(tituloServico);
        return this;
    }

    /**
     * With titulo servico servico builder.
     *
     * @param keyWords the keyWords servico
     * @return the servico builder
     */
    public ServicoBuilder withKeyWords(List<KeyWordServico> keyWords) {
        this.keyWords = keyWords;
        return this;
    }

    /**
     * With descricao breve servico servico builder.
     *
     * @param descricaoBreveServico the descricao breve servico
     * @return the servico builder
     */
    public ServicoBuilder withDescricaoBreveServico(DescricaoBreveServico descricaoBreveServico) {
        this.descricaoBreveServico = descricaoBreveServico;
        return this;
    }

    /**
     * With descricao breve servico servico builder.
     *
     * @param descricaoBreveServico the descricao breve servico
     * @return the servico builder
     */
    public ServicoBuilder withDescricaoBreveServico(String descricaoBreveServico) {
        this.descricaoBreveServico = new DescricaoBreveServico(descricaoBreveServico);
        return this;
    }

    /**
     * With descricao completa servico servico builder.
     *
     * @param descricaoCompletaServico the descricao completa servico
     * @return the servico builder
     */
    public ServicoBuilder withDescricaoCompletaServico(DescricaoCompletaServico descricaoCompletaServico) {

        this.descricaoCompletaServico = descricaoCompletaServico;
        return this;
    }

    /**
     * With descricao completa servico servico builder.
     *
     * @param descricaoCompletaServico the descricao completa servico
     * @return the servico builder
     */
    public ServicoBuilder withDescricaoCompletaServico(String descricaoCompletaServico) {
        this.descricaoCompletaServico = new DescricaoCompletaServico(descricaoCompletaServico);
        return this;
    }

    /**
     * With objetivo servico servico builder.
     *
     * @param objetivoServico the objetivo servico
     * @return the servico builder
     */
    public ServicoBuilder withObjetivoServico(ObjetivoServico objetivoServico) {

        this.objetivoServico = objetivoServico;
        return this;
    }

    /**
     * With objetivo servico servico builder.
     *
     * @param objetivoServico the objetivo servico
     * @return the servico builder
     */
    public ServicoBuilder withObjetivoServico(String objetivoServico) {
        this.objetivoServico = new ObjetivoServico(objetivoServico);
        return this;
    }

    /**
     * With catalogo servico servico builder.
     *
     * @param catalogoServico the catalogo servico
     * @return the servico builder
     */
    public ServicoBuilder withCatalogoServico(CatalogoServico catalogoServico) {
        this.catalogoServico = catalogoServico;
        return this;
    }

    /**
     * With objetivo servico servico builder.
     *
     * @param formulario the formulario servico
     * @return the servico builder
     */
    public ServicoBuilder withFormulario(Formulario formulario) {
        this.formulario = formulario;
        return this;
    }

    /**
     * With fluxo de atividade servico builder.
     *
     * @param fluxoDeAtividade the fluxo de atividade
     * @return the servico builder
     */
    public ServicoBuilder withFluxoDeAtividade(FluxoDeAtividade fluxoDeAtividade) {
        this.fluxoDeAtividade = fluxoDeAtividade;
        return this;
    }

    /**
     * With icone servico builder.
     *
     * @param imageIcone the image icone
     * @return the servico builder
     */
    public ServicoBuilder withIcone(ImageIcon imageIcone) {
        this.icon = imageIcone;
        return this;
    }

    /**
     * With nivel servico builder.
     *
     * @param nivel the nivel
     * @return the servico builder
     */
    public ServicoBuilder withNivel(Nivel nivel) {
        this.nivel = nivel;
        return this;
    }

    @Override
    public Servico build() {
        Servico servico = new Servico(codigoUnicoServico, tituloServico, keyWords);

        if (catalogoServico != null) {
            servico.associarCatalogo(catalogoServico);
        }

        if (descricaoBreveServico != null) {
            servico.associarDescricaoBreve(descricaoBreveServico);
        }

        if (descricaoCompletaServico != null) {
            servico.associarDescricaoCompleta(descricaoCompletaServico);
        }

        if (objetivoServico != null) {
            servico.associarObjetivo(objetivoServico);
        }

        if (formulario != null) {
            servico.associarFormulario(formulario);
        }

        if (icon != null) {
            servico.associarIcone(icon);
        }

        if (nivel != null) {
            servico.associarNivel(nivel);
        }

        if (fluxoDeAtividade != null) {
            servico.associarFluxo(fluxoDeAtividade);
        }

        servico.checkNulls();

        return servico;
    }
}
