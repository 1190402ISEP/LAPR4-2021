package eapli.base.catalogoServico.domain;

import org.junit.Test;

public class IdentificadorCatalogoTest {

    IdentificadorCatalogo identificadorCatalogo = new IdentificadorCatalogo("1234");
    IdentificadorCatalogo identificadorCatalogo2 = new IdentificadorCatalogo("12345");

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarIdentificadorComMais15Carateres(){
        identificadorCatalogo = new IdentificadorCatalogo("123456789012345678901234567890123456789012345678901");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarIdentificadorVazio(){
        identificadorCatalogo = new IdentificadorCatalogo("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarIdentificadorNull(){
        identificadorCatalogo = new IdentificadorCatalogo(null);
    }

    @Test
    public void aceitarIdentificador(){
        identificadorCatalogo = new IdentificadorCatalogo("12345678");
    }

    @Test
    public void verificarDoisIdentificadoresDiferentes(){
        int expected = identificadorCatalogo.compareTo(identificadorCatalogo2);
        assert (0!=expected);
    }

}
