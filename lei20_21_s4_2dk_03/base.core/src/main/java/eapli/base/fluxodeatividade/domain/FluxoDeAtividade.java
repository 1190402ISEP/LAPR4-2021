package eapli.base.fluxodeatividade.domain;

import eapli.base.atividade.domain.Atividade;
import eapli.base.atividade.repositories.AtividadeRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.slot.domain.Slot;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Fluxo de atividade.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipoFluxo", length = 1, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("F")
public class FluxoDeAtividade implements AggregateRoot<Long> {

    @Version
    private Long version;

    @GeneratedValue
    @Id
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Slot> slots;

    @Embedded
    private DiaHoraInicioVigorFluxoAtividade aDiaHoraInicioVigorFluxoAtividade;

    @Embedded
    private DiaHoraFimVigorFluxoAtividade aDiaHoraFimVigorFluxoAtividade;

    /**
     * Instantiates a new Fluxo de atividade.
     *
     * @param aDataInicio the a data inicio
     * @param aHoraInicio the a hora inicio
     */
    public FluxoDeAtividade(String aDataInicio, String aHoraInicio) {
        this.aDiaHoraInicioVigorFluxoAtividade = DiaHoraInicioVigorFluxoAtividade.valueOf(aDataInicio, aHoraInicio);
        slots = new ArrayList<>();
    }

    /**
     * Instantiates a new Fluxo de atividade.
     */
    //ORM
    protected FluxoDeAtividade() {
    }

    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public Long identity() {
        return this.id;
    }

    /**
     * Associar slot com atividade boolean.
     *
     * @param aSlot the a slot
     * @return the boolean
     */
    public boolean associarSlotComAtividade(Slot aSlot) {
        return slots.add(aSlot);
    }

    public List<Atividade> getAtividades() {
        final AtividadeRepository aRepo= PersistenceContext.repositories().atividade();
        List<Atividade> listaAtividades=new ArrayList<>();
        Iterable<Atividade> listaAtiv;
        listaAtiv=aRepo.findAll();
        for (Atividade ativ : listaAtiv) {
            listaAtividades.add(ativ);
        }
        return listaAtividades;
    }

}
