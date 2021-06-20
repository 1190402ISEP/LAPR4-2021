package eapli.base.usermanagement.application;

import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.domain.ColaboradorBuilder;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.equipa.domain.CodigoUnicoEquipa;
import eapli.base.equipa.domain.Equipa;
import eapli.base.equipa.repositories.EquipaRepository;
import eapli.base.funcao.domain.Funcao;
import eapli.base.funcao.domain.IdentificadorFuncao;
import eapli.base.funcao.repositories.FuncaoRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.base.utils.PasswordGenerator;
import eapli.base.utils.email.EnvioEmail;
import eapli.base.utils.file.CsvImporterImpl;
import eapli.base.utils.file.FileImporterInterface;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.application.UserManagementService;
import eapli.framework.infrastructure.authz.domain.model.Role;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.io.util.Console;
import eapli.framework.time.util.Calendars;

import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The type Add user controller.
 */
@UseCaseController
public class AddUserController {
    private final PasswordGenerator gerarPassword = new PasswordGenerator();
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final UserManagementService userSvc = AuthzRegistry.userService();
    private ColaboradorBuilder colab = new ColaboradorBuilder();
    private FuncaoRepository fnRep = PersistenceContext.repositories().funcoes();
    private EquipaRepository eqRep = PersistenceContext.repositories().equipa();
    private final ColaboradorRepository cRep = PersistenceContext.repositories().colaboradores();

    /**
     * Get existing RoleTypes available to the user.
     *
     * @return a list of RoleTypes
     */
    public Role[] getRoleTypes() {
        return BaseRoles.nonUserValues();
    }

    /**
     * Add user system user.
     *
     * @param username  the username
     * @param pwd       the pwd
     * @param firstName the first name
     * @param lastName  the last name
     * @param email     the email
     * @param roles     the roles
     * @param createdOn the created on
     * @return the system user
     */
    public SystemUser addUser(String username, String pwd, String firstName, String lastName,
                              String email, Set<Role> roles, Calendar createdOn) {

        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN,
                BaseRoles.RESPONSAVEL_RECURSOS_HUMANOS);
        //Enviar Mail
        SystemUser sys = userSvc.registerNewUser(username, pwd, firstName, lastName, email, roles, createdOn);
        EnvioEmail.enviarMail(String.format("Bem-Vindo(a) %s %s", firstName, lastName),
                String.format("Para aceder à aplicação utilize os seguintes dados:\nUserName: %s\nPassword de acesso: %s",
                        username, pwd), email);
        return sys;
    }

    /**
     * Add user system user.
     *
     * @param username  the username
     * @param firstName the first name
     * @param lastName  the last name
     * @param email     the email
     * @param roles     the roles
     * @return the system user
     */
    public SystemUser addUser(String username, String firstName, String lastName,
                              String email, Set<Role> roles) {
        gerarPassword.generatePassword();
        return addUser(username, gerarPassword.generatePassword(), firstName, lastName, email, roles, Calendars.now());
    }

    /**
     * Show list of functions.
     *
     * @return the boolean
     */
    public boolean showListOfFunctions() {
        fnRep = PersistenceContext.repositories().funcoes();
        Iterable<Funcao> funcoes = fnRep.findAll();
        if (funcoes.iterator().hasNext()) {
            for (Funcao f : funcoes) {
                System.out.println(f);
            }
            return true;
        } else {
            System.out.println("\n\n" + StringColors.YELLOW + "Não existem funções." + StringColors.RESET + "\n\n");
            return false;
        }
    }

    /**
     * Associar funcao.
     *
     * @param funID the fun id
     */
    public void associarFuncao(String funID) {
        if (fnRep.containsOfIdentity(new IdentificadorFuncao(funID))) {
            colab.withFuncaoColaborador(fnRep.ofIdentity(new IdentificadorFuncao(funID)).get());
        } else {
            throw new IllegalStateException("Não existe função com identificador: " + funID);
        }
    }

    /**
     * Show list of equipas.
     */
    public void showListOfEquipas() {
        eqRep = PersistenceContext.repositories().equipa();
        Iterable<Equipa> equipas = eqRep.findAll();
        for (Equipa e : equipas) {
            System.out.println(e);
        }
    }

    /**
     * Associar equipa.
     *
     * @param equipaID the equipa id
     */
    public void associarEquipa(String equipaID) {
        if (eqRep.containsOfIdentity(new CodigoUnicoEquipa(equipaID))) {
            colab.associarEquipa(eqRep.ofIdentity(new CodigoUnicoEquipa(equipaID)).get());
        } else {
            throw new IllegalStateException("Não existe equipa com código único: " + equipaID);
        }
    }

    /**
     * Show list of colaborators.
     *
     * @return the boolean
     */
    public boolean showListOfColaborators() {
        Iterable<Colaborador> colaboradores = cRep.findAll();
        if (colaboradores != null) {
            for (Colaborador c : colaboradores) {
                System.out.println(c);
            }
            return true;
        }
        System.out.println("Não existem colaboradores.");
        return false;
    }

    /**
     * Associar responsavel hierarquico.
     *
     * @param mecanographicNumber the mecanographic number
     */
    public void associarResponsavelHierarquico(String mecanographicNumber) {
        if (cRep.containsOfIdentity(new MecanographicNumber(mecanographicNumber))) {
            colab.withResponsavelHierarquicoColaborador(cRep.ofIdentity(new MecanographicNumber(mecanographicNumber)).get());
        } else {
            throw new IllegalStateException("Não existe colaborador com número mecanográfico: " + mecanographicNumber);
        }
    }

    /**
     * Adicionar colaborador.
     *
     * @param user                the user
     * @param nomeCurto           the nome curto
     * @param nomeCompleto        the nome completo
     * @param ano                 the ano
     * @param mes                 the mes
     * @param dia                 the dia
     * @param mecanographicnumber the mecanographicnumber
     * @param distrito            the distrito
     * @param concelho            the concelho
     * @param email               the email
     * @param contacto            the contacto
     */
    public void adicionarColaborador(SystemUser user, String nomeCurto, String nomeCompleto,
                                     int ano, int mes, int dia, String mecanographicnumber,
                                     String distrito, String concelho, String email, int contacto) {
        Colaborador temp;
        colab.withNomeCurto(nomeCurto);
        colab.withNomeCompleto(nomeCompleto);
        colab.withDataNascimento(ano, mes, dia);
        colab.withMecanographicNumber(mecanographicnumber);
        colab.withLocalResidenciaColaborador(distrito, concelho);
        colab.withEmailColaborador(email);
        colab.withSystemUser(user);
        colab.withContactoColaborador(contacto);
        if (!cRep.containsOfIdentity(new MecanographicNumber(mecanographicnumber))) {
            temp = colab.build();
            cRep.save(temp);
            EquipaRepository rep = PersistenceContext.repositories().equipa();

            for (Equipa pos : temp.getEquipas()) {
                if (rep.containsOfIdentity(pos.identity())) {
                    Equipa nova = rep.ofIdentity(pos.identity()).get();
                    if (cRep.containsOfIdentity(temp.identity())) {
                        nova.addColaboradores(cRep.ofIdentity(temp.identity()).get());
                        rep.save(nova);
                    }

                }
            }

        } else {
            throw new IllegalStateException("Colaborador já existe com número mecanográfico: " + mecanographicnumber);
        }

    }

    /**
     * Importar colaboradores.
     *
     * @throws FileNotFoundException the file not found exception
     */
    public boolean importarColaboradores() {
        colab = new ColaboradorBuilder();
        String userName, firstName, lastName, email, mecanographicNumber, nomeCurto,
                nomeCompleto, distrito, concelho;
        SystemUser sys;

        int contacto, ano, mes, dia;
        String fileName = Console.readLine("\nInsira o nome do ficheiro:");

        FileImporterInterface fi = new CsvImporterImpl();
        List<List<String>> dados = null;
        try {
            dados = fi.readFile(fileName);
        } catch (FileNotFoundException e) {
            System.err.println("Ficheiro Não Encontrado! Tente novamente!");
            return false;
        }

        for (List<String> linha : dados) {
            userName = linha.get(0);
            firstName = linha.get(1);
            lastName = linha.get(2);
            nomeCurto = firstName + " " + lastName;
            email = linha.get(3);

            Set<Role> roles = new HashSet<>();
            roles.add(stringToRole(linha.get(4)));

            sys = addUser(userName, firstName, lastName, email, roles);
            colab.withSystemUser(sys);

            mecanographicNumber = linha.get(5);
            nomeCompleto = linha.get(6);
            contacto = Integer.parseInt(linha.get(7));
            ano = Integer.parseInt(linha.get(8));
            mes = Integer.parseInt(linha.get(9));
            dia = Integer.parseInt(linha.get(10));
            distrito = linha.get(11);
            concelho = linha.get(12);

            adicionarColaborador(sys, nomeCurto, nomeCompleto, ano, mes, dia, mecanographicNumber, distrito, concelho, email, contacto);
        }
        return true;
    }

    /**
     * String to role role.
     *
     * @param input the input
     * @return the role
     */
    public Role stringToRole(String input) {
        Role[] roles = getRoleTypes();
        for (Role pos : roles) {
            if (pos.toString().equalsIgnoreCase(input)) {
                return pos;
            }
        }
        throw new IllegalArgumentException("Não encontrado");
    }

    /**
     * Confirm mecanographic number boolean.
     *
     * @param mecanographicnumber the mecanographicnumber
     * @return the boolean
     */
    public boolean confirmMecanographicNumber(String mecanographicnumber) {
        if (!cRep.containsOfIdentity(new MecanographicNumber(mecanographicnumber))) {
            return true;
        } else {
            throw new IllegalArgumentException("Colaborador com número mecanográfico " + mecanographicnumber + " já existe.");
        }
    }

    /**
     * Print amount equipa int.
     *
     * @return the int
     */
    public int printAmountEquipa() {
        eqRep = PersistenceContext.repositories().equipa();
        Iterable<Equipa> equipas = eqRep.findAll();
        if (equipas == null) {
            return 0;
        } else {
            int number = 0;
            for (Equipa ignored : equipas) {
                number++;
            }

            System.out.println("\nExistem " + number + " equipas.");
            return number;
        }
    }
}
