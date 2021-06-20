package eapli.base.app.servicoserecursoshumanos.presentation.servico;

import eapli.base.catalogoServico.application.CriarCatalogoController;
import eapli.base.catalogoServico.domain.CriterioAcessoCatalogo;
import eapli.base.catalogoServico.dto.CatalogoServicoDTO;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Criar catalogo ui.
 */
public class CriarCatalogoUI extends AbstractUI {
    private final CriarCatalogoController theController = new CriarCatalogoController();

    @Override
    protected boolean doShow() {
        System.out.println("Lista de Colaboradores");
        theController.mostrarListaDeColaboradores();

        String mecanographicNumber = Console.readLine("Insira o nº mecanográfico do colaborador responsável:");

        String identificador = Console.readLine("\nInsira o identificador do catálogo de Serviço:");
        String descBreve = Console.readLine("\nInsira a descrição breve:");
        String descCompleta = Console.readLine("\nInsira a descrição completa:");
        String titulo = Console.readLine("\nInsira o título do catálogo:");

        int qtdCriterios = Console.readInteger("\nInsira quantos critérios de acesso pretende adicionar:");
        List<CriterioAcessoCatalogo> criteriosAcesso = new ArrayList<>();
        List<String> listaAux = new ArrayList<>();
        if (qtdCriterios > 0) {
            for (int i = 0; i < qtdCriterios; i++) {
                String criterios = Console.readLine("\nInsira o critério de acesso:");
                if (listaAux.isEmpty() || !listaAux.contains(criterios)) {
                    listaAux.add(criterios);
                    criteriosAcesso.add(new CriterioAcessoCatalogo(criterios));
                } else {
                    System.out.println(StringColors.YELLOW + "\nNão podem ser introduzidos dois critérios iguais."  + StringColors.RESET);
                    i--;
                }
            }
        } else {
            throw new IllegalArgumentException("Tem de introduzir pelo menos 1 critério de acesso ao catálogo.");
        }

        CatalogoServicoDTO catalogoServicoDTO = new CatalogoServicoDTO(identificador, descBreve, descCompleta, titulo, criteriosAcesso, mecanographicNumber);

        this.theController.adicionarCatalogoServico(catalogoServicoDTO);

        System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                "Catálogo criado com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
        return false;
    }

    @Override
    public String headline() {
        return "CriarCatalogoUI";
    }
}
