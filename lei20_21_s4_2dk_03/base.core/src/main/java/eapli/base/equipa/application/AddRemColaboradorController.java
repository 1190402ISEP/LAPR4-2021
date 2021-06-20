package eapli.base.equipa.application;

import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.equipa.domain.CodigoUnicoEquipa;
import eapli.base.equipa.domain.Equipa;
import eapli.base.equipa.repositories.EquipaRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.List;

/**
 * The type Add rem colaborador controller.
 */
public class AddRemColaboradorController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final EquipaRepository eqRepository = PersistenceContext.repositories().equipa();
    private final ColaboradorRepository colRepository = PersistenceContext.repositories().colaboradores();
    private Equipa equipa;
    private Colaborador colab;

    /**
     * Add.
     *
     * @return the boolean
     */
    public boolean add() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.RESPONSAVEL_RECURSOS_HUMANOS);
        try {
            if (equipa.addColaboradores(colab)) {
                colab.associarEquipa(equipa);
                eqRepository.save(equipa);
                colRepository.save(colab);
                return true;
            }
            return false;
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException("Colaborador já se encontra na equipa.");
        }
    }

    /**
     * Remove.
     *
     * @return the boolean
     */
    public boolean rem() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.RESPONSAVEL_RECURSOS_HUMANOS);
        if (equipa.removeColaboradores(colab)) {
            colab.removerEquipa(equipa);
            eqRepository.save(equipa);
            colRepository.save(colab);
            return true;
        }
        return false;
    }

    /**
     * Show equipas.
     */
    public void showEquipas() {
        Iterable<Equipa> equipas = eqRepository.findAll();
        if (equipas.iterator().hasNext()) {
            System.out.print("\n");
            for (Equipa eq : equipas) {
                System.out.println(eq);
            }
            System.out.print("\n");
        } else {
            throw new IllegalStateException("Não existem equipas.");
        }
    }

    /**
     * Associar equipa.
     *
     * @param codigoUnicoEquipa the codigo unico equipa
     */
    public void associarEquipa(String codigoUnicoEquipa) {
        if (eqRepository.containsOfIdentity(new CodigoUnicoEquipa(codigoUnicoEquipa))) {
            equipa = eqRepository.ofIdentity(new CodigoUnicoEquipa(codigoUnicoEquipa)).get();
        } else {
            throw new IllegalStateException("Não existe equipa com código: " + codigoUnicoEquipa);
        }
    }

    /**
     * Show colaboradores.
     */
    public void showColaboradores() {
        Iterable<Colaborador> colaboradores = colRepository.findAll();
        if (colaboradores.iterator().hasNext()) {
            System.out.print("\n");
            for (Colaborador col : colaboradores) {
                System.out.println(col);
            }
            System.out.print("\n");
        } else {
            throw new IllegalStateException("Não existem colaboradores.");
        }
    }

    /**
     * Associar colaborador.
     *
     * @param mecanographicNumber the mecanographic number
     */
    public void associarColaborador(String mecanographicNumber) {
        if (colRepository.containsOfIdentity(new MecanographicNumber(mecanographicNumber))) {
            colab = colRepository.ofIdentity(new MecanographicNumber(mecanographicNumber)).get();
        } else {
            throw new IllegalStateException("Não existe colaborador com número mecanográfico: " + mecanographicNumber);
        }
    }

    /**
     * Show colaboradores da equipa.
     */
    public void showColaboradoresDaEquipa() {
        List<Colaborador> colaboradores = equipa.getColaboradores();
        if (!colaboradores.isEmpty()) {
            System.out.print("\n");
            for (Colaborador col : colaboradores) {
                System.out.println(col);
            }
            System.out.print("\n");
        } else {
            throw new IllegalStateException("Não existem colaboradores na equipa.");
        }
    }

    /**
     * Associar colaborador equipa.
     *
     * @param mecanographicNumber the mecanographic number
     */
    public void associarColaboradorEquipa(String mecanographicNumber) {
        if (colRepository.containsOfIdentity(new MecanographicNumber(mecanographicNumber))) {
            Colaborador colabAux = colRepository.ofIdentity(new MecanographicNumber(mecanographicNumber)).get();
            colab = colabAux;
        } else {
            throw new IllegalStateException("Não existe colaborador com número mecanográfico: " + mecanographicNumber);
        }
    }
}
