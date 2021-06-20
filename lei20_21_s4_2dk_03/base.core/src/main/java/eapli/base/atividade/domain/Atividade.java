package eapli.base.atividade.domain;

import eapli.base.equipa.domain.Equipa;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;

/**
 * The type Atividade.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Atividade implements AggregateRoot<Long> {
    @Version
    private Long version;

    @GeneratedValue
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    private EstadoAtividade estadoAtividade;

    @OneToOne
    private Equipa equipaResponsavel;

    @Embedded
    private DescricaoAtividade descricaoAtividade;

    private int delay;

    /**
     * Instantiates a new Atividade.
     *
     * @param descricao the descricao
     * @param delay     the delay
     */
    public Atividade(String descricao, int delay) {
        if (delay <= 0) {
            throw new IllegalArgumentException("Delay deve ser maior que 0!\n");
        }
        this.delay = delay;
        this.descricaoAtividade = DescricaoAtividade.valueOf(descricao);
        this.estadoAtividade = EstadoAtividade.NAO_INICIADA;
    }

    //ORM
    protected Atividade() {
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public Long identity() {
        return this.id;
    }

    /**
     * Delay da atividade int.
     *
     * @return the int
     */
    public int delayDaAtividade() {
        return this.delay;
    }

    @Override
    public String toString() {
        return "\n--------------------------Atividade--------------------------" +
                "\nId ->" + id +
                "\nEstado ->" + estadoAtividade +
                "\nDescrição ->" + descricaoAtividade +
                "\nDelay ->" + delay +
                '\n';
    }

    public EstadoAtividade getEstadoAtividade() {
        return estadoAtividade;
    }

    public void setEstadoAtividade(EstadoAtividade estadoAtividade) {
        this.estadoAtividade = estadoAtividade;
    }

    public String getDescricao() {
        return this.descricaoAtividade.toString();
    }

    public int compareTo(final Atividade other) {
        return other.delay - this.delay;
    }
}
