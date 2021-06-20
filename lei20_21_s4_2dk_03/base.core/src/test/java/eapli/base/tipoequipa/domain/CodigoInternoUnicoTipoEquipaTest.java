package eapli.base.tipoequipa.domain;

import org.junit.Test;

public class CodigoInternoUnicoTipoEquipaTest {

    CodigoInternoUnicoTipoEquipa codigoInternoUnicoTipoEquipa = new CodigoInternoUnicoTipoEquipa();

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCodigoInternoUnicoComMais15Carateres(){
        codigoInternoUnicoTipoEquipa = new CodigoInternoUnicoTipoEquipa("1234567890123456");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCodigoInternoUnicoVazio(){
        codigoInternoUnicoTipoEquipa = new CodigoInternoUnicoTipoEquipa("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCodigoInternoUnicoNull(){
        codigoInternoUnicoTipoEquipa = new CodigoInternoUnicoTipoEquipa(null);
    }

    @Test
    public void aceitarCodigoInternoUnico(){
        codigoInternoUnicoTipoEquipa = new CodigoInternoUnicoTipoEquipa("CodigoUnico");
    }
}
