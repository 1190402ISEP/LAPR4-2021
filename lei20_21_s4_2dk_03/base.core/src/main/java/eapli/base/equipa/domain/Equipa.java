package eapli.base.equipa.domain;

import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.tipoequipa.domain.CodigoInternoUnicoTipoEquipa;
import eapli.base.tipoequipa.domain.TipoEquipa;
import eapli.base.tipoequipa.repositories.TipoEquipaRepository;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Equipa.
 */
@Entity
public class Equipa implements AggregateRoot<CodigoUnicoEquipa> {
    @Version
    private Long version;
    @EmbeddedId
    private CodigoUnicoEquipa codigoUnicoEquipa;
    @Embedded
    private ObjetivoDistintoEquipa objetivoDistintoEquipa;
    @Embedded
    private Acronimo acronimo;
    @OneToOne(fetch = FetchType.EAGER)
    private TipoEquipa tipoEquipa;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Colaborador> colaboradores;
    private String designacaoEquipa;

    /**
     * Instantiates a new Equipa.
     */
    protected Equipa() {
        // for ORM
    }

    /**
     * Instantiates a new Equipa.
     *
     * @param codigoUnicoEquipa      the codigo unico equipa
     * @param designacaoEquipa       the designacao equipa
     * @param objetivoDistintoEquipa the objetivo distinto equipa
     * @param acronimo               the acronimo
     * @param tipoEquipa             the tipo equipa
     */
    public Equipa(final CodigoUnicoEquipa codigoUnicoEquipa, String designacaoEquipa, ObjetivoDistintoEquipa objetivoDistintoEquipa,
                  Acronimo acronimo, TipoEquipa tipoEquipa) {
        this.codigoUnicoEquipa = codigoUnicoEquipa;
        this.designacaoEquipa = designacaoEquipa;
        this.objetivoDistintoEquipa = objetivoDistintoEquipa;
        this.acronimo = acronimo;
        this.tipoEquipa = tipoEquipa;
        this.colaboradores = new ArrayList<>();
    }

    /**
     * Instantiates a new Equipa.
     *
     * @param codigoUnicoEquipa            the codigo unico equipa
     * @param designacaoEquipa             the designacao equipa
     * @param objetivoDistintoEquipa       the objetivo distinto equipa
     * @param acronimo                     the acronimo
     * @param codigoInternoUnicoTipoEquipa the codigo interno unico tipo equipa
     */
    public Equipa(String codigoUnicoEquipa, String designacaoEquipa, String objetivoDistintoEquipa,
                  String acronimo, String codigoInternoUnicoTipoEquipa) {
        TipoEquipaRepository terepo = PersistenceContext.repositories().tipoEquipas();

        this.codigoUnicoEquipa = new CodigoUnicoEquipa(codigoUnicoEquipa);
        this.designacaoEquipa = designacaoEquipa;
        this.objetivoDistintoEquipa = new ObjetivoDistintoEquipa(objetivoDistintoEquipa);
        this.acronimo = new Acronimo(acronimo);
        if (terepo.ofIdentity(new CodigoInternoUnicoTipoEquipa(codigoInternoUnicoTipoEquipa)).isPresent()) {
            this.tipoEquipa = terepo.ofIdentity(new CodigoInternoUnicoTipoEquipa(codigoInternoUnicoTipoEquipa)).get();
        } else {
            throw new IllegalStateException("Nenhum tipo de equipa com código interno único: " + codigoInternoUnicoTipoEquipa);
        }
        this.colaboradores = new ArrayList<>();
    }

    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public CodigoUnicoEquipa identity() {
        return this.codigoUnicoEquipa;
    }

    @Override
    public String toString() {
        return "\n--------------------------Equipa--------------------------" +
                "\nCódigo único -> " + codigoUnicoEquipa +
                "\nObjetivo distinto -> " + objetivoDistintoEquipa +
                "\nAcrónimo -> " + acronimo +
                "\nTipo -> " + tipoEquipa.identity() +
                "\nDesignação -> " + designacaoEquipa +
                "\nQuantidade colaboradores -> " + colaboradores.size() +
                '\n';
    }

    /**
     * Add colaboradores.
     *
     * @param colab the colab
     * @return the boolean
     */
    public boolean addColaboradores(Colaborador colab) {
        if (!this.colaboradores.contains(colab)) {
            this.colaboradores.add(colab);
            return true;
        } else {
            System.out.println(StringColors.YELLOW + "\n\nColaborador " + colab.identity() + " já se encontra na equipa com código único " + this.codigoUnicoEquipa + ".\n\n" + StringColors.RESET);
            return false;
        }
    }

    /**
     * Remove colaboradores.
     *
     * @param colab the colab
     * @return the boolean
     */
    public boolean removeColaboradores(Colaborador colab) {
        if (this.colaboradores.contains(colab)) {
            this.colaboradores.remove(colab);
            return true;
        } else {
            System.out.println(StringColors.YELLOW + "\n\nColaborador " + colab.identity() + " não se encontra na equipa com código único " + this.codigoUnicoEquipa + ".\n\n" + StringColors.RESET);
            return false;
        }
    }

    /**
     * Get colaboradores list.
     *
     * @return the list
     */
    public List<Colaborador> getColaboradores() {
        return this.colaboradores;
    }

    public CodigoUnicoEquipa getCodigoUnicoEquipa(){return this.codigoUnicoEquipa;}
}
