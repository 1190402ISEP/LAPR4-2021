package eapli.base.app.servicoserecursoshumanos.presentation.tipoequipa;

import eapli.base.tipoequipa.application.CriarTipoEquipaController;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

/**
 * The type Criar tipo equipa ui.
 */
public class CriarTipoEquipaUI extends AbstractUI {
    private final CriarTipoEquipaController theController = new CriarTipoEquipaController();

    @Override
    protected boolean doShow() {
        final String codigoInternoUnicoTipoEquipa = Console.readLine("Código Interno Único:");
        final String descricaoTipoEquipa = Console.readLine("\nDescrição:");
        final String cor = Console.readLine("\nCor (r,g,b):");

        this.theController.adicionarTipoEquipa(codigoInternoUnicoTipoEquipa, descricaoTipoEquipa, cor);

        System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                "Tipo de equipa criado com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
        return false;
    }

    @Override
    public String headline() {
        return "CriarTipoEquipaUI";
    }
}
