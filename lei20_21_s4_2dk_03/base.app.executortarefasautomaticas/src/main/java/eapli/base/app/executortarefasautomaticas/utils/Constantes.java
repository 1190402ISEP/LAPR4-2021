package eapli.base.app.executortarefasautomaticas.utils;

public interface Constantes {
    /*PORTOS*/
    int PORTO_EXECUTOR_TAREFAS_AUTOMATICAS = 10335;
    int PORTO_SERVIDORES=10424;
    int VERSAO = 0;

    /*IP´S*/
    String IP_SERVIDOR_MOTOR_DE_FLUXOS_DE_ATIVIDADES = "10.9.21.168";

    /*CÓDIGOS*/

    int TEST = 0;//0|Teste - Pedido de teste. Este pedido não transporta dados

    int FIM = 1;//1|Fim - Pedido de fim de ligação.

    int ENTENDIDO = 2; //2|Entendido-Resposta vazia (não transporta dados).

    // um conjunto de dados mais extenso.

    int EXECUTAR_TAREFA_AUTOMATICA = 8;

    /*OFFSETS NO ARRAY DE BYTES*/

    int POSICAO_VERSAO = 0;
    int POSICAO_CODIGO = 1;
    int POSICAO_NUMERO_BYTES_DADOS = 2;
    int POSICAO_INICIAL_DADOS = 7;

    int EXIT_SUCCESS = 0;
    int EXIT_FAILURE = 1;

    /*UTEIS A PROGRAMACAO*/
    int NUMERO_MAXIMO_BYTE = 255;

    int ERROR = -1;

    /*TCP->TLS(Servidor)*/
    String TRUSTED_STORE = "server2_J.jks";

    /*TCP->TLS(Encriptação)*/

    String KEYSTORE_PASS = "forgotten2";


}
