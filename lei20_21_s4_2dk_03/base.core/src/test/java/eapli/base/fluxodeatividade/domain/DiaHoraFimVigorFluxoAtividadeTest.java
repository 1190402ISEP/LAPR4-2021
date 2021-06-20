package eapli.base.fluxodeatividade.domain;

import org.junit.Test;

public class DiaHoraFimVigorFluxoAtividadeTest {

    @Test(expected = IllegalArgumentException.class)
    public void recusarDataFimNula() {
        DiaHoraFimVigorFluxoAtividade dH = new DiaHoraFimVigorFluxoAtividade(null, "20:45:00");

    }

    @Test(expected = IllegalArgumentException.class)
    public void recusarDataFimVazia() {
        DiaHoraFimVigorFluxoAtividade dH = new DiaHoraFimVigorFluxoAtividade("", "20:45:00");
    }

    @Test
    public void aceitarDataFimCorreta() {
        DiaHoraFimVigorFluxoAtividade dH = new DiaHoraFimVigorFluxoAtividade("26/12/2001", "20:45:00");
    }

    @Test(expected = IllegalArgumentException.class)
    public void recusarHoraFimNula() {
        DiaHoraFimVigorFluxoAtividade dH = new DiaHoraFimVigorFluxoAtividade("26/12/2001", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void recusarHoraFimVazia() {
        DiaHoraFimVigorFluxoAtividade dH = new DiaHoraFimVigorFluxoAtividade("26/12/2001", "");
    }

    @Test
    public void aceitarHoraFimCorreta() {
        DiaHoraFimVigorFluxoAtividade dH = new DiaHoraFimVigorFluxoAtividade("26/12/2001", "20:45:00");
    }
}
