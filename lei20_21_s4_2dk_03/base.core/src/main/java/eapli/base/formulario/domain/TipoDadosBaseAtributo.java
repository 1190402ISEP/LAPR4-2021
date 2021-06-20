package eapli.base.formulario.domain;

/**
 * The enum Tipo dados base atributo.
 */
public enum TipoDadosBaseAtributo {
    /**
     * The Int.
     */
    INT {
        public String toString() {
            return "Inteiro";
        }
    },
    /**
     * The Float.
     */
    FLOAT {
        public String toString() {
            return "Numero Decimal";
        }
    },
    /**
     * The String.
     */
    STRING {
        public String toString() {
            return "String";
        }
    },
    /**
     * The Boolean.
     */
    BOOLEAN {
        public String toString() {
            return "Booleano";
        }
    },
    /**
     * The Data.
     */
    DATA {
        public String toString() {
            return "Data";
        }
    };

}
