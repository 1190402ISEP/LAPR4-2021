package eapli.base.app.servicoserecursoshumanos.presentation;

import eapli.base.Application;
import eapli.base.app.common.console.presentation.authz.MyUserMenu;
import eapli.base.app.servicoserecursoshumanos.motorFluxoDashboard.MotorFluxoDashboardAction;
import eapli.base.app.servicoserecursoshumanos.presentation.addServicoCatalogo.AddServicoCatalogoAction;
import eapli.base.app.servicoserecursoshumanos.presentation.authz.AddUserAction;
import eapli.base.app.servicoserecursoshumanos.presentation.authz.AddUserUI;
import eapli.base.app.servicoserecursoshumanos.presentation.authz.DeactivateUserAction;
import eapli.base.app.servicoserecursoshumanos.presentation.authz.ListUsersAction;
import eapli.base.app.servicoserecursoshumanos.presentation.clientuser.AcceptRefuseSignupRequestAction;
import eapli.base.app.servicoserecursoshumanos.presentation.colaborador.AddRemColaboradorAction;
import eapli.base.app.servicoserecursoshumanos.presentation.equipa.CriarEquipaAction;
import eapli.base.app.servicoserecursoshumanos.presentation.listarCumprimento.ListarCumprimentoAction;
import eapli.base.app.servicoserecursoshumanos.presentation.nivelCatalago.AplicarNivelAction;
import eapli.base.app.servicoserecursoshumanos.presentation.nivelcriticidade.CriarNivelCriticidadeAction;
import eapli.base.app.servicoserecursoshumanos.presentation.servico.CriarCatalogoAction;
import eapli.base.app.servicoserecursoshumanos.presentation.servico.EspecificarServicoAction;
import eapli.base.app.servicoserecursoshumanos.presentation.tipoequipa.CriarTipoEquipaAction;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.actions.Actions;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.ExitWithMessageAction;
import eapli.framework.presentation.console.menu.HorizontalMenuRenderer;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

public class MainMenuServicosRH extends AbstractUI {
    private static final String RETURN_LABEL = "Return ";

    private static final int EXIT_OPTION = 0;

    // USERS
    private static final int ADD_USER_OPTION = 1;
    private static final int LIST_USERS_OPTION = 2;
    private static final int DEACTIVATE_USER_OPTION = 3;
    private static final int ACCEPT_REFUSE_SIGNUP_REQUEST_OPTION = 4;

    // TIPOEQUIPA
    private static final int NEW_EQUIPA_OPTION = 1;
    private static final int NEW_TIPO_EQUIPA_OPTION = 2;

    // COLABORADOR
    private static final int NEW_COLABORADOR_OPTION = 1;
    private static final int ADD_REM_COLABORADOR_OPTION = 2;

    // SERVICO
    private static final int NEW_SERVICO_OPTION = 1;
    private static final int NEW_CATALOGO_OPTION = 2;
    private static final int ADD_SERVICO_CATALOGO_OPTION = 3;

    // NIVELCRITICIDADE
    private static final int NEW_NIVEL_CRITICIDADE_OPTION = 1;
    private static final int ADD_NIVEL_CRITICIDADE_OPTION = 2;

    // LISTAR
    private static final int LISTAR_OPTION = 1;

    // WEB DASHBOARD
    private static final int WEBDASH_MF_ESTADO = 1;

    // MAIN MENU
    private static final int MY_USER_OPTION = 1;
    private static final int USERS_OPTION = 2;
    private static final int COLABORADOR_OPTION = 3;
    private static final int EQUIPA_OPTION = 4;
    private static final int CATALOGO_SERVICO_OPTION = 5;
    private static final int NIVEIS_CRITICIDADE_OPTION = 6;
    private static final int LISTAR_CUMPRIMENTO_OPTION = 7;
    private static final int WEBDASHBOARD_OPTION = 8;

    private static final String SEPARATOR_LABEL = "--------------";

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

        final Menu myUserMenu = new MyUserMenu();
        mainMenu.addSubMenu(MY_USER_OPTION, myUserMenu);

        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.ADMIN)) {
            final Menu usersMenu = buildUsersMenu();
            mainMenu.addSubMenu(USERS_OPTION, usersMenu);
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.RESPONSAVEL_RECURSOS_HUMANOS)) {
            final Menu colaboradorMenu = buildColaboradorMenu();
            mainMenu.addSubMenu(COLABORADOR_OPTION, colaboradorMenu);
            final Menu tipoEquipaMenu = buildTipoEquipaMenu();
            mainMenu.addSubMenu(EQUIPA_OPTION, tipoEquipaMenu);
        }

        if (authz.isAuthenticatedUserAuthorizedTo(BaseRoles.POWER_USER, BaseRoles.GESTOR_SERVICOS_HELPDESK)) {
            final Menu servicoMenu = buildServicoMenu();
            mainMenu.addSubMenu(CATALOGO_SERVICO_OPTION, servicoMenu);
            final Menu niveisCriticidadeMenu = buildNiveisCriticidadeMenu();
            mainMenu.addSubMenu(NIVEIS_CRITICIDADE_OPTION, niveisCriticidadeMenu);
            final Menu listarCumprimentoMenu = buildListarCumprimentoMenu();
            mainMenu.addSubMenu(LISTAR_CUMPRIMENTO_OPTION, listarCumprimentoMenu);
            final Menu buildDashboardMenu = buildDashboardMenu();
            mainMenu.addSubMenu(WEBDASHBOARD_OPTION, buildDashboardMenu);
        }

        if (!Application.settings().isMenuLayoutHorizontal()) {
            mainMenu.addItem(MenuItem.separator(SEPARATOR_LABEL));
        }

        mainMenu.addItem(EXIT_OPTION, "Exit", new ExitWithMessageAction("Bye, Bye"));

        return mainMenu;
    }

    private Menu buildUsersMenu() {
        final Menu menu = new Menu("Users >");

        menu.addItem(ADD_USER_OPTION, "Add User", new AddUserUI()::show);
        menu.addItem(LIST_USERS_OPTION, "List all Users", new ListUsersAction());
        menu.addItem(DEACTIVATE_USER_OPTION, "Deactivate User", new DeactivateUserAction());
        menu.addItem(ACCEPT_REFUSE_SIGNUP_REQUEST_OPTION, "Accept/Refuse Signup Request",
                new AcceptRefuseSignupRequestAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildTipoEquipaMenu() {
        final Menu menu = new Menu("Equipa >");

        menu.addItem(NEW_EQUIPA_OPTION, "Adicionar Equipa", new CriarEquipaAction());
        menu.addItem(NEW_TIPO_EQUIPA_OPTION, "Adicionar Tipo Equipa", new CriarTipoEquipaAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildColaboradorMenu() {
        final Menu menu = new Menu("Colaborador >");

        menu.addItem(NEW_COLABORADOR_OPTION, "Adicionar Colaborador", new AddUserAction());
        menu.addItem(ADD_REM_COLABORADOR_OPTION, "Adicionar/Remover Colaborador a uma Equipa", new AddRemColaboradorAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildServicoMenu() {
        final Menu menu = new Menu("Serviço >");

        menu.addItem(NEW_SERVICO_OPTION, "Adicionar Serviço", new EspecificarServicoAction());
        menu.addItem(NEW_CATALOGO_OPTION, "Adicionar Catálogo", new CriarCatalogoAction());
        menu.addItem(ADD_SERVICO_CATALOGO_OPTION, "Adicionar serviço a um catálogo", new AddServicoCatalogoAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildNiveisCriticidadeMenu() {
        final Menu menu = new Menu("Nível Criticidade >");

        menu.addItem(NEW_NIVEL_CRITICIDADE_OPTION, "Adicionar Nível Criticidade", new CriarNivelCriticidadeAction());
        menu.addItem(ADD_NIVEL_CRITICIDADE_OPTION, "Adicionar Nível Criticidade a um Catálogo", new AplicarNivelAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildListarCumprimentoMenu() {
        final Menu menu = new Menu("Listar Cumprimento >");

        menu.addItem(LISTAR_OPTION, "Listar", new ListarCumprimentoAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }

    private Menu buildDashboardMenu() {
        final Menu menu = new Menu("Dashboard >");

        menu.addItem(WEBDASH_MF_ESTADO, "Ver Motor Fluxo Dashboard", new MotorFluxoDashboardAction());
        menu.addItem(EXIT_OPTION, RETURN_LABEL, Actions.SUCCESS);

        return menu;
    }
}
