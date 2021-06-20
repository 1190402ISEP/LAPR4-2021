package eapli.base.app.servicoserecursoshumanos.presentation.equipa;

import eapli.base.equipa.application.CriarEquipaController;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Criar equipa ui.
 */
public class CriarEquipaUI extends AbstractUI {
    private final CriarEquipaController theController = new CriarEquipaController();
    private final List<String> colaboradores = new ArrayList<>();

    @Override
    protected boolean doShow() {
        final String codigoUnicoEquipa = Console.readLine("Código Único:");
        final String designacaoEquipa = Console.readLine("\nDesignação:");
        final String objetivoDistintoEquipa = Console.readLine("\nObjetivo distinto:");
        final String acronimo = Console.readLine("\nAcrónimo:");

        theController.getTiposEquipa();

        final String codigoInternoUnicoTipoEquipa = Console.readLine("\nCódigo tipo de equipa:");

        final int decisaoColab = Console.readInteger("\nAdicionar colaborador?\n1-Sim|0-Nao");
        if (decisaoColab == 1) {

            int nrTotal = theController.getColaboradores();

            if (nrTotal == 0) {
                System.out.println(StringColors.YELLOW + "\nNão há colaboradores no sistema.");
            } else {
                final int nrColab = Console.readInteger("\nQuantos colaboradores quer adicionar:");

                if (nrColab <= nrTotal && nrColab != 0) {
                    for (int i = 0; i < nrColab; i++) {
                        String numeroMecanografico = Console.readLine("\nNúmero mecanográfico:");
                        if (!colaboradores.contains(numeroMecanografico)) {
                            colaboradores.add(numeroMecanografico);
                        } else {
                            System.out.println(StringColors.YELLOW + "\nNúmero mecanográfico já adicionado." + StringColors.RESET);
                            i--;
                        }
                    }
                }
            }
        }

        this.theController.adicionarEquipa(codigoUnicoEquipa, designacaoEquipa, objetivoDistintoEquipa,
                acronimo, codigoInternoUnicoTipoEquipa, colaboradores);

        System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                "Equipa criada com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
        return false;
    }

    @Override
    public String headline() {
        return "CriarEquipaUI";
    }
}
