package eapli.base.infrastructure.persistence;

import eapli.base.atividade.repositories.AtividadeRepository;
import eapli.base.catalogoServico.repository.CatalogoServicoRepository;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.base.equipa.repositories.EquipaRepository;
import eapli.base.fluxodeatividade.repository.FluxoDeAtividadeRepository;
import eapli.base.formulario.repository.FormularioRepository;
import eapli.base.funcao.repositories.FuncaoRepository;
import eapli.base.nivelCriticidade.repository.NivelRepository;
import eapli.base.pedido.repositories.PedidoRepository;
import eapli.base.servico.repository.ServicoRepository;
import eapli.base.slot.repository.SlotRepository;
import eapli.base.tipoequipa.repositories.TipoEquipaRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;

/**
 * @author Paulo Gandra Sousa
 */
public interface RepositoryFactory {

    /**
     * factory method to create a transactional context to use in the repositories
     */
    TransactionalContext newTransactionalContext();

    /**
     * @param autoTx the transactional context to enrol
     */
    UserRepository users(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     */
    UserRepository users();

    /**
     * @param autoTx the transactional context to enroll
     */
    ClientUserRepository clientUsers(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     */
    ClientUserRepository clientUsers();

    /**
     * @param autoTx the transactional context to enroll
     */
    SignupRequestRepository signupRequests(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     */
    SignupRequestRepository signupRequests();

    /**
     * @param autoTx the transactional context to enroll
     */
    TipoEquipaRepository tipoEquipas(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     */
    TipoEquipaRepository tipoEquipas();

    /**
     * @param autoTx the transactional context to enroll
     */
    EquipaRepository equipa(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     */
    EquipaRepository equipa();

    /**
     * @param autoTx the transactional context to enroll
     */
    ServicoRepository servico(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     */
    ServicoRepository servico();

    /**
     * @param autoTx the transactional context to enroll
     */
    ColaboradorRepository colaboradores(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     */
    ColaboradorRepository colaboradores();

    /**
     * @param autoTx the transactional context to enroll
     */
    CatalogoServicoRepository catalogosServico(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     */
    CatalogoServicoRepository catalogosServico();

    /**
     * @param autoTx the transactional context to enroll
     */
    NivelRepository niveis(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     */
    NivelRepository niveis();

    /**
     * @param autoTx the transactional context to enroll
     */
    FuncaoRepository funcoes(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     */
    FuncaoRepository funcoes();

    /**
     * @param autoTx the transactional context to enroll
     */
    FormularioRepository formulario(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     */
    FormularioRepository formulario();


    /**
     * @param autoTx the transactional context to enroll
     */
    AtividadeRepository atividade(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     */
    AtividadeRepository atividade();

    /**
     * @param autoTx the transactional context to enroll
     */
    SlotRepository slot(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     */
    SlotRepository slot();

    /**
     * @param autoTx the transactional context to enroll
     */
    FluxoDeAtividadeRepository fluxoDeAtividade(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     */
    FluxoDeAtividadeRepository fluxoDeAtividade();

    /**
     * @param autoTx the transactional context to enroll
     */
    PedidoRepository pedido(TransactionalContext autoTx);

    /**
     * repository will be created in auto transaction mode
     */
    PedidoRepository pedido();
}
