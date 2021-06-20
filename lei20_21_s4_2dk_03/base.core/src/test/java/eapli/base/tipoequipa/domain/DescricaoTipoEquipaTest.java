package eapli.base.tipoequipa.domain;

import org.junit.Test;

public class DescricaoTipoEquipaTest {

    DescricaoTipoEquipa descricaoTipoEquipa = new DescricaoTipoEquipa();

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoComMais50Carateres(){
        descricaoTipoEquipa = new DescricaoTipoEquipa("123456789012345678901234567890123456789012345678901");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoVazio(){
        descricaoTipoEquipa = new DescricaoTipoEquipa("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void naoAceitarDescricaoNull(){
        descricaoTipoEquipa = new DescricaoTipoEquipa(null);
    }

    @Test
    public void aceitarDescricao(){
        descricaoTipoEquipa = new DescricaoTipoEquipa("Descrição");
    }
}
