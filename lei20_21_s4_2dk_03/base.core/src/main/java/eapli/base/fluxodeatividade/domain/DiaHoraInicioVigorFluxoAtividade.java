package eapli.base.fluxodeatividade.domain;

import eapli.base.utils.ConversaoDatas;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;


/**
 * The type Dia hora inicio vigor fluxo atividade.
 */
@Embeddable

public class DiaHoraInicioVigorFluxoAtividade implements ValueObject, Comparable<DiaHoraInicioVigorFluxoAtividade> {
    private static final long serialVersionUID = 1L;
    @Temporal(TemporalType.DATE)
    private Calendar diaHoraInicio;


    /**
     * Instantiates a new Dia hora inicio vigor fluxo atividade.
     *
     * @param data the data
     * @param hora the hora
     */
    public DiaHoraInicioVigorFluxoAtividade(final String data, final String hora) {
        if (StringPredicates.isNullOrEmpty(data) || StringPredicates.isNullOrEmpty(hora)) {
            throw new IllegalArgumentException("DiaHoraFimVigorFluxoAtividade should neither be null nor empty");
        }
        this.diaHoraInicio = ConversaoDatas.stringDataHora(data,hora);

    }

    //ORM
    protected DiaHoraInicioVigorFluxoAtividade() {
    }

    /**
     * Value of dia hora inicio vigor fluxo atividade.
     *
     * @param aDataInicio the a data inicio
     * @param aHoraInicio the a hora inicio
     * @return the dia hora inicio vigor fluxo atividade
     */
    public static DiaHoraInicioVigorFluxoAtividade valueOf(String aDataInicio, String aHoraInicio) {
        return new DiaHoraInicioVigorFluxoAtividade(aDataInicio, aHoraInicio);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiaHoraInicioVigorFluxoAtividade)) {
            return false;
        }

        final DiaHoraInicioVigorFluxoAtividade that = (DiaHoraInicioVigorFluxoAtividade) o;
        return this.diaHoraInicio.equals(that.diaHoraInicio);
    }

    @Override
    public int compareTo(final DiaHoraInicioVigorFluxoAtividade arg0) {
        return diaHoraInicio.compareTo(arg0.diaHoraInicio);
    }
}
