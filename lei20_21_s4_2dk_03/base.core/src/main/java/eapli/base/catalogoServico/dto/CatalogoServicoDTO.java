package eapli.base.catalogoServico.dto;

import eapli.base.catalogoServico.domain.CriterioAcessoCatalogo;
import eapli.framework.representations.dto.DTO;

import javax.swing.*;
import java.util.List;

/**
 * The type Catalogo servico dto.
 */
@SuppressWarnings("squid:ClassVariableVisibilityCheck")
@DTO
public class CatalogoServicoDTO {
    /**
     * The Identificador catalogo.
     */
    public String identificadorCatalogo;
    /**
     * The Descricao breve catalogo.
     */
    public String descricaoBreveCatalogo;
    /**
     * The Descricao completa catalogo.
     */
    public String descricaoCompletaCatalogo;
    /**
     * The Icone catalogo.
     */
    public ImageIcon iconeCatalogo;
    /**
     * The Criterio acesso catalogo.
     */
    public List<CriterioAcessoCatalogo> criterioAcessoCatalogo;
    /**
     * The Mecanographic number.
     */
    public String mecanographicNumber;
    /**
     * The Titulo catalogo.
     */
    public String tituloCatalogo;

    /**
     * Instantiates a new Catalogo servico dto.
     */
    public CatalogoServicoDTO() {
        //vazio
    }

    /**
     * Instantiates a new Catalogo servico dto.
     *
     * @param identificadorCatalogo     the identificador catalogo
     * @param descricaoBreveCatalogo    the descricao breve catalogo
     * @param descricaoCompletaCatalogo the descricao completa catalogo
     * @param tituloCatalogo            the titulo catalogo
     * @param criterioAcessoCatalogo    the criterio acesso catalogo
     * @param mecanographicNumber       the mecanographic number
     */
    public CatalogoServicoDTO(String identificadorCatalogo, String descricaoBreveCatalogo, String descricaoCompletaCatalogo,
                              String tituloCatalogo, List<CriterioAcessoCatalogo> criterioAcessoCatalogo, String mecanographicNumber) {
        this.identificadorCatalogo = identificadorCatalogo;
        this.descricaoBreveCatalogo = descricaoBreveCatalogo;
        this.descricaoCompletaCatalogo = descricaoCompletaCatalogo;
        this.criterioAcessoCatalogo = criterioAcessoCatalogo;
        this.mecanographicNumber = mecanographicNumber;
        this.tituloCatalogo = tituloCatalogo;
    }
}
