// Generated from c:\Users\aknxn\OneDrive\Documents\5to_semestre\lenguajes_automatas\Lecture03-CreditCard\CreditCardGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreditCardGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
	public String getGrammarFileName() { return "CreditCardGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5\32\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\6\2\t\n\2\r\2\16\2\n\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\25\n\3\3\3\3\3\3\3\3\3\2\2\4\2\4\2\2\2\31\2\6\3\2\2\2\4\16\3\2\2\2\6"+
		"\b\b\2\1\2\7\t\5\4\3\2\b\7\3\2\2\2\t\n\3\2\2\2\n\b\3\2\2\2\n\13\3\2\2"+
		"\2\13\f\3\2\2\2\f\r\b\2\1\2\r\3\3\2\2\2\16\17\7\3\2\2\17\20\7\4\2\2\20"+
		"\21\7\4\2\2\21\22\7\4\2\2\22\24\7\4\2\2\23\25\7\4\2\2\24\23\3\2\2\2\24"+
		"\25\3\2\2\2\25\26\3\2\2\2\26\27\7\3\2\2\27\30\b\3\1\2\30\5\3\2\2\2\4\n"+
		"\24";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}