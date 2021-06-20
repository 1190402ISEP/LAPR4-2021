package eapli.base.pedido.domain;

import eapli.framework.domain.model.DomainEntities;
import eapli.framework.domain.model.DomainEntity;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Version;

@Entity
public class FormularioPreenchido implements DomainEntity<AtributoFormularioPreenchido> {
    @Version
    private Long version;
    @EmbeddedId
    private AtributoFormularioPreenchido atributoFormularioPreenchido;
    @Embedded
    private RespostaFormularioPreenchido respostaFormularioPreenchido;


    protected FormularioPreenchido() {
        //ORM
    }

    public FormularioPreenchido(String atributoFormularioPreenchido, String respostaFormularioPreenchido) {
        this.atributoFormularioPreenchido = new AtributoFormularioPreenchido(atributoFormularioPreenchido);
        this.respostaFormularioPreenchido = new RespostaFormularioPreenchido(respostaFormularioPreenchido);
    }

    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public AtributoFormularioPreenchido identity() {
        return this.atributoFormularioPreenchido;
    }

    @Override
    public String toString() {
        return "\n--------------------------FormulárioPreenchido--------------------------" +
                "\nAtributo -> " + atributoFormularioPreenchido +
                "\nReposta -> " + respostaFormularioPreenchido +
                '\n';
    }
}
