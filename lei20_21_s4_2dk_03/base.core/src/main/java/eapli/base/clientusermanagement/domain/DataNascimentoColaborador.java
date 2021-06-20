package eapli.base.clientusermanagement.domain;

import eapli.framework.domain.model.ValueObject;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Calendar;

/**
 * The type Data nascimento colaborador.
 */
@Embeddable
public class DataNascimentoColaborador implements ValueObject, Comparable<DataNascimentoColaborador> {
    @Temporal(TemporalType.DATE)
    private Calendar dataNascimento;
    private String date;

    /**
     * Instantiates a new Data nascimento colaborador.
     */
    protected DataNascimentoColaborador() {
        //ORM
    }

    /**
     * Instantiates a new Data nascimento colaborador.
     *
     * @param dataNascimento the data nascimento
     */
    public DataNascimentoColaborador(Calendar dataNascimento) {
        Calendar hoje = Calendar.getInstance();
        if (dataNascimento.compareTo(hoje) <= 0) {
            throw new IllegalArgumentException("Não pode ser a data de hoje!");
        }
        this.dataNascimento = dataNascimento;
    }

    /**
     * Instantiates a new Data nascimento colaborador.
     *
     * @param ano the ano
     * @param mes the mes
     * @param dia the dia
     */
    public DataNascimentoColaborador(int ano, int mes, int dia) {
        Calendar hoje = Calendar.getInstance();
        Calendar test = Calendar.getInstance();
        test.set(ano, mes, dia);
        date = ano + "/" + mes + "/" + dia;
        if (test.compareTo(hoje) == 0) {
            throw new IllegalArgumentException("Não pode ser a data de hoje!");
        }
        this.dataNascimento = test;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataNascimentoColaborador)) {
            return false;
        }

        final DataNascimentoColaborador that = (DataNascimentoColaborador) o;
        return this.dataNascimento.equals(that.dataNascimento);
    }

    @Override
    public int hashCode() {
        return this.dataNascimento.hashCode();
    }

    @Override
    public int compareTo(final DataNascimentoColaborador arg0) {
        return dataNascimento.compareTo(arg0.dataNascimento);
    }

    @Override
    public String toString() {
        return date;
    }
}
