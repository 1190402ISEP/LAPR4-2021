package eapli.base.clientusermanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

/**
 * The type Contacto colaborador.
 */
@Embeddable
public class ContactoColaborador implements ValueObject, Comparable<ContactoColaborador> {
    private int contacto;

    /**
     * Instantiates a new Contacto colaborador.
     */
    protected ContactoColaborador() {
        //ORM
    }

    /**
     * Instantiates a new Contacto colaborador.
     *
     * @param contacto the contacto
     */
    public ContactoColaborador(int contacto) {
        if (contacto < 100000000 || contacto > 999999999) {
            throw new IllegalArgumentException("Contacto Inválido!");
        }
        this.contacto = contacto;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContactoColaborador)) {
            return false;
        }
        final ContactoColaborador that = (ContactoColaborador) o;
        return this.contacto == that.contacto;
    }

    @Override
    public int compareTo(final ContactoColaborador arg0) {
        return contacto - arg0.contacto;
    }

    @Override
    public String toString() {
        return String.format("%d", contacto);
    }
}
