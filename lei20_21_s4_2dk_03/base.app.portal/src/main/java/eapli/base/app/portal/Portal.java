package eapli.base.app.portal;

import eapli.base.app.common.console.BaseApplication;
import eapli.base.app.common.console.presentation.authz.LoginUI;
import eapli.base.app.portal.presentation.MainMenuPortal;
import eapli.base.clientusermanagement.application.eventhandlers.NewUserRegisteredFromSignupWatchDog;
import eapli.base.clientusermanagement.domain.events.NewUserRegisteredFromSignupEvent;
import eapli.base.clientusermanagement.domain.events.SignupAcceptedEvent;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.application.eventhandlers.SignupAcceptedWatchDog;
import eapli.base.usermanagement.domain.BasePasswordPolicy;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.PlainTextEncoder;
import eapli.framework.infrastructure.eventpubsub.EventDispatcher;

public class Portal extends BaseApplication {

    /**
     * avoid instantiation of this class.
     */
    private Portal() {
    }

    /**
     * Main.
     *
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        AuthzRegistry.configure(PersistenceContext.repositories().users(),
                new BasePasswordPolicy(), new PlainTextEncoder());

        new Portal().run(args);
    }

    @Override
    protected void doMain(final String[] args) {
        if (new LoginUI().show()) {
            final MainMenuPortal menu = new MainMenuPortal();
            menu.mainLoop();
        }
    }

    @Override
    protected String appTitle() {
        return "Portal";
    }

    @Override
    protected String appGoodbye() {
        return "Portal";
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void doSetupEventHandlers(final EventDispatcher dispatcher) {
        dispatcher.subscribe(new NewUserRegisteredFromSignupWatchDog(),
                NewUserRegisteredFromSignupEvent.class);
        dispatcher.subscribe(new SignupAcceptedWatchDog(), SignupAcceptedEvent.class);
    }
}
