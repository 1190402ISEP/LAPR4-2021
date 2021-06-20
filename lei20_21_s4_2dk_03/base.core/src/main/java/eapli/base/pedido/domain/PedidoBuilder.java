package eapli.base.pedido.domain;

import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.servico.domain.Servico;
import eapli.framework.domain.model.DomainFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Pedido builder.
 */
public class PedidoBuilder implements DomainFactory<Pedido> {
    private Servico servico;
    private UrgenciaPedido urgenciaPedido;
    private DataLimiteResolucaoPedido dataLimiteResolucaoPedido;
    private FormularioPreenchido formularioPreenchido;
    private final List<FicheiroAnexadoPedido> ficheiroAnexadoPedido = new ArrayList<>();
    private Colaborador colaborador;

    /**
     * With servico pedido builder.
     *
     * @param servico the servico
     * @return the pedido builder
     */
    public PedidoBuilder withServico(Servico servico) {
        this.servico = servico;
        return this;
    }

    /**
     * With urgencia pedido builder.
     *
     * @param urgenciaPedido the urgencia pedido
     * @return the pedido builder
     */
    public PedidoBuilder withUrgencia(UrgenciaPedido urgenciaPedido) {
        this.urgenciaPedido = urgenciaPedido;
        return this;
    }

    /**
     * With data limite resolucao pedido builder.
     *
     * @param dataLimiteResolucaoPedido the data limite resolucao pedido
     * @return the pedido builder
     */
    public PedidoBuilder withDataLimiteResolucao(String dataLimiteResolucaoPedido) {
        this.dataLimiteResolucaoPedido = new DataLimiteResolucaoPedido(dataLimiteResolucaoPedido);
        return this;
    }

    /**
     * With formulario preenchido pedido builder.
     *
     * @param formularioPreenchido the formulario preenchido
     * @return the pedido builder
     */
    public PedidoBuilder withFormularioPreenchido(FormularioPreenchido formularioPreenchido) {
        this.formularioPreenchido = formularioPreenchido;
        return this;
    }

    /**
     * With ficheiro pedido builder.
     *
     * @param ficheiroAnexadoPedido the ficheiro anexado pedido
     * @return the pedido builder
     */
    public PedidoBuilder withFicheiro(String ficheiroAnexadoPedido) {
        this.ficheiroAnexadoPedido.add(new FicheiroAnexadoPedido(ficheiroAnexadoPedido));
        return this;
    }

    /**
     * With colaborador pedido builder.
     *
     * @param colaborador the colaborador
     * @return the pedido builder
     */
    public PedidoBuilder withColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
        return this;
    }

    @Override
    public Pedido build() {
        Pedido pedido = new Pedido(servico, urgenciaPedido, dataLimiteResolucaoPedido, formularioPreenchido, colaborador);

        if (!ficheiroAnexadoPedido.isEmpty()) {
            pedido.associarFicheiros(ficheiroAnexadoPedido);
        }

        return pedido;
    }
}
