package eapli.base.pedido.domain;

/**
 * The enum Estagio pedido.
 */
public enum EstagioPedido {
    /**
     * The Aguardar.
     */
    AGUARDAR {
        public String toString() {
            return "Aguardar";
        }
    },
    /**
     * The Aguardar aprovacao.
     */
    AGUARDAR_APROVACAO {
        public String toString() {
            return "Aguardar aprovação";
        }
    },
    /**
     * The Aguardar resolucao.
     */
    AGUARDAR_RESOLUCAO {
        public String toString() {
            return "Aguardar resolução";
        }
    }
}
