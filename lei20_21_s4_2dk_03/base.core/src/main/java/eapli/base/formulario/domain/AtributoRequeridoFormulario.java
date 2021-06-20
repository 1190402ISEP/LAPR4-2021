package eapli.base.formulario.domain;

import eapli.framework.domain.model.DomainEntities;
import eapli.framework.domain.model.DomainEntity;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.*;

/**
 * The type Atributo requerido formulario.
 */
@Entity
public class AtributoRequeridoFormulario implements DomainEntity<String> {
    @Version
    private Long version;
    @Id
    private String nomeVariavelAtributo;
    private String etiquetaApresentacaoAtributo;
    @Embedded
    private DescricaoAjudaAtributo descricaoAjudaAtributo;
    @Enumerated(EnumType.STRING)
    public TipoDadosBaseAtributo tipoDadosBaseAtributo;
    private String expressaoRegularAtributos;

    /**
     * Instantiates a new Atributo requerido formulario.
     */
    protected AtributoRequeridoFormulario() {
        //ORM
    }

    /**
     * Instantiates a new Atributo requerido formulario.
     *
     * @param nomeVariavelAtributo         the nome variavel atributo
     * @param etiquetaApresentacaoAtributo the etiqueta apresentacao atributo
     * @param descricaoAjudaAtributo       the descricao ajuda atributo
     * @param tipoDadosBaseAtributo        the tipo dados base atributo
     * @param expressaoRegularAtributos    the expressao regular atributos
     */
    public AtributoRequeridoFormulario(String nomeVariavelAtributo, String etiquetaApresentacaoAtributo,
                                       String descricaoAjudaAtributo, TipoDadosBaseAtributo tipoDadosBaseAtributo, String expressaoRegularAtributos) {
        if (StringPredicates.isNullOrEmpty(nomeVariavelAtributo)) {
            throw new IllegalArgumentException("Nome Variavel Atributo nao pode ser nula ou vazia!");
        }
        this.nomeVariavelAtributo = nomeVariavelAtributo;
        this.etiquetaApresentacaoAtributo = etiquetaApresentacaoAtributo;
        this.descricaoAjudaAtributo = new DescricaoAjudaAtributo(descricaoAjudaAtributo);
        this.tipoDadosBaseAtributo = tipoDadosBaseAtributo;
        this.expressaoRegularAtributos = expressaoRegularAtributos;
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
    public String identity() {
        return this.nomeVariavelAtributo;
    }

    @Override
    public String toString() {
        return "\n--------------------------AtributoRequeridoFormulario--------------------------" +
                "\nNome -> " + nomeVariavelAtributo +
                "\nEtiqueta -> " + etiquetaApresentacaoAtributo +
                "\nDescrição -> " + descricaoAjudaAtributo +
                "\nTipo de dados -> " + tipoDadosBaseAtributo +
                '\n';
    }
}
