package eapli.base.pedido.domain;

/**
 * The enum Estado pedido.
 */
public enum EstadoPedido {
    /**
     * The Criado.
     */
    CRIADO {
        public String toString() {
            return "Criado";
        }
    },
    /**
     * The Submetido.
     */
    SUBMETIDO {
        public String toString() {
            return "Submetido";
        }
    },
    /**
     * The Em aprovação.
     */
    EM_APROVACAO {
        public String toString() {
            return "Em aprovação";
        }
    },
    /**
     * The Aprovado.
     */
    APROVADO {
        public String toString() {
            return "Aprovado";
        }
    },
    /**
     * The Rejeitado.
     */
    REJEITADO {
        public String toString() {
            return "Rejeitado";
        }
    },
    /**
     * The Em Resolução.
     */
    EM_RESOLUCAO {
        public String toString() {
            return "Em Resolução";
        }
    },
    /**
     * The Concluído.
     */
    CONCLUIDO {
        public String toString() {
            return "Concluído";
        }
    }
}
