package eapli.base.app.servicoserecursoshumanos.presentation.listarCumprimento;

import eapli.base.pedido.application.ListarCumprimentoController;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

/**
 * The type Listar cumprimento ui.
 */
public class ListarCumprimentoUI extends AbstractUI {
    private final ListarCumprimentoController theController = new ListarCumprimentoController();

    @Override
    protected boolean doShow() {
        int opcaoVisualizacao = 0;
        while (opcaoVisualizacao != 1 && opcaoVisualizacao != 2) {
            opcaoVisualizacao = Console.readInteger("Escolha a opção que deseja visualizar:\n\n1-> Listar cumprimento dos contratos.\n2-> Listar incumprimento dos contratos.");
        }

        final String dataInicial = Console.readLine("\nInsira as datas dos períodos que pretende visualizar:\nData inicial:");
        final String dataFinal = Console.readLine("\nData final:");

        if (opcaoVisualizacao == 1) {
            theController.listarCumprimento(dataInicial, dataFinal);
        } else {
            theController.listarIncumprimento(dataInicial, dataFinal);
        }
        Console.readLine("\nClique no enter para continuar.");

        System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                "Listagem demonstrada com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
        return false;
    }

    @Override
    public String headline() {
        return "ListarCumprimentoUI";
    }
}
