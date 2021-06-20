package eapli.base.app.servidor.escalonadores.atividadespelasinstancias;

/**
 * The type Instancia.
 */
public class Instancia  implements Comparable<Instancia>{

     //TODO APENAS SERVE PARA TESTAR!!!
    private boolean ocupacao;
    private int carga;
    //TODO APENAS SERVE PARA TESTAR!!!

    /**
     * Instantiates a new Instancia.
     *
     * @param ocupacao the ocupacao
     * @param carga    the carga
     */
    public Instancia(boolean ocupacao, int carga) {
        this.ocupacao = ocupacao;
        this.carga = carga;
    }

    /**
     * Esta ocupada boolean.
     *
     * @return the boolean
     */
    public boolean estaOcupada() {
        return this.ocupacao;
    }

    /**
     * Gets carga.
     *
     * @return the carga
     */
    public int getCarga() {
        return this.carga;
    }
    //TODO APENAS SERVE PARA TESTAR!!!

    @Override
    public int compareTo(Instancia o) {
       
        return this.getCarga() - o.getCarga();
    }

    /**
     * Sets ocupacao.
     *
     * @param b the b
     */
    public void setOcupacao(boolean b) {
        this.ocupacao=b;
    }

    /**
     * Aumentar carga.
     */
    public void aumentarCarga() {
        this.carga++;
    }
}
