package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.atividade.repositories.AtividadeRepository;
import eapli.base.catalogoServico.repository.CatalogoServicoRepository;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.clientusermanagement.repositories.SignupRequestRepository;
import eapli.base.equipa.repositories.EquipaRepository;
import eapli.base.fluxodeatividade.repository.FluxoDeAtividadeRepository;
import eapli.base.formulario.repository.FormularioRepository;
import eapli.base.funcao.repositories.FuncaoRepository;
import eapli.base.infrastructure.persistence.RepositoryFactory;
import eapli.base.nivelCriticidade.repository.NivelRepository;
import eapli.base.pedido.repositories.PedidoRepository;
import eapli.base.persistence.impl.inmemory.InMemoryFuncaoRepository;
import eapli.base.servico.repository.ServicoRepository;
import eapli.base.slot.repository.SlotRepository;
import eapli.base.tipoequipa.repositories.TipoEquipaRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.infrastructure.authz.repositories.impl.JpaAutoTxUserRepository;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaRepositoryFactory implements RepositoryFactory {

    public JpaRepositoryFactory() {

    }

    @Override
    public UserRepository users(final TransactionalContext autoTx) {
        return new JpaAutoTxUserRepository(autoTx);
    }

    @Override
    public UserRepository users() {
        return new JpaAutoTxUserRepository(Application.settings().getPersistenceUnitName(),
                Application.settings().getExtendedPersistenceProperties());
    }

    @Override
    public JpaClientUserRepository clientUsers(final TransactionalContext autoTx) {
        return new JpaClientUserRepository(autoTx);
    }

    @Override
    public JpaClientUserRepository clientUsers() {
        return new JpaClientUserRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public SignupRequestRepository signupRequests(final TransactionalContext autoTx) {
        return new JpaSignupRequestRepository(autoTx);
    }

    @Override
    public SignupRequestRepository signupRequests() {
        return new JpaSignupRequestRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public TransactionalContext newTransactionalContext() {
        return JpaAutoTxRepository.buildTransactionalContext(Application.settings().getPersistenceUnitName(),
                Application.settings().getExtendedPersistenceProperties());
    }

    @Override
    public TipoEquipaRepository tipoEquipas(final TransactionalContext autoTx) {
        return new JpaTipoEquipaRepository(autoTx);
    }

    @Override
    public TipoEquipaRepository tipoEquipas() {
        return new JpaTipoEquipaRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public EquipaRepository equipa(final TransactionalContext autoTx) {
        return new JpaEquipaRepository(autoTx);
    }

    @Override
    public EquipaRepository equipa() {
        return new JpaEquipaRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public ColaboradorRepository colaboradores(final TransactionalContext autoTx) {
        return new JpaColaboradorRepository(autoTx);
    }

    @Override
    public ColaboradorRepository colaboradores() {
        return new JpaColaboradorRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public CatalogoServicoRepository catalogosServico(TransactionalContext autoTx) {
        return new JpaCatologoServicoRepository(autoTx);
    }

    @Override
    public CatalogoServicoRepository catalogosServico() {
        return new JpaCatologoServicoRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public NivelRepository niveis() {
        return new JpaNiveisRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public NivelRepository niveis(final TransactionalContext autoTx) {
        return new JpaNiveisRepository(autoTx);
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
    public ServicoRepository servico(final TransactionalContext autoTx) {
        return new JpaServicoRepository(autoTx);
    }

    @Override
    public ServicoRepository servico() {
        return new JpaServicoRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public FormularioRepository formulario(final TransactionalContext autoTx) {
        return new JpaFormularioRepository(autoTx);
    }

    @Override
    public FormularioRepository formulario() {
        return new JpaFormularioRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public AtividadeRepository atividade(TransactionalContext autoTx) {
        return new JpaAtividadeRepository(autoTx);
    }

    @Override
    public AtividadeRepository atividade() {
        return new JpaAtividadeRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public SlotRepository slot(TransactionalContext autoTx) {
        return new JpaSlotRepository(autoTx);
    }

    @Override
    public SlotRepository slot() {
        return new JpaSlotRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public FluxoDeAtividadeRepository fluxoDeAtividade(TransactionalContext autoTx) {
        return new JpaFluxoDeAtividadeRepository(autoTx);
    }

    @Override
    public FluxoDeAtividadeRepository fluxoDeAtividade() {
        return new JpaFluxoDeAtividadeRepository(Application.settings().getPersistenceUnitName());
    }

    @Override
    public PedidoRepository pedido(TransactionalContext autoTx) {
        return new JpaPedidoRepository(autoTx);
    }

    @Override
    public PedidoRepository pedido() {
        return new JpaPedidoRepository(Application.settings().getPersistenceUnitName());
    }
}
