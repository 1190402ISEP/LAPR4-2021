package eapli.base.slot.domain;

import eapli.base.atividade.domain.Script;
import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;

/**
 * The type Ordem execucao.
 */
@Embeddable
public class OrdemExecucao implements ValueObject, Comparable<OrdemExecucao> {
    private int ordemExecucao;

    /**
     * Instantiates a new Ordem execucao.
     *
     * @param ordemExecucao the ordem execucao
     */
    public OrdemExecucao(int ordemExecucao) {
        if (ordemExecucao <= 0) {
            throw new IllegalArgumentException("A ordem de execução não pode ser zero ou um valor inferior\n e" +
                    "não pode ser igual a uma já existente!");
        }
        this.ordemExecucao = ordemExecucao;
    }

    /**
     * Instantiates a new Ordem execucao.
     */
//ORM
    protected OrdemExecucao() {

    }

    /**
     * Value of ordem execucao.
     *
     * @param ordemExecucao the ordem execucao
     * @return the ordem execucao
     */
    public static OrdemExecucao valueOf(final int ordemExecucao) {
        return new OrdemExecucao(ordemExecucao);
    }

    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Script)) {
            return false;
        }
        final OrdemExecucao that = (OrdemExecucao) o;
        return this.ordemExecucao == that.ordemExecucao;
    }

    @Override
    public int compareTo(OrdemExecucao o) {
        return this.ordemExecucao - o.ordemExecucao;
    }
}
