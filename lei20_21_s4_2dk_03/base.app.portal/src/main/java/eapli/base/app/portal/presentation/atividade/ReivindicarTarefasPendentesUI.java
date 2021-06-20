package eapli.base.app.portal.presentation.atividade;

import eapli.base.atividade.application.ReivindicarTarefasPendentesController;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

/**
 * The type Reinvindicar tarefas pendentes ui.
 */
public class ReivindicarTarefasPendentesUI extends AbstractUI {

    private final ReivindicarTarefasPendentesController theController = new ReivindicarTarefasPendentesController();

    @Override
    protected boolean doShow() {
        theController.findColabByEmail();
        theController.mostrarListaDeTarefasPendentesManuais();

        int decisaoReivindicar = Console.readInteger("Gostaria de reivindicar alguma atividade?\n1-Sim|0-Não");

        while (decisaoReivindicar == 1) {
            int idAtividade = Console.readInteger("\nInsira o id da atividade:");
            theController.assignarAtividadeAColaborador(idAtividade);

            System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                    "Tarefa reivindicada com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
            decisaoReivindicar = Console.readInteger("Continuar?\n1-Sim|0-Não");
        }

        System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                "Tarefas Pendentes vistas e/ou reivindicadas com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
        return false;
    }

    @Override
    public String headline() {
        return "ReinvindicarTarefasPendentesUI";
    }
}
