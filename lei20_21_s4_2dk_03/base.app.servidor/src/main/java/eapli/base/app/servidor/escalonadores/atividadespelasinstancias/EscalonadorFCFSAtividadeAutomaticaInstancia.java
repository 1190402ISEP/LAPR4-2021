package eapli.base.app.servidor.escalonadores.atividadespelasinstancias;

import eapli.base.app.servidor.ExecutorTarefasAutomaticas;
import eapli.base.atividade.domain.AtividadeAutomatica;

import java.util.*;

/**
 * The type Escalonador fcfs.
 */
public class EscalonadorFCFSAtividadeAutomaticaInstancia implements EscalonadorAtividadesAutomaticasExecutor {
    private AtividadeAutomatica trabalho;
    private List<ExecutorTarefasAutomaticas> instancias;
    private Queue<AtividadeAutomatica> emEspera;

    /**
     * Instantiates a new Escalonador fcfs.
     */
    public EscalonadorFCFSAtividadeAutomaticaInstancia() {
        /*Criar Executores para usar posteriormente*/
        this.instancias = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
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
        for (AtividadeAutomatica pos : trabalhos) {
            this.emEspera.add(pos);
        }
        escalonar();
    }

    public void escalonar() {

        if (emEspera.size() > 0) {
            System.err.println(OUTPUT_WARNING_ALGUMAS_ATIVIDADES_EM_ESPERA);
        }
        List<ExecutorTarefasAutomaticas> temp = new ArrayList<>();
        for (int i = 0; i < this.instancias.size(); i++) {
            if (!instancias.get(i).estaOcupada()) {
                temp.add(instancias.get(i));
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
                for (int i = 0; i < temp.size(); i++) {
                    if (emEspera.size() > 0) {
                        temp.get(i).setOcupacao(true);
                        temp.get(i).aumentarCarga();
                        temp.get(i).associarTrabalho(emEspera.poll());
                        Thread thread = new Thread(temp.get(i)); // Create thread
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
