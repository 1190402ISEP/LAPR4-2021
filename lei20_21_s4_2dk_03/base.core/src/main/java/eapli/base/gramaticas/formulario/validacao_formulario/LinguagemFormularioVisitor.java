// Generated from C:/Users/paulo/OneDrive/Documentos/lprog/src/main/java/eapli/base/gramaticas/formulario/validacao_formulario\LinguagemFormulario.g4 by ANTLR 4.9.1
package eapli.base.gramaticas.formulario.validacao_formulario;
 // classes a incluir
    import java.util.*;
    import java.lang.*;
    import java.io.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LinguagemFormularioParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LinguagemFormularioVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(LinguagemFormularioParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#formulario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormulario(LinguagemFormularioParser.FormularioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#pedido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPedido(LinguagemFormularioParser.PedidoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verificarData}
	 * labeled alternative in {@link LinguagemFormularioParser#pedidoAusencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerificarData(LinguagemFormularioParser.VerificarDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verificarDataSemJust}
	 * labeled alternative in {@link LinguagemFormularioParser#pedidoAusencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerificarDataSemJust(LinguagemFormularioParser.VerificarDataSemJustContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(LinguagemFormularioParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#tAusencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTAusencia(LinguagemFormularioParser.TAusenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#justificacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustificacao(LinguagemFormularioParser.JustificacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#pedidoDesconto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPedidoDesconto(LinguagemFormularioParser.PedidoDescontoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#codigoInterno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigoInterno(LinguagemFormularioParser.CodigoInternoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(LinguagemFormularioParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#tipoDesconto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDesconto(LinguagemFormularioParser.TipoDescontoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#recorrencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecorrencia(LinguagemFormularioParser.RecorrenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoDesconto}
	 * labeled alternative in {@link LinguagemFormularioParser#desconto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoDesconto(LinguagemFormularioParser.FuncaoDescontoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#percentagemDesconto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentagemDesconto(LinguagemFormularioParser.PercentagemDescontoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#valorDesconto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorDesconto(LinguagemFormularioParser.ValorDescontoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#fundamentacaoPedidos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFundamentacaoPedidos(LinguagemFormularioParser.FundamentacaoPedidosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#identFatura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentFatura(LinguagemFormularioParser.IdentFaturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#pedidoResidencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPedidoResidencia(LinguagemFormularioParser.PedidoResidenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#morada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMorada(LinguagemFormularioParser.MoradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#porta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPorta(LinguagemFormularioParser.PortaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#rua}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRua(LinguagemFormularioParser.RuaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#codigoPostal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigoPostal(LinguagemFormularioParser.CodigoPostalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#localidade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalidade(LinguagemFormularioParser.LocalidadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#pedidoCotacaoVendas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPedidoCotacaoVendas(LinguagemFormularioParser.PedidoCotacaoVendasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#codigoPoduto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigoPoduto(LinguagemFormularioParser.CodigoPodutoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#quantidadePretendida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantidadePretendida(LinguagemFormularioParser.QuantidadePretendidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#tipoCliente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoCliente(LinguagemFormularioParser.TipoClienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#aprovacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAprovacao(LinguagemFormularioParser.AprovacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#aprovacaoAusencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAprovacaoAusencia(LinguagemFormularioParser.AprovacaoAusenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#fundamentacaoRespostaAusencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFundamentacaoRespostaAusencia(LinguagemFormularioParser.FundamentacaoRespostaAusenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#aprovacaoDesconto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAprovacaoDesconto(LinguagemFormularioParser.AprovacaoDescontoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#fundamentacaoRespostaDesconto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFundamentacaoRespostaDesconto(LinguagemFormularioParser.FundamentacaoRespostaDescontoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#realizacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealizacao(LinguagemFormularioParser.RealizacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#realizacaoAusencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealizacaoAusencia(LinguagemFormularioParser.RealizacaoAusenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoFerias}
	 * labeled alternative in {@link LinguagemFormularioParser#ferias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoFerias(LinguagemFormularioParser.FuncaoFeriasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#diasJaGozados}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiasJaGozados(LinguagemFormularioParser.DiasJaGozadosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#diasGozadosPeridoSolicitado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiasGozadosPeridoSolicitado(LinguagemFormularioParser.DiasGozadosPeridoSolicitadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#feriasTotais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeriasTotais(LinguagemFormularioParser.FeriasTotaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#faltasJustificadas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaltasJustificadas(LinguagemFormularioParser.FaltasJustificadasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#diasFaltasJustificadasPeriodoSolicitado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiasFaltasJustificadasPeriodoSolicitado(LinguagemFormularioParser.DiasFaltasJustificadasPeriodoSolicitadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#faltasJustificadasTotais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaltasJustificadasTotais(LinguagemFormularioParser.FaltasJustificadasTotaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#faltasInjustificadas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaltasInjustificadas(LinguagemFormularioParser.FaltasInjustificadasContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#faltasInjustificadasPeriodoSolicitado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaltasInjustificadasPeriodoSolicitado(LinguagemFormularioParser.FaltasInjustificadasPeriodoSolicitadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#faltasInjustificadasTotais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaltasInjustificadasTotais(LinguagemFormularioParser.FaltasInjustificadasTotaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(LinguagemFormularioParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#realizacaoResidencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealizacaoResidencia(LinguagemFormularioParser.RealizacaoResidenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#observacoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObservacoes(LinguagemFormularioParser.ObservacoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#frase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrase(LinguagemFormularioParser.FraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#resposta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResposta(LinguagemFormularioParser.RespostaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(LinguagemFormularioParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(LinguagemFormularioParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by {@link LinguagemFormularioParser#digitos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitos(LinguagemFormularioParser.DigitosContext ctx);
}