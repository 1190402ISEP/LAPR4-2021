package eapli.base.app.servidor.protocol;

/**
 * The type Sdp 2021 protocol request.
 */
public abstract class SDP2021ProtocolRequest {

    /**
     * The Request.
     */
    protected final byte[] request;

    /**
     * Instantiates a new Sdp 2021 protocol request.
     *
     * @param request the request
     */
    protected SDP2021ProtocolRequest(byte[] request) {
        this.request = request;
    }

    /**
     * Execute byte [ ].
     *
     * @return the byte [ ]
     */
    public abstract byte[] execute();

    /**
     * Message type string.
     *
     * @return the string
     */
    protected abstract String messageType();

}
