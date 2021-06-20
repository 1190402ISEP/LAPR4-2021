package eapli.base.pedido.domain;

/**
 * The enum Urgencia pedido.
 */
public enum UrgenciaPedido {
    /**
     * The Urgente.
     */
    URGENTE {
        public String toString() {
            return "Urgente";
        }
    },
    /**
     * The Moderada.
     */
    MODERADA {
        public String toString() {
            return "Moderada";
        }
    },
    /**
     * The Reduzida.
     */
    REDUZIDA {
        public String toString() {
            return "Reduzida";
        }
    }
}
