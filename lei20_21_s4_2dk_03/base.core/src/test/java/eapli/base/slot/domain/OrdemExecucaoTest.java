package eapli.base.slot.domain;

import org.junit.Test;

public class OrdemExecucaoTest {

    @Test(expected = IllegalArgumentException.class)
    public void recusarOrdemExecucaoIgualAZero() {
        OrdemExecucao order = new OrdemExecucao(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void recusarOrdemExecucaoMenorQueZero() {
        OrdemExecucao order = new OrdemExecucao(-1);
    }

    @Test
    public void aceitarOrdemExecucaoSuperiorAZero() {
        OrdemExecucao order = new OrdemExecucao(1);
    }
}
