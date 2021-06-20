package eapli.base.servico.domain;

/**
 * The enum Estado servico.
 */
public enum EstadoServico {
    /**
     * The Completo.
     */
    COMPLETO {
        public String toString() {
            return "Completo";
        }
    },
    /**
     * The Incompleto.
     */
    INCOMPLETO {
        public String toString() {
            return "Incompleto";
        }
    }
}
