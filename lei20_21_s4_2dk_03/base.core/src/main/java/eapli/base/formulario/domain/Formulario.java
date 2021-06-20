package eapli.base.formulario.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Formulario.
 */
@Entity
public class Formulario implements AggregateRoot<Long> {
    @GeneratedValue
    @Id
    private Long identificadorFormulario;
    @Embedded
    private NomeFormulario nomeFormulario;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AtributoRequeridoFormulario> atributosRequeridos;

    /**
     * Instantiates a new Formulario.
     */
    protected Formulario() {
        //ORM
    }

    /**
     * Instantiates a new Formulario.
     *
     * @param nomeFormulario      the nome formulario
     * @param atributosRequeridos the atributos requeridos
     */
    public Formulario(NomeFormulario nomeFormulario,
                      List<AtributoRequeridoFormulario> atributosRequeridos) {
        this.nomeFormulario = nomeFormulario;
        this.atributosRequeridos = atributosRequeridos;
    }


    /**
     * Instantiates a new Formulario.
     *
     * @param nomeFormulario the nome formulario
     */
    public Formulario(NomeFormulario nomeFormulario) {
        this.nomeFormulario = nomeFormulario;
        this.atributosRequeridos = new ArrayList<>();

    }

    /**
     * Instantiates a new Formulario.
     *
     * @param nomeFormulario the nome formulario
     */
    public Formulario(String nomeFormulario) {
        this.nomeFormulario = new NomeFormulario(nomeFormulario);
        this.atributosRequeridos = new ArrayList<>();

    }


    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public Long identity() {
        return this.identificadorFormulario;
    }

    @Override
    public String toString() {
        return "\n--------------------------Formulário--------------------------" +
                "\nIdentificador -> " + identificadorFormulario +
                "\nNome -> " + nomeFormulario +
                '\n';
    }

    /**
     * Sets identificador formulario.
     *
     * @param identificadorFormulario the identificador formulario
     */
    public void setIdentificadorFormulario(Long identificadorFormulario) {
        this.identificadorFormulario = identificadorFormulario;
    }

    /**
     * Gets identificador formulario.
     *
     * @return the identificador formulario
     */
    public Long getIdentificadorFormulario() {
        return identificadorFormulario;
    }

    /**
     * Adicionar atributo formulario.
     *
     * @param nomeVariavelAtributo         the nome variavel atributo
     * @param etiquetaApresentacaoAtributo the etiqueta apresentacao atributo
     * @param descricaoAjudaAtributo       the descricao ajuda atributo
     * @param tipo                         the tipo
     * @param expressaoRegularAtributos    the expressao regular atributos
     */
    public void adicionarAtributoFormulario(String nomeVariavelAtributo, String etiquetaApresentacaoAtributo, String descricaoAjudaAtributo, TipoDadosBaseAtributo tipo, String expressaoRegularAtributos) {
        AtributoRequeridoFormulario arf = new AtributoRequeridoFormulario(nomeVariavelAtributo, etiquetaApresentacaoAtributo, descricaoAjudaAtributo, tipo, expressaoRegularAtributos);
        if (!atributosRequeridos.contains(arf)) {
            this.atributosRequeridos.add(arf);
        } else {
            System.err.println(String.format("Já existe atributo com nome único: %s\nTente nonvamente!" + nomeVariavelAtributo));
        }
    }
}
