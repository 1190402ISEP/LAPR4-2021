package eapli.base.app.servidor;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BasePasswordPolicy;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.PlainTextEncoder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.Constantes;

import java.io.IOException;

/**
 * The type Main.
 */
public class Main implements Constantes {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) throws IOException {
        LOGGER.info("A configurar o servidor!\n\n");

        AuthzRegistry.configure(PersistenceContext.repositories().users(), new BasePasswordPolicy(),
                new PlainTextEncoder());

        LOGGER.info("A iniciar o servidor socket\n\n");
        //final MotorFluxoServerSRH motorFluxoServerSRH = new MotorFluxoServerSRH();

        //porto fica na invocacao do motor de fluxos, já que este como servidor apenas aceita pedidos no seu porto
        // motorFluxoServerSRH.start();



        LOGGER.info("A Sair...\n\n");
        System.exit(0);

    }
}
