package eapli.base.utils;

/**
 * The type Password generator.
 */
public final class PasswordGenerator {

    /**
     * Generate password string.
     *
     * @return the generated password
     */
    public String generatePassword() {
        return generate();
    }

    private static String generate() {
        final String[] DIGITOS = {"0", "1", "b", "2", "4", "5", "6", "7", "8", "9"};
        final String[] LETRAS_MAIUSCULAS = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
                "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        final String[] LETRAS_MINUSCULAS = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "y", "x", "z"};
        final String[] SIMBOLOS = {"$","#","!","%","&","?"};

        StringBuilder gen = new StringBuilder();

        gen.append(LETRAS_MINUSCULAS[randomNumber(LETRAS_MINUSCULAS.length)]);
        gen.append(DIGITOS[randomNumber(DIGITOS.length)]);
        gen.append(LETRAS_MAIUSCULAS[randomNumber(LETRAS_MAIUSCULAS.length)]);
        gen.append(DIGITOS[randomNumber(DIGITOS.length)]);
        gen.append(LETRAS_MINUSCULAS[randomNumber(LETRAS_MINUSCULAS.length)]);
        gen.append(LETRAS_MAIUSCULAS[randomNumber(LETRAS_MAIUSCULAS.length)]);
        gen.append(LETRAS_MAIUSCULAS[randomNumber(LETRAS_MAIUSCULAS.length)]);
        gen.append(SIMBOLOS[randomNumber(SIMBOLOS.length)]);
        gen.append(LETRAS_MAIUSCULAS[randomNumber(LETRAS_MAIUSCULAS.length)]);
        gen.append(DIGITOS[randomNumber(DIGITOS.length)]);
        gen.append(SIMBOLOS[randomNumber(SIMBOLOS.length)]);
        gen.append(LETRAS_MINUSCULAS[randomNumber(LETRAS_MINUSCULAS.length)]);



        return gen.toString();
    }

    private static int randomNumber(int size){
        return  (int) (Math.random() * size);
    }
}
