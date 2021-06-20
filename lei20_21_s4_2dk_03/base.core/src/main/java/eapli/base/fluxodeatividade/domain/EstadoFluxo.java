package eapli.base.fluxodeatividade.domain;

/**
 * The enum Estado fluxo.
 */
public enum EstadoFluxo {
    /**
     * The Ativo.
     */
    ATIVO {
        public String toString() {
            return String.format("Ativo");
        }
    },
    /**
     * The Inativo.
     */
    INATIVO{
        public String toString() {
            return String.format("Inativo");
        }
    };
}
