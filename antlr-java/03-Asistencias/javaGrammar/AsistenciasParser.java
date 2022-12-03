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
public class AsistenciasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASISTENCIA=1, NOMBRE=2, ESPACIOS=3;
	public static final int
		RULE_lista = 0, RULE_imprimir = 1, RULE_asistentes = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"lista", "imprimir", "asistentes"
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
			null, "ASISTENCIA", "NOMBRE", "ESPACIOS"
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

	    int contador = 0,total=0;
	    String as ="";
	    String nas ="";

	public AsistenciasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaContext extends ParserRuleContext {
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public List<AsistentesContext> asistentes() {
			return getRuleContexts(AsistentesContext.class);
		}
		public AsistentesContext asistentes(int i) {
			return getRuleContext(AsistentesContext.class,i);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistenciasListener ) ((AsistenciasListener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistenciasListener ) ((AsistenciasListener)listener).exitLista(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOMBRE) {
				{
				{
				setState(6);
				asistentes();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(12);
			imprimir();
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
	public static class ImprimirContext extends ParserRuleContext {
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistenciasListener ) ((AsistenciasListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistenciasListener ) ((AsistenciasListener)listener).exitImprimir(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{

			    System.out.println(PURPURA("---------------------------------"));  
			    System.out.println(PURPURA("|")+AZUL("Cantidad de Alumnos: ") + VERDE(total+"")+PURPURA("\t|"));  
			    System.out.println(PURPURA("---------------------------------"));  
			    System.out.println(PURPURA("|")+AZUL("Cantidad de Asistencias: ") + VERDE((total - contador)+"")+PURPURA("\t|"));  
			    System.out.println(PURPURA("---------------------------------"));  
			    System.out.println(as);  
			    System.out.println(PURPURA("---------------------------------"));  
			    System.out.println(PURPURA("|")+AZUL("Cantidad de Faltas: ") + VERDE(contador+"")+PURPURA("\t\t|"));  
			    System.out.println(PURPURA("---------------------------------"));  
			    System.out.println(nas);  

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
	public static class AsistentesContext extends ParserRuleContext {
		public Token NOMBRE;
		public Token ASISTENCIA;
		public TerminalNode NOMBRE() { return getToken(AsistenciasParser.NOMBRE, 0); }
		public TerminalNode ASISTENCIA() { return getToken(AsistenciasParser.ASISTENCIA, 0); }
		public AsistentesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asistentes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistenciasListener ) ((AsistenciasListener)listener).enterAsistentes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistenciasListener ) ((AsistenciasListener)listener).exitAsistentes(this);
		}
	}

	public final AsistentesContext asistentes() throws RecognitionException {
		AsistentesContext _localctx = new AsistentesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asistentes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((AsistentesContext)_localctx).NOMBRE = match(NOMBRE);
			setState(17);
			((AsistentesContext)_localctx).ASISTENCIA = match(ASISTENCIA);

			    if(((AsistentesContext)_localctx).ASISTENCIA.getText().equals("F"))
			    {
			        nas += ROJO(" *")+AMARILLO(((AsistentesContext)_localctx).NOMBRE.getText()) + "\n";
			        contador++;
			    }else if(((AsistentesContext)_localctx).ASISTENCIA.getText().equals("A")){
			        as += ROJO(" *")+AMARILLO(((AsistentesContext)_localctx).NOMBRE.getText()) +"\n";
			    }
			    total++;

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
		"\u0004\u0001\u0003\u0015\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0001\u0000\u0005\u0000\b\b\u0000\n\u0000\f\u0000"+
		"\u000b\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0000\u0000\u0003\u0000"+
		"\u0002\u0004\u0000\u0000\u0012\u0000\t\u0001\u0000\u0000\u0000\u0002\u000e"+
		"\u0001\u0000\u0000\u0000\u0004\u0010\u0001\u0000\u0000\u0000\u0006\b\u0003"+
		"\u0004\u0002\u0000\u0007\u0006\u0001\u0000\u0000\u0000\b\u000b\u0001\u0000"+
		"\u0000\u0000\t\u0007\u0001\u0000\u0000\u0000\t\n\u0001\u0000\u0000\u0000"+
		"\n\f\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\f\r\u0003"+
		"\u0002\u0001\u0000\r\u0001\u0001\u0000\u0000\u0000\u000e\u000f\u0006\u0001"+
		"\uffff\uffff\u0000\u000f\u0003\u0001\u0000\u0000\u0000\u0010\u0011\u0005"+
		"\u0002\u0000\u0000\u0011\u0012\u0005\u0001\u0000\u0000\u0012\u0013\u0006"+
		"\u0002\uffff\uffff\u0000\u0013\u0005\u0001\u0000\u0000\u0000\u0001\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}