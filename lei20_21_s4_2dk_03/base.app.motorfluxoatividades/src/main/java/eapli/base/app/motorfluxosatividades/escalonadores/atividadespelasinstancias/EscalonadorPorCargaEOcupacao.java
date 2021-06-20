package eapli.base.app.motorfluxosatividades.escalonadores.atividadespelasinstancias;

import eapli.base.app.motorfluxosatividades.ExecutorTarefasAutomaticas;
import eapli.base.atividade.domain.AtividadeAutomatica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The type Escalonador por carga e ocupacao.
 */
public class EscalonadorPorCargaEOcupacao implements EscalonadorAtividadesAutomaticasExecutor {
    private final List<ExecutorTarefasAutomaticas> instancias;
    private AtividadeAutomatica trabalho;
    private final List<AtividadeAutomatica> emEspera;

    /**
     * Instantiates a new Escalonador por carga e ocupacao.
     *
     * @param numeroInstancias the numero instancias
     */
    public EscalonadorPorCargaEOcupacao(int numeroInstancias) {
        this.instancias = new ArrayList<>();

        for (int i = 0; i < numeroInstancias; i++) {
            instancias.add(new ExecutorTarefasAutomaticas(LIVRE, CARGA_INICIAL));
        }
        this.emEspera = new ArrayList<>();
    }

    /**
     * Adicionar instancia.
     *
     * @param instancia the instancia
     */
    public void adicionarInstancia(ExecutorTarefasAutomaticas instancia) {
        this.instancias.add(instancia);
    }

    /**
     * Adicionar trabalho.
     *
     * @param trabalho the trabalho
     */
    public void adicionarTrabalho(AtividadeAutomatica trabalho) {
        this.trabalho = trabalho;
        escalonar();
    }

    @Override
    public void adicionarTrabalhos(List<AtividadeAutomatica> trabalhos) {
        this.emEspera.addAll(trabalhos);
        escalonar();
    }

    /**
     * Escalonar.
     */
    public void escalonar() {
        if (emEspera.size() > 0) {
            System.err.println(OUTPUT_WARNING_ALGUMAS_ATIVIDADES_EM_ESPERA);
        }
        List<ExecutorTarefasAutomaticas> temp = new ArrayList<>();
        for (ExecutorTarefasAutomaticas instancia : this.instancias) {
            if (!instancia.estaOcupada()) {
                temp.add(instancia);
            }
        }
        Collections.sort(temp);
        if (temp.isEmpty()) {
            System.err.println(OUTPUT_WARNING_TUDO_OCUPADO);
            emEspera.add(this.trabalho);//Adicionar Trabalho à fila de espera
        } else {
            if (emEspera.isEmpty()) {//Se não houver algum com prioridade este pode ser escalonado
                temp.get(0).setOcupacao(true);
                temp.get(0).aumentarCarga();
                temp.get(0).associarTrabalho(this.trabalho);
                Thread thread = new Thread(temp.get(0)); // Create thread
                thread.start(); // Starts thread running at run()
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                if (this.trabalho != null) {
                    emEspera.add(this.trabalho);
                }
                emEspera.sort(new Comparator<>() {
                    @Override
                    public int compare(AtividadeAutomatica o1, AtividadeAutomatica o2) {
                        return o1.delayDaAtividade() - o2.delayDaAtividade();
                    }
                });
                for (ExecutorTarefasAutomaticas executorTarefasAutomaticas : temp) {
                    if (emEspera.size() > 0) {
                        executorTarefasAutomaticas.setOcupacao(true);
                        executorTarefasAutomaticas.aumentarCarga();
                        executorTarefasAutomaticas.associarTrabalho(emEspera.remove(0));
                        Thread thread = new Thread(executorTarefasAutomaticas); // Create thread
                        thread.start(); // Starts thread running at run()
                        try {
                            thread.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (emEspera.size() > 0) {
                    System.err.println(OUTPUT_WARNING_ALGUMAS_ATIVIDADES_EM_ESPERA);
                }
            }
        }
        this.trabalho = null;
    }

    @Override
    public int quantidadeTarefasPendentes() {
        return this.emEspera.size();
    }
}
