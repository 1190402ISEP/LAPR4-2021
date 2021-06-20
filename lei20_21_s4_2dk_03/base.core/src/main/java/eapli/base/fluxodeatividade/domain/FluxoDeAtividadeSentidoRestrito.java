package eapli.base.fluxodeatividade.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * The type Fluxo de atividade sentido restrito.
 */
@Entity
@DiscriminatorValue(value = "R")
public class FluxoDeAtividadeSentidoRestrito extends FluxoDeAtividade {

    /**
     * Instantiates a new Fluxo de atividade sentido restrito.
     *
     * @param aDataInicio the a data inicio
     * @param aHoraInicio the a hora inicio
     */
    public FluxoDeAtividadeSentidoRestrito(String aDataInicio, String aHoraInicio) {
        super(aDataInicio, aHoraInicio);
    }

    //ORM
    protected FluxoDeAtividadeSentidoRestrito() {

    }
}
