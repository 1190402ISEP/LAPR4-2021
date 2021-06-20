package eapli.base.atividade.domain;

import org.junit.Test;

public class AtividadeTest {

    @Test(expected = IllegalArgumentException.class)
    public void recusarDelayMenorQueZero() {
        Atividade at = new Atividade("desc", -2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void recusarDelayIgualAZero() {
        Atividade at = new Atividade("desc", 0);
    }

    @Test
    public void aceitarDelayMaiorQueZero() {
        Atividade at = new Atividade("desc", 2);
    }
}
