package eapli.base.nivelCriticidade;

import eapli.base.nivelCriticidade.domain.Etiqueta;
import eapli.base.nivelCriticidade.domain.Nivel;
import eapli.base.nivelCriticidade.domain.NivelBuilder;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NivelTest {

    static Nivel n1;
    static Nivel n2;
    static Nivel n3;

    private void inicializarNiveisDeTeste() {
        NivelBuilder builder = new NivelBuilder();
        builder.withEtiqueta("ola ola");
        builder.withValorEscala(1);
        builder.withCor("2,3,4");
        builder.withObjetivoDistinto("identificar servico");
        builder.withDesignacaoNivel("ola1");
        n1 = builder.build();
        //------------------------------------------------------------------------
        builder = new NivelBuilder();
        builder.withEtiqueta("ola ola");
        builder.withValorEscala(1);
        builder.withCor("2,3,4");
        builder.withObjetivoDistinto("identificar servico");
        builder.withDesignacaoNivel("ola1");
        n2 = builder.build();
        //------------------------------------------------------------------------
        builder = new NivelBuilder();
        builder.withEtiqueta("adeus adeus");
        builder.withValorEscala(2);
        builder.withCor("5,6,7");
        builder.withObjetivoDistinto("identificar catalogo");
        builder.withDesignacaoNivel("adeus1");
        n3 = builder.build();
    }

    @Test
    public void assegurarQueDoisNiveisComIguaisCodigosNaoSaoOMesmo() throws Exception {
        inicializarNiveisDeTeste();
        final boolean expected = n1.equals(n2);
        assertTrue(expected);
    }

    @Test
    public void assegurarQueDoisNiveisComDiferentesCodigosNaoSaoOMesmo() throws Exception {
        inicializarNiveisDeTeste();
        final boolean expected = n1.equals(n3);
        assertFalse(expected);
    }

    @Test
    public void assegurarQueNivelEAMesmaQueASuaInstancia() throws Exception {
        inicializarNiveisDeTeste();
        final boolean expected = n1.sameAs(n1);
        assertTrue(expected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void etiquetaMais25Caracteres() {
        Etiqueta e1 = new Etiqueta("AAAss12ssssssbfgthvbafesfgrdhskcjfhghghghgghghghghghghghghgh");
    }

}
