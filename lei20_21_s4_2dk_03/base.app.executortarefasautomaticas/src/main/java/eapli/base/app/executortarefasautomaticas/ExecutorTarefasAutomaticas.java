package eapli.base.app.executortarefasautomaticas;

import eapli.base.atividade.domain.AtividadeAutomatica;
import eapli.base.atividade.domain.EstadoAtividade;

import java.io.IOException;
import java.io.InputStream;

/**
 * The type Executor tarefas automaticas.
 */
public class ExecutorTarefasAutomaticas extends Thread implements Comparable<ExecutorTarefasAutomaticas> {
    private boolean ocupacao;
    private int carga;
    private AtividadeAutomatica trabalho;

    /**
     * Instantiates a new Executor tarefas automaticas.
     */
    public ExecutorTarefasAutomaticas(boolean ocupacao, int carga) {
        this.ocupacao = ocupacao;
        this.carga = carga;
    }

    /**
     * Sets ocupacao.
     *
     * @param b the b
     */
    public synchronized void setOcupacao(boolean b) {
        this.ocupacao = b;
    }

    /**
     * Aumentar carga.
     */
    public synchronized void aumentarCarga() {
        this.carga++;
    }

    @Override
    public int compareTo(ExecutorTarefasAutomaticas o) {

        return this.getCarga() - o.getCarga();
    }

    /**
     * Esta ocupada boolean.
     *
     * @return the boolean
     */
    public synchronized boolean estaOcupada() {
        return this.ocupacao;
    }

    /**
     * Gets carga.
     *
     * @return the carga
     */
    public synchronized int getCarga() {
        return this.carga;
    }

    public synchronized void associarTrabalho(AtividadeAutomatica poll) {
        this.trabalho = poll;
    }

    @Override
    public void run() {
        System.out.println(this.trabalho);

        setOcupacao(true);
        try {
            Thread.currentThread().wait(2000);//simular
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        String args = this.trabalho.scriptDaAtividade().conteudoFicheiro();
        //TODO gramática

        Runtime runtime = Runtime.getRuntime();

        try {
            Process p1 = runtime.exec("cmd /c start " + this.trabalho.scriptDaAtividade().caminho());
            InputStream is = p1.getInputStream();

            int i = 0;

            while ((i = is.read()) != -1) {
                System.out.print((char) i);
            }

            //se a task for concluida passar o estado a terminada
            this.trabalho.setEstadoAtividade(EstadoAtividade.TERMINADA);
            setOcupacao(false);
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }

        setOcupacao(false);

    }

}
