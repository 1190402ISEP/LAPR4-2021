package eapli.base.equipa.domain;

import eapli.base.tipoequipa.domain.TipoEquipa;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EquipaTest {

    static Equipa e1;
    static Equipa e2;
    static Equipa e3;

    private void inicializarEquipasDeTeste() {
        TipoEquipa tipo = new TipoEquipa("team","descc","33,33,33");
        EquipaBuilder builder = new EquipaBuilder();
        builder.withCodigoUnicoEquipa("E1");
        builder.withDesignacaoEquipa("equipa 1");
        builder.withObjetivoDistintoEquipa("Fazer servico");
        builder.withAcronimo("eqp1");
        builder.withTipoEquipa(tipo);
        e1 = builder.build();
        //------------------------------------------------------------------------
        builder = new EquipaBuilder();
        builder.withCodigoUnicoEquipa("E1");
        builder.withDesignacaoEquipa("equipa 1");
        builder.withObjetivoDistintoEquipa("Fazer servico");
        builder.withAcronimo("eqp1");
        builder.withTipoEquipa(tipo);
        e2 = builder.build();
        //------------------------------------------------------------------------
        builder = new EquipaBuilder();
        builder.withCodigoUnicoEquipa("E3");
        builder.withDesignacaoEquipa("equipa 3");
        builder.withObjetivoDistintoEquipa("fazer atividade");
        builder.withAcronimo("eqp3");
        builder.withTipoEquipa(tipo);
        e3 = builder.build();
    }

    @Test
    public void assegurarQueDuasEquipasComIguaisCodigosNaoSaoOMesmo() {
        inicializarEquipasDeTeste();
        final boolean expected = e1.equals(e2);
        assertTrue(expected);
    }

    @Test
    public void assegurarQueDuasEquipasComDiferentesCodigosNaoSaoOMesmo() {
        final boolean expected = e1.equals(e3);
        assertFalse(expected);
    }

    @Test
    public void assegurarQueEquipaEAMesmaQueASuaInstancia() {
        final boolean expected = e1.sameAs(e1);
        assertTrue(expected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void codigoUnicoMais15Caracteres() {
        new CodigoUnicoEquipa("AAAss12ssssssbfgthvbfgrdhskcjfhghghghgghghghghghghghghgh");
    }

    @Test(expected = IllegalArgumentException.class)
    public void acronimoMais10Caracteres() {
        new Acronimo( "bfaebdeadhasss");
    }


}
