// Generated from c:\Users\aknxn\OneDrive\Documents\5to_semestre\lenguajes_automatas\json\Json.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LLAVEIN=1, LLAVEFI=2, NUMERO=3, COMILLA=4, COMA=5, PUNTOS=6, CORCHETEFI=7, 
		CORCHETEIN=8, STR=9, ESPACIOS=10;
	public static final int
		RULE_programa = 0, RULE_json = 1, RULE_objeto = 2, RULE_atributo = 3, 
		RULE_arreglo = 4, RULE_valor = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "json", "objeto", "atributo", "arreglo", "valor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", null, "'\"'", "','", "':'", "']'", "'['"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LLAVEIN", "LLAVEFI", "NUMERO", "COMILLA", "COMA", "PUNTOS", "CORCHETEFI", 
			"CORCHETEIN", "STR", "ESPACIOS"
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
	public String getGrammarFileName() { return "Json.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JsonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public JsonContext json() {
			return getRuleContext(JsonContext.class,0);
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
			json();
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

	public static class JsonContext extends ParserRuleContext {
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			objeto();
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

	public static class ObjetoContext extends ParserRuleContext {
		public TerminalNode LLAVEIN() { return getToken(JsonParser.LLAVEIN, 0); }
		public TerminalNode LLAVEFI() { return getToken(JsonParser.LLAVEFI, 0); }
		public List<AtributoContext> atributo() {
			return getRuleContexts(AtributoContext.class);
		}
		public AtributoContext atributo(int i) {
			return getRuleContext(AtributoContext.class,i);
		}
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_objeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(LLAVEIN);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STR) {
				{
				{
				setState(17);
				atributo();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
			match(LLAVEFI);
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

	public static class AtributoContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(JsonParser.STR, 0); }
		public TerminalNode PUNTOS() { return getToken(JsonParser.PUNTOS, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode COMA() { return getToken(JsonParser.COMA, 0); }
		public AtributoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributo; }
	}

	public final AtributoContext atributo() throws RecognitionException {
		AtributoContext _localctx = new AtributoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atributo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(STR);
			setState(26);
			match(PUNTOS);
			setState(27);
			valor();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(28);
				match(COMA);
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

	public static class ArregloContext extends ParserRuleContext {
		public TerminalNode CORCHETEIN() { return getToken(JsonParser.CORCHETEIN, 0); }
		public TerminalNode CORCHETEFI() { return getToken(JsonParser.CORCHETEFI, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(JsonParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(JsonParser.COMA, i);
		}
		public ArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreglo; }
	}

	public final ArregloContext arreglo() throws RecognitionException {
		ArregloContext _localctx = new ArregloContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(CORCHETEIN);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LLAVEIN) | (1L << NUMERO) | (1L << CORCHETEIN) | (1L << STR))) != 0)) {
				{
				setState(32);
				valor();
				}
			}

			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(35);
				match(COMA);
				setState(36);
				valor();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(CORCHETEFI);
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
		public TerminalNode STR() { return getToken(JsonParser.STR, 0); }
		public TerminalNode NUMERO() { return getToken(JsonParser.NUMERO, 0); }
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_valor);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(STR);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(NUMERO);
				}
				break;
			case LLAVEIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				objeto();
				}
				break;
			case CORCHETEIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				arreglo();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f\65\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\7\4\25\n"+
		"\4\f\4\16\4\30\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5 \n\5\3\6\3\6\5\6$\n\6"+
		"\3\6\3\6\7\6(\n\6\f\6\16\6+\13\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7\63\n\7\3"+
		"\7\2\2\b\2\4\6\b\n\f\2\2\2\65\2\16\3\2\2\2\4\20\3\2\2\2\6\22\3\2\2\2\b"+
		"\33\3\2\2\2\n!\3\2\2\2\f\62\3\2\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20\21\5"+
		"\6\4\2\21\5\3\2\2\2\22\26\7\3\2\2\23\25\5\b\5\2\24\23\3\2\2\2\25\30\3"+
		"\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7"+
		"\4\2\2\32\7\3\2\2\2\33\34\7\13\2\2\34\35\7\b\2\2\35\37\5\f\7\2\36 \7\7"+
		"\2\2\37\36\3\2\2\2\37 \3\2\2\2 \t\3\2\2\2!#\7\n\2\2\"$\5\f\7\2#\"\3\2"+
		"\2\2#$\3\2\2\2$)\3\2\2\2%&\7\7\2\2&(\5\f\7\2\'%\3\2\2\2(+\3\2\2\2)\'\3"+
		"\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7\t\2\2-\13\3\2\2\2.\63\7\13\2"+
		"\2/\63\7\5\2\2\60\63\5\6\4\2\61\63\5\n\6\2\62.\3\2\2\2\62/\3\2\2\2\62"+
		"\60\3\2\2\2\62\61\3\2\2\2\63\r\3\2\2\2\7\26\37#)\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}