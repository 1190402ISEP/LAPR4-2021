// Generated from E:/Nova pasta/LPROG/src/main/java\Linguagem.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinguagemLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "MODIFICADOR", 
			"TIPO", "LETRA", "DIGITO", "NEWLINE", "ASPAS", "PELICA", "EXPO", "IGUAL", 
			"IGUAL_ESPACO", "VIRGULA", "PONTO_FINAL", "FIM_INSTRUCAO", "VAZIO", "DOIS_PONTOS", 
			"SOMA", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO", "IF", "ELSE", "THEN", 
			"ENDIF", "MAIOR", "MENOR", "MENOR_IGUAL", "MAIOR_IGUAL", "DIFERENTE", 
			"FOR", "ENDFOR", "COLECAO", "LER_FICHEIRO", "EXTENSAO", "EMAIL", "ASSUNTO", 
			"MENSAGEM"
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


	public LinguagemLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Linguagem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 41:
			EMAIL_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			ASSUNTO_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			MENSAGEM_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void EMAIL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			2,6
			break;
		}
	}
	private void ASSUNTO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			1,15
			break;
		}
	}
	private void MENSAGEM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			1,300
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u01b8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0086\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b0\n\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\5\21\u00c0\n"+
		"\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00cb\n\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00dd\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00e7"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f1\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00fb\n\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u0105\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$"+
		"\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u018e\n(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\5*\u01a2\n*\3+\6"+
		"+\u01a5\n+\r+\16+\u01a6\3+\3+\6+\u01ab\n+\r+\16+\u01ac\3+\3+\3+\3+\3,"+
		"\3,\3,\3-\3-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.\3\2\b\4\2C\\c|\3"+
		"\2\62;\b\2\'\'--/\60\62;aac|\5\2/\60\62;c|\3\2c|\5\2\62;C\\c|\2\u01da"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7_\3\2\2\2\ta\3"+
		"\2\2\2\13c\3\2\2\2\re\3\2\2\2\17g\3\2\2\2\21k\3\2\2\2\23\u0085\3\2\2\2"+
		"\25\u00af\3\2\2\2\27\u00b1\3\2\2\2\31\u00b3\3\2\2\2\33\u00b5\3\2\2\2\35"+
		"\u00b7\3\2\2\2\37\u00b9\3\2\2\2!\u00bf\3\2\2\2#\u00c1\3\2\2\2%\u00ca\3"+
		"\2\2\2\'\u00cc\3\2\2\2)\u00ce\3\2\2\2+\u00d0\3\2\2\2-\u00d2\3\2\2\2/\u00dc"+
		"\3\2\2\2\61\u00e6\3\2\2\2\63\u00f0\3\2\2\2\65\u00fa\3\2\2\2\67\u0104\3"+
		"\2\2\29\u0106\3\2\2\2;\u0109\3\2\2\2=\u010e\3\2\2\2?\u0113\3\2\2\2A\u0119"+
		"\3\2\2\2C\u011b\3\2\2\2E\u011d\3\2\2\2G\u0120\3\2\2\2I\u0123\3\2\2\2K"+
		"\u0126\3\2\2\2M\u012a\3\2\2\2O\u018d\3\2\2\2Q\u018f\3\2\2\2S\u01a1\3\2"+
		"\2\2U\u01a4\3\2\2\2W\u01b2\3\2\2\2Y\u01b5\3\2\2\2[\\\7*\2\2\\\4\3\2\2"+
		"\2]^\7+\2\2^\6\3\2\2\2_`\7]\2\2`\b\3\2\2\2ab\7_\2\2b\n\3\2\2\2cd\7}\2"+
		"\2d\f\3\2\2\2ef\7\177\2\2f\16\3\2\2\2gh\7\"\2\2hi\7<\2\2ij\7\"\2\2j\20"+
		"\3\2\2\2kl\7R\2\2lm\7T\2\2mn\7K\2\2no\7P\2\2op\7V\2\2p\22\3\2\2\2qr\7"+
		"e\2\2rs\7w\2\2st\7t\2\2tu\7v\2\2uv\7q\2\2v\u0086\7\"\2\2wx\7n\2\2xy\7"+
		"q\2\2yz\7p\2\2z{\7i\2\2{\u0086\7q\2\2|}\7u\2\2}~\7g\2\2~\177\7o\2\2\177"+
		"\u0080\7a\2\2\u0080\u0081\7u\2\2\u0081\u0082\7k\2\2\u0082\u0083\7p\2\2"+
		"\u0083\u0084\7c\2\2\u0084\u0086\7n\2\2\u0085q\3\2\2\2\u0085w\3\2\2\2\u0085"+
		"|\3\2\2\2\u0086\24\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089\7p\2\2\u0089"+
		"\u008a\7v\2\2\u008a\u008b\7g\2\2\u008b\u008c\7k\2\2\u008c\u008d\7t\2\2"+
		"\u008d\u008e\7q\2\2\u008e\u00b0\7\"\2\2\u008f\u0090\7e\2\2\u0090\u0091"+
		"\7c\2\2\u0091\u0092\7t\2\2\u0092\u0093\7c\2\2\u0093\u0094\7e\2\2\u0094"+
		"\u0095\7v\2\2\u0095\u0096\7g\2\2\u0096\u0097\7t\2\2\u0097\u00b0\7\"\2"+
		"\2\u0098\u0099\7t\2\2\u0099\u009a\7g\2\2\u009a\u009b\7c\2\2\u009b\u009c"+
		"\7n\2\2\u009c\u009d\7a\2\2\u009d\u009e\7h\2\2\u009e\u009f\7n\2\2\u009f"+
		"\u00a0\7q\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7v\2\2\u00a2\u00b0\7\"\2"+
		"\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7"+
		"\7n\2\2\u00a7\u00b0\7\"\2\2\u00a8\u00a9\7U\2\2\u00a9\u00aa\7v\2\2\u00aa"+
		"\u00ab\7t\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7i\2\2"+
		"\u00ae\u00b0\7\"\2\2\u00af\u0087\3\2\2\2\u00af\u008f\3\2\2\2\u00af\u0098"+
		"\3\2\2\2\u00af\u00a3\3\2\2\2\u00af\u00a8\3\2\2\2\u00b0\26\3\2\2\2\u00b1"+
		"\u00b2\t\2\2\2\u00b2\30\3\2\2\2\u00b3\u00b4\t\3\2\2\u00b4\32\3\2\2\2\u00b5"+
		"\u00b6\7\f\2\2\u00b6\34\3\2\2\2\u00b7\u00b8\7$\2\2\u00b8\36\3\2\2\2\u00b9"+
		"\u00ba\7)\2\2\u00ba \3\2\2\2\u00bb\u00bc\7g\2\2\u00bc\u00c0\7/\2\2\u00bd"+
		"\u00be\7g\2\2\u00be\u00c0\7-\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bd\3\2\2"+
		"\2\u00c0\"\3\2\2\2\u00c1\u00c2\7?\2\2\u00c2$\3\2\2\2\u00c3\u00c4\7\"\2"+
		"\2\u00c4\u00cb\7?\2\2\u00c5\u00c6\7?\2\2\u00c6\u00cb\7\"\2\2\u00c7\u00c8"+
		"\7\"\2\2\u00c8\u00c9\7?\2\2\u00c9\u00cb\7\"\2\2\u00ca\u00c3\3\2\2\2\u00ca"+
		"\u00c5\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb&\3\2\2\2\u00cc\u00cd\7.\2\2\u00cd"+
		"(\3\2\2\2\u00ce\u00cf\7\60\2\2\u00cf*\3\2\2\2\u00d0\u00d1\7=\2\2\u00d1"+
		",\3\2\2\2\u00d2\u00d3\7\"\2\2\u00d3.\3\2\2\2\u00d4\u00dd\7<\2\2\u00d5"+
		"\u00d6\7\"\2\2\u00d6\u00d7\7<\2\2\u00d7\u00dd\7\"\2\2\u00d8\u00d9\7<\2"+
		"\2\u00d9\u00dd\7\"\2\2\u00da\u00db\7\"\2\2\u00db\u00dd\7<\2\2\u00dc\u00d4"+
		"\3\2\2\2\u00dc\u00d5\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\60\3\2\2\2\u00de\u00e7\7-\2\2\u00df\u00e0\7-\2\2\u00e0\u00e7\7\"\2\2"+
		"\u00e1\u00e2\7\"\2\2\u00e2\u00e7\7-\2\2\u00e3\u00e4\7\"\2\2\u00e4\u00e5"+
		"\7-\2\2\u00e5\u00e7\7\"\2\2\u00e6\u00de\3\2\2\2\u00e6\u00df\3\2\2\2\u00e6"+
		"\u00e1\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\62\3\2\2\2\u00e8\u00f1\7/\2\2"+
		"\u00e9\u00ea\7/\2\2\u00ea\u00f1\7\"\2\2\u00eb\u00ec\7\"\2\2\u00ec\u00f1"+
		"\7/\2\2\u00ed\u00ee\7\"\2\2\u00ee\u00ef\7/\2\2\u00ef\u00f1\7\"\2\2\u00f0"+
		"\u00e8\3\2\2\2\u00f0\u00e9\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ed\3\2"+
		"\2\2\u00f1\64\3\2\2\2\u00f2\u00fb\7,\2\2\u00f3\u00f4\7,\2\2\u00f4\u00fb"+
		"\7\"\2\2\u00f5\u00f6\7\"\2\2\u00f6\u00fb\7,\2\2\u00f7\u00f8\7\"\2\2\u00f8"+
		"\u00f9\7,\2\2\u00f9\u00fb\7\"\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00f3\3\2"+
		"\2\2\u00fa\u00f5\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fb\66\3\2\2\2\u00fc\u0105"+
		"\7\61\2\2\u00fd\u00fe\7\61\2\2\u00fe\u0105\7\"\2\2\u00ff\u0100\7\"\2\2"+
		"\u0100\u0105\7\61\2\2\u0101\u0102\7\"\2\2\u0102\u0103\7\61\2\2\u0103\u0105"+
		"\7\"\2\2\u0104\u00fc\3\2\2\2\u0104\u00fd\3\2\2\2\u0104\u00ff\3\2\2\2\u0104"+
		"\u0101\3\2\2\2\u01058\3\2\2\2\u0106\u0107\7k\2\2\u0107\u0108\7h\2\2\u0108"+
		":\3\2\2\2\u0109\u010a\7g\2\2\u010a\u010b\7n\2\2\u010b\u010c\7u\2\2\u010c"+
		"\u010d\7g\2\2\u010d<\3\2\2\2\u010e\u010f\7v\2\2\u010f\u0110\7j\2\2\u0110"+
		"\u0111\7g\2\2\u0111\u0112\7p\2\2\u0112>\3\2\2\2\u0113\u0114\7g\2\2\u0114"+
		"\u0115\7p\2\2\u0115\u0116\7f\2\2\u0116\u0117\7k\2\2\u0117\u0118\7h\2\2"+
		"\u0118@\3\2\2\2\u0119\u011a\7@\2\2\u011aB\3\2\2\2\u011b\u011c\7>\2\2\u011c"+
		"D\3\2\2\2\u011d\u011e\7?\2\2\u011e\u011f\7>\2\2\u011fF\3\2\2\2\u0120\u0121"+
		"\7?\2\2\u0121\u0122\7@\2\2\u0122H\3\2\2\2\u0123\u0124\7#\2\2\u0124\u0125"+
		"\7?\2\2\u0125J\3\2\2\2\u0126\u0127\7h\2\2\u0127\u0128\7q\2\2\u0128\u0129"+
		"\7t\2\2\u0129L\3\2\2\2\u012a\u012b\7g\2\2\u012b\u012c\7p\2\2\u012c\u012d"+
		"\7f\2\2\u012d\u012e\7h\2\2\u012e\u012f\7q\2\2\u012f\u0130\7t\2\2\u0130"+
		"N\3\2\2\2\u0131\u0132\7E\2\2\u0132\u0133\7q\2\2\u0133\u0134\7n\2\2\u0134"+
		"\u0135\7c\2\2\u0135\u0136\7d\2\2\u0136\u0137\7q\2\2\u0137\u0138\7t\2\2"+
		"\u0138\u0139\7c\2\2\u0139\u013a\7f\2\2\u013a\u013b\7q\2\2\u013b\u018e"+
		"\7t\2\2\u013c\u013d\7G\2\2\u013d\u013e\7s\2\2\u013e\u013f\7w\2\2\u013f"+
		"\u0140\7k\2\2\u0140\u0141\7r\2\2\u0141\u018e\7c\2\2\u0142\u0143\7V\2\2"+
		"\u0143\u0144\7k\2\2\u0144\u0145\7r\2\2\u0145\u0146\7q\2\2\u0146\u0147"+
		"\7G\2\2\u0147\u0148\7s\2\2\u0148\u0149\7w\2\2\u0149\u014a\7k\2\2\u014a"+
		"\u014b\7r\2\2\u014b\u018e\7c\2\2\u014c\u014d\7U\2\2\u014d\u014e\7g\2\2"+
		"\u014e\u014f\7t\2\2\u014f\u0150\7x\2\2\u0150\u0151\7k\2\2\u0151\u0152"+
		"\7e\2\2\u0152\u018e\7q\2\2\u0153\u0154\7H\2\2\u0154\u0155\7q\2\2\u0155"+
		"\u0156\7t\2\2\u0156\u0157\7o\2\2\u0157\u0158\7w\2\2\u0158\u0159\7n\2\2"+
		"\u0159\u015a\7c\2\2\u015a\u015b\7t\2\2\u015b\u015c\7k\2\2\u015c\u018e"+
		"\7q\2\2\u015d\u015e\7C\2\2\u015e\u015f\7v\2\2\u015f\u0160\7k\2\2\u0160"+
		"\u0161\7x\2\2\u0161\u0162\7k\2\2\u0162\u0163\7f\2\2\u0163\u0164\7c\2\2"+
		"\u0164\u0165\7f\2\2\u0165\u0166\7g\2\2\u0166\u0167\7O\2\2\u0167\u0168"+
		"\7c\2\2\u0168\u0169\7p\2\2\u0169\u016a\7w\2\2\u016a\u016b\7c\2\2\u016b"+
		"\u018e\7n\2\2\u016c\u016d\7C\2\2\u016d\u016e\7v\2\2\u016e\u016f\7k\2\2"+
		"\u016f\u0170\7x\2\2\u0170\u0171\7k\2\2\u0171\u0172\7f\2\2\u0172\u0173"+
		"\7c\2\2\u0173\u0174\7f\2\2\u0174\u0175\7g\2\2\u0175\u0176\7C\2\2\u0176"+
		"\u0177\7w\2\2\u0177\u0178\7v\2\2\u0178\u0179\7q\2\2\u0179\u017a\7o\2\2"+
		"\u017a\u017b\7c\2\2\u017b\u017c\7v\2\2\u017c\u017d\7k\2\2\u017d\u017e"+
		"\7e\2\2\u017e\u018e\7c\2\2\u017f\u0180\7R\2\2\u0180\u0181\7g\2\2\u0181"+
		"\u0182\7f\2\2\u0182\u0183\7k\2\2\u0183\u0184\7f\2\2\u0184\u018e\7q\2\2"+
		"\u0185\u0186\7E\2\2\u0186\u0187\7c\2\2\u0187\u0188\7v\2\2\u0188\u0189"+
		"\7c\2\2\u0189\u018a\7n\2\2\u018a\u018b\7q\2\2\u018b\u018c\7i\2\2\u018c"+
		"\u018e\7q\2\2\u018d\u0131\3\2\2\2\u018d\u013c\3\2\2\2\u018d\u0142\3\2"+
		"\2\2\u018d\u014c\3\2\2\2\u018d\u0153\3\2\2\2\u018d\u015d\3\2\2\2\u018d"+
		"\u016c\3\2\2\2\u018d\u017f\3\2\2\2\u018d\u0185\3\2\2\2\u018eP\3\2\2\2"+
		"\u018f\u0190\7n\2\2\u0190\u0191\7g\2\2\u0191\u0192\7t\2\2\u0192\u0193"+
		"\7h\2\2\u0193\u0194\7k\2\2\u0194\u0195\7e\2\2\u0195\u0196\7j\2\2\u0196"+
		"\u0197\7g\2\2\u0197\u0198\7k\2\2\u0198\u0199\7t\2\2\u0199\u019a\7q\2\2"+
		"\u019aR\3\2\2\2\u019b\u019c\7E\2\2\u019c\u019d\7U\2\2\u019d\u01a2\7X\2"+
		"\2\u019e\u019f\7Z\2\2\u019f\u01a0\7O\2\2\u01a0\u01a2\7N\2\2\u01a1\u019b"+
		"\3\2\2\2\u01a1\u019e\3\2\2\2\u01a2T\3\2\2\2\u01a3\u01a5\t\4\2\2\u01a4"+
		"\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\7B\2\2\u01a9\u01ab\t\5\2\2\u01aa"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\7\60\2\2\u01af\u01b0\t\6\2\2\u01b0"+
		"\u01b1\b+\2\2\u01b1V\3\2\2\2\u01b2\u01b3\t\7\2\2\u01b3\u01b4\b,\3\2\u01b4"+
		"X\3\2\2\2\u01b5\u01b6\t\7\2\2\u01b6\u01b7\b-\4\2\u01b7Z\3\2\2\2\20\2\u0085"+
		"\u00af\u00bf\u00ca\u00dc\u00e6\u00f0\u00fa\u0104\u018d\u01a1\u01a6\u01ac"+
		"\5\3+\2\3,\3\3-\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}