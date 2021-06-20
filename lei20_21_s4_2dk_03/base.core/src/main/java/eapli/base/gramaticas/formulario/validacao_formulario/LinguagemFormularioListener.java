// Generated from C:/Users/paulo/OneDrive/Documentos/lprog/src/main/java/eapli/base/gramaticas/formulario/validacao_formulario\LinguagemFormulario.g4 by ANTLR 4.9.1
package eapli.base.gramaticas.formulario.validacao_formulario;
 // classes a incluir
    import java.util.*;
    import java.lang.*;
    import java.io.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LinguagemFormularioParser}.
 */
public interface LinguagemFormularioListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(LinguagemFormularioParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(LinguagemFormularioParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#formulario}.
	 * @param ctx the parse tree
	 */
	void enterFormulario(LinguagemFormularioParser.FormularioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#formulario}.
	 * @param ctx the parse tree
	 */
	void exitFormulario(LinguagemFormularioParser.FormularioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#pedido}.
	 * @param ctx the parse tree
	 */
	void enterPedido(LinguagemFormularioParser.PedidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#pedido}.
	 * @param ctx the parse tree
	 */
	void exitPedido(LinguagemFormularioParser.PedidoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code verificarData}
	 * labeled alternative in {@link LinguagemFormularioParser#pedidoAusencia}.
	 * @param ctx the parse tree
	 */
	void enterVerificarData(LinguagemFormularioParser.VerificarDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code verificarData}
	 * labeled alternative in {@link LinguagemFormularioParser#pedidoAusencia}.
	 * @param ctx the parse tree
	 */
	void exitVerificarData(LinguagemFormularioParser.VerificarDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code verificarDataSemJust}
	 * labeled alternative in {@link LinguagemFormularioParser#pedidoAusencia}.
	 * @param ctx the parse tree
	 */
	void enterVerificarDataSemJust(LinguagemFormularioParser.VerificarDataSemJustContext ctx);
	/**
	 * Exit a parse tree produced by the {@code verificarDataSemJust}
	 * labeled alternative in {@link LinguagemFormularioParser#pedidoAusencia}.
	 * @param ctx the parse tree
	 */
	void exitVerificarDataSemJust(LinguagemFormularioParser.VerificarDataSemJustContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(LinguagemFormularioParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(LinguagemFormularioParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#tAusencia}.
	 * @param ctx the parse tree
	 */
	void enterTAusencia(LinguagemFormularioParser.TAusenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#tAusencia}.
	 * @param ctx the parse tree
	 */
	void exitTAusencia(LinguagemFormularioParser.TAusenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#justificacao}.
	 * @param ctx the parse tree
	 */
	void enterJustificacao(LinguagemFormularioParser.JustificacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#justificacao}.
	 * @param ctx the parse tree
	 */
	void exitJustificacao(LinguagemFormularioParser.JustificacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#pedidoDesconto}.
	 * @param ctx the parse tree
	 */
	void enterPedidoDesconto(LinguagemFormularioParser.PedidoDescontoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#pedidoDesconto}.
	 * @param ctx the parse tree
	 */
	void exitPedidoDesconto(LinguagemFormularioParser.PedidoDescontoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#codigoInterno}.
	 * @param ctx the parse tree
	 */
	void enterCodigoInterno(LinguagemFormularioParser.CodigoInternoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#codigoInterno}.
	 * @param ctx the parse tree
	 */
	void exitCodigoInterno(LinguagemFormularioParser.CodigoInternoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(LinguagemFormularioParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(LinguagemFormularioParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#tipoDesconto}.
	 * @param ctx the parse tree
	 */
	void enterTipoDesconto(LinguagemFormularioParser.TipoDescontoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#tipoDesconto}.
	 * @param ctx the parse tree
	 */
	void exitTipoDesconto(LinguagemFormularioParser.TipoDescontoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#recorrencia}.
	 * @param ctx the parse tree
	 */
	void enterRecorrencia(LinguagemFormularioParser.RecorrenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#recorrencia}.
	 * @param ctx the parse tree
	 */
	void exitRecorrencia(LinguagemFormularioParser.RecorrenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoDesconto}
	 * labeled alternative in {@link LinguagemFormularioParser#desconto}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoDesconto(LinguagemFormularioParser.FuncaoDescontoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoDesconto}
	 * labeled alternative in {@link LinguagemFormularioParser#desconto}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoDesconto(LinguagemFormularioParser.FuncaoDescontoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#percentagemDesconto}.
	 * @param ctx the parse tree
	 */
	void enterPercentagemDesconto(LinguagemFormularioParser.PercentagemDescontoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#percentagemDesconto}.
	 * @param ctx the parse tree
	 */
	void exitPercentagemDesconto(LinguagemFormularioParser.PercentagemDescontoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#valorDesconto}.
	 * @param ctx the parse tree
	 */
	void enterValorDesconto(LinguagemFormularioParser.ValorDescontoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#valorDesconto}.
	 * @param ctx the parse tree
	 */
	void exitValorDesconto(LinguagemFormularioParser.ValorDescontoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#fundamentacaoPedidos}.
	 * @param ctx the parse tree
	 */
	void enterFundamentacaoPedidos(LinguagemFormularioParser.FundamentacaoPedidosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#fundamentacaoPedidos}.
	 * @param ctx the parse tree
	 */
	void exitFundamentacaoPedidos(LinguagemFormularioParser.FundamentacaoPedidosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#identFatura}.
	 * @param ctx the parse tree
	 */
	void enterIdentFatura(LinguagemFormularioParser.IdentFaturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#identFatura}.
	 * @param ctx the parse tree
	 */
	void exitIdentFatura(LinguagemFormularioParser.IdentFaturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#pedidoResidencia}.
	 * @param ctx the parse tree
	 */
	void enterPedidoResidencia(LinguagemFormularioParser.PedidoResidenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#pedidoResidencia}.
	 * @param ctx the parse tree
	 */
	void exitPedidoResidencia(LinguagemFormularioParser.PedidoResidenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#morada}.
	 * @param ctx the parse tree
	 */
	void enterMorada(LinguagemFormularioParser.MoradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#morada}.
	 * @param ctx the parse tree
	 */
	void exitMorada(LinguagemFormularioParser.MoradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#porta}.
	 * @param ctx the parse tree
	 */
	void enterPorta(LinguagemFormularioParser.PortaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#porta}.
	 * @param ctx the parse tree
	 */
	void exitPorta(LinguagemFormularioParser.PortaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#rua}.
	 * @param ctx the parse tree
	 */
	void enterRua(LinguagemFormularioParser.RuaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#rua}.
	 * @param ctx the parse tree
	 */
	void exitRua(LinguagemFormularioParser.RuaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#codigoPostal}.
	 * @param ctx the parse tree
	 */
	void enterCodigoPostal(LinguagemFormularioParser.CodigoPostalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#codigoPostal}.
	 * @param ctx the parse tree
	 */
	void exitCodigoPostal(LinguagemFormularioParser.CodigoPostalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#localidade}.
	 * @param ctx the parse tree
	 */
	void enterLocalidade(LinguagemFormularioParser.LocalidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#localidade}.
	 * @param ctx the parse tree
	 */
	void exitLocalidade(LinguagemFormularioParser.LocalidadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#pedidoCotacaoVendas}.
	 * @param ctx the parse tree
	 */
	void enterPedidoCotacaoVendas(LinguagemFormularioParser.PedidoCotacaoVendasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#pedidoCotacaoVendas}.
	 * @param ctx the parse tree
	 */
	void exitPedidoCotacaoVendas(LinguagemFormularioParser.PedidoCotacaoVendasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#codigoPoduto}.
	 * @param ctx the parse tree
	 */
	void enterCodigoPoduto(LinguagemFormularioParser.CodigoPodutoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#codigoPoduto}.
	 * @param ctx the parse tree
	 */
	void exitCodigoPoduto(LinguagemFormularioParser.CodigoPodutoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#quantidadePretendida}.
	 * @param ctx the parse tree
	 */
	void enterQuantidadePretendida(LinguagemFormularioParser.QuantidadePretendidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#quantidadePretendida}.
	 * @param ctx the parse tree
	 */
	void exitQuantidadePretendida(LinguagemFormularioParser.QuantidadePretendidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#tipoCliente}.
	 * @param ctx the parse tree
	 */
	void enterTipoCliente(LinguagemFormularioParser.TipoClienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#tipoCliente}.
	 * @param ctx the parse tree
	 */
	void exitTipoCliente(LinguagemFormularioParser.TipoClienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#aprovacao}.
	 * @param ctx the parse tree
	 */
	void enterAprovacao(LinguagemFormularioParser.AprovacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#aprovacao}.
	 * @param ctx the parse tree
	 */
	void exitAprovacao(LinguagemFormularioParser.AprovacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#aprovacaoAusencia}.
	 * @param ctx the parse tree
	 */
	void enterAprovacaoAusencia(LinguagemFormularioParser.AprovacaoAusenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#aprovacaoAusencia}.
	 * @param ctx the parse tree
	 */
	void exitAprovacaoAusencia(LinguagemFormularioParser.AprovacaoAusenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#fundamentacaoRespostaAusencia}.
	 * @param ctx the parse tree
	 */
	void enterFundamentacaoRespostaAusencia(LinguagemFormularioParser.FundamentacaoRespostaAusenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#fundamentacaoRespostaAusencia}.
	 * @param ctx the parse tree
	 */
	void exitFundamentacaoRespostaAusencia(LinguagemFormularioParser.FundamentacaoRespostaAusenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#aprovacaoDesconto}.
	 * @param ctx the parse tree
	 */
	void enterAprovacaoDesconto(LinguagemFormularioParser.AprovacaoDescontoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#aprovacaoDesconto}.
	 * @param ctx the parse tree
	 */
	void exitAprovacaoDesconto(LinguagemFormularioParser.AprovacaoDescontoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#fundamentacaoRespostaDesconto}.
	 * @param ctx the parse tree
	 */
	void enterFundamentacaoRespostaDesconto(LinguagemFormularioParser.FundamentacaoRespostaDescontoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#fundamentacaoRespostaDesconto}.
	 * @param ctx the parse tree
	 */
	void exitFundamentacaoRespostaDesconto(LinguagemFormularioParser.FundamentacaoRespostaDescontoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#realizacao}.
	 * @param ctx the parse tree
	 */
	void enterRealizacao(LinguagemFormularioParser.RealizacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#realizacao}.
	 * @param ctx the parse tree
	 */
	void exitRealizacao(LinguagemFormularioParser.RealizacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#realizacaoAusencia}.
	 * @param ctx the parse tree
	 */
	void enterRealizacaoAusencia(LinguagemFormularioParser.RealizacaoAusenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#realizacaoAusencia}.
	 * @param ctx the parse tree
	 */
	void exitRealizacaoAusencia(LinguagemFormularioParser.RealizacaoAusenciaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcaoFerias}
	 * labeled alternative in {@link LinguagemFormularioParser#ferias}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoFerias(LinguagemFormularioParser.FuncaoFeriasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcaoFerias}
	 * labeled alternative in {@link LinguagemFormularioParser#ferias}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoFerias(LinguagemFormularioParser.FuncaoFeriasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#diasJaGozados}.
	 * @param ctx the parse tree
	 */
	void enterDiasJaGozados(LinguagemFormularioParser.DiasJaGozadosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#diasJaGozados}.
	 * @param ctx the parse tree
	 */
	void exitDiasJaGozados(LinguagemFormularioParser.DiasJaGozadosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#diasGozadosPeridoSolicitado}.
	 * @param ctx the parse tree
	 */
	void enterDiasGozadosPeridoSolicitado(LinguagemFormularioParser.DiasGozadosPeridoSolicitadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#diasGozadosPeridoSolicitado}.
	 * @param ctx the parse tree
	 */
	void exitDiasGozadosPeridoSolicitado(LinguagemFormularioParser.DiasGozadosPeridoSolicitadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#feriasTotais}.
	 * @param ctx the parse tree
	 */
	void enterFeriasTotais(LinguagemFormularioParser.FeriasTotaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#feriasTotais}.
	 * @param ctx the parse tree
	 */
	void exitFeriasTotais(LinguagemFormularioParser.FeriasTotaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#faltasJustificadas}.
	 * @param ctx the parse tree
	 */
	void enterFaltasJustificadas(LinguagemFormularioParser.FaltasJustificadasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#faltasJustificadas}.
	 * @param ctx the parse tree
	 */
	void exitFaltasJustificadas(LinguagemFormularioParser.FaltasJustificadasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#diasFaltasJustificadasPeriodoSolicitado}.
	 * @param ctx the parse tree
	 */
	void enterDiasFaltasJustificadasPeriodoSolicitado(LinguagemFormularioParser.DiasFaltasJustificadasPeriodoSolicitadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#diasFaltasJustificadasPeriodoSolicitado}.
	 * @param ctx the parse tree
	 */
	void exitDiasFaltasJustificadasPeriodoSolicitado(LinguagemFormularioParser.DiasFaltasJustificadasPeriodoSolicitadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#faltasJustificadasTotais}.
	 * @param ctx the parse tree
	 */
	void enterFaltasJustificadasTotais(LinguagemFormularioParser.FaltasJustificadasTotaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#faltasJustificadasTotais}.
	 * @param ctx the parse tree
	 */
	void exitFaltasJustificadasTotais(LinguagemFormularioParser.FaltasJustificadasTotaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#faltasInjustificadas}.
	 * @param ctx the parse tree
	 */
	void enterFaltasInjustificadas(LinguagemFormularioParser.FaltasInjustificadasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#faltasInjustificadas}.
	 * @param ctx the parse tree
	 */
	void exitFaltasInjustificadas(LinguagemFormularioParser.FaltasInjustificadasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#faltasInjustificadasPeriodoSolicitado}.
	 * @param ctx the parse tree
	 */
	void enterFaltasInjustificadasPeriodoSolicitado(LinguagemFormularioParser.FaltasInjustificadasPeriodoSolicitadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#faltasInjustificadasPeriodoSolicitado}.
	 * @param ctx the parse tree
	 */
	void exitFaltasInjustificadasPeriodoSolicitado(LinguagemFormularioParser.FaltasInjustificadasPeriodoSolicitadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#faltasInjustificadasTotais}.
	 * @param ctx the parse tree
	 */
	void enterFaltasInjustificadasTotais(LinguagemFormularioParser.FaltasInjustificadasTotaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#faltasInjustificadasTotais}.
	 * @param ctx the parse tree
	 */
	void exitFaltasInjustificadasTotais(LinguagemFormularioParser.FaltasInjustificadasTotaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(LinguagemFormularioParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(LinguagemFormularioParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#realizacaoResidencia}.
	 * @param ctx the parse tree
	 */
	void enterRealizacaoResidencia(LinguagemFormularioParser.RealizacaoResidenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#realizacaoResidencia}.
	 * @param ctx the parse tree
	 */
	void exitRealizacaoResidencia(LinguagemFormularioParser.RealizacaoResidenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#observacoes}.
	 * @param ctx the parse tree
	 */
	void enterObservacoes(LinguagemFormularioParser.ObservacoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#observacoes}.
	 * @param ctx the parse tree
	 */
	void exitObservacoes(LinguagemFormularioParser.ObservacoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#frase}.
	 * @param ctx the parse tree
	 */
	void enterFrase(LinguagemFormularioParser.FraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#frase}.
	 * @param ctx the parse tree
	 */
	void exitFrase(LinguagemFormularioParser.FraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#resposta}.
	 * @param ctx the parse tree
	 */
	void enterResposta(LinguagemFormularioParser.RespostaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#resposta}.
	 * @param ctx the parse tree
	 */
	void exitResposta(LinguagemFormularioParser.RespostaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(LinguagemFormularioParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(LinguagemFormularioParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(LinguagemFormularioParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(LinguagemFormularioParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link LinguagemFormularioParser#digitos}.
	 * @param ctx the parse tree
	 */
	void enterDigitos(LinguagemFormularioParser.DigitosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LinguagemFormularioParser#digitos}.
	 * @param ctx the parse tree
	 */
	void exitDigitos(LinguagemFormularioParser.DigitosContext ctx);
}