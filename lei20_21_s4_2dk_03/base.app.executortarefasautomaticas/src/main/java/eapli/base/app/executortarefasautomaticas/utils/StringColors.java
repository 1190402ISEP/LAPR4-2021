package eapli.base.app.executortarefasautomaticas.utils;

/**
 * The enum String colors.
 */
public enum StringColors {

    /**
     * The Reset.
     */

    RESET {
        public String toString() {
            return "\u001B[0m";
        }
    },
    /**
     * The Black.
     */

    BLACK {
        public String toString() {
            return "\u001B[30m";
        }
    },
    /**
     * The Red.
     */

    RED {
        public String toString() {
            return "\u001B[31m";
        }
    },
    /**
     * The Green.
     */

    GREEN {
        public String toString() {
            return "\u001B[32m";
        }
    },
    /**
     * The Yellow.
     */

    YELLOW {
        public String toString() {
            return "\u001B[33m";
        }
    },
    /**
     * The Blue.
     */

    BLUE {
        public String toString() {
            return "\u001B[34m";
        }
    },
    /**
     * The Purple.
     */

    PURPLE {
        public String toString() {
            return "\u001B[35m";
        }
    },
    /**
     * The Cyan.
     */

    CYAN {
        public String toString() {
            return "\u001B[36m";
        }
    },
    /**
     * The White.
     */

    WHITE {
        public String toString() {
            return "\u001B[37m";
        }
    }
}
