package eapli.base.nivelCriticidade.application;

import eapli.base.catalogoServico.domain.CatalogoServico;
import eapli.base.catalogoServico.domain.IdentificadorCatalogo;
import eapli.base.catalogoServico.repository.CatalogoServicoRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.nivelCriticidade.domain.Etiqueta;
import eapli.base.nivelCriticidade.domain.Nivel;
import eapli.base.nivelCriticidade.repository.NivelRepository;
import eapli.base.servico.domain.Servico;
import eapli.base.servico.repository.ServicoRepository;
import eapli.framework.io.util.Console;

import java.util.ArrayList;
import java.util.List;

public class AplicarNivelController {
    private final NivelRepository nivelRepo = PersistenceContext.repositories().niveis();
    private final CatalogoServicoRepository catRepo = PersistenceContext.repositories().catalogosServico();
    private final ServicoRepository serRepo = PersistenceContext.repositories().servico();
    private Nivel thisNivel;
    private CatalogoServico thisCatalogo;
    private final List<Servico> thisListServ = new ArrayList<>();

    public void showNiveis() {
        Iterable<Nivel> niveis = nivelRepo.findAll();
        if (niveis.iterator().hasNext()) {
            for (Nivel nivel : niveis) {
                System.out.println(nivel);
            }
        } else {
            throw new IllegalStateException("Não existem níveis.");
        }
    }

    public void associarNivel(String etiqueta) {
        if (nivelRepo.containsOfIdentity(new Etiqueta(etiqueta))) {
            thisNivel = nivelRepo.ofIdentity(new Etiqueta(etiqueta)).get();
        } else {
            throw new IllegalStateException("Não existe nível com etiqueta: " + etiqueta);
        }
    }

    public void showCatalogos() {
        boolean noCatalogos = true;

        Iterable<CatalogoServico> catalogos = catRepo.findAll();
        if (catalogos.iterator().hasNext()) {
            for (CatalogoServico catalogo : catalogos) {
                if (catalogo.getNivel() == null) {
                    noCatalogos = false;
                    System.out.println(catalogo);
                }
            }
            if (noCatalogos) {
                throw new IllegalStateException("Não existem catálogos sem nível.");
            }
        } else {
            throw new IllegalStateException("Não existem catálogos.");
        }
    }

    public void associarCatalogo(String identificador) {
        if (catRepo.containsOfIdentity(new IdentificadorCatalogo(identificador))) {
            thisCatalogo = catRepo.ofIdentity(new IdentificadorCatalogo(identificador)).get();
        } else {
            throw new IllegalStateException("Não existe catálogo com identificador: " + identificador);
        }
    }

    public boolean confirmarObjetivosServicos() {
        boolean finalVerif = true;
        List<Servico> servicoList = thisCatalogo.getServicos();
        for (Servico servico : servicoList) {
            if (servico.getNivel() == null) {
                servico.associarNivel(thisNivel);
                thisNivel.addServico(servico);
                nivelRepo.save(thisNivel);
                serRepo.save(servico);
            } else if (!servico.getNivel().getObjetivo().equals(thisNivel.getObjetivo())) {
                finalVerif = false;
                thisListServ.add(servico);
            }
        }
        return finalVerif;
    }

    public void atualizarServicos() {
        for (Servico servico : thisListServ) {
            if (servico.getNivel() != null) {
                System.out.println(servico);
                System.out.println(servico.getNivel());
                String objetivo = Console.readLine("\nInsira o novo objetivo:");
                servico.getNivel().setObjetivo(objetivo);
                serRepo.save(servico);
                nivelRepo.save(servico.getNivel());
            }
        }
    }

    public boolean add() {
        try {
            thisCatalogo.addNivel(thisNivel);
            thisNivel.addCatalogo(thisCatalogo);
            nivelRepo.save(thisNivel);
            catRepo.save(thisCatalogo);
            return true;
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException("Erro ao associar nível.");
        }
    }
}
