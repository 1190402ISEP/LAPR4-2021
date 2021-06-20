package eapli.base.app.portal.presentation.insertFeedback;

import eapli.base.pedido.application.InserirFeedbackController;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

/**
 * The type Inserir feedback ui.
 */
public class InserirFeedbackUI extends AbstractUI {
    private final InserirFeedbackController theController = new InserirFeedbackController();

    @Override
    protected boolean doShow() {
        theController.mostrarPedidosConcluidos();
        final String identificadorPedido = Console.readLine("Identificador do pedido que pretende:");
        theController.associarPedido(identificadorPedido);

        final String feedback = Console.readLine("\nInsira o feedback do serviço:");
        theController.saveFeedback(feedback);

        System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                "Feedback inserido com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
        return false;
    }

    @Override
    public String headline() {
        return "InserirFeedbackUI";
    }
}
