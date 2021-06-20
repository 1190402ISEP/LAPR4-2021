package eapli.base.clientusermanagement.domain;

import eapli.base.equipa.domain.Equipa;
import eapli.base.funcao.domain.Funcao;
import eapli.base.funcao.domain.IdentificadorFuncao;
import eapli.base.funcao.domain.NivelHierarquico;
import eapli.framework.domain.model.DomainFactory;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Colaborador builder.
 */
public class ColaboradorBuilder implements DomainFactory<Colaborador> {
    private SystemUser systemUser;
    private MecanographicNumber mecanographicNumber;
    private NomeCurtoColaborador nomeCurtoColaborador;
    private NomeCompletoColaborador nomeCompletoColaborador;
    private ContactoColaborador contactoColaborador;
    private EmailColaborador emailColaborador;
    private LocalResidenciaColaborador localResidenciaColaborador;
    private DataNascimentoColaborador dataNascimentoColaborador;
    private Funcao funcao;
    private Colaborador resposavelHierarquico;
    private final List<Equipa> equipas = new ArrayList<>();

    /**
     * With system user colaborador builder.
     *
     * @param systemUser the system user
     * @return the colaborador builder
     */
    public ColaboradorBuilder withSystemUser(SystemUser systemUser) {
        this.systemUser = systemUser;
        return this;
    }

    /**
     * With mecanographic number colaborador builder.
     *
     * @param mecanographicNumber the mecanographic number
     * @return the colaborador builder
     */
    public ColaboradorBuilder withMecanographicNumber(MecanographicNumber mecanographicNumber) {
        this.mecanographicNumber = mecanographicNumber;
        return this;
    }

    /**
     * With mecanographic number colaborador builder.
     *
     * @param mecanographicNumber the mecanographic number
     * @return the colaborador builder
     */
    public ColaboradorBuilder withMecanographicNumber(String mecanographicNumber) {
        this.mecanographicNumber = new MecanographicNumber(mecanographicNumber);
        return this;
    }

    /**
     * With nome curto colaborador builder.
     *
     * @param nomeCurtoColaborador the nome curto colaborador
     * @return the colaborador builder
     */
    public ColaboradorBuilder withNomeCurto(NomeCurtoColaborador nomeCurtoColaborador) {
        this.nomeCurtoColaborador = nomeCurtoColaborador;
        return this;
    }

    /**
     * With nome curto colaborador builder.
     *
     * @param nomeCurtoColaborador the nome curto colaborador
     * @return the colaborador builder
     */
    public ColaboradorBuilder withNomeCurto(String nomeCurtoColaborador) {
        this.nomeCurtoColaborador = new NomeCurtoColaborador(nomeCurtoColaborador);
        return this;
    }

    /**
     * With nome completo colaborador builder.
     *
     * @param nomeCompletoColaborador the nome completo colaborador
     * @return the colaborador builder
     */
    public ColaboradorBuilder withNomeCompleto(NomeCompletoColaborador nomeCompletoColaborador) {
        this.nomeCompletoColaborador = nomeCompletoColaborador;
        return this;
    }

    /**
     * With nome completo colaborador builder.
     *
     * @param nomeCompletoColaborador the nome completo colaborador
     * @return the colaborador builder
     */
    public ColaboradorBuilder withNomeCompleto(String nomeCompletoColaborador) {
        this.nomeCompletoColaborador = new NomeCompletoColaborador(nomeCompletoColaborador);
        return this;
    }

    /**
     * With contacto colaborador colaborador builder.
     *
     * @param contactoColaborador the contacto colaborador
     * @return the colaborador builder
     */
    public ColaboradorBuilder withContactoColaborador(ContactoColaborador contactoColaborador) {
        this.contactoColaborador = contactoColaborador;
        return this;
    }

    /**
     * With contacto colaborador colaborador builder.
     *
     * @param contactoColaborador the contacto colaborador
     * @return the colaborador builder
     */
    public ColaboradorBuilder withContactoColaborador(int contactoColaborador) {
        this.contactoColaborador = new ContactoColaborador(contactoColaborador);
        return this;
    }

    /**
     * With data nascimento colaborador builder.
     *
     * @param dataNascimentoColaborador the data nascimento colaborador
     * @return the colaborador builder
     */
    public ColaboradorBuilder withDataNascimento(DataNascimentoColaborador dataNascimentoColaborador) {
        this.dataNascimentoColaborador = dataNascimentoColaborador;
        return this;
    }

    /**
     * With data nascimento colaborador builder.
     *
     * @param ano the ano
     * @param mes the mes
     * @param dia the dia
     * @return the colaborador builder
     */
    public ColaboradorBuilder withDataNascimento(int ano, int mes, int dia) {
        this.dataNascimentoColaborador = new DataNascimentoColaborador(ano, mes, dia);
        return this;
    }

    /**
     * With email colaborador colaborador builder.
     *
     * @param emailColaborador the email colaborador
     * @return the colaborador builder
     */
    public ColaboradorBuilder withEmailColaborador(EmailColaborador emailColaborador) {
        this.emailColaborador = emailColaborador;
        return this;
    }

    /**
     * With email colaborador colaborador builder.
     *
     * @param emailColaborador the email colaborador
     * @return the colaborador builder
     */
    public ColaboradorBuilder withEmailColaborador(String emailColaborador) {
        this.emailColaborador = new EmailColaborador(emailColaborador);
        return this;
    }

    /**
     * With local residencia colaborador colaborador builder.
     *
     * @param localResidenciaColaborador the local residencia colaborador
     * @return the colaborador builder
     */
    public ColaboradorBuilder withLocalResidenciaColaborador(LocalResidenciaColaborador localResidenciaColaborador) {
        this.localResidenciaColaborador = localResidenciaColaborador;
        return this;
    }

    /**
     * With local residencia colaborador colaborador builder.
     *
     * @param distrito the distrito
     * @param concelho the concelho
     * @return the colaborador builder
     */
    public ColaboradorBuilder withLocalResidenciaColaborador(String distrito, String concelho) {
        this.localResidenciaColaborador = new LocalResidenciaColaborador(distrito, concelho);
        return this;
    }

    /**
     * With funcao colaborador colaborador builder.
     *
     * @param f the f
     * @return the colaborador builder
     */
    public ColaboradorBuilder withFuncaoColaborador(Funcao f) {
        this.funcao = f;
        return this;
    }

    /**
     * With funcao colaborador colaborador builder.
     *
     * @param identificadorFuncao the identificador funcao
     * @param nivelHierarquico    the nivel hierarquico
     * @return the colaborador builder
     */
    public ColaboradorBuilder withFuncaoColaborador(IdentificadorFuncao identificadorFuncao, NivelHierarquico nivelHierarquico) {
        this.funcao = new Funcao(identificadorFuncao, nivelHierarquico);
        return this;
    }

    /**
     * With funcao colaborador colaborador builder.
     *
     * @param identificadorFuncao the identificador funcao
     * @param nivelHierarquico    the nivel hierarquico
     * @return the colaborador builder
     */
    public ColaboradorBuilder withFuncaoColaborador(String identificadorFuncao, String nivelHierarquico) {
        this.funcao = new Funcao(new IdentificadorFuncao(identificadorFuncao), new NivelHierarquico(nivelHierarquico));
        return this;
    }


    /**
     * With responsavel hierarquico colaborador colaborador builder.
     *
     * @param responsavelHierarquicoColaborador the responsavel hierarquico colaborador
     * @return the colaborador builder
     */
    public ColaboradorBuilder withResponsavelHierarquicoColaborador(Colaborador responsavelHierarquicoColaborador) {
        this.resposavelHierarquico = responsavelHierarquicoColaborador;
        return this;
    }


    /**
     * Associar equipa colaborador builder.
     *
     * @param equipa the equipa
     * @return the colaborador builder
     */
    public ColaboradorBuilder associarEquipa(Equipa equipa) {
        this.equipas.add(equipa);
        return this;
    }

    @Override
    public Colaborador build() {
        Colaborador colaborador = new Colaborador(systemUser, mecanographicNumber, nomeCurtoColaborador,
                nomeCompletoColaborador, contactoColaborador, emailColaborador, localResidenciaColaborador,
                dataNascimentoColaborador);

        if (!equipas.isEmpty()) {
            for (Equipa pos : equipas) {
                colaborador.associarEquipa(pos);
            }
        }
        if (funcao != null) {
            colaborador.associarFuncao(funcao);
        }
        if (resposavelHierarquico != null) {
            colaborador.associarResponsavelHierarquico(resposavelHierarquico);
        }

        return colaborador;
    }
}
