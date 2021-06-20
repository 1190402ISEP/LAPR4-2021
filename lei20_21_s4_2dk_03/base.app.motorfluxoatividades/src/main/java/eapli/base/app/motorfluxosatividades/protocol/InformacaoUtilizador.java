package eapli.base.app.motorfluxosatividades.protocol;

import java.io.DataOutputStream;
import java.io.IOException;

/**
 * The type Informacao utilizador.
 */
public class InformacaoUtilizador {
    private static final int MAX_PEDIDOS =25;

    private static String[] lastPedidos = new String[MAX_PEDIDOS];
    private static int numPedidos =0;

    /**
     * Send last.
     *
     * @param cOut      the c out
     * @param lastFirst the last first
     * @throws IOException the io exception
     */
    public static synchronized void sendLast(DataOutputStream cOut, boolean lastFirst) throws IOException {
        if(lastFirst) {
            for(int i = 0; i< numPedidos; i++) {
                cOut.write(lastPedidos[i].length());
                cOut.write(lastPedidos[i].getBytes(),0, lastPedidos[i].length());
            }
        } else {
            for(int i = numPedidos -1; i>=0; i--) {
                cOut.write(lastPedidos[i].length());
                cOut.write(lastPedidos[i].getBytes(),0, lastPedidos[i].length());
            }
        }
    }

    /**
     * Gets last html.
     *
     * @return the last html
     */
    public static synchronized String getLastHTML() {
        String res="";
        for(int i = 0; i< numPedidos; i++) {
            res=res+"<p>" + lastPedidos[i] + "</p>";
        }
        return res;
    }

    /**
     * Push.
     *
     * @param msg the msg
     */
    public static synchronized void push(String msg) {
        for(int i = numPedidos; i>0; i--) {
            if(i< MAX_PEDIDOS) {
                lastPedidos[i]= lastPedidos[i-1];
            }
        }
        lastPedidos[0]=msg;
        if(numPedidos < MAX_PEDIDOS) numPedidos++;
    }
}
