package eapli.base.catalogoServico.domain;

import org.junit.Test;

public class DescricaoBreveCatalogoTest {

    DescricaoBreveCatalogo descricaoBreveCatalogo = new DescricaoBreveCatalogo("desc");
    DescricaoBreveCatalogo descricaoBreveCatalogo2 = new DescricaoBreveCatalogo("descB");

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoComMais40Carateres(){
        descricaoBreveCatalogo = new DescricaoBreveCatalogo("123456789012345678901234567890123456789012345678901");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoVazio(){
        descricaoBreveCatalogo = new DescricaoBreveCatalogo("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoNull(){
        descricaoBreveCatalogo = new DescricaoBreveCatalogo(null);
    }

    @Test
    public void aceitarDescricao(){
        descricaoBreveCatalogo = new DescricaoBreveCatalogo("descricaoBrevissima");
    }

    @Test
    public void verificarDuasDescricoesDiferentes(){
        int expected = descricaoBreveCatalogo.compareTo(descricaoBreveCatalogo2);
        assert (0!=expected);
    }

}
