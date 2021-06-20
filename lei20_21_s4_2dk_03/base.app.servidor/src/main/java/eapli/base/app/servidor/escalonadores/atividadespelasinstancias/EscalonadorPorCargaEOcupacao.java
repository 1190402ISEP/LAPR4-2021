package eapli.base.app.servidor.escalonadores.atividadespelasinstancias;

import eapli.base.app.servidor.ExecutorTarefasAutomaticas;
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
     */
    public EscalonadorPorCargaEOcupacao() {
        this.instancias = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
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
        for (AtividadeAutomatica pos : trabalhos) {
            this.emEspera.add(pos);
        }
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
        for (int i = 0; i < this.instancias.size(); i++) {
            if (!instancias.get(i).estaOcupada()) {
                temp.add(instancias.get(i));
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
                Thread sthread = new Thread(temp.get(0)); // Create thread
                sthread.start(); // Starts thread running at run()
                try {
                    sthread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                if (this.trabalho != null) {
                    emEspera.add(this.trabalho);
                }
                Collections.sort(emEspera, new Comparator<AtividadeAutomatica>() {
                    @Override
                    public int compare(AtividadeAutomatica o1, AtividadeAutomatica o2) {
                        return o1.delayDaAtividade() - o2.delayDaAtividade();
                    }
                });
                for (int i = 0; i < temp.size(); i++) {
                    if (emEspera.size() > 0) {
                        temp.get(i).setOcupacao(true);
                        temp.get(i).aumentarCarga();
                        temp.get(i).associarTrabalho(emEspera.remove(0));
                        Thread sthread = new Thread(temp.get(i)); // Create thread
                        sthread.start(); // Starts thread running at run()
                        try {
                            sthread.join();
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
