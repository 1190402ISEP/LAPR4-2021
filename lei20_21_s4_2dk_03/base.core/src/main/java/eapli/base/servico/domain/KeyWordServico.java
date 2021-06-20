package eapli.base.servico.domain;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * The type Key word servico.
 */
@Entity
public class KeyWordServico implements ValueObject, Comparable<KeyWordServico> {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private int idKey;
    private String keyWordServico;

    /**
     * Instantiates a new Key word servico.
     */
    protected KeyWordServico() {
        // for ORM
    }

    /**
     * Instantiates a new Key word servico.
     *
     * @param keyWordServico the key word servico
     */
    public KeyWordServico(final String keyWordServico) {
        if (StringPredicates.isNullOrEmpty(keyWordServico)) {
            throw new IllegalArgumentException("KeyWord nao pode ser nula ou vazia.");
        }
        this.keyWordServico = keyWordServico;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KeyWordServico)) {
            return false;
        }

        final KeyWordServico that = (KeyWordServico) o;
        return this.keyWordServico.equals(that.keyWordServico);
    }

    @Override
    public int hashCode() {
        return this.keyWordServico.hashCode();
    }

    @Override
    public int compareTo(KeyWordServico o) {
        return this.keyWordServico.compareTo(o.keyWordServico);
    }

    @Override
    public String toString() {
        return this.keyWordServico;
    }
}
