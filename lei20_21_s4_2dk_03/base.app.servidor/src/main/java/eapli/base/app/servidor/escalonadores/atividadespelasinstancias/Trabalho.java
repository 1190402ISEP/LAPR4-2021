package eapli.base.app.servidor.escalonadores.atividadespelasinstancias;

/**
 * The type Trabalho.
 *
 * @author anton
 */
public class Trabalho implements Comparable<Trabalho> {
    private int delay;
    private int prioridade;

    /**
     * Instantiates a new Trabalho.
     *
     * @param delay      the delay
     * @param prioridade the prioridade
     */
    public Trabalho(int delay, int prioridade) {
        this.delay = delay;
        this.prioridade = prioridade;
    }

    /**
     * Gets delay.
     *
     * @return the delay
     */
    public int getDelay() {
        return delay;
    }

    /**
     * Sets delay.
     *
     * @param delay the delay
     */
    public void setDelay(int delay) {
        this.delay = delay;
    }

    @Override
    public int compareTo(Trabalho o) {
        if (this.prioridade == o.prioridade) {
            return this.delay - o.delay;
        }
        return this.prioridade - o.prioridade;
    }


}
