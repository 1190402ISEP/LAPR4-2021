package eapli.base.app.servidor.protocol;

/**
 * The type Base error request.
 */
public abstract class BaseErrorRequest extends SDP2021ProtocolRequest {

    private final String errorDescription;

    /**
     * Instantiates a new Base error request.
     *
     * @param request          the request
     * @param errorDescription the error description
     */
    protected BaseErrorRequest(final byte[] request, final String errorDescription) {
        super(request);
        this.errorDescription = errorDescription;
    }

    /**
     * Instantiates a new Base error request.
     *
     * @param request the request
     */
    protected BaseErrorRequest(final byte[] request) {
        super(request);
        this.errorDescription = null;
    }

    @Override
    public byte[] execute() {
        // nothing to do, just build the response
        return buildResponse();
    }

    /**
     * Build response byte [ ].
     *
     * @return the byte [ ]
     */
//TODO BUILD_RESPONSE
    protected byte[] buildResponse() {
        final Object[] fields = {
                messageType(),
                request,
                errorDescription
        };

        final byte[] resposta = new byte[1];
        final byte[] codigo = new byte[1];
        final byte[] numeroDeBytes = new byte[1];
        final byte[] dados = new byte[numeroDeBytes[0]];


        return resposta;
    }

    protected abstract String messageType();
}
