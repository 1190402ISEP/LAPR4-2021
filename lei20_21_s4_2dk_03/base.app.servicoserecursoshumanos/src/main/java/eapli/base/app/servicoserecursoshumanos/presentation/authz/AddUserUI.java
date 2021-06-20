/*
 * Copyright (c) 2013-2019 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package eapli.base.app.servicoserecursoshumanos.presentation.authz;

import eapli.base.usermanagement.application.AddUserController;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.actions.menu.Menu;
import eapli.framework.actions.menu.MenuItem;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.infrastructure.authz.domain.model.Role;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

import java.util.HashSet;
import java.util.Set;

/**
 * The type Add user ui.
 */
public class AddUserUI extends AbstractUI {

    private final AddUserController theController = new AddUserController();

    @Override
    protected boolean doShow() {
        int decisaoCSVOuManual = Console.readInteger("Como pretende inserir os dados?\n1-Manualmente 2-Ficheiro");

        if (decisaoCSVOuManual == 1) {
            final String username = Console.readLine("\nUsername:");
            final String firstName = Console.readLine("\nPrimeiro nome:");
            final String lastName = Console.readLine("\nÚltimo nome:");
            final String email = Console.readLine("\nE-Mail:");
            SystemUser utilizador;

            System.out.println();
            final Set<Role> roleTypes = new HashSet<>();
            boolean show;
            do {
                show = showRoles(roleTypes);
            } while (!show);

            int decisaoFuncao = Console.readInteger("\nDeseja inserir função?\n1-Sim|0-Nao");

            if (decisaoFuncao == 1) {
                if (this.theController.showListOfFunctions()) {
                    String funID = Console.readLine("\nInsira o código da função correspondente:");
                    this.theController.associarFuncao(funID);
                }
            }

            int decisaoEquipa = Console.readInteger("\nDeseja associar equipa(s)?\n1-Sim|0-Nao");
            if (decisaoEquipa == 1) {
                int nEquipas = this.theController.printAmountEquipa();
                if (nEquipas != 0) {
                    int qtdEquipas = Console.readInteger("\nA quantas equipas deseja associar o colaborador?");
                    if (qtdEquipas <= nEquipas && qtdEquipas > 0) {
                        this.theController.showListOfEquipas();
                        while (qtdEquipas > 0) {
                            String equipaID = Console.readLine("\nInsira o código único da equipa da equipa:");
                            this.theController.associarEquipa(equipaID);
                            qtdEquipas--;
                        }
                    } else {
                        System.out.println(StringColors.YELLOW + "\nSó pode adicionar a " + nEquipas + " equipas." + StringColors.RESET);
                    }
                } else {
                    System.out.println(StringColors.YELLOW + "\nNão existem equipas." + StringColors.RESET);
                }
            }

            int decisaoResponsavelHierarquico = Console.readInteger("\nDeseja associar responsável?\n1-Sim|0-Nao");
            if (decisaoResponsavelHierarquico == 1) {
                if (this.theController.showListOfColaborators()) {
                    String mecanographicNumber = Console.readLine("\nInsira o número mecanográfico:");
                    this.theController.associarResponsavelHierarquico(mecanographicNumber);
                }
            }

            String mecanographicnumber = Console.readLine("\nInsira o número mecanográfico do novo colaborador:");
            String nomeCurto = firstName + " " + lastName;
            String nomeCompleto = Console.readLine("\nInsira o nome completo:");

            int contacto = Console.readInteger("\nInsira o contacto do colaborador:");
            int ano = Console.readInteger("\nInsira o ano de nascimento:");
            int mes = Console.readInteger("\nInsira o mes de nascimento:");
            int dia = Console.readInteger("\nInsira o dia de nascimento:");

            String distrito = Console.readLine("\nInsira o distrito:");
            String concelho = Console.readLine("\nInsira o concelho:");

            System.out.println();

            if (this.theController.confirmMecanographicNumber(mecanographicnumber)) {
                try {
                    utilizador = this.theController.addUser(username, firstName, lastName, email, roleTypes);
                } catch (final IntegrityViolationException | ConcurrencyException e) {
                    throw new IllegalArgumentException("User com username: " + username + " já existente.");
                }
                try {
                    this.theController.adicionarColaborador(utilizador, nomeCurto, nomeCompleto,
                            ano, mes, dia, mecanographicnumber, distrito, concelho, email, contacto);
                } catch (final IntegrityViolationException | ConcurrencyException e) {
                    throw new IllegalArgumentException("Não foi possível adicionar o Colaborador!");
                }
            }

        } else if (decisaoCSVOuManual == 2) {
            boolean sucess = theController.importarColaboradores();
            if (!sucess) {
                return false;
            }
        } else {
            throw new IllegalArgumentException("Não reconhecido!\n\n");
        }

        System.out.print(StringColors.GREEN + "\n\n--------------------------SUCCESS--------------------------\n" +
                "Colaborador criado com sucesso.\n--------------------------SUCCESS--------------------------\n\n" + StringColors.RESET);
        return false;
    }

    private boolean showRoles(final Set<Role> roleTypes) {
        final Menu rolesMenu = buildRolesMenu(roleTypes);
        final MenuRenderer renderer = new VerticalMenuRenderer(rolesMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu buildRolesMenu(final Set<Role> roleTypes) {
        final Menu rolesMenu = new Menu();
        int counter = 0;
        for (final Role roleType : theController.getRoleTypes()) {
            rolesMenu.addItem(MenuItem.of(counter++, roleType.toString(), () -> roleTypes.add(roleType)));
        }
        return rolesMenu;
    }

    @Override
    public String headline() {
        return "Add User";
    }
}
