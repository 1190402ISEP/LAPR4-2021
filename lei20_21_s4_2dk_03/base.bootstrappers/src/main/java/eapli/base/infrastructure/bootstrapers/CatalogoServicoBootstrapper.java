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

import java.util.*;

public class CatalogoServicoBootstrapper implements Action {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseBootstrapper.class);

    private final ServicoRepository sRepo = PersistenceContext.repositories().servico();
    private final UserRepository userRepository = PersistenceContext.repositories().users();
    private final ColaboradorRepository cRepo = PersistenceContext.repositories().colaboradores();
    private final CatalogoServicoRepository csRepo = PersistenceContext.repositories().catalogosServico();

    private static final String POWERUSER_A1 = "Password1";
    final Set<Role> roles = new HashSet<>();
    final Set<Role> roles2 = new HashSet<>();
    UsersBootstrapperBase userBootstrapper = new UsersBootstrapperBase();

    public boolean execute() {
        // declare bootstrap actions

        registerServico();
        registerCatalogoServico();

        // execute all bootstrapping
        return true;
    }

    private boolean registerServico() {
        final ServicoBuilder servicoBuilder = new ServicoBuilder();
        CriarCatalogoController catController = new CriarCatalogoController();

        String identificadorCatalogo = "blah";
        String descricaoBreveCatalogo = "descricao breve";
        String descricaoCompletaCatalogo = "descricao completa";
        String tituloCatalogo = "BLAHH";
        List<CriterioAcessoCatalogo> criterioAcessoCatalogo = new ArrayList<>();
        criterioAcessoCatalogo.add(new CriterioAcessoCatalogo("criterio"));

        List<KeyWordServico> keyWords = new ArrayList<>();
        KeyWordServico keyword = new KeyWordServico("programar");
        keyWords.add(keyword);

        roles.add(BaseRoles.RESPONSAVEL_RECURSOS_HUMANOS);
        final SystemUser newUser = userBootstrapper.registerUser("jonep", POWERUSER_A1, "jone", "powers", "jone@email.org", roles);
        userRepository.save(newUser);

        final ColaboradorBuilder colaboradorBuilder = new ColaboradorBuilder();
        colaboradorBuilder.withSystemUser(newUser).withMecanographicNumber("123489").withNomeCurto("josefa silva").withNomeCompleto("josefa santos maria cunha silva").withContactoColaborador(129456789).withDataNascimento(1992, 1, 2).withEmailColaborador("jsmcs@gmail.com").withLocalResidenciaColaborador("porto", "nevogilde");
        final Colaborador colaborador = colaboradorBuilder.build();
        cRepo.save(colaborador);

        CatalogoServicoDTO catDTO = new CatalogoServicoDTO(identificadorCatalogo, descricaoBreveCatalogo, descricaoCompletaCatalogo, tituloCatalogo, criterioAcessoCatalogo, "123489");
        catController.adicionarCatalogoServico(catDTO);
        CatalogoServico catalogo = csRepo.ofIdentity(new IdentificadorCatalogo(identificadorCatalogo)).get();

        servicoBuilder.withCodigoUnicoServico("666").withTituloServico("titServ").withKeyWords(keyWords).withDescricaoBreveServico("descBre").withDescricaoCompletaServico("descCompleta").withObjetivoServico("objetivo").withCatalogoServico(catalogo);
        final Servico novoServico = servicoBuilder.build();

        Servico servico;
        try {
            servico = sRepo.save(novoServico);
            assert servico != null;
            return true;
        } catch (ConcurrencyException | IntegrityViolationException e) {
            LOGGER.trace("Assuming existing record", e);
            return false;
        }
    }

    private boolean registerCatalogoServico() {
        CriarCatalogoController catController = new CriarCatalogoController();

        String identificadorCatalogo = "brinquedos";
        String descricaoBreveCatalogo = "desc breve";
        String descricaoCompletaCatalogo = "desc completa";
        String tituloCatalogo = "Brinquedos";
        List<CriterioAcessoCatalogo> criterioAcessoCatalogo = new ArrayList<>();
        criterioAcessoCatalogo.add(new CriterioAcessoCatalogo("criterio"));

        roles2.add(BaseRoles.GESTOR_SERVICOS_HELPDESK);
        final SystemUser newUser = userBootstrapper.registerUser("jimp", POWERUSER_A1, "jim", "powe", "jim@email.org", roles2);
        userRepository.save(newUser);

        final ColaboradorBuilder colaboradorBuilder = new ColaboradorBuilder();
        colaboradorBuilder.withSystemUser(newUser).withMecanographicNumber("12348989").withNomeCurto("josefina cunha").withNomeCompleto("josefina mario cunha").withContactoColaborador(123416789).withDataNascimento(1992, 1, 1).withEmailColaborador("jmc@gmail.com").withLocalResidenciaColaborador("porto", "nevogilde");
        final Colaborador colaboradorResponsavel = colaboradorBuilder.build();
        cRepo.save(colaboradorResponsavel);

        CatalogoServicoDTO catDTO = new CatalogoServicoDTO(identificadorCatalogo, descricaoBreveCatalogo, descricaoCompletaCatalogo, tituloCatalogo, criterioAcessoCatalogo, "12348989");
        catController.adicionarCatalogoServico(catDTO);

        return true;
    }

}
