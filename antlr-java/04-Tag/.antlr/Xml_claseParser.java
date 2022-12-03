// Generated from c:\Users\aknxn\OneDrive\Documents\5to_semestre\lenguajes_automatas\tag\Xml_clase.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Xml_claseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAGIN=1, TAGFI=2, IGUAL=3, COMILLA=4, SLASH=5, TEXT=6, ESPACIOS=7;
	public static final int
		RULE_programa = 0, RULE_xml = 1, RULE_tags = 2, RULE_open_tag = 3, RULE_data = 4, 
		RULE_close_tag = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "xml", "tags", "open_tag", "data", "close_tag"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<'", "'>'", "'='", "'\"'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TAGIN", "TAGFI", "IGUAL", "COMILLA", "SLASH", "TEXT", "ESPACIOS"
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
	public String getGrammarFileName() { return "Xml_clase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Xml_claseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public XmlContext xml() {
			return getRuleContext(XmlContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			xml();
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

	public static class XmlContext extends ParserRuleContext {
		public TagsContext tags() {
			return getRuleContext(TagsContext.class,0);
		}
		public XmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xml; }
	}

	public final XmlContext xml() throws RecognitionException {
		XmlContext _localctx = new XmlContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_xml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			tags();
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

	public static class TagsContext extends ParserRuleContext {
		public Open_tagContext open_tag() {
			return getRuleContext(Open_tagContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public Close_tagContext close_tag() {
			return getRuleContext(Close_tagContext.class,0);
		}
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			open_tag();
			setState(17);
			data();
			setState(18);
			close_tag();
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

	public static class Open_tagContext extends ParserRuleContext {
		public TerminalNode TAGIN() { return getToken(Xml_claseParser.TAGIN, 0); }
		public TerminalNode TEXT() { return getToken(Xml_claseParser.TEXT, 0); }
		public TerminalNode TAGFI() { return getToken(Xml_claseParser.TAGFI, 0); }
		public Open_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_tag; }
	}

	public final Open_tagContext open_tag() throws RecognitionException {
		Open_tagContext _localctx = new Open_tagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_open_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(TAGIN);
			setState(21);
			match(TEXT);
			setState(22);
			match(TAGFI);
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
		public List<TagsContext> tags() {
			return getRuleContexts(TagsContext.class);
		}
		public TagsContext tags(int i) {
			return getRuleContext(TagsContext.class,i);
		}
		public TerminalNode TEXT() { return getToken(Xml_claseParser.TEXT, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_data);
		try {
			int _alt;
			setState(30);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(25); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(24);
						tags();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(27); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(TEXT);
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

	public static class Close_tagContext extends ParserRuleContext {
		public TerminalNode TAGIN() { return getToken(Xml_claseParser.TAGIN, 0); }
		public TerminalNode SLASH() { return getToken(Xml_claseParser.SLASH, 0); }
		public TerminalNode TEXT() { return getToken(Xml_claseParser.TEXT, 0); }
		public TerminalNode TAGFI() { return getToken(Xml_claseParser.TAGFI, 0); }
		public Close_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_tag; }
	}

	public final Close_tagContext close_tag() throws RecognitionException {
		Close_tagContext _localctx = new Close_tagContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_close_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(TAGIN);
			setState(33);
			match(SLASH);
			setState(34);
			match(TEXT);
			setState(35);
			match(TAGFI);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t(\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\6\6\34\n\6\r\6\16\6\35\3\6\5\6!\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2#\2\16\3\2\2\2\4\20\3\2\2\2\6\22\3\2\2\2"+
		"\b\26\3\2\2\2\n \3\2\2\2\f\"\3\2\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20\21"+
		"\5\6\4\2\21\5\3\2\2\2\22\23\5\b\5\2\23\24\5\n\6\2\24\25\5\f\7\2\25\7\3"+
		"\2\2\2\26\27\7\3\2\2\27\30\7\b\2\2\30\31\7\4\2\2\31\t\3\2\2\2\32\34\5"+
		"\6\4\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36!\3\2"+
		"\2\2\37!\7\b\2\2 \33\3\2\2\2 \37\3\2\2\2!\13\3\2\2\2\"#\7\3\2\2#$\7\7"+
		"\2\2$%\7\b\2\2%&\7\4\2\2&\r\3\2\2\2\4\35 ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}