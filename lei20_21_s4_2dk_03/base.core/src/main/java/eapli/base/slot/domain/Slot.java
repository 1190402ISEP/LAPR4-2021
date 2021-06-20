package eapli.base.slot.domain;

import eapli.base.atividade.domain.Atividade;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;

/**
 * The type Slot.
 */
@Entity
public class Slot implements AggregateRoot<Long> {

    @Version
    private long version;

    @GeneratedValue
    @Id
    private Long id;

    private OrdemExecucao ordemExecucao;

    @OneToOne
    private Atividade atividade;

    /**
     * Instantiates a new Slot.
     *
     * @param ordemExecucao the ordem execucao
     * @param atividade     the atividade
     */
    public Slot(int ordemExecucao, Atividade atividade) {
        this.ordemExecucao = OrdemExecucao.valueOf(ordemExecucao);
        this.atividade = atividade;
    }

    /**
     * Instantiates a new Slot.
     */
    //ORM
    protected Slot() {
    }

    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public Long identity() {
        return this.id;
    }
}
