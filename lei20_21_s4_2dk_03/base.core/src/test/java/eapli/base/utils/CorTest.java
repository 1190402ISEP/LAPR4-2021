package eapli.base.utils;

import org.junit.Test;

public class CorTest {

    Cor cor = new Cor();

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCorComMaisDe3Valores(){
        cor = new Cor("255,255,255,255");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCorComMenosDe3Valores(){
        cor = new Cor("255,255");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCorComLetras(){
        cor = new Cor("255,255,test");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCorComNumerosAcimaDe255(){
        cor = new Cor("255,255,256");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCorComNumerosAbaixoDe0(){
        cor = new Cor("255,255,-1");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCorVazio(){
        cor = new Cor("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCorNull(){
        cor = new Cor(null);
    }

    @Test
    public void aceitarCor(){
        cor = new Cor("255,255,255");
    }
}
