package eapli.base.gramaticas.script.Compilacao_Scripts;

import com.ibm.icu.util.ValueIterator;

/**
 * The type Value.
 */
public class Value {
    /**
     * The Value.
     */
    final Object value;

    /**
     * Instantiates a new Value.
     *
     * @param value the value
     */
    public Value(Object value) {
        this.value = value;
    }

    /**
     * As boolean boolean.
     *
     * @return the boolean
     */
    public Boolean asBoolean() {
        return Boolean.parseBoolean(value.toString());
    }

    /**
     * As double double.
     *
     * @return the double
     */
    public Double asDouble() {
        return Double.parseDouble(value.toString());
    }

    /**
     * As integer int.
     *
     * @return the int
     */
    public int asInteger() {
        return Integer.parseInt(value.toString());
    }

    /**
     * As string string.
     *
     * @return the string
     */
    public String asString() {
        return String.valueOf(value);
    }

    /**
     * Is double boolean.
     *
     * @return the boolean
     */
    public boolean isDouble() {
        return value instanceof Double;
    }

    /**
     * Is integer boolean.
     *
     * @return the boolean
     */
    public boolean isInteger() {
        return value instanceof Integer;
    }

    /**
     * Is string boolean.
     *
     * @return the boolean
     */
    public boolean isString() {
        return value.toString().contains("\"");
    }

    /**
     * Is elemento boolean.
     *
     * @return the boolean
     */
    public boolean isElemento() {
        return value instanceof ValueIterator.Element;
    }

    @Override
    public int hashCode() {

        if (value == null) {
            return 0;
        }

        return this.value.hashCode();
    }

    @Override
    public boolean equals(Object o) {

        if (value == o) {
            return true;
        }

        if (value == null || o == null || o.getClass() != this.getClass()) {
            return false;
        }

        Value that = (Value) o;

        return this.value.equals(that.value);
    }

    public String toString() {
        return String.valueOf(value);
    }
}
