package eapli.base.app.servidor.protocol;

/**
 * The type Error in request.
 */
public class ErrorInRequest extends BaseErrorRequest {

    /**
     * Instantiates a new Error in request.
     *
     * @param request          the request
     * @param errorDescription the error description
     */
    public ErrorInRequest(final byte[] request, final String errorDescription) {
        super(request);
    }

    @Override
    protected String messageType() {
        return "ERROR_IN_REQUEST";
    }

}
