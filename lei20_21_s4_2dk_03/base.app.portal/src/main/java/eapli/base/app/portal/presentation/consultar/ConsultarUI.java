package eapli.base.app.portal.presentation.consultar;

import eapli.base.catalogoServico.application.ConsultarController;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

/**
 * The type Consultar ui.
 */
public class ConsultarUI extends AbstractUI {
    private final ConsultarController theController = new ConsultarController();

    @Override
    protected boolean doShow() {
        final int decisaoShowAll = Console.readInteger("Deseja visualizar todos os serviços associados?\n1-Sim|0-Nao");
        if (decisaoShowAll == 1) {
            theController.showServicesInCatalogs();
        }

        final int decisaoKeys = Console.readInteger("\nDeseja procurar um serviço por uma key word?\n1-Sim|0-Nao");
        if (decisaoKeys == 1) {
            theController.showKeys();
            final String escolhaKey = Console.readLine("\nEscreva a key pela qual deseja procurar:");
            theController.confirmKey(escolhaKey);
            theController.showServicosComKey();
        }

        System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                "Consulta feita com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);

        return false;
    }

    @Override
    public String headline() {
        return "ConsultarUI";
    }
}
