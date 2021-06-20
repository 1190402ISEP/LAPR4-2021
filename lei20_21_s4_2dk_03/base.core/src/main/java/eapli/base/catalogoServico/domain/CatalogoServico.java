package eapli.base.catalogoServico.domain;

import eapli.base.catalogoServico.dto.CatalogoServicoDTO;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.nivelCriticidade.domain.Nivel;
import eapli.base.servico.domain.Servico;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.representations.dto.DTOable;

import javax.persistence.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Catalogo servico.
 */
@Entity
public class CatalogoServico implements AggregateRoot<IdentificadorCatalogo>, DTOable<CatalogoServicoDTO> {
    @Version
    private Long version;
    @EmbeddedId
    private IdentificadorCatalogo identificadorCatalogo;
    @Embedded
    private TituloCatalogo tituloCatalogo;
    @Embedded
    private DescricaoCompletaCatalogo descricaoCompletaCatalogo;
    @Embedded
    private DescricaoBreveCatalogo descricaoBreveCatalogo;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private List<CriterioAcessoCatalogo> criteriosAcessoCatalogo = new ArrayList<>();
    @OneToMany(fetch = FetchType.LAZY)
    private List<Servico> listaServicos;
    @ManyToOne()
    private Colaborador colaboradorResponsavel;
    @OneToOne()
    private Nivel nivel;
    private ImageIcon iconeCatalogo;

    /**
     * Instantiates a new Catalogo servico.
     */
    protected CatalogoServico() {
        //ORM
    }

    /**
     * Instantiates a new Catalogo servico.
     *
     * @param identificadorCatalogo     the identificador catalogo
     * @param descricaoBreveCatalogo    the descricao breve catalogo
     * @param descricaoCompletaCatalogo the descricao completa catalogo
     * @param iconeCatalogo             the icone catalogo
     * @param tituloCatalogo            the titulo catalogo
     * @param criterioAcesso            the criterio acesso
     * @param colaboradorResponsavel    the colaborador responsavel
     */
    public CatalogoServico(IdentificadorCatalogo identificadorCatalogo, DescricaoBreveCatalogo descricaoBreveCatalogo, DescricaoCompletaCatalogo descricaoCompletaCatalogo, ImageIcon iconeCatalogo, TituloCatalogo tituloCatalogo, List<CriterioAcessoCatalogo> criterioAcesso, Colaborador colaboradorResponsavel) {
        this.identificadorCatalogo = identificadorCatalogo;
        this.tituloCatalogo = tituloCatalogo;
        this.iconeCatalogo = iconeCatalogo;
        this.descricaoCompletaCatalogo = descricaoCompletaCatalogo;
        this.descricaoBreveCatalogo = descricaoBreveCatalogo;
        this.colaboradorResponsavel = colaboradorResponsavel;
        this.criteriosAcessoCatalogo.addAll(criterioAcesso);
    }

    /**
     * Instantiates a new Catalogo servico.
     *
     * @param identificadorCatalogo     the identificador catalogo
     * @param descricaoBreveCatalogo    the descricao breve catalogo
     * @param descricaoCompletaCatalogo the descricao completa catalogo
     * @param tituloCatalogo            the titulo catalogo
     * @param criterioAcessoCatalogo    the criterio acesso catalogo
     * @param colaboradorResponsavel    the colaborador responsavel
     */
    public CatalogoServico(String identificadorCatalogo, String descricaoBreveCatalogo, String descricaoCompletaCatalogo,
                           String tituloCatalogo, List<CriterioAcessoCatalogo> criterioAcessoCatalogo, Colaborador colaboradorResponsavel) {
        this.identificadorCatalogo = new IdentificadorCatalogo(identificadorCatalogo);
        this.tituloCatalogo = new TituloCatalogo(tituloCatalogo);
        this.descricaoCompletaCatalogo = new DescricaoCompletaCatalogo(descricaoCompletaCatalogo);
        this.descricaoBreveCatalogo = new DescricaoBreveCatalogo(descricaoBreveCatalogo);
        this.colaboradorResponsavel = colaboradorResponsavel;
        this.criteriosAcessoCatalogo.addAll(criterioAcessoCatalogo);
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
    public IdentificadorCatalogo identity() {
        return this.identificadorCatalogo;
    }

    @Override
    public String toString() {
        return "\n--------------------------CatalogoServiço--------------------------" +
                "\nIdentificador -> " + identificadorCatalogo +
                "\nTítulo -> " + tituloCatalogo +
                "\nDescrição breve -> " + descricaoBreveCatalogo +
                "\nNúmero de serviços -> " + listaServicos.size() +
                '\n';
    }

    /**
     * @return um catalogo de servicos para dto
     */
    @Override
    public CatalogoServicoDTO toDTO() {
        return new CatalogoServicoDTO();
    }

    /**
     * Gets criterios acesso catalogo.
     *
     * @return the criterios acesso catalogo
     */
    public List<CriterioAcessoCatalogo> getCriteriosAcessoCatalogo() {
        return this.criteriosAcessoCatalogo;
    }

    /**
     * Gets serv.
     *
     * @return the serv
     */
    public List<Servico> getServicos() {
        return this.listaServicos;
    }

    /**
     * Associar servico.
     *
     * @param ser the ser
     */
    public void associarServico(Servico ser) {
        if (!this.listaServicos.contains(ser)) {
            this.listaServicos.add(ser);
        } else {
            throw new IllegalArgumentException("O catalogo já contém o serviço: " + ser.identity());
        }
    }

    /**
     * Add nivel.
     *
     * @param thisNivel the this nivel
     */
    public void addNivel(Nivel thisNivel) {
        this.nivel = thisNivel;
    }

    /**
     * Gets nivel.
     *
     * @return the nivel
     */
    public Nivel getNivel() {
        return this.nivel;
    }

}
