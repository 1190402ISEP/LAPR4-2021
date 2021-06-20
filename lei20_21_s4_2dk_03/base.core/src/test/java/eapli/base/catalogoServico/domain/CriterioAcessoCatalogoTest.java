package eapli.base.catalogoServico.domain;

import org.junit.Test;

public class CriterioAcessoCatalogoTest {

    CriterioAcessoCatalogo criterioAcessoCatalogo = new CriterioAcessoCatalogo("criterioA");

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCriterioComMais50Carateres(){
        criterioAcessoCatalogo = new CriterioAcessoCatalogo("criterizamos de tudo um pouco meu caro compatriota que talvez seja socialista");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCriterioVazio(){
        criterioAcessoCatalogo = new CriterioAcessoCatalogo("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarCriterioNull(){
        criterioAcessoCatalogo = new CriterioAcessoCatalogo(null);
    }

    @Test
    public void aceitarCriterio(){
        criterioAcessoCatalogo = new CriterioAcessoCatalogo("criterio janota");
    }

}
