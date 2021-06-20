package eapli.base.clientusermanagement.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;
import eapli.framework.validations.Preconditions;

import javax.persistence.Embeddable;

/**
 * The type Email colaborador.
 */
@Embeddable
public class EmailColaborador implements ValueObject, Comparable<EmailColaborador> {
    private String email;

    /**
     * Instantiates a new Email colaborador.
     */
    public EmailColaborador() {
        //ORM
    }

    /**
     * Instantiates a new Email colaborador.
     *
     * @param email the email
     */
    public EmailColaborador(String email) {
        setEmail(email);
    }

    private void setEmail(String email) {
        if (StringPredicates.isNullOrEmpty(email)) {
            throw new IllegalArgumentException("O email não pode ser nulo ou vazio!");
        }
        Preconditions.ensure(StringPredicates.isEmail(email), "Mail Inválido!");

        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmailColaborador)) {
            return false;
        }
        final EmailColaborador that = (EmailColaborador) o;
        return this.email.equalsIgnoreCase(that.email);
    }

    @Override
    public int hashCode() {
        return this.email.hashCode();
    }

    @Override
    public int compareTo(EmailColaborador o) {
        return this.email.compareTo(o.email);
    }

    @Override
    public String toString() {
        return this.email;
    }

}
