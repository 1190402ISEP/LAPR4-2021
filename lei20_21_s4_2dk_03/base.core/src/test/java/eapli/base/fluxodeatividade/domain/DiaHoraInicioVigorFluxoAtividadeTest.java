package eapli.base.fluxodeatividade.domain;

import org.junit.Test;

public class DiaHoraInicioVigorFluxoAtividadeTest {

    @Test(expected = IllegalArgumentException.class)
    public void recusarDataInicioNula() {
        DiaHoraInicioVigorFluxoAtividade dH = new DiaHoraInicioVigorFluxoAtividade(null, "20:45:00");

    }

    @Test(expected = IllegalArgumentException.class)
    public void recusarDataInicioVazia() {
        DiaHoraInicioVigorFluxoAtividade dH = new DiaHoraInicioVigorFluxoAtividade("", "20:45:00");
    }

    @Test
    public void aceitarDataInicioCorreta() {
        DiaHoraInicioVigorFluxoAtividade dH = new DiaHoraInicioVigorFluxoAtividade("26/12/2001", "20:45:00");
    }

    @Test(expected = IllegalArgumentException.class)
    public void recusarHoraInicioNula() {
        DiaHoraInicioVigorFluxoAtividade dH = new DiaHoraInicioVigorFluxoAtividade("26/12/2001", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void recusarHoraInicioVazia() {
        DiaHoraInicioVigorFluxoAtividade dH = new DiaHoraInicioVigorFluxoAtividade("26/12/2001", "");
    }

    @Test
    public void aceitarHoraInicioCorreta() {
        DiaHoraInicioVigorFluxoAtividade dH = new DiaHoraInicioVigorFluxoAtividade("26/12/2001", "20:45:00");
    }
}
