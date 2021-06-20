package eapli.base.app.servicoserecursoshumanos;

import eapli.base.app.common.console.BaseApplication;
import eapli.base.app.common.console.presentation.authz.LoginUI;
import eapli.base.app.servicoserecursoshumanos.presentation.MainMenuServicosRH;
import eapli.base.clientusermanagement.application.eventhandlers.NewUserRegisteredFromSignupWatchDog;
import eapli.base.clientusermanagement.domain.events.NewUserRegisteredFromSignupEvent;
import eapli.base.clientusermanagement.domain.events.SignupAcceptedEvent;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.application.eventhandlers.SignupAcceptedWatchDog;
import eapli.base.usermanagement.domain.BasePasswordPolicy;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.PlainTextEncoder;
import eapli.framework.infrastructure.eventpubsub.EventDispatcher;

public final class ServicosRecursosHumanos extends BaseApplication {

    /**
     * avoid instantiation of this class.
     */
    private ServicosRecursosHumanos() {
    }

    /**
     * Main.
     *
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        AuthzRegistry.configure(PersistenceContext.repositories().users(),
                new BasePasswordPolicy(), new PlainTextEncoder());

        new ServicosRecursosHumanos().run(args);
    }

    @Override
    protected void doMain(final String[] args) {
        if (new LoginUI().show()) {
            final MainMenuServicosRH menu = new MainMenuServicosRH();
            menu.mainLoop();
        }
    }

    @Override
    protected String appTitle() {
        return "Serviços e Recursos Humanos";
    }

    @Override
    protected String appGoodbye() {
        return "Serviços e Recursos Humanos";
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void doSetupEventHandlers(final EventDispatcher dispatcher) {
        dispatcher.subscribe(new NewUserRegisteredFromSignupWatchDog(),
                NewUserRegisteredFromSignupEvent.class);
        dispatcher.subscribe(new SignupAcceptedWatchDog(), SignupAcceptedEvent.class);
    }
}