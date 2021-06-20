package eapli.base.pedido.domain;

import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.fluxodeatividade.domain.FluxoDeAtividade;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.pedido.repositories.PedidoRepository;
import eapli.base.servico.domain.Servico;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

/**
 * The type Pedido.
 */
@Entity
public class Pedido implements AggregateRoot<IdentificadorAutomaticoPedido> {
    @Version
    private Long version;
    @EmbeddedId
    private IdentificadorAutomaticoPedido identificadorAutomaticoPedido = null;
    @Embedded
    private DataLimiteResolucaoPedido dataLimiteResolucaoPedido = null;
    @Embedded
    private DataResolucaoPedido dataResolucaoPedido = null;
    @Embedded
    private DataSolicitacaoPedido dataSolicitacaoPedido = null;
    @Embedded
    private DataAprovacaoPedido dataAprovacaoPedido;
    @Enumerated(EnumType.STRING)
    public EstadoPedido estadoPedido;
    @Enumerated(EnumType.STRING)
    public EstagioPedido estagioPedido;
    @Embedded
    private FeedBack feedBack;
    @OneToMany
    private final List<FicheiroAnexadoPedido> ficheiroAnexadoPedido = new ArrayList<>();
    @Enumerated(EnumType.STRING)
    public UrgenciaPedido urgenciaPedido;
    @OneToOne
    private Servico servico;
    @OneToOne
    private FormularioPreenchido formularioPreenchido;
    @OneToOne
    private Colaborador colaborador;

    /**
     * Instantiates a new Pedido.
     */
    public Pedido() {
        //ORM
    }

    /**
     * Instantiates a new Pedido.
     *
     * @param servico                   the servico
     * @param urgenciaPedido            the urgencia pedido
     * @param dataLimiteResolucaoPedido the data limite resolucao pedido
     * @param formularioPreenchido      the formulario preenchido
     * @param colaborador               the colaborador
     */
    public Pedido(Servico servico, UrgenciaPedido urgenciaPedido,
                  DataLimiteResolucaoPedido dataLimiteResolucaoPedido,
                  FormularioPreenchido formularioPreenchido, Colaborador colaborador) {
        Calendar rightNow = Calendar.getInstance();
        int year = rightNow.get(Calendar.YEAR);

        Calendar first = Calendar.getInstance();
        Calendar last = Calendar.getInstance();

        first.set(year, Calendar.JANUARY, 1);
        last.set(year, Calendar.DECEMBER, 31);

        PedidoRepository pedRepository = PersistenceContext.repositories().pedido();
        Iterable<Pedido> list = pedRepository.totalByYear(first, last);

        this.identificadorAutomaticoPedido = new IdentificadorAutomaticoPedido(list);
        this.dataSolicitacaoPedido = new DataSolicitacaoPedido();
        this.dataResolucaoPedido = null;
        this.servico = servico;
        this.urgenciaPedido = urgenciaPedido;
        this.dataLimiteResolucaoPedido = dataLimiteResolucaoPedido;
        this.formularioPreenchido = formularioPreenchido;
        this.estadoPedido = EstadoPedido.CRIADO;
        this.estagioPedido = EstagioPedido.AGUARDAR;
        this.feedBack = null;
        this.colaborador = colaborador;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pedido)) {
            return false;
        }
        final Pedido that = (Pedido) o;
        return this.identificadorAutomaticoPedido == that.identificadorAutomaticoPedido;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificadorAutomaticoPedido);
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public IdentificadorAutomaticoPedido identity() {
        return this.identificadorAutomaticoPedido;
    }

    @Override
    public String toString() {
        return "\n--------------------------Pedido--------------------------" +
                "\nIdentificador -> " + identificadorAutomaticoPedido +
                "\nData limite de resolução -> " + dataLimiteResolucaoPedido +
                "\nData de resolução -> " + dataResolucaoPedido +
                "\nData de solicitação -> " + dataSolicitacaoPedido +
                "\nData de aprovação -> " + dataAprovacaoPedido +
                "\nEstado -> " + estadoPedido +
                "\nEstágio -> " + estagioPedido +
                "\nFeedBack -> " + feedBack +
                "\nUrgência -> " + urgenciaPedido +
                "\nNúmero de ficheiros -> " + ficheiroAnexadoPedido.size() +
                '\n';
    }

    /**
     * Sets estado pedido.
     *
     * @param estado the estado
     */
    public void setEstadoPedido(EstadoPedido estado) {
        this.estadoPedido = estado;
        if (estado.equals(EstadoPedido.CONCLUIDO)) {
            this.dataResolucaoPedido = new DataResolucaoPedido();
        }
        if (estado.equals(EstadoPedido.APROVADO)) {
            this.dataAprovacaoPedido = new DataAprovacaoPedido();
        }
    }

    /**
     * Associar ficheiros.
     *
     * @param ficheiroAnexadoPedido the ficheiro anexado pedido
     */
    public void associarFicheiros(List<FicheiroAnexadoPedido> ficheiroAnexadoPedido) {
        this.ficheiroAnexadoPedido.addAll(ficheiroAnexadoPedido);
    }

    /**
     * Associar feedback.
     *
     * @param feedback the feedback
     */
    public void associarFeedback(String feedback) {
        this.feedBack = new FeedBack(feedback);
    }

    /**
     * Get fluxo de atividade fluxo de atividade.
     *
     * @return the fluxo de atividade
     */
    public FluxoDeAtividade getFluxoDeAtividade() {
        return this.servico.getFluxoDeAtividade();
    }
}
