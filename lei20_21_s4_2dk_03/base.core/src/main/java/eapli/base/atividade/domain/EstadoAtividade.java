package eapli.base.atividade.domain;

/**
 * The enum Estado atividade.
 */
public enum EstadoAtividade {
    /**
     * The Nao iniciada.
     */
    NAO_INICIADA {
        public String toString() {
            return "Não Iniciada";
        }
    },
    /**
     * The Iniciada.
     */
    INICIADA{
        public String toString() {
            return "Iniciada";
        }
    },
    /**
     * The Terminada.
     */
    TERMINADA{
        public String toString() {
            return "Terminada";
        }
    };
}
