package eapli.base.app.portal.utils;

public interface Constantes {
    /*PORTOS*/
    int PORTO_MOTOR_FLUXO_DASHBOARD = 55557;
    String MOTORDASHBOARD_URL = "http://localhost:55557";
    int ERROR = -1;


    /*PORTOS*/
    int PORTO_Executor_Tarefas_Automaticas = 10335;
    int VERSAO = 0;
    int PORTO_SERVIDORES = 10335;

    /*IP´S*/
    String IP_SERVIDOR_MOTOR_DE_FLUXOS_DE_ATIVIDADES = "10.9.21.79";


    /*CÓDIGOS*/

    int TEST = 0;//0|Teste - Pedido de teste. Este pedido não transporta dados

    int FIM = 1;//1|Fim - Pedido de fim de ligação.

    int ENTENDIDO = 2; //2|Entendido-Resposta vazia (não transporta dados).

    int SEGMENTO = (byte) 251; //255|Segmento - identifica os dados transportados como sendo uma parte de
    // um conjunto de dados mais extenso.


    //TODO adicionar mais códigos de operação
    int GET_TAREFAS_PENDENTES = 3;
    int GET_COLABORADOR = 4;
    int DASHBOARD_WEB = 5;

    int GESTAO_FLUXO = 5;
    int AVANCAR_FLUXO = 6;
    int EXECUTAR_TAREFA_AUTOMATICA = 8;

    /*OFFSETS NO ARRAY DE BYTES*/

    int POSICAO_VERSAO = 0;
    int POSICAO_CODIGO = 1;
    int POSICAO_NUMERO_BYTES_DADOS = 2;
    int POSICAO_INICIAL_DADOS = 3;



    /*MOTOR DE FLUXO DE ATIVIDADES*/

    int AVANCAR_NO_MOTOR_FLUXO = 150;

    /*UTEIS A PROGRAMACAO*/
    int NUMERO_MAXIMO_BYTE = 255;


    int NUMERO_DE_BYTES_MAXIMO = 258;

    int EXIT_SUCCESS = 0;
    int EXIT_FAILURE = 1;

    /*TCP->TLS(Servidor)*/
    String TRUSTED_STORE = "server1_J.jks";

    /*TCP->TLS(Encriptação)*/

    String KEYSTORE_PASS = "forgotten1";

    //TODO preciso definir

    String MOTOR_FLUXOS_ATIVIDADES_TRUSTED_STORE = "client2_J.jks";

}
