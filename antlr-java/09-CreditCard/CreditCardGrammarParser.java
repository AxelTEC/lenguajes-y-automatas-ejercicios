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
public class CreditCardGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, QUARTER=2, ESPACIOS=3;
	public static final int
		RULE_creditCard = 0, RULE_card = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"creditCard", "card"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "QUARTER", "ESPACIOS"
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


	    // Colores para la consola
	    String NEGRO (String text){ return "\u001B[30m"+text+"\u001B[0m";}
	    String AZUL (String text){ return "\u001B[34m"+text+"\u001B[0m";}
	    String ROJO (String text){ return "\u001B[31m"+text+"\u001B[0m";}
	    String VERDE (String text){ return "\u001B[32m"+text+"\u001B[0m";}
	    String AMARILLO (String text){ return "\u001B[33m"+text+"\u001B[0m";}
	    String PURPURA (String text){ return "\u001B[35m"+text+"\u001B[0m";}
	    String CYAN (String text){ return "\u001B[36m"+text+"\u001B[0m";}
	    String BLANCO (String text){ return "\u001B[37m"+text+"\u001B[0m";}


	public CreditCardGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreditCardContext extends ParserRuleContext {
		public List<CardContext> card() {
			return getRuleContexts(CardContext.class);
		}
		public CardContext card(int i) {
			return getRuleContext(CardContext.class,i);
		}
		public CreditCardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creditCard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditCardGrammarListener ) ((CreditCardGrammarListener)listener).enterCreditCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditCardGrammarListener ) ((CreditCardGrammarListener)listener).exitCreditCard(this);
		}
	}

	public final CreditCardContext creditCard() throws RecognitionException {
		CreditCardContext _localctx = new CreditCardContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_creditCard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			    System.out.println(AZUL("-------------------------------------------------"));
			    System.out.println(AZUL("| ") + VERDE("CreditCard \t => Validación: \t Tipo: ") + AZUL("\t|"));
			    System.out.println(AZUL("-------------------------------------------------"));

			setState(6); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(5);
				card();
				}
				}
				setState(8); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );

			    System.out.println(AZUL("-------------------------------------------------"));


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
	public static class CardContext extends ParserRuleContext {
		public Token a;
		public Token b;
		public Token c;
		public Token d;
		public Token e;
		public List<TerminalNode> QUARTER() { return getTokens(CreditCardGrammarParser.QUARTER); }
		public TerminalNode QUARTER(int i) {
			return getToken(CreditCardGrammarParser.QUARTER, i);
		}
		public CardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_card; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditCardGrammarListener ) ((CreditCardGrammarListener)listener).enterCard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditCardGrammarListener ) ((CreditCardGrammarListener)listener).exitCard(this);
		}
	}

	public final CardContext card() throws RecognitionException {
		CardContext _localctx = new CardContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_card);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(13);
			((CardContext)_localctx).a = match(QUARTER);
			setState(14);
			((CardContext)_localctx).b = match(QUARTER);
			setState(15);
			((CardContext)_localctx).c = match(QUARTER);
			setState(16);
			((CardContext)_localctx).d = match(QUARTER);
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUARTER) {
				{
				setState(17);
				((CardContext)_localctx).e = match(QUARTER);
				}
			}

			setState(20);
			match(T__0);

			    String number = ((CardContext)_localctx).a.getText()+((CardContext)_localctx).b.getText()+((CardContext)_localctx).c.getText()+((CardContext)_localctx).d.getText();
			    if(number.length()>=13&&number.length()<=16){
			        CreditCard cc = new CreditCard();
			        boolean res = cc.checkLuhn(number);
			        System.out.println(AZUL("| ") +PURPURA(""+number)+AMARILLO(" => ")+(res?VERDE("VALIDO  "):ROJO("INVALIDO"))+(res?AMARILLO(" => ")+PURPURA(cc.getType(number)):"           ")+AZUL("\t|"));
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

	public static final String _serializedATN =
		"\u0004\u0001\u0003\u0018\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0004\u0000\u0007\b\u0000\u000b\u0000\f\u0000"+
		"\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0013\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000\u0017"+
		"\u0000\u0004\u0001\u0000\u0000\u0000\u0002\f\u0001\u0000\u0000\u0000\u0004"+
		"\u0006\u0006\u0000\uffff\uffff\u0000\u0005\u0007\u0003\u0002\u0001\u0000"+
		"\u0006\u0005\u0001\u0000\u0000\u0000\u0007\b\u0001\u0000\u0000\u0000\b"+
		"\u0006\u0001\u0000\u0000\u0000\b\t\u0001\u0000\u0000\u0000\t\n\u0001\u0000"+
		"\u0000\u0000\n\u000b\u0006\u0000\uffff\uffff\u0000\u000b\u0001\u0001\u0000"+
		"\u0000\u0000\f\r\u0005\u0001\u0000\u0000\r\u000e\u0005\u0002\u0000\u0000"+
		"\u000e\u000f\u0005\u0002\u0000\u0000\u000f\u0010\u0005\u0002\u0000\u0000"+
		"\u0010\u0012\u0005\u0002\u0000\u0000\u0011\u0013\u0005\u0002\u0000\u0000"+
		"\u0012\u0011\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0001\u0000\u0000"+
		"\u0015\u0016\u0006\u0001\uffff\uffff\u0000\u0016\u0003\u0001\u0000\u0000"+
		"\u0000\u0002\b\u0012";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}