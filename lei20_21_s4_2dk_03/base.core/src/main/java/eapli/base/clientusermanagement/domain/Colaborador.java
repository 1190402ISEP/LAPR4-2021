package eapli.base.clientusermanagement.domain;

import eapli.base.atividade.domain.AtividadeManual;
import eapli.base.atividade.repositories.AtividadeRepository;
import eapli.base.equipa.domain.Equipa;
import eapli.base.funcao.domain.Funcao;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.pedido.domain.Pedido;
import eapli.base.pedido.repositories.PedidoRepository;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Colaborador.
 */
@Entity
public class Colaborador implements AggregateRoot<MecanographicNumber> {
    @Version
    private Long version;
    @EmbeddedId
    private MecanographicNumber mecanographicNumber;
    @Embedded
    private NomeCurtoColaborador nomeCurtoColaborador;
    @Embedded
    private NomeCompletoColaborador nomeCompletoColaborador;
    @Embedded
    private ContactoColaborador contactoColaborador;
    @Embedded
    private EmailColaborador emailColaborador;
    @Embedded
    private LocalResidenciaColaborador localResidenciaColaborador;
    @Embedded
    private DataNascimentoColaborador dataNascimentoColaborador;
    @OneToOne
    private SystemUser systemUser;
    @OneToOne
    private Funcao funcao;
    @OneToOne
    private Colaborador resposavelHierarquico;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Equipa> equipas;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<AtividadeManual> atividades;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Pedido> pedidos;

    /**
     * Instantiates a new Colaborador.
     */
    protected Colaborador() {
        //ORM
    }

    /**
     * Instantiates a new Colaborador.
     *
     * @param user                       the user
     * @param mecanographicNumber        the mecanographic number
     * @param nomeCurtoColaborador       the nome curto colaborador
     * @param nomeCompletoColaborador    the nome completo colaborador
     * @param contactoColaborador        the contacto colaborador
     * @param emailColaborador           the email colaborador
     * @param localResidenciaColaborador the local residencia colaborador
     * @param dataNascimentoColaborador  the data nascimento colaborador
     */
    public Colaborador(final SystemUser user, final MecanographicNumber mecanographicNumber,
                       final NomeCurtoColaborador nomeCurtoColaborador,
                       final NomeCompletoColaborador nomeCompletoColaborador,
                       ContactoColaborador contactoColaborador, EmailColaborador emailColaborador,
                       LocalResidenciaColaborador localResidenciaColaborador,
                       final DataNascimentoColaborador dataNascimentoColaborador) {
        this.systemUser = user;
        this.mecanographicNumber = mecanographicNumber;
        this.nomeCurtoColaborador = nomeCurtoColaborador;
        this.nomeCompletoColaborador = nomeCompletoColaborador;
        this.contactoColaborador = contactoColaborador;
        this.emailColaborador = emailColaborador;
        this.localResidenciaColaborador = localResidenciaColaborador;
        this.dataNascimentoColaborador = dataNascimentoColaborador;
        equipas = new ArrayList<>();
    }

    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public MecanographicNumber identity() {
        return this.mecanographicNumber;
    }

    @Override
    public String toString() {
        return "\n--------------------------Colaborador--------------------------" +
                "\nNúmero mecanográfico -> " + mecanographicNumber +
                "\nNome -> " + nomeCurtoColaborador +
                "\ncontactoColaborador -> " + contactoColaborador +
                "\nemailColaborador -> " + emailColaborador +
                '\n';
    }

    /**
     * User system user.
     *
     * @return the system user
     */
    public SystemUser user() {
        return this.systemUser;
    }

    /**
     * Associar funcao.
     *
     * @param f the f
     */
    public void associarFuncao(Funcao f) {
        this.funcao = f;
    }

    /**
     * get equipas.
     *
     * @return the equipas
     */
    public List<Equipa> getEquipas() {
        return this.equipas;
    }

    /**
     * Associar equipa.
     *
     * @param e the e
     */
    public void associarEquipa(Equipa e) {
        this.equipas.add(e);
    }

    /**
     * Remover equipa.
     *
     * @param e the e
     */
    public void removerEquipa(Equipa e) {
        this.equipas.remove(e);
    }

    /**
     * Associar responsavel hierarquico.
     *
     * @param r the r
     */
    public void associarResponsavelHierarquico(Colaborador r) {
        this.resposavelHierarquico = r;
    }

    /**
     * Gets mecanographic number.
     *
     * @return the mecanographic number
     */
    public MecanographicNumber getMecanographicNumber() {
        return mecanographicNumber;
    }

    /**
     * Gets nome completo colaborador.
     *
     * @return the nome completo colaborador
     */
    public NomeCompletoColaborador getNomeCompletoColaborador() {
        return nomeCompletoColaborador;
    }

    /**
     * Gets email colaborador.
     *
     * @return the email colaborador
     */
    public EmailColaborador getEmailColaborador() {
        return emailColaborador;
    }

    /**
     * Gets atividades.
     *
     * @return the atividades
     */
    public List<AtividadeManual> getAtividades() {
        final AtividadeRepository aRepo = PersistenceContext.repositories().atividade();
        String mecNumber = mecanographicNumber.toString();
        atividades = aRepo.findByColab(mecNumber);
        return atividades;
    }

    /**
     * Gets pedidos.
     *
     * @return the pedidos
     */
    public List<Pedido> getPedidos() {
        final PedidoRepository pRepo = PersistenceContext.repositories().pedido();
        String mecNumber = mecanographicNumber.toString();
        pedidos = pRepo.findPedByColab(mecNumber);
        return pedidos;
    }

    /**
     * Gets pedidos historico.
     *
     * @return the pedidos historico
     */
    public List<Pedido> getPedidosHistorico() {
        final PedidoRepository pRepo = PersistenceContext.repositories().pedido();
        String mecNumber = mecanographicNumber.toString();
        pedidos = pRepo.findHistoByColab(mecNumber);
        return pedidos;
    }

    /**
     * Assignar atividade a colaborador.
     *
     * @param atividadeManual the atividade manual
     */
    public void assignarAtividadeAColaborador(AtividadeManual atividadeManual) {
        this.atividades.add(atividadeManual);
    }

    /**
     * Add pedido.
     *
     * @param pedido the pedido
     */
    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }
}
