package eapli.base.catalogoServico.domain;

import org.junit.Test;

public class DescricaoCompletaCalogoTest {

    DescricaoCompletaCatalogo descricaoCompletaCatalogo = new DescricaoCompletaCatalogo("descC");
    DescricaoCompletaCatalogo descricaoCompletaCatalogo1 = new DescricaoCompletaCatalogo("descC2");

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoComMais100Carateres(){
        descricaoCompletaCatalogo = new DescricaoCompletaCatalogo("E desta forma aproveitamos para dizer a grande farsa da vida presente na nossa insignificante existencia tenham um bom resto de bom dia, se é que o podem afirmar meus caros.");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoVazio(){
        descricaoCompletaCatalogo = new DescricaoCompletaCatalogo("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoNull(){
        descricaoCompletaCatalogo = new DescricaoCompletaCatalogo(null);
    }

    @Test
    public void aceitarDescricao(){
        descricaoCompletaCatalogo = new DescricaoCompletaCatalogo("descricaoBrevissima");
    }

    @Test
    public void verificarDuasDescricoesDiferentes(){
        int expected = descricaoCompletaCatalogo.compareTo(descricaoCompletaCatalogo1);
        assert (0!=expected);
    }

}
