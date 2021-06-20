package eapli.base.app.servidor.escalonadores.atividadespelasinstancias;


import eapli.base.atividade.domain.AtividadeAutomatica;
import eapli.base.utils.scriptreader.StringColors;

import java.util.List;

/**
 * The interface Escalonador interface.
 */
public interface EscalonadorAtividadesAutomaticasExecutor {

    /**
     * The constant OCUPADA.
     */
    boolean OCUPADA = true;
    /**
     * The constant LIVRE.
     */
    boolean LIVRE = false;

    /**
     * The constant CARGA_INICIAL.
     */
    int CARGA_INICIAL = 0;

    /**
     * The constant OUTPUT_WARNING_TUDO_OCUPADO.
     */
    String OUTPUT_WARNING_TUDO_OCUPADO = StringColors.YELLOW +
            "Todas as instâncias Ocupadas! \n\nAdicionada à fila de espera\n\n"
            + StringColors.RESET;

    /**
     * The constant OUTPUT_WARNING_ALGUMAS_ATIVIDADES_EM_ESPERA.
     */
    String OUTPUT_WARNING_ALGUMAS_ATIVIDADES_EM_ESPERA = StringColors.YELLOW +
            "Nem todas as atividades estão em execução!!!\n\n\n"
            + StringColors.RESET;

    /**
     * Adicionar trabalho.
     *
     * @param trabalho the trabalho
     */
    void adicionarTrabalho(AtividadeAutomatica trabalho);

    /**
     * Adicionar trabalhos.
     *
     * @param trabalhos the trabalhos
     */
    void adicionarTrabalhos(List<AtividadeAutomatica> trabalhos);

    int quantidadeTarefasPendentes();

    /**
     * Escalonar.
     */
    void escalonar();
}
