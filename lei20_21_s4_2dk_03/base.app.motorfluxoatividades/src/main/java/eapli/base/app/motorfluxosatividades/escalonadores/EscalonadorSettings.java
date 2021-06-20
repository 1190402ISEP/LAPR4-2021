package eapli.base.app.motorfluxosatividades.escalonadores;

import eapli.base.app.motorfluxosatividades.escalonadores.assignartarefasacolaboradores.AtribuidorDeTarefasFCFS;
import eapli.base.app.motorfluxosatividades.escalonadores.assignartarefasacolaboradores.AtribuidorDeTarefasInteligente;
import eapli.base.app.motorfluxosatividades.escalonadores.assignartarefasacolaboradores.EscalonadoresAssignarTarefas;
import eapli.base.app.motorfluxosatividades.escalonadores.atividadespelasinstancias.EscalonadorAtividadesAutomaticasExecutor;
import eapli.base.app.motorfluxosatividades.escalonadores.atividadespelasinstancias.EscalonadorFCFSAtividadeAutomaticaInstancia;
import eapli.base.app.motorfluxosatividades.escalonadores.atividadespelasinstancias.EscalonadorPorCargaEOcupacao;
import eapli.base.utils.scriptreader.StringColors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * The type Escalonador settings.
 */
public class EscalonadorSettings {
    private static final Logger LOGGER = LoggerFactory.getLogger(EscalonadorSettings.class);
    /**
     * The Application file.
     */
    static String APPLICATION_FILE = "escalonamento.properties";

    /**
     * The Key algoritmo de atribuicao de tarefas.
     */
    static String KEY_ALGORITMO_DE_ATRIBUICAO_DE_TAREFAS = "atribuidor_de_tarefas";

    /**
     * The Key algoritmo tarefas por instancia.
     */
    static String KEY_ALGORITMO_TAREFAS_POR_INSTANCIA = "tarefa_por_instancia";

    /**
     * The Valor default numero instancias.
     */
    static int VALOR_DEFAULT_NUMERO_INSTANCIAS = 5;
    /**
     * The Key maximo instancias.
     */
    static String KEY_MAXIMO_INSTANCIAS = "maximo_instancias";

    private Properties appProperties;

    /**
     * Instantiates a new Escalonador settings.
     */
    public EscalonadorSettings() {

        try {
            appProperties = getProp();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private Properties getProp() throws IOException {
        Properties props = new Properties();
        InputStream file = this.getClass().getClassLoader().getResourceAsStream(APPLICATION_FILE);
        props.load(file);
        return props;

    }

    /**
     * Atribuidor de tarefas escalonadores assignar tarefas.
     *
     * @return the escalonadores assignar tarefas
     */
    public EscalonadoresAssignarTarefas atribuidorDeTarefas() {
        if (appProperties.getProperty(KEY_ALGORITMO_DE_ATRIBUICAO_DE_TAREFAS).equalsIgnoreCase("FCFS")) {
            loggerInfo("FCFS escolhido para atribuir tarefas automaticamente");

            return new AtribuidorDeTarefasFCFS();
        }
        if (appProperties.getProperty(KEY_ALGORITMO_DE_ATRIBUICAO_DE_TAREFAS).equalsIgnoreCase("INTELIGENTE")) {
            loggerInfo("INTELIGENTE escolhido para atribuir tarefas automaticamente");
            return new AtribuidorDeTarefasInteligente();
        }
        loggerInfo("*DEFAULT* -> FCFS escolhido para atribuir tarefas automaticamente");
        return new AtribuidorDeTarefasFCFS();   //Default
    }

    /**
     * Gets application file.
     *
     * @return the application file
     */
    public String getApplicationFile() {
        return APPLICATION_FILE;
    }

    private void loggerInfo(String aviso) {
        LOGGER.info(String.format("%s %s %s \n", StringColors.BLUE, aviso, StringColors.RESET));
    }

    /**
     * Escalonador tarefas instancia escalonador atividades automaticas executor.
     *
     * @return the escalonador atividades automaticas executor
     */
    public EscalonadorAtividadesAutomaticasExecutor escalonadorTarefasInstancia() {
        if (appProperties.getProperty(KEY_ALGORITMO_TAREFAS_POR_INSTANCIA).equalsIgnoreCase("FCFS")) {
            loggerInfo("FCFS escolhido para escalonar as tarefas por instancia\n\n");
            return new EscalonadorFCFSAtividadeAutomaticaInstancia(quantidadeTarefas());
        }
        if (appProperties.getProperty(KEY_ALGORITMO_TAREFAS_POR_INSTANCIA).equalsIgnoreCase("CARGA_DISPONIBILIDADE")) {
            loggerInfo("CARGA DISPONIBILIDADE escolhido para escalonar as tarefas por instancia");
            return new EscalonadorPorCargaEOcupacao(quantidadeTarefas());
        }

        loggerInfo("*DEFAULT* -> FCFS escolhido para escalonar as tarefas por instancia");

        return new EscalonadorFCFSAtividadeAutomaticaInstancia(quantidadeTarefas());    //Default
    }

    /**
     * Quantidade tarefas int.
     *
     * @return the int
     */
    public int quantidadeTarefas() {
        int value;
        try {
            value = Integer.parseInt(appProperties.getProperty(KEY_MAXIMO_INSTANCIAS).trim());
            loggerInfo("Total de instâncias de executor de atividades automaticas" + value);

        } catch (IllegalArgumentException | IllegalStateException exc) {
            loggerInfo("*DEFAULT* -> 5 instâncias de executor de atividades automaticas");
            return VALOR_DEFAULT_NUMERO_INSTANCIAS;
        }
        return value;
    }
}
