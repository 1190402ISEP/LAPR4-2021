package eapli.base.fluxodeatividade.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * The type Fluxo de atividade sentido lato.
 */
@Entity
@DiscriminatorValue(value = "L")
public class FluxoDeAtividadeSentidoLato extends FluxoDeAtividade {

    public FluxoDeAtividadeSentidoLato(String aDataInicio, String aHoraInicio) {
        super(aDataInicio, aHoraInicio);
    }

    //ORM
    protected FluxoDeAtividadeSentidoLato() {

    }
}
