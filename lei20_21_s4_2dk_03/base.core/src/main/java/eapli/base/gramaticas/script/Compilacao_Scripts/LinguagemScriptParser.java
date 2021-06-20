package eapli.base.gramaticas.script.Compilacao_Scripts;

import java.lang.*;

import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import java.util.List;

import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * The type Linguagem script parser.
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinguagemScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	/**
	 * The constant _decisionToDFA.
	 */
	protected static final DFA[] _decisionToDFA;
	/**
	 * The constant _sharedContextCache.
	 */
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	/**
	 * The constant T__0.
	 */
	public static final int
		T__0=1, /**
	 * The T __ 1.
	 */
	T__1=2, /**
	 * The T __ 2.
	 */
	T__2=3, /**
	 * The T __ 3.
	 */
	T__3=4, /**
	 * The T __ 4.
	 */
	T__4=5, /**
	 * The T __ 5.
	 */
	T__5=6, /**
	 * The T __ 6.
	 */
	T__6=7, /**
	 * The Modificador.
	 */
	MODIFICADOR=8,
	/**
	 * The Tipo.
	 */
	TIPO=9, /**
	 * The Letra.
	 */
	LETRA=10, /**
	 * The Digito.
	 */
	DIGITO=11, /**
	 * The Newline.
	 */
	NEWLINE=12, /**
	 * The Aspas.
	 */
	ASPAS=13, /**
	 * The Pelica.
	 */
	PELICA=14, /**
	 * The Expo.
	 */
	EXPO=15,
	/**
	 * The Igual.
	 */
	IGUAL=16, /**
	 * The Igual espaco.
	 */
	IGUAL_ESPACO=17, /**
	 * The Virgula.
	 */
	VIRGULA=18, /**
	 * The Ponto final.
	 */
	PONTO_FINAL=19, /**
	 * The Fim instrucao.
	 */
	FIM_INSTRUCAO=20,
	/**
	 * The Vazio.
	 */
	VAZIO=21, /**
	 * The Dois pontos.
	 */
	DOIS_PONTOS=22, /**
	 * The Soma.
	 */
	SOMA=23, /**
	 * The Subtracao.
	 */
	SUBTRACAO=24, /**
	 * The Multiplicacao.
	 */
	MULTIPLICACAO=25, /**
	 * The Divisao.
	 */
	DIVISAO=26,
	/**
	 * The If.
	 */
	IF=27, /**
	 * The Else.
	 */
	ELSE=28, /**
	 * The Then.
	 */
	THEN=29, /**
	 * The Endif.
	 */
	ENDIF=30, /**
	 * The Maior.
	 */
	MAIOR=31, /**
	 * The Menor.
	 */
	MENOR=32, /**
	 * The Menor igual.
	 */
	MENOR_IGUAL=33,
	/**
	 * The Maior igual.
	 */
	MAIOR_IGUAL=34, /**
	 * The Diferente.
	 */
	DIFERENTE=35, /**
	 * The For.
	 */
	FOR=36, /**
	 * The Endfor.
	 */
	ENDFOR=37, /**
	 * The Colecao.
	 */
	COLECAO=38, /**
	 * The Ler ficheiro.
	 */
	LER_FICHEIRO=39,
	/**
	 * The Extensao.
	 */
	EXTENSAO=40, /**
	 * The Email.
	 */
	EMAIL=41;
	/**
	 * The constant RULE_start.
	 */
	public static final int
		RULE_start = 0, /**
	 * The Rule expr.
	 */
	RULE_expr = 1, /**
	 * The Rule declaracoes.
	 */
	RULE_declaracoes = 2, /**
	 * The Rule declaracao.
	 */
	RULE_declaracao = 3,
	/**
	 * The Rule tipo.
	 */
	RULE_tipo = 4, /**
	 * The Rule lista de variaveis.
	 */
	RULE_lista_de_variaveis = 5, /**
	 * The Rule variavel.
	 */
	RULE_variavel = 6, /**
	 * The Rule identificador.
	 */
	RULE_identificador = 7,
	/**
	 * The Rule valor.
	 */
	RULE_valor = 8, /**
	 * The Rule string.
	 */
	RULE_string = 9, /**
	 * The Rule numeros.
	 */
	RULE_numeros = 10, /**
	 * The Rule palavra.
	 */
	RULE_palavra = 11,
	/**
	 * The Rule inteiro.
	 */
	RULE_inteiro = 12, /**
	 * The Rule real.
	 */
	RULE_real = 13, /**
	 * The Rule caractere.
	 */
	RULE_caractere = 14, /**
	 * The Rule alfa.
	 */
	RULE_alfa = 15,
	/**
	 * The Rule alfas.
	 */
	RULE_alfas = 16, /**
	 * The Rule potencia.
	 */
	RULE_potencia = 17, /**
	 * The Rule base.
	 */
	RULE_base = 18, /**
	 * The Rule expoente.
	 */
	RULE_expoente = 19,
	/**
	 * The Rule contas.
	 */
	RULE_contas = 20, /**
	 * The Rule variavel conta.
	 */
	RULE_variavel_conta = 21, /**
	 * The Rule conta.
	 */
	RULE_conta = 22, /**
	 * The Rule alternativa.
	 */
	RULE_alternativa = 23,
	/**
	 * The Rule parenteses.
	 */
	RULE_parenteses = 24, /**
	 * The Rule a.
	 */
	RULE_a = 25, /**
	 * The Rule comparador.
	 */
	RULE_comparador = 26, /**
	 * The Rule ciclo.
	 */
	RULE_ciclo = 27,
	/**
	 * The Rule forloop.
	 */
	RULE_forloop = 28, /**
	 * The Rule condicao andamento.
	 */
	RULE_condicao_andamento = 29, /**
	 * The Rule for each.
	 */
	RULE_forEach = 30, /**
	 * The Rule funcoes especiais.
	 */
	RULE_funcoesEspeciais = 31,
	/**
	 * The Rule nome ficheiro.
	 */
	RULE_nome_ficheiro = 32, /**
	 * The Rule envio email.
	 */
	RULE_envioEmail = 33, /**
	 * The Rule lista destinatarios.
	 */
	RULE_listaDestinatarios = 34,
	/**
	 * The Rule assunto.
	 */
	RULE_assunto = 35, /**
	 * The Rule mensagem.
	 */
	RULE_mensagem = 36, /**
	 * The Rule palavras.
	 */
	RULE_palavras = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "declaracoes", "declaracao", "tipo", "lista_de_variaveis", 
			"variavel", "identificador", "valor", "string", "numeros", "palavra", 
			"inteiro", "real", "caractere", "alfa", "alfas", "potencia", "base", 
			"expoente", "contas", "variavel_conta", "conta", "alternativa", "parenteses", 
			"a", "comparador", "ciclo", "forloop", "condicao_andamento", "forEach", 
			"funcoesEspeciais", "nome_ficheiro", "envioEmail", "listaDestinatarios", 
			"assunto", "mensagem", "palavras"
		};
	}

	/**
	 * The constant ruleNames.
	 */
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "' : '", "'Assunto: '", "'Mensagem: '", 
			null, null, null, null, "'\n'", "'\"'", "'''", null, "'='", null, "','", 
			"'.'", "';'", "' '", null, null, null, null, null, "'if'", "'else'", 
			"'then'", "'endif'", "'>'", "'<'", "'=<'", "'=>'", "'!='", "'for'", "'endfor'", 
			null, "'lerficheiro'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "MODIFICADOR", "TIPO", 
			"LETRA", "DIGITO", "NEWLINE", "ASPAS", "PELICA", "EXPO", "IGUAL", "IGUAL_ESPACO", 
			"VIRGULA", "PONTO_FINAL", "FIM_INSTRUCAO", "VAZIO", "DOIS_PONTOS", "SOMA", 
			"SUBTRACAO", "MULTIPLICACAO", "DIVISAO", "IF", "ELSE", "THEN", "ENDIF", 
			"MAIOR", "MENOR", "MENOR_IGUAL", "MAIOR_IGUAL", "DIFERENTE", "FOR", "ENDFOR", 
			"COLECAO", "LER_FICHEIRO", "EXTENSAO", "EMAIL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	/**
	 * The constant VOCABULARY.
	 */
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * The constant tokenNames.
	 *
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
	public String getGrammarFileName() { return "LinguagemScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	/**
	 * Instantiates a new Linguagem script parser.
	 *
	 * @param input the input
	 */
	public LinguagemScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	/**
	 * The type Start context.
	 */
	public static class StartContext extends ParserRuleContext {
		/**
		 * Expr expr context.
		 *
		 * @return the expr context
		 */
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}

		/**
		 * Eof terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode EOF() { return getToken(LinguagemScriptParser.EOF, 0); }

		/**
		 * Newline terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode NEWLINE() { return getToken(LinguagemScriptParser.NEWLINE, 0); }

		/**
		 * Instantiates a new Start context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Start start context.
	 *
	 * @return the start context
	 * @throws RecognitionException the recognition exception
	 */
	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				expr();
				setState(77);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				expr();
				setState(80);
				match(NEWLINE);
				setState(81);
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

	/**
	 * The type Expr context.
	 */
	public static class ExprContext extends ParserRuleContext {
		/**
		 * Declaracoes declaracoes context.
		 *
		 * @return the declaracoes context
		 */
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}

		/**
		 * Newline terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode NEWLINE() { return getToken(LinguagemScriptParser.NEWLINE, 0); }

		/**
		 * Expr expr context.
		 *
		 * @return the expr context
		 */
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}

		/**
		 * Contas contas context.
		 *
		 * @return the contas context
		 */
		public ContasContext contas() {
			return getRuleContext(ContasContext.class,0);
		}

		/**
		 * Ciclo ciclo context.
		 *
		 * @return the ciclo context
		 */
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}

		/**
		 * Alternativa alternativa context.
		 *
		 * @return the alternativa context
		 */
		public AlternativaContext alternativa() {
			return getRuleContext(AlternativaContext.class,0);
		}

		/**
		 * Condicao andamento condicao andamento context.
		 *
		 * @return the condicao andamento context
		 */
		public Condicao_andamentoContext condicao_andamento() {
			return getRuleContext(Condicao_andamentoContext.class,0);
		}

		/**
		 * Fim instrucao terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode FIM_INSTRUCAO() { return getToken(LinguagemScriptParser.FIM_INSTRUCAO, 0); }

		/**
		 * Instantiates a new Expr context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Expr expr context.
	 *
	 * @return the expr context
	 * @throws RecognitionException the recognition exception
	 */
	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				declaracoes();
				setState(86);
				match(NEWLINE);
				setState(87);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				contas();
				setState(90);
				match(NEWLINE);
				setState(91);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				ciclo();
				setState(94);
				match(NEWLINE);
				setState(95);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				alternativa();
				setState(98);
				match(NEWLINE);
				setState(99);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				condicao_andamento();
				setState(102);
				match(FIM_INSTRUCAO);
				setState(103);
				match(NEWLINE);
				setState(104);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				declaracoes();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				contas();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				ciclo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(109);
				alternativa();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(110);
				condicao_andamento();
				setState(111);
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

	/**
	 * The type Declaracoes context.
	 */
	public static class DeclaracoesContext extends ParserRuleContext {
		/**
		 * Declaracao declaracao context.
		 *
		 * @return the declaracao context
		 */
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}

		/**
		 * Declaracoes declaracoes context.
		 *
		 * @return the declaracoes context
		 */
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}

		/**
		 * Instantiates a new Declaracoes context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Declaracoes declaracoes context.
	 *
	 * @return the declaracoes context
	 * @throws RecognitionException the recognition exception
	 */
	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracoes);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIFICADOR:
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				declaracao();
				setState(116);
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

	/**
	 * The type Declaracao context.
	 */
	public static class DeclaracaoContext extends ParserRuleContext {
		/**
		 * Instantiates a new Declaracao context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }

		/**
		 * Instantiates a new Declaracao context.
		 */
		public DeclaracaoContext() { }

		/**
		 * Copy from.
		 *
		 * @param ctx the ctx
		 */
		public void copyFrom(DeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}

	/**
	 * The type Declaracao variaveis context.
	 */
	public static class DeclaracaoVariaveisContext extends DeclaracaoContext {
		/**
		 * The Left.
		 */
		public TipoContext left;
		/**
		 * The Right.
		 */
		public Lista_de_variaveisContext right;

		/**
		 * Fim instrucao terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode FIM_INSTRUCAO() { return getToken(LinguagemScriptParser.FIM_INSTRUCAO, 0); }

		/**
		 * Tipo tipo context.
		 *
		 * @return the tipo context
		 */
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}

		/**
		 * Lista de variaveis lista de variaveis context.
		 *
		 * @return the lista de variaveis context
		 */
		public Lista_de_variaveisContext lista_de_variaveis() {
			return getRuleContext(Lista_de_variaveisContext.class,0);
		}

		/**
		 * Instantiates a new Declaracao variaveis context.
		 *
		 * @param ctx the ctx
		 */
		public DeclaracaoVariaveisContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterDeclaracaoVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitDeclaracaoVariaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitDeclaracaoVariaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Declaracao declaracao context.
	 *
	 * @return the declaracao context
	 * @throws RecognitionException the recognition exception
	 */
	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		try {
			_localctx = new DeclaracaoVariaveisContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((DeclaracaoVariaveisContext)_localctx).left = tipo();
			setState(122);
			((DeclaracaoVariaveisContext)_localctx).right = lista_de_variaveis();
			setState(123);
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

	/**
	 * The type Tipo context.
	 */
	public static class TipoContext extends ParserRuleContext {
		/**
		 * Modificador terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode MODIFICADOR() { return getToken(LinguagemScriptParser.MODIFICADOR, 0); }

		/**
		 * Tipo terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode TIPO() { return getToken(LinguagemScriptParser.TIPO, 0); }

		/**
		 * Instantiates a new Tipo context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Tipo tipo context.
	 *
	 * @return the tipo context
	 * @throws RecognitionException the recognition exception
	 */
	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(MODIFICADOR);
				setState(126);
				match(TIPO);
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
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

	/**
	 * The type Lista de variaveis context.
	 */
	public static class Lista_de_variaveisContext extends ParserRuleContext {
		/**
		 * Variavel variavel context.
		 *
		 * @return the variavel context
		 */
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}

		/**
		 * Virgula terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode VIRGULA() { return getToken(LinguagemScriptParser.VIRGULA, 0); }

		/**
		 * Lista de variaveis lista de variaveis context.
		 *
		 * @return the lista de variaveis context
		 */
		public Lista_de_variaveisContext lista_de_variaveis() {
			return getRuleContext(Lista_de_variaveisContext.class,0);
		}

		/**
		 * Instantiates a new Lista de variaveis context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public Lista_de_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_de_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterLista_de_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitLista_de_variaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitLista_de_variaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Lista de variaveis lista de variaveis context.
	 *
	 * @return the lista de variaveis context
	 * @throws RecognitionException the recognition exception
	 */
	public final Lista_de_variaveisContext lista_de_variaveis() throws RecognitionException {
		Lista_de_variaveisContext _localctx = new Lista_de_variaveisContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lista_de_variaveis);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				variavel();
				setState(131);
				match(VIRGULA);
				setState(132);
				lista_de_variaveis();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
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

	/**
	 * The type Variavel context.
	 */
	public static class VariavelContext extends ParserRuleContext {
		/**
		 * Identificador list.
		 *
		 * @return the list
		 */
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}

		/**
		 * Identificador identificador context.
		 *
		 * @param i the
		 * @return the identificador context
		 */
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}

		/**
		 * Igual terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode IGUAL() { return getToken(LinguagemScriptParser.IGUAL, 0); }

		/**
		 * Valor valor context.
		 *
		 * @return the valor context
		 */
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}

		/**
		 * Letra terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode LETRA() { return getToken(LinguagemScriptParser.LETRA, 0); }

		/**
		 * Igual espaco terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode IGUAL_ESPACO() { return getToken(LinguagemScriptParser.IGUAL_ESPACO, 0); }

		/**
		 * Instantiates a new Variavel context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Variavel variavel context.
	 *
	 * @return the variavel context
	 * @throws RecognitionException the recognition exception
	 */
	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variavel);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				identificador();
				setState(139);
				match(IGUAL);
				setState(140);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				identificador();
				setState(143);
				match(IGUAL);
				setState(144);
				identificador();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				match(LETRA);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				match(LETRA);
				setState(148);
				match(IGUAL);
				setState(149);
				valor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				match(LETRA);
				setState(151);
				match(IGUAL);
				setState(152);
				identificador();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(153);
				identificador();
				setState(154);
				match(IGUAL_ESPACO);
				setState(155);
				valor();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(157);
				identificador();
				setState(158);
				match(IGUAL_ESPACO);
				setState(159);
				identificador();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(161);
				match(LETRA);
				setState(162);
				match(IGUAL_ESPACO);
				setState(163);
				valor();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(164);
				match(LETRA);
				setState(165);
				match(IGUAL_ESPACO);
				setState(166);
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

	/**
	 * The type Identificador context.
	 */
	public static class IdentificadorContext extends ParserRuleContext {
		/**
		 * Letra terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode LETRA() { return getToken(LinguagemScriptParser.LETRA, 0); }

		/**
		 * Alfas alfas context.
		 *
		 * @return the alfas context
		 */
		public AlfasContext alfas() {
			return getRuleContext(AlfasContext.class,0);
		}

		/**
		 * Instantiates a new Identificador context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Identificador identificador context.
	 *
	 * @return the identificador context
	 * @throws RecognitionException the recognition exception
	 */
	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(LETRA);
			setState(170);
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

	/**
	 * The type Valor context.
	 */
	public static class ValorContext extends ParserRuleContext {
		/**
		 * String string context.
		 *
		 * @return the string context
		 */
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}

		/**
		 * Numeros numeros context.
		 *
		 * @return the numeros context
		 */
		public NumerosContext numeros() {
			return getRuleContext(NumerosContext.class,0);
		}

		/**
		 * Instantiates a new Valor context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Valor valor context.
	 *
	 * @return the valor context
	 * @throws RecognitionException the recognition exception
	 */
	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valor);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETRA:
			case ASPAS:
			case PELICA:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				string();
				}
				break;
			case DIGITO:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				numeros();
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

	/**
	 * The type String context.
	 */
	public static class StringContext extends ParserRuleContext {
		/**
		 * Palavra palavra context.
		 *
		 * @return the palavra context
		 */
		public PalavraContext palavra() {
			return getRuleContext(PalavraContext.class,0);
		}

		/**
		 * Identificador identificador context.
		 *
		 * @return the identificador context
		 */
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}

		/**
		 * Caractere caractere context.
		 *
		 * @return the caractere context
		 */
		public CaractereContext caractere() {
			return getRuleContext(CaractereContext.class,0);
		}

		/**
		 * Letra terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode LETRA() { return getToken(LinguagemScriptParser.LETRA, 0); }

		/**
		 * Instantiates a new String context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * String string context.
	 *
	 * @return the string context
	 * @throws RecognitionException the recognition exception
	 */
	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_string);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				palavra();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				identificador();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				caractere();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
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

	/**
	 * The type Numeros context.
	 */
	public static class NumerosContext extends ParserRuleContext {
		/**
		 * Inteiro inteiro context.
		 *
		 * @return the inteiro context
		 */
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}

		/**
		 * Real real context.
		 *
		 * @return the real context
		 */
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}

		/**
		 * Instantiates a new Numeros context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public NumerosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterNumeros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitNumeros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitNumeros(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Numeros numeros context.
	 *
	 * @return the numeros context
	 * @throws RecognitionException the recognition exception
	 */
	public final NumerosContext numeros() throws RecognitionException {
		NumerosContext _localctx = new NumerosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numeros);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				inteiro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				real();
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

	/**
	 * The type Palavra context.
	 */
	public static class PalavraContext extends ParserRuleContext {
		/**
		 * Aspas list.
		 *
		 * @return the list
		 */
		public List<TerminalNode> ASPAS() { return getTokens(LinguagemScriptParser.ASPAS); }

		/**
		 * Aspas terminal node.
		 *
		 * @param i the
		 * @return the terminal node
		 */
		public TerminalNode ASPAS(int i) {
			return getToken(LinguagemScriptParser.ASPAS, i);
		}

		/**
		 * Letra list.
		 *
		 * @return the list
		 */
		public List<TerminalNode> LETRA() { return getTokens(LinguagemScriptParser.LETRA); }

		/**
		 * Letra terminal node.
		 *
		 * @param i the
		 * @return the terminal node
		 */
		public TerminalNode LETRA(int i) {
			return getToken(LinguagemScriptParser.LETRA, i);
		}

		/**
		 * Instantiates a new Palavra context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public PalavraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palavra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterPalavra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitPalavra(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitPalavra(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Palavra palavra context.
	 *
	 * @return the palavra context
	 * @throws RecognitionException the recognition exception
	 */
	public final PalavraContext palavra() throws RecognitionException {
		PalavraContext _localctx = new PalavraContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_palavra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ASPAS);
			setState(188); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				match(LETRA);
				}
				}
				setState(190); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETRA );
			setState(192);
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

	/**
	 * The type Inteiro context.
	 */
	public static class InteiroContext extends ParserRuleContext {
		/**
		 * Digito terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode DIGITO() { return getToken(LinguagemScriptParser.DIGITO, 0); }

		/**
		 * Inteiro inteiro context.
		 *
		 * @return the inteiro context
		 */
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}

		/**
		 * Instantiates a new Inteiro context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public InteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitInteiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitInteiro(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Inteiro inteiro context.
	 *
	 * @return the inteiro context
	 * @throws RecognitionException the recognition exception
	 */
	public final InteiroContext inteiro() throws RecognitionException {
		InteiroContext _localctx = new InteiroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inteiro);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(DIGITO);
				setState(195);
				inteiro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
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

	/**
	 * The type Real context.
	 */
	public static class RealContext extends ParserRuleContext {
		/**
		 * Inteiro list.
		 *
		 * @return the list
		 */
		public List<InteiroContext> inteiro() {
			return getRuleContexts(InteiroContext.class);
		}

		/**
		 * Inteiro inteiro context.
		 *
		 * @param i the
		 * @return the inteiro context
		 */
		public InteiroContext inteiro(int i) {
			return getRuleContext(InteiroContext.class,i);
		}

		/**
		 * Ponto final terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode PONTO_FINAL() { return getToken(LinguagemScriptParser.PONTO_FINAL, 0); }

		/**
		 * Potencia potencia context.
		 *
		 * @return the potencia context
		 */
		public PotenciaContext potencia() {
			return getRuleContext(PotenciaContext.class,0);
		}

		/**
		 * Instantiates a new Real context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Real real context.
	 *
	 * @return the real context
	 * @throws RecognitionException the recognition exception
	 */
	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_real);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				inteiro();
				setState(200);
				match(PONTO_FINAL);
				setState(201);
				inteiro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				potencia();
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

	/**
	 * The type Caractere context.
	 */
	public static class CaractereContext extends ParserRuleContext {
		/**
		 * Pelica list.
		 *
		 * @return the list
		 */
		public List<TerminalNode> PELICA() { return getTokens(LinguagemScriptParser.PELICA); }

		/**
		 * Pelica terminal node.
		 *
		 * @param i the
		 * @return the terminal node
		 */
		public TerminalNode PELICA(int i) {
			return getToken(LinguagemScriptParser.PELICA, i);
		}

		/**
		 * Letra terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode LETRA() { return getToken(LinguagemScriptParser.LETRA, 0); }

		/**
		 * Instantiates a new Caractere context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public CaractereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caractere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterCaractere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitCaractere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitCaractere(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Caractere caractere context.
	 *
	 * @return the caractere context
	 * @throws RecognitionException the recognition exception
	 */
	public final CaractereContext caractere() throws RecognitionException {
		CaractereContext _localctx = new CaractereContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_caractere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(PELICA);
			setState(207);
			match(LETRA);
			setState(208);
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

	/**
	 * The type Alfa context.
	 */
	public static class AlfaContext extends ParserRuleContext {
		/**
		 * Letra terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode LETRA() { return getToken(LinguagemScriptParser.LETRA, 0); }

		/**
		 * Digito terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode DIGITO() { return getToken(LinguagemScriptParser.DIGITO, 0); }

		/**
		 * Instantiates a new Alfa context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public AlfaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alfa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterAlfa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitAlfa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitAlfa(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Alfa alfa context.
	 *
	 * @return the alfa context
	 * @throws RecognitionException the recognition exception
	 */
	public final AlfaContext alfa() throws RecognitionException {
		AlfaContext _localctx = new AlfaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alfa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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

	/**
	 * The type Alfas context.
	 */
	public static class AlfasContext extends ParserRuleContext {
		/**
		 * Alfa alfa context.
		 *
		 * @return the alfa context
		 */
		public AlfaContext alfa() {
			return getRuleContext(AlfaContext.class,0);
		}

		/**
		 * Alfas alfas context.
		 *
		 * @return the alfas context
		 */
		public AlfasContext alfas() {
			return getRuleContext(AlfasContext.class,0);
		}

		/**
		 * Instantiates a new Alfas context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public AlfasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alfas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterAlfas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitAlfas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitAlfas(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Alfas alfas context.
	 *
	 * @return the alfas context
	 * @throws RecognitionException the recognition exception
	 */
	public final AlfasContext alfas() throws RecognitionException {
		AlfasContext _localctx = new AlfasContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_alfas);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				alfa();
				setState(213);
				alfas();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
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

	/**
	 * The type Potencia context.
	 */
	public static class PotenciaContext extends ParserRuleContext {
		/**
		 * Instantiates a new Potencia context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public PotenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potencia; }

		/**
		 * Instantiates a new Potencia context.
		 */
		public PotenciaContext() { }

		/**
		 * Copy from.
		 *
		 * @param ctx the ctx
		 */
		public void copyFrom(PotenciaContext ctx) {
			super.copyFrom(ctx);
		}
	}

	/**
	 * The type Potencias context.
	 */
	public static class PotenciasContext extends PotenciaContext {
		/**
		 * The Left.
		 */
		public BaseContext left;
		/**
		 * The Right.
		 */
		public ExpoenteContext right;

		/**
		 * Base base context.
		 *
		 * @return the base context
		 */
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}

		/**
		 * Expoente expoente context.
		 *
		 * @return the expoente context
		 */
		public ExpoenteContext expoente() {
			return getRuleContext(ExpoenteContext.class,0);
		}

		/**
		 * Instantiates a new Potencias context.
		 *
		 * @param ctx the ctx
		 */
		public PotenciasContext(PotenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterPotencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitPotencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitPotencias(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Potencia potencia context.
	 *
	 * @return the potencia context
	 * @throws RecognitionException the recognition exception
	 */
	public final PotenciaContext potencia() throws RecognitionException {
		PotenciaContext _localctx = new PotenciaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_potencia);
		try {
			_localctx = new PotenciasContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			((PotenciasContext)_localctx).left = base();
			setState(219);
			((PotenciasContext)_localctx).right = expoente();
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

	/**
	 * The type Base context.
	 */
	public static class BaseContext extends ParserRuleContext {
		/**
		 * Inteiro list.
		 *
		 * @return the list
		 */
		public List<InteiroContext> inteiro() {
			return getRuleContexts(InteiroContext.class);
		}

		/**
		 * Inteiro inteiro context.
		 *
		 * @param i the
		 * @return the inteiro context
		 */
		public InteiroContext inteiro(int i) {
			return getRuleContext(InteiroContext.class,i);
		}

		/**
		 * Ponto final terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode PONTO_FINAL() { return getToken(LinguagemScriptParser.PONTO_FINAL, 0); }

		/**
		 * Instantiates a new Base context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitBase(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Base base context.
	 *
	 * @return the base context
	 * @throws RecognitionException the recognition exception
	 */
	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_base);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				inteiro();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				inteiro();
				setState(223);
				match(PONTO_FINAL);
				setState(224);
				inteiro();
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

	/**
	 * The type Expoente context.
	 */
	public static class ExpoenteContext extends ParserRuleContext {
		/**
		 * Inteiro inteiro context.
		 *
		 * @return the inteiro context
		 */
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}

		/**
		 * Instantiates a new Expoente context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public ExpoenteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expoente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterExpoente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitExpoente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitExpoente(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Expoente expoente context.
	 *
	 * @return the expoente context
	 * @throws RecognitionException the recognition exception
	 */
	public final ExpoenteContext expoente() throws RecognitionException {
		ExpoenteContext _localctx = new ExpoenteContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expoente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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

	/**
	 * The type Contas context.
	 */
	public static class ContasContext extends ParserRuleContext {
		/**
		 * Variavel conta variavel conta context.
		 *
		 * @return the variavel conta context
		 */
		public Variavel_contaContext variavel_conta() {
			return getRuleContext(Variavel_contaContext.class,0);
		}

		/**
		 * Conta conta context.
		 *
		 * @return the conta context
		 */
		public ContaContext conta() {
			return getRuleContext(ContaContext.class,0);
		}

		/**
		 * Instantiates a new Contas context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public ContasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterContas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitContas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitContas(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Contas contas context.
	 *
	 * @return the contas context
	 * @throws RecognitionException the recognition exception
	 */
	public final ContasContext contas() throws RecognitionException {
		ContasContext _localctx = new ContasContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_contas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			variavel_conta();
			setState(231);
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

	/**
	 * The type Variavel conta context.
	 */
	public static class Variavel_contaContext extends ParserRuleContext {
		/**
		 * Identificador identificador context.
		 *
		 * @return the identificador context
		 */
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}

		/**
		 * Igual terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode IGUAL() { return getToken(LinguagemScriptParser.IGUAL, 0); }

		/**
		 * Conta conta context.
		 *
		 * @return the conta context
		 */
		public ContaContext conta() {
			return getRuleContext(ContaContext.class,0);
		}

		/**
		 * Letra terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode LETRA() { return getToken(LinguagemScriptParser.LETRA, 0); }

		/**
		 * Igual espaco terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode IGUAL_ESPACO() { return getToken(LinguagemScriptParser.IGUAL_ESPACO, 0); }

		/**
		 * Instantiates a new Variavel conta context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public Variavel_contaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel_conta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterVariavel_conta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitVariavel_conta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitVariavel_conta(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Variavel conta variavel conta context.
	 *
	 * @return the variavel conta context
	 * @throws RecognitionException the recognition exception
	 */
	public final Variavel_contaContext variavel_conta() throws RecognitionException {
		Variavel_contaContext _localctx = new Variavel_contaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variavel_conta);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				identificador();
				setState(234);
				match(IGUAL);
				setState(235);
				conta(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(LETRA);
				setState(238);
				match(IGUAL);
				setState(239);
				conta(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				identificador();
				setState(241);
				match(IGUAL_ESPACO);
				setState(242);
				conta(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(LETRA);
				setState(245);
				match(IGUAL_ESPACO);
				setState(246);
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

	/**
	 * The type Conta context.
	 */
	public static class ContaContext extends ParserRuleContext {
		/**
		 * Instantiates a new Conta context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public ContaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conta; }

		/**
		 * Instantiates a new Conta context.
		 */
		public ContaContext() { }

		/**
		 * Copy from.
		 *
		 * @param ctx the ctx
		 */
		public void copyFrom(ContaContext ctx) {
			super.copyFrom(ctx);
		}
	}

	/**
	 * The type Conta soma context.
	 */
	public static class ContaSomaContext extends ContaContext {
		/**
		 * The Left.
		 */
		public ContaContext left;
		/**
		 * The Op.
		 */
		public Token op;
		/**
		 * The Right.
		 */
		public ContaContext right;

		/**
		 * Conta list.
		 *
		 * @return the list
		 */
		public List<ContaContext> conta() {
			return getRuleContexts(ContaContext.class);
		}

		/**
		 * Conta conta context.
		 *
		 * @param i the
		 * @return the conta context
		 */
		public ContaContext conta(int i) {
			return getRuleContext(ContaContext.class,i);
		}

		/**
		 * Soma terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode SOMA() { return getToken(LinguagemScriptParser.SOMA, 0); }

		/**
		 * Instantiates a new Conta soma context.
		 *
		 * @param ctx the ctx
		 */
		public ContaSomaContext(ContaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterContaSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitContaSoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitContaSoma(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * The type Conta mul context.
	 */
	public static class ContaMulContext extends ContaContext {
		/**
		 * The Left.
		 */
		public ContaContext left;
		/**
		 * The Op.
		 */
		public Token op;
		/**
		 * The Right.
		 */
		public ContaContext right;

		/**
		 * Conta list.
		 *
		 * @return the list
		 */
		public List<ContaContext> conta() {
			return getRuleContexts(ContaContext.class);
		}

		/**
		 * Conta conta context.
		 *
		 * @param i the
		 * @return the conta context
		 */
		public ContaContext conta(int i) {
			return getRuleContext(ContaContext.class,i);
		}

		/**
		 * Multiplicacao terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode MULTIPLICACAO() { return getToken(LinguagemScriptParser.MULTIPLICACAO, 0); }

		/**
		 * Instantiates a new Conta mul context.
		 *
		 * @param ctx the ctx
		 */
		public ContaMulContext(ContaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterContaMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitContaMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitContaMul(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * The type Valor conta context.
	 */
	public static class ValorContaContext extends ContaContext {
		/**
		 * Valor valor context.
		 *
		 * @return the valor context
		 */
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}

		/**
		 * Instantiates a new Valor conta context.
		 *
		 * @param ctx the ctx
		 */
		public ValorContaContext(ContaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterValorConta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitValorConta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitValorConta(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * The type Conta sub context.
	 */
	public static class ContaSubContext extends ContaContext {
		/**
		 * The Left.
		 */
		public ContaContext left;
		/**
		 * The Op.
		 */
		public Token op;
		/**
		 * The Right.
		 */
		public ContaContext right;

		/**
		 * Conta list.
		 *
		 * @return the list
		 */
		public List<ContaContext> conta() {
			return getRuleContexts(ContaContext.class);
		}

		/**
		 * Conta conta context.
		 *
		 * @param i the
		 * @return the conta context
		 */
		public ContaContext conta(int i) {
			return getRuleContext(ContaContext.class,i);
		}

		/**
		 * Subtracao terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode SUBTRACAO() { return getToken(LinguagemScriptParser.SUBTRACAO, 0); }

		/**
		 * Instantiates a new Conta sub context.
		 *
		 * @param ctx the ctx
		 */
		public ContaSubContext(ContaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterContaSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitContaSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitContaSub(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * The type Conta div context.
	 */
	public static class ContaDivContext extends ContaContext {
		/**
		 * The Left.
		 */
		public ContaContext left;
		/**
		 * The Op.
		 */
		public Token op;
		/**
		 * The Right.
		 */
		public ContaContext right;

		/**
		 * Conta list.
		 *
		 * @return the list
		 */
		public List<ContaContext> conta() {
			return getRuleContexts(ContaContext.class);
		}

		/**
		 * Conta conta context.
		 *
		 * @param i the
		 * @return the conta context
		 */
		public ContaContext conta(int i) {
			return getRuleContext(ContaContext.class,i);
		}

		/**
		 * Divisao terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode DIVISAO() { return getToken(LinguagemScriptParser.DIVISAO, 0); }

		/**
		 * Instantiates a new Conta div context.
		 *
		 * @param ctx the ctx
		 */
		public ContaDivContext(ContaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterContaDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitContaDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitContaDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * The type Conta fim intrucao context.
	 */
	public static class ContaFimIntrucaoContext extends ContaContext {
		/**
		 * Fim instrucao terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode FIM_INSTRUCAO() { return getToken(LinguagemScriptParser.FIM_INSTRUCAO, 0); }

		/**
		 * Instantiates a new Conta fim intrucao context.
		 *
		 * @param ctx the ctx
		 */
		public ContaFimIntrucaoContext(ContaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterContaFimIntrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitContaFimIntrucao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitContaFimIntrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Conta conta context.
	 *
	 * @return the conta context
	 * @throws RecognitionException the recognition exception
	 */
	public final ContaContext conta() throws RecognitionException {
		return conta(0);
	}

	private ContaContext conta(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ContaContext _localctx = new ContaContext(_ctx, _parentState);
		ContaContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_conta, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETRA:
			case DIGITO:
			case ASPAS:
			case PELICA:
				{
				_localctx = new ValorContaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(250);
				valor();
				}
				break;
			case FIM_INSTRUCAO:
				{
				_localctx = new ContaFimIntrucaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(FIM_INSTRUCAO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(266);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ContaSomaContext(new ContaContext(_parentctx, _parentState));
						((ContaSomaContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_conta);
						setState(254);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(255);
						((ContaSomaContext)_localctx).op = match(SOMA);
						setState(256);
						((ContaSomaContext)_localctx).right = conta(7);
						}
						break;
					case 2:
						{
						_localctx = new ContaSubContext(new ContaContext(_parentctx, _parentState));
						((ContaSubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_conta);
						setState(257);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(258);
						((ContaSubContext)_localctx).op = match(SUBTRACAO);
						setState(259);
						((ContaSubContext)_localctx).right = conta(6);
						}
						break;
					case 3:
						{
						_localctx = new ContaDivContext(new ContaContext(_parentctx, _parentState));
						((ContaDivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_conta);
						setState(260);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(261);
						((ContaDivContext)_localctx).op = match(DIVISAO);
						setState(262);
						((ContaDivContext)_localctx).right = conta(5);
						}
						break;
					case 4:
						{
						_localctx = new ContaMulContext(new ContaContext(_parentctx, _parentState));
						((ContaMulContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_conta);
						setState(263);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(264);
						((ContaMulContext)_localctx).op = match(MULTIPLICACAO);
						setState(265);
						((ContaMulContext)_localctx).right = conta(4);
						}
						break;
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	/**
	 * The type Alternativa context.
	 */
	public static class AlternativaContext extends ParserRuleContext {
		/**
		 * If terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode IF() { return getToken(LinguagemScriptParser.IF, 0); }

		/**
		 * Parenteses list.
		 *
		 * @return the list
		 */
		public List<ParentesesContext> parenteses() {
			return getRuleContexts(ParentesesContext.class);
		}

		/**
		 * Parenteses parenteses context.
		 *
		 * @param i the
		 * @return the parenteses context
		 */
		public ParentesesContext parenteses(int i) {
			return getRuleContext(ParentesesContext.class,i);
		}

		/**
		 * A a context.
		 *
		 * @return the a context
		 */
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}

		/**
		 * Vazio terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode VAZIO() { return getToken(LinguagemScriptParser.VAZIO, 0); }

		/**
		 * Then terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode THEN() { return getToken(LinguagemScriptParser.THEN, 0); }

		/**
		 * Newline list.
		 *
		 * @return the list
		 */
		public List<TerminalNode> NEWLINE() { return getTokens(LinguagemScriptParser.NEWLINE); }

		/**
		 * Newline terminal node.
		 *
		 * @param i the
		 * @return the terminal node
		 */
		public TerminalNode NEWLINE(int i) {
			return getToken(LinguagemScriptParser.NEWLINE, i);
		}

		/**
		 * Expr list.
		 *
		 * @return the list
		 */
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		/**
		 * Expr expr context.
		 *
		 * @param i the
		 * @return the expr context
		 */
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}

		/**
		 * Endif terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode ENDIF() { return getToken(LinguagemScriptParser.ENDIF, 0); }

		/**
		 * Else terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode ELSE() { return getToken(LinguagemScriptParser.ELSE, 0); }

		/**
		 * Alternativa alternativa context.
		 *
		 * @return the alternativa context
		 */
		public AlternativaContext alternativa() {
			return getRuleContext(AlternativaContext.class,0);
		}

		/**
		 * Instantiates a new Alternativa context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public AlternativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterAlternativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitAlternativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitAlternativa(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Alternativa alternativa context.
	 *
	 * @return the alternativa context
	 * @throws RecognitionException the recognition exception
	 */
	public final AlternativaContext alternativa() throws RecognitionException {
		AlternativaContext _localctx = new AlternativaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_alternativa);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(IF);
				setState(272);
				parenteses();
				setState(273);
				a();
				setState(274);
				parenteses();
				setState(275);
				match(VAZIO);
				setState(276);
				match(THEN);
				setState(277);
				match(NEWLINE);
				setState(278);
				expr();
				setState(279);
				match(NEWLINE);
				setState(280);
				match(ENDIF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(IF);
				setState(283);
				parenteses();
				setState(284);
				a();
				setState(285);
				parenteses();
				setState(286);
				match(NEWLINE);
				setState(287);
				match(THEN);
				setState(288);
				expr();
				setState(289);
				match(NEWLINE);
				setState(290);
				match(ENDIF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(IF);
				setState(293);
				parenteses();
				setState(294);
				a();
				setState(295);
				parenteses();
				setState(296);
				match(THEN);
				setState(297);
				expr();
				setState(298);
				match(NEWLINE);
				setState(299);
				match(ELSE);
				setState(300);
				alternativa();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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
				match(THEN);
				setState(307);
				expr();
				setState(308);
				match(VAZIO);
				setState(309);
				match(ELSE);
				setState(310);
				alternativa();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(312);
				match(IF);
				setState(313);
				parenteses();
				setState(314);
				a();
				setState(315);
				parenteses();
				setState(316);
				match(NEWLINE);
				setState(317);
				match(THEN);
				setState(318);
				expr();
				setState(319);
				match(NEWLINE);
				setState(320);
				match(ELSE);
				setState(321);
				expr();
				setState(322);
				match(NEWLINE);
				setState(323);
				match(ENDIF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(325);
				match(IF);
				setState(326);
				parenteses();
				setState(327);
				a();
				setState(328);
				parenteses();
				setState(329);
				match(VAZIO);
				setState(330);
				match(THEN);
				setState(331);
				expr();
				setState(332);
				match(NEWLINE);
				setState(333);
				match(ELSE);
				setState(334);
				expr();
				setState(335);
				match(NEWLINE);
				setState(336);
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

	/**
	 * The type Parenteses context.
	 */
	public static class ParentesesContext extends ParserRuleContext {
		/**
		 * Instantiates a new Parenteses context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public ParentesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenteses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterParenteses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitParenteses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitParenteses(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Parenteses parenteses context.
	 *
	 * @return the parenteses context
	 * @throws RecognitionException the recognition exception
	 */
	public final ParentesesContext parenteses() throws RecognitionException {
		ParentesesContext _localctx = new ParentesesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parenteses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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

	/**
	 * The type A context.
	 */
	public static class AContext extends ParserRuleContext {
		/**
		 * Instantiates a new A context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }

		/**
		 * Instantiates a new A context.
		 */
		public AContext() { }

		/**
		 * Copy from.
		 *
		 * @param ctx the ctx
		 */
		public void copyFrom(AContext ctx) {
			super.copyFrom(ctx);
		}
	}

	/**
	 * The type Comparacao context.
	 */
	public static class ComparacaoContext extends AContext {
		/**
		 * The Left.
		 */
		public ValorContext left;
		/**
		 * The Op.
		 */
		public ComparadorContext op;
		/**
		 * The Right.
		 */
		public ValorContext right;

		/**
		 * Valor list.
		 *
		 * @return the list
		 */
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}

		/**
		 * Valor valor context.
		 *
		 * @param i the
		 * @return the valor context
		 */
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}

		/**
		 * Comparador comparador context.
		 *
		 * @return the comparador context
		 */
		public ComparadorContext comparador() {
			return getRuleContext(ComparadorContext.class,0);
		}

		/**
		 * Instantiates a new Comparacao context.
		 *
		 * @param ctx the ctx
		 */
		public ComparacaoContext(AContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitComparacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitComparacao(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * A a context.
	 *
	 * @return the a context
	 * @throws RecognitionException the recognition exception
	 */
	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_a);
		try {
			_localctx = new ComparacaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			((ComparacaoContext)_localctx).left = valor();
			setState(343);
			((ComparacaoContext)_localctx).op = comparador();
			setState(344);
			((ComparacaoContext)_localctx).right = valor();
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

	/**
	 * The type Comparador context.
	 */
	public static class ComparadorContext extends ParserRuleContext {
		/**
		 * Maior terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode MAIOR() { return getToken(LinguagemScriptParser.MAIOR, 0); }

		/**
		 * Igual terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode IGUAL() { return getToken(LinguagemScriptParser.IGUAL, 0); }

		/**
		 * Menor terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode MENOR() { return getToken(LinguagemScriptParser.MENOR, 0); }

		/**
		 * Maior igual terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode MAIOR_IGUAL() { return getToken(LinguagemScriptParser.MAIOR_IGUAL, 0); }

		/**
		 * Menor igual terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode MENOR_IGUAL() { return getToken(LinguagemScriptParser.MENOR_IGUAL, 0); }

		/**
		 * Diferente terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode DIFERENTE() { return getToken(LinguagemScriptParser.DIFERENTE, 0); }

		/**
		 * Instantiates a new Comparador context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public ComparadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterComparador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitComparador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitComparador(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Comparador comparador context.
	 *
	 * @return the comparador context
	 * @throws RecognitionException the recognition exception
	 */
	public final ComparadorContext comparador() throws RecognitionException {
		ComparadorContext _localctx = new ComparadorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_comparador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
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

	/**
	 * The type Ciclo context.
	 */
	public static class CicloContext extends ParserRuleContext {
		/**
		 * Forloop forloop context.
		 *
		 * @return the forloop context
		 */
		public ForloopContext forloop() {
			return getRuleContext(ForloopContext.class,0);
		}

		/**
		 * For each for each context.
		 *
		 * @return the for each context
		 */
		public ForEachContext forEach() {
			return getRuleContext(ForEachContext.class,0);
		}

		/**
		 * Instantiates a new Ciclo context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitCiclo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitCiclo(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Ciclo ciclo context.
	 *
	 * @return the ciclo context
	 * @throws RecognitionException the recognition exception
	 */
	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ciclo);
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				forloop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
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

	/**
	 * The type Forloop context.
	 */
	public static class ForloopContext extends ParserRuleContext {
		/**
		 * For terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode FOR() { return getToken(LinguagemScriptParser.FOR, 0); }

		/**
		 * Parenteses list.
		 *
		 * @return the list
		 */
		public List<ParentesesContext> parenteses() {
			return getRuleContexts(ParentesesContext.class);
		}

		/**
		 * Parenteses parenteses context.
		 *
		 * @param i the
		 * @return the parenteses context
		 */
		public ParentesesContext parenteses(int i) {
			return getRuleContext(ParentesesContext.class,i);
		}

		/**
		 * Variavel list.
		 *
		 * @return the list
		 */
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}

		/**
		 * Variavel variavel context.
		 *
		 * @param i the
		 * @return the variavel context
		 */
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}

		/**
		 * Igual terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode IGUAL() { return getToken(LinguagemScriptParser.IGUAL, 0); }

		/**
		 * Inteiro inteiro context.
		 *
		 * @return the inteiro context
		 */
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}

		/**
		 * Fim instrucao list.
		 *
		 * @return the list
		 */
		public List<TerminalNode> FIM_INSTRUCAO() { return getTokens(LinguagemScriptParser.FIM_INSTRUCAO); }

		/**
		 * Fim instrucao terminal node.
		 *
		 * @param i the
		 * @return the terminal node
		 */
		public TerminalNode FIM_INSTRUCAO(int i) {
			return getToken(LinguagemScriptParser.FIM_INSTRUCAO, i);
		}

		/**
		 * Comparador comparador context.
		 *
		 * @return the comparador context
		 */
		public ComparadorContext comparador() {
			return getRuleContext(ComparadorContext.class,0);
		}

		/**
		 * Valor valor context.
		 *
		 * @return the valor context
		 */
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}

		/**
		 * Condicao andamento condicao andamento context.
		 *
		 * @return the condicao andamento context
		 */
		public Condicao_andamentoContext condicao_andamento() {
			return getRuleContext(Condicao_andamentoContext.class,0);
		}

		/**
		 * Newline list.
		 *
		 * @return the list
		 */
		public List<TerminalNode> NEWLINE() { return getTokens(LinguagemScriptParser.NEWLINE); }

		/**
		 * Newline terminal node.
		 *
		 * @param i the
		 * @return the terminal node
		 */
		public TerminalNode NEWLINE(int i) {
			return getToken(LinguagemScriptParser.NEWLINE, i);
		}

		/**
		 * Expr expr context.
		 *
		 * @return the expr context
		 */
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}

		/**
		 * Endfor terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode ENDFOR() { return getToken(LinguagemScriptParser.ENDFOR, 0); }

		/**
		 * Instantiates a new Forloop context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public ForloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitForloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Forloop forloop context.
	 *
	 * @return the forloop context
	 * @throws RecognitionException the recognition exception
	 */
	public final ForloopContext forloop() throws RecognitionException {
		ForloopContext _localctx = new ForloopContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forloop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(FOR);
			setState(353);
			parenteses();
			setState(354);
			variavel();
			setState(355);
			match(IGUAL);
			setState(356);
			inteiro();
			setState(357);
			match(FIM_INSTRUCAO);
			setState(358);
			variavel();
			setState(359);
			comparador();
			setState(360);
			valor();
			setState(361);
			match(FIM_INSTRUCAO);
			setState(362);
			condicao_andamento();
			setState(363);
			parenteses();
			setState(364);
			match(NEWLINE);
			setState(365);
			expr();
			setState(366);
			match(NEWLINE);
			setState(367);
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

	/**
	 * The type Condicao andamento context.
	 */
	public static class Condicao_andamentoContext extends ParserRuleContext {
		/**
		 * Instantiates a new Condicao andamento context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public Condicao_andamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao_andamento; }

		/**
		 * Instantiates a new Condicao andamento context.
		 */
		public Condicao_andamentoContext() { }

		/**
		 * Copy from.
		 *
		 * @param ctx the ctx
		 */
		public void copyFrom(Condicao_andamentoContext ctx) {
			super.copyFrom(ctx);
		}
	}

	/**
	 * The type Incremento context.
	 */
	public static class IncrementoContext extends Condicao_andamentoContext {
		/**
		 * The First.
		 */
		public VariavelContext first;
		/**
		 * The Second.
		 */
		public Token second;
		/**
		 * The Third.
		 */
		public Token third;

		/**
		 * Variavel variavel context.
		 *
		 * @return the variavel context
		 */
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}

		/**
		 * Soma list.
		 *
		 * @return the list
		 */
		public List<TerminalNode> SOMA() { return getTokens(LinguagemScriptParser.SOMA); }

		/**
		 * Soma terminal node.
		 *
		 * @param i the
		 * @return the terminal node
		 */
		public TerminalNode SOMA(int i) {
			return getToken(LinguagemScriptParser.SOMA, i);
		}

		/**
		 * Instantiates a new Incremento context.
		 *
		 * @param ctx the ctx
		 */
		public IncrementoContext(Condicao_andamentoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitIncremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitIncremento(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * The type Decremento context.
	 */
	public static class DecrementoContext extends Condicao_andamentoContext {
		/**
		 * The First.
		 */
		public VariavelContext first;
		/**
		 * The Second.
		 */
		public Token second;
		/**
		 * The Third.
		 */
		public Token third;

		/**
		 * Variavel variavel context.
		 *
		 * @return the variavel context
		 */
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}

		/**
		 * Subtracao list.
		 *
		 * @return the list
		 */
		public List<TerminalNode> SUBTRACAO() { return getTokens(LinguagemScriptParser.SUBTRACAO); }

		/**
		 * Subtracao terminal node.
		 *
		 * @param i the
		 * @return the terminal node
		 */
		public TerminalNode SUBTRACAO(int i) {
			return getToken(LinguagemScriptParser.SUBTRACAO, i);
		}

		/**
		 * Instantiates a new Decremento context.
		 *
		 * @param ctx the ctx
		 */
		public DecrementoContext(Condicao_andamentoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterDecremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitDecremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitDecremento(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Condicao andamento condicao andamento context.
	 *
	 * @return the condicao andamento context
	 * @throws RecognitionException the recognition exception
	 */
	public final Condicao_andamentoContext condicao_andamento() throws RecognitionException {
		Condicao_andamentoContext _localctx = new Condicao_andamentoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condicao_andamento);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new IncrementoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				((IncrementoContext)_localctx).first = variavel();
				setState(370);
				((IncrementoContext)_localctx).second = match(SOMA);
				setState(371);
				((IncrementoContext)_localctx).third = match(SOMA);
				}
				break;
			case 2:
				_localctx = new DecrementoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				((DecrementoContext)_localctx).first = variavel();
				setState(374);
				((DecrementoContext)_localctx).second = match(SUBTRACAO);
				setState(375);
				((DecrementoContext)_localctx).third = match(SUBTRACAO);
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

	/**
	 * The type For each context.
	 */
	public static class ForEachContext extends ParserRuleContext {
		/**
		 * For terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode FOR() { return getToken(LinguagemScriptParser.FOR, 0); }

		/**
		 * Parenteses list.
		 *
		 * @return the list
		 */
		public List<ParentesesContext> parenteses() {
			return getRuleContexts(ParentesesContext.class);
		}

		/**
		 * Parenteses parenteses context.
		 *
		 * @param i the
		 * @return the parenteses context
		 */
		public ParentesesContext parenteses(int i) {
			return getRuleContext(ParentesesContext.class,i);
		}

		/**
		 * Colecao terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode COLECAO() { return getToken(LinguagemScriptParser.COLECAO, 0); }

		/**
		 * Vazio terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode VAZIO() { return getToken(LinguagemScriptParser.VAZIO, 0); }

		/**
		 * Variavel list.
		 *
		 * @return the list
		 */
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}

		/**
		 * Variavel variavel context.
		 *
		 * @param i the
		 * @return the variavel context
		 */
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}

		/**
		 * Newline list.
		 *
		 * @return the list
		 */
		public List<TerminalNode> NEWLINE() { return getTokens(LinguagemScriptParser.NEWLINE); }

		/**
		 * Newline terminal node.
		 *
		 * @param i the
		 * @return the terminal node
		 */
		public TerminalNode NEWLINE(int i) {
			return getToken(LinguagemScriptParser.NEWLINE, i);
		}

		/**
		 * Expr expr context.
		 *
		 * @return the expr context
		 */
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}

		/**
		 * Endfor terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode ENDFOR() { return getToken(LinguagemScriptParser.ENDFOR, 0); }

		/**
		 * Instantiates a new For each context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public ForEachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterForEach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitForEach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitForEach(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * For each for each context.
	 *
	 * @return the for each context
	 * @throws RecognitionException the recognition exception
	 */
	public final ForEachContext forEach() throws RecognitionException {
		ForEachContext _localctx = new ForEachContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forEach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(FOR);
			setState(380);
			parenteses();
			setState(381);
			match(COLECAO);
			setState(382);
			match(VAZIO);
			setState(383);
			variavel();
			setState(384);
			match(T__4);
			setState(385);
			variavel();
			setState(386);
			parenteses();
			setState(387);
			match(NEWLINE);
			setState(388);
			expr();
			setState(389);
			match(NEWLINE);
			setState(390);
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

	/**
	 * The type Funcoes especiais context.
	 */
	public static class FuncoesEspeciaisContext extends ParserRuleContext {
		/**
		 * Ler ficheiro terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode LER_FICHEIRO() { return getToken(LinguagemScriptParser.LER_FICHEIRO, 0); }

		/**
		 * Nome ficheiro nome ficheiro context.
		 *
		 * @return the nome ficheiro context
		 */
		public Nome_ficheiroContext nome_ficheiro() {
			return getRuleContext(Nome_ficheiroContext.class,0);
		}

		/**
		 * Envio email envio email context.
		 *
		 * @return the envio email context
		 */
		public EnvioEmailContext envioEmail() {
			return getRuleContext(EnvioEmailContext.class,0);
		}

		/**
		 * Instantiates a new Funcoes especiais context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public FuncoesEspeciaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcoesEspeciais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterFuncoesEspeciais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitFuncoesEspeciais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitFuncoesEspeciais(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Funcoes especiais funcoes especiais context.
	 *
	 * @return the funcoes especiais context
	 * @throws RecognitionException the recognition exception
	 */
	public final FuncoesEspeciaisContext funcoesEspeciais() throws RecognitionException {
		FuncoesEspeciaisContext _localctx = new FuncoesEspeciaisContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_funcoesEspeciais);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LER_FICHEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(LER_FICHEIRO);
				setState(393);
				match(T__0);
				setState(394);
				nome_ficheiro();
				setState(395);
				match(T__1);
				}
				break;
			case EMAIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				envioEmail();
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

	/**
	 * The type Nome ficheiro context.
	 */
	public static class Nome_ficheiroContext extends ParserRuleContext {
		/**
		 * Palavra palavra context.
		 *
		 * @return the palavra context
		 */
		public PalavraContext palavra() {
			return getRuleContext(PalavraContext.class,0);
		}

		/**
		 * Ponto final terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode PONTO_FINAL() { return getToken(LinguagemScriptParser.PONTO_FINAL, 0); }

		/**
		 * Extensao terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode EXTENSAO() { return getToken(LinguagemScriptParser.EXTENSAO, 0); }

		/**
		 * Instantiates a new Nome ficheiro context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public Nome_ficheiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome_ficheiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterNome_ficheiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitNome_ficheiro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitNome_ficheiro(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Nome ficheiro nome ficheiro context.
	 *
	 * @return the nome ficheiro context
	 * @throws RecognitionException the recognition exception
	 */
	public final Nome_ficheiroContext nome_ficheiro() throws RecognitionException {
		Nome_ficheiroContext _localctx = new Nome_ficheiroContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_nome_ficheiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			palavra();
			setState(401);
			match(PONTO_FINAL);
			setState(402);
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

	/**
	 * The type Envio email context.
	 */
	public static class EnvioEmailContext extends ParserRuleContext {
		/**
		 * Instantiates a new Envio email context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public EnvioEmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_envioEmail; }

		/**
		 * Instantiates a new Envio email context.
		 */
		public EnvioEmailContext() { }

		/**
		 * Copy from.
		 *
		 * @param ctx the ctx
		 */
		public void copyFrom(EnvioEmailContext ctx) {
			super.copyFrom(ctx);
		}
	}

	/**
	 * The type Enviar email context.
	 */
	public static class EnviarEmailContext extends EnvioEmailContext {
		/**
		 * The Left.
		 */
		public ListaDestinatariosContext left;
		/**
		 * The Middle.
		 */
		public AssuntoContext middle;
		/**
		 * The Right.
		 */
		public MensagemContext right;

		/**
		 * Newline list.
		 *
		 * @return the list
		 */
		public List<TerminalNode> NEWLINE() { return getTokens(LinguagemScriptParser.NEWLINE); }

		/**
		 * Newline terminal node.
		 *
		 * @param i the
		 * @return the terminal node
		 */
		public TerminalNode NEWLINE(int i) {
			return getToken(LinguagemScriptParser.NEWLINE, i);
		}

		/**
		 * Lista destinatarios lista destinatarios context.
		 *
		 * @return the lista destinatarios context
		 */
		public ListaDestinatariosContext listaDestinatarios() {
			return getRuleContext(ListaDestinatariosContext.class,0);
		}

		/**
		 * Assunto assunto context.
		 *
		 * @return the assunto context
		 */
		public AssuntoContext assunto() {
			return getRuleContext(AssuntoContext.class,0);
		}

		/**
		 * Mensagem mensagem context.
		 *
		 * @return the mensagem context
		 */
		public MensagemContext mensagem() {
			return getRuleContext(MensagemContext.class,0);
		}

		/**
		 * Instantiates a new Enviar email context.
		 *
		 * @param ctx the ctx
		 */
		public EnviarEmailContext(EnvioEmailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterEnviarEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitEnviarEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitEnviarEmail(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Envio email envio email context.
	 *
	 * @return the envio email context
	 * @throws RecognitionException the recognition exception
	 */
	public final EnvioEmailContext envioEmail() throws RecognitionException {
		EnvioEmailContext _localctx = new EnvioEmailContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_envioEmail);
		try {
			_localctx = new EnviarEmailContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			((EnviarEmailContext)_localctx).left = listaDestinatarios();
			setState(405);
			match(NEWLINE);
			setState(406);
			((EnviarEmailContext)_localctx).middle = assunto();
			setState(407);
			match(NEWLINE);
			setState(408);
			((EnviarEmailContext)_localctx).right = mensagem();
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

	/**
	 * The type Lista destinatarios context.
	 */
	public static class ListaDestinatariosContext extends ParserRuleContext {
		/**
		 * Email terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode EMAIL() { return getToken(LinguagemScriptParser.EMAIL, 0); }

		/**
		 * Newline terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode NEWLINE() { return getToken(LinguagemScriptParser.NEWLINE, 0); }

		/**
		 * Lista destinatarios lista destinatarios context.
		 *
		 * @return the lista destinatarios context
		 */
		public ListaDestinatariosContext listaDestinatarios() {
			return getRuleContext(ListaDestinatariosContext.class,0);
		}

		/**
		 * Instantiates a new Lista destinatarios context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public ListaDestinatariosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDestinatarios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterListaDestinatarios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitListaDestinatarios(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitListaDestinatarios(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Lista destinatarios lista destinatarios context.
	 *
	 * @return the lista destinatarios context
	 * @throws RecognitionException the recognition exception
	 */
	public final ListaDestinatariosContext listaDestinatarios() throws RecognitionException {
		ListaDestinatariosContext _localctx = new ListaDestinatariosContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_listaDestinatarios);
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(EMAIL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(EMAIL);
				setState(412);
				match(NEWLINE);
				setState(413);
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

	/**
	 * The type Assunto context.
	 */
	public static class AssuntoContext extends ParserRuleContext {
		/**
		 * Palavras palavras context.
		 *
		 * @return the palavras context
		 */
		public PalavrasContext palavras() {
			return getRuleContext(PalavrasContext.class,0);
		}

		/**
		 * Instantiates a new Assunto context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public AssuntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assunto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterAssunto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitAssunto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitAssunto(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Assunto assunto context.
	 *
	 * @return the assunto context
	 * @throws RecognitionException the recognition exception
	 */
	public final AssuntoContext assunto() throws RecognitionException {
		AssuntoContext _localctx = new AssuntoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_assunto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__5);
			setState(417);
			palavras();
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

	/**
	 * The type Mensagem context.
	 */
	public static class MensagemContext extends ParserRuleContext {
		/**
		 * Palavras palavras context.
		 *
		 * @return the palavras context
		 */
		public PalavrasContext palavras() {
			return getRuleContext(PalavrasContext.class,0);
		}

		/**
		 * Instantiates a new Mensagem context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public MensagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mensagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterMensagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitMensagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitMensagem(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Mensagem mensagem context.
	 *
	 * @return the mensagem context
	 * @throws RecognitionException the recognition exception
	 */
	public final MensagemContext mensagem() throws RecognitionException {
		MensagemContext _localctx = new MensagemContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_mensagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__6);
			setState(420);
			palavras();
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

	/**
	 * The type Palavras context.
	 */
	public static class PalavrasContext extends ParserRuleContext {
		/**
		 * Palavra palavra context.
		 *
		 * @return the palavra context
		 */
		public PalavraContext palavra() {
			return getRuleContext(PalavraContext.class,0);
		}

		/**
		 * Vazio terminal node.
		 *
		 * @return the terminal node
		 */
		public TerminalNode VAZIO() { return getToken(LinguagemScriptParser.VAZIO, 0); }

		/**
		 * Palavras palavras context.
		 *
		 * @return the palavras context
		 */
		public PalavrasContext palavras() {
			return getRuleContext(PalavrasContext.class,0);
		}

		/**
		 * Instantiates a new Palavras context.
		 *
		 * @param parent        the parent
		 * @param invokingState the invoking state
		 */
		public PalavrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_palavras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).enterPalavras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LinguagemScriptListener ) ((LinguagemScriptListener)listener).exitPalavras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LinguagemScriptVisitor ) return ((LinguagemScriptVisitor<? extends T>)visitor).visitPalavras(this);
			else return visitor.visitChildren(this);
		}
	}

	/**
	 * Palavras palavras context.
	 *
	 * @return the palavras context
	 * @throws RecognitionException the recognition exception
	 */
	public final PalavrasContext palavras() throws RecognitionException {
		PalavrasContext _localctx = new PalavrasContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_palavras);
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				palavra();
				setState(423);
				match(VAZIO);
				setState(424);
				palavras();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				palavra();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
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

	/**
	 * The constant _serializedATN.
	 */
	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u01b0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2V\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3t\n\3\3\4\3"+
		"\4\3\4\3\4\5\4z\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u0083\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u008a\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u00aa\n\b\3\t\3\t\3\t\3\n\3\n\5\n\u00b1\n\n\3\13\3\13\3\13"+
		"\3\13\5\13\u00b7\n\13\3\f\3\f\5\f\u00bb\n\f\3\r\3\r\6\r\u00bf\n\r\r\r"+
		"\16\r\u00c0\3\r\3\r\3\16\3\16\3\16\5\16\u00c8\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00cf\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\5\22\u00db\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00e5\n"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u00fa\n\27\3\30\3\30\3\30\5\30\u00ff"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30"+
		"\u010d\n\30\f\30\16\30\u0110\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u0155\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\5\35\u0161\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u017c\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3!\3!\5!\u0191\n!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3"+
		"$\3$\3$\5$\u01a1\n$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\5\'\u01ae\n"+
		"\'\3\'\2\3.(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJL\2\5\3\2\f\r\3\2\3\6\4\2\22\22!%\2\u01bb\2U\3\2\2\2\4s\3"+
		"\2\2\2\6y\3\2\2\2\b{\3\2\2\2\n\u0082\3\2\2\2\f\u0089\3\2\2\2\16\u00a9"+
		"\3\2\2\2\20\u00ab\3\2\2\2\22\u00b0\3\2\2\2\24\u00b6\3\2\2\2\26\u00ba\3"+
		"\2\2\2\30\u00bc\3\2\2\2\32\u00c7\3\2\2\2\34\u00ce\3\2\2\2\36\u00d0\3\2"+
		"\2\2 \u00d4\3\2\2\2\"\u00da\3\2\2\2$\u00dc\3\2\2\2&\u00e4\3\2\2\2(\u00e6"+
		"\3\2\2\2*\u00e8\3\2\2\2,\u00f9\3\2\2\2.\u00fe\3\2\2\2\60\u0154\3\2\2\2"+
		"\62\u0156\3\2\2\2\64\u0158\3\2\2\2\66\u015c\3\2\2\28\u0160\3\2\2\2:\u0162"+
		"\3\2\2\2<\u017b\3\2\2\2>\u017d\3\2\2\2@\u0190\3\2\2\2B\u0192\3\2\2\2D"+
		"\u0196\3\2\2\2F\u01a0\3\2\2\2H\u01a2\3\2\2\2J\u01a5\3\2\2\2L\u01ad\3\2"+
		"\2\2NO\5\4\3\2OP\7\2\2\3PV\3\2\2\2QR\5\4\3\2RS\7\16\2\2ST\7\2\2\3TV\3"+
		"\2\2\2UN\3\2\2\2UQ\3\2\2\2V\3\3\2\2\2WX\5\6\4\2XY\7\16\2\2YZ\5\4\3\2Z"+
		"t\3\2\2\2[\\\5*\26\2\\]\7\16\2\2]^\5\4\3\2^t\3\2\2\2_`\58\35\2`a\7\16"+
		"\2\2ab\5\4\3\2bt\3\2\2\2cd\5\60\31\2de\7\16\2\2ef\5\4\3\2ft\3\2\2\2gh"+
		"\5<\37\2hi\7\26\2\2ij\7\16\2\2jk\5\4\3\2kt\3\2\2\2lt\5\6\4\2mt\5*\26\2"+
		"nt\58\35\2ot\5\60\31\2pq\5<\37\2qr\7\26\2\2rt\3\2\2\2sW\3\2\2\2s[\3\2"+
		"\2\2s_\3\2\2\2sc\3\2\2\2sg\3\2\2\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2"+
		"\2\2sp\3\2\2\2t\5\3\2\2\2uv\5\b\5\2vw\5\6\4\2wz\3\2\2\2xz\3\2\2\2yu\3"+
		"\2\2\2yx\3\2\2\2z\7\3\2\2\2{|\5\n\6\2|}\5\f\7\2}~\7\26\2\2~\t\3\2\2\2"+
		"\177\u0080\7\n\2\2\u0080\u0083\7\13\2\2\u0081\u0083\7\13\2\2\u0082\177"+
		"\3\2\2\2\u0082\u0081\3\2\2\2\u0083\13\3\2\2\2\u0084\u0085\5\16\b\2\u0085"+
		"\u0086\7\24\2\2\u0086\u0087\5\f\7\2\u0087\u008a\3\2\2\2\u0088\u008a\5"+
		"\16\b\2\u0089\u0084\3\2\2\2\u0089\u0088\3\2\2\2\u008a\r\3\2\2\2\u008b"+
		"\u00aa\5\20\t\2\u008c\u008d\5\20\t\2\u008d\u008e\7\22\2\2\u008e\u008f"+
		"\5\22\n\2\u008f\u00aa\3\2\2\2\u0090\u0091\5\20\t\2\u0091\u0092\7\22\2"+
		"\2\u0092\u0093\5\20\t\2\u0093\u00aa\3\2\2\2\u0094\u00aa\7\f\2\2\u0095"+
		"\u0096\7\f\2\2\u0096\u0097\7\22\2\2\u0097\u00aa\5\22\n\2\u0098\u0099\7"+
		"\f\2\2\u0099\u009a\7\22\2\2\u009a\u00aa\5\20\t\2\u009b\u009c\5\20\t\2"+
		"\u009c\u009d\7\23\2\2\u009d\u009e\5\22\n\2\u009e\u00aa\3\2\2\2\u009f\u00a0"+
		"\5\20\t\2\u00a0\u00a1\7\23\2\2\u00a1\u00a2\5\20\t\2\u00a2\u00aa\3\2\2"+
		"\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\7\23\2\2\u00a5\u00aa\5\22\n\2\u00a6"+
		"\u00a7\7\f\2\2\u00a7\u00a8\7\23\2\2\u00a8\u00aa\5\20\t\2\u00a9\u008b\3"+
		"\2\2\2\u00a9\u008c\3\2\2\2\u00a9\u0090\3\2\2\2\u00a9\u0094\3\2\2\2\u00a9"+
		"\u0095\3\2\2\2\u00a9\u0098\3\2\2\2\u00a9\u009b\3\2\2\2\u00a9\u009f\3\2"+
		"\2\2\u00a9\u00a3\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa\17\3\2\2\2\u00ab\u00ac"+
		"\7\f\2\2\u00ac\u00ad\5\"\22\2\u00ad\21\3\2\2\2\u00ae\u00b1\5\24\13\2\u00af"+
		"\u00b1\5\26\f\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\23\3\2\2"+
		"\2\u00b2\u00b7\5\30\r\2\u00b3\u00b7\5\20\t\2\u00b4\u00b7\5\36\20\2\u00b5"+
		"\u00b7\7\f\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b5\3\2\2\2\u00b7\25\3\2\2\2\u00b8\u00bb\5\32\16\2\u00b9"+
		"\u00bb\5\34\17\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\27\3\2"+
		"\2\2\u00bc\u00be\7\17\2\2\u00bd\u00bf\7\f\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\7\17\2\2\u00c3\31\3\2\2\2\u00c4\u00c5\7\r\2\2\u00c5\u00c8"+
		"\5\32\16\2\u00c6\u00c8\7\r\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c8\33\3\2\2\2\u00c9\u00ca\5\32\16\2\u00ca\u00cb\7\25\2\2\u00cb\u00cc"+
		"\5\32\16\2\u00cc\u00cf\3\2\2\2\u00cd\u00cf\5$\23\2\u00ce\u00c9\3\2\2\2"+
		"\u00ce\u00cd\3\2\2\2\u00cf\35\3\2\2\2\u00d0\u00d1\7\20\2\2\u00d1\u00d2"+
		"\7\f\2\2\u00d2\u00d3\7\20\2\2\u00d3\37\3\2\2\2\u00d4\u00d5\t\2\2\2\u00d5"+
		"!\3\2\2\2\u00d6\u00d7\5 \21\2\u00d7\u00d8\5\"\22\2\u00d8\u00db\3\2\2\2"+
		"\u00d9\u00db\5 \21\2\u00da\u00d6\3\2\2\2\u00da\u00d9\3\2\2\2\u00db#\3"+
		"\2\2\2\u00dc\u00dd\5&\24\2\u00dd\u00de\5(\25\2\u00de%\3\2\2\2\u00df\u00e5"+
		"\5\32\16\2\u00e0\u00e1\5\32\16\2\u00e1\u00e2\7\25\2\2\u00e2\u00e3\5\32"+
		"\16\2\u00e3\u00e5\3\2\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e5"+
		"\'\3\2\2\2\u00e6\u00e7\5\32\16\2\u00e7)\3\2\2\2\u00e8\u00e9\5,\27\2\u00e9"+
		"\u00ea\5.\30\2\u00ea+\3\2\2\2\u00eb\u00ec\5\20\t\2\u00ec\u00ed\7\22\2"+
		"\2\u00ed\u00ee\5.\30\2\u00ee\u00fa\3\2\2\2\u00ef\u00f0\7\f\2\2\u00f0\u00f1"+
		"\7\22\2\2\u00f1\u00fa\5.\30\2\u00f2\u00f3\5\20\t\2\u00f3\u00f4\7\23\2"+
		"\2\u00f4\u00f5\5.\30\2\u00f5\u00fa\3\2\2\2\u00f6\u00f7\7\f\2\2\u00f7\u00f8"+
		"\7\23\2\2\u00f8\u00fa\5.\30\2\u00f9\u00eb\3\2\2\2\u00f9\u00ef\3\2\2\2"+
		"\u00f9\u00f2\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa-\3\2\2\2\u00fb\u00fc\b"+
		"\30\1\2\u00fc\u00ff\5\22\n\2\u00fd\u00ff\7\26\2\2\u00fe\u00fb\3\2\2\2"+
		"\u00fe\u00fd\3\2\2\2\u00ff\u010e\3\2\2\2\u0100\u0101\f\b\2\2\u0101\u0102"+
		"\7\31\2\2\u0102\u010d\5.\30\t\u0103\u0104\f\7\2\2\u0104\u0105\7\32\2\2"+
		"\u0105\u010d\5.\30\b\u0106\u0107\f\6\2\2\u0107\u0108\7\34\2\2\u0108\u010d"+
		"\5.\30\7\u0109\u010a\f\5\2\2\u010a\u010b\7\33\2\2\u010b\u010d\5.\30\6"+
		"\u010c\u0100\3\2\2\2\u010c\u0103\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u0109"+
		"\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		"/\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\35\2\2\u0112\u0113\5\62\32"+
		"\2\u0113\u0114\5\64\33\2\u0114\u0115\5\62\32\2\u0115\u0116\7\27\2\2\u0116"+
		"\u0117\7\37\2\2\u0117\u0118\7\16\2\2\u0118\u0119\5\4\3\2\u0119\u011a\7"+
		"\16\2\2\u011a\u011b\7 \2\2\u011b\u0155\3\2\2\2\u011c\u011d\7\35\2\2\u011d"+
		"\u011e\5\62\32\2\u011e\u011f\5\64\33\2\u011f\u0120\5\62\32\2\u0120\u0121"+
		"\7\16\2\2\u0121\u0122\7\37\2\2\u0122\u0123\5\4\3\2\u0123\u0124\7\16\2"+
		"\2\u0124\u0125\7 \2\2\u0125\u0155\3\2\2\2\u0126\u0127\7\35\2\2\u0127\u0128"+
		"\5\62\32\2\u0128\u0129\5\64\33\2\u0129\u012a\5\62\32\2\u012a\u012b\7\37"+
		"\2\2\u012b\u012c\5\4\3\2\u012c\u012d\7\16\2\2\u012d\u012e\7\36\2\2\u012e"+
		"\u012f\5\60\31\2\u012f\u0155\3\2\2\2\u0130\u0131\7\35\2\2\u0131\u0132"+
		"\5\62\32\2\u0132\u0133\5\64\33\2\u0133\u0134\5\62\32\2\u0134\u0135\7\37"+
		"\2\2\u0135\u0136\5\4\3\2\u0136\u0137\7\27\2\2\u0137\u0138\7\36\2\2\u0138"+
		"\u0139\5\60\31\2\u0139\u0155\3\2\2\2\u013a\u013b\7\35\2\2\u013b\u013c"+
		"\5\62\32\2\u013c\u013d\5\64\33\2\u013d\u013e\5\62\32\2\u013e\u013f\7\16"+
		"\2\2\u013f\u0140\7\37\2\2\u0140\u0141\5\4\3\2\u0141\u0142\7\16\2\2\u0142"+
		"\u0143\7\36\2\2\u0143\u0144\5\4\3\2\u0144\u0145\7\16\2\2\u0145\u0146\7"+
		" \2\2\u0146\u0155\3\2\2\2\u0147\u0148\7\35\2\2\u0148\u0149\5\62\32\2\u0149"+
		"\u014a\5\64\33\2\u014a\u014b\5\62\32\2\u014b\u014c\7\27\2\2\u014c\u014d"+
		"\7\37\2\2\u014d\u014e\5\4\3\2\u014e\u014f\7\16\2\2\u014f\u0150\7\36\2"+
		"\2\u0150\u0151\5\4\3\2\u0151\u0152\7\16\2\2\u0152\u0153\7 \2\2\u0153\u0155"+
		"\3\2\2\2\u0154\u0111\3\2\2\2\u0154\u011c\3\2\2\2\u0154\u0126\3\2\2\2\u0154"+
		"\u0130\3\2\2\2\u0154\u013a\3\2\2\2\u0154\u0147\3\2\2\2\u0155\61\3\2\2"+
		"\2\u0156\u0157\t\3\2\2\u0157\63\3\2\2\2\u0158\u0159\5\22\n\2\u0159\u015a"+
		"\5\66\34\2\u015a\u015b\5\22\n\2\u015b\65\3\2\2\2\u015c\u015d\t\4\2\2\u015d"+
		"\67\3\2\2\2\u015e\u0161\5:\36\2\u015f\u0161\5> \2\u0160\u015e\3\2\2\2"+
		"\u0160\u015f\3\2\2\2\u01619\3\2\2\2\u0162\u0163\7&\2\2\u0163\u0164\5\62"+
		"\32\2\u0164\u0165\5\16\b\2\u0165\u0166\7\22\2\2\u0166\u0167\5\32\16\2"+
		"\u0167\u0168\7\26\2\2\u0168\u0169\5\16\b\2\u0169\u016a\5\66\34\2\u016a"+
		"\u016b\5\22\n\2\u016b\u016c\7\26\2\2\u016c\u016d\5<\37\2\u016d\u016e\5"+
		"\62\32\2\u016e\u016f\7\16\2\2\u016f\u0170\5\4\3\2\u0170\u0171\7\16\2\2"+
		"\u0171\u0172\7\'\2\2\u0172;\3\2\2\2\u0173\u0174\5\16\b\2\u0174\u0175\7"+
		"\31\2\2\u0175\u0176\7\31\2\2\u0176\u017c\3\2\2\2\u0177\u0178\5\16\b\2"+
		"\u0178\u0179\7\32\2\2\u0179\u017a\7\32\2\2\u017a\u017c\3\2\2\2\u017b\u0173"+
		"\3\2\2\2\u017b\u0177\3\2\2\2\u017c=\3\2\2\2\u017d\u017e\7&\2\2\u017e\u017f"+
		"\5\62\32\2\u017f\u0180\7(\2\2\u0180\u0181\7\27\2\2\u0181\u0182\5\16\b"+
		"\2\u0182\u0183\7\7\2\2\u0183\u0184\5\16\b\2\u0184\u0185\5\62\32\2\u0185"+
		"\u0186\7\16\2\2\u0186\u0187\5\4\3\2\u0187\u0188\7\16\2\2\u0188\u0189\7"+
		"\'\2\2\u0189?\3\2\2\2\u018a\u018b\7)\2\2\u018b\u018c\7\3\2\2\u018c\u018d"+
		"\5B\"\2\u018d\u018e\7\4\2\2\u018e\u0191\3\2\2\2\u018f\u0191\5D#\2\u0190"+
		"\u018a\3\2\2\2\u0190\u018f\3\2\2\2\u0191A\3\2\2\2\u0192\u0193\5\30\r\2"+
		"\u0193\u0194\7\25\2\2\u0194\u0195\7*\2\2\u0195C\3\2\2\2\u0196\u0197\5"+
		"F$\2\u0197\u0198\7\16\2\2\u0198\u0199\5H%\2\u0199\u019a\7\16\2\2\u019a"+
		"\u019b\5J&\2\u019bE\3\2\2\2\u019c\u01a1\7+\2\2\u019d\u019e\7+\2\2\u019e"+
		"\u019f\7\16\2\2\u019f\u01a1\5F$\2\u01a0\u019c\3\2\2\2\u01a0\u019d\3\2"+
		"\2\2\u01a1G\3\2\2\2\u01a2\u01a3\7\b\2\2\u01a3\u01a4\5L\'\2\u01a4I\3\2"+
		"\2\2\u01a5\u01a6\7\t\2\2\u01a6\u01a7\5L\'\2\u01a7K\3\2\2\2\u01a8\u01a9"+
		"\5\30\r\2\u01a9\u01aa\7\27\2\2\u01aa\u01ab\5L\'\2\u01ab\u01ae\3\2\2\2"+
		"\u01ac\u01ae\5\30\r\2\u01ad\u01a8\3\2\2\2\u01ad\u01ac\3\2\2\2\u01aeM\3"+
		"\2\2\2\32Usy\u0082\u0089\u00a9\u00b0\u00b6\u00ba\u00c0\u00c7\u00ce\u00da"+
		"\u00e4\u00f9\u00fe\u010c\u010e\u0154\u0160\u017b\u0190\u01a0\u01ad";
	/**
	 * The constant _ATN.
	 */
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}