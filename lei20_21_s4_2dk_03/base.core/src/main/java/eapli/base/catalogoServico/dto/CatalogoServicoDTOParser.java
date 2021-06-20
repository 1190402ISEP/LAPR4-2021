package eapli.base.catalogoServico.dto;

import eapli.base.catalogoServico.domain.CatalogoServico;
import eapli.base.catalogoServico.domain.IdentificadorCatalogo;
import eapli.base.catalogoServico.repository.CatalogoServicoRepository;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.framework.representations.dto.DTOParser;

/**
 * The type Catalogo servico dto parser.
 */
public class CatalogoServicoDTOParser implements DTOParser<CatalogoServicoDTO, CatalogoServico> {

    private final CatalogoServicoRepository catalogoServicoRepository;
    private final ColaboradorRepository colaboradorRepository;

    /**
     * Instantiates a new Catalogo servico dto parser.
     *
     * @param repository            the repository
     * @param colaboradorRepository the colaborador repository
     */
    public CatalogoServicoDTOParser(final CatalogoServicoRepository repository, final ColaboradorRepository colaboradorRepository) {
        this.catalogoServicoRepository = repository;
        this.colaboradorRepository = colaboradorRepository;
    }

    public CatalogoServico valueOf(CatalogoServicoDTO catalogoServicoDTO) {

        Colaborador colaborador;

        if (colaboradorRepository.containsOfIdentity(new MecanographicNumber(catalogoServicoDTO.mecanographicNumber))) {
            colaborador = colaboradorRepository.ofIdentity(new MecanographicNumber(catalogoServicoDTO.mecanographicNumber)).get();
        } else {
            throw new IllegalArgumentException("Não existe Colaborador com esse número mecanográfico.");
        }

        // retorna o catalogo de servicos
        if (catalogoServicoRepository.containsOfIdentity(new IdentificadorCatalogo(catalogoServicoDTO.identificadorCatalogo))) {
            throw new IllegalArgumentException("Identificador já existe! : " + catalogoServicoDTO.identificadorCatalogo);
        }

        return new CatalogoServico(catalogoServicoDTO.identificadorCatalogo, catalogoServicoDTO.descricaoBreveCatalogo,
                catalogoServicoDTO.descricaoCompletaCatalogo, catalogoServicoDTO.tituloCatalogo,
                catalogoServicoDTO.criterioAcessoCatalogo, colaborador);
    }
}
