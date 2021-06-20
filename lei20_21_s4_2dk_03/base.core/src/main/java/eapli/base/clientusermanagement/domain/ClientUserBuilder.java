package eapli.base.clientusermanagement.domain;

import eapli.framework.domain.model.DomainFactory;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

public class ClientUserBuilder implements DomainFactory<ClientUser> {

    private SystemUser systemUser;
    private MecanographicNumber mecanographicNumber;

    public ClientUserBuilder withSystemUser(SystemUser systemUser) {
        this.systemUser = systemUser;
        return this;
    }

    public ClientUserBuilder withMecanographicNumber(MecanographicNumber mecanographicNumber) {
        this.mecanographicNumber = mecanographicNumber;
        return this;
    }

    public ClientUserBuilder withMecanographicNumber(String mecanographicNumber) {
        this.mecanographicNumber = new MecanographicNumber(mecanographicNumber);
        return this;
    }

    @Override
    public ClientUser build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor
        return new ClientUser(this.systemUser, this.mecanographicNumber);
    }
}
