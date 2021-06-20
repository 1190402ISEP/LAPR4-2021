package eapli.base.tipoequipa.domain;

import org.junit.Test;

public class TipoEquipaTest {

    TipoEquipa tp = new TipoEquipa();

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCodigoInternoUnicoComMais15Carateres(){
        tp = new TipoEquipa("1234567890123456","Descrição","255,255,255");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCodigoInternoUnicoVazio(){
        tp = new TipoEquipa("","Descrição","255,255,255");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCodigoInternoUnicoNull(){
        tp = new TipoEquipa(null,"Descrição","255,255,255");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoComMais50Carateres(){
        tp = new TipoEquipa("Codigo","1234567890" +
                "12345678901234567890123456789012345678901","255,255,255");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoVazio(){
        tp = new TipoEquipa("Codigo","","255,255,255");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoNull(){
        tp = new TipoEquipa("Codigo",null,"255,255,255");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCorComMaisDe3Valores(){
        tp = new TipoEquipa("Codigo","Descrição","255,255,255,255");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCorComMenosDe3Valores(){
        tp = new TipoEquipa("Codigo","Descrição","255,255");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCorComLetras(){
        tp = new TipoEquipa("Codigo","Descrição","255,255,test");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCorComNumerosAcimaDe255(){
        tp = new TipoEquipa("Codigo","Descrição","255,255,256");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCorComNumerosAbaixoDe0(){
        tp = new TipoEquipa("Codigo","Descrição","255,255,-1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCorVazio(){
        tp = new TipoEquipa("Codigo","Descrição","");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCorNull(){
        tp = new TipoEquipa("Codigo","Descrição",null);
    }

    @Test
    public void aceitarTodosOsValores(){
        tp = new TipoEquipa("Codigo","Descrição","255,255,255");
    }
}
