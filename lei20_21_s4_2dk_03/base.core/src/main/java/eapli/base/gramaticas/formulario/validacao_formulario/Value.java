package eapli.base.gramaticas.formulario.validacao_formulario;

import com.ibm.icu.util.ValueIterator;

public class Value {
    final Object value;

    public Value(Object value) {
        this.value = value;
    }

    public Boolean asBoolean() {
        return Boolean.parseBoolean(value.toString());
    }

    public Double asDouble() {
        return Double.parseDouble(value.toString());
    }

    public int asInteger() {
        return Integer.parseInt(value.toString());
    }

    public String asString() {
        return String.valueOf(value);
    }

    public boolean isDouble() {
        return value instanceof Double;
    }

    public boolean isInteger() {
        return value instanceof Integer;
    }

    public boolean isString() {
        return value.toString().contains("\"");
    }

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
