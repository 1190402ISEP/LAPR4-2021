package eapli.base.app.motorfluxosatividades.escalonadores.atividadespelasinstancias;

import eapli.base.app.motorfluxosatividades.ExecutorTarefasAutomaticas;
import eapli.base.atividade.domain.AtividadeAutomatica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * The type Escalonador fcfs.
 */
public class EscalonadorFCFSAtividadeAutomaticaInstancia implements EscalonadorAtividadesAutomaticasExecutor {
    private AtividadeAutomatica trabalho;
    private final List<ExecutorTarefasAutomaticas> instancias;
    private final Queue<AtividadeAutomatica> emEspera;

    /**
     * Instantiates a new Escalonador fcfs.
     *
     * @param numeroInstancias the numero instancias
     */
    public EscalonadorFCFSAtividadeAutomaticaInstancia(int numeroInstancias) {
        /*Criar Executores para usar posteriormente*/
        this.instancias = new ArrayList<>();

        for (int i = 0; i < numeroInstancias; i++) {
            instancias.add(new ExecutorTarefasAutomaticas(LIVRE, CARGA_INICIAL));
        }
        this.emEspera = new LinkedList<>();
    }

    public void adicionarTrabalho(AtividadeAutomatica element) {
        this.trabalho = element;
        escalonar();
    }

    @Override
    public void adicionarTrabalhos(List<AtividadeAutomatica> trabalhos) {
        this.emEspera.addAll(trabalhos);
        escalonar();
    }

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
        if (temp.isEmpty()) {
            System.err.println(OUTPUT_WARNING_TUDO_OCUPADO);
            emEspera.add(this.trabalho);//Adicionar Trabalho à fila de espera
            System.err.println(OUTPUT_WARNING_ALGUMAS_ATIVIDADES_EM_ESPERA);
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
                for (ExecutorTarefasAutomaticas executorTarefasAutomaticas : temp) {
                    if (emEspera.size() > 0) {
                        executorTarefasAutomaticas.setOcupacao(true);
                        executorTarefasAutomaticas.aumentarCarga();
                        executorTarefasAutomaticas.associarTrabalho(emEspera.poll());
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
