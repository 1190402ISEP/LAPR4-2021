package eapli.base.atividade.domain;

import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.equipa.domain.Equipa;
import eapli.base.formulario.domain.Formulario;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;


/**
 * The type Atividade manual.
 */
@Entity
public class AtividadeManual extends Atividade {

    @OneToOne
    private Colaborador colaboradorResponsavel;
    @OneToOne
    private Equipa equipaResponsavel;
    @OneToOne
    private Formulario formulario;
    @OneToOne
    private Colaborador colaboradorAssignado;
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAtribuicao;

    protected AtividadeManual() {
        //ORM
    }

    /**
     * Instantiates a new Atividade manual.
     *
     * @param descricao the descricao
     * @param delay     the delay
     */
    public AtividadeManual(String descricao, int delay) {
        super(descricao, delay);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Associar equipa para efetuar atividade.
     *
     * @param aEquipa the a equipa
     */
    public void associarEquipaParaEfetuarAtividade(Equipa aEquipa) {
        this.equipaResponsavel = aEquipa;
    }

    public void associarColaborador(Colaborador aColaborador) {
        this.colaboradorResponsavel = aColaborador;
    }

    /**
     * Associar formulario.
     *
     * @param aFormulario the a formulario
     */
    public void associarFormulario(Formulario aFormulario) {
        this.formulario = aFormulario;
    }

    public void assign(Colaborador colab) {
        this.colaboradorAssignado = colab;
        this.dataAtribuicao = Calendar.getInstance();
    }
}
