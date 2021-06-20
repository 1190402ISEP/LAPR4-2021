// Generated from C:/Users/paulo/OneDrive/Documentos/lprog/src/main/java/eapli/base/gramaticas/formulario/validacao_formulario\LinguagemFormulario.g4 by ANTLR 4.9.1
package eapli.base.gramaticas.formulario.validacao_formulario;
 // classes a incluir
    import java.util.*;
    import java.lang.*;
    import java.io.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinguagemFormularioParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, DIA=14, MES=15, ANO=16, WORD=17, 
		NUMERO=18, LETRA=19, WS=20, NEWLINE=21;
	public static final int
		RULE_start = 0, RULE_formulario = 1, RULE_pedido = 2, RULE_pedidoAusencia = 3, 
		RULE_data = 4, RULE_tAusencia = 5, RULE_justificacao = 6, RULE_pedidoDesconto = 7, 
		RULE_codigoInterno = 8, RULE_nome = 9, RULE_tipoDesconto = 10, RULE_recorrencia = 11, 
		RULE_desconto = 12, RULE_percentagemDesconto = 13, RULE_valorDesconto = 14, 
		RULE_fundamentacaoPedidos = 15, RULE_identFatura = 16, RULE_pedidoResidencia = 17, 
		RULE_morada = 18, RULE_porta = 19, RULE_rua = 20, RULE_codigoPostal = 21, 
		RULE_localidade = 22, RULE_pedidoCotacaoVendas = 23, RULE_codigoPoduto = 24, 
		RULE_quantidadePretendida = 25, RULE_tipoCliente = 26, RULE_aprovacao = 27, 
		RULE_aprovacaoAusencia = 28, RULE_fundamentacaoRespostaAusencia = 29, 
		RULE_aprovacaoDesconto = 30, RULE_fundamentacaoRespostaDesconto = 31, 
		RULE_realizacao = 32, RULE_realizacaoAusencia = 33, RULE_ferias = 34, 
		RULE_diasJaGozados = 35, RULE_diasGozadosPeridoSolicitado = 36, RULE_feriasTotais = 37, 
		RULE_faltasJustificadas = 38, RULE_diasFaltasJustificadasPeriodoSolicitado = 39, 
		RULE_faltasJustificadasTotais = 40, RULE_faltasInjustificadas = 41, RULE_faltasInjustificadasPeriodoSolicitado = 42, 
		RULE_faltasInjustificadasTotais = 43, RULE_comentario = 44, RULE_realizacaoResidencia = 45, 
		RULE_observacoes = 46, RULE_frase = 47, RULE_resposta = 48, RULE_identificador = 49, 
		RULE_real = 50, RULE_digitos = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "formulario", "pedido", "pedidoAusencia", "data", "tAusencia", 
			"justificacao", "pedidoDesconto", "codigoInterno", "nome", "tipoDesconto", 
			"recorrencia", "desconto", "percentagemDesconto", "valorDesconto", "fundamentacaoPedidos", 
			"identFatura", "pedidoResidencia", "morada", "porta", "rua", "codigoPostal", 
			"localidade", "pedidoCotacaoVendas", "codigoPoduto", "quantidadePretendida", 
			"tipoCliente", "aprovacao", "aprovacaoAusencia", "fundamentacaoRespostaAusencia", 
			"aprovacaoDesconto", "fundamentacaoRespostaDesconto", "realizacao", "realizacaoAusencia", 
			"ferias", "diasJaGozados", "diasGozadosPeridoSolicitado", "feriasTotais", 
			"faltasJustificadas", "diasFaltasJustificadasPeriodoSolicitado", "faltasJustificadasTotais", 
			"faltasInjustificadas", "faltasInjustificadasPeriodoSolicitado", "faltasInjustificadasTotais", 
			"comentario", "realizacaoResidencia", "observacoes", "frase", "resposta", 
			"identificador", "real", "digitos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'/'", "'Ferias'", "'Justificada'", "'Nao justificada'", "'Unica'", 
			"'Ate Data Limite'", "'-'", "'Nacional'", "'Europeu'", "'Resto do Mundo'", 
			"'Aprovado'", "'Recusado'", "'.'", null, null, null, null, null, null, 
			null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "DIA", "MES", "ANO", "WORD", "NUMERO", "LETRA", "WS", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LinguagemFormulario.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LinguagemFormularioParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public FormularioContext formulario() {
			return getRuleContext(FormularioContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LinguagemFormularioParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(LinguagemFormularioParser.NEWLINE, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				formulario();
				setState(105);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				formulario();
				setState(108);
				match(NEWLINE);
				setState(109);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormularioContext extends ParserRuleContext {
		public PedidoContext pedido() {
			return getRuleContext(PedidoContext.class,0);
		}
		public AprovacaoContext aprovacao() {
			return getRuleContext(AprovacaoContext.class,0);
		}
		public RealizacaoContext realizacao() {
			return getRuleContext(RealizacaoContext.class,0);
		}
		public FormularioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterFormulario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitFormulario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitFormulario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormularioContext formulario() throws RecognitionException {
		FormularioContext _localctx = new FormularioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_formulario);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				pedido();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				aprovacao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				realizacao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PedidoContext extends ParserRuleContext {
		public PedidoAusenciaContext pedidoAusencia() {
			return getRuleContext(PedidoAusenciaContext.class,0);
		}
		public PedidoDescontoContext pedidoDesconto() {
			return getRuleContext(PedidoDescontoContext.class,0);
		}
		public PedidoResidenciaContext pedidoResidencia() {
			return getRuleContext(PedidoResidenciaContext.class,0);
		}
		public PedidoCotacaoVendasContext pedidoCotacaoVendas() {
			return getRuleContext(PedidoCotacaoVendasContext.class,0);
		}
		public PedidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pedido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterPedido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitPedido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitPedido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PedidoContext pedido() throws RecognitionException {
		PedidoContext _localctx = new PedidoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pedido);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				pedidoAusencia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				pedidoDesconto();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				pedidoResidencia();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				pedidoCotacaoVendas();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PedidoAusenciaContext extends ParserRuleContext {
		public PedidoAusenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pedidoAusencia; }
	 
		public PedidoAusenciaContext() { }
		public void copyFrom(PedidoAusenciaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VerificarDataContext extends PedidoAusenciaContext {
		public DataContext dataInicio;
		public DataContext dataFim;
		public TAusenciaContext ausencia;
		public JustificacaoContext just;
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public TAusenciaContext tAusencia() {
			return getRuleContext(TAusenciaContext.class,0);
		}
		public JustificacaoContext justificacao() {
			return getRuleContext(JustificacaoContext.class,0);
		}
		public VerificarDataContext(PedidoAusenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterVerificarData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitVerificarData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitVerificarData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerificarDataSemJustContext extends PedidoAusenciaContext {
		public DataContext dataInicio;
		public DataContext dataFim;
		public TAusenciaContext ausencia;
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public TAusenciaContext tAusencia() {
			return getRuleContext(TAusenciaContext.class,0);
		}
		public VerificarDataSemJustContext(PedidoAusenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterVerificarDataSemJust(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitVerificarDataSemJust(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitVerificarDataSemJust(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PedidoAusenciaContext pedidoAusencia() throws RecognitionException {
		PedidoAusenciaContext _localctx = new PedidoAusenciaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pedidoAusencia);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new VerificarDataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				((VerificarDataContext)_localctx).dataInicio = data();
				setState(125);
				((VerificarDataContext)_localctx).dataFim = data();
				setState(126);
				((VerificarDataContext)_localctx).ausencia = tAusencia();
				setState(127);
				((VerificarDataContext)_localctx).just = justificacao();
				}
				break;
			case 2:
				_localctx = new VerificarDataSemJustContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				((VerificarDataSemJustContext)_localctx).dataInicio = data();
				setState(130);
				((VerificarDataSemJustContext)_localctx).dataFim = data();
				setState(131);
				((VerificarDataSemJustContext)_localctx).ausencia = tAusencia();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public TerminalNode DIA() { return getToken(LinguagemFormularioParser.DIA, 0); }
		public TerminalNode MES() { return getToken(LinguagemFormularioParser.MES, 0); }
		public TerminalNode ANO() { return getToken(LinguagemFormularioParser.ANO, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_data);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(DIA);
				setState(136);
				match(T__0);
				setState(137);
				match(MES);
				setState(138);
				match(T__0);
				setState(139);
				match(ANO);
				}
				break;
			case ANO:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(ANO);
				setState(141);
				match(T__0);
				setState(142);
				match(MES);
				setState(143);
				match(T__0);
				setState(144);
				match(DIA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TAusenciaContext extends ParserRuleContext {
		public TAusenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tAusencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterTAusencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitTAusencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitTAusencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TAusenciaContext tAusencia() throws RecognitionException {
		TAusenciaContext _localctx = new TAusenciaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tAusencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JustificacaoContext extends ParserRuleContext {
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public JustificacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_justificacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterJustificacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitJustificacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitJustificacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JustificacaoContext justificacao() throws RecognitionException {
		JustificacaoContext _localctx = new JustificacaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_justificacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			frase();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PedidoDescontoContext extends ParserRuleContext {
		public CodigoInternoContext codigoInterno() {
			return getRuleContext(CodigoInternoContext.class,0);
		}
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public TipoDescontoContext tipoDesconto() {
			return getRuleContext(TipoDescontoContext.class,0);
		}
		public RecorrenciaContext recorrencia() {
			return getRuleContext(RecorrenciaContext.class,0);
		}
		public DescontoContext desconto() {
			return getRuleContext(DescontoContext.class,0);
		}
		public IdentFaturaContext identFatura() {
			return getRuleContext(IdentFaturaContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public FundamentacaoPedidosContext fundamentacaoPedidos() {
			return getRuleContext(FundamentacaoPedidosContext.class,0);
		}
		public PedidoDescontoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pedidoDesconto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterPedidoDesconto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitPedidoDesconto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitPedidoDesconto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PedidoDescontoContext pedidoDesconto() throws RecognitionException {
		PedidoDescontoContext _localctx = new PedidoDescontoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pedidoDesconto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			codigoInterno();
			setState(152);
			nome();
			setState(153);
			tipoDesconto();
			setState(154);
			recorrencia();
			setState(155);
			desconto();
			setState(156);
			identFatura();
			setState(157);
			data();
			setState(158);
			fundamentacaoPedidos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodigoInternoContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(LinguagemFormularioParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(LinguagemFormularioParser.LETRA, i);
		}
		public List<TerminalNode> NUMERO() { return getTokens(LinguagemFormularioParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(LinguagemFormularioParser.NUMERO, i);
		}
		public CodigoInternoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigoInterno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterCodigoInterno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitCodigoInterno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitCodigoInterno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoInternoContext codigoInterno() throws RecognitionException {
		CodigoInternoContext _localctx = new CodigoInternoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_codigoInterno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(LETRA);
			setState(161);
			match(LETRA);
			setState(162);
			match(LETRA);
			setState(163);
			match(NUMERO);
			setState(164);
			match(NUMERO);
			setState(165);
			match(NUMERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeContext extends ParserRuleContext {
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			frase();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoDescontoContext extends ParserRuleContext {
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public TipoDescontoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDesconto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterTipoDesconto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitTipoDesconto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitTipoDesconto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDescontoContext tipoDesconto() throws RecognitionException {
		TipoDescontoContext _localctx = new TipoDescontoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipoDesconto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			frase();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecorrenciaContext extends ParserRuleContext {
		public RecorrenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recorrencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterRecorrencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitRecorrencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitRecorrencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecorrenciaContext recorrencia() throws RecognitionException {
		RecorrenciaContext _localctx = new RecorrenciaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_recorrencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescontoContext extends ParserRuleContext {
		public DescontoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desconto; }
	 
		public DescontoContext() { }
		public void copyFrom(DescontoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncaoDescontoContext extends DescontoContext {
		public PercentagemDescontoContext percentagem;
		public ValorDescontoContext valor;
		public PercentagemDescontoContext percentagemDesconto() {
			return getRuleContext(PercentagemDescontoContext.class,0);
		}
		public ValorDescontoContext valorDesconto() {
			return getRuleContext(ValorDescontoContext.class,0);
		}
		public FuncaoDescontoContext(DescontoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterFuncaoDesconto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitFuncaoDesconto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitFuncaoDesconto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescontoContext desconto() throws RecognitionException {
		DescontoContext _localctx = new DescontoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_desconto);
		try {
			_localctx = new FuncaoDescontoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			((FuncaoDescontoContext)_localctx).percentagem = percentagemDesconto();
			setState(174);
			((FuncaoDescontoContext)_localctx).valor = valorDesconto();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PercentagemDescontoContext extends ParserRuleContext {
		public DigitosContext digitos() {
			return getRuleContext(DigitosContext.class,0);
		}
		public PercentagemDescontoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percentagemDesconto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterPercentagemDesconto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitPercentagemDesconto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitPercentagemDesconto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PercentagemDescontoContext percentagemDesconto() throws RecognitionException {
		PercentagemDescontoContext _localctx = new PercentagemDescontoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_percentagemDesconto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			digitos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorDescontoContext extends ParserRuleContext {
		public DigitosContext digitos() {
			return getRuleContext(DigitosContext.class,0);
		}
		public ValorDescontoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorDesconto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterValorDesconto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitValorDesconto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitValorDesconto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorDescontoContext valorDesconto() throws RecognitionException {
		ValorDescontoContext _localctx = new ValorDescontoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valorDesconto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			digitos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FundamentacaoPedidosContext extends ParserRuleContext {
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public FundamentacaoPedidosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fundamentacaoPedidos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterFundamentacaoPedidos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitFundamentacaoPedidos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitFundamentacaoPedidos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FundamentacaoPedidosContext fundamentacaoPedidos() throws RecognitionException {
		FundamentacaoPedidosContext _localctx = new FundamentacaoPedidosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fundamentacaoPedidos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			frase();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentFaturaContext extends ParserRuleContext {
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public IdentFaturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identFatura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterIdentFatura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitIdentFatura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitIdentFatura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentFaturaContext identFatura() throws RecognitionException {
		IdentFaturaContext _localctx = new IdentFaturaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_identFatura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			frase();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PedidoResidenciaContext extends ParserRuleContext {
		public MoradaContext morada() {
			return getRuleContext(MoradaContext.class,0);
		}
		public CodigoPostalContext codigoPostal() {
			return getRuleContext(CodigoPostalContext.class,0);
		}
		public LocalidadeContext localidade() {
			return getRuleContext(LocalidadeContext.class,0);
		}
		public PedidoResidenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pedidoResidencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterPedidoResidencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitPedidoResidencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitPedidoResidencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PedidoResidenciaContext pedidoResidencia() throws RecognitionException {
		PedidoResidenciaContext _localctx = new PedidoResidenciaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pedidoResidencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			morada();
			setState(185);
			codigoPostal();
			setState(186);
			localidade();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoradaContext extends ParserRuleContext {
		public RuaContext rua() {
			return getRuleContext(RuaContext.class,0);
		}
		public PortaContext porta() {
			return getRuleContext(PortaContext.class,0);
		}
		public MoradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_morada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterMorada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitMorada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitMorada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoradaContext morada() throws RecognitionException {
		MoradaContext _localctx = new MoradaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_morada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			rua();
			setState(189);
			porta();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PortaContext extends ParserRuleContext {
		public DigitosContext digitos() {
			return getRuleContext(DigitosContext.class,0);
		}
		public PortaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_porta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterPorta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitPorta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitPorta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortaContext porta() throws RecognitionException {
		PortaContext _localctx = new PortaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_porta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			digitos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuaContext extends ParserRuleContext {
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public RuaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rua; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterRua(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitRua(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitRua(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuaContext rua() throws RecognitionException {
		RuaContext _localctx = new RuaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_rua);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			frase();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodigoPostalContext extends ParserRuleContext {
		public List<TerminalNode> NUMERO() { return getTokens(LinguagemFormularioParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(LinguagemFormularioParser.NUMERO, i);
		}
		public CodigoPostalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigoPostal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterCodigoPostal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitCodigoPostal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitCodigoPostal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoPostalContext codigoPostal() throws RecognitionException {
		CodigoPostalContext _localctx = new CodigoPostalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_codigoPostal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(NUMERO);
			setState(196);
			match(NUMERO);
			setState(197);
			match(NUMERO);
			setState(198);
			match(NUMERO);
			setState(199);
			match(T__6);
			setState(200);
			match(NUMERO);
			setState(201);
			match(NUMERO);
			setState(202);
			match(NUMERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalidadeContext extends ParserRuleContext {
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public LocalidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterLocalidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitLocalidade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitLocalidade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalidadeContext localidade() throws RecognitionException {
		LocalidadeContext _localctx = new LocalidadeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_localidade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			frase();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PedidoCotacaoVendasContext extends ParserRuleContext {
		public CodigoPodutoContext codigoPoduto() {
			return getRuleContext(CodigoPodutoContext.class,0);
		}
		public QuantidadePretendidaContext quantidadePretendida() {
			return getRuleContext(QuantidadePretendidaContext.class,0);
		}
		public TipoClienteContext tipoCliente() {
			return getRuleContext(TipoClienteContext.class,0);
		}
		public PedidoCotacaoVendasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pedidoCotacaoVendas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterPedidoCotacaoVendas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitPedidoCotacaoVendas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitPedidoCotacaoVendas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PedidoCotacaoVendasContext pedidoCotacaoVendas() throws RecognitionException {
		PedidoCotacaoVendasContext _localctx = new PedidoCotacaoVendasContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pedidoCotacaoVendas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			codigoPoduto();
			setState(207);
			quantidadePretendida();
			setState(208);
			tipoCliente();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodigoPodutoContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(LinguagemFormularioParser.WORD, 0); }
		public CodigoPodutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigoPoduto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterCodigoPoduto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitCodigoPoduto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitCodigoPoduto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoPodutoContext codigoPoduto() throws RecognitionException {
		CodigoPodutoContext _localctx = new CodigoPodutoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_codigoPoduto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantidadePretendidaContext extends ParserRuleContext {
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public QuantidadePretendidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantidadePretendida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterQuantidadePretendida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitQuantidadePretendida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitQuantidadePretendida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantidadePretendidaContext quantidadePretendida() throws RecognitionException {
		QuantidadePretendidaContext _localctx = new QuantidadePretendidaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_quantidadePretendida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			real();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoClienteContext extends ParserRuleContext {
		public TipoClienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoCliente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterTipoCliente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitTipoCliente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitTipoCliente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoClienteContext tipoCliente() throws RecognitionException {
		TipoClienteContext _localctx = new TipoClienteContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tipoCliente);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AprovacaoContext extends ParserRuleContext {
		public AprovacaoAusenciaContext aprovacaoAusencia() {
			return getRuleContext(AprovacaoAusenciaContext.class,0);
		}
		public AprovacaoDescontoContext aprovacaoDesconto() {
			return getRuleContext(AprovacaoDescontoContext.class,0);
		}
		public AprovacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aprovacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterAprovacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitAprovacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitAprovacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AprovacaoContext aprovacao() throws RecognitionException {
		AprovacaoContext _localctx = new AprovacaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_aprovacao);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				aprovacaoAusencia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				aprovacaoDesconto();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AprovacaoAusenciaContext extends ParserRuleContext {
		public RespostaContext resposta() {
			return getRuleContext(RespostaContext.class,0);
		}
		public FundamentacaoRespostaAusenciaContext fundamentacaoRespostaAusencia() {
			return getRuleContext(FundamentacaoRespostaAusenciaContext.class,0);
		}
		public AprovacaoAusenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aprovacaoAusencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterAprovacaoAusencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitAprovacaoAusencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitAprovacaoAusencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AprovacaoAusenciaContext aprovacaoAusencia() throws RecognitionException {
		AprovacaoAusenciaContext _localctx = new AprovacaoAusenciaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_aprovacaoAusencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			resposta();
			setState(221);
			fundamentacaoRespostaAusencia();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FundamentacaoRespostaAusenciaContext extends ParserRuleContext {
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public FundamentacaoRespostaAusenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fundamentacaoRespostaAusencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterFundamentacaoRespostaAusencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitFundamentacaoRespostaAusencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitFundamentacaoRespostaAusencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FundamentacaoRespostaAusenciaContext fundamentacaoRespostaAusencia() throws RecognitionException {
		FundamentacaoRespostaAusenciaContext _localctx = new FundamentacaoRespostaAusenciaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fundamentacaoRespostaAusencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			frase();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AprovacaoDescontoContext extends ParserRuleContext {
		public RespostaContext resposta() {
			return getRuleContext(RespostaContext.class,0);
		}
		public FundamentacaoRespostaDescontoContext fundamentacaoRespostaDesconto() {
			return getRuleContext(FundamentacaoRespostaDescontoContext.class,0);
		}
		public DescontoContext desconto() {
			return getRuleContext(DescontoContext.class,0);
		}
		public AprovacaoDescontoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aprovacaoDesconto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterAprovacaoDesconto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitAprovacaoDesconto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitAprovacaoDesconto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AprovacaoDescontoContext aprovacaoDesconto() throws RecognitionException {
		AprovacaoDescontoContext _localctx = new AprovacaoDescontoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_aprovacaoDesconto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			resposta();
			setState(226);
			fundamentacaoRespostaDesconto();
			setState(227);
			desconto();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FundamentacaoRespostaDescontoContext extends ParserRuleContext {
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public FundamentacaoRespostaDescontoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fundamentacaoRespostaDesconto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterFundamentacaoRespostaDesconto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitFundamentacaoRespostaDesconto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitFundamentacaoRespostaDesconto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FundamentacaoRespostaDescontoContext fundamentacaoRespostaDesconto() throws RecognitionException {
		FundamentacaoRespostaDescontoContext _localctx = new FundamentacaoRespostaDescontoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_fundamentacaoRespostaDesconto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			frase();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealizacaoContext extends ParserRuleContext {
		public RealizacaoAusenciaContext realizacaoAusencia() {
			return getRuleContext(RealizacaoAusenciaContext.class,0);
		}
		public RealizacaoResidenciaContext realizacaoResidencia() {
			return getRuleContext(RealizacaoResidenciaContext.class,0);
		}
		public RealizacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realizacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterRealizacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitRealizacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitRealizacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealizacaoContext realizacao() throws RecognitionException {
		RealizacaoContext _localctx = new RealizacaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_realizacao);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				realizacaoAusencia();
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				realizacaoResidencia();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealizacaoAusenciaContext extends ParserRuleContext {
		public FeriasContext ferias() {
			return getRuleContext(FeriasContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public RealizacaoAusenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realizacaoAusencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterRealizacaoAusencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitRealizacaoAusencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitRealizacaoAusencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealizacaoAusenciaContext realizacaoAusencia() throws RecognitionException {
		RealizacaoAusenciaContext _localctx = new RealizacaoAusenciaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_realizacaoAusencia);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				ferias();
				setState(236);
				comentario();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				ferias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeriasContext extends ParserRuleContext {
		public FeriasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ferias; }
	 
		public FeriasContext() { }
		public void copyFrom(FeriasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncaoFeriasContext extends FeriasContext {
		public DiasJaGozadosContext diasJG;
		public DiasGozadosPeridoSolicitadoContext diasGPS;
		public FeriasTotaisContext feriasT;
		public FaltasJustificadasContext faltasJ;
		public DiasFaltasJustificadasPeriodoSolicitadoContext diasFJPS;
		public FaltasJustificadasTotaisContext faltasJT;
		public FaltasInjustificadasContext faltasI;
		public FaltasInjustificadasPeriodoSolicitadoContext faltasIPS;
		public FaltasInjustificadasTotaisContext faltasIT;
		public DiasJaGozadosContext diasJaGozados() {
			return getRuleContext(DiasJaGozadosContext.class,0);
		}
		public DiasGozadosPeridoSolicitadoContext diasGozadosPeridoSolicitado() {
			return getRuleContext(DiasGozadosPeridoSolicitadoContext.class,0);
		}
		public FeriasTotaisContext feriasTotais() {
			return getRuleContext(FeriasTotaisContext.class,0);
		}
		public FaltasJustificadasContext faltasJustificadas() {
			return getRuleContext(FaltasJustificadasContext.class,0);
		}
		public DiasFaltasJustificadasPeriodoSolicitadoContext diasFaltasJustificadasPeriodoSolicitado() {
			return getRuleContext(DiasFaltasJustificadasPeriodoSolicitadoContext.class,0);
		}
		public FaltasJustificadasTotaisContext faltasJustificadasTotais() {
			return getRuleContext(FaltasJustificadasTotaisContext.class,0);
		}
		public FaltasInjustificadasContext faltasInjustificadas() {
			return getRuleContext(FaltasInjustificadasContext.class,0);
		}
		public FaltasInjustificadasPeriodoSolicitadoContext faltasInjustificadasPeriodoSolicitado() {
			return getRuleContext(FaltasInjustificadasPeriodoSolicitadoContext.class,0);
		}
		public FaltasInjustificadasTotaisContext faltasInjustificadasTotais() {
			return getRuleContext(FaltasInjustificadasTotaisContext.class,0);
		}
		public FuncaoFeriasContext(FeriasContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterFuncaoFerias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitFuncaoFerias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitFuncaoFerias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeriasContext ferias() throws RecognitionException {
		FeriasContext _localctx = new FeriasContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ferias);
		try {
			_localctx = new FuncaoFeriasContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			((FuncaoFeriasContext)_localctx).diasJG = diasJaGozados();
			setState(242);
			((FuncaoFeriasContext)_localctx).diasGPS = diasGozadosPeridoSolicitado();
			setState(243);
			((FuncaoFeriasContext)_localctx).feriasT = feriasTotais();
			setState(244);
			((FuncaoFeriasContext)_localctx).faltasJ = faltasJustificadas();
			setState(245);
			((FuncaoFeriasContext)_localctx).diasFJPS = diasFaltasJustificadasPeriodoSolicitado();
			setState(246);
			((FuncaoFeriasContext)_localctx).faltasJT = faltasJustificadasTotais();
			setState(247);
			((FuncaoFeriasContext)_localctx).faltasI = faltasInjustificadas();
			setState(248);
			((FuncaoFeriasContext)_localctx).faltasIPS = faltasInjustificadasPeriodoSolicitado();
			setState(249);
			((FuncaoFeriasContext)_localctx).faltasIT = faltasInjustificadasTotais();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiasJaGozadosContext extends ParserRuleContext {
		public DigitosContext digitos() {
			return getRuleContext(DigitosContext.class,0);
		}
		public DiasJaGozadosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diasJaGozados; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterDiasJaGozados(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitDiasJaGozados(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitDiasJaGozados(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiasJaGozadosContext diasJaGozados() throws RecognitionException {
		DiasJaGozadosContext _localctx = new DiasJaGozadosContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_diasJaGozados);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			digitos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiasGozadosPeridoSolicitadoContext extends ParserRuleContext {
		public DigitosContext digitos() {
			return getRuleContext(DigitosContext.class,0);
		}
		public DiasGozadosPeridoSolicitadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diasGozadosPeridoSolicitado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterDiasGozadosPeridoSolicitado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitDiasGozadosPeridoSolicitado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitDiasGozadosPeridoSolicitado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiasGozadosPeridoSolicitadoContext diasGozadosPeridoSolicitado() throws RecognitionException {
		DiasGozadosPeridoSolicitadoContext _localctx = new DiasGozadosPeridoSolicitadoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_diasGozadosPeridoSolicitado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			digitos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FeriasTotaisContext extends ParserRuleContext {
		public DigitosContext digitos() {
			return getRuleContext(DigitosContext.class,0);
		}
		public FeriasTotaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feriasTotais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterFeriasTotais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitFeriasTotais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitFeriasTotais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeriasTotaisContext feriasTotais() throws RecognitionException {
		FeriasTotaisContext _localctx = new FeriasTotaisContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_feriasTotais);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			digitos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FaltasJustificadasContext extends ParserRuleContext {
		public DigitosContext digitos() {
			return getRuleContext(DigitosContext.class,0);
		}
		public FaltasJustificadasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faltasJustificadas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterFaltasJustificadas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitFaltasJustificadas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitFaltasJustificadas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaltasJustificadasContext faltasJustificadas() throws RecognitionException {
		FaltasJustificadasContext _localctx = new FaltasJustificadasContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_faltasJustificadas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			digitos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DiasFaltasJustificadasPeriodoSolicitadoContext extends ParserRuleContext {
		public DigitosContext digitos() {
			return getRuleContext(DigitosContext.class,0);
		}
		public DiasFaltasJustificadasPeriodoSolicitadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diasFaltasJustificadasPeriodoSolicitado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterDiasFaltasJustificadasPeriodoSolicitado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitDiasFaltasJustificadasPeriodoSolicitado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitDiasFaltasJustificadasPeriodoSolicitado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiasFaltasJustificadasPeriodoSolicitadoContext diasFaltasJustificadasPeriodoSolicitado() throws RecognitionException {
		DiasFaltasJustificadasPeriodoSolicitadoContext _localctx = new DiasFaltasJustificadasPeriodoSolicitadoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_diasFaltasJustificadasPeriodoSolicitado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			digitos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FaltasJustificadasTotaisContext extends ParserRuleContext {
		public DigitosContext digitos() {
			return getRuleContext(DigitosContext.class,0);
		}
		public FaltasJustificadasTotaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faltasJustificadasTotais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterFaltasJustificadasTotais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitFaltasJustificadasTotais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitFaltasJustificadasTotais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaltasJustificadasTotaisContext faltasJustificadasTotais() throws RecognitionException {
		FaltasJustificadasTotaisContext _localctx = new FaltasJustificadasTotaisContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_faltasJustificadasTotais);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			digitos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FaltasInjustificadasContext extends ParserRuleContext {
		public DigitosContext digitos() {
			return getRuleContext(DigitosContext.class,0);
		}
		public FaltasInjustificadasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faltasInjustificadas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterFaltasInjustificadas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitFaltasInjustificadas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitFaltasInjustificadas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaltasInjustificadasContext faltasInjustificadas() throws RecognitionException {
		FaltasInjustificadasContext _localctx = new FaltasInjustificadasContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_faltasInjustificadas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			digitos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FaltasInjustificadasPeriodoSolicitadoContext extends ParserRuleContext {
		public DigitosContext digitos() {
			return getRuleContext(DigitosContext.class,0);
		}
		public FaltasInjustificadasPeriodoSolicitadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faltasInjustificadasPeriodoSolicitado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterFaltasInjustificadasPeriodoSolicitado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitFaltasInjustificadasPeriodoSolicitado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitFaltasInjustificadasPeriodoSolicitado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaltasInjustificadasPeriodoSolicitadoContext faltasInjustificadasPeriodoSolicitado() throws RecognitionException {
		FaltasInjustificadasPeriodoSolicitadoContext _localctx = new FaltasInjustificadasPeriodoSolicitadoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_faltasInjustificadasPeriodoSolicitado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			digitos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FaltasInjustificadasTotaisContext extends ParserRuleContext {
		public DigitosContext digitos() {
			return getRuleContext(DigitosContext.class,0);
		}
		public FaltasInjustificadasTotaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faltasInjustificadasTotais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterFaltasInjustificadasTotais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitFaltasInjustificadasTotais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitFaltasInjustificadasTotais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaltasInjustificadasTotaisContext faltasInjustificadasTotais() throws RecognitionException {
		FaltasInjustificadasTotaisContext _localctx = new FaltasInjustificadasTotaisContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_faltasInjustificadasTotais);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			digitos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComentarioContext extends ParserRuleContext {
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitComentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_comentario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			frase();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealizacaoResidenciaContext extends ParserRuleContext {
		public ObservacoesContext observacoes() {
			return getRuleContext(ObservacoesContext.class,0);
		}
		public RealizacaoResidenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realizacaoResidencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterRealizacaoResidencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitRealizacaoResidencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitRealizacaoResidencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealizacaoResidenciaContext realizacaoResidencia() throws RecognitionException {
		RealizacaoResidenciaContext _localctx = new RealizacaoResidenciaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_realizacaoResidencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			observacoes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObservacoesContext extends ParserRuleContext {
		public FraseContext frase() {
			return getRuleContext(FraseContext.class,0);
		}
		public ObservacoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observacoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterObservacoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitObservacoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitObservacoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObservacoesContext observacoes() throws RecognitionException {
		ObservacoesContext _localctx = new ObservacoesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_observacoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			frase();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FraseContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(LinguagemFormularioParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(LinguagemFormularioParser.WORD, i);
		}
		public FraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterFrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitFrase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitFrase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FraseContext frase() throws RecognitionException {
		FraseContext _localctx = new FraseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_frase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(275);
					match(WORD);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(278); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RespostaContext extends ParserRuleContext {
		public RespostaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resposta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterResposta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitResposta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitResposta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RespostaContext resposta() throws RecognitionException {
		RespostaContext _localctx = new RespostaContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_resposta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(LinguagemFormularioParser.NUMERO, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(NUMERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealContext extends ParserRuleContext {
		public List<TerminalNode> NUMERO() { return getTokens(LinguagemFormularioParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(LinguagemFormularioParser.NUMERO, i);
		}
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(NUMERO);
			setState(285);
			match(T__12);
			setState(286);
			match(NUMERO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitosContext extends ParserRuleContext {
		public List<TerminalNode> NUMERO() { return getTokens(LinguagemFormularioParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(LinguagemFormularioParser.NUMERO, i);
		}
		public DigitosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digitos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).enterDigitos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemFormularioListener ) ((LinguagemFormularioListener)listener).exitDigitos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemFormularioVisitor ) return ((LinguagemFormularioVisitor<? extends T>)visitor).visitDigitos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitosContext digitos() throws RecognitionException {
		DigitosContext _localctx = new DigitosContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_digitos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(288);
					match(NUMERO);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(291); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u0128\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2r\n\2\3\3\3\3\3\3\5\3w\n"+
		"\3\3\4\3\4\3\4\3\4\5\4}\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0088"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0094\n\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\5\35\u00dd\n\35\3\36\3\36\3\36"+
		"\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\5\"\u00ec\n\"\3#\3#\3#\3#\5#\u00f2"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\6\61\u0117\n\61\r\61\16"+
		"\61\u0118\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\64\3\65\6\65\u0124\n\65"+
		"\r\65\16\65\u0125\3\65\2\2\66\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\6\3\2\4\6\3\2\7\b\3\2"+
		"\n\f\3\2\r\16\2\u0100\2q\3\2\2\2\4v\3\2\2\2\6|\3\2\2\2\b\u0087\3\2\2\2"+
		"\n\u0093\3\2\2\2\f\u0095\3\2\2\2\16\u0097\3\2\2\2\20\u0099\3\2\2\2\22"+
		"\u00a2\3\2\2\2\24\u00a9\3\2\2\2\26\u00ab\3\2\2\2\30\u00ad\3\2\2\2\32\u00af"+
		"\3\2\2\2\34\u00b2\3\2\2\2\36\u00b4\3\2\2\2 \u00b6\3\2\2\2\"\u00b8\3\2"+
		"\2\2$\u00ba\3\2\2\2&\u00be\3\2\2\2(\u00c1\3\2\2\2*\u00c3\3\2\2\2,\u00c5"+
		"\3\2\2\2.\u00ce\3\2\2\2\60\u00d0\3\2\2\2\62\u00d4\3\2\2\2\64\u00d6\3\2"+
		"\2\2\66\u00d8\3\2\2\28\u00dc\3\2\2\2:\u00de\3\2\2\2<\u00e1\3\2\2\2>\u00e3"+
		"\3\2\2\2@\u00e7\3\2\2\2B\u00eb\3\2\2\2D\u00f1\3\2\2\2F\u00f3\3\2\2\2H"+
		"\u00fd\3\2\2\2J\u00ff\3\2\2\2L\u0101\3\2\2\2N\u0103\3\2\2\2P\u0105\3\2"+
		"\2\2R\u0107\3\2\2\2T\u0109\3\2\2\2V\u010b\3\2\2\2X\u010d\3\2\2\2Z\u010f"+
		"\3\2\2\2\\\u0111\3\2\2\2^\u0113\3\2\2\2`\u0116\3\2\2\2b\u011a\3\2\2\2"+
		"d\u011c\3\2\2\2f\u011e\3\2\2\2h\u0123\3\2\2\2jk\5\4\3\2kl\7\2\2\3lr\3"+
		"\2\2\2mn\5\4\3\2no\7\27\2\2op\7\2\2\3pr\3\2\2\2qj\3\2\2\2qm\3\2\2\2r\3"+
		"\3\2\2\2sw\5\6\4\2tw\58\35\2uw\5B\"\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\5"+
		"\3\2\2\2x}\5\b\5\2y}\5\20\t\2z}\5$\23\2{}\5\60\31\2|x\3\2\2\2|y\3\2\2"+
		"\2|z\3\2\2\2|{\3\2\2\2}\7\3\2\2\2~\177\5\n\6\2\177\u0080\5\n\6\2\u0080"+
		"\u0081\5\f\7\2\u0081\u0082\5\16\b\2\u0082\u0088\3\2\2\2\u0083\u0084\5"+
		"\n\6\2\u0084\u0085\5\n\6\2\u0085\u0086\5\f\7\2\u0086\u0088\3\2\2\2\u0087"+
		"~\3\2\2\2\u0087\u0083\3\2\2\2\u0088\t\3\2\2\2\u0089\u008a\7\20\2\2\u008a"+
		"\u008b\7\3\2\2\u008b\u008c\7\21\2\2\u008c\u008d\7\3\2\2\u008d\u0094\7"+
		"\22\2\2\u008e\u008f\7\22\2\2\u008f\u0090\7\3\2\2\u0090\u0091\7\21\2\2"+
		"\u0091\u0092\7\3\2\2\u0092\u0094\7\20\2\2\u0093\u0089\3\2\2\2\u0093\u008e"+
		"\3\2\2\2\u0094\13\3\2\2\2\u0095\u0096\t\2\2\2\u0096\r\3\2\2\2\u0097\u0098"+
		"\5`\61\2\u0098\17\3\2\2\2\u0099\u009a\5\22\n\2\u009a\u009b\5\24\13\2\u009b"+
		"\u009c\5\26\f\2\u009c\u009d\5\30\r\2\u009d\u009e\5\32\16\2\u009e\u009f"+
		"\5\"\22\2\u009f\u00a0\5\n\6\2\u00a0\u00a1\5 \21\2\u00a1\21\3\2\2\2\u00a2"+
		"\u00a3\7\25\2\2\u00a3\u00a4\7\25\2\2\u00a4\u00a5\7\25\2\2\u00a5\u00a6"+
		"\7\24\2\2\u00a6\u00a7\7\24\2\2\u00a7\u00a8\7\24\2\2\u00a8\23\3\2\2\2\u00a9"+
		"\u00aa\5`\61\2\u00aa\25\3\2\2\2\u00ab\u00ac\5`\61\2\u00ac\27\3\2\2\2\u00ad"+
		"\u00ae\t\3\2\2\u00ae\31\3\2\2\2\u00af\u00b0\5\34\17\2\u00b0\u00b1\5\36"+
		"\20\2\u00b1\33\3\2\2\2\u00b2\u00b3\5h\65\2\u00b3\35\3\2\2\2\u00b4\u00b5"+
		"\5h\65\2\u00b5\37\3\2\2\2\u00b6\u00b7\5`\61\2\u00b7!\3\2\2\2\u00b8\u00b9"+
		"\5`\61\2\u00b9#\3\2\2\2\u00ba\u00bb\5&\24\2\u00bb\u00bc\5,\27\2\u00bc"+
		"\u00bd\5.\30\2\u00bd%\3\2\2\2\u00be\u00bf\5*\26\2\u00bf\u00c0\5(\25\2"+
		"\u00c0\'\3\2\2\2\u00c1\u00c2\5h\65\2\u00c2)\3\2\2\2\u00c3\u00c4\5`\61"+
		"\2\u00c4+\3\2\2\2\u00c5\u00c6\7\24\2\2\u00c6\u00c7\7\24\2\2\u00c7\u00c8"+
		"\7\24\2\2\u00c8\u00c9\7\24\2\2\u00c9\u00ca\7\t\2\2\u00ca\u00cb\7\24\2"+
		"\2\u00cb\u00cc\7\24\2\2\u00cc\u00cd\7\24\2\2\u00cd-\3\2\2\2\u00ce\u00cf"+
		"\5`\61\2\u00cf/\3\2\2\2\u00d0\u00d1\5\62\32\2\u00d1\u00d2\5\64\33\2\u00d2"+
		"\u00d3\5\66\34\2\u00d3\61\3\2\2\2\u00d4\u00d5\7\23\2\2\u00d5\63\3\2\2"+
		"\2\u00d6\u00d7\5f\64\2\u00d7\65\3\2\2\2\u00d8\u00d9\t\4\2\2\u00d9\67\3"+
		"\2\2\2\u00da\u00dd\5:\36\2\u00db\u00dd\5> \2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00db\3\2\2\2\u00dd9\3\2\2\2\u00de\u00df\5b\62\2\u00df\u00e0\5<\37\2"+
		"\u00e0;\3\2\2\2\u00e1\u00e2\5`\61\2\u00e2=\3\2\2\2\u00e3\u00e4\5b\62\2"+
		"\u00e4\u00e5\5@!\2\u00e5\u00e6\5\32\16\2\u00e6?\3\2\2\2\u00e7\u00e8\5"+
		"`\61\2\u00e8A\3\2\2\2\u00e9\u00ec\5D#\2\u00ea\u00ec\5\\/\2\u00eb\u00e9"+
		"\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ecC\3\2\2\2\u00ed\u00ee\5F$\2\u00ee\u00ef"+
		"\5Z.\2\u00ef\u00f2\3\2\2\2\u00f0\u00f2\5F$\2\u00f1\u00ed\3\2\2\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2E\3\2\2\2\u00f3\u00f4\5H%\2\u00f4\u00f5\5J&\2\u00f5"+
		"\u00f6\5L\'\2\u00f6\u00f7\5N(\2\u00f7\u00f8\5P)\2\u00f8\u00f9\5R*\2\u00f9"+
		"\u00fa\5T+\2\u00fa\u00fb\5V,\2\u00fb\u00fc\5X-\2\u00fcG\3\2\2\2\u00fd"+
		"\u00fe\5h\65\2\u00feI\3\2\2\2\u00ff\u0100\5h\65\2\u0100K\3\2\2\2\u0101"+
		"\u0102\5h\65\2\u0102M\3\2\2\2\u0103\u0104\5h\65\2\u0104O\3\2\2\2\u0105"+
		"\u0106\5h\65\2\u0106Q\3\2\2\2\u0107\u0108\5h\65\2\u0108S\3\2\2\2\u0109"+
		"\u010a\5h\65\2\u010aU\3\2\2\2\u010b\u010c\5h\65\2\u010cW\3\2\2\2\u010d"+
		"\u010e\5h\65\2\u010eY\3\2\2\2\u010f\u0110\5`\61\2\u0110[\3\2\2\2\u0111"+
		"\u0112\5^\60\2\u0112]\3\2\2\2\u0113\u0114\5`\61\2\u0114_\3\2\2\2\u0115"+
		"\u0117\7\23\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0116\3"+
		"\2\2\2\u0118\u0119\3\2\2\2\u0119a\3\2\2\2\u011a\u011b\t\5\2\2\u011bc\3"+
		"\2\2\2\u011c\u011d\7\24\2\2\u011de\3\2\2\2\u011e\u011f\7\24\2\2\u011f"+
		"\u0120\7\17\2\2\u0120\u0121\7\24\2\2\u0121g\3\2\2\2\u0122\u0124\7\24\2"+
		"\2\u0123\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126i\3\2\2\2\fqv|\u0087\u0093\u00dc\u00eb\u00f1\u0118\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}