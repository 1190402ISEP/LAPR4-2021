package eapli.base.app.servicoserecursoshumanos.presentation.addServicoCatalogo;

import eapli.base.catalogoServico.application.AddServicoCatalogoController;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

/**
 * The type Add servico catalogo ui.
 */
public class AddServicoCatalogoUI extends AbstractUI {
    private final AddServicoCatalogoController theController = new AddServicoCatalogoController();

    @Override
    protected boolean doShow() {
        boolean decisaoAdd = true;
        while (decisaoAdd) {
            theController.showCatalogos();
            String identificadorCatalogo = Console.readLine("\nInsira o identificador:");
            theController.associarCatalogo(identificadorCatalogo);
            theController.showServicos();
            String codigoUnico = Console.readLine("\nInsira o código único:");
            theController.associarServico(codigoUnico);
            if (theController.add()) {
                System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                        "Serviço adicionado com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
            }
            int decisao = Console.readInteger("\nAdicionar outro serviço a um catálogo?\n1-Sim|0-Nao");
            if (decisao == 0) {
                decisaoAdd = false;
            } else if (decisao != 1) {
                throw new IllegalArgumentException("Opção inválida.");
            }
        }

        System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                "Opção terminada sem erros.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
        return false;
    }

    @Override
    public String headline() {
        return "AddServicoCatalogoUI";
    }
}
