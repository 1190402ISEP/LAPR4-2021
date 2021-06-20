// Generated from C:/Users/User/Documents/ConnectSoft/lei20_21_s4_2dk_03/docs/TASKS/UC11-1004#16/Compilacao_Scripts\Linguagem.g4 by ANTLR 4.9.1
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
public class LinguagemParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, MODIFICADOR=9, 
		TIPO=10, LETRA=11, DIGITO=12, NEWLINE=13, ASPAS=14, PELICA=15, EXPO=16, 
		IGUAL=17, IGUAL_ESPACO=18, VIRGULA=19, PONTO_FINAL=20, FIM_INSTRUCAO=21, 
		VAZIO=22, DOIS_PONTOS=23, SOMA=24, SUBTRACAO=25, MULTIPLICACAO=26, DIVISAO=27, 
		IF=28, ELSE=29, THEN=30, ENDIF=31, MAIOR=32, MENOR=33, MENOR_IGUAL=34, 
		MAIOR_IGUAL=35, DIFERENTE=36, FOR=37, ENDFOR=38, COLECAO=39, LER_FICHEIRO=40, 
		EXTENSAO=41, EMAIL=42, ASSUNTO=43, MENSAGEM=44;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_declaracoes = 2, RULE_declaracao = 3, 
		RULE_tipo = 4, RULE_lista_de_variaveis = 5, RULE_variavel = 6, RULE_identificador = 7, 
		RULE_valor = 8, RULE_palavra = 9, RULE_inteiro = 10, RULE_real = 11, RULE_caractere = 12, 
		RULE_alfa = 13, RULE_alfas = 14, RULE_expoente = 15, RULE_contas = 16, 
		RULE_variavel_conta = 17, RULE_conta = 18, RULE_alternativa = 19, RULE_parenteses = 20, 
		RULE_chavetas = 21, RULE_a = 22, RULE_comparador = 23, RULE_ciclo = 24, 
		RULE_forloop = 25, RULE_condicao_andamento = 26, RULE_condicao_incremento = 27, 
		RULE_condicao_decremento = 28, RULE_forEach = 29, RULE_inicializacao = 30, 
		RULE_funcoesEspeciais = 31, RULE_nome_ficheiro = 32, RULE_envioEmail = 33, 
		RULE_listaDestinatarios = 34, RULE_imprimirNoEcra = 35, RULE_conteudo_a_imprimir = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "declaracoes", "declaracao", "tipo", "lista_de_variaveis", 
			"variavel", "identificador", "valor", "palavra", "inteiro", "real", "caractere", 
			"alfa", "alfas", "expoente", "contas", "variavel_conta", "conta", "alternativa", 
			"parenteses", "chavetas", "a", "comparador", "ciclo", "forloop", "condicao_andamento", 
			"condicao_incremento", "condicao_decremento", "forEach", "inicializacao", 
			"funcoesEspeciais", "nome_ficheiro", "envioEmail", "listaDestinatarios", 
			"imprimirNoEcra", "conteudo_a_imprimir"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "' : '", "'PRINT'", null, 
			null, null, null, "'\n'", "'\"'", "'''", null, "'='", null, "','", "'.'", 
			"';'", "' '", null, null, null, null, null, "'if'", "'else'", "'then'", 
			"'endif'", "'>'", "'<'", "'=<'", "'=>'", "'!='", "'for'", "'endfor'", 
			null, "'lerficheiro'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "MODIFICADOR", 
			"TIPO", "LETRA", "DIGITO", "NEWLINE", "ASPAS", "PELICA", "EXPO", "IGUAL", 
			"IGUAL_ESPACO", "VIRGULA", "PONTO_FINAL", "FIM_INSTRUCAO", "VAZIO", "DOIS_PONTOS", 
			"SOMA", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO", "IF", "ELSE", "THEN", 
			"ENDIF", "MAIOR", "MENOR", "MENOR_IGUAL", "MAIOR_IGUAL", "DIFERENTE", 
			"FOR", "ENDFOR", "COLECAO", "LER_FICHEIRO", "EXTENSAO", "EMAIL", "ASSUNTO", 
			"MENSAGEM"
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
	public String getGrammarFileName() { return "Linguagem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }




	public LinguagemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LinguagemParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(LinguagemParser.NEWLINE, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				expr();
				setState(75);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				expr();
				setState(78);
				match(NEWLINE);
				setState(79);
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

	public static class ExprContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LinguagemParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ContasContext contas() {
			return getRuleContext(ContasContext.class,0);
		}
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public AlternativaContext alternativa() {
			return getRuleContext(AlternativaContext.class,0);
		}
		public Condicao_andamentoContext condicao_andamento() {
			return getRuleContext(Condicao_andamentoContext.class,0);
		}
		public TerminalNode FIM_INSTRUCAO() { return getToken(LinguagemParser.FIM_INSTRUCAO, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				declaracoes();
				setState(84);
				match(NEWLINE);
				setState(85);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				contas();
				setState(88);
				match(NEWLINE);
				setState(89);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				declaracoes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				contas();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				ciclo();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				alternativa();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(95);
				condicao_andamento();
				setState(96);
				match(FIM_INSTRUCAO);
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracoes);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIFICADOR:
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				declaracao();
				setState(101);
				declaracoes();
				}
				break;
			case EOF:
			case NEWLINE:
			case VAZIO:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Lista_de_variaveisContext lista_de_variaveis() {
			return getRuleContext(Lista_de_variaveisContext.class,0);
		}
		public TerminalNode FIM_INSTRUCAO() { return getToken(LinguagemParser.FIM_INSTRUCAO, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			tipo();
			setState(107);
			lista_de_variaveis();
			setState(108);
			match(FIM_INSTRUCAO);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode MODIFICADOR() { return getToken(LinguagemParser.MODIFICADOR, 0); }
		public TerminalNode TIPO() { return getToken(LinguagemParser.TIPO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(MODIFICADOR);
				setState(111);
				match(TIPO);
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(TIPO);
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

	public static class Lista_de_variaveisContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode VIRGULA() { return getToken(LinguagemParser.VIRGULA, 0); }
		public Lista_de_variaveisContext lista_de_variaveis() {
			return getRuleContext(Lista_de_variaveisContext.class,0);
		}
		public Lista_de_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_de_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterLista_de_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitLista_de_variaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitLista_de_variaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_de_variaveisContext lista_de_variaveis() throws RecognitionException {
		Lista_de_variaveisContext _localctx = new Lista_de_variaveisContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lista_de_variaveis);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				variavel();
				setState(116);
				match(VIRGULA);
				setState(117);
				lista_de_variaveis();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				variavel();
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

	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(LinguagemParser.IGUAL, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode LETRA() { return getToken(LinguagemParser.LETRA, 0); }
		public TerminalNode IGUAL_ESPACO() { return getToken(LinguagemParser.IGUAL_ESPACO, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variavel);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				identificador();
				setState(124);
				match(IGUAL);
				setState(125);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				identificador();
				setState(128);
				match(IGUAL);
				setState(129);
				identificador();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				match(LETRA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				match(LETRA);
				setState(133);
				match(IGUAL);
				setState(134);
				valor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				match(LETRA);
				setState(136);
				match(IGUAL);
				setState(137);
				identificador();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(138);
				identificador();
				setState(139);
				match(IGUAL_ESPACO);
				setState(140);
				valor();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				identificador();
				setState(143);
				match(IGUAL_ESPACO);
				setState(144);
				identificador();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(146);
				match(LETRA);
				setState(147);
				match(IGUAL_ESPACO);
				setState(148);
				valor();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(149);
				match(LETRA);
				setState(150);
				match(IGUAL_ESPACO);
				setState(151);
				identificador();
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

	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(LinguagemParser.LETRA, 0); }
		public AlfasContext alfas() {
			return getRuleContext(AlfasContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(LETRA);
			setState(155);
			alfas();
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

	public static class ValorContext extends ParserRuleContext {
		public PalavraContext palavra() {
			return getRuleContext(PalavraContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}
		public CaractereContext caractere() {
			return getRuleContext(CaractereContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public TerminalNode LETRA() { return getToken(LinguagemParser.LETRA, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valor);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				palavra();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				identificador();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				inteiro();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				caractere();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				real();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				match(LETRA);
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

	public static class PalavraContext extends ParserRuleContext {
		public List<TerminalNode> ASPAS() { return getTokens(LinguagemParser.ASPAS); }
		public TerminalNode ASPAS(int i) {
			return getToken(LinguagemParser.ASPAS, i);
		}
		public List<TerminalNode> LETRA() { return getTokens(LinguagemParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(LinguagemParser.LETRA, i);
		}
		public PalavraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palavra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterPalavra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitPalavra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitPalavra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PalavraContext palavra() throws RecognitionException {
		PalavraContext _localctx = new PalavraContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_palavra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(ASPAS);
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				match(LETRA);
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETRA );
			setState(171);
			match(ASPAS);
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

	public static class InteiroContext extends ParserRuleContext {
		public TerminalNode DIGITO() { return getToken(LinguagemParser.DIGITO, 0); }
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}
		public InteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitInteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitInteiro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InteiroContext inteiro() throws RecognitionException {
		InteiroContext _localctx = new InteiroContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_inteiro);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(DIGITO);
				setState(174);
				inteiro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(DIGITO);
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

	public static class RealContext extends ParserRuleContext {
		public List<InteiroContext> inteiro() {
			return getRuleContexts(InteiroContext.class);
		}
		public InteiroContext inteiro(int i) {
			return getRuleContext(InteiroContext.class,i);
		}
		public TerminalNode PONTO_FINAL() { return getToken(LinguagemParser.PONTO_FINAL, 0); }
		public ExpoenteContext expoente() {
			return getRuleContext(ExpoenteContext.class,0);
		}
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_real);
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				inteiro();
				setState(179);
				match(PONTO_FINAL);
				setState(180);
				inteiro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				inteiro();
				setState(183);
				match(PONTO_FINAL);
				setState(184);
				inteiro();
				setState(185);
				expoente();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				inteiro();
				setState(188);
				expoente();
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

	public static class CaractereContext extends ParserRuleContext {
		public List<TerminalNode> PELICA() { return getTokens(LinguagemParser.PELICA); }
		public TerminalNode PELICA(int i) {
			return getToken(LinguagemParser.PELICA, i);
		}
		public TerminalNode LETRA() { return getToken(LinguagemParser.LETRA, 0); }
		public CaractereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caractere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterCaractere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitCaractere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitCaractere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaractereContext caractere() throws RecognitionException {
		CaractereContext _localctx = new CaractereContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_caractere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(PELICA);
			setState(193);
			match(LETRA);
			setState(194);
			match(PELICA);
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

	public static class AlfaContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(LinguagemParser.LETRA, 0); }
		public TerminalNode DIGITO() { return getToken(LinguagemParser.DIGITO, 0); }
		public AlfaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alfa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterAlfa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitAlfa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitAlfa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlfaContext alfa() throws RecognitionException {
		AlfaContext _localctx = new AlfaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alfa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(_la==LETRA || _la==DIGITO) ) {
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

	public static class AlfasContext extends ParserRuleContext {
		public AlfaContext alfa() {
			return getRuleContext(AlfaContext.class,0);
		}
		public AlfasContext alfas() {
			return getRuleContext(AlfasContext.class,0);
		}
		public AlfasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alfas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterAlfas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitAlfas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitAlfas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlfasContext alfas() throws RecognitionException {
		AlfasContext _localctx = new AlfasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alfas);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				alfa();
				setState(199);
				alfas();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				alfa();
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

	public static class ExpoenteContext extends ParserRuleContext {
		public TerminalNode EXPO() { return getToken(LinguagemParser.EXPO, 0); }
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}
		public ExpoenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expoente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterExpoente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitExpoente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitExpoente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpoenteContext expoente() throws RecognitionException {
		ExpoenteContext _localctx = new ExpoenteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expoente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(EXPO);
			setState(205);
			inteiro();
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

	public static class ContasContext extends ParserRuleContext {
		public Variavel_contaContext variavel_conta() {
			return getRuleContext(Variavel_contaContext.class,0);
		}
		public ContaContext conta() {
			return getRuleContext(ContaContext.class,0);
		}
		public ContasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterContas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitContas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitContas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContasContext contas() throws RecognitionException {
		ContasContext _localctx = new ContasContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_contas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			variavel_conta();
			setState(208);
			conta(0);
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

	public static class Variavel_contaContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(LinguagemParser.IGUAL, 0); }
		public ContaContext conta() {
			return getRuleContext(ContaContext.class,0);
		}
		public TerminalNode LETRA() { return getToken(LinguagemParser.LETRA, 0); }
		public TerminalNode IGUAL_ESPACO() { return getToken(LinguagemParser.IGUAL_ESPACO, 0); }
		public Variavel_contaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel_conta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterVariavel_conta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitVariavel_conta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitVariavel_conta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variavel_contaContext variavel_conta() throws RecognitionException {
		Variavel_contaContext _localctx = new Variavel_contaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variavel_conta);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				identificador();
				setState(211);
				match(IGUAL);
				setState(212);
				conta(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(LETRA);
				setState(215);
				match(IGUAL);
				setState(216);
				conta(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				identificador();
				setState(218);
				match(IGUAL_ESPACO);
				setState(219);
				conta(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(LETRA);
				setState(222);
				match(IGUAL_ESPACO);
				setState(223);
				conta(0);
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

	public static class ContaContext extends ParserRuleContext {
		public ContaContext left;
		public Token op;
		public ContaContext right;
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode FIM_INSTRUCAO() { return getToken(LinguagemParser.FIM_INSTRUCAO, 0); }
		public List<ContaContext> conta() {
			return getRuleContexts(ContaContext.class);
		}
		public ContaContext conta(int i) {
			return getRuleContext(ContaContext.class,i);
		}
		public TerminalNode SOMA() { return getToken(LinguagemParser.SOMA, 0); }
		public TerminalNode SUBTRACAO() { return getToken(LinguagemParser.SUBTRACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(LinguagemParser.DIVISAO, 0); }
		public TerminalNode MULTIPLICACAO() { return getToken(LinguagemParser.MULTIPLICACAO, 0); }
		public ContaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterConta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitConta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitConta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContaContext conta() throws RecognitionException {
		return conta(0);
	}

	private ContaContext conta(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ContaContext _localctx = new ContaContext(_ctx, _parentState);
		ContaContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_conta, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETRA:
			case DIGITO:
			case ASPAS:
			case PELICA:
				{
				setState(227);
				valor();
				}
				break;
			case FIM_INSTRUCAO:
				{
				setState(228);
				match(FIM_INSTRUCAO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ContaContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_conta);
						setState(231);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(232);
						((ContaContext)_localctx).op = match(SOMA);
						setState(233);
						((ContaContext)_localctx).right = conta(7);
						}
						break;
					case 2:
						{
						_localctx = new ContaContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_conta);
						setState(234);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(235);
						((ContaContext)_localctx).op = match(SUBTRACAO);
						setState(236);
						((ContaContext)_localctx).right = conta(6);
						}
						break;
					case 3:
						{
						_localctx = new ContaContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_conta);
						setState(237);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(238);
						((ContaContext)_localctx).op = match(DIVISAO);
						setState(239);
						((ContaContext)_localctx).right = conta(5);
						}
						break;
					case 4:
						{
						_localctx = new ContaContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_conta);
						setState(240);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(241);
						((ContaContext)_localctx).op = match(MULTIPLICACAO);
						setState(242);
						((ContaContext)_localctx).right = conta(4);
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AlternativaContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LinguagemParser.IF, 0); }
		public List<ParentesesContext> parenteses() {
			return getRuleContexts(ParentesesContext.class);
		}
		public ParentesesContext parenteses(int i) {
			return getRuleContext(ParentesesContext.class,i);
		}
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode VAZIO() { return getToken(LinguagemParser.VAZIO, 0); }
		public TerminalNode THEN() { return getToken(LinguagemParser.THEN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(LinguagemParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LinguagemParser.NEWLINE, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(LinguagemParser.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(LinguagemParser.ELSE, 0); }
		public AlternativaContext alternativa() {
			return getRuleContext(AlternativaContext.class,0);
		}
		public AlternativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterAlternativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitAlternativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitAlternativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlternativaContext alternativa() throws RecognitionException {
		AlternativaContext _localctx = new AlternativaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alternativa);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(IF);
				setState(249);
				parenteses();
				setState(250);
				a();
				setState(251);
				parenteses();
				setState(252);
				match(VAZIO);
				setState(253);
				match(THEN);
				setState(254);
				match(NEWLINE);
				setState(255);
				expr();
				setState(256);
				match(NEWLINE);
				setState(257);
				match(ENDIF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(IF);
				setState(260);
				parenteses();
				setState(261);
				a();
				setState(262);
				parenteses();
				setState(263);
				match(NEWLINE);
				setState(264);
				match(THEN);
				setState(265);
				expr();
				setState(266);
				match(NEWLINE);
				setState(267);
				match(ENDIF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				match(IF);
				setState(270);
				parenteses();
				setState(271);
				a();
				setState(272);
				parenteses();
				setState(273);
				match(THEN);
				setState(274);
				expr();
				setState(275);
				match(NEWLINE);
				setState(276);
				match(ELSE);
				setState(277);
				alternativa();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				match(IF);
				setState(280);
				parenteses();
				setState(281);
				a();
				setState(282);
				parenteses();
				setState(283);
				match(THEN);
				setState(284);
				expr();
				setState(285);
				match(VAZIO);
				setState(286);
				match(ELSE);
				setState(287);
				alternativa();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(289);
				match(IF);
				setState(290);
				parenteses();
				setState(291);
				a();
				setState(292);
				parenteses();
				setState(293);
				match(NEWLINE);
				setState(294);
				match(THEN);
				setState(295);
				expr();
				setState(296);
				match(NEWLINE);
				setState(297);
				match(ELSE);
				setState(298);
				expr();
				setState(299);
				match(NEWLINE);
				setState(300);
				match(ENDIF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(302);
				match(IF);
				setState(303);
				parenteses();
				setState(304);
				a();
				setState(305);
				parenteses();
				setState(306);
				match(VAZIO);
				setState(307);
				match(THEN);
				setState(308);
				expr();
				setState(309);
				match(NEWLINE);
				setState(310);
				match(ELSE);
				setState(311);
				expr();
				setState(312);
				match(NEWLINE);
				setState(313);
				match(ENDIF);
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

	public static class ParentesesContext extends ParserRuleContext {
		public ParentesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenteses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterParenteses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitParenteses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitParenteses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentesesContext parenteses() throws RecognitionException {
		ParentesesContext _localctx = new ParentesesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parenteses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
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

	public static class ChavetasContext extends ParserRuleContext {
		public ChavetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chavetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterChavetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitChavetas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitChavetas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChavetasContext chavetas() throws RecognitionException {
		ChavetasContext _localctx = new ChavetasContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_chavetas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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

	public static class AContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public ComparadorContext comparador() {
			return getRuleContext(ComparadorContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			valor();
			setState(322);
			comparador();
			setState(323);
			valor();
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

	public static class ComparadorContext extends ParserRuleContext {
		public TerminalNode MAIOR() { return getToken(LinguagemParser.MAIOR, 0); }
		public TerminalNode IGUAL() { return getToken(LinguagemParser.IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(LinguagemParser.MENOR, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(LinguagemParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(LinguagemParser.MENOR_IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(LinguagemParser.DIFERENTE, 0); }
		public ComparadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterComparador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitComparador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitComparador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparadorContext comparador() throws RecognitionException {
		ComparadorContext _localctx = new ComparadorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAIOR) | (1L << MENOR) | (1L << MENOR_IGUAL) | (1L << MAIOR_IGUAL) | (1L << DIFERENTE))) != 0)) ) {
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

	public static class CicloContext extends ParserRuleContext {
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}
		public ForEachContext forEach() {
			return getRuleContext(ForEachContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitCiclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ciclo);
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				forloop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				forEach();
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

	public static class ForloopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LinguagemParser.FOR, 0); }
		public List<ParentesesContext> parenteses() {
			return getRuleContexts(ParentesesContext.class);
		}
		public ParentesesContext parenteses(int i) {
			return getRuleContext(ParentesesContext.class,i);
		}
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public InicializacaoContext inicializacao() {
			return getRuleContext(InicializacaoContext.class,0);
		}
		public List<TerminalNode> FIM_INSTRUCAO() { return getTokens(LinguagemParser.FIM_INSTRUCAO); }
		public TerminalNode FIM_INSTRUCAO(int i) {
			return getToken(LinguagemParser.FIM_INSTRUCAO, i);
		}
		public ComparadorContext comparador() {
			return getRuleContext(ComparadorContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public Condicao_andamentoContext condicao_andamento() {
			return getRuleContext(Condicao_andamentoContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LinguagemParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LinguagemParser.NEWLINE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(LinguagemParser.ENDFOR, 0); }
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitForloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(FOR);
			setState(332);
			parenteses();
			setState(333);
			variavel();
			setState(334);
			inicializacao();
			setState(335);
			match(FIM_INSTRUCAO);
			setState(336);
			variavel();
			setState(337);
			comparador();
			setState(338);
			valor();
			setState(339);
			match(FIM_INSTRUCAO);
			setState(340);
			condicao_andamento();
			setState(341);
			parenteses();
			setState(342);
			match(NEWLINE);
			setState(343);
			expr();
			setState(344);
			match(NEWLINE);
			setState(345);
			match(ENDFOR);
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

	public static class Condicao_andamentoContext extends ParserRuleContext {
		public Condicao_incrementoContext condicao_incremento() {
			return getRuleContext(Condicao_incrementoContext.class,0);
		}
		public Condicao_decrementoContext condicao_decremento() {
			return getRuleContext(Condicao_decrementoContext.class,0);
		}
		public Condicao_andamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao_andamento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterCondicao_andamento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitCondicao_andamento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitCondicao_andamento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicao_andamentoContext condicao_andamento() throws RecognitionException {
		Condicao_andamentoContext _localctx = new Condicao_andamentoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_condicao_andamento);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				condicao_incremento();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				condicao_decremento();
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

	public static class Condicao_incrementoContext extends ParserRuleContext {
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(LinguagemParser.IGUAL, 0); }
		public List<TerminalNode> SOMA() { return getTokens(LinguagemParser.SOMA); }
		public TerminalNode SOMA(int i) {
			return getToken(LinguagemParser.SOMA, i);
		}
		public TerminalNode IGUAL_ESPACO() { return getToken(LinguagemParser.IGUAL_ESPACO, 0); }
		public Condicao_incrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao_incremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterCondicao_incremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitCondicao_incremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitCondicao_incremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicao_incrementoContext condicao_incremento() throws RecognitionException {
		Condicao_incrementoContext _localctx = new Condicao_incrementoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condicao_incremento);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				variavel();
				setState(352);
				match(IGUAL);
				setState(353);
				variavel();
				setState(354);
				match(SOMA);
				setState(355);
				variavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				variavel();
				setState(358);
				match(SOMA);
				setState(359);
				match(SOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				variavel();
				setState(362);
				match(IGUAL_ESPACO);
				setState(363);
				variavel();
				setState(364);
				match(SOMA);
				setState(365);
				variavel();
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

	public static class Condicao_decrementoContext extends ParserRuleContext {
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(LinguagemParser.IGUAL, 0); }
		public List<TerminalNode> SUBTRACAO() { return getTokens(LinguagemParser.SUBTRACAO); }
		public TerminalNode SUBTRACAO(int i) {
			return getToken(LinguagemParser.SUBTRACAO, i);
		}
		public TerminalNode IGUAL_ESPACO() { return getToken(LinguagemParser.IGUAL_ESPACO, 0); }
		public Condicao_decrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao_decremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterCondicao_decremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitCondicao_decremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitCondicao_decremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicao_decrementoContext condicao_decremento() throws RecognitionException {
		Condicao_decrementoContext _localctx = new Condicao_decrementoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_condicao_decremento);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				variavel();
				setState(370);
				match(IGUAL);
				setState(371);
				variavel();
				setState(372);
				match(SUBTRACAO);
				setState(373);
				variavel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				variavel();
				setState(376);
				match(SUBTRACAO);
				setState(377);
				match(SUBTRACAO);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				variavel();
				setState(380);
				match(IGUAL_ESPACO);
				setState(381);
				variavel();
				setState(382);
				match(SUBTRACAO);
				setState(383);
				variavel();
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

	public static class ForEachContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LinguagemParser.FOR, 0); }
		public List<ParentesesContext> parenteses() {
			return getRuleContexts(ParentesesContext.class);
		}
		public ParentesesContext parenteses(int i) {
			return getRuleContext(ParentesesContext.class,i);
		}
		public TerminalNode COLECAO() { return getToken(LinguagemParser.COLECAO, 0); }
		public TerminalNode VAZIO() { return getToken(LinguagemParser.VAZIO, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LinguagemParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LinguagemParser.NEWLINE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ENDFOR() { return getToken(LinguagemParser.ENDFOR, 0); }
		public ForEachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterForEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitForEach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitForEach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachContext forEach() throws RecognitionException {
		ForEachContext _localctx = new ForEachContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forEach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(FOR);
			setState(388);
			parenteses();
			setState(389);
			match(COLECAO);
			setState(390);
			match(VAZIO);
			setState(391);
			variavel();
			setState(392);
			match(T__6);
			setState(393);
			variavel();
			setState(394);
			parenteses();
			setState(395);
			match(NEWLINE);
			setState(396);
			expr();
			setState(397);
			match(NEWLINE);
			setState(398);
			match(ENDFOR);
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

	public static class InicializacaoContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(LinguagemParser.IGUAL, 0); }
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}
		public InicializacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterInicializacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitInicializacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitInicializacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacaoContext inicializacao() throws RecognitionException {
		InicializacaoContext _localctx = new InicializacaoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_inicializacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(IGUAL);
			setState(401);
			inteiro();
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

	public static class FuncoesEspeciaisContext extends ParserRuleContext {
		public TerminalNode LER_FICHEIRO() { return getToken(LinguagemParser.LER_FICHEIRO, 0); }
		public Nome_ficheiroContext nome_ficheiro() {
			return getRuleContext(Nome_ficheiroContext.class,0);
		}
		public EnvioEmailContext envioEmail() {
			return getRuleContext(EnvioEmailContext.class,0);
		}
		public ImprimirNoEcraContext imprimirNoEcra() {
			return getRuleContext(ImprimirNoEcraContext.class,0);
		}
		public FuncoesEspeciaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcoesEspeciais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterFuncoesEspeciais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitFuncoesEspeciais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitFuncoesEspeciais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncoesEspeciaisContext funcoesEspeciais() throws RecognitionException {
		FuncoesEspeciaisContext _localctx = new FuncoesEspeciaisContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_funcoesEspeciais);
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LER_FICHEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(LER_FICHEIRO);
				setState(404);
				match(T__0);
				setState(405);
				nome_ficheiro();
				setState(406);
				match(T__1);
				}
				break;
			case EMAIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				envioEmail();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				imprimirNoEcra();
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

	public static class Nome_ficheiroContext extends ParserRuleContext {
		public PalavraContext palavra() {
			return getRuleContext(PalavraContext.class,0);
		}
		public TerminalNode PONTO_FINAL() { return getToken(LinguagemParser.PONTO_FINAL, 0); }
		public TerminalNode EXTENSAO() { return getToken(LinguagemParser.EXTENSAO, 0); }
		public Nome_ficheiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_ficheiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterNome_ficheiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitNome_ficheiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitNome_ficheiro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nome_ficheiroContext nome_ficheiro() throws RecognitionException {
		Nome_ficheiroContext _localctx = new Nome_ficheiroContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_nome_ficheiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			palavra();
			setState(413);
			match(PONTO_FINAL);
			setState(414);
			match(EXTENSAO);
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

	public static class EnvioEmailContext extends ParserRuleContext {
		public ListaDestinatariosContext listaDestinatarios() {
			return getRuleContext(ListaDestinatariosContext.class,0);
		}
		public TerminalNode ASSUNTO() { return getToken(LinguagemParser.ASSUNTO, 0); }
		public TerminalNode MENSAGEM() { return getToken(LinguagemParser.MENSAGEM, 0); }
		public EnvioEmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_envioEmail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterEnvioEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitEnvioEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitEnvioEmail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnvioEmailContext envioEmail() throws RecognitionException {
		EnvioEmailContext _localctx = new EnvioEmailContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_envioEmail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			listaDestinatarios();
			setState(417);
			match(ASSUNTO);
			setState(418);
			match(MENSAGEM);
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

	public static class ListaDestinatariosContext extends ParserRuleContext {
		public TerminalNode EMAIL() { return getToken(LinguagemParser.EMAIL, 0); }
		public TerminalNode NEWLINE() { return getToken(LinguagemParser.NEWLINE, 0); }
		public ListaDestinatariosContext listaDestinatarios() {
			return getRuleContext(ListaDestinatariosContext.class,0);
		}
		public ListaDestinatariosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDestinatarios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterListaDestinatarios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitListaDestinatarios(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitListaDestinatarios(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDestinatariosContext listaDestinatarios() throws RecognitionException {
		ListaDestinatariosContext _localctx = new ListaDestinatariosContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_listaDestinatarios);
		try {
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				match(EMAIL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(EMAIL);
				setState(422);
				match(NEWLINE);
				setState(423);
				listaDestinatarios();
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

	public static class ImprimirNoEcraContext extends ParserRuleContext {
		public Conteudo_a_imprimirContext conteudo_a_imprimir() {
			return getRuleContext(Conteudo_a_imprimirContext.class,0);
		}
		public ImprimirNoEcraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimirNoEcra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterImprimirNoEcra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitImprimirNoEcra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitImprimirNoEcra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirNoEcraContext imprimirNoEcra() throws RecognitionException {
		ImprimirNoEcraContext _localctx = new ImprimirNoEcraContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_imprimirNoEcra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(T__7);
			setState(427);
			conteudo_a_imprimir();
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

	public static class Conteudo_a_imprimirContext extends ParserRuleContext {
		public Conteudo_a_imprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conteudo_a_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).enterConteudo_a_imprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemListener ) ((LinguagemListener)listener).exitConteudo_a_imprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemVisitor ) return ((LinguagemVisitor<? extends T>)visitor).visitConteudo_a_imprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conteudo_a_imprimirContext conteudo_a_imprimir() throws RecognitionException {
		Conteudo_a_imprimirContext _localctx = new Conteudo_a_imprimirContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_conteudo_a_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return conta_sempred((ContaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conta_sempred(ContaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2T\n"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3e\n"+
		"\3\3\4\3\4\3\4\3\4\5\4k\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6t\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\5\7{\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u009b\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a6\n\n\3"+
		"\13\3\13\6\13\u00aa\n\13\r\13\16\13\u00ab\3\13\3\13\3\f\3\f\3\f\5\f\u00b3"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00c1\n\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00cd\n\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00e3\n\23\3\24\3\24\3\24\5\24\u00e8\n\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00f6"+
		"\n\24\f\24\16\24\u00f9\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u013e\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\5\32\u014c\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\5\34\u0160\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0172\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0184\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3!\3!\5!\u019d\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\5$\u01ab\n"+
		"$\3%\3%\3%\3&\3&\3&\2\3&\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJ\2\6\3\2\r\16\3\2\3\6\3\2\7\b\4\2\23\23\"&"+
		"\2\u01bf\2S\3\2\2\2\4d\3\2\2\2\6j\3\2\2\2\bl\3\2\2\2\ns\3\2\2\2\fz\3\2"+
		"\2\2\16\u009a\3\2\2\2\20\u009c\3\2\2\2\22\u00a5\3\2\2\2\24\u00a7\3\2\2"+
		"\2\26\u00b2\3\2\2\2\30\u00c0\3\2\2\2\32\u00c2\3\2\2\2\34\u00c6\3\2\2\2"+
		"\36\u00cc\3\2\2\2 \u00ce\3\2\2\2\"\u00d1\3\2\2\2$\u00e2\3\2\2\2&\u00e7"+
		"\3\2\2\2(\u013d\3\2\2\2*\u013f\3\2\2\2,\u0141\3\2\2\2.\u0143\3\2\2\2\60"+
		"\u0147\3\2\2\2\62\u014b\3\2\2\2\64\u014d\3\2\2\2\66\u015f\3\2\2\28\u0171"+
		"\3\2\2\2:\u0183\3\2\2\2<\u0185\3\2\2\2>\u0192\3\2\2\2@\u019c\3\2\2\2B"+
		"\u019e\3\2\2\2D\u01a2\3\2\2\2F\u01aa\3\2\2\2H\u01ac\3\2\2\2J\u01af\3\2"+
		"\2\2LM\5\4\3\2MN\7\2\2\3NT\3\2\2\2OP\5\4\3\2PQ\7\17\2\2QR\7\2\2\3RT\3"+
		"\2\2\2SL\3\2\2\2SO\3\2\2\2T\3\3\2\2\2UV\5\6\4\2VW\7\17\2\2WX\5\4\3\2X"+
		"e\3\2\2\2YZ\5\"\22\2Z[\7\17\2\2[\\\5\4\3\2\\e\3\2\2\2]e\5\6\4\2^e\5\""+
		"\22\2_e\5\62\32\2`e\5(\25\2ab\5\66\34\2bc\7\27\2\2ce\3\2\2\2dU\3\2\2\2"+
		"dY\3\2\2\2d]\3\2\2\2d^\3\2\2\2d_\3\2\2\2d`\3\2\2\2da\3\2\2\2e\5\3\2\2"+
		"\2fg\5\b\5\2gh\5\6\4\2hk\3\2\2\2ik\3\2\2\2jf\3\2\2\2ji\3\2\2\2k\7\3\2"+
		"\2\2lm\5\n\6\2mn\5\f\7\2no\7\27\2\2o\t\3\2\2\2pq\7\13\2\2qt\7\f\2\2rt"+
		"\7\f\2\2sp\3\2\2\2sr\3\2\2\2t\13\3\2\2\2uv\5\16\b\2vw\7\25\2\2wx\5\f\7"+
		"\2x{\3\2\2\2y{\5\16\b\2zu\3\2\2\2zy\3\2\2\2{\r\3\2\2\2|\u009b\5\20\t\2"+
		"}~\5\20\t\2~\177\7\23\2\2\177\u0080\5\22\n\2\u0080\u009b\3\2\2\2\u0081"+
		"\u0082\5\20\t\2\u0082\u0083\7\23\2\2\u0083\u0084\5\20\t\2\u0084\u009b"+
		"\3\2\2\2\u0085\u009b\7\r\2\2\u0086\u0087\7\r\2\2\u0087\u0088\7\23\2\2"+
		"\u0088\u009b\5\22\n\2\u0089\u008a\7\r\2\2\u008a\u008b\7\23\2\2\u008b\u009b"+
		"\5\20\t\2\u008c\u008d\5\20\t\2\u008d\u008e\7\24\2\2\u008e\u008f\5\22\n"+
		"\2\u008f\u009b\3\2\2\2\u0090\u0091\5\20\t\2\u0091\u0092\7\24\2\2\u0092"+
		"\u0093\5\20\t\2\u0093\u009b\3\2\2\2\u0094\u0095\7\r\2\2\u0095\u0096\7"+
		"\24\2\2\u0096\u009b\5\22\n\2\u0097\u0098\7\r\2\2\u0098\u0099\7\24\2\2"+
		"\u0099\u009b\5\20\t\2\u009a|\3\2\2\2\u009a}\3\2\2\2\u009a\u0081\3\2\2"+
		"\2\u009a\u0085\3\2\2\2\u009a\u0086\3\2\2\2\u009a\u0089\3\2\2\2\u009a\u008c"+
		"\3\2\2\2\u009a\u0090\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0097\3\2\2\2\u009b"+
		"\17\3\2\2\2\u009c\u009d\7\r\2\2\u009d\u009e\5\36\20\2\u009e\21\3\2\2\2"+
		"\u009f\u00a6\5\24\13\2\u00a0\u00a6\5\20\t\2\u00a1\u00a6\5\26\f\2\u00a2"+
		"\u00a6\5\32\16\2\u00a3\u00a6\5\30\r\2\u00a4\u00a6\7\r\2\2\u00a5\u009f"+
		"\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\23\3\2\2\2\u00a7\u00a9\7\20\2"+
		"\2\u00a8\u00aa\7\r\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\20\2\2"+
		"\u00ae\25\3\2\2\2\u00af\u00b0\7\16\2\2\u00b0\u00b3\5\26\f\2\u00b1\u00b3"+
		"\7\16\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\27\3\2\2\2\u00b4"+
		"\u00b5\5\26\f\2\u00b5\u00b6\7\26\2\2\u00b6\u00b7\5\26\f\2\u00b7\u00c1"+
		"\3\2\2\2\u00b8\u00b9\5\26\f\2\u00b9\u00ba\7\26\2\2\u00ba\u00bb\5\26\f"+
		"\2\u00bb\u00bc\5 \21\2\u00bc\u00c1\3\2\2\2\u00bd\u00be\5\26\f\2\u00be"+
		"\u00bf\5 \21\2\u00bf\u00c1\3\2\2\2\u00c0\u00b4\3\2\2\2\u00c0\u00b8\3\2"+
		"\2\2\u00c0\u00bd\3\2\2\2\u00c1\31\3\2\2\2\u00c2\u00c3\7\21\2\2\u00c3\u00c4"+
		"\7\r\2\2\u00c4\u00c5\7\21\2\2\u00c5\33\3\2\2\2\u00c6\u00c7\t\2\2\2\u00c7"+
		"\35\3\2\2\2\u00c8\u00c9\5\34\17\2\u00c9\u00ca\5\36\20\2\u00ca\u00cd\3"+
		"\2\2\2\u00cb\u00cd\5\34\17\2\u00cc\u00c8\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\37\3\2\2\2\u00ce\u00cf\7\22\2\2\u00cf\u00d0\5\26\f\2\u00d0!\3\2\2\2\u00d1"+
		"\u00d2\5$\23\2\u00d2\u00d3\5&\24\2\u00d3#\3\2\2\2\u00d4\u00d5\5\20\t\2"+
		"\u00d5\u00d6\7\23\2\2\u00d6\u00d7\5&\24\2\u00d7\u00e3\3\2\2\2\u00d8\u00d9"+
		"\7\r\2\2\u00d9\u00da\7\23\2\2\u00da\u00e3\5&\24\2\u00db\u00dc\5\20\t\2"+
		"\u00dc\u00dd\7\24\2\2\u00dd\u00de\5&\24\2\u00de\u00e3\3\2\2\2\u00df\u00e0"+
		"\7\r\2\2\u00e0\u00e1\7\24\2\2\u00e1\u00e3\5&\24\2\u00e2\u00d4\3\2\2\2"+
		"\u00e2\u00d8\3\2\2\2\u00e2\u00db\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3%\3"+
		"\2\2\2\u00e4\u00e5\b\24\1\2\u00e5\u00e8\5\22\n\2\u00e6\u00e8\7\27\2\2"+
		"\u00e7\u00e4\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00f7\3\2\2\2\u00e9\u00ea"+
		"\f\b\2\2\u00ea\u00eb\7\32\2\2\u00eb\u00f6\5&\24\t\u00ec\u00ed\f\7\2\2"+
		"\u00ed\u00ee\7\33\2\2\u00ee\u00f6\5&\24\b\u00ef\u00f0\f\6\2\2\u00f0\u00f1"+
		"\7\35\2\2\u00f1\u00f6\5&\24\7\u00f2\u00f3\f\5\2\2\u00f3\u00f4\7\34\2\2"+
		"\u00f4\u00f6\5&\24\6\u00f5\u00e9\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00ef"+
		"\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\'\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\36\2"+
		"\2\u00fb\u00fc\5*\26\2\u00fc\u00fd\5.\30\2\u00fd\u00fe\5*\26\2\u00fe\u00ff"+
		"\7\30\2\2\u00ff\u0100\7 \2\2\u0100\u0101\7\17\2\2\u0101\u0102\5\4\3\2"+
		"\u0102\u0103\7\17\2\2\u0103\u0104\7!\2\2\u0104\u013e\3\2\2\2\u0105\u0106"+
		"\7\36\2\2\u0106\u0107\5*\26\2\u0107\u0108\5.\30\2\u0108\u0109\5*\26\2"+
		"\u0109\u010a\7\17\2\2\u010a\u010b\7 \2\2\u010b\u010c\5\4\3\2\u010c\u010d"+
		"\7\17\2\2\u010d\u010e\7!\2\2\u010e\u013e\3\2\2\2\u010f\u0110\7\36\2\2"+
		"\u0110\u0111\5*\26\2\u0111\u0112\5.\30\2\u0112\u0113\5*\26\2\u0113\u0114"+
		"\7 \2\2\u0114\u0115\5\4\3\2\u0115\u0116\7\17\2\2\u0116\u0117\7\37\2\2"+
		"\u0117\u0118\5(\25\2\u0118\u013e\3\2\2\2\u0119\u011a\7\36\2\2\u011a\u011b"+
		"\5*\26\2\u011b\u011c\5.\30\2\u011c\u011d\5*\26\2\u011d\u011e\7 \2\2\u011e"+
		"\u011f\5\4\3\2\u011f\u0120\7\30\2\2\u0120\u0121\7\37\2\2\u0121\u0122\5"+
		"(\25\2\u0122\u013e\3\2\2\2\u0123\u0124\7\36\2\2\u0124\u0125\5*\26\2\u0125"+
		"\u0126\5.\30\2\u0126\u0127\5*\26\2\u0127\u0128\7\17\2\2\u0128\u0129\7"+
		" \2\2\u0129\u012a\5\4\3\2\u012a\u012b\7\17\2\2\u012b\u012c\7\37\2\2\u012c"+
		"\u012d\5\4\3\2\u012d\u012e\7\17\2\2\u012e\u012f\7!\2\2\u012f\u013e\3\2"+
		"\2\2\u0130\u0131\7\36\2\2\u0131\u0132\5*\26\2\u0132\u0133\5.\30\2\u0133"+
		"\u0134\5*\26\2\u0134\u0135\7\30\2\2\u0135\u0136\7 \2\2\u0136\u0137\5\4"+
		"\3\2\u0137\u0138\7\17\2\2\u0138\u0139\7\37\2\2\u0139\u013a\5\4\3\2\u013a"+
		"\u013b\7\17\2\2\u013b\u013c\7!\2\2\u013c\u013e\3\2\2\2\u013d\u00fa\3\2"+
		"\2\2\u013d\u0105\3\2\2\2\u013d\u010f\3\2\2\2\u013d\u0119\3\2\2\2\u013d"+
		"\u0123\3\2\2\2\u013d\u0130\3\2\2\2\u013e)\3\2\2\2\u013f\u0140\t\3\2\2"+
		"\u0140+\3\2\2\2\u0141\u0142\t\4\2\2\u0142-\3\2\2\2\u0143\u0144\5\22\n"+
		"\2\u0144\u0145\5\60\31\2\u0145\u0146\5\22\n\2\u0146/\3\2\2\2\u0147\u0148"+
		"\t\5\2\2\u0148\61\3\2\2\2\u0149\u014c\5\64\33\2\u014a\u014c\5<\37\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014c\63\3\2\2\2\u014d\u014e\7\'\2"+
		"\2\u014e\u014f\5*\26\2\u014f\u0150\5\16\b\2\u0150\u0151\5> \2\u0151\u0152"+
		"\7\27\2\2\u0152\u0153\5\16\b\2\u0153\u0154\5\60\31\2\u0154\u0155\5\22"+
		"\n\2\u0155\u0156\7\27\2\2\u0156\u0157\5\66\34\2\u0157\u0158\5*\26\2\u0158"+
		"\u0159\7\17\2\2\u0159\u015a\5\4\3\2\u015a\u015b\7\17\2\2\u015b\u015c\7"+
		"(\2\2\u015c\65\3\2\2\2\u015d\u0160\58\35\2\u015e\u0160\5:\36\2\u015f\u015d"+
		"\3\2\2\2\u015f\u015e\3\2\2\2\u0160\67\3\2\2\2\u0161\u0162\5\16\b\2\u0162"+
		"\u0163\7\23\2\2\u0163\u0164\5\16\b\2\u0164\u0165\7\32\2\2\u0165\u0166"+
		"\5\16\b\2\u0166\u0172\3\2\2\2\u0167\u0168\5\16\b\2\u0168\u0169\7\32\2"+
		"\2\u0169\u016a\7\32\2\2\u016a\u0172\3\2\2\2\u016b\u016c\5\16\b\2\u016c"+
		"\u016d\7\24\2\2\u016d\u016e\5\16\b\2\u016e\u016f\7\32\2\2\u016f\u0170"+
		"\5\16\b\2\u0170\u0172\3\2\2\2\u0171\u0161\3\2\2\2\u0171\u0167\3\2\2\2"+
		"\u0171\u016b\3\2\2\2\u01729\3\2\2\2\u0173\u0174\5\16\b\2\u0174\u0175\7"+
		"\23\2\2\u0175\u0176\5\16\b\2\u0176\u0177\7\33\2\2\u0177\u0178\5\16\b\2"+
		"\u0178\u0184\3\2\2\2\u0179\u017a\5\16\b\2\u017a\u017b\7\33\2\2\u017b\u017c"+
		"\7\33\2\2\u017c\u0184\3\2\2\2\u017d\u017e\5\16\b\2\u017e\u017f\7\24\2"+
		"\2\u017f\u0180\5\16\b\2\u0180\u0181\7\33\2\2\u0181\u0182\5\16\b\2\u0182"+
		"\u0184\3\2\2\2\u0183\u0173\3\2\2\2\u0183\u0179\3\2\2\2\u0183\u017d\3\2"+
		"\2\2\u0184;\3\2\2\2\u0185\u0186\7\'\2\2\u0186\u0187\5*\26\2\u0187\u0188"+
		"\7)\2\2\u0188\u0189\7\30\2\2\u0189\u018a\5\16\b\2\u018a\u018b\7\t\2\2"+
		"\u018b\u018c\5\16\b\2\u018c\u018d\5*\26\2\u018d\u018e\7\17\2\2\u018e\u018f"+
		"\5\4\3\2\u018f\u0190\7\17\2\2\u0190\u0191\7(\2\2\u0191=\3\2\2\2\u0192"+
		"\u0193\7\23\2\2\u0193\u0194\5\26\f\2\u0194?\3\2\2\2\u0195\u0196\7*\2\2"+
		"\u0196\u0197\7\3\2\2\u0197\u0198\5B\"\2\u0198\u0199\7\4\2\2\u0199\u019d"+
		"\3\2\2\2\u019a\u019d\5D#\2\u019b\u019d\5H%\2\u019c\u0195\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019b\3\2\2\2\u019dA\3\2\2\2\u019e\u019f\5\24\13"+
		"\2\u019f\u01a0\7\26\2\2\u01a0\u01a1\7+\2\2\u01a1C\3\2\2\2\u01a2\u01a3"+
		"\5F$\2\u01a3\u01a4\7-\2\2\u01a4\u01a5\7.\2\2\u01a5E\3\2\2\2\u01a6\u01ab"+
		"\7,\2\2\u01a7\u01a8\7,\2\2\u01a8\u01a9\7\17\2\2\u01a9\u01ab\5F$\2\u01aa"+
		"\u01a6\3\2\2\2\u01aa\u01a7\3\2\2\2\u01abG\3\2\2\2\u01ac\u01ad\7\n\2\2"+
		"\u01ad\u01ae\5J&\2\u01aeI\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0K\3\2\2\2\30"+
		"Sdjsz\u009a\u00a5\u00ab\u00b2\u00c0\u00cc\u00e2\u00e7\u00f5\u00f7\u013d"+
		"\u014b\u015f\u0171\u0183\u019c\u01aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}