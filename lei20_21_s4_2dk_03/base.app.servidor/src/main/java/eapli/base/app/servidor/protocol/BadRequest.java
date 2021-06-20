package eapli.base.app.servidor.protocol;

/**
 * The type Bad request.
 */
public class BadRequest extends BaseErrorRequest {

    /**
     * Instantiates a new Bad request.
     *
     * @param request          the request
     * @param errorDescription the error description
     */
    public BadRequest(final byte[] request, final String errorDescription) {
        super(request);
    }

    @Override
    protected String messageType() {
        return "ERROR_IN_REQUEST";
    }

}
