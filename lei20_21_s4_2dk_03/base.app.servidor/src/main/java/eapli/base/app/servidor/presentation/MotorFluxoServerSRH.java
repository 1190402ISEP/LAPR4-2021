package eapli.base.app.servidor.presentation;

import eapli.base.app.servidor.application.MotorFluxoAtividadeController;
import eapli.base.app.servidor.servidores.MotorFluxoDeAtividadesTcpServerConn;
import utils.Constantes;

import java.net.Socket;

/**
 * The type Motor fluxo server srh.
 */
public class MotorFluxoServerSRH extends MotorFluxoDeAtividadesTcpServerConn implements Constantes {

    private final MotorFluxoAtividadeController theController = new MotorFluxoAtividadeController();

    public MotorFluxoServerSRH(Socket cli_s) {
        super(cli_s);
    }

    public void start() {

        //a aplicacao servidora verifica ligacoes ao porto dela
        run();

    }

    /*O motor de fluxos estabelece a ligação de servidor com os serviços e recursos humanos*/
    /* à aplicação servidora aceitar pedidos de ligação TCP no porto número 32507.*/
    /*Depois de estabelecida a ligação TCP cabe:*/
    /*à aplicação servidora enviar mensagens de resposta aos pedidos recebidos*/
}
