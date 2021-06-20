package eapli.base.utils;

import eapli.framework.domain.model.ValueObject;
import eapli.framework.strings.util.StringPredicates;

import javax.persistence.Embeddable;
import java.awt.*;

/**
 * The type Cor.
 */
@Embeddable
public class Cor implements ValueObject, Comparable<Cor> {
    private Color cor;

    /**
     * Instantiates a new Cor.
     */
    protected Cor() {
        // for ORM
    }

    /**
     * Instantiates a new Cor.
     *
     * @param cor the cor
     */
    public Cor(final String cor) {
        if (StringPredicates.isNullOrEmpty(cor)) {
            throw new IllegalArgumentException("Cor não pode ter valor null e deve ser preenchida.");
        }

        int[] rgb = new int[3];
        String[] string = cor.split(",");

        try {
            if (string.length != 3) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException("Cor deve ser preenchida com 3 valores no seguinte formato r,g,b.");
        }

        try {
            for (int i = 0; i < string.length; i++) {
                rgb[i] = Integer.parseInt(string[i]);
            }
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException("Cor deve ser preenchida com 3 números de 0 a 255.");
        }

        try {
            this.cor = new Color(rgb[0], rgb[1], rgb[2]);
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException("Os valores de rgb devem ser entre 0 e 255.");
        }
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cor)) {
            return false;
        }
        final Cor that = (Cor) o;
        return this.cor.equals(that.cor);
    }

    @Override
    public int hashCode() {
        return this.cor.hashCode();
    }

    @Override
    public String toString() {
        return "(" + cor.getRed() + "," +
                cor.getGreen() + "," +
                cor.getBlue() + ")";
    }

    @Override
    public int compareTo(final Cor arg0) {
        return cor.toString().compareTo(arg0.cor.toString());
    }
}
