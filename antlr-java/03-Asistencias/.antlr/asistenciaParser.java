// Generated from c:\Users\aknxn\OneDrive\Documents\5to_semestre\lenguajes_automatas\asistencia\asistencia.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class asistenciaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
	public String getGrammarFileName() { return "asistencia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public asistenciaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

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

	public static class ImprimirContext extends ParserRuleContext {
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{

			     System.out.println(contador);  

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

	public static class AsistentesContext extends ParserRuleContext {
		public Token NOMBRE;
		public Token ASISTENCIA;
		public TerminalNode NOMBRE() { return getToken(asistenciaParser.NOMBRE, 0); }
		public TerminalNode ASISTENCIA() { return getToken(asistenciaParser.ASISTENCIA, 0); }
		public AsistentesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asistentes; }
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

			    System.out.println(((AsistentesContext)_localctx).ASISTENCIA);
			    if(((AsistentesContext)_localctx).ASISTENCIA.getText().equals("F"))
			    {
			        System.out.println(((AsistentesContext)_localctx).NOMBRE.getText());   
			        contador++;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5\27\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\7\2\n\n\2\f\2\16\2\r\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\2\2\5\2\4\6\2\2\2\24\2\13\3\2\2\2\4\20\3\2\2\2\6\22\3\2\2\2\b"+
		"\n\5\6\4\2\t\b\3\2\2\2\n\r\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\16\3\2"+
		"\2\2\r\13\3\2\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20\21\b\3\1\2\21\5\3\2\2"+
		"\2\22\23\7\4\2\2\23\24\7\3\2\2\24\25\b\4\1\2\25\7\3\2\2\2\3\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}