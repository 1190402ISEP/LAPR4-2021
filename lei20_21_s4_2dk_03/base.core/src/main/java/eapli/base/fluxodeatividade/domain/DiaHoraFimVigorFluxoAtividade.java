package eapli.base.fluxodeatividade.domain;

import eapli.base.utils.ConversaoDatas;
import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;

/**
 * The type Dia hora fim vigor fluxo atividade.
 */
@Embeddable
public class DiaHoraFimVigorFluxoAtividade implements ValueObject, Comparable<DiaHoraFimVigorFluxoAtividade> {
    private static final long serialVersionUID = 1L;

    @Temporal(TemporalType.DATE)
    private Calendar dataHoraFim;



    //ORM
    protected DiaHoraFimVigorFluxoAtividade() {
    }

    /**
     * Instantiates a new Dia hora fim vigor fluxo atividade.
     *
     * @param data the data
     * @param hora the hora
     */
    public DiaHoraFimVigorFluxoAtividade(final String data, final String hora) {
        if (StringPredicates.isNullOrEmpty(data) || StringPredicates.isNullOrEmpty(hora)) {
            throw new IllegalArgumentException("DiaHoraFimVigorFluxoAtividade should neither be null nor empty");
        }
        this.dataHoraFim = ConversaoDatas.stringDataHora(data, hora);

    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiaHoraFimVigorFluxoAtividade)) {
            return false;
        }

        final DiaHoraFimVigorFluxoAtividade that = (DiaHoraFimVigorFluxoAtividade) o;
        return this.dataHoraFim.equals(that.dataHoraFim);
    }

    @Override
    public int compareTo(final DiaHoraFimVigorFluxoAtividade arg0) {
        return dataHoraFim.compareTo(arg0.dataHoraFim);
    }

}
