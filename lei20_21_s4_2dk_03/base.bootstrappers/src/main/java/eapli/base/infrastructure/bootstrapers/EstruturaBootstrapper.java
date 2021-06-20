package eapli.base.infrastructure.bootstrapers;

import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.domain.ColaboradorBuilder;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.equipa.domain.Equipa;
import eapli.base.equipa.domain.EquipaBuilder;
import eapli.base.equipa.repositories.EquipaRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.tipoequipa.domain.TipoEquipa;
import eapli.base.tipoequipa.repositories.TipoEquipaRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.infrastructure.authz.domain.model.Role;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class EstruturaBootstrapper implements Action {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseBootstrapper.class);

    private final EquipaRepository eRepo = PersistenceContext.repositories().equipa();
    private final TipoEquipaRepository teRepo = PersistenceContext.repositories().tipoEquipas();
    private final ColaboradorRepository cRepo = PersistenceContext.repositories().colaboradores();

    private static final String POWERUSER_A1 = "Password1";

    public boolean execute() {
        // declare bootstrap actions

        registerEquipa();
        registerColaborador();

        // execute all bootstrapping

        return true;
    }

    private void registerEquipa() {
        TipoEquipa tipoEquipa = new TipoEquipa("11", "desc", "0,0,0");
        teRepo.save(tipoEquipa);
        final EquipaBuilder equipaBuilder = new EquipaBuilder();
        equipaBuilder.withCodigoUnicoEquipa("1234").withDesignacaoEquipa("desig").withObjetivoDistintoEquipa("objetivo").withAcronimo("E1234").withTipoEquipa("11");
        final Equipa novaEquipa = equipaBuilder.build();

        //Equipa equipa;
        try {
            this.eRepo.save(novaEquipa);
            //assert equipa != null;
        } catch (ConcurrencyException | IntegrityViolationException e) {
            LOGGER.trace("Assuming existing record", e);
        }
    }

    private void registerColaborador() {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);
        UsersBootstrapperBase userBootstrapper = new UsersBootstrapperBase();
        final SystemUser newUser = userBootstrapper.registerUser("jedp", POWERUSER_A1, "jed", "pow", "jed@email.org", roles);

        final ColaboradorBuilder colaboradorBuilder = new ColaboradorBuilder();
        colaboradorBuilder.withSystemUser(newUser).withMecanographicNumber("123456789").withNomeCurto("jose silva").withNomeCompleto("jose maria cunha silva").withContactoColaborador(123456789).withDataNascimento(1992, 1, 1).withEmailColaborador("jmcs@gmail.com").withLocalResidenciaColaborador("porto", "nevogilde");
        final Colaborador novoColaborador = colaboradorBuilder.build();

        Colaborador colab;
        try {
            colab = cRepo.save(novoColaborador);
            assert colab != null;
        } catch (ConcurrencyException | IntegrityViolationException e) {
            LOGGER.trace("Assuming existing record", e);
        }
    }
}
