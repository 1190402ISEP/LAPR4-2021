package eapli.base.catalogoServico.application;

import eapli.base.catalogoServico.domain.CatalogoServico;
import eapli.base.catalogoServico.domain.IdentificadorCatalogo;
import eapli.base.catalogoServico.dto.CatalogoServicoDTO;
import eapli.base.catalogoServico.dto.CatalogoServicoDTOParser;
import eapli.base.catalogoServico.repository.CatalogoServicoRepository;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;

/**
 * The type Criar catalogo controller.
 */
public class CriarCatalogoController {
    private final CatalogoServicoRepository repository = PersistenceContext.repositories().catalogosServico();
    private final ColaboradorRepository colaboradorRepository = PersistenceContext.repositories().colaboradores();

    /**
     * Mostrar lista de colaboradores.
     */
    public void mostrarListaDeColaboradores() {
        Iterable<Colaborador> iterable = this.colaboradorRepository.findAll();
        for (Object colab : iterable) {
            System.out.printf("%s", colab);
        }
    }

    /**
     * Adicionar catalogo servico.
     *
     * @param catalogoServicoDTO the catalogo servico dto
     */
    public void adicionarCatalogoServico(CatalogoServicoDTO catalogoServicoDTO) {
        if (!repository.containsOfIdentity(new IdentificadorCatalogo(catalogoServicoDTO.identificadorCatalogo))) {

            final CatalogoServico catalogoServico = new CatalogoServicoDTOParser(repository, colaboradorRepository).valueOf(catalogoServicoDTO);

            this.repository.save(catalogoServico);
        } else {
            throw new IllegalStateException("Catalogo Servico já existe com identificador: " + catalogoServicoDTO.identificadorCatalogo);
        }
    }

}
