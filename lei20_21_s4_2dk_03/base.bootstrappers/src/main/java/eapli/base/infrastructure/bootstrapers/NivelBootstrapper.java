package eapli.base.infrastructure.bootstrapers;

import eapli.base.catalogoServico.application.CriarCatalogoController;
import eapli.base.catalogoServico.domain.CatalogoServico;
import eapli.base.catalogoServico.domain.CriterioAcessoCatalogo;
import eapli.base.catalogoServico.domain.IdentificadorCatalogo;
import eapli.base.catalogoServico.dto.CatalogoServicoDTO;
import eapli.base.catalogoServico.repository.CatalogoServicoRepository;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.domain.ColaboradorBuilder;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.nivelCriticidade.domain.Etiqueta;
import eapli.base.nivelCriticidade.domain.Nivel;
import eapli.base.nivelCriticidade.repository.NivelRepository;
import eapli.base.servico.domain.CodigoUnicoServico;
import eapli.base.servico.domain.KeyWordServico;
import eapli.base.servico.domain.Servico;
import eapli.base.servico.domain.ServicoBuilder;
import eapli.base.servico.repository.ServicoRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.infrastructure.authz.domain.model.Role;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NivelBootstrapper implements Action {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseBootstrapper.class);

    private final NivelRepository nRepo = PersistenceContext.repositories().niveis();
    private final ServicoRepository sRepo = PersistenceContext.repositories().servico();
    private final UserRepository userRepository = PersistenceContext.repositories().users();
    private final ColaboradorRepository cRepo = PersistenceContext.repositories().colaboradores();
    private final CatalogoServicoRepository csRepo = PersistenceContext.repositories().catalogosServico();

    private static final String POWERUSER_A1 = "Password1";
    final Set<Role> roles = new HashSet<>();

    UsersBootstrapperBase userBootstrapper = new UsersBootstrapperBase();

    public boolean execute() {
        // declare bootstrap actions

        registerNivel();

        // execute all bootstrapping

        return true;
    }

    private void registerNivel() {
        Etiqueta etiqueta = new Etiqueta("crit");

        Nivel nivel = new Nivel("crit", "2,2,4", 1, "objetivo", "designacao");

        try {
            this.nRepo.save(nivel);
        } catch (ConcurrencyException | IntegrityViolationException e) {
            LOGGER.trace("Assuming existing record", e);
        }

        List<CriterioAcessoCatalogo> criterioAcessoCatalogo = new ArrayList<>();
        criterioAcessoCatalogo.add(new CriterioAcessoCatalogo("crit"));

        List<KeyWordServico> keyWords = new ArrayList<>();
        keyWords.add(new KeyWordServico("programa"));

        roles.add(BaseRoles.RESPONSAVEL_RECURSOS_HUMANOS);
        final SystemUser newUser = userBootstrapper.registerUser("joanp", POWERUSER_A1, "joan", "poers", "joan@email.org", roles);
        userRepository.save(newUser);
        final ColaboradorBuilder colaboradorBuilder = new ColaboradorBuilder();
        colaboradorBuilder.withSystemUser(newUser).withMecanographicNumber("1234759").withNomeCurto("joaninha silva").withNomeCompleto("joaninha cunha silva").withContactoColaborador(122456789).withDataNascimento(1992, 1, 2).withEmailColaborador("jcs@gmail.com").withLocalResidenciaColaborador("porto", "nevogilde");
        final Colaborador colaborador = colaboradorBuilder.build();
        cRepo.save(colaborador);

        CatalogoServicoDTO catDTO = new CatalogoServicoDTO("id cat", "descricao brevissima", "descricao comp", "titulo cat", criterioAcessoCatalogo, "1234759");
        CriarCatalogoController catController = new CriarCatalogoController();
        catController.adicionarCatalogoServico(catDTO);
        CatalogoServico catalogo = csRepo.ofIdentity(new IdentificadorCatalogo("id cat")).get();

        //=====CATALOGO======
        Nivel nivel1 = nRepo.ofIdentity(etiqueta).get();
        catalogo.addNivel(nivel1);
        nivel1.addCatalogo(catalogo);
        nRepo.save(nivel1);
        csRepo.save(catalogo);

        final ServicoBuilder servicoBuilder = new ServicoBuilder();
        servicoBuilder.withCodigoUnicoServico("66").withTituloServico("tituServ").withKeyWords(keyWords).withDescricaoBreveServico("descriBre").withDescricaoCompletaServico("descriCompleta").withObjetivoServico("objectivo").withCatalogoServico(catalogo);
        final Servico novoServico = servicoBuilder.build();
        sRepo.save(novoServico);
        Servico serv = sRepo.ofIdentity(new CodigoUnicoServico("66")).get();

        //=====SERVIÇO======
        Nivel nivel2 = nRepo.ofIdentity(etiqueta).get();
        serv.associarNivel(nivel2);
        nivel2.addServico(serv);
        nRepo.save(nivel2);
        sRepo.save(serv);
        //
    }

}
