package eapli.base.clientusermanagement.repositories;

import eapli.base.clientusermanagement.domain.SignupRequest;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;

/**
 * The interface Signup request repository.
 *
 * @author Jorge Santos ajs@isep.ipp.pt 02/04/2016
 */
public interface SignupRequestRepository extends DomainRepository<Username, SignupRequest> {

    /**
     * Pending signup requests iterable.
     *
     * @return the iterable
     */
    Iterable<SignupRequest> pendingSignupRequests();
}
