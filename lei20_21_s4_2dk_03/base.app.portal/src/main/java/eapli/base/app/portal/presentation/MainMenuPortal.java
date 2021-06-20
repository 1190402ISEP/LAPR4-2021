package eapli.base.app.portal.presentation;

import eapli.base.Application;
import eapli.base.app.common.console.presentation.authz.MyUserMenu;
import eapli.base.app.portal.presentation.atividade.ConsultarAtividadeAction;
import eapli.base.app.portal.presentation.atividade.ReivindicarTarefasPendentesAction;
import eapli.base.app.portal.presentation.consultar.ConsultarAction;
import eapli.base.app.portal.presentation.efetuarPedido.ConsultarPedidosAction;
import eapli.base.app.portal.presentation.efetuarPedido.EfetuarPedidoAction;
import eapli.base.app.portal.presentation.insertFeedback.InserirFeedbackAction;
import eapli.base.app.portal.presentation.webdashboard.WebDashboardAction;
import eapli.base.app.portal.presentation.webdashboard.WebDashboardUI;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.ExitWithMessageAction;
import eapli.framework.presentation.console.menu.HorizontalMenuRenderer;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

public class MainMenuPortal extends AbstractUI {

    private static final String RETURN_LABEL = "Return ";

    private static final int EXIT_OPTION = 0;

    // CONSULTAR
    private static final int CONSULTAR_VARIOUS_OPTION = 1;
    private static final int CONSULTAR_ATIV_VARIOUS_OPTION = 2;
    private static final int CONSULTAR_ATIV_PEND_REINVIN_OPTION = 3;
    private static final int CONSULTAR_PEDIDOS_HISTORICO_OPTION = 4;

    // WEB DASHBOARD
    private static final int WEBDASH_OPTION = 1;

    // SOLICITAR SERVIÇO
    private static final int SOLICITAR_OPTION = 1;

    // FEEDBACK
    private static final int FEEDBACK_OPTION = 1;

    // MAIN MENU
    private static final int MY_USER_OPTION = 1;
    private static final int CONSULTAR_OPTION = 2;
    private static final int WEBDASHBOARD_OPTION = 3;
    private static final int SOLICITAR_SERVICO_OPTION = 4;
    private static final int INSERIR_FEEDBACK_OPTION = 5;

    private boolean checkOpen = true;
    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    @Override
    public boolean show() {
        drawFormTitle();
        return doShow();
    }

    /**
     * @return true if the user selected the exit option
     */
    @Override
    public boolean doShow() {
        final Menu menu = buildMainMenu();
        final MenuRenderer renderer;
        if (Application.settings().isMenuLayoutHorizontal()) {
            renderer = new HorizontalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        } else {
            renderer = new VerticalMenuRenderer(menu, MenuItemRenderer.DEFAULT);
        }
        return renderer.render();
    }

    @Override
    public String headline() {
        return authz.session().map(s -> "Base [ @" + s.authenticatedUser().identity() + " ]")
                .orElse("Base [ ==Anonymous== ]");
    }

    private Menu buildMainMenu() {
        final Menu mainMenu = new Menu();

        if (!authz.isAuthenticatedUserAuthorizedTo(BaseRoles.CLIENT_USER)) {
            System.out.println("Entrou na aplicação errada!");
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.CLIENT_USER)) {
            if (checkOpen) {
                new WebDashboardUI().show();
                checkOpen = false;
            }
            final Menu myUserMenu = new MyUserMenu();
            mainMenu.addSubMenu(MY_USER_OPTION, myUserMenu);
            final Menu consultarMenu = buildConsultarMenu();
            mainMenu.addSubMenu(CONSULTAR_OPTION, consultarMenu);
            final Menu webDashMenu = buildDashboardMenu();
            mainMenu.addSubMenu(WEBDASHBOARD_OPTION, webDashMenu);
            final Menu solicitarServico = buildSolicitarServico();
            mainMenu.addSubMenu(SOLICITAR_SERVICO_OPTION, solicitarServico);
            final Menu inserirFeedback = buildInserirFeedback();
            mainMenu.addSubMenu(INSERIR_FEEDBACK_OPTION, inserirFeedback);
        }
        mainMenu.addItem(EXIT_OPTION, "Exit", new ExitWithMessageAction("Bye, Bye"));
        return mainMenu;
    }

    private Menu buildConsultarMenu() {
        final Menu menu = new Menu("Consultar >");

        menu.addItem(CONSULTAR_VARIOUS_OPTION, "Consultar Catálogos", new ConsultarAction());
        menu.addItem(CONSULTAR_ATIV_VARIOUS_OPTION, "Consultar Atividades", new ConsultarAtividadeAction());
        menu.addItem(CONSULTAR_ATIV_PEND_REINVIN_OPTION, "Consultar Atividades Pendentes e Reivindicar", new ReivindicarTarefasPendentesAction());
        menu.addItem(CONSULTAR_PEDIDOS_HISTORICO_OPTION, "Consultar Pedidos e Histórico", new ConsultarPedidosAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildDashboardMenu() {
        final Menu menu = new Menu("Dashboard >");

        menu.addItem(WEBDASH_OPTION, "Ver Web Dashboard", new WebDashboardAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildSolicitarServico() {
        final Menu menu = new Menu("Solicitar Serviço >");

        menu.addItem(SOLICITAR_OPTION, "Solicitar", new EfetuarPedidoAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildInserirFeedback() {
        final Menu menu = new Menu("Inserir Feedback >");

        menu.addItem(FEEDBACK_OPTION, "Inserir", new InserirFeedbackAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }
}
