package eapli.base.app.servicoserecursoshumanos.presentation.nivelcriticidade;

import eapli.base.nivelCriticidade.application.CriarNivelCriticidadeController;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

/**
 * The type Criar nivel criticidade ui.
 */
public class CriarNivelCriticidadeUI extends AbstractUI {
    private final CriarNivelCriticidadeController theController = new CriarNivelCriticidadeController();

    @Override
    protected boolean doShow() {
        final String etiqueta = Console.readLine("Etiqueta:");
        final String objetivoDistinto = Console.readLine("\nObjetivo distinto:");
        final String cor = Console.readLine("\nCor (r,g,b):");
        final String designacaoNivel = Console.readLine("\nDesignação:");
        final int valorEscala = Console.readInteger("\nValor na escala:");

        this.theController.adicionarNivel(etiqueta, cor, valorEscala, objetivoDistinto, designacaoNivel);

        System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                "Nível de criticidade criado com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
        return false;
    }

    @Override
    public String headline() {
        return "CriarNivelCriticidadeUI";
    }
}
