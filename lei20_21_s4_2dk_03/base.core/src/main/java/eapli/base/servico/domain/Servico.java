package eapli.base.servico.domain;

import eapli.base.catalogoServico.domain.CatalogoServico;
import eapli.base.fluxodeatividade.domain.FluxoDeAtividade;
import eapli.base.formulario.domain.Formulario;
import eapli.base.nivelCriticidade.domain.Nivel;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import javax.swing.*;
import java.util.List;

/**
 * The type Servico.
 */
@Entity
public class Servico implements AggregateRoot<CodigoUnicoServico> {
    @Version
    private Long version;
    @EmbeddedId
    private CodigoUnicoServico codigoUnicoServico;
    @Embedded
    private TituloServico tituloServico;
    @OneToOne
    private CatalogoServico catalogoServico;
    @Embedded
    private DescricaoBreveServico descricaoBreveServico;
    @Embedded
    private DescricaoCompletaServico descricaoCompletaServico;
    @Enumerated(EnumType.STRING)
    private EstadoServico estadoServico;
    @OneToOne
    private Formulario formulario;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn
    private List<KeyWordServico> keyWords;
    private ImageIcon icon;
    @Embedded
    private ObjetivoServico objetivoServico;
    @OneToOne()
    private Nivel nivel;
    @OneToOne
    private FluxoDeAtividade fluxoDeAtividade;

    /**
     * Instantiates a new Servico.
     */
    protected Servico() {
        //ORM
    }

    /**
     * Instantiates a new Servico.
     *
     * @param codigoUnicoServico the codigo unico servico
     * @param tituloServico      the titulo servico
     * @param keyWords           the key words
     */
    public Servico(CodigoUnicoServico codigoUnicoServico, TituloServico tituloServico, List<KeyWordServico> keyWords) {
        this.codigoUnicoServico = codigoUnicoServico;
        this.tituloServico = tituloServico;
        this.keyWords = keyWords;
    }

    /**
     * Instantiates a new Servico.
     *
     * @param codigoUnicoServico the codigo unico servico
     * @param tituloServico      the titulo servico
     * @param keyWords           the key words
     */
    public Servico(String codigoUnicoServico, String tituloServico, List<KeyWordServico> keyWords) {
        this.codigoUnicoServico = new CodigoUnicoServico(codigoUnicoServico);
        this.tituloServico = new TituloServico(tituloServico);
        this.keyWords = keyWords;
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public CodigoUnicoServico identity() {
        return this.codigoUnicoServico;
    }

    @Override
    public String toString() {
        return "\n--------------------------Serviço--------------------------" +
                "\nCódigo único -> " + codigoUnicoServico +
                "\nTitulo -> " + tituloServico +
                '\n';
    }

    /**
     * Associar catalogo.
     *
     * @param catalogoServico the catalogo servico
     */
    public void associarCatalogo(CatalogoServico catalogoServico) {
        this.catalogoServico = catalogoServico;
    }

    /**
     * Associar descricao breve.
     *
     * @param descricaoBreveServico the descricao breve servico
     */
    public void associarDescricaoBreve(DescricaoBreveServico descricaoBreveServico) {
        this.descricaoBreveServico = descricaoBreveServico;
    }

    /**
     * Associar descricao completa.
     *
     * @param descricaoCompletaServico the descricao completa servico
     */
    public void associarDescricaoCompleta(DescricaoCompletaServico descricaoCompletaServico) {
        this.descricaoCompletaServico = descricaoCompletaServico;
    }

    /**
     * Associar objetivo.
     *
     * @param objetivoServico the objetivo servico
     */
    public void associarObjetivo(ObjetivoServico objetivoServico) {
        this.objetivoServico = objetivoServico;
    }

    /**
     * Associar fluxo.
     *
     * @param fluxoDeAtividade the fluxo de atividade
     */
    public void associarFluxo(FluxoDeAtividade fluxoDeAtividade) {
        this.fluxoDeAtividade = fluxoDeAtividade;
    }

    /**
     * Gets key words.
     *
     * @return the key words
     */
    public List<KeyWordServico> getKeyWords() {
        return this.keyWords;
    }

    /**
     * Associar formulario.
     *
     * @param form the form
     */
    public void associarFormulario(Formulario form) {
        this.formulario = form;
    }

    /**
     * Associar Nível.
     *
     * @param nivel the nível
     */
    public void associarNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    /**
     * Associar icone.
     *
     * @param icon the icon
     */
    public void associarIcone(ImageIcon icon) {
        this.icon = icon;
    }

    /**
     * Check nulls.
     */
    public void checkNulls() {
        if (this.catalogoServico == null || this.descricaoBreveServico == null || this.descricaoCompletaServico == null
                || this.estadoServico == null || this.formulario == null || this.icon == null || this.objetivoServico == null
                || this.nivel == null || this.fluxoDeAtividade == null) {
            this.estadoServico = EstadoServico.INCOMPLETO;
        } else {
            this.estadoServico = EstadoServico.COMPLETO;
        }
    }

    /**
     * Gets catalogo.
     *
     * @return the catalogo
     */
    public CatalogoServico getCatalogo() {
        return this.catalogoServico;
    }

    /**
     * Gets estado.
     *
     * @return the estado
     */
    public EstadoServico getEstado() {
        return this.estadoServico;
    }

    /**
     * Gets desc breve.
     *
     * @return the desc breve
     */
    public DescricaoBreveServico getDescBreve() {
        return this.descricaoBreveServico;
    }

    /**
     * Gets desc completa.
     *
     * @return the desc completa
     */
    public DescricaoCompletaServico getDescCompleta() {
        return this.descricaoCompletaServico;
    }

    /**
     * Gets objetivo.
     *
     * @return the objetivo
     */
    public ObjetivoServico getObjetivo() {
        return this.objetivoServico;
    }

    /**
     * Gets formulario.
     *
     * @return the formulario
     */
    public Formulario getFormulario() {
        return this.formulario;
    }

    /**
     * Gets nivel.
     *
     * @return the nivel
     */
    public Nivel getNivel() {
        return this.nivel;
    }

    public FluxoDeAtividade getFluxoDeAtividade() {
        return this.fluxoDeAtividade;
    }
}
