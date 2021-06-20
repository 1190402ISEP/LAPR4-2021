package eapli.base.app.portal.presentation.atividade;

import eapli.base.atividade.application.ConsultarAtividadeController;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.presentation.console.AbstractUI;

/**
 * The type Consultar atividade ui.
 */
public class ConsultarAtividadeUI extends AbstractUI {
    private final ConsultarAtividadeController theController = new ConsultarAtividadeController();

    @Override
    protected boolean doShow() {
        theController.showAtividadeDoColab();
        System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                "Consulta feita com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);

        return false;
    }

    @Override
    public String headline() {
        return "ConsultarAtividadeUI";
    }

}
