package eapli.base.gramaticas.script.Compilacao_Scripts;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

/**
 * The type Linguagem script lexer.
 */
@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LinguagemScriptLexer extends Lexer {
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
	 * The Channel names.
	 */
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	/**
	 * The Mode names.
	 */
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "MODIFICADOR", 
			"TIPO", "LETRA", "DIGITO", "NEWLINE", "ASPAS", "PELICA", "EXPO", "IGUAL", 
			"IGUAL_ESPACO", "VIRGULA", "PONTO_FINAL", "FIM_INSTRUCAO", "VAZIO", "DOIS_PONTOS", 
			"SOMA", "SUBTRACAO", "MULTIPLICACAO", "DIVISAO", "IF", "ELSE", "THEN", 
			"ENDIF", "MAIOR", "MENOR", "MENOR_IGUAL", "MAIOR_IGUAL", "DIFERENTE", 
			"FOR", "ENDFOR", "COLECAO", "LER_FICHEIRO", "EXTENSAO", "EMAIL"
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


	/**
	 * Instantiates a new Linguagem script lexer.
	 *
	 * @param input the input
	 */
	public LinguagemScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LinguagemScript.g4"; }

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

	/**
	 * The constant _serializedATN.
	 */
	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u01b9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008b"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b5\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00c5\n\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00d0\n\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00e2\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00ec\n\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u00f6\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0100\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u010a"+
		"\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$"+
		"\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0193\n\'\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\5)\u01a7\n)\3*\6"+
		"*\u01aa\n*\r*\16*\u01ab\3*\3*\6*\u01b0\n*\r*\16*\u01b1\3*\3*\6*\u01b6"+
		"\n*\r*\16*\u01b7\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\7\4\2C\\c|\3\2\62;"+
		"\b\2\'\'--/\60\62;aac|\5\2/\60\62;c|\3\2c|\2\u01dc\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7"+
		"Y\3\2\2\2\t[\3\2\2\2\13]\3\2\2\2\ra\3\2\2\2\17k\3\2\2\2\21\u008a\3\2\2"+
		"\2\23\u00b4\3\2\2\2\25\u00b6\3\2\2\2\27\u00b8\3\2\2\2\31\u00ba\3\2\2\2"+
		"\33\u00bc\3\2\2\2\35\u00be\3\2\2\2\37\u00c4\3\2\2\2!\u00c6\3\2\2\2#\u00cf"+
		"\3\2\2\2%\u00d1\3\2\2\2\'\u00d3\3\2\2\2)\u00d5\3\2\2\2+\u00d7\3\2\2\2"+
		"-\u00e1\3\2\2\2/\u00eb\3\2\2\2\61\u00f5\3\2\2\2\63\u00ff\3\2\2\2\65\u0109"+
		"\3\2\2\2\67\u010b\3\2\2\29\u010e\3\2\2\2;\u0113\3\2\2\2=\u0118\3\2\2\2"+
		"?\u011e\3\2\2\2A\u0120\3\2\2\2C\u0122\3\2\2\2E\u0125\3\2\2\2G\u0128\3"+
		"\2\2\2I\u012b\3\2\2\2K\u012f\3\2\2\2M\u0192\3\2\2\2O\u0194\3\2\2\2Q\u01a6"+
		"\3\2\2\2S\u01a9\3\2\2\2UV\7*\2\2V\4\3\2\2\2WX\7+\2\2X\6\3\2\2\2YZ\7]\2"+
		"\2Z\b\3\2\2\2[\\\7_\2\2\\\n\3\2\2\2]^\7\"\2\2^_\7<\2\2_`\7\"\2\2`\f\3"+
		"\2\2\2ab\7C\2\2bc\7u\2\2cd\7u\2\2de\7w\2\2ef\7p\2\2fg\7v\2\2gh\7q\2\2"+
		"hi\7<\2\2ij\7\"\2\2j\16\3\2\2\2kl\7O\2\2lm\7g\2\2mn\7p\2\2no\7u\2\2op"+
		"\7c\2\2pq\7i\2\2qr\7g\2\2rs\7o\2\2st\7<\2\2tu\7\"\2\2u\20\3\2\2\2vw\7"+
		"e\2\2wx\7w\2\2xy\7t\2\2yz\7v\2\2z{\7q\2\2{\u008b\7\"\2\2|}\7n\2\2}~\7"+
		"q\2\2~\177\7p\2\2\177\u0080\7i\2\2\u0080\u008b\7q\2\2\u0081\u0082\7u\2"+
		"\2\u0082\u0083\7g\2\2\u0083\u0084\7o\2\2\u0084\u0085\7a\2\2\u0085\u0086"+
		"\7u\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089\7c\2\2\u0089"+
		"\u008b\7n\2\2\u008av\3\2\2\2\u008a|\3\2\2\2\u008a\u0081\3\2\2\2\u008b"+
		"\22\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f"+
		"\u0090\7g\2\2\u0090\u0091\7k\2\2\u0091\u0092\7t\2\2\u0092\u0093\7q\2\2"+
		"\u0093\u00b5\7\"\2\2\u0094\u0095\7e\2\2\u0095\u0096\7c\2\2\u0096\u0097"+
		"\7t\2\2\u0097\u0098\7c\2\2\u0098\u0099\7e\2\2\u0099\u009a\7v\2\2\u009a"+
		"\u009b\7g\2\2\u009b\u009c\7t\2\2\u009c\u00b5\7\"\2\2\u009d\u009e\7t\2"+
		"\2\u009e\u009f\7g\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2"+
		"\7a\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7q\2\2\u00a5"+
		"\u00a6\7c\2\2\u00a6\u00a7\7v\2\2\u00a7\u00b5\7\"\2\2\u00a8\u00a9\7t\2"+
		"\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7n\2\2\u00ac\u00b5"+
		"\7\"\2\2\u00ad\u00ae\7U\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0"+
		"\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7i\2\2\u00b3\u00b5\7\"\2"+
		"\2\u00b4\u008c\3\2\2\2\u00b4\u0094\3\2\2\2\u00b4\u009d\3\2\2\2\u00b4\u00a8"+
		"\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b5\24\3\2\2\2\u00b6\u00b7\t\2\2\2\u00b7"+
		"\26\3\2\2\2\u00b8\u00b9\t\3\2\2\u00b9\30\3\2\2\2\u00ba\u00bb\7\f\2\2\u00bb"+
		"\32\3\2\2\2\u00bc\u00bd\7$\2\2\u00bd\34\3\2\2\2\u00be\u00bf\7)\2\2\u00bf"+
		"\36\3\2\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c5\7/\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"\u00c5\7-\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5 \3\2\2\2\u00c6"+
		"\u00c7\7?\2\2\u00c7\"\3\2\2\2\u00c8\u00c9\7\"\2\2\u00c9\u00d0\7?\2\2\u00ca"+
		"\u00cb\7?\2\2\u00cb\u00d0\7\"\2\2\u00cc\u00cd\7\"\2\2\u00cd\u00ce\7?\2"+
		"\2\u00ce\u00d0\7\"\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00cc"+
		"\3\2\2\2\u00d0$\3\2\2\2\u00d1\u00d2\7.\2\2\u00d2&\3\2\2\2\u00d3\u00d4"+
		"\7\60\2\2\u00d4(\3\2\2\2\u00d5\u00d6\7=\2\2\u00d6*\3\2\2\2\u00d7\u00d8"+
		"\7\"\2\2\u00d8,\3\2\2\2\u00d9\u00e2\7<\2\2\u00da\u00db\7\"\2\2\u00db\u00dc"+
		"\7<\2\2\u00dc\u00e2\7\"\2\2\u00dd\u00de\7<\2\2\u00de\u00e2\7\"\2\2\u00df"+
		"\u00e0\7\"\2\2\u00e0\u00e2\7<\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00da\3\2"+
		"\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2.\3\2\2\2\u00e3\u00ec"+
		"\7-\2\2\u00e4\u00e5\7-\2\2\u00e5\u00ec\7\"\2\2\u00e6\u00e7\7\"\2\2\u00e7"+
		"\u00ec\7-\2\2\u00e8\u00e9\7\"\2\2\u00e9\u00ea\7-\2\2\u00ea\u00ec\7\"\2"+
		"\2\u00eb\u00e3\3\2\2\2\u00eb\u00e4\3\2\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00e8"+
		"\3\2\2\2\u00ec\60\3\2\2\2\u00ed\u00f6\7/\2\2\u00ee\u00ef\7/\2\2\u00ef"+
		"\u00f6\7\"\2\2\u00f0\u00f1\7\"\2\2\u00f1\u00f6\7/\2\2\u00f2\u00f3\7\""+
		"\2\2\u00f3\u00f4\7/\2\2\u00f4\u00f6\7\"\2\2\u00f5\u00ed\3\2\2\2\u00f5"+
		"\u00ee\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6\62\3\2\2"+
		"\2\u00f7\u0100\7,\2\2\u00f8\u00f9\7,\2\2\u00f9\u0100\7\"\2\2\u00fa\u00fb"+
		"\7\"\2\2\u00fb\u0100\7,\2\2\u00fc\u00fd\7\"\2\2\u00fd\u00fe\7,\2\2\u00fe"+
		"\u0100\7\"\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00f8\3\2\2\2\u00ff\u00fa\3\2"+
		"\2\2\u00ff\u00fc\3\2\2\2\u0100\64\3\2\2\2\u0101\u010a\7\61\2\2\u0102\u0103"+
		"\7\61\2\2\u0103\u010a\7\"\2\2\u0104\u0105\7\"\2\2\u0105\u010a\7\61\2\2"+
		"\u0106\u0107\7\"\2\2\u0107\u0108\7\61\2\2\u0108\u010a\7\"\2\2\u0109\u0101"+
		"\3\2\2\2\u0109\u0102\3\2\2\2\u0109\u0104\3\2\2\2\u0109\u0106\3\2\2\2\u010a"+
		"\66\3\2\2\2\u010b\u010c\7k\2\2\u010c\u010d\7h\2\2\u010d8\3\2\2\2\u010e"+
		"\u010f\7g\2\2\u010f\u0110\7n\2\2\u0110\u0111\7u\2\2\u0111\u0112\7g\2\2"+
		"\u0112:\3\2\2\2\u0113\u0114\7v\2\2\u0114\u0115\7j\2\2\u0115\u0116\7g\2"+
		"\2\u0116\u0117\7p\2\2\u0117<\3\2\2\2\u0118\u0119\7g\2\2\u0119\u011a\7"+
		"p\2\2\u011a\u011b\7f\2\2\u011b\u011c\7k\2\2\u011c\u011d\7h\2\2\u011d>"+
		"\3\2\2\2\u011e\u011f\7@\2\2\u011f@\3\2\2\2\u0120\u0121\7>\2\2\u0121B\3"+
		"\2\2\2\u0122\u0123\7?\2\2\u0123\u0124\7>\2\2\u0124D\3\2\2\2\u0125\u0126"+
		"\7?\2\2\u0126\u0127\7@\2\2\u0127F\3\2\2\2\u0128\u0129\7#\2\2\u0129\u012a"+
		"\7?\2\2\u012aH\3\2\2\2\u012b\u012c\7h\2\2\u012c\u012d\7q\2\2\u012d\u012e"+
		"\7t\2\2\u012eJ\3\2\2\2\u012f\u0130\7g\2\2\u0130\u0131\7p\2\2\u0131\u0132"+
		"\7f\2\2\u0132\u0133\7h\2\2\u0133\u0134\7q\2\2\u0134\u0135\7t\2\2\u0135"+
		"L\3\2\2\2\u0136\u0137\7E\2\2\u0137\u0138\7q\2\2\u0138\u0139\7n\2\2\u0139"+
		"\u013a\7c\2\2\u013a\u013b\7d\2\2\u013b\u013c\7q\2\2\u013c\u013d\7t\2\2"+
		"\u013d\u013e\7c\2\2\u013e\u013f\7f\2\2\u013f\u0140\7q\2\2\u0140\u0193"+
		"\7t\2\2\u0141\u0142\7G\2\2\u0142\u0143\7s\2\2\u0143\u0144\7w\2\2\u0144"+
		"\u0145\7k\2\2\u0145\u0146\7r\2\2\u0146\u0193\7c\2\2\u0147\u0148\7V\2\2"+
		"\u0148\u0149\7k\2\2\u0149\u014a\7r\2\2\u014a\u014b\7q\2\2\u014b\u014c"+
		"\7G\2\2\u014c\u014d\7s\2\2\u014d\u014e\7w\2\2\u014e\u014f\7k\2\2\u014f"+
		"\u0150\7r\2\2\u0150\u0193\7c\2\2\u0151\u0152\7U\2\2\u0152\u0153\7g\2\2"+
		"\u0153\u0154\7t\2\2\u0154\u0155\7x\2\2\u0155\u0156\7k\2\2\u0156\u0157"+
		"\7e\2\2\u0157\u0193\7q\2\2\u0158\u0159\7H\2\2\u0159\u015a\7q\2\2\u015a"+
		"\u015b\7t\2\2\u015b\u015c\7o\2\2\u015c\u015d\7w\2\2\u015d\u015e\7n\2\2"+
		"\u015e\u015f\7c\2\2\u015f\u0160\7t\2\2\u0160\u0161\7k\2\2\u0161\u0193"+
		"\7q\2\2\u0162\u0163\7C\2\2\u0163\u0164\7v\2\2\u0164\u0165\7k\2\2\u0165"+
		"\u0166\7x\2\2\u0166\u0167\7k\2\2\u0167\u0168\7f\2\2\u0168\u0169\7c\2\2"+
		"\u0169\u016a\7f\2\2\u016a\u016b\7g\2\2\u016b\u016c\7O\2\2\u016c\u016d"+
		"\7c\2\2\u016d\u016e\7p\2\2\u016e\u016f\7w\2\2\u016f\u0170\7c\2\2\u0170"+
		"\u0193\7n\2\2\u0171\u0172\7C\2\2\u0172\u0173\7v\2\2\u0173\u0174\7k\2\2"+
		"\u0174\u0175\7x\2\2\u0175\u0176\7k\2\2\u0176\u0177\7f\2\2\u0177\u0178"+
		"\7c\2\2\u0178\u0179\7f\2\2\u0179\u017a\7g\2\2\u017a\u017b\7C\2\2\u017b"+
		"\u017c\7w\2\2\u017c\u017d\7v\2\2\u017d\u017e\7q\2\2\u017e\u017f\7o\2\2"+
		"\u017f\u0180\7c\2\2\u0180\u0181\7v\2\2\u0181\u0182\7k\2\2\u0182\u0183"+
		"\7e\2\2\u0183\u0193\7c\2\2\u0184\u0185\7R\2\2\u0185\u0186\7g\2\2\u0186"+
		"\u0187\7f\2\2\u0187\u0188\7k\2\2\u0188\u0189\7f\2\2\u0189\u0193\7q\2\2"+
		"\u018a\u018b\7E\2\2\u018b\u018c\7c\2\2\u018c\u018d\7v\2\2\u018d\u018e"+
		"\7c\2\2\u018e\u018f\7n\2\2\u018f\u0190\7q\2\2\u0190\u0191\7i\2\2\u0191"+
		"\u0193\7q\2\2\u0192\u0136\3\2\2\2\u0192\u0141\3\2\2\2\u0192\u0147\3\2"+
		"\2\2\u0192\u0151\3\2\2\2\u0192\u0158\3\2\2\2\u0192\u0162\3\2\2\2\u0192"+
		"\u0171\3\2\2\2\u0192\u0184\3\2\2\2\u0192\u018a\3\2\2\2\u0193N\3\2\2\2"+
		"\u0194\u0195\7n\2\2\u0195\u0196\7g\2\2\u0196\u0197\7t\2\2\u0197\u0198"+
		"\7h\2\2\u0198\u0199\7k\2\2\u0199\u019a\7e\2\2\u019a\u019b\7j\2\2\u019b"+
		"\u019c\7g\2\2\u019c\u019d\7k\2\2\u019d\u019e\7t\2\2\u019e\u019f\7q\2\2"+
		"\u019fP\3\2\2\2\u01a0\u01a1\7E\2\2\u01a1\u01a2\7U\2\2\u01a2\u01a7\7X\2"+
		"\2\u01a3\u01a4\7Z\2\2\u01a4\u01a5\7O\2\2\u01a5\u01a7\7N\2\2\u01a6\u01a0"+
		"\3\2\2\2\u01a6\u01a3\3\2\2\2\u01a7R\3\2\2\2\u01a8\u01aa\t\4\2\2\u01a9"+
		"\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\7B\2\2\u01ae\u01b0\t\5\2\2\u01af"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\7\60\2\2\u01b4\u01b6\t\6\2\2\u01b5"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8T\3\2\2\2\21\2\u008a\u00b4\u00c4\u00cf\u00e1\u00eb\u00f5\u00ff"+
		"\u0109\u0192\u01a6\u01ab\u01b1\u01b7\2";
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