// Generated from Toml.g4 by ANTLR 4.7.1
package org.wso2.toml.parser.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TomlParser extends Parser {
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
	public static final int
		RULE_toml = 0, RULE_expression = 1, RULE_ws = 2, RULE_wschar = 3, RULE_newline = 4, 
		RULE_commentStartSymbol = 5, RULE_nonEol = 6, RULE_comment = 7, RULE_keyval = 8, 
		RULE_key = 9, RULE_unquotedKey = 10, RULE_quotedKey = 11, RULE_keyvalSep = 12, 
		RULE_val = 13, RULE_string = 14, RULE_basicString = 15, RULE_basicChar = 16, 
		RULE_escaped = 17, RULE_escapeSeqChar = 18, RULE_mlBasicString = 19, RULE_mlBasicStringDelim = 20, 
		RULE_mlBasicBody = 21, RULE_mlBasicChar = 22, RULE_literalString = 23, 
		RULE_mlLiteralString = 24, RULE_mlLiteralStringDelim = 25, RULE_mlLiteralBody = 26, 
		RULE_integer = 27, RULE_minus = 28, RULE_hexPrefix = 29, RULE_octPrefix = 30, 
		RULE_binPrefix = 31, RULE_decInt = 32, RULE_unsignedDecInt = 33, RULE_hexInt = 34, 
		RULE_octInt = 35, RULE_binInt = 36, RULE_floatingPoint = 37, RULE_floatIntPart = 38, 
		RULE_frac = 39, RULE_decimalPoint = 40, RULE_zeroPrefixableInt = 41, RULE_exp = 42, 
		RULE_specialFloat = 43, RULE_inf = 44, RULE_nan = 45, RULE_bool = 46, 
		RULE_dateTime = 47, RULE_dateFullyear = 48, RULE_dateMonth = 49, RULE_dateMday = 50, 
		RULE_timeDelim = 51, RULE_timeHour = 52, RULE_timeMinute = 53, RULE_timeSecond = 54, 
		RULE_timeSecfrac = 55, RULE_timeNumoffset = 56, RULE_timeOffset = 57, 
		RULE_partialTime = 58, RULE_fullDate = 59, RULE_fullTime = 60, RULE_offsetDateTime = 61, 
		RULE_localDateTime = 62, RULE_localDate = 63, RULE_localTime = 64, RULE_array = 65, 
		RULE_arrayOpen = 66, RULE_arrayClose = 67, RULE_arrayValues = 68, RULE_arrayvalsNonEmpty = 69, 
		RULE_arraySep = 70, RULE_wsCommentNewline = 71, RULE_table = 72, RULE_stdTable = 73, 
		RULE_stdTableOpen = 74, RULE_stdTableClose = 75, RULE_tableKeySep = 76, 
		RULE_inlineTable = 77, RULE_inlineTableOpen = 78, RULE_inlineTableClose = 79, 
		RULE_inlineTableSep = 80, RULE_inlineTableKeyvals = 81, RULE_inlineTableKeyvalsNonEmpty = 82, 
		RULE_arrayTable = 83, RULE_arrayTableOpen = 84, RULE_arrayTableClose = 85;
	public static final String[] ruleNames = {
		"toml", "expression", "ws", "wschar", "newline", "commentStartSymbol", 
		"nonEol", "comment", "keyval", "key", "unquotedKey", "quotedKey", "keyvalSep", 
		"val", "string", "basicString", "basicChar", "escaped", "escapeSeqChar", 
		"mlBasicString", "mlBasicStringDelim", "mlBasicBody", "mlBasicChar", "literalString", 
		"mlLiteralString", "mlLiteralStringDelim", "mlLiteralBody", "integer", 
		"minus", "hexPrefix", "octPrefix", "binPrefix", "decInt", "unsignedDecInt", 
		"hexInt", "octInt", "binInt", "floatingPoint", "floatIntPart", "frac", 
		"decimalPoint", "zeroPrefixableInt", "exp", "specialFloat", "inf", "nan", 
		"bool", "dateTime", "dateFullyear", "dateMonth", "dateMday", "timeDelim", 
		"timeHour", "timeMinute", "timeSecond", "timeSecfrac", "timeNumoffset", 
		"timeOffset", "partialTime", "fullDate", "fullTime", "offsetDateTime", 
		"localDateTime", "localDate", "localTime", "array", "arrayOpen", "arrayClose", 
		"arrayValues", "arrayvalsNonEmpty", "arraySep", "wsCommentNewline", "table", 
		"stdTable", "stdTableOpen", "stdTableClose", "tableKeySep", "inlineTable", 
		"inlineTableOpen", "inlineTableClose", "inlineTableSep", "inlineTableKeyvals", 
		"inlineTableKeyvalsNonEmpty", "arrayTable", "arrayTableOpen", "arrayTableClose"
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

	@Override
	public String getGrammarFileName() { return "Toml.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TomlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TomlContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public TomlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_toml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterToml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitToml(this);
		}
	}

	public final TomlContext toml() throws RecognitionException {
		TomlContext _localctx = new TomlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_toml);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			expression();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==T__3) {
				{
				{
				setState(173);
				newline();
				setState(174);
				expression();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public KeyvalContext keyval() {
			return getRuleContext(KeyvalContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				ws();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HASH) {
					{
					setState(182);
					comment();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				ws();
				setState(186);
				keyval();
				setState(187);
				ws();
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HASH) {
					{
					setState(188);
					comment();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				ws();
				setState(192);
				table();
				setState(193);
				ws();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HASH) {
					{
					setState(194);
					comment();
					}
				}

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

	public static class WsContext extends ParserRuleContext {
		public List<WscharContext> wschar() {
			return getRuleContexts(WscharContext.class);
		}
		public WscharContext wschar(int i) {
			return getRuleContext(WscharContext.class,i);
		}
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitWs(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ws);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					wschar();
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class WscharContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(TomlParser.SPACE, 0); }
		public WscharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wschar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterWschar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitWschar(this);
		}
	}

	public final WscharContext wschar() throws RecognitionException {
		WscharContext _localctx = new WscharContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_wschar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << SPACE))) != 0)) ) {
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

	public static class NewlineContext extends ParserRuleContext {
		public NewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitNewline(this);
		}
	}

	public final NewlineContext newline() throws RecognitionException {
		NewlineContext _localctx = new NewlineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_newline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
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

	public static class CommentStartSymbolContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(TomlParser.HASH, 0); }
		public CommentStartSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentStartSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterCommentStartSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitCommentStartSymbol(this);
		}
	}

	public final CommentStartSymbolContext commentStartSymbol() throws RecognitionException {
		CommentStartSymbolContext _localctx = new CommentStartSymbolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_commentStartSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(HASH);
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

	public static class NonEolContext extends ParserRuleContext {
		public NonEolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonEol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterNonEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitNonEol(this);
		}
	}

	public final NonEolContext nonEol() throws RecognitionException {
		NonEolContext _localctx = new NonEolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nonEol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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

	public static class CommentContext extends ParserRuleContext {
		public CommentStartSymbolContext commentStartSymbol() {
			return getRuleContext(CommentStartSymbolContext.class,0);
		}
		public WsCommentNewlineContext wsCommentNewline() {
			return getRuleContext(WsCommentNewlineContext.class,0);
		}
		public List<BasicCharContext> basicChar() {
			return getRuleContexts(BasicCharContext.class);
		}
		public BasicCharContext basicChar(int i) {
			return getRuleContext(BasicCharContext.class,i);
		}
		public List<NonEolContext> nonEol() {
			return getRuleContexts(NonEolContext.class);
		}
		public NonEolContext nonEol(int i) {
			return getRuleContext(NonEolContext.class,i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			commentStartSymbol();
			setState(214);
			wsCommentNewline();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ALPHA) | (1L << SPACE) | (1L << HYPHEN) | (1L << PERIOD) | (1L << UNDERSCORE) | (1L << COLON) | (1L << COMMA) | (1L << SLASH) | (1L << APOSTROPHE) | (1L << EQUALS) | (1L << HASH) | (1L << BASICUNESCPAED) | (1L << PLUS))) != 0)) {
				{
				{
				setState(215);
				basicChar();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__1) {
				{
				{
				setState(221);
				nonEol();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class KeyvalContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public KeyvalSepContext keyvalSep() {
			return getRuleContext(KeyvalSepContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public KeyvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterKeyval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitKeyval(this);
		}
	}

	public final KeyvalContext keyval() throws RecognitionException {
		KeyvalContext _localctx = new KeyvalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_keyval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			key();
			setState(228);
			keyvalSep();
			setState(229);
			val();
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

	public static class KeyContext extends ParserRuleContext {
		public UnquotedKeyContext unquotedKey() {
			return getRuleContext(UnquotedKeyContext.class,0);
		}
		public QuotedKeyContext quotedKey() {
			return getRuleContext(QuotedKeyContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_key);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__19:
			case T__23:
			case ALPHA:
			case SPACE:
			case HYPHEN:
			case PERIOD:
			case UNDERSCORE:
			case EQUALS:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				unquotedKey();
				}
				break;
			case QUOTATION_MARK:
			case APOSTROPHE:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				quotedKey();
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

	public static class UnquotedKeyContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA() { return getTokens(TomlParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(TomlParser.ALPHA, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(TomlParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TomlParser.DIGIT, i);
		}
		public List<TerminalNode> HYPHEN() { return getTokens(TomlParser.HYPHEN); }
		public TerminalNode HYPHEN(int i) {
			return getToken(TomlParser.HYPHEN, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(TomlParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(TomlParser.UNDERSCORE, i);
		}
		public UnquotedKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unquotedKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterUnquotedKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitUnquotedKey(this);
		}
	}

	public final UnquotedKeyContext unquotedKey() throws RecognitionException {
		UnquotedKeyContext _localctx = new UnquotedKeyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unquotedKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHA) | (1L << HYPHEN) | (1L << UNDERSCORE) | (1L << DIGIT))) != 0)) {
				{
				{
				setState(235);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALPHA) | (1L << HYPHEN) | (1L << UNDERSCORE) | (1L << DIGIT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class QuotedKeyContext extends ParserRuleContext {
		public BasicStringContext basicString() {
			return getRuleContext(BasicStringContext.class,0);
		}
		public LiteralStringContext literalString() {
			return getRuleContext(LiteralStringContext.class,0);
		}
		public QuotedKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterQuotedKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitQuotedKey(this);
		}
	}

	public final QuotedKeyContext quotedKey() throws RecognitionException {
		QuotedKeyContext _localctx = new QuotedKeyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_quotedKey);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTATION_MARK:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				basicString();
				}
				break;
			case APOSTROPHE:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				literalString();
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

	public static class KeyvalSepContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(TomlParser.EQUALS, 0); }
		public KeyvalSepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyvalSep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterKeyvalSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitKeyvalSep(this);
		}
	}

	public final KeyvalSepContext keyvalSep() throws RecognitionException {
		KeyvalSepContext _localctx = new KeyvalSepContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_keyvalSep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			ws();
			setState(246);
			match(EQUALS);
			setState(247);
			ws();
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

	public static class ValContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public DateTimeContext dateTime() {
			return getRuleContext(DateTimeContext.class,0);
		}
		public FloatingPointContext floatingPoint() {
			return getRuleContext(FloatingPointContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_val);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				inlineTable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				dateTime();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				floatingPoint();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(255);
				integer();
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

	public static class StringContext extends ParserRuleContext {
		public MlBasicStringContext mlBasicString() {
			return getRuleContext(MlBasicStringContext.class,0);
		}
		public BasicStringContext basicString() {
			return getRuleContext(BasicStringContext.class,0);
		}
		public MlLiteralStringContext mlLiteralString() {
			return getRuleContext(MlLiteralStringContext.class,0);
		}
		public LiteralStringContext literalString() {
			return getRuleContext(LiteralStringContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_string);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				mlBasicString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				basicString();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				mlLiteralString();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				literalString();
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

	public static class BasicStringContext extends ParserRuleContext {
		public List<TerminalNode> QUOTATION_MARK() { return getTokens(TomlParser.QUOTATION_MARK); }
		public TerminalNode QUOTATION_MARK(int i) {
			return getToken(TomlParser.QUOTATION_MARK, i);
		}
		public List<BasicCharContext> basicChar() {
			return getRuleContexts(BasicCharContext.class);
		}
		public BasicCharContext basicChar(int i) {
			return getRuleContext(BasicCharContext.class,i);
		}
		public BasicStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterBasicString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitBasicString(this);
		}
	}

	public final BasicStringContext basicString() throws RecognitionException {
		BasicStringContext _localctx = new BasicStringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_basicString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(QUOTATION_MARK);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ALPHA) | (1L << SPACE) | (1L << HYPHEN) | (1L << PERIOD) | (1L << UNDERSCORE) | (1L << COLON) | (1L << COMMA) | (1L << SLASH) | (1L << APOSTROPHE) | (1L << EQUALS) | (1L << HASH) | (1L << BASICUNESCPAED) | (1L << PLUS))) != 0)) {
				{
				{
				setState(265);
				basicChar();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(QUOTATION_MARK);
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

	public static class BasicCharContext extends ParserRuleContext {
		public EscapedContext escaped() {
			return getRuleContext(EscapedContext.class,0);
		}
		public TerminalNode ALPHA() { return getToken(TomlParser.ALPHA, 0); }
		public TerminalNode BASICUNESCPAED() { return getToken(TomlParser.BASICUNESCPAED, 0); }
		public TerminalNode SPACE() { return getToken(TomlParser.SPACE, 0); }
		public TerminalNode PLUS() { return getToken(TomlParser.PLUS, 0); }
		public TerminalNode HYPHEN() { return getToken(TomlParser.HYPHEN, 0); }
		public TerminalNode PERIOD() { return getToken(TomlParser.PERIOD, 0); }
		public TerminalNode UNDERSCORE() { return getToken(TomlParser.UNDERSCORE, 0); }
		public TerminalNode COLON() { return getToken(TomlParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(TomlParser.COMMA, 0); }
		public TerminalNode SLASH() { return getToken(TomlParser.SLASH, 0); }
		public TerminalNode APOSTROPHE() { return getToken(TomlParser.APOSTROPHE, 0); }
		public TerminalNode EQUALS() { return getToken(TomlParser.EQUALS, 0); }
		public TerminalNode HASH() { return getToken(TomlParser.HASH, 0); }
		public BasicCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterBasicChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitBasicChar(this);
		}
	}

	public final BasicCharContext basicChar() throws RecognitionException {
		BasicCharContext _localctx = new BasicCharContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_basicChar);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				escaped();
				}
				break;
			case ALPHA:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(ALPHA);
				}
				break;
			case BASICUNESCPAED:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(BASICUNESCPAED);
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(SPACE);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				match(PLUS);
				}
				break;
			case HYPHEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(278);
				match(HYPHEN);
				}
				break;
			case PERIOD:
				enterOuterAlt(_localctx, 7);
				{
				setState(279);
				match(PERIOD);
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 8);
				{
				setState(280);
				match(UNDERSCORE);
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 9);
				{
				setState(281);
				match(COLON);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 10);
				{
				setState(282);
				match(COMMA);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 11);
				{
				setState(283);
				match(SLASH);
				}
				break;
			case APOSTROPHE:
				enterOuterAlt(_localctx, 12);
				{
				setState(284);
				match(APOSTROPHE);
				}
				break;
			case EQUALS:
				enterOuterAlt(_localctx, 13);
				{
				setState(285);
				match(EQUALS);
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 14);
				{
				setState(286);
				match(HASH);
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

	public static class EscapedContext extends ParserRuleContext {
		public EscapeSeqCharContext escapeSeqChar() {
			return getRuleContext(EscapeSeqCharContext.class,0);
		}
		public EscapedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escaped; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterEscaped(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitEscaped(this);
		}
	}

	public final EscapedContext escaped() throws RecognitionException {
		EscapedContext _localctx = new EscapedContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_escaped);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			escapeSeqChar();
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

	public static class EscapeSeqCharContext extends ParserRuleContext {
		public EscapeSeqCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapeSeqChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterEscapeSeqChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitEscapeSeqChar(this);
		}
	}

	public final EscapeSeqCharContext escapeSeqChar() throws RecognitionException {
		EscapeSeqCharContext _localctx = new EscapeSeqCharContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_escapeSeqChar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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

	public static class MlBasicStringContext extends ParserRuleContext {
		public List<MlBasicStringDelimContext> mlBasicStringDelim() {
			return getRuleContexts(MlBasicStringDelimContext.class);
		}
		public MlBasicStringDelimContext mlBasicStringDelim(int i) {
			return getRuleContext(MlBasicStringDelimContext.class,i);
		}
		public MlBasicBodyContext mlBasicBody() {
			return getRuleContext(MlBasicBodyContext.class,0);
		}
		public MlBasicStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlBasicString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterMlBasicString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitMlBasicString(this);
		}
	}

	public final MlBasicStringContext mlBasicString() throws RecognitionException {
		MlBasicStringContext _localctx = new MlBasicStringContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mlBasicString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			mlBasicStringDelim();
			setState(294);
			mlBasicBody();
			setState(295);
			mlBasicStringDelim();
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

	public static class MlBasicStringDelimContext extends ParserRuleContext {
		public List<TerminalNode> QUOTATION_MARK() { return getTokens(TomlParser.QUOTATION_MARK); }
		public TerminalNode QUOTATION_MARK(int i) {
			return getToken(TomlParser.QUOTATION_MARK, i);
		}
		public MlBasicStringDelimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlBasicStringDelim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterMlBasicStringDelim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitMlBasicStringDelim(this);
		}
	}

	public final MlBasicStringDelimContext mlBasicStringDelim() throws RecognitionException {
		MlBasicStringDelimContext _localctx = new MlBasicStringDelimContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mlBasicStringDelim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(QUOTATION_MARK);
			setState(298);
			match(QUOTATION_MARK);
			setState(299);
			match(QUOTATION_MARK);
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

	public static class MlBasicBodyContext extends ParserRuleContext {
		public List<MlBasicCharContext> mlBasicChar() {
			return getRuleContexts(MlBasicCharContext.class);
		}
		public MlBasicCharContext mlBasicChar(int i) {
			return getRuleContext(MlBasicCharContext.class,i);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MlBasicBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlBasicBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterMlBasicBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitMlBasicBody(this);
		}
	}

	public final MlBasicBodyContext mlBasicBody() throws RecognitionException {
		MlBasicBodyContext _localctx = new MlBasicBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mlBasicBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << MLBASICUNESCAPED))) != 0)) {
				{
				setState(307);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case MLBASICUNESCAPED:
					{
					setState(301);
					mlBasicChar();
					}
					break;
				case T__2:
				case T__3:
					{
					setState(302);
					newline();
					}
					break;
				case T__12:
					{
					{
					setState(303);
					match(T__12);
					setState(304);
					ws();
					setState(305);
					newline();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class MlBasicCharContext extends ParserRuleContext {
		public TerminalNode MLBASICUNESCAPED() { return getToken(TomlParser.MLBASICUNESCAPED, 0); }
		public EscapedContext escaped() {
			return getRuleContext(EscapedContext.class,0);
		}
		public MlBasicCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlBasicChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterMlBasicChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitMlBasicChar(this);
		}
	}

	public final MlBasicCharContext mlBasicChar() throws RecognitionException {
		MlBasicCharContext _localctx = new MlBasicCharContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mlBasicChar);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MLBASICUNESCAPED:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(MLBASICUNESCAPED);
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				escaped();
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

	public static class LiteralStringContext extends ParserRuleContext {
		public List<TerminalNode> APOSTROPHE() { return getTokens(TomlParser.APOSTROPHE); }
		public TerminalNode APOSTROPHE(int i) {
			return getToken(TomlParser.APOSTROPHE, i);
		}
		public List<TerminalNode> LITERALCHAR() { return getTokens(TomlParser.LITERALCHAR); }
		public TerminalNode LITERALCHAR(int i) {
			return getToken(TomlParser.LITERALCHAR, i);
		}
		public LiteralStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterLiteralString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitLiteralString(this);
		}
	}

	public final LiteralStringContext literalString() throws RecognitionException {
		LiteralStringContext _localctx = new LiteralStringContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_literalString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(APOSTROPHE);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LITERALCHAR) {
				{
				{
				setState(317);
				match(LITERALCHAR);
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			match(APOSTROPHE);
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

	public static class MlLiteralStringContext extends ParserRuleContext {
		public List<MlLiteralStringDelimContext> mlLiteralStringDelim() {
			return getRuleContexts(MlLiteralStringDelimContext.class);
		}
		public MlLiteralStringDelimContext mlLiteralStringDelim(int i) {
			return getRuleContext(MlLiteralStringDelimContext.class,i);
		}
		public MlLiteralBodyContext mlLiteralBody() {
			return getRuleContext(MlLiteralBodyContext.class,0);
		}
		public MlLiteralStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlLiteralString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterMlLiteralString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitMlLiteralString(this);
		}
	}

	public final MlLiteralStringContext mlLiteralString() throws RecognitionException {
		MlLiteralStringContext _localctx = new MlLiteralStringContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_mlLiteralString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			mlLiteralStringDelim();
			setState(326);
			mlLiteralBody();
			setState(327);
			mlLiteralStringDelim();
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

	public static class MlLiteralStringDelimContext extends ParserRuleContext {
		public List<TerminalNode> APOSTROPHE() { return getTokens(TomlParser.APOSTROPHE); }
		public TerminalNode APOSTROPHE(int i) {
			return getToken(TomlParser.APOSTROPHE, i);
		}
		public MlLiteralStringDelimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlLiteralStringDelim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterMlLiteralStringDelim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitMlLiteralStringDelim(this);
		}
	}

	public final MlLiteralStringDelimContext mlLiteralStringDelim() throws RecognitionException {
		MlLiteralStringDelimContext _localctx = new MlLiteralStringDelimContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mlLiteralStringDelim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(APOSTROPHE);
			setState(330);
			match(APOSTROPHE);
			setState(331);
			match(APOSTROPHE);
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

	public static class MlLiteralBodyContext extends ParserRuleContext {
		public List<TerminalNode> MLLITERALCHAR() { return getTokens(TomlParser.MLLITERALCHAR); }
		public TerminalNode MLLITERALCHAR(int i) {
			return getToken(TomlParser.MLLITERALCHAR, i);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public MlLiteralBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mlLiteralBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterMlLiteralBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitMlLiteralBody(this);
		}
	}

	public final MlLiteralBodyContext mlLiteralBody() throws RecognitionException {
		MlLiteralBodyContext _localctx = new MlLiteralBodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_mlLiteralBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << MLLITERALCHAR))) != 0)) {
				{
				setState(335);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MLLITERALCHAR:
					{
					setState(333);
					match(MLLITERALCHAR);
					}
					break;
				case T__2:
				case T__3:
					{
					setState(334);
					newline();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class IntegerContext extends ParserRuleContext {
		public DecIntContext decInt() {
			return getRuleContext(DecIntContext.class,0);
		}
		public HexIntContext hexInt() {
			return getRuleContext(HexIntContext.class,0);
		}
		public OctIntContext octInt() {
			return getRuleContext(OctIntContext.class,0);
		}
		public BinIntContext binInt() {
			return getRuleContext(BinIntContext.class,0);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_integer);
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HYPHEN:
			case PLUS:
			case DIGIT19:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				decInt();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				hexInt();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				octInt();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
				binInt();
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

	public static class MinusContext extends ParserRuleContext {
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitMinus(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		MinusContext _localctx = new MinusContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(HYPHEN);
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

	public static class HexPrefixContext extends ParserRuleContext {
		public HexPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterHexPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitHexPrefix(this);
		}
	}

	public final HexPrefixContext hexPrefix() throws RecognitionException {
		HexPrefixContext _localctx = new HexPrefixContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_hexPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(T__13);
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

	public static class OctPrefixContext extends ParserRuleContext {
		public OctPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterOctPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitOctPrefix(this);
		}
	}

	public final OctPrefixContext octPrefix() throws RecognitionException {
		OctPrefixContext _localctx = new OctPrefixContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_octPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__14);
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

	public static class BinPrefixContext extends ParserRuleContext {
		public BinPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterBinPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitBinPrefix(this);
		}
	}

	public final BinPrefixContext binPrefix() throws RecognitionException {
		BinPrefixContext _localctx = new BinPrefixContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_binPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__15);
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

	public static class DecIntContext extends ParserRuleContext {
		public UnsignedDecIntContext unsignedDecInt() {
			return getRuleContext(UnsignedDecIntContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(TomlParser.PLUS, 0); }
		public DecIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterDecInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitDecInt(this);
		}
	}

	public final DecIntContext decInt() throws RecognitionException {
		DecIntContext _localctx = new DecIntContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_decInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HYPHEN:
				{
				setState(354);
				minus();
				}
				break;
			case PLUS:
				{
				setState(355);
				match(PLUS);
				}
				break;
			case DIGIT19:
			case DIGIT:
				break;
			default:
				break;
			}
			setState(358);
			unsignedDecInt();
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

	public static class UnsignedDecIntContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(TomlParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TomlParser.DIGIT, i);
		}
		public TerminalNode DIGIT19() { return getToken(TomlParser.DIGIT19, 0); }
		public List<TerminalNode> UNDERSCORE() { return getTokens(TomlParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(TomlParser.UNDERSCORE, i);
		}
		public UnsignedDecIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedDecInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterUnsignedDecInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitUnsignedDecInt(this);
		}
	}

	public final UnsignedDecIntContext unsignedDecInt() throws RecognitionException {
		UnsignedDecIntContext _localctx = new UnsignedDecIntContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_unsignedDecInt);
		int _la;
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(DIGIT);
				}
				break;
			case DIGIT19:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(DIGIT19);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==UNDERSCORE || _la==DIGIT) {
					{
					setState(365);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DIGIT:
						{
						setState(362);
						match(DIGIT);
						}
						break;
					case UNDERSCORE:
						{
						setState(363);
						match(UNDERSCORE);
						setState(364);
						match(DIGIT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class HexIntContext extends ParserRuleContext {
		public HexPrefixContext hexPrefix() {
			return getRuleContext(HexPrefixContext.class,0);
		}
		public List<TerminalNode> HEXDIG() { return getTokens(TomlParser.HEXDIG); }
		public TerminalNode HEXDIG(int i) {
			return getToken(TomlParser.HEXDIG, i);
		}
		public TerminalNode UNDERSCORE() { return getToken(TomlParser.UNDERSCORE, 0); }
		public HexIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterHexInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitHexInt(this);
		}
	}

	public final HexIntContext hexInt() throws RecognitionException {
		HexIntContext _localctx = new HexIntContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_hexInt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			hexPrefix();
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(373);
					match(HEXDIG);
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEXDIG:
				{
				setState(379);
				match(HEXDIG);
				}
				break;
			case UNDERSCORE:
				{
				setState(380);
				match(UNDERSCORE);
				setState(381);
				match(HEXDIG);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OctIntContext extends ParserRuleContext {
		public OctPrefixContext octPrefix() {
			return getRuleContext(OctPrefixContext.class,0);
		}
		public List<TerminalNode> DIGIT07() { return getTokens(TomlParser.DIGIT07); }
		public TerminalNode DIGIT07(int i) {
			return getToken(TomlParser.DIGIT07, i);
		}
		public TerminalNode UNDERSCORE() { return getToken(TomlParser.UNDERSCORE, 0); }
		public OctIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterOctInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitOctInt(this);
		}
	}

	public final OctIntContext octInt() throws RecognitionException {
		OctIntContext _localctx = new OctIntContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_octInt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			octPrefix();
			setState(388);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(385);
					match(DIGIT07);
					}
					} 
				}
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT07:
				{
				setState(391);
				match(DIGIT07);
				}
				break;
			case UNDERSCORE:
				{
				setState(392);
				match(UNDERSCORE);
				setState(393);
				match(DIGIT07);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BinIntContext extends ParserRuleContext {
		public BinPrefixContext binPrefix() {
			return getRuleContext(BinPrefixContext.class,0);
		}
		public List<TerminalNode> DIGIT01() { return getTokens(TomlParser.DIGIT01); }
		public TerminalNode DIGIT01(int i) {
			return getToken(TomlParser.DIGIT01, i);
		}
		public TerminalNode UNDERSCORE() { return getToken(TomlParser.UNDERSCORE, 0); }
		public BinIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterBinInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitBinInt(this);
		}
	}

	public final BinIntContext binInt() throws RecognitionException {
		BinIntContext _localctx = new BinIntContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_binInt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			binPrefix();
			setState(400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(397);
					match(DIGIT01);
					}
					} 
				}
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT01:
				{
				setState(403);
				match(DIGIT01);
				}
				break;
			case UNDERSCORE:
				{
				setState(404);
				match(UNDERSCORE);
				setState(405);
				match(DIGIT01);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FloatingPointContext extends ParserRuleContext {
		public FloatIntPartContext floatIntPart() {
			return getRuleContext(FloatIntPartContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FracContext frac() {
			return getRuleContext(FracContext.class,0);
		}
		public SpecialFloatContext specialFloat() {
			return getRuleContext(SpecialFloatContext.class,0);
		}
		public FloatingPointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterFloatingPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitFloatingPoint(this);
		}
	}

	public final FloatingPointContext floatingPoint() throws RecognitionException {
		FloatingPointContext _localctx = new FloatingPointContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_floatingPoint);
		int _la;
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				floatIntPart();
				setState(414);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case E:
					{
					setState(409);
					exp();
					}
					break;
				case PERIOD:
					{
					setState(410);
					frac();
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==E) {
						{
						setState(411);
						exp();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				specialFloat();
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

	public static class FloatIntPartContext extends ParserRuleContext {
		public DecIntContext decInt() {
			return getRuleContext(DecIntContext.class,0);
		}
		public FloatIntPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatIntPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterFloatIntPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitFloatIntPart(this);
		}
	}

	public final FloatIntPartContext floatIntPart() throws RecognitionException {
		FloatIntPartContext _localctx = new FloatIntPartContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_floatIntPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			decInt();
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

	public static class FracContext extends ParserRuleContext {
		public DecimalPointContext decimalPoint() {
			return getRuleContext(DecimalPointContext.class,0);
		}
		public ZeroPrefixableIntContext zeroPrefixableInt() {
			return getRuleContext(ZeroPrefixableIntContext.class,0);
		}
		public FracContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterFrac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitFrac(this);
		}
	}

	public final FracContext frac() throws RecognitionException {
		FracContext _localctx = new FracContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_frac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			decimalPoint();
			setState(422);
			zeroPrefixableInt();
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

	public static class DecimalPointContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(TomlParser.PERIOD, 0); }
		public DecimalPointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalPoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterDecimalPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitDecimalPoint(this);
		}
	}

	public final DecimalPointContext decimalPoint() throws RecognitionException {
		DecimalPointContext _localctx = new DecimalPointContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_decimalPoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(PERIOD);
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

	public static class ZeroPrefixableIntContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(TomlParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TomlParser.DIGIT, i);
		}
		public List<TerminalNode> UNDERSCORE() { return getTokens(TomlParser.UNDERSCORE); }
		public TerminalNode UNDERSCORE(int i) {
			return getToken(TomlParser.UNDERSCORE, i);
		}
		public ZeroPrefixableIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeroPrefixableInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterZeroPrefixableInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitZeroPrefixableInt(this);
		}
	}

	public final ZeroPrefixableIntContext zeroPrefixableInt() throws RecognitionException {
		ZeroPrefixableIntContext _localctx = new ZeroPrefixableIntContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_zeroPrefixableInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(DIGIT);
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNDERSCORE || _la==DIGIT) {
				{
				setState(430);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIGIT:
					{
					setState(427);
					match(DIGIT);
					}
					break;
				case UNDERSCORE:
					{
					setState(428);
					match(UNDERSCORE);
					setState(429);
					match(DIGIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode E() { return getToken(TomlParser.E, 0); }
		public FloatIntPartContext floatIntPart() {
			return getRuleContext(FloatIntPartContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(E);
			setState(436);
			floatIntPart();
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

	public static class SpecialFloatContext extends ParserRuleContext {
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public InfContext inf() {
			return getRuleContext(InfContext.class,0);
		}
		public NanContext nan() {
			return getRuleContext(NanContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(TomlParser.PLUS, 0); }
		public SpecialFloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterSpecialFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitSpecialFloat(this);
		}
	}

	public final SpecialFloatContext specialFloat() throws RecognitionException {
		SpecialFloatContext _localctx = new SpecialFloatContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_specialFloat);
		int _la;
		try {
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HYPHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				minus();
				}
				break;
			case T__16:
			case T__17:
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS) {
					{
					setState(439);
					match(PLUS);
					}
				}

				setState(444);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__16:
					{
					setState(442);
					inf();
					}
					break;
				case T__17:
					{
					setState(443);
					nan();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class InfContext extends ParserRuleContext {
		public InfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterInf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitInf(this);
		}
	}

	public final InfContext inf() throws RecognitionException {
		InfContext _localctx = new InfContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_inf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(T__16);
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

	public static class NanContext extends ParserRuleContext {
		public NanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterNan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitNan(this);
		}
	}

	public final NanContext nan() throws RecognitionException {
		NanContext _localctx = new NanContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_nan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(T__17);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(TomlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TomlParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class DateTimeContext extends ParserRuleContext {
		public OffsetDateTimeContext offsetDateTime() {
			return getRuleContext(OffsetDateTimeContext.class,0);
		}
		public LocalDateTimeContext localDateTime() {
			return getRuleContext(LocalDateTimeContext.class,0);
		}
		public LocalDateContext localDate() {
			return getRuleContext(LocalDateContext.class,0);
		}
		public LocalTimeContext localTime() {
			return getRuleContext(LocalTimeContext.class,0);
		}
		public DateTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterDateTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitDateTime(this);
		}
	}

	public final DateTimeContext dateTime() throws RecognitionException {
		DateTimeContext _localctx = new DateTimeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_dateTime);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				offsetDateTime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				localDateTime();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				localDate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(457);
				localTime();
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

	public static class DateFullyearContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(TomlParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TomlParser.DIGIT, i);
		}
		public DateFullyearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateFullyear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterDateFullyear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitDateFullyear(this);
		}
	}

	public final DateFullyearContext dateFullyear() throws RecognitionException {
		DateFullyearContext _localctx = new DateFullyearContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_dateFullyear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(DIGIT);
			setState(461);
			match(DIGIT);
			setState(462);
			match(DIGIT);
			setState(463);
			match(DIGIT);
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

	public static class DateMonthContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(TomlParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TomlParser.DIGIT, i);
		}
		public DateMonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateMonth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterDateMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitDateMonth(this);
		}
	}

	public final DateMonthContext dateMonth() throws RecognitionException {
		DateMonthContext _localctx = new DateMonthContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dateMonth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(DIGIT);
			setState(466);
			match(DIGIT);
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

	public static class DateMdayContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(TomlParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TomlParser.DIGIT, i);
		}
		public DateMdayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateMday; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterDateMday(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitDateMday(this);
		}
	}

	public final DateMdayContext dateMday() throws RecognitionException {
		DateMdayContext _localctx = new DateMdayContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_dateMday);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(DIGIT);
			setState(469);
			match(DIGIT);
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

	public static class TimeDelimContext extends ParserRuleContext {
		public TerminalNode UPPERCASE_T() { return getToken(TomlParser.UPPERCASE_T, 0); }
		public TerminalNode LOWERCASE_T() { return getToken(TomlParser.LOWERCASE_T, 0); }
		public TimeDelimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeDelim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterTimeDelim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitTimeDelim(this);
		}
	}

	public final TimeDelimContext timeDelim() throws RecognitionException {
		TimeDelimContext _localctx = new TimeDelimContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_timeDelim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << UPPERCASE_T) | (1L << LOWERCASE_T))) != 0)) ) {
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

	public static class TimeHourContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(TomlParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TomlParser.DIGIT, i);
		}
		public TimeHourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeHour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterTimeHour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitTimeHour(this);
		}
	}

	public final TimeHourContext timeHour() throws RecognitionException {
		TimeHourContext _localctx = new TimeHourContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_timeHour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(DIGIT);
			setState(474);
			match(DIGIT);
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

	public static class TimeMinuteContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(TomlParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TomlParser.DIGIT, i);
		}
		public TimeMinuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeMinute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterTimeMinute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitTimeMinute(this);
		}
	}

	public final TimeMinuteContext timeMinute() throws RecognitionException {
		TimeMinuteContext _localctx = new TimeMinuteContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_timeMinute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(DIGIT);
			setState(477);
			match(DIGIT);
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

	public static class TimeSecondContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(TomlParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(TomlParser.DIGIT, i);
		}
		public TimeSecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeSecond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterTimeSecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitTimeSecond(this);
		}
	}

	public final TimeSecondContext timeSecond() throws RecognitionException {
		TimeSecondContext _localctx = new TimeSecondContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_timeSecond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(DIGIT);
			setState(480);
			match(DIGIT);
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

	public static class TimeSecfracContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(TomlParser.PERIOD, 0); }
		public TerminalNode DIGIT() { return getToken(TomlParser.DIGIT, 0); }
		public TimeSecfracContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeSecfrac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterTimeSecfrac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitTimeSecfrac(this);
		}
	}

	public final TimeSecfracContext timeSecfrac() throws RecognitionException {
		TimeSecfracContext _localctx = new TimeSecfracContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_timeSecfrac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(PERIOD);
			setState(483);
			match(DIGIT);
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

	public static class TimeNumoffsetContext extends ParserRuleContext {
		public TimeHourContext timeHour() {
			return getRuleContext(TimeHourContext.class,0);
		}
		public TerminalNode COLON() { return getToken(TomlParser.COLON, 0); }
		public TimeMinuteContext timeMinute() {
			return getRuleContext(TimeMinuteContext.class,0);
		}
		public TerminalNode HYPHEN() { return getToken(TomlParser.HYPHEN, 0); }
		public TimeNumoffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeNumoffset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterTimeNumoffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitTimeNumoffset(this);
		}
	}

	public final TimeNumoffsetContext timeNumoffset() throws RecognitionException {
		TimeNumoffsetContext _localctx = new TimeNumoffsetContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_timeNumoffset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_la = _input.LA(1);
			if ( !(_la==HYPHEN || _la==PLUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(486);
			timeHour();
			setState(487);
			match(COLON);
			setState(488);
			timeMinute();
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

	public static class TimeOffsetContext extends ParserRuleContext {
		public TerminalNode UPPERCASE_Z() { return getToken(TomlParser.UPPERCASE_Z, 0); }
		public TimeNumoffsetContext timeNumoffset() {
			return getRuleContext(TimeNumoffsetContext.class,0);
		}
		public TimeOffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeOffset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterTimeOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitTimeOffset(this);
		}
	}

	public final TimeOffsetContext timeOffset() throws RecognitionException {
		TimeOffsetContext _localctx = new TimeOffsetContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_timeOffset);
		try {
			setState(492);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPPERCASE_Z:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				match(UPPERCASE_Z);
				}
				break;
			case HYPHEN:
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				timeNumoffset();
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

	public static class PartialTimeContext extends ParserRuleContext {
		public TimeHourContext timeHour() {
			return getRuleContext(TimeHourContext.class,0);
		}
		public List<TerminalNode> COLON() { return getTokens(TomlParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TomlParser.COLON, i);
		}
		public TimeMinuteContext timeMinute() {
			return getRuleContext(TimeMinuteContext.class,0);
		}
		public TimeSecondContext timeSecond() {
			return getRuleContext(TimeSecondContext.class,0);
		}
		public TimeSecfracContext timeSecfrac() {
			return getRuleContext(TimeSecfracContext.class,0);
		}
		public PartialTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterPartialTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitPartialTime(this);
		}
	}

	public final PartialTimeContext partialTime() throws RecognitionException {
		PartialTimeContext _localctx = new PartialTimeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_partialTime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			timeHour();
			setState(495);
			match(COLON);
			setState(496);
			timeMinute();
			setState(497);
			match(COLON);
			setState(498);
			timeSecond();
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERIOD) {
				{
				setState(499);
				timeSecfrac();
				}
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

	public static class FullDateContext extends ParserRuleContext {
		public DateFullyearContext dateFullyear() {
			return getRuleContext(DateFullyearContext.class,0);
		}
		public List<TerminalNode> HYPHEN() { return getTokens(TomlParser.HYPHEN); }
		public TerminalNode HYPHEN(int i) {
			return getToken(TomlParser.HYPHEN, i);
		}
		public DateMonthContext dateMonth() {
			return getRuleContext(DateMonthContext.class,0);
		}
		public DateMdayContext dateMday() {
			return getRuleContext(DateMdayContext.class,0);
		}
		public FullDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterFullDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitFullDate(this);
		}
	}

	public final FullDateContext fullDate() throws RecognitionException {
		FullDateContext _localctx = new FullDateContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_fullDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			dateFullyear();
			setState(503);
			match(HYPHEN);
			setState(504);
			dateMonth();
			setState(505);
			match(HYPHEN);
			setState(506);
			dateMday();
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

	public static class FullTimeContext extends ParserRuleContext {
		public PartialTimeContext partialTime() {
			return getRuleContext(PartialTimeContext.class,0);
		}
		public TimeOffsetContext timeOffset() {
			return getRuleContext(TimeOffsetContext.class,0);
		}
		public FullTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterFullTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitFullTime(this);
		}
	}

	public final FullTimeContext fullTime() throws RecognitionException {
		FullTimeContext _localctx = new FullTimeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_fullTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			partialTime();
			setState(509);
			timeOffset();
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

	public static class OffsetDateTimeContext extends ParserRuleContext {
		public FullDateContext fullDate() {
			return getRuleContext(FullDateContext.class,0);
		}
		public TimeDelimContext timeDelim() {
			return getRuleContext(TimeDelimContext.class,0);
		}
		public FullTimeContext fullTime() {
			return getRuleContext(FullTimeContext.class,0);
		}
		public OffsetDateTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetDateTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterOffsetDateTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitOffsetDateTime(this);
		}
	}

	public final OffsetDateTimeContext offsetDateTime() throws RecognitionException {
		OffsetDateTimeContext _localctx = new OffsetDateTimeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_offsetDateTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			fullDate();
			setState(512);
			timeDelim();
			setState(513);
			fullTime();
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

	public static class LocalDateTimeContext extends ParserRuleContext {
		public FullDateContext fullDate() {
			return getRuleContext(FullDateContext.class,0);
		}
		public TimeDelimContext timeDelim() {
			return getRuleContext(TimeDelimContext.class,0);
		}
		public PartialTimeContext partialTime() {
			return getRuleContext(PartialTimeContext.class,0);
		}
		public LocalDateTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDateTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterLocalDateTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitLocalDateTime(this);
		}
	}

	public final LocalDateTimeContext localDateTime() throws RecognitionException {
		LocalDateTimeContext _localctx = new LocalDateTimeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_localDateTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			fullDate();
			setState(516);
			timeDelim();
			setState(517);
			partialTime();
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

	public static class LocalDateContext extends ParserRuleContext {
		public FullDateContext fullDate() {
			return getRuleContext(FullDateContext.class,0);
		}
		public LocalDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterLocalDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitLocalDate(this);
		}
	}

	public final LocalDateContext localDate() throws RecognitionException {
		LocalDateContext _localctx = new LocalDateContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_localDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			fullDate();
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

	public static class LocalTimeContext extends ParserRuleContext {
		public PartialTimeContext partialTime() {
			return getRuleContext(PartialTimeContext.class,0);
		}
		public LocalTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterLocalTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitLocalTime(this);
		}
	}

	public final LocalTimeContext localTime() throws RecognitionException {
		LocalTimeContext _localctx = new LocalTimeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_localTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			partialTime();
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

	public static class ArrayContext extends ParserRuleContext {
		public ArrayOpenContext arrayOpen() {
			return getRuleContext(ArrayOpenContext.class,0);
		}
		public ArrayValuesContext arrayValues() {
			return getRuleContext(ArrayValuesContext.class,0);
		}
		public WsCommentNewlineContext wsCommentNewline() {
			return getRuleContext(WsCommentNewlineContext.class,0);
		}
		public ArrayCloseContext arrayClose() {
			return getRuleContext(ArrayCloseContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			arrayOpen();
			setState(524);
			arrayValues();
			setState(525);
			wsCommentNewline();
			setState(526);
			arrayClose();
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

	public static class ArrayOpenContext extends ParserRuleContext {
		public ArrayOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayOpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterArrayOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitArrayOpen(this);
		}
	}

	public final ArrayOpenContext arrayOpen() throws RecognitionException {
		ArrayOpenContext _localctx = new ArrayOpenContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_arrayOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(T__18);
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

	public static class ArrayCloseContext extends ParserRuleContext {
		public ArrayCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayClose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterArrayClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitArrayClose(this);
		}
	}

	public final ArrayCloseContext arrayClose() throws RecognitionException {
		ArrayCloseContext _localctx = new ArrayCloseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_arrayClose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(T__19);
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

	public static class ArrayValuesContext extends ParserRuleContext {
		public List<WsCommentNewlineContext> wsCommentNewline() {
			return getRuleContexts(WsCommentNewlineContext.class);
		}
		public WsCommentNewlineContext wsCommentNewline(int i) {
			return getRuleContext(WsCommentNewlineContext.class,i);
		}
		public List<ArrayvalsNonEmptyContext> arrayvalsNonEmpty() {
			return getRuleContexts(ArrayvalsNonEmptyContext.class);
		}
		public ArrayvalsNonEmptyContext arrayvalsNonEmpty(int i) {
			return getRuleContext(ArrayvalsNonEmptyContext.class,i);
		}
		public List<ArraySepContext> arraySep() {
			return getRuleContexts(ArraySepContext.class);
		}
		public ArraySepContext arraySep(int i) {
			return getRuleContext(ArraySepContext.class,i);
		}
		public ArrayValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterArrayValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitArrayValues(this);
		}
	}

	public final ArrayValuesContext arrayValues() throws RecognitionException {
		ArrayValuesContext _localctx = new ArrayValuesContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_arrayValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			wsCommentNewline();
			setState(533);
			arrayvalsNonEmpty();
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(534);
				arraySep();
				setState(535);
				wsCommentNewline();
				setState(536);
				arrayvalsNonEmpty();
				}
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ArrayvalsNonEmptyContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ArrayvalsNonEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayvalsNonEmpty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterArrayvalsNonEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitArrayvalsNonEmpty(this);
		}
	}

	public final ArrayvalsNonEmptyContext arrayvalsNonEmpty() throws RecognitionException {
		ArrayvalsNonEmptyContext _localctx = new ArrayvalsNonEmptyContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_arrayvalsNonEmpty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			val();
			setState(544);
			ws();
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

	public static class ArraySepContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(TomlParser.COMMA, 0); }
		public ArraySepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterArraySep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitArraySep(this);
		}
	}

	public final ArraySepContext arraySep() throws RecognitionException {
		ArraySepContext _localctx = new ArraySepContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_arraySep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(COMMA);
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

	public static class WsCommentNewlineContext extends ParserRuleContext {
		public List<WscharContext> wschar() {
			return getRuleContexts(WscharContext.class);
		}
		public WscharContext wschar(int i) {
			return getRuleContext(WscharContext.class,i);
		}
		public List<NewlineContext> newline() {
			return getRuleContexts(NewlineContext.class);
		}
		public NewlineContext newline(int i) {
			return getRuleContext(NewlineContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public WsCommentNewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wsCommentNewline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterWsCommentNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitWsCommentNewline(this);
		}
	}

	public final WsCommentNewlineContext wsCommentNewline() throws RecognitionException {
		WsCommentNewlineContext _localctx = new WsCommentNewlineContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_wsCommentNewline);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(553);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(548);
						wschar();
						}
						break;
					case 2:
						{
						setState(550);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==HASH) {
							{
							setState(549);
							comment();
							}
						}

						setState(552);
						newline();
						}
						break;
					}
					} 
				}
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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

	public static class TableContext extends ParserRuleContext {
		public StdTableContext stdTable() {
			return getRuleContext(StdTableContext.class,0);
		}
		public ArrayTableContext arrayTable() {
			return getRuleContext(ArrayTableContext.class,0);
		}
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitTable(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_table);
		try {
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				stdTable();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				arrayTable();
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

	public static class StdTableContext extends ParserRuleContext {
		public StdTableOpenContext stdTableOpen() {
			return getRuleContext(StdTableOpenContext.class,0);
		}
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public StdTableCloseContext stdTableClose() {
			return getRuleContext(StdTableCloseContext.class,0);
		}
		public List<TableKeySepContext> tableKeySep() {
			return getRuleContexts(TableKeySepContext.class);
		}
		public TableKeySepContext tableKeySep(int i) {
			return getRuleContext(TableKeySepContext.class,i);
		}
		public StdTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterStdTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitStdTable(this);
		}
	}

	public final StdTableContext stdTable() throws RecognitionException {
		StdTableContext _localctx = new StdTableContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_stdTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			stdTableOpen();
			setState(563);
			key();
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERIOD) {
				{
				{
				setState(564);
				tableKeySep();
				setState(565);
				key();
				}
				}
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(572);
			stdTableClose();
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

	public static class StdTableOpenContext extends ParserRuleContext {
		public StdTableOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdTableOpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterStdTableOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitStdTableOpen(this);
		}
	}

	public final StdTableOpenContext stdTableOpen() throws RecognitionException {
		StdTableOpenContext _localctx = new StdTableOpenContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_stdTableOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(T__18);
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

	public static class StdTableCloseContext extends ParserRuleContext {
		public StdTableCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdTableClose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterStdTableClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitStdTableClose(this);
		}
	}

	public final StdTableCloseContext stdTableClose() throws RecognitionException {
		StdTableCloseContext _localctx = new StdTableCloseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_stdTableClose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(T__19);
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

	public static class TableKeySepContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(TomlParser.PERIOD, 0); }
		public TableKeySepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableKeySep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterTableKeySep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitTableKeySep(this);
		}
	}

	public final TableKeySepContext tableKeySep() throws RecognitionException {
		TableKeySepContext _localctx = new TableKeySepContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_tableKeySep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(PERIOD);
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

	public static class InlineTableContext extends ParserRuleContext {
		public InlineTableOpenContext inlineTableOpen() {
			return getRuleContext(InlineTableOpenContext.class,0);
		}
		public InlineTableKeyvalsContext inlineTableKeyvals() {
			return getRuleContext(InlineTableKeyvalsContext.class,0);
		}
		public WsCommentNewlineContext wsCommentNewline() {
			return getRuleContext(WsCommentNewlineContext.class,0);
		}
		public InlineTableCloseContext inlineTableClose() {
			return getRuleContext(InlineTableCloseContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitInlineTable(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_inlineTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			inlineTableOpen();
			setState(581);
			inlineTableKeyvals();
			setState(582);
			wsCommentNewline();
			setState(583);
			inlineTableClose();
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

	public static class InlineTableOpenContext extends ParserRuleContext {
		public InlineTableOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTableOpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterInlineTableOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitInlineTableOpen(this);
		}
	}

	public final InlineTableOpenContext inlineTableOpen() throws RecognitionException {
		InlineTableOpenContext _localctx = new InlineTableOpenContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_inlineTableOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(T__20);
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

	public static class InlineTableCloseContext extends ParserRuleContext {
		public InlineTableCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTableClose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterInlineTableClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitInlineTableClose(this);
		}
	}

	public final InlineTableCloseContext inlineTableClose() throws RecognitionException {
		InlineTableCloseContext _localctx = new InlineTableCloseContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_inlineTableClose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(T__21);
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

	public static class InlineTableSepContext extends ParserRuleContext {
		public InlineTableSepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTableSep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterInlineTableSep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitInlineTableSep(this);
		}
	}

	public final InlineTableSepContext inlineTableSep() throws RecognitionException {
		InlineTableSepContext _localctx = new InlineTableSepContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_inlineTableSep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(COMMA);
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

	public static class InlineTableKeyvalsContext extends ParserRuleContext {
		public List<WsCommentNewlineContext> wsCommentNewline() {
			return getRuleContexts(WsCommentNewlineContext.class);
		}
		public WsCommentNewlineContext wsCommentNewline(int i) {
			return getRuleContext(WsCommentNewlineContext.class,i);
		}
		public List<InlineTableKeyvalsNonEmptyContext> inlineTableKeyvalsNonEmpty() {
			return getRuleContexts(InlineTableKeyvalsNonEmptyContext.class);
		}
		public InlineTableKeyvalsNonEmptyContext inlineTableKeyvalsNonEmpty(int i) {
			return getRuleContext(InlineTableKeyvalsNonEmptyContext.class,i);
		}
		public List<InlineTableSepContext> inlineTableSep() {
			return getRuleContexts(InlineTableSepContext.class);
		}
		public InlineTableSepContext inlineTableSep(int i) {
			return getRuleContext(InlineTableSepContext.class,i);
		}
		public InlineTableKeyvalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTableKeyvals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterInlineTableKeyvals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitInlineTableKeyvals(this);
		}
	}

	public final InlineTableKeyvalsContext inlineTableKeyvals() throws RecognitionException {
		InlineTableKeyvalsContext _localctx = new InlineTableKeyvalsContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_inlineTableKeyvals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			wsCommentNewline();
			setState(592);
			inlineTableKeyvalsNonEmpty();
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(593);
				inlineTableSep();
				setState(594);
				wsCommentNewline();
				setState(595);
				inlineTableKeyvalsNonEmpty();
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InlineTableKeyvalsNonEmptyContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public KeyvalSepContext keyvalSep() {
			return getRuleContext(KeyvalSepContext.class,0);
		}
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public InlineTableKeyvalsNonEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTableKeyvalsNonEmpty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterInlineTableKeyvalsNonEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitInlineTableKeyvalsNonEmpty(this);
		}
	}

	public final InlineTableKeyvalsNonEmptyContext inlineTableKeyvalsNonEmpty() throws RecognitionException {
		InlineTableKeyvalsNonEmptyContext _localctx = new InlineTableKeyvalsNonEmptyContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_inlineTableKeyvalsNonEmpty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			key();
			setState(603);
			keyvalSep();
			setState(604);
			val();
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

	public static class ArrayTableContext extends ParserRuleContext {
		public ArrayTableOpenContext arrayTableOpen() {
			return getRuleContext(ArrayTableOpenContext.class,0);
		}
		public List<KeyContext> key() {
			return getRuleContexts(KeyContext.class);
		}
		public KeyContext key(int i) {
			return getRuleContext(KeyContext.class,i);
		}
		public ArrayTableCloseContext arrayTableClose() {
			return getRuleContext(ArrayTableCloseContext.class,0);
		}
		public List<TableKeySepContext> tableKeySep() {
			return getRuleContexts(TableKeySepContext.class);
		}
		public TableKeySepContext tableKeySep(int i) {
			return getRuleContext(TableKeySepContext.class,i);
		}
		public ArrayTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterArrayTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitArrayTable(this);
		}
	}

	public final ArrayTableContext arrayTable() throws RecognitionException {
		ArrayTableContext _localctx = new ArrayTableContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_arrayTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			arrayTableOpen();
			setState(607);
			key();
			setState(613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERIOD) {
				{
				{
				setState(608);
				tableKeySep();
				setState(609);
				key();
				}
				}
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(616);
			arrayTableClose();
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

	public static class ArrayTableOpenContext extends ParserRuleContext {
		public ArrayTableOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayTableOpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterArrayTableOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitArrayTableOpen(this);
		}
	}

	public final ArrayTableOpenContext arrayTableOpen() throws RecognitionException {
		ArrayTableOpenContext _localctx = new ArrayTableOpenContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_arrayTableOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(T__22);
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

	public static class ArrayTableCloseContext extends ParserRuleContext {
		public ArrayTableCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayTableClose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).enterArrayTableClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TomlListener ) ((TomlListener)listener).exitArrayTableClose(this);
		}
	}

	public final ArrayTableCloseContext arrayTableClose() throws RecognitionException {
		ArrayTableCloseContext _localctx = new ArrayTableCloseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_arrayTableClose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(T__23);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0271\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\3\2\7\2\u00b3\n\2\f\2\16\2\u00b6\13\2\3"+
		"\3\3\3\5\3\u00ba\n\3\3\3\3\3\3\3\3\3\5\3\u00c0\n\3\3\3\3\3\3\3\3\3\5\3"+
		"\u00c6\n\3\5\3\u00c8\n\3\3\4\7\4\u00cb\n\4\f\4\16\4\u00ce\13\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\7\t\u00db\n\t\f\t\16\t\u00de\13\t"+
		"\3\t\7\t\u00e1\n\t\f\t\16\t\u00e4\13\t\3\n\3\n\3\n\3\n\3\13\3\13\5\13"+
		"\u00ec\n\13\3\f\7\f\u00ef\n\f\f\f\16\f\u00f2\13\f\3\r\3\r\5\r\u00f6\n"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0103\n"+
		"\17\3\20\3\20\3\20\3\20\5\20\u0109\n\20\3\21\3\21\7\21\u010d\n\21\f\21"+
		"\16\21\u0110\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u0122\n\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27"+
		"\u0136\n\27\f\27\16\27\u0139\13\27\3\30\3\30\5\30\u013d\n\30\3\31\3\31"+
		"\7\31\u0141\n\31\f\31\16\31\u0144\13\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u0152\n\34\f\34\16\34\u0155\13\34"+
		"\3\35\3\35\3\35\3\35\5\35\u015b\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\5\"\u0167\n\"\3\"\3\"\3#\3#\3#\3#\3#\7#\u0170\n#\f#\16#\u0173\13"+
		"#\5#\u0175\n#\3$\3$\7$\u0179\n$\f$\16$\u017c\13$\3$\3$\3$\5$\u0181\n$"+
		"\3%\3%\7%\u0185\n%\f%\16%\u0188\13%\3%\3%\3%\5%\u018d\n%\3&\3&\7&\u0191"+
		"\n&\f&\16&\u0194\13&\3&\3&\3&\5&\u0199\n&\3\'\3\'\3\'\3\'\5\'\u019f\n"+
		"\'\5\'\u01a1\n\'\3\'\5\'\u01a4\n\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3+\7"+
		"+\u01b1\n+\f+\16+\u01b4\13+\3,\3,\3,\3-\3-\5-\u01bb\n-\3-\3-\5-\u01bf"+
		"\n-\5-\u01c1\n-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u01cd\n"+
		"\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3:\3:\3;\3;\5"+
		";\u01ef\n;\3<\3<\3<\3<\3<\3<\5<\u01f7\n<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3"+
		"?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3B\3B\3C\3C\3C\3C\3C\3D\3D\3E\3E\3F\3F\3"+
		"F\3F\3F\3F\7F\u021d\nF\fF\16F\u0220\13F\3G\3G\3G\3H\3H\3I\3I\5I\u0229"+
		"\nI\3I\7I\u022c\nI\fI\16I\u022f\13I\3J\3J\5J\u0233\nJ\3K\3K\3K\3K\3K\7"+
		"K\u023a\nK\fK\16K\u023d\13K\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3O\3O\3O\3P"+
		"\3P\3Q\3Q\3R\3R\3S\3S\3S\3S\3S\3S\7S\u0258\nS\fS\16S\u025b\13S\3T\3T\3"+
		"T\3T\3U\3U\3U\3U\3U\7U\u0266\nU\fU\16U\u0269\13U\3U\3U\3V\3V\3W\3W\3W"+
		"\2\2X\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\2\n\4\2\3\5\34\34\3\2\5\6\3\2\3\4\6\2\33"+
		"\33\35\35  \65\65\3\2\7\16\3\2\60\61\4\2\34\34\62\63\4\2\35\35++\2\u0267"+
		"\2\u00ae\3\2\2\2\4\u00c7\3\2\2\2\6\u00cc\3\2\2\2\b\u00cf\3\2\2\2\n\u00d1"+
		"\3\2\2\2\f\u00d3\3\2\2\2\16\u00d5\3\2\2\2\20\u00d7\3\2\2\2\22\u00e5\3"+
		"\2\2\2\24\u00eb\3\2\2\2\26\u00f0\3\2\2\2\30\u00f5\3\2\2\2\32\u00f7\3\2"+
		"\2\2\34\u0102\3\2\2\2\36\u0108\3\2\2\2 \u010a\3\2\2\2\"\u0121\3\2\2\2"+
		"$\u0123\3\2\2\2&\u0125\3\2\2\2(\u0127\3\2\2\2*\u012b\3\2\2\2,\u0137\3"+
		"\2\2\2.\u013c\3\2\2\2\60\u013e\3\2\2\2\62\u0147\3\2\2\2\64\u014b\3\2\2"+
		"\2\66\u0153\3\2\2\28\u015a\3\2\2\2:\u015c\3\2\2\2<\u015e\3\2\2\2>\u0160"+
		"\3\2\2\2@\u0162\3\2\2\2B\u0166\3\2\2\2D\u0174\3\2\2\2F\u0176\3\2\2\2H"+
		"\u0182\3\2\2\2J\u018e\3\2\2\2L\u01a3\3\2\2\2N\u01a5\3\2\2\2P\u01a7\3\2"+
		"\2\2R\u01aa\3\2\2\2T\u01ac\3\2\2\2V\u01b5\3\2\2\2X\u01c0\3\2\2\2Z\u01c2"+
		"\3\2\2\2\\\u01c4\3\2\2\2^\u01c6\3\2\2\2`\u01cc\3\2\2\2b\u01ce\3\2\2\2"+
		"d\u01d3\3\2\2\2f\u01d6\3\2\2\2h\u01d9\3\2\2\2j\u01db\3\2\2\2l\u01de\3"+
		"\2\2\2n\u01e1\3\2\2\2p\u01e4\3\2\2\2r\u01e7\3\2\2\2t\u01ee\3\2\2\2v\u01f0"+
		"\3\2\2\2x\u01f8\3\2\2\2z\u01fe\3\2\2\2|\u0201\3\2\2\2~\u0205\3\2\2\2\u0080"+
		"\u0209\3\2\2\2\u0082\u020b\3\2\2\2\u0084\u020d\3\2\2\2\u0086\u0212\3\2"+
		"\2\2\u0088\u0214\3\2\2\2\u008a\u0216\3\2\2\2\u008c\u0221\3\2\2\2\u008e"+
		"\u0224\3\2\2\2\u0090\u022d\3\2\2\2\u0092\u0232\3\2\2\2\u0094\u0234\3\2"+
		"\2\2\u0096\u0240\3\2\2\2\u0098\u0242\3\2\2\2\u009a\u0244\3\2\2\2\u009c"+
		"\u0246\3\2\2\2\u009e\u024b\3\2\2\2\u00a0\u024d\3\2\2\2\u00a2\u024f\3\2"+
		"\2\2\u00a4\u0251\3\2\2\2\u00a6\u025c\3\2\2\2\u00a8\u0260\3\2\2\2\u00aa"+
		"\u026c\3\2\2\2\u00ac\u026e\3\2\2\2\u00ae\u00b4\5\4\3\2\u00af\u00b0\5\n"+
		"\6\2\u00b0\u00b1\5\4\3\2\u00b1\u00b3\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\3\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b7\u00b9\5\6\4\2\u00b8\u00ba\5\20\t\2\u00b9\u00b8"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c8\3\2\2\2\u00bb\u00bc\5\6\4\2\u00bc"+
		"\u00bd\5\22\n\2\u00bd\u00bf\5\6\4\2\u00be\u00c0\5\20\t\2\u00bf\u00be\3"+
		"\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c8\3\2\2\2\u00c1\u00c2\5\6\4\2\u00c2"+
		"\u00c3\5\u0092J\2\u00c3\u00c5\5\6\4\2\u00c4\u00c6\5\20\t\2\u00c5\u00c4"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00b7\3\2\2\2\u00c7"+
		"\u00bb\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c8\5\3\2\2\2\u00c9\u00cb\5\b\5\2"+
		"\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\7\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\t\2\2\2\u00d0"+
		"\t\3\2\2\2\u00d1\u00d2\t\3\2\2\u00d2\13\3\2\2\2\u00d3\u00d4\7&\2\2\u00d4"+
		"\r\3\2\2\2\u00d5\u00d6\t\4\2\2\u00d6\17\3\2\2\2\u00d7\u00d8\5\f\7\2\u00d8"+
		"\u00dc\5\u0090I\2\u00d9\u00db\5\"\22\2\u00da\u00d9\3\2\2\2\u00db\u00de"+
		"\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e2\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00df\u00e1\5\16\b\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3"+
		"\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\21\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\5\24\13\2\u00e6\u00e7\5\32\16\2\u00e7\u00e8"+
		"\5\34\17\2\u00e8\23\3\2\2\2\u00e9\u00ec\5\26\f\2\u00ea\u00ec\5\30\r\2"+
		"\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\25\3\2\2\2\u00ed\u00ef"+
		"\t\5\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\27\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\5 \21"+
		"\2\u00f4\u00f6\5\60\31\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\31\3\2\2\2\u00f7\u00f8\5\6\4\2\u00f8\u00f9\7%\2\2\u00f9\u00fa\5\6\4\2"+
		"\u00fa\33\3\2\2\2\u00fb\u0103\5\36\20\2\u00fc\u0103\5^\60\2\u00fd\u0103"+
		"\5\u0084C\2\u00fe\u0103\5\u009cO\2\u00ff\u0103\5`\61\2\u0100\u0103\5L"+
		"\'\2\u0101\u0103\58\35\2\u0102\u00fb\3\2\2\2\u0102\u00fc\3\2\2\2\u0102"+
		"\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0102\u0101\3\2\2\2\u0103\35\3\2\2\2\u0104\u0109\5(\25\2\u0105\u0109"+
		"\5 \21\2\u0106\u0109\5\62\32\2\u0107\u0109\5\60\31\2\u0108\u0104\3\2\2"+
		"\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\37"+
		"\3\2\2\2\u010a\u010e\7\37\2\2\u010b\u010d\5\"\22\2\u010c\u010b\3\2\2\2"+
		"\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\37\2\2\u0112!\3\2\2\2\u0113"+
		"\u0122\5$\23\2\u0114\u0122\7\33\2\2\u0115\u0122\7\'\2\2\u0116\u0122\7"+
		"\34\2\2\u0117\u0122\7+\2\2\u0118\u0122\7\35\2\2\u0119\u0122\7\36\2\2\u011a"+
		"\u0122\7 \2\2\u011b\u0122\7!\2\2\u011c\u0122\7\"\2\2\u011d\u0122\7#\2"+
		"\2\u011e\u0122\7$\2\2\u011f\u0122\7%\2\2\u0120\u0122\7&\2\2\u0121\u0113"+
		"\3\2\2\2\u0121\u0114\3\2\2\2\u0121\u0115\3\2\2\2\u0121\u0116\3\2\2\2\u0121"+
		"\u0117\3\2\2\2\u0121\u0118\3\2\2\2\u0121\u0119\3\2\2\2\u0121\u011a\3\2"+
		"\2\2\u0121\u011b\3\2\2\2\u0121\u011c\3\2\2\2\u0121\u011d\3\2\2\2\u0121"+
		"\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122#\3\2\2\2"+
		"\u0123\u0124\5&\24\2\u0124%\3\2\2\2\u0125\u0126\t\6\2\2\u0126\'\3\2\2"+
		"\2\u0127\u0128\5*\26\2\u0128\u0129\5,\27\2\u0129\u012a\5*\26\2\u012a)"+
		"\3\2\2\2\u012b\u012c\7\37\2\2\u012c\u012d\7\37\2\2\u012d\u012e\7\37\2"+
		"\2\u012e+\3\2\2\2\u012f\u0136\5.\30\2\u0130\u0136\5\n\6\2\u0131\u0132"+
		"\7\17\2\2\u0132\u0133\5\6\4\2\u0133\u0134\5\n\6\2\u0134\u0136\3\2\2\2"+
		"\u0135\u012f\3\2\2\2\u0135\u0130\3\2\2\2\u0135\u0131\3\2\2\2\u0136\u0139"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138-\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013d\7(\2\2\u013b\u013d\5$\23\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013b\3\2\2\2\u013d/\3\2\2\2\u013e\u0142\7$\2\2\u013f\u0141"+
		"\7)\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7$"+
		"\2\2\u0146\61\3\2\2\2\u0147\u0148\5\64\33\2\u0148\u0149\5\66\34\2\u0149"+
		"\u014a\5\64\33\2\u014a\63\3\2\2\2\u014b\u014c\7$\2\2\u014c\u014d\7$\2"+
		"\2\u014d\u014e\7$\2\2\u014e\65\3\2\2\2\u014f\u0152\7*\2\2\u0150\u0152"+
		"\5\n\6\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\67\3\2\2\2\u0155\u0153\3\2\2"+
		"\2\u0156\u015b\5B\"\2\u0157\u015b\5F$\2\u0158\u015b\5H%\2\u0159\u015b"+
		"\5J&\2\u015a\u0156\3\2\2\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2\2\2\u015a"+
		"\u0159\3\2\2\2\u015b9\3\2\2\2\u015c\u015d\7\35\2\2\u015d;\3\2\2\2\u015e"+
		"\u015f\7\20\2\2\u015f=\3\2\2\2\u0160\u0161\7\21\2\2\u0161?\3\2\2\2\u0162"+
		"\u0163\7\22\2\2\u0163A\3\2\2\2\u0164\u0167\5:\36\2\u0165\u0167\7+\2\2"+
		"\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168\u0169\5D#\2\u0169C\3\2\2\2\u016a\u0175\7\65\2\2\u016b\u0171"+
		"\7,\2\2\u016c\u0170\7\65\2\2\u016d\u016e\7 \2\2\u016e\u0170\7\65\2\2\u016f"+
		"\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0174"+
		"\u016a\3\2\2\2\u0174\u016b\3\2\2\2\u0175E\3\2\2\2\u0176\u017a\5<\37\2"+
		"\u0177\u0179\7\66\2\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0180\3\2\2\2\u017c\u017a\3\2\2\2\u017d"+
		"\u0181\7\66\2\2\u017e\u017f\7 \2\2\u017f\u0181\7\66\2\2\u0180\u017d\3"+
		"\2\2\2\u0180\u017e\3\2\2\2\u0181G\3\2\2\2\u0182\u0186\5> \2\u0183\u0185"+
		"\7-\2\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u018c\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018d\7-"+
		"\2\2\u018a\u018b\7 \2\2\u018b\u018d\7-\2\2\u018c\u0189\3\2\2\2\u018c\u018a"+
		"\3\2\2\2\u018dI\3\2\2\2\u018e\u0192\5@!\2\u018f\u0191\7.\2\2\u0190\u018f"+
		"\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0198\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0199\7.\2\2\u0196\u0197\7 \2"+
		"\2\u0197\u0199\7.\2\2\u0198\u0195\3\2\2\2\u0198\u0196\3\2\2\2\u0199K\3"+
		"\2\2\2\u019a\u01a0\5N(\2\u019b\u01a1\5V,\2\u019c\u019e\5P)\2\u019d\u019f"+
		"\5V,\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0"+
		"\u019b\3\2\2\2\u01a0\u019c\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a4\5X"+
		"-\2\u01a3\u019a\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4M\3\2\2\2\u01a5\u01a6"+
		"\5B\"\2\u01a6O\3\2\2\2\u01a7\u01a8\5R*\2\u01a8\u01a9\5T+\2\u01a9Q\3\2"+
		"\2\2\u01aa\u01ab\7\36\2\2\u01abS\3\2\2\2\u01ac\u01b2\7\65\2\2\u01ad\u01b1"+
		"\7\65\2\2\u01ae\u01af\7 \2\2\u01af\u01b1\7\65\2\2\u01b0\u01ad\3\2\2\2"+
		"\u01b0\u01ae\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3U\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7/\2\2\u01b6\u01b7"+
		"\5N(\2\u01b7W\3\2\2\2\u01b8\u01c1\5:\36\2\u01b9\u01bb\7+\2\2\u01ba\u01b9"+
		"\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01bf\5Z.\2\u01bd"+
		"\u01bf\5\\/\2\u01be\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf\u01c1\3\2"+
		"\2\2\u01c0\u01b8\3\2\2\2\u01c0\u01ba\3\2\2\2\u01c1Y\3\2\2\2\u01c2\u01c3"+
		"\7\23\2\2\u01c3[\3\2\2\2\u01c4\u01c5\7\24\2\2\u01c5]\3\2\2\2\u01c6\u01c7"+
		"\t\7\2\2\u01c7_\3\2\2\2\u01c8\u01cd\5|?\2\u01c9\u01cd\5~@\2\u01ca\u01cd"+
		"\5\u0080A\2\u01cb\u01cd\5\u0082B\2\u01cc\u01c8\3\2\2\2\u01cc\u01c9\3\2"+
		"\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2\2\u01cda\3\2\2\2\u01ce\u01cf"+
		"\7\65\2\2\u01cf\u01d0\7\65\2\2\u01d0\u01d1\7\65\2\2\u01d1\u01d2\7\65\2"+
		"\2\u01d2c\3\2\2\2\u01d3\u01d4\7\65\2\2\u01d4\u01d5\7\65\2\2\u01d5e\3\2"+
		"\2\2\u01d6\u01d7\7\65\2\2\u01d7\u01d8\7\65\2\2\u01d8g\3\2\2\2\u01d9\u01da"+
		"\t\b\2\2\u01dai\3\2\2\2\u01db\u01dc\7\65\2\2\u01dc\u01dd\7\65\2\2\u01dd"+
		"k\3\2\2\2\u01de\u01df\7\65\2\2\u01df\u01e0\7\65\2\2\u01e0m\3\2\2\2\u01e1"+
		"\u01e2\7\65\2\2\u01e2\u01e3\7\65\2\2\u01e3o\3\2\2\2\u01e4\u01e5\7\36\2"+
		"\2\u01e5\u01e6\7\65\2\2\u01e6q\3\2\2\2\u01e7\u01e8\t\t\2\2\u01e8\u01e9"+
		"\5j\66\2\u01e9\u01ea\7!\2\2\u01ea\u01eb\5l\67\2\u01ebs\3\2\2\2\u01ec\u01ef"+
		"\7\64\2\2\u01ed\u01ef\5r:\2\u01ee\u01ec\3\2\2\2\u01ee\u01ed\3\2\2\2\u01ef"+
		"u\3\2\2\2\u01f0\u01f1\5j\66\2\u01f1\u01f2\7!\2\2\u01f2\u01f3\5l\67\2\u01f3"+
		"\u01f4\7!\2\2\u01f4\u01f6\5n8\2\u01f5\u01f7\5p9\2\u01f6\u01f5\3\2\2\2"+
		"\u01f6\u01f7\3\2\2\2\u01f7w\3\2\2\2\u01f8\u01f9\5b\62\2\u01f9\u01fa\7"+
		"\35\2\2\u01fa\u01fb\5d\63\2\u01fb\u01fc\7\35\2\2\u01fc\u01fd\5f\64\2\u01fd"+
		"y\3\2\2\2\u01fe\u01ff\5v<\2\u01ff\u0200\5t;\2\u0200{\3\2\2\2\u0201\u0202"+
		"\5x=\2\u0202\u0203\5h\65\2\u0203\u0204\5z>\2\u0204}\3\2\2\2\u0205\u0206"+
		"\5x=\2\u0206\u0207\5h\65\2\u0207\u0208\5v<\2\u0208\177\3\2\2\2\u0209\u020a"+
		"\5x=\2\u020a\u0081\3\2\2\2\u020b\u020c\5v<\2\u020c\u0083\3\2\2\2\u020d"+
		"\u020e\5\u0086D\2\u020e\u020f\5\u008aF\2\u020f\u0210\5\u0090I\2\u0210"+
		"\u0211\5\u0088E\2\u0211\u0085\3\2\2\2\u0212\u0213\7\25\2\2\u0213\u0087"+
		"\3\2\2\2\u0214\u0215\7\26\2\2\u0215\u0089\3\2\2\2\u0216\u0217\5\u0090"+
		"I\2\u0217\u021e\5\u008cG\2\u0218\u0219\5\u008eH\2\u0219\u021a\5\u0090"+
		"I\2\u021a\u021b\5\u008cG\2\u021b\u021d\3\2\2\2\u021c\u0218\3\2\2\2\u021d"+
		"\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u008b\3\2"+
		"\2\2\u0220\u021e\3\2\2\2\u0221\u0222\5\34\17\2\u0222\u0223\5\6\4\2\u0223"+
		"\u008d\3\2\2\2\u0224\u0225\7\"\2\2\u0225\u008f\3\2\2\2\u0226\u022c\5\b"+
		"\5\2\u0227\u0229\5\20\t\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a\u022c\5\n\6\2\u022b\u0226\3\2\2\2\u022b\u0228\3\2"+
		"\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u0091\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0233\5\u0094K\2\u0231\u0233"+
		"\5\u00a8U\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2\2\2\u0233\u0093\3\2\2"+
		"\2\u0234\u0235\5\u0096L\2\u0235\u023b\5\24\13\2\u0236\u0237\5\u009aN\2"+
		"\u0237\u0238\5\24\13\2\u0238\u023a\3\2\2\2\u0239\u0236\3\2\2\2\u023a\u023d"+
		"\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023e\u023f\5\u0098M\2\u023f\u0095\3\2\2\2\u0240\u0241"+
		"\7\25\2\2\u0241\u0097\3\2\2\2\u0242\u0243\7\26\2\2\u0243\u0099\3\2\2\2"+
		"\u0244\u0245\7\36\2\2\u0245\u009b\3\2\2\2\u0246\u0247\5\u009eP\2\u0247"+
		"\u0248\5\u00a4S\2\u0248\u0249\5\u0090I\2\u0249\u024a\5\u00a0Q\2\u024a"+
		"\u009d\3\2\2\2\u024b\u024c\7\27\2\2\u024c\u009f\3\2\2\2\u024d\u024e\7"+
		"\30\2\2\u024e\u00a1\3\2\2\2\u024f\u0250\7\"\2\2\u0250\u00a3\3\2\2\2\u0251"+
		"\u0252\5\u0090I\2\u0252\u0259\5\u00a6T\2\u0253\u0254\5\u00a2R\2\u0254"+
		"\u0255\5\u0090I\2\u0255\u0256\5\u00a6T\2\u0256\u0258\3\2\2\2\u0257\u0253"+
		"\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a"+
		"\u00a5\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025d\5\24\13\2\u025d\u025e\5"+
		"\32\16\2\u025e\u025f\5\34\17\2\u025f\u00a7\3\2\2\2\u0260\u0261\5\u00aa"+
		"V\2\u0261\u0267\5\24\13\2\u0262\u0263\5\u009aN\2\u0263\u0264\5\24\13\2"+
		"\u0264\u0266\3\2\2\2\u0265\u0262\3\2\2\2\u0266\u0269\3\2\2\2\u0267\u0265"+
		"\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u0267\3\2\2\2\u026a"+
		"\u026b\5\u00acW\2\u026b\u00a9\3\2\2\2\u026c\u026d\7\31\2\2\u026d\u00ab"+
		"\3\2\2\2\u026e\u026f\7\32\2\2\u026f\u00ad\3\2\2\2\65\u00b4\u00b9\u00bf"+
		"\u00c5\u00c7\u00cc\u00dc\u00e2\u00eb\u00f0\u00f5\u0102\u0108\u010e\u0121"+
		"\u0135\u0137\u013c\u0142\u0151\u0153\u015a\u0166\u016f\u0171\u0174\u017a"+
		"\u0180\u0186\u018c\u0192\u0198\u019e\u01a0\u01a3\u01b0\u01b2\u01ba\u01be"+
		"\u01c0\u01cc\u01ee\u01f6\u021e\u0228\u022b\u022d\u0232\u023b\u0259\u0267";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}