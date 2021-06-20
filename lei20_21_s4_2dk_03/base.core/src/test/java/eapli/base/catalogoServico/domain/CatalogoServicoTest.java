package eapli.base.catalogoServico.domain;

import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.domain.ColaboradorBuilder;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class CatalogoServicoTest {

    /**
     * Instancia um novo CatalogoServico.
     *
     */

    CriterioAcessoCatalogo aux = new CriterioAcessoCatalogo("criterioAcesso");
    CriterioAcessoCatalogo aux2 = new CriterioAcessoCatalogo("criterioAcesso2");
    List<CriterioAcessoCatalogo> criterioAcesso = Arrays.asList(aux, aux2);

    CatalogoServico cs1 = new CatalogoServico("idCat","saudita",
            "saudezona","titulo1",criterioAcesso,c1);
    CatalogoServico cs2 = new CatalogoServico("idCat","saudita",
            "saudezona","titulo1",criterioAcesso,c2);

    static Colaborador c1;
    static Colaborador c2;
    static Colaborador c3;

    private void inicializarColaboradoresDeTeste() {
        ColaboradorBuilder builder = new ColaboradorBuilder();
        builder.withSystemUser(getNewDummyUser());
        builder.withMecanographicNumber("ADBF");
        builder.withNomeCurto("Antonio Fernandes");
        builder.withNomeCompleto("Antonio Daniel Barbosa Fernandes");
        builder.withEmailColaborador("1190402@isep.ipp.pt");
        builder.withContactoColaborador(255255255);
        builder.withLocalResidenciaColaborador("Viseu", "Cinfaes");
        builder.withDataNascimento(2001, 12, 26);
        c1 = builder.build();
        //------------------------------------------------------------------------
        builder = new ColaboradorBuilder();
        builder.withSystemUser(getNewDummyUser());
        builder.withMecanographicNumber("RPMS");
        builder.withNomeCurto("Rui Soares");
        builder.withNomeCompleto("Rui Pedro Mesquita Soares");
        builder.withEmailColaborador("1190402@isep.ipp.pt");
        builder.withContactoColaborador(255255255);
        builder.withLocalResidenciaColaborador("Porto", "Senhora da Hora");
        builder.withDataNascimento(2001, 12, 26);
        c2 = builder.build();
        //------------------------------------------------------------------------
        builder = new ColaboradorBuilder();
        builder.withSystemUser(getNewDummyUser());
        builder.withMecanographicNumber("TVPPL");
        builder.withNomeCurto("Teresinha");
        builder.withNomeCompleto("Teresa Vale Peixoto Pereira Leite");
        builder.withEmailColaborador("1191072@isep.ipp.pt");
        builder.withContactoColaborador(252648427);
        builder.withLocalResidenciaColaborador("Porto", "Ramalde");
        builder.withDataNascimento(2001, 10, 12);
        c3 = builder.build();
    }

    public static SystemUser dummyUser(final String username, final Role... roles) {
        // should we load from spring context?
        final SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

    private SystemUser getNewDummyUser() {
        return dummyUser("dummy", BaseRoles.ADMIN);
    }


    //testes
    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarIdentificadorCatalogoVazio(){
        cs1 = new CatalogoServico("","descricaoBreve","descCompleta","titulo",criterioAcesso,c1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarIdentificadorCatalogoNull(){
        cs1 = new CatalogoServico(null,"descricaoBreve",
                "descCompleta","titulo",criterioAcesso,c2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarIdentificadorCatalogoComMais15Carateres(){
        cs1 = new CatalogoServico("idCat que neste caso sera muito grande zezinho",
                "descricaoBreve","descCompleta",
                "titulo",criterioAcesso,c1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoBreveComMais40Carateres(){
        cs1 = new CatalogoServico("idCat",
                "descricaoBreveMasQueAfinalNaoE Tao breve quanto se pensa meus caros compatriotas constituintes",
                "descCompleta","titulo",criterioAcesso,c1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoBreveNull(){
        cs1 = new CatalogoServico("idCat",
                null,"descCompleta",
                "titulo",criterioAcesso,c1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoBreveVazio(){
        cs1 = new CatalogoServico("idCat",
                "","descCompleta",
                "titulo",criterioAcesso,c1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoCompletaComMais100Carateres(){
        cs1 = new CatalogoServico("idCat","descricaoBreve",
                "descCompleta mas que afinal ainda sera mais que completa como diria fernando pessoa tudo vale a pena se a alma nao e pequena e que quem quer passador alem do bojador tem de passar alem da dor ok?",
                "titulo",criterioAcesso,c1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoCompletaNull(){
        cs1 = new CatalogoServico("idCat","descricaoBreve",
                null,"titulo",criterioAcesso,c1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoCompletaVazio(){
        cs1 = new CatalogoServico("idCat","descricaoBreve",
                "","titulo",criterioAcesso,c3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarTituloCatalogoComMais50Carateres(){
        cs1 = new CatalogoServico("idCat","descricaoBreve",
                "descricaoCompleta","tituloCatalogo foi muito extenso desta vez mas que grande azar chefe logo hoje que era dia de feira e de ganhar uns trocos",
                criterioAcesso,c1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarTituloCatalogoVazio(){
        cs1 = new CatalogoServico("idCat","descricaoBreve",
                "descricaoCompleta","",criterioAcesso,c2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarTituloCatalogoNull(){
        cs1 = new CatalogoServico("idCat","descricaoBreve",
                "descricaoCompleta",null,criterioAcesso,c3);
    }

    @Test
    public void assegurarQueDoisCatalogosServicoComOMesmoTituloNaoSaoOMesmo() throws Exception{
        final boolean expected = cs1.sameAs(cs2);
        assertTrue(expected);
    }

}
