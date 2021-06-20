package eapli.base.catalogoServico.domain;

import org.junit.Test;

public class TituloCatalogoTest {

    TituloCatalogo tituloCatalogo = new TituloCatalogo("penso logo existo");
    TituloCatalogo tituloCatalogo2 = new TituloCatalogo("sou diferente");

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarTituloComMais50Carateres(){
        tituloCatalogo = new TituloCatalogo("123456789012345678901234567890123456789012345678901");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarTituloVazio(){
        tituloCatalogo = new TituloCatalogo("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarTituloNull(){
        tituloCatalogo = new TituloCatalogo(null);
    }

    @Test
    public void aceitarTitulo(){
        tituloCatalogo = new TituloCatalogo("Título do Catálogo");
    }

    @Test
    public void verificarDoisTitulosDiferentes(){
      int expected = tituloCatalogo.compareTo(tituloCatalogo2);
      assert (0!=expected);
    }

}
