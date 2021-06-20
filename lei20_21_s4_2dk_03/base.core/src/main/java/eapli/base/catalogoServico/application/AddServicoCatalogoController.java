package eapli.base.catalogoServico.application;

import eapli.base.catalogoServico.domain.CatalogoServico;
import eapli.base.catalogoServico.domain.IdentificadorCatalogo;
import eapli.base.catalogoServico.repository.CatalogoServicoRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.servico.domain.CodigoUnicoServico;
import eapli.base.servico.domain.Servico;
import eapli.base.servico.repository.ServicoRepository;

public class AddServicoCatalogoController {
    private final CatalogoServicoRepository catRepo = PersistenceContext.repositories().catalogosServico();
    private final ServicoRepository serRepo = PersistenceContext.repositories().servico();
    private CatalogoServico thisCatalogo;
    private Servico thisServico;

    public void showCatalogos() {
        Iterable<CatalogoServico> catalogos = this.catRepo.findAll();
        if (catalogos.iterator().hasNext()) {
            for (CatalogoServico catalogo : catalogos) {
                System.out.println(catalogo);
            }
        } else {
            throw new IllegalArgumentException("Não existem catálogos.");
        }
    }

    public void associarCatalogo(String identificadorCatalogo) {
        if (catRepo.containsOfIdentity(new IdentificadorCatalogo(identificadorCatalogo))) {
            thisCatalogo = catRepo.ofIdentity(new IdentificadorCatalogo(identificadorCatalogo)).get();
        } else {
            throw new IllegalStateException("Não existe catálogo com identificador: " + identificadorCatalogo);
        }
    }

    public void showServicos() {
        boolean disponiveis = false;
        Iterable<Servico> servicos = this.serRepo.findAll();
        if (servicos.iterator().hasNext()) {
            for (Servico servico : servicos) {
                if (servico.getCatalogo() == null) {
                    disponiveis = true;
                    System.out.println(servico);
                }
            }
            if (!disponiveis) {
                throw new IllegalArgumentException("Não existem serviços sem catálogo.");
            }
        } else {
            throw new IllegalArgumentException("Não existem serviços.");
        }
    }

    public void associarServico(String codigoUnico) {
        if (serRepo.containsOfIdentity(new CodigoUnicoServico(codigoUnico))) {
            thisServico = serRepo.ofIdentity(new CodigoUnicoServico(codigoUnico)).get();
        } else {
            throw new IllegalStateException("Não existe serviço com código: " + codigoUnico);
        }
    }

    public boolean add() {
        try {
            if (thisCatalogo.getServicos().contains(thisServico)) {
                System.out.println("\nO catálogo já tem esse serviço.\n");
            } else {
                thisServico.associarCatalogo(thisCatalogo);
                thisCatalogo.associarServico(thisServico);
                catRepo.save(thisCatalogo);
                serRepo.save(thisServico);
                return true;
            }
            return false;
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException("Colaborador já se encontra na equipa.");
        }
    }
}
