package eapli.base.app.servidor.protocol;


import utils.Constantes;

/**
 * The type End request.
 */
public class EndRequest extends SDP2021ProtocolRequest implements Constantes {

    /**
     * Instantiates a new End request.
     *
     * @param pedido the pedido
     */
    protected EndRequest(byte[] pedido) {
        super(pedido);
    }

    @Override
    public byte[] execute() {
        System.out.println("Pedido de fim recebido");

        byte[] resposta = new byte[NUMERO_DE_BYTES_MAXIMO];
        byte[] dadosEmBytes = messageType().getBytes();
        byte length = (byte) dadosEmBytes.length;

        resposta[POSICAO_VERSAO] = VERSAO;
        resposta[POSICAO_CODIGO] = ENTENDIDO;
        resposta[POSICAO_NUMERO_BYTES_DADOS] = length;

        System.arraycopy(dadosEmBytes, 0, resposta, POSICAO_INICIAL_DADOS, length);
        return resposta;
    }

    @Override
    public String messageType() {
        return "ENTENDIDO";
    }

}

