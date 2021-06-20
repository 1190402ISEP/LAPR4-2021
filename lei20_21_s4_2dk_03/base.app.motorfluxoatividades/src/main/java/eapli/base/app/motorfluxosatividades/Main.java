package eapli.base.app.motorfluxosatividades;

import eapli.base.app.motorfluxosatividades.servidores.MotorFluxosDeAtividadesTCPServer;
import eapli.base.app.motorfluxosatividades.utils.Constantes;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BasePasswordPolicy;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.PlainTextEncoder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        MotorFluxosDeAtividadesTCPServer motorDeFluxosAtividades = new MotorFluxosDeAtividadesTCPServer(Constantes.PORTO_SERVIDORES);

        LOGGER.info("A configurar o servidor!\n\n");

        AuthzRegistry.configure(PersistenceContext.repositories().users(), new BasePasswordPolicy(),
                new PlainTextEncoder());

        LOGGER.info("A iniciar o servidor Motor de Fluxos de Atividades!\n\n");

        motorDeFluxosAtividades.start();

        try {
            motorDeFluxosAtividades.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LOGGER.info("A Sair...\n\n");
        System.exit(0);
    }
}
