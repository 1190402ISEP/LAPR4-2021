package eapli.base.persistence.impl.inmemory;

import eapli.base.atividade.repositories.AtividadeRepository;
import eapli.base.catalogoServico.repository.CatalogoServicoRepository;
import eapli.base.clientusermanagement.repositories.ClientUserRepository;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.base.equipa.repositories.EquipaRepository;
import eapli.base.fluxodeatividade.repository.FluxoDeAtividadeRepository;
import eapli.base.formulario.repository.FormularioRepository;
import eapli.base.funcao.repositories.FuncaoRepository;
import eapli.base.infrastructure.bootstrapers.BaseBootstrapper;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.nivelCriticidade.repository.NivelRepository;
import eapli.base.pedido.repositories.PedidoRepository;
import eapli.base.servico.repository.ServicoRepository;
import eapli.base.slot.repository.SlotRepository;
import eapli.base.tipoequipa.repositories.TipoEquipaRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.infrastructure.authz.repositories.impl.InMemoryUserRepository;

/**
 * Created by nuno on 20/03/16.
 */
public class InMemoryRepositoryFactory implements RepositoryFactory {

    static {
        // only needed because of the in memory persistence
        new BaseBootstrapper().execute();
    }

    @Override
    public UserRepository users(final TransactionalContext tx) {
        return new InMemoryUserRepository();
    }

    @Override
    public UserRepository users() {
        return users(null);
    }

    @Override
    public ClientUserRepository clientUsers(final TransactionalContext tx) {
        return new InMemoryClientUserRepository();
    }

    @Override
    public ClientUserRepository clientUsers() {
        return clientUsers(null);
    }

    @Override
    public SignupRequestRepository signupRequests() {
        return signupRequests(null);
    }

    @Override
    public SignupRequestRepository signupRequests(final TransactionalContext tx) {
        return new InMemorySignupRequestRepository();
    }

    @Override
    public TransactionalContext newTransactionalContext() {
        return null;
    }

    @Override
    public TipoEquipaRepository tipoEquipas() {
        return tipoEquipas(null);
    }

    @Override
    public TipoEquipaRepository tipoEquipas(final TransactionalContext tx) {
        return new InMemoryTipoEquipaRepository();
    }

    @Override
    public EquipaRepository equipa() {
        return equipa(null);
    }

    @Override
    public EquipaRepository equipa(final TransactionalContext tx) {
        return new InMemoryEquipaRepository();
    }

    @Override
    public ColaboradorRepository colaboradores(final TransactionalContext autoTx) {
        return new InMemoryColaboradorRepository();
    }

    @Override
    public ColaboradorRepository colaboradores() {
        return colaboradores(null);
    }

    @Override
    public CatalogoServicoRepository catalogosServico(final TransactionalContext autoTx) {
        return new InMemoryCatalogoServicoRepository();
    }

    @Override
    public CatalogoServicoRepository catalogosServico() {
        return catalogosServico(null);
    }

    @Override
    public NivelRepository niveis() {
        return niveis(null);
    }


    @Override
    public NivelRepository niveis(final TransactionalContext autoTx) {
        return new InMemoryNivelRepository();
    }

    @Override
    public FuncaoRepository funcoes(TransactionalContext autoTx) {
        return new InMemoryFuncaoRepository();
    }

    @Override
    public FuncaoRepository funcoes() {
        return funcoes(null);
    }

    @Override
    public ServicoRepository servico() {
        return servico(null);
    }

    @Override
    public ServicoRepository servico(final TransactionalContext tx) {
        return new InMemoryServicoRepository();
    }

    @Override
    public FormularioRepository formulario() {
        return formulario(null);
    }

    @Override
    public FormularioRepository formulario(final TransactionalContext tx) {
        return new InMemoryFormularioRepository();
    }

    @Override
    public AtividadeRepository atividade() {
        return atividade(null);
    }

    @Override
    public AtividadeRepository atividade(TransactionalContext autoTx) {
        return new InMemoryAtividadeRepository();
    }

    @Override
    public SlotRepository slot() {
        return slot(null);
    }

    @Override
    public SlotRepository slot(TransactionalContext autoTx) {
        return new InMemorySlotRepository();
    }

    @Override
    public FluxoDeAtividadeRepository fluxoDeAtividade() {
        return fluxoDeAtividade(null);
    }

    @Override
    public FluxoDeAtividadeRepository fluxoDeAtividade(TransactionalContext autoTx) {
        return new InMemoryFluxoDeAtividadeRepository();
    }

    @Override
    public PedidoRepository pedido() {
        return pedido(null);
    }

    @Override
    public PedidoRepository pedido(TransactionalContext autoTx) {
        return new InMemoryPedidoRepository();
    }

}
