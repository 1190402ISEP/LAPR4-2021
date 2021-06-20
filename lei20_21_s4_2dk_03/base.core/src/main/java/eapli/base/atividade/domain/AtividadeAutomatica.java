package eapli.base.atividade.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;

/**
 * The type Atividade automatica.
 */
@Entity
public class AtividadeAutomatica extends Atividade  {

    @Embedded
    private Script script;

    /**
     * Instantiates a new Atividade automatica.
     *
     * @param descricao      the descricao
     * @param delay          the delay
     * @param ficheiroScript the ficheiroScript
     */
    public AtividadeAutomatica(String descricao, int delay, String ficheiroScript) {
        super(descricao, delay);
        Script script = Script.valueOf(ficheiroScript);
    }

    /**
     * Instantiates a new Atividade automatica.
     */
    protected AtividadeAutomatica() {
        //ORM
    }

    /**
     * Script da atividade script.
     *
     * @return the script
     */
    public Script scriptDaAtividade() {
        return this.script;
    }
}
