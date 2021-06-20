package eapli.base.equipa.domain;

import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.tipoequipa.domain.CodigoInternoUnicoTipoEquipa;
import eapli.base.tipoequipa.domain.TipoEquipa;
import eapli.base.tipoequipa.repositories.TipoEquipaRepository;
import eapli.framework.domain.model.DomainFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Equipa builder.
 */
public class EquipaBuilder implements DomainFactory<Equipa> {
    private CodigoUnicoEquipa codigoUnicoEquipa;
    private String designacaoEquipa;
    private ObjetivoDistintoEquipa objetivoDistintoEquipa;
    private Acronimo acronimo;
    private TipoEquipa tipoEquipa;
    private final List<Colaborador> colaboradores = new ArrayList<>();

    /**
     * With codigo unico equipa equipa builder.
     *
     * @param CodigoUnicoEquipa the codigo unico equipa
     * @return the equipa builder
     */
    public EquipaBuilder withCodigoUnicoEquipa(String CodigoUnicoEquipa) {
        this.codigoUnicoEquipa = new CodigoUnicoEquipa(CodigoUnicoEquipa);
        return this;
    }

    /**
     * With designacao equipa equipa builder.
     *
     * @param designacaoEquipa the designacao equipa
     * @return the equipa builder
     */
    public EquipaBuilder withDesignacaoEquipa(String designacaoEquipa) {
        this.designacaoEquipa = designacaoEquipa;
        return this;
    }

    /**
     * With objetivo distinto equipa equipa builder.
     *
     * @param objetivoDistintoEquipa the objetivo distinto equipa
     * @return the equipa builder
     */
    public EquipaBuilder withObjetivoDistintoEquipa(String objetivoDistintoEquipa) {
        this.objetivoDistintoEquipa = new ObjetivoDistintoEquipa(objetivoDistintoEquipa);
        return this;
    }

    /**
     * With acronimo equipa builder.
     *
     * @param acronimo the acronimo
     * @return the equipa builder
     */
    public EquipaBuilder withAcronimo(String acronimo) {
        this.acronimo = new Acronimo(acronimo);
        return this;
    }

    /**
     * With tipo equipa equipa builder.
     *
     * @param codigoInternoUnicoTipoEquipa the codigo interno unico tipo equipa
     */
    public EquipaBuilder withTipoEquipa(String codigoInternoUnicoTipoEquipa) {
        TipoEquipaRepository teRepo = PersistenceContext.repositories().tipoEquipas();
        if (teRepo.containsOfIdentity(new CodigoInternoUnicoTipoEquipa(codigoInternoUnicoTipoEquipa))) {
            this.tipoEquipa = teRepo.ofIdentity(new CodigoInternoUnicoTipoEquipa(codigoInternoUnicoTipoEquipa)).get();
            return this;
        } else {
            throw new IllegalArgumentException("Introduza um código único válido.");
        }
    }

    /**
     * With tipo equipa.
     *
     * @param tipoEquipa the tipo equipa
     * @return the equipa builder
     */
    public EquipaBuilder withTipoEquipa(TipoEquipa tipoEquipa) {
        this.tipoEquipa = tipoEquipa;
        return this;
    }

    /**
     * Add colaborador equipa builder.
     *
     * @param colaborador the colaborador
     * @return the equipa builder
     */
    public EquipaBuilder addColaborador(Colaborador colaborador) {
        this.colaboradores.add(colaborador);
        return this;
    }

    /**
     * Add colaborador.
     *
     * @param numeroMecanografico the numero mecanografico
     */
    public EquipaBuilder addColaborador(String numeroMecanografico) {
        ColaboradorRepository colabRep = PersistenceContext.repositories().colaboradores();
        if (colabRep.containsOfIdentity(new MecanographicNumber(numeroMecanografico))) {
            this.colaboradores.add(colabRep.ofIdentity(new MecanographicNumber(numeroMecanografico)).get());
            return this;
        } else {
            throw new IllegalArgumentException("Introduza um número mecanográfico válido.");
        }
    }

    @Override
    public Equipa build() {
        Equipa equipa = new Equipa(codigoUnicoEquipa, designacaoEquipa, objetivoDistintoEquipa, acronimo, tipoEquipa);
        if (!this.colaboradores.isEmpty()) {
            for (Colaborador colab : colaboradores) {
                equipa.addColaboradores(colab);
            }
        }
        return equipa;
    }
}
