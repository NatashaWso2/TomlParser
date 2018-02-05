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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, ALPHA=23, SPACE=24, 
		HYPHEN=25, PERIOD=26, QUOTATION_MARK=27, UNDERSCORE=28, COLON=29, COMMA=30, 
		SLASH=31, APOSTROPHE=32, EQUALS=33, HASH=34, BASICUNESCPAED=35, MLBASICUNESCAPED=36, 
		LITERALCHAR=37, MLLITERALCHAR=38, PLUS=39, DIGIT19=40, DIGIT07=41, DIGIT01=42, 
		E=43, INF=44, NAN=45, TRUE=46, FALSE=47, UPPERCASE_T=48, LOWERCASE_T=49, 
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
		"T__17", "T__18", "T__19", "T__20", "T__21", "ALPHA", "SPACE", "HYPHEN", 
		"PERIOD", "QUOTATION_MARK", "UNDERSCORE", "COLON", "COMMA", "SLASH", "APOSTROPHE", 
		"EQUALS", "HASH", "BASICUNESCPAED", "MLBASICUNESCAPED", "LITERALCHAR", 
		"MLLITERALCHAR", "PLUS", "DIGIT19", "DIGIT07", "DIGIT01", "E", "INF", 
		"NAN", "TRUE", "FALSE", "UPPERCASE_T", "LOWERCASE_T", "UPPERCASE_Z", "DIGIT", 
		"HEXDIG"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\t'", "'\r'", "'\n'", "'\r\n'", "'\\\"'", "'\\\\'", "'\\/'", "'\\b'", 
		"'\\f'", "'\\n'", "'\\r'", "'\\t'", "'\\'", "'0x'", "'0o'", "'0b'", "'['", 
		"']'", "'{'", "'}'", "'[['", "']]'", null, "' '", "'-'", "'.'", "'\"'", 
		"'_'", "':'", "','", "'/'", "'''", "'='", "'#'", null, null, null, null, 
		"'+'", null, null, null, "'e'", "'inf'", "'nan'", "'true'", "'false'", 
		"'T'", "'t'", "'Z'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "ALPHA", 
		"SPACE", "HYPHEN", "PERIOD", "QUOTATION_MARK", "UNDERSCORE", "COLON", 
		"COMMA", "SLASH", "APOSTROPHE", "EQUALS", "HASH", "BASICUNESCPAED", "MLBASICUNESCAPED", 
		"LITERALCHAR", "MLLITERALCHAR", "PLUS", "DIGIT19", "DIGIT07", "DIGIT01", 
		"E", "INF", "NAN", "TRUE", "FALSE", "UPPERCASE_T", "LOWERCASE_T", "UPPERCASE_Z", 
		"DIGIT", "HEXDIG"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u00fa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\7\30\u00a7\n\30\f\30\16\30\u00aa\13\30\3\30\7\30\u00ad\n\30\f\30\16"+
		"\30\u00b0\13\30\5\30\u00b2\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/"+
		"\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\5\65\u00f9\n\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66\3\2\f\3\2C\\\3\2c|\6\2##%]_"+
		"\u0080\u0082\u1101\4\2\"]_\u1101\5\2\13\13\"(*\u1101\4\2\13\13\"\u1101"+
		"\3\2\63;\3\2\629\3\2\62\63\3\2\62;\2\u00fd\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5m\3\2\2\2\7o\3\2\2\2\tq\3\2\2\2\13"+
		"t\3\2\2\2\rw\3\2\2\2\17z\3\2\2\2\21}\3\2\2\2\23\u0080\3\2\2\2\25\u0083"+
		"\3\2\2\2\27\u0086\3\2\2\2\31\u0089\3\2\2\2\33\u008c\3\2\2\2\35\u008e\3"+
		"\2\2\2\37\u0091\3\2\2\2!\u0094\3\2\2\2#\u0097\3\2\2\2%\u0099\3\2\2\2\'"+
		"\u009b\3\2\2\2)\u009d\3\2\2\2+\u009f\3\2\2\2-\u00a2\3\2\2\2/\u00b1\3\2"+
		"\2\2\61\u00b3\3\2\2\2\63\u00b5\3\2\2\2\65\u00b7\3\2\2\2\67\u00b9\3\2\2"+
		"\29\u00bb\3\2\2\2;\u00bd\3\2\2\2=\u00bf\3\2\2\2?\u00c1\3\2\2\2A\u00c3"+
		"\3\2\2\2C\u00c5\3\2\2\2E\u00c7\3\2\2\2G\u00c9\3\2\2\2I\u00cb\3\2\2\2K"+
		"\u00cd\3\2\2\2M\u00cf\3\2\2\2O\u00d1\3\2\2\2Q\u00d3\3\2\2\2S\u00d5\3\2"+
		"\2\2U\u00d7\3\2\2\2W\u00d9\3\2\2\2Y\u00db\3\2\2\2[\u00df\3\2\2\2]\u00e3"+
		"\3\2\2\2_\u00e8\3\2\2\2a\u00ee\3\2\2\2c\u00f0\3\2\2\2e\u00f2\3\2\2\2g"+
		"\u00f4\3\2\2\2i\u00f8\3\2\2\2kl\7\13\2\2l\4\3\2\2\2mn\7\17\2\2n\6\3\2"+
		"\2\2op\7\f\2\2p\b\3\2\2\2qr\7\17\2\2rs\7\f\2\2s\n\3\2\2\2tu\7^\2\2uv\7"+
		"$\2\2v\f\3\2\2\2wx\7^\2\2xy\7^\2\2y\16\3\2\2\2z{\7^\2\2{|\7\61\2\2|\20"+
		"\3\2\2\2}~\7^\2\2~\177\7d\2\2\177\22\3\2\2\2\u0080\u0081\7^\2\2\u0081"+
		"\u0082\7h\2\2\u0082\24\3\2\2\2\u0083\u0084\7^\2\2\u0084\u0085\7p\2\2\u0085"+
		"\26\3\2\2\2\u0086\u0087\7^\2\2\u0087\u0088\7t\2\2\u0088\30\3\2\2\2\u0089"+
		"\u008a\7^\2\2\u008a\u008b\7v\2\2\u008b\32\3\2\2\2\u008c\u008d\7^\2\2\u008d"+
		"\34\3\2\2\2\u008e\u008f\7\62\2\2\u008f\u0090\7z\2\2\u0090\36\3\2\2\2\u0091"+
		"\u0092\7\62\2\2\u0092\u0093\7q\2\2\u0093 \3\2\2\2\u0094\u0095\7\62\2\2"+
		"\u0095\u0096\7d\2\2\u0096\"\3\2\2\2\u0097\u0098\7]\2\2\u0098$\3\2\2\2"+
		"\u0099\u009a\7_\2\2\u009a&\3\2\2\2\u009b\u009c\7}\2\2\u009c(\3\2\2\2\u009d"+
		"\u009e\7\177\2\2\u009e*\3\2\2\2\u009f\u00a0\7]\2\2\u00a0\u00a1\7]\2\2"+
		"\u00a1,\3\2\2\2\u00a2\u00a3\7_\2\2\u00a3\u00a4\7_\2\2\u00a4.\3\2\2\2\u00a5"+
		"\u00a7\t\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00b2\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ad\t\3\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00a8\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\60\3\2\2\2\u00b3\u00b4\7\"\2"+
		"\2\u00b4\62\3\2\2\2\u00b5\u00b6\7/\2\2\u00b6\64\3\2\2\2\u00b7\u00b8\7"+
		"\60\2\2\u00b8\66\3\2\2\2\u00b9\u00ba\7$\2\2\u00ba8\3\2\2\2\u00bb\u00bc"+
		"\7a\2\2\u00bc:\3\2\2\2\u00bd\u00be\7<\2\2\u00be<\3\2\2\2\u00bf\u00c0\7"+
		".\2\2\u00c0>\3\2\2\2\u00c1\u00c2\7\61\2\2\u00c2@\3\2\2\2\u00c3\u00c4\7"+
		")\2\2\u00c4B\3\2\2\2\u00c5\u00c6\7?\2\2\u00c6D\3\2\2\2\u00c7\u00c8\7%"+
		"\2\2\u00c8F\3\2\2\2\u00c9\u00ca\t\4\2\2\u00caH\3\2\2\2\u00cb\u00cc\t\5"+
		"\2\2\u00ccJ\3\2\2\2\u00cd\u00ce\t\6\2\2\u00ceL\3\2\2\2\u00cf\u00d0\t\7"+
		"\2\2\u00d0N\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2P\3\2\2\2\u00d3\u00d4\t\b"+
		"\2\2\u00d4R\3\2\2\2\u00d5\u00d6\t\t\2\2\u00d6T\3\2\2\2\u00d7\u00d8\t\n"+
		"\2\2\u00d8V\3\2\2\2\u00d9\u00da\7g\2\2\u00daX\3\2\2\2\u00db\u00dc\7k\2"+
		"\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7h\2\2\u00deZ\3\2\2\2\u00df\u00e0\7"+
		"p\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7p\2\2\u00e2\\\3\2\2\2\u00e3\u00e4"+
		"\7v\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7w\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"^\3\2\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7n\2\2\u00eb"+
		"\u00ec\7u\2\2\u00ec\u00ed\7g\2\2\u00ed`\3\2\2\2\u00ee\u00ef\7V\2\2\u00ef"+
		"b\3\2\2\2\u00f0\u00f1\7v\2\2\u00f1d\3\2\2\2\u00f2\u00f3\7\\\2\2\u00f3"+
		"f\3\2\2\2\u00f4\u00f5\t\13\2\2\u00f5h\3\2\2\2\u00f6\u00f9\5g\64\2\u00f7"+
		"\u00f9\4CH\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9j\3\2\2\2\7"+
		"\2\u00a8\u00ae\u00b1\u00f8\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}