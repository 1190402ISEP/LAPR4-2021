package eapli.base.servico.application;

import eapli.base.atividade.domain.AtividadeAutomatica;
import eapli.base.atividade.domain.AtividadeManual;
import eapli.base.atividade.repositories.AtividadeRepository;
import eapli.base.catalogoServico.domain.CatalogoServico;
import eapli.base.catalogoServico.domain.IdentificadorCatalogo;
import eapli.base.catalogoServico.repository.CatalogoServicoRepository;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.equipa.domain.CodigoUnicoEquipa;
import eapli.base.equipa.domain.Equipa;
import eapli.base.equipa.repositories.EquipaRepository;
import eapli.base.fluxodeatividade.domain.FluxoDeAtividade;
import eapli.base.fluxodeatividade.domain.FluxoDeAtividadeSentidoLato;
import eapli.base.fluxodeatividade.domain.FluxoDeAtividadeSentidoRestrito;
import eapli.base.fluxodeatividade.repository.FluxoDeAtividadeRepository;
import eapli.base.formulario.domain.Formulario;
import eapli.base.formulario.domain.TipoDadosBaseAtributo;
import eapli.base.formulario.repository.FormularioRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.nivelCriticidade.domain.Etiqueta;
import eapli.base.nivelCriticidade.domain.Nivel;
import eapli.base.nivelCriticidade.repository.NivelRepository;
import eapli.base.servico.domain.*;
import eapli.base.servico.repository.ServicoRepository;
import eapli.base.slot.domain.Slot;
import eapli.base.slot.repository.SlotRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.base.utils.scriptreader.StringColors;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import javax.swing.*;
import java.util.List;

/**
 * The type Especificar servico controller.
 */
public class EspecificarServicoController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ServicoRepository repository = PersistenceContext.repositories().servico();
    private CatalogoServicoRepository catalogoRepository = PersistenceContext.repositories().catalogosServico();
    private final FormularioRepository formularioRepository = PersistenceContext.repositories().formulario();
    private final NivelRepository nivelRepository = PersistenceContext.repositories().niveis();
    private FluxoDeAtividadeRepository fluxoDeAtividadeRepository;
    private AtividadeRepository atividadeRepository;
    private SlotRepository slotRep;
    private FluxoDeAtividade fluxoDeAtividade;
    private EquipaRepository equipaRepository;
    private ColaboradorRepository colaboradorRepository;
    private String codigo = null;
    private final ServicoBuilder servicoBuilder = new ServicoBuilder();

    private AtividadeManual atividadeManual;
    private AtividadeAutomatica atividadeAutomatica;
    private Formulario formulario;

    /**
     * Adicionar servico.
     *
     * @param codigoUnicoServico the codigo unico servico
     * @param tituloServico      the titulo servico
     * @param keyWords           the key words
     */
    public void adicionarServico(String codigoUnicoServico, String tituloServico, List<KeyWordServico> keyWords) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.GESTOR_SERVICOS_HELPDESK);
        servicoBuilder.withCodigoUnicoServico(codigoUnicoServico);
        codigo = codigoUnicoServico;
        servicoBuilder.withTituloServico(tituloServico);
        servicoBuilder.withKeyWords(keyWords);
    }

    /**
     * Show list of catalogos.
     */
    public void showListOfCatalogos() {
        catalogoRepository = PersistenceContext.repositories().catalogosServico();
        Iterable<CatalogoServico> catalogos = catalogoRepository.findAll();
        if (catalogos != null) {
            for (CatalogoServico f : catalogos) {
                System.out.println(f);
            }
        }
    }

    /**
     * Associar catalogo.
     *
     * @param catID the cat id
     */
    public void associarCatalogo(String catID) {
        IdentificadorCatalogo catalogoID = new IdentificadorCatalogo(catID);
        if (catalogoRepository.containsOfIdentity(catalogoID)) {
            this.servicoBuilder.withCatalogoServico(catalogoRepository.ofIdentity(catalogoID).get());
            catalogoRepository.ofIdentity(catalogoID).get();
        } else {
            throw new IllegalArgumentException("Não existe catálogo com id: " + catID);
        }
    }

    /**
     * Associar descricao breve.
     *
     * @param descBreve the desc breve
     */
    public void associarDescricaoBreve(String descBreve) {
        DescricaoBreveServico descricaoBreveServico = new DescricaoBreveServico(descBreve);
        servicoBuilder.withDescricaoBreveServico(descricaoBreveServico);
    }

    /**
     * Associar descricao completa.
     *
     * @param descCompleta the desc completa
     */
    public void associarDescricaoCompleta(String descCompleta) {
        DescricaoCompletaServico descricaoCompletaServico = new DescricaoCompletaServico(descCompleta);
        servicoBuilder.withDescricaoCompletaServico(descricaoCompletaServico);
    }

    /**
     * Associar objetivo.
     *
     * @param objetivo the objetivo
     */
    public void associarObjetivo(String objetivo) {
        ObjetivoServico objetivoServico = new ObjetivoServico(objetivo);
        servicoBuilder.withObjetivoServico(objetivoServico);
    }

    /**
     * Build servico.
     *
     * @return the servico
     */
    public Servico build() {
        if (!repository.containsOfIdentity(new CodigoUnicoServico(codigo))) {
            Servico ser = this.repository.save(servicoBuilder.build());
            CatalogoServico catalogoServico = ser.getCatalogo();
            if (catalogoServico != null) {
                CatalogoServico newCatalogo = catalogoRepository.ofIdentity(catalogoServico.identity()).get();
                if (repository.containsOfIdentity(ser.identity())) {
                    newCatalogo.associarServico(repository.ofIdentity(ser.identity()).get());
                    catalogoRepository.save(newCatalogo);
                }
            }
            return ser;
        } else {
            throw new IllegalStateException("Serviço já existe com código interno único: " + codigo);
        }
    }

    /**
     * Mostrar tipo dados base atributo.
     */
    public void mostrarTipoDadosBaseAtributo() {
        int x = 1;
        System.out.println(StringColors.PURPLE);
        System.out.print("==================TipoDados==================");
        for (TipoDadosBaseAtributo tipos : TipoDadosBaseAtributo.values()) {
            System.out.printf("%d -> %s\n", x, tipos.toString());
            x++;
        }
        System.out.println(StringColors.RESET);
    }

    /**
     * Confirm tipo dados tipo dados base atributo.
     *
     * @param tipoDadosBaseAtributo the tipo dados base atributo
     * @return the tipo dados base atributo
     */
    public TipoDadosBaseAtributo confirmTipoDados(String tipoDadosBaseAtributo) {
        for (TipoDadosBaseAtributo tipos : TipoDadosBaseAtributo.values()) {
            if (tipos.toString().trim().equals(tipoDadosBaseAtributo)) {
                return tipos;
            }
        }
        throw new IllegalArgumentException("Tipo de dados inválido.");
    }

    /**
     * Create atributo.
     *
     * @param nomeVariavelAtributo         the nome variavel atributo
     * @param etiquetaApresentacaoAtributo the etiqueta apresentacao atributo
     * @param descricaoAjudaAtributo       the descricao ajuda atributo
     * @param tipo                         the tipo
     * @param expressaoRegularAtributos    the expressao regular atributos
     */
    public void createAtributo(String nomeVariavelAtributo, String etiquetaApresentacaoAtributo,
                               String descricaoAjudaAtributo, TipoDadosBaseAtributo tipo,
                               String expressaoRegularAtributos) {
        formulario.adicionarAtributoFormulario(nomeVariavelAtributo, etiquetaApresentacaoAtributo,
                descricaoAjudaAtributo, tipo, expressaoRegularAtributos);

    }

    /**
     * Show list of servicos incompletos.
     */
    public void showListOfServicosIncompletos() {
        boolean check = true;
        if (repository.findAll().iterator().hasNext()) {
            System.out.println();
            for (Servico ser : repository.findAll()) {
                if (ser.getEstado().equals(EstadoServico.INCOMPLETO)) {
                    System.out.println(ser);
                    check = false;
                }
            }
            System.out.println();
        }
        if (check) {
            throw new IllegalArgumentException("Sem serviços incompletos.");
        }
    }

    /**
     * Gets servico.
     *
     * @param codigoServico the codigo servico
     * @return the servico
     */
    public Servico getServico(String codigoServico) {
        if (this.repository.containsOfIdentity(new CodigoUnicoServico(codigoServico))) {
            return this.repository.ofIdentity(new CodigoUnicoServico(codigoServico)).get();
        } else {
            throw new IllegalArgumentException("Código de serviço inválido.");
        }
    }

    /**
     * Gets catalogo.
     *
     * @param catID the cat id
     * @return the catalogo
     */
    public CatalogoServico getCatalogo(String catID) {
        if (catalogoRepository.containsOfIdentity(new IdentificadorCatalogo(catID))) {
            return catalogoRepository.ofIdentity(new IdentificadorCatalogo(catID)).get();
        } else {
            throw new IllegalArgumentException("Não existe catálogo com id: " + catID);
        }
    }

    /**
     * Iniciar definicao de fluxo de atividade.
     *
     * @param dataEntradaEmVigor the data entrada em vigor
     * @param horaEntradaEmVigor the hora entrada em vigor
     * @param sentidoDeAplicacao the sentido de aplicacao
     */
    public void iniciarDefinicaoDeFluxoDeAtividade(String dataEntradaEmVigor, String horaEntradaEmVigor,
                                                   int sentidoDeAplicacao) {

        this.fluxoDeAtividadeRepository = PersistenceContext.repositories().fluxoDeAtividade();
        this.atividadeRepository = PersistenceContext.repositories().atividade();
        this.slotRep = PersistenceContext.repositories().slot();
        this.equipaRepository = PersistenceContext.repositories().equipa();
        this.colaboradorRepository = PersistenceContext.repositories().colaboradores();

        if (sentidoDeAplicacao == 0) {
            this.fluxoDeAtividade = new FluxoDeAtividadeSentidoLato(dataEntradaEmVigor, horaEntradaEmVigor);
        } else if (sentidoDeAplicacao == 1) {
            this.fluxoDeAtividade = new FluxoDeAtividadeSentidoRestrito(dataEntradaEmVigor, horaEntradaEmVigor);
        }
    }

    /**
     * Nova atividade manual.
     *
     * @param descricao the descricao
     * @param delay     the delay
     */
    public void novaAtividadeManual(String descricao, int delay) {
        this.atividadeManual = new AtividadeManual(descricao, delay);
    }

    /**
     * Mostrar todas as equipas.
     */
    public void mostrarTodasAsEquipas() {
        Iterable<Equipa> equipas = equipaRepository.findAll();
        for (Equipa e : equipas) {
            System.out.println(e);
        }
    }

    /**
     * Adicionar equipa para resolver.
     *
     * @param codigoUnicoEquipa the codigo unico equipa
     */
    public void adicionarEquipaParaResolver(String codigoUnicoEquipa) {
        if (equipaRepository.containsOfIdentity(new CodigoUnicoEquipa(codigoUnicoEquipa))) {
            this.atividadeManual.associarEquipaParaEfetuarAtividade(equipaRepository.ofIdentity(new CodigoUnicoEquipa(codigoUnicoEquipa)).get());
        }
    }

    /**
     * Mostrar todos os colaboradores.
     */
    public void mostrarTodosOsColaboradores() {
        Iterable<Colaborador> colaboradores = colaboradorRepository.findAll();
        for (Colaborador c : colaboradores) {
            System.out.println(c);
        }
    }

    /**
     * Associar colaborador.
     *
     * @param mecanographicNumber the mecanographic number
     */
    public void associarColaborador(String mecanographicNumber) {
        if (colaboradorRepository.containsOfIdentity(new MecanographicNumber(mecanographicNumber))) {
            this.atividadeManual.associarColaborador(colaboradorRepository.ofIdentity(new MecanographicNumber(mecanographicNumber)).get());
        }
    }


    /**
     * Nova atividade automatica.
     *
     * @param descricao      the descricao
     * @param delay          the delay
     * @param ficheiroScript the ficheiro script
     * @param ordemExecucao  the ordem execucao
     */
    public void novaAtividadeAutomatica(String descricao, int delay, String ficheiroScript, int ordemExecucao) {
        this.atividadeAutomatica = new AtividadeAutomatica(descricao, delay, ficheiroScript);
        Slot slot = new Slot(ordemExecucao, atividadeRepository.save(this.atividadeAutomatica));
        this.slotRep.save(slot);
        this.fluxoDeAtividade.associarSlotComAtividade(slot);
    }


    /**
     * Associar fluxo de atividade.
     */
    public void associarFluxoDeAtividade() {
        FluxoDeAtividade f = fluxoDeAtividadeRepository.save(this.fluxoDeAtividade);
        servicoBuilder.withFluxoDeAtividade(f);
    }

    /**
     * Save servico.
     *
     * @param servico the servico
     */
    public void saveServico(Servico servico) {
        this.repository.save(servico);
    }


    /**
     * Adicionar atividade manual.
     *
     * @param ordemExecucao the ordem execucao
     */
    public void adicionarAtividadeManual(int ordemExecucao) {

        fluxoDeAtividade.associarSlotComAtividade(new Slot(ordemExecucao, atividadeRepository.save(this.atividadeManual)));
    }

    /**
     * Guardar formulario.
     *
     * @param option the option
     */
    public void guardarFormulario(int option) {
        if (formulario != null) {
            Formulario form = formularioRepository.save(formulario);
            if (option == 0) {//Opção 0 cria formulário para serviço
                this.servicoBuilder.withFormulario(form);

            } else if (option == 1) {//Opção 1 cria formulário para Atividade Manual
                this.atividadeManual.associarFormulario(form);
            }

        } else {
            formulario = null;
            throw new IllegalArgumentException("Erro ao criar Formulário!!");
        }
        formulario = null;
    }


    /**
     * Criar formulario.
     *
     * @param nomeFormulario the nome formulario
     */
    public void criarFormulario(String nomeFormulario) {
        this.formulario = new Formulario(nomeFormulario);
    }

    /**
     * Associar icone.
     *
     * @param icone the icone
     */
    public void associarIcone(String icone) {
        ImageIcon imageIcone = new ImageIcon(icone);
        servicoBuilder.withIcone(imageIcone);
    }

    /**
     * Show list of niveis.
     */
    public void showListOfNiveis() {
        if (nivelRepository.findAll().iterator().hasNext()) {
            for (Nivel niv : nivelRepository.findAll()) {
                System.out.println(niv);
            }
        } else {
            throw new IllegalArgumentException("Sem níveis.");
        }
    }

    /**
     * Associar nivel.
     *
     * @param eti the eti
     */
    public void associarNivel(String eti) {
        Etiqueta etiqueta = new Etiqueta(eti);
        if (nivelRepository.containsOfIdentity(etiqueta)) {
            this.servicoBuilder.withNivel(nivelRepository.ofIdentity(etiqueta).get());
        } else {
            throw new IllegalArgumentException("Não existe nível com etiqueta: " + eti);
        }
    }
}
