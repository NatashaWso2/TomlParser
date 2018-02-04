// Generated from Toml.g4 by ANTLR 4.7.1
package org.wso2.toml.parser.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TomlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		ALPHA=25, SPACE=26, HYPHEN=27, PERIOD=28, QUOTATION_MARK=29, UNDERSCORE=30, 
		COLON=31, COMMA=32, SLASH=33, APOSTROPHE=34, EQUALS=35, HASH=36, BASICUNESCPAED=37, 
		MLBASICUNESCAPED=38, LITERALCHAR=39, MLLITERALCHAR=40, PLUS=41, DIGIT19=42, 
		DIGIT07=43, DIGIT01=44, E=45, TRUE=46, FALSE=47, UPPERCASE_T=48, LOWERCASE_T=49, 
		UPPERCASE_Z=50, DIGIT=51, HEXDIG=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "ALPHA", 
		"SPACE", "HYPHEN", "PERIOD", "QUOTATION_MARK", "UNDERSCORE", "COLON", 
		"COMMA", "SLASH", "APOSTROPHE", "EQUALS", "HASH", "BASICUNESCPAED", "MLBASICUNESCAPED", 
		"LITERALCHAR", "MLLITERALCHAR", "PLUS", "DIGIT19", "DIGIT07", "DIGIT01", 
		"E", "TRUE", "FALSE", "UPPERCASE_T", "LOWERCASE_T", "UPPERCASE_Z", "DIGIT", 
		"HEXDIG"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\t'", "'\r'", "'\n'", "'\r\n'", "'\\\"'", "'\\\\'", "'\\/'", "'\\b'", 
		"'\\f'", "'\\n'", "'\\r'", "'\\t'", "'\\'", "'0x'", "'0o'", "'0b'", "'inf'", 
		"'nan'", "'['", "']'", "'{'", "'}'", "'[['", "']]'", null, "' '", "'-'", 
		"'.'", "'\"'", "'_'", "':'", "','", "'/'", "'''", "'='", "'#'", null, 
		null, null, null, "'+'", null, null, null, "'e'", "'true'", "'false'", 
		"'T'", "'t'", "'Z'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "ALPHA", "SPACE", "HYPHEN", "PERIOD", "QUOTATION_MARK", "UNDERSCORE", 
		"COLON", "COMMA", "SLASH", "APOSTROPHE", "EQUALS", "HASH", "BASICUNESCPAED", 
		"MLBASICUNESCAPED", "LITERALCHAR", "MLLITERALCHAR", "PLUS", "DIGIT19", 
		"DIGIT07", "DIGIT01", "E", "TRUE", "FALSE", "UPPERCASE_T", "LOWERCASE_T", 
		"UPPERCASE_Z", "DIGIT", "HEXDIG"
	};
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


	public TomlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Toml.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u00ef\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\5\32\u00af\n\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3"+
		"/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\5\65\u00ee\n\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66\3\2\13\4\2C\\c|\6\2##%]_\u0080\u0082"+
		"\u1101\4\2\"]_\u1101\5\2\13\13\"(*\u1101\4\2\13\13\"\u1101\3\2\63;\3\2"+
		"\629\3\2\62\63\3\2\62;\2\u00ef\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2\tq\3\2\2\2\13t\3\2\2\2\rw\3"+
		"\2\2\2\17z\3\2\2\2\21}\3\2\2\2\23\u0080\3\2\2\2\25\u0083\3\2\2\2\27\u0086"+
		"\3\2\2\2\31\u0089\3\2\2\2\33\u008c\3\2\2\2\35\u008e\3\2\2\2\37\u0091\3"+
		"\2\2\2!\u0094\3\2\2\2#\u0097\3\2\2\2%\u009b\3\2\2\2\'\u009f\3\2\2\2)\u00a1"+
		"\3\2\2\2+\u00a3\3\2\2\2-\u00a5\3\2\2\2/\u00a7\3\2\2\2\61\u00aa\3\2\2\2"+
		"\63\u00ae\3\2\2\2\65\u00b0\3\2\2\2\67\u00b2\3\2\2\29\u00b4\3\2\2\2;\u00b6"+
		"\3\2\2\2=\u00b8\3\2\2\2?\u00ba\3\2\2\2A\u00bc\3\2\2\2C\u00be\3\2\2\2E"+
		"\u00c0\3\2\2\2G\u00c2\3\2\2\2I\u00c4\3\2\2\2K\u00c6\3\2\2\2M\u00c8\3\2"+
		"\2\2O\u00ca\3\2\2\2Q\u00cc\3\2\2\2S\u00ce\3\2\2\2U\u00d0\3\2\2\2W\u00d2"+
		"\3\2\2\2Y\u00d4\3\2\2\2[\u00d6\3\2\2\2]\u00d8\3\2\2\2_\u00dd\3\2\2\2a"+
		"\u00e3\3\2\2\2c\u00e5\3\2\2\2e\u00e7\3\2\2\2g\u00e9\3\2\2\2i\u00ed\3\2"+
		"\2\2kl\7\13\2\2l\4\3\2\2\2mn\7\17\2\2n\6\3\2\2\2op\7\f\2\2p\b\3\2\2\2"+
		"qr\7\17\2\2rs\7\f\2\2s\n\3\2\2\2tu\7^\2\2uv\7$\2\2v\f\3\2\2\2wx\7^\2\2"+
		"xy\7^\2\2y\16\3\2\2\2z{\7^\2\2{|\7\61\2\2|\20\3\2\2\2}~\7^\2\2~\177\7"+
		"d\2\2\177\22\3\2\2\2\u0080\u0081\7^\2\2\u0081\u0082\7h\2\2\u0082\24\3"+
		"\2\2\2\u0083\u0084\7^\2\2\u0084\u0085\7p\2\2\u0085\26\3\2\2\2\u0086\u0087"+
		"\7^\2\2\u0087\u0088\7t\2\2\u0088\30\3\2\2\2\u0089\u008a\7^\2\2\u008a\u008b"+
		"\7v\2\2\u008b\32\3\2\2\2\u008c\u008d\7^\2\2\u008d\34\3\2\2\2\u008e\u008f"+
		"\7\62\2\2\u008f\u0090\7z\2\2\u0090\36\3\2\2\2\u0091\u0092\7\62\2\2\u0092"+
		"\u0093\7q\2\2\u0093 \3\2\2\2\u0094\u0095\7\62\2\2\u0095\u0096\7d\2\2\u0096"+
		"\"\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a\7h\2\2\u009a"+
		"$\3\2\2\2\u009b\u009c\7p\2\2\u009c\u009d\7c\2\2\u009d\u009e\7p\2\2\u009e"+
		"&\3\2\2\2\u009f\u00a0\7]\2\2\u00a0(\3\2\2\2\u00a1\u00a2\7_\2\2\u00a2*"+
		"\3\2\2\2\u00a3\u00a4\7}\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7\177\2\2\u00a6"+
		".\3\2\2\2\u00a7\u00a8\7]\2\2\u00a8\u00a9\7]\2\2\u00a9\60\3\2\2\2\u00aa"+
		"\u00ab\7_\2\2\u00ab\u00ac\7_\2\2\u00ac\62\3\2\2\2\u00ad\u00af\t\2\2\2"+
		"\u00ae\u00ad\3\2\2\2\u00af\64\3\2\2\2\u00b0\u00b1\7\"\2\2\u00b1\66\3\2"+
		"\2\2\u00b2\u00b3\7/\2\2\u00b38\3\2\2\2\u00b4\u00b5\7\60\2\2\u00b5:\3\2"+
		"\2\2\u00b6\u00b7\7$\2\2\u00b7<\3\2\2\2\u00b8\u00b9\7a\2\2\u00b9>\3\2\2"+
		"\2\u00ba\u00bb\7<\2\2\u00bb@\3\2\2\2\u00bc\u00bd\7.\2\2\u00bdB\3\2\2\2"+
		"\u00be\u00bf\7\61\2\2\u00bfD\3\2\2\2\u00c0\u00c1\7)\2\2\u00c1F\3\2\2\2"+
		"\u00c2\u00c3\7?\2\2\u00c3H\3\2\2\2\u00c4\u00c5\7%\2\2\u00c5J\3\2\2\2\u00c6"+
		"\u00c7\t\3\2\2\u00c7L\3\2\2\2\u00c8\u00c9\t\4\2\2\u00c9N\3\2\2\2\u00ca"+
		"\u00cb\t\5\2\2\u00cbP\3\2\2\2\u00cc\u00cd\t\6\2\2\u00cdR\3\2\2\2\u00ce"+
		"\u00cf\7-\2\2\u00cfT\3\2\2\2\u00d0\u00d1\t\7\2\2\u00d1V\3\2\2\2\u00d2"+
		"\u00d3\t\b\2\2\u00d3X\3\2\2\2\u00d4\u00d5\t\t\2\2\u00d5Z\3\2\2\2\u00d6"+
		"\u00d7\7g\2\2\u00d7\\\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7t\2\2\u00da"+
		"\u00db\7w\2\2\u00db\u00dc\7g\2\2\u00dc^\3\2\2\2\u00dd\u00de\7h\2\2\u00de"+
		"\u00df\7c\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7g\2\2"+
		"\u00e2`\3\2\2\2\u00e3\u00e4\7V\2\2\u00e4b\3\2\2\2\u00e5\u00e6\7v\2\2\u00e6"+
		"d\3\2\2\2\u00e7\u00e8\7\\\2\2\u00e8f\3\2\2\2\u00e9\u00ea\t\n\2\2\u00ea"+
		"h\3\2\2\2\u00eb\u00ee\5g\64\2\u00ec\u00ee\4CH\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00eej\3\2\2\2\5\2\u00ae\u00ed\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}