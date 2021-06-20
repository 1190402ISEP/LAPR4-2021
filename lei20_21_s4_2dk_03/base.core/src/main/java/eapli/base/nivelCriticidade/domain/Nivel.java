package eapli.base.nivelCriticidade.domain;

import eapli.base.catalogoServico.domain.CatalogoServico;
import eapli.base.servico.domain.Servico;
import eapli.base.utils.Cor;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.List;

/**
 * The type Nivel.
 */
@Entity
public class Nivel implements AggregateRoot<Etiqueta> {
    @Version
    private Long version;
    @EmbeddedId
    private Etiqueta etiqueta;
    @Embedded
    private Cor cor;
    @Embedded
    private ObjetivoDistinto objetivoDistinto;
    @Embedded
    private DesignacaoNivel designacaoNivel;
    private int valorEscala;
    @OneToMany()
    private List<CatalogoServico> catalogos;
    @OneToMany
    private List<Servico> servicos;

    /**
     * Instantiates a new Nivel.
     */
    protected Nivel() {
        // for ORM
    }

    /**
     * Instantiates a new Nivel.
     *
     * @param etiqueta         the etiqueta
     * @param cor              the cor
     * @param valorEscala      the valor escala
     * @param objetivoDistinto the objetivo distinto
     * @param designacaoNivel  the designacao nivel
     */
    public Nivel(final Etiqueta etiqueta, Cor cor, int valorEscala,
                 ObjetivoDistinto objetivoDistinto, DesignacaoNivel designacaoNivel) {
        this.etiqueta = etiqueta;
        this.cor = cor;
        this.valorEscala = valorEscala;
        this.objetivoDistinto = objetivoDistinto;
        this.designacaoNivel = designacaoNivel;
    }

    /**
     * Instantiates a new Nivel.
     *
     * @param etiqueta         the etiqueta
     * @param cor              the cor
     * @param valorEscala      the valor escala
     * @param objetivoDistinto the objetivo distinto
     * @param designacaoNivel  the designacao nivel
     */
    public Nivel(String etiqueta, String cor, int valorEscala,
                 String objetivoDistinto, String designacaoNivel) {
        this.etiqueta = new Etiqueta(etiqueta);
        this.cor = new Cor(cor);
        this.valorEscala = valorEscala;
        this.objetivoDistinto = new ObjetivoDistinto(objetivoDistinto);
        this.designacaoNivel = new DesignacaoNivel(designacaoNivel);
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
    public Etiqueta identity() {
        return this.etiqueta;
    }

    @Override
    public String toString() {
        return "\n--------------------------Nível--------------------------" +
                "\nEtiqueta -> " + etiqueta +
                "\nCor -> " + cor.toString() +
                "\nObjetivo distinto -> " + objetivoDistinto +
                "\nDesignação -> " + designacaoNivel +
                "\nValor -> " + valorEscala +
                '\n';
    }

    /**
     * Gets objetivo.
     *
     * @return the objetivo
     */
    public ObjetivoDistinto getObjetivo() {
        return this.objetivoDistinto;
    }

    /**
     * Gets cor.
     *
     * @return the cor
     */
    public Cor getCor() {
        return this.cor;
    }

    /**
     * Gets designacao nivel.
     *
     * @return the designacao nivel
     */
    public DesignacaoNivel getDesignacaoNivel() {
        return this.designacaoNivel;
    }

    /**
     * Gets valor escala.
     *
     * @return the valor escala
     */
    public int getValorEscala() {
        return this.valorEscala;
    }

    /**
     * Gets objetivo.
     *
     * @param objetivo the objetivo
     */
    public void setObjetivo(String objetivo) {
        this.objetivoDistinto = new ObjetivoDistinto(objetivo);
    }

    /**
     * Add catalogo.
     *
     * @param cat the cat
     */
    public void addCatalogo(CatalogoServico cat) {
        if (!catalogos.isEmpty()) {
            for (CatalogoServico catalogo : catalogos) {
                if (catalogo.identity().toString().equals(cat.identity().toString())) {
                    throw new IllegalArgumentException("Catálogo já tem o nível.");
                }
            }
        }
        catalogos.add(cat);
    }

    /**
     * Add servico.
     *
     * @param ser the ser
     */
    public void addServico(Servico ser) {
        if (!servicos.contains(ser)) {
            servicos.add(ser);
        } else {
            throw new IllegalArgumentException("Nível já atribuído a serviço.");
        }
    }
}
