package eapli.base.app.servicoserecursoshumanos.presentation.colaborador;

import eapli.base.equipa.application.AddRemColaboradorController;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

/**
 * The type Add rem colaborador ui.
 */
public class AddRemColaboradorUI extends AbstractUI {
    private final AddRemColaboradorController theController = new AddRemColaboradorController();

    @Override
    protected boolean doShow() {
        int decisaoAdd = Console.readInteger("Adicionar colaborador a uma equipa?\n1-Sim|0-Nao");
        while (decisaoAdd == 1) {
            theController.showEquipas();
            String codigoUnicoEquipa = Console.readLine("\nInsira o código único:");
            theController.associarEquipa(codigoUnicoEquipa);
            theController.showColaboradores();
            String mecanographicNumber = Console.readLine("\nInsira o número mecanográfico:");
            theController.associarColaborador(mecanographicNumber);
            if (theController.add()) {
                System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                        "Colaborador adicionado com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
            }
            decisaoAdd = Console.readInteger("\nAdicionar outro colaborador a uma equipa?\n1-Sim|0-Nao");
        }

        System.out.println(StringColors.CYAN + "\n\n--------------------------------------------------------------------------------" + StringColors.RESET);

        int decisaoRem = Console.readInteger("\nRemover colaborador de uma equipa?\n1-Sim|0-Nao");
        while (decisaoRem == 1) {
            theController.showEquipas();
            String codigoUnicoEquipa = Console.readLine("\nInsira o codigo unico:");
            theController.associarEquipa(codigoUnicoEquipa);
            theController.showColaboradoresDaEquipa();
            String mecanographicNumber = Console.readLine("\nInsira o número mecanográfico:");
            theController.associarColaboradorEquipa(mecanographicNumber);
            if (theController.rem()) {
                System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                        "Colaborador removido com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
            }
            decisaoRem = Console.readInteger("\nRemover outro colaborador de uma equipa?\n1-Sim|0-Nao");
        }

        System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                "Opção terminada sem erros.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
        return false;
    }

    @Override
    public String headline() {
        return "AddRemColaboradorUI";
    }
}
