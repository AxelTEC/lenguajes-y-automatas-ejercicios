// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BinarioParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BINARIO=1, WS=2, COMENTARIO=3;
	public static final int
		RULE_programa = 0, RULE_numeroBinario = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "numeroBinario"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BINARIO", "WS", "COMENTARIO"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    String NEGRO (String text){ return "\u001B[30m"+text+"\u001B[0m";}
	    String AZUL (String text){ return "\u001B[34m"+text+"\u001B[0m";}
	    String ROJO (String text){ return "\u001B[31m"+text+"\u001B[0m";}
	    String VERDE (String text){ return "\u001B[32m"+text+"\u001B[0m";}
	    String AMARILLO (String text){ return "\u001B[33m"+text+"\u001B[0m";}
	    String PURPURA (String text){ return "\u001B[35m"+text+"\u001B[0m";}
	    String CYAN (String text){ return "\u001B[36m"+text+"\u001B[0m";}
	    String BLANCO (String text){ return "\u001B[37m"+text+"\u001B[0m";}


	public BinarioParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<NumeroBinarioContext> numeroBinario() {
			return getRuleContexts(NumeroBinarioContext.class);
		}
		public NumeroBinarioContext numeroBinario(int i) {
			return getRuleContext(NumeroBinarioContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BinarioListener ) ((BinarioListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BinarioListener ) ((BinarioListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			    System.out.println(AZUL("---------------------------------"));
			    System.out.println(AZUL("|\t") + VERDE("Binario  => Decimal     ") + AZUL("|"));
			    System.out.println(AZUL("---------------------------------"));

			setState(8);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BINARIO) {
				{
				{
				setState(5);
				numeroBinario();
				}
				}
				setState(10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumeroBinarioContext extends ParserRuleContext {
		public Token BINARIO;
		public TerminalNode BINARIO() { return getToken(BinarioParser.BINARIO, 0); }
		public NumeroBinarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeroBinario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BinarioListener ) ((BinarioListener)listener).enterNumeroBinario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BinarioListener ) ((BinarioListener)listener).exitNumeroBinario(this);
		}
	}

	public final NumeroBinarioContext numeroBinario() throws RecognitionException {
		NumeroBinarioContext _localctx = new NumeroBinarioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_numeroBinario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			((NumeroBinarioContext)_localctx).BINARIO = match(BINARIO);

			    Convertidor c = new Convertidor();
			    System.out.println(AZUL("|\t") + ROJO(((NumeroBinarioContext)_localctx).BINARIO.getText())+ AMARILLO(" => ") + ROJO(c.binaryToDecimal(((NumeroBinarioContext)_localctx).BINARIO.getText())+"")+ AZUL("\t\t|"));
			    System.out.println(AZUL("---------------------------------"));

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
		"\u0004\u0001\u0003\u000f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u0007\b\u0000\n\u0000\f\u0000\n\t"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0002"+
		"\u0000\u0002\u0000\u0000\r\u0000\u0004\u0001\u0000\u0000\u0000\u0002\u000b"+
		"\u0001\u0000\u0000\u0000\u0004\b\u0006\u0000\uffff\uffff\u0000\u0005\u0007"+
		"\u0003\u0002\u0001\u0000\u0006\u0005\u0001\u0000\u0000\u0000\u0007\n\u0001"+
		"\u0000\u0000\u0000\b\u0006\u0001\u0000\u0000\u0000\b\t\u0001\u0000\u0000"+
		"\u0000\t\u0001\u0001\u0000\u0000\u0000\n\b\u0001\u0000\u0000\u0000\u000b"+
		"\f\u0005\u0001\u0000\u0000\f\r\u0006\u0001\uffff\uffff\u0000\r\u0003\u0001"+
		"\u0000\u0000\u0000\u0001\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}