package eapli.base.app.portal.presentation.efetuarPedido;

import eapli.base.app.portal.client.PortalUtilizadoresTCPClient;
import eapli.base.pedido.application.EfetuarPedidoController;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.io.FileNotFoundException;

/**
 * The type Efetuar pedido ui.
 */
public class EfetuarPedidoUI extends AbstractUI {
    /**
     * The The controller.
     */
    EfetuarPedidoController theController = new EfetuarPedidoController();

    @Override
    protected boolean doShow() {
        theController.mostrarCatalogosDisponiveisParaColaborador();

        final String identificadorCatalogo = Console.readLine("Qual é o catálogo que quer selecionar?");
        theController.mostrarServicosCatalogo(identificadorCatalogo);

        final String codigoUnicoServico = Console.readLine("\nQual é o serviço que quer selecionar?");
        theController.iniciarPedido(codigoUnicoServico);

        theController.mostrarUrgencias();
        final String urgencia = Console.readLine("\nEscreva a urgência do pedido:");
        final String data = Console.readLine("\nEscreva a data limite de resolução:");
        theController.associarInformacoes(urgencia, data);

        int optionFiles = Console.readInteger("\nDeseja adicionar ficheiros?\n1-Sim|0-Nao");
        while (optionFiles == 1) {
            int numberFiles = Console.readInteger("\nQuantos ficheiros quer adicionar?");
            if (numberFiles > 0) {
                optionFiles = 0;
                for (int i = 0; i < numberFiles; i++) {
                    final String ficheiro = Console.readLine("\nEscreva o nome do ficheiro:");
                    theController.adicionarFicheiro(ficheiro);
                }
            } else {
                System.out.println(StringColors.YELLOW + "\nIntroduza pelo menos 1 ficheiro." + StringColors.RESET);
            }
        }
        long id = 0;
        //envio dos dados criados ao motor de fluxos para tratamento do pedido integrado no método
        try {
            id = theController.efetuarPedido();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        PortalUtilizadoresTCPClient portalUtilizadoresTCPClient = new PortalUtilizadoresTCPClient();
        portalUtilizadoresTCPClient.addPedido(id);

        portalUtilizadoresTCPClient.start();
        try {
            portalUtilizadoresTCPClient.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                "Pedido efetuado com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);

        return false;
    }

    @Override
    public String headline() {
        return "EfetuarPedidoUI";
    }
}
