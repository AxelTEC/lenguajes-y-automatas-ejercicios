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
public class IPaddressParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IP=1, INT=2, NO=3;
	public static final int
		RULE_programa = 0, RULE_address = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "address"
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
			null, "IP", "INT", "NO"
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

	    void printdots(){ System.out.println(AMARILLO("---------------------------------"));}
	    int contador = 0;

	public IPaddressParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public List<AddressContext> address() {
			return getRuleContexts(AddressContext.class);
		}
		public AddressContext address(int i) {
			return getRuleContext(AddressContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPaddressListener ) ((IPaddressListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPaddressListener ) ((IPaddressListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			    printdots();
			    System.out.println(AMARILLO("|\t")+ROJO("IP's Encontradas:")+AMARILLO("\t|"));
			    printdots();  

			setState(6); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(5);
				address();
				}
				}
				setState(8); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0 );

			    printdots();  
			    System.out.println(AMARILLO("|\t")+VERDE("Total: "+contador)+AMARILLO("\t\t|"));
			    printdots();  

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
	public static class AddressContext extends ParserRuleContext {
		public Token IP;
		public List<TerminalNode> IP() { return getTokens(IPaddressParser.IP); }
		public TerminalNode IP(int i) {
			return getToken(IPaddressParser.IP, i);
		}
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IPaddressListener ) ((IPaddressListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IPaddressListener ) ((IPaddressListener)listener).exitAddress(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_address);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==NO) {
				{
				{
				setState(12);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==IP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			((AddressContext)_localctx).IP = match(IP);
			setState(22);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(19);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==IP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(24);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}

			    System.out.println(AMARILLO("|\t")+PURPURA(((AddressContext)_localctx).IP.getText())+AMARILLO("\t\t|"));
			    contador++;

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
		"\u0004\u0001\u0003\u001c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0004\u0000\u0007\b\u0000\u000b\u0000\f\u0000"+
		"\b\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u000e\b\u0001\n\u0001"+
		"\f\u0001\u0011\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0015\b\u0001"+
		"\n\u0001\f\u0001\u0018\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000"+
		"\u0000\u0002\u0000\u0002\u0000\u0001\u0001\u0000\u0001\u0001\u001c\u0000"+
		"\u0004\u0001\u0000\u0000\u0000\u0002\u000f\u0001\u0000\u0000\u0000\u0004"+
		"\u0006\u0006\u0000\uffff\uffff\u0000\u0005\u0007\u0003\u0002\u0001\u0000"+
		"\u0006\u0005\u0001\u0000\u0000\u0000\u0007\b\u0001\u0000\u0000\u0000\b"+
		"\u0006\u0001\u0000\u0000\u0000\b\t\u0001\u0000\u0000\u0000\t\n\u0001\u0000"+
		"\u0000\u0000\n\u000b\u0006\u0000\uffff\uffff\u0000\u000b\u0001\u0001\u0000"+
		"\u0000\u0000\f\u000e\b\u0000\u0000\u0000\r\f\u0001\u0000\u0000\u0000\u000e"+
		"\u0011\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010"+
		"\u0001\u0000\u0000\u0000\u0010\u0012\u0001\u0000\u0000\u0000\u0011\u000f"+
		"\u0001\u0000\u0000\u0000\u0012\u0016\u0005\u0001\u0000\u0000\u0013\u0015"+
		"\b\u0000\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0018\u0001"+
		"\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001"+
		"\u0000\u0000\u0000\u0017\u0019\u0001\u0000\u0000\u0000\u0018\u0016\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0006\u0001\uffff\uffff\u0000\u001a\u0003"+
		"\u0001\u0000\u0000\u0000\u0003\b\u000f\u0016";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}