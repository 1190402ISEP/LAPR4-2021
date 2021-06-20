package eapli.base.app.servicoserecursoshumanos.presentation.nivelCatalago;

import eapli.base.nivelCriticidade.application.AplicarNivelController;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

/**
 * The type Aplicar nivel ui.
 */
public class AplicarNivelUI extends AbstractUI {
    private final AplicarNivelController theController = new AplicarNivelController();

    @Override
    protected boolean doShow() {
        boolean maisAplicar = true;
        while (maisAplicar) {
            theController.showNiveis();
            String etiqueta = Console.readLine("\nInsira a etiqueta do nível:");
            theController.associarNivel(etiqueta);
            theController.showCatalogos();
            String identificador = Console.readLine("\nInsira o identificador:");
            theController.associarCatalogo(identificador);

            if (!theController.confirmarObjetivosServicos()) {
                System.out.println(StringColors.YELLOW + "\nNem todos os objetivos distintos dos serviços do catálogo são iguais." + StringColors.RESET);
                int decisaoAtualizar = Console.readInteger("\nPretende atualizar os objetivos desses serviços?\n1-Sim|0-Nao");
                if (decisaoAtualizar == 1) {
                    theController.atualizarServicos();
                }
            }

            if (theController.add()) {
                System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                        "Nível associado com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
            }

            int decisaoAdd = Console.readInteger("\nAdicionar outro nível a um catálogo?\n1-Sim|0-Nao");
            if (decisaoAdd == 0) {
                maisAplicar = false;
            }
        }

        System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                "Opção terminada sem erros.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
        return false;
    }

    @Override
    public String headline() {
        return "AplicarNivelUI";
    }
}
