package eapli.base.clientusermanagement.domain;

import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ColaboradorTest {
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
        builder.withMecanographicNumber("ADBF");
        builder.withNomeCurto("Antonio Fernandes");
        builder.withNomeCompleto("Antonio Daniel Barbosa Fernandes");
        builder.withEmailColaborador("1190402@isep.ipp.pt");
        builder.withContactoColaborador(255255255);
        builder.withLocalResidenciaColaborador("Viseu", "Cinfaes");
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

    @Test
    public void assegurarQueDoisColaboradoresComIguaisMecanograficosNaoSaoOMesmo() throws Exception {
        inicializarColaboradoresDeTeste();
        final boolean expected = c1.equals(c2);
        assertTrue(expected);
    }

    @Test
    public void assegurarQueDoisColaboradoresComDiferentesMecanograficosNaoSaoOMesmo() throws Exception {
        inicializarColaboradoresDeTeste();
        final boolean expected = c1.equals(c3);
        assertFalse(expected);
    }

    @Test
    public void assegurarQueColaboradorEOMesmoQueASuaInstancia() throws Exception {
        inicializarColaboradoresDeTeste();
        final boolean expected = c1.sameAs(c1);
        assertTrue(expected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nomeCompletoMais80Caracteres() {
        NomeCompletoColaborador n1 = new NomeCompletoColaborador("AAAssssssssbfgthvbfgrdhskcjfhghghghghghghghghghghghghghgh" +
                "" +
                "rgiowivbwbwbçwrborwwbwrbwrbrwbrwbwrbrwbrwbwbrwbrwbrwbrwbrwbrwbrwbrwbwrb");
    }

    @Test
    public void nomeCompletoMenos80Caracteres() {
        NomeCompletoColaborador n1 = new NomeCompletoColaborador("Name1 Surname1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void nomeCurtoMais30Caracteres() {
        NomeCurtoColaborador n1 = new NomeCurtoColaborador("AAAAAbbtrtththhehfhfehhdedefeqefqerfrrggwgwrwdfdddq");
    }
    @Test
    public void nomeCurtoMenos30Caracteres() {
        NomeCurtoColaborador n1 = new NomeCurtoColaborador("Name Surname");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDataDeHoje() {
        Calendar hoje = Calendar.getInstance();
        DataNascimentoColaborador d= new DataNascimentoColaborador(hoje);
    }

    @Test(expected=IllegalArgumentException.class)
    public void naoAceitarContactoInvalido() {
        ContactoColaborador c = new ContactoColaborador(244);
    }
}