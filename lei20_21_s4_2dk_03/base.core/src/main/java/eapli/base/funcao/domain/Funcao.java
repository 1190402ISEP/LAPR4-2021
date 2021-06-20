package eapli.base.funcao.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Version;
import java.util.Objects;

/**
 * The type Funcao.
 */
@Entity
public class Funcao implements AggregateRoot<IdentificadorFuncao> {
    @Version
    private Long version;
    @EmbeddedId
    private IdentificadorFuncao identificadorFuncao;
    @Embedded
    private NivelHierarquico nivelHierarquico;

    /**
     * Instantiates a new Funcao.
     */
    public Funcao() {
        //ORM
    }

    /**
     * Instantiates a new Funcao.
     *
     * @param identificadorFuncao the identificador funcao
     * @param nivelHierarquico    the nivel hierarquico
     */
    public Funcao(IdentificadorFuncao identificadorFuncao, final NivelHierarquico nivelHierarquico) {
        this.identificadorFuncao = identificadorFuncao;
        this.nivelHierarquico = nivelHierarquico;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Funcao)) {
            return false;
        }
        final Funcao that = (Funcao) o;
        return this.identificadorFuncao == that.identificadorFuncao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificadorFuncao);
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public IdentificadorFuncao identity() {
        return this.identificadorFuncao;
    }

    @Override
    public String toString() {
        return "\n--------------------------Função--------------------------" +
                "\nIdentificador -> " + identificadorFuncao +
                "\nNível -> " + nivelHierarquico +
                '\n';
    }
}
