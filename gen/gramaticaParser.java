// Generated from C:/Users/Alexis/Documents/UNI/Tercero/Lenguajes/P2Obligatoria/entrega_po_pl/src/gramatica.g4 by ANTLR 4.13.2

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, CALL=36, IDENT=37, GE=38, LE=39, 
		EQ=40, NE=41, GT=42, LT=43, COLON=44, COMMA=45, SEMI=46, ASSIGN=47, NUM_INT_CONST_B=48, 
		NUM_INT_CONST_O=49, NUM_INT_CONST_H=50, CONST_BOOL=51, NUM_REAL_CONST=52, 
		NUM_INT_CONST=53, STRING_CONST=54, COMMENT=55, WS=56;
	public static final int
		RULE_programa = 0, RULE_nombreProg = 1, RULE_bloqueDeclaraciones = 2, 
		RULE_declaracion = 3, RULE_especDeclaracion = 4, RULE_tipoDato = 5, RULE_longitudChar = 6, 
		RULE_listaVariables = 7, RULE_restoListaVars = 8, RULE_inicializacion = 9, 
		RULE_listaConstantes = 10, RULE_valorSimple = 11, RULE_valorSimpleOpc = 12, 
		RULE_interfaz = 13, RULE_cuerpoInterfaz = 14, RULE_restoInterfaz = 15, 
		RULE_elementoInterfaz = 16, RULE_listaSubprogramas = 17, RULE_cabeceraProcedimiento = 18, 
		RULE_cabeceraFuncion = 19, RULE_cuerpoSubrutina = 20, RULE_cuerpoFuncion = 21, 
		RULE_listaParamsFormales = 22, RULE_listaNombresParams = 23, RULE_restoNombresParams = 24, 
		RULE_listaDecParamsSub = 25, RULE_listaDecParamsFun = 26, RULE_direccionParam = 27, 
		RULE_bloqueSentencias = 28, RULE_restoBloqueStmts = 29, RULE_sentencia = 30, 
		RULE_asignacionOLlamada = 31, RULE_sentDo = 32, RULE_limDo = 33, RULE_ramaSi = 34, 
		RULE_ramaElse = 35, RULE_llamadaProcedimiento = 36, RULE_listaArgsReales = 37, 
		RULE_expresion = 38, RULE_restoExpresion = 39, RULE_operadorArit = 40, 
		RULE_factor = 41, RULE_sufijoPosibleFunc = 42, RULE_listaExpresiones = 43, 
		RULE_condicion = 44, RULE_restoCondicion = 45, RULE_operadorLogico = 46, 
		RULE_factorCond = 47, RULE_operadorComp = 48, RULE_listaCasos = 49, RULE_ramaCaso = 50, 
		RULE_etiquetasCaso = 51, RULE_restoEtiquetas = 52, RULE_masEtiquetas = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "nombreProg", "bloqueDeclaraciones", "declaracion", "especDeclaracion", 
			"tipoDato", "longitudChar", "listaVariables", "restoListaVars", "inicializacion", 
			"listaConstantes", "valorSimple", "valorSimpleOpc", "interfaz", "cuerpoInterfaz", 
			"restoInterfaz", "elementoInterfaz", "listaSubprogramas", "cabeceraProcedimiento", 
			"cabeceraFuncion", "cuerpoSubrutina", "cuerpoFuncion", "listaParamsFormales", 
			"listaNombresParams", "restoNombresParams", "listaDecParamsSub", "listaDecParamsFun", 
			"direccionParam", "bloqueSentencias", "restoBloqueStmts", "sentencia", 
			"asignacionOLlamada", "sentDo", "limDo", "ramaSi", "ramaElse", "llamadaProcedimiento", 
			"listaArgsReales", "expresion", "restoExpresion", "operadorArit", "factor", 
			"sufijoPosibleFunc", "listaExpresiones", "condicion", "restoCondicion", 
			"operadorLogico", "factorCond", "operadorComp", "listaCasos", "ramaCaso", 
			"etiquetasCaso", "restoEtiquetas", "masEtiquetas"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'END'", "'PARAMETER'", "'::'", "'INTEGER'", "'REAL'", 
			"'CHARACTER'", "'('", "')'", "'INTERFACE'", "'SUBROUTINE'", "'FUNCTION'", 
			"'INTENT'", "'IN'", "'OUT'", "'INOUT'", "'IF'", "'DO'", "'SELECT'", "'CASE'", 
			"'WHILE'", "'ENDDO'", "'THEN'", "'ENDIF'", "'ELSE'", "'+'", "'-'", "'*'", 
			"'/'", "'.OR.'", "'.AND.'", "'.EQV.'", "'.NEQV.'", "'.NOT.'", "'DEFAULT'", 
			"'CALL'", null, "'>='", "'<='", "'=='", "'/='", "'>'", "'<'", "':'", 
			"','", "';'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"CALL", "IDENT", "GE", "LE", "EQ", "NE", "GT", "LT", "COLON", "COMMA", 
			"SEMI", "ASSIGN", "NUM_INT_CONST_B", "NUM_INT_CONST_O", "NUM_INT_CONST_H", 
			"CONST_BOOL", "NUM_REAL_CONST", "NUM_INT_CONST", "STRING_CONST", "COMMENT", 
			"WS"
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
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Traductor trad = new Traductor();

	    public static String toCLiteral(String s) {
	        char delim = s.charAt(0);
	        String inner = s.substring(1, s.length() - 1);
	        if (delim == '\'') {
	            // comillas simples: '' -> ' y escapa las "
	            inner = inner.replace("''", "'");
	            inner = inner.replace("\"", "\\\"");
	        } else {
	            // comillas dobles: "" -> " (ya escapada en C con \")
	            inner = inner.replace("\"\"", "\\\"");
	        }
	        return "\"" + inner + "\"";
	    }

	    public static String traducirOpLog(String op) {
	        switch (op) {
	            case ".OR.": return "||";
	            case ".AND.": return "&&";
	            case ".EQV.": return "!^";
	            case ".NEQV.": return "^";
	            default: return op;
	        }
	    }

	    public static String traducirOpComp(String op) {
	        return op.equals("/=") ? "!=" : op;
	    }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public BloqueDeclaracionesContext bloqueDeclaraciones;
		public BloqueSentenciasContext bloqueSentencias;
		public List<NombreProgContext> nombreProg() {
			return getRuleContexts(NombreProgContext.class);
		}
		public NombreProgContext nombreProg(int i) {
			return getRuleContext(NombreProgContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(gramaticaParser.SEMI, 0); }
		public BloqueDeclaracionesContext bloqueDeclaraciones() {
			return getRuleContext(BloqueDeclaracionesContext.class,0);
		}
		public InterfazContext interfaz() {
			return getRuleContext(InterfazContext.class,0);
		}
		public BloqueSentenciasContext bloqueSentencias() {
			return getRuleContext(BloqueSentenciasContext.class,0);
		}
		public ListaSubprogramasContext listaSubprogramas() {
			return getRuleContext(ListaSubprogramasContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gramaticaParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__0);
			setState(109);
			nombreProg();
			setState(110);
			match(SEMI);
			setState(111);
			((ProgramaContext)_localctx).bloqueDeclaraciones = bloqueDeclaraciones();
			setState(112);
			interfaz();
			setState(113);
			((ProgramaContext)_localctx).bloqueSentencias = bloqueSentencias();
			setState(114);
			match(T__1);
			setState(115);
			match(T__0);
			setState(116);
			nombreProg();
			setState(117);
			listaSubprogramas();
			setState(118);
			match(EOF);

			          trad.getContexto().entrarMain();
			          trad.generarMain(((ProgramaContext)_localctx).bloqueDeclaraciones.listaVars, ((ProgramaContext)_localctx).bloqueSentencias.codigo);
			          trad.getContexto().salir();
			          System.out.print(trad.generarPrograma());
			      
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
	public static class NombreProgContext extends ParserRuleContext {
		public String nombre;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public NombreProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombreProg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNombreProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNombreProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitNombreProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombreProgContext nombreProg() throws RecognitionException {
		NombreProgContext _localctx = new NombreProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nombreProg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			((NombreProgContext)_localctx).IDENT = match(IDENT);
			 ((NombreProgContext)_localctx).nombre =  (((NombreProgContext)_localctx).IDENT!=null?((NombreProgContext)_localctx).IDENT.getText():null); 
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
	public static class BloqueDeclaracionesContext extends ParserRuleContext {
		public List<VariableDecl> listaVars;
		public DeclaracionContext declaracion;
		public BloqueDeclaracionesContext bloqueDeclaraciones;
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public BloqueDeclaracionesContext bloqueDeclaraciones() {
			return getRuleContext(BloqueDeclaracionesContext.class,0);
		}
		public BloqueDeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueDeclaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterBloqueDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitBloqueDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitBloqueDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueDeclaracionesContext bloqueDeclaraciones() throws RecognitionException {
		BloqueDeclaracionesContext _localctx = new BloqueDeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloqueDeclaraciones);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				((BloqueDeclaracionesContext)_localctx).declaracion = declaracion();
				setState(125);
				((BloqueDeclaracionesContext)_localctx).bloqueDeclaraciones = bloqueDeclaraciones();

				          ((BloqueDeclaracionesContext)_localctx).listaVars =  new ArrayList<>();
				          _localctx.listaVars.addAll(((BloqueDeclaracionesContext)_localctx).declaracion.listaVars);
				          _localctx.listaVars.addAll(((BloqueDeclaracionesContext)_localctx).bloqueDeclaraciones.listaVars);
				      
				}
				break;
			case T__9:
			case T__16:
			case T__17:
			case T__18:
			case CALL:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				 ((BloqueDeclaracionesContext)_localctx).listaVars =  new ArrayList<>(); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public List<VariableDecl> listaVars;
		public TipoDatoContext tipoDato;
		public EspecDeclaracionContext especDeclaracion;
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public EspecDeclaracionContext especDeclaracion() {
			return getRuleContext(EspecDeclaracionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((DeclaracionContext)_localctx).tipoDato = tipoDato();
			setState(132);
			((DeclaracionContext)_localctx).especDeclaracion = especDeclaracion();

			          ((DeclaracionContext)_localctx).listaVars =  ((DeclaracionContext)_localctx).especDeclaracion.listaVars;
			          for (VariableDecl v : _localctx.listaVars) {
			              v.tipo = ((DeclaracionContext)_localctx).tipoDato.tipoC;
			              if (((DeclaracionContext)_localctx).tipoDato.tipoC.equals("char") && ((DeclaracionContext)_localctx).tipoDato.longitud > 0)
			                  v.setDimension(((DeclaracionContext)_localctx).tipoDato.longitud);
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
	public static class EspecDeclaracionContext extends ParserRuleContext {
		public List<VariableDecl> listaVars;
		public Token IDENT;
		public ValorSimpleContext valorSimple;
		public ListaVariablesContext listaVariables;
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public ValorSimpleContext valorSimple() {
			return getRuleContext(ValorSimpleContext.class,0);
		}
		public ListaConstantesContext listaConstantes() {
			return getRuleContext(ListaConstantesContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gramaticaParser.SEMI, 0); }
		public ListaVariablesContext listaVariables() {
			return getRuleContext(ListaVariablesContext.class,0);
		}
		public EspecDeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_especDeclaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEspecDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEspecDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitEspecDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspecDeclaracionContext especDeclaracion() throws RecognitionException {
		EspecDeclaracionContext _localctx = new EspecDeclaracionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_especDeclaracion);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(COMMA);
				setState(136);
				match(T__2);
				setState(137);
				match(T__3);
				setState(138);
				((EspecDeclaracionContext)_localctx).IDENT = match(IDENT);
				setState(139);
				match(ASSIGN);
				setState(140);
				((EspecDeclaracionContext)_localctx).valorSimple = valorSimple();
				 trad.addDefine((((EspecDeclaracionContext)_localctx).IDENT!=null?((EspecDeclaracionContext)_localctx).IDENT.getText():null), ((EspecDeclaracionContext)_localctx).valorSimple.val); 
				setState(142);
				listaConstantes();
				setState(143);
				match(SEMI);

				          ((EspecDeclaracionContext)_localctx).listaVars =  new ArrayList<>();
				      
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(T__3);
				setState(147);
				((EspecDeclaracionContext)_localctx).listaVariables = listaVariables();
				setState(148);
				match(SEMI);

				          ((EspecDeclaracionContext)_localctx).listaVars =  ((EspecDeclaracionContext)_localctx).listaVariables.lista;
				      
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoDatoContext extends ParserRuleContext {
		public String tipoC;
		public int longitud;
		public LongitudCharContext longitudChar;
		public LongitudCharContext longitudChar() {
			return getRuleContext(LongitudCharContext.class,0);
		}
		public TipoDatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTipoDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTipoDato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTipoDato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoDatoContext tipoDato() throws RecognitionException {
		TipoDatoContext _localctx = new TipoDatoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipoDato);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__4);
				 ((TipoDatoContext)_localctx).tipoC =  "int"; ((TipoDatoContext)_localctx).longitud =  -1; 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__5);
				 ((TipoDatoContext)_localctx).tipoC =  "float"; ((TipoDatoContext)_localctx).longitud =  -1; 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(T__6);
				setState(158);
				((TipoDatoContext)_localctx).longitudChar = longitudChar();
				 ((TipoDatoContext)_localctx).tipoC =  "char";  ((TipoDatoContext)_localctx).longitud =  ((TipoDatoContext)_localctx).longitudChar.longitud; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class LongitudCharContext extends ParserRuleContext {
		public int longitud;
		public Token NUM_INT_CONST;
		public TerminalNode NUM_INT_CONST() { return getToken(gramaticaParser.NUM_INT_CONST, 0); }
		public LongitudCharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longitudChar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLongitudChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLongitudChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitLongitudChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LongitudCharContext longitudChar() throws RecognitionException {
		LongitudCharContext _localctx = new LongitudCharContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_longitudChar);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__7);
				setState(164);
				((LongitudCharContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				setState(165);
				match(T__8);
				 ((LongitudCharContext)_localctx).longitud =  Integer.parseInt((((LongitudCharContext)_localctx).NUM_INT_CONST!=null?((LongitudCharContext)_localctx).NUM_INT_CONST.getText():null)); 
				}
				break;
			case T__3:
			case COMMA:
				enterOuterAlt(_localctx, 2);
				{
				 ((LongitudCharContext)_localctx).longitud =  -1; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaVariablesContext extends ParserRuleContext {
		public List<VariableDecl> lista;
		public Token IDENT;
		public InicializacionContext inicializacion;
		public RestoListaVarsContext restoListaVars;
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public InicializacionContext inicializacion() {
			return getRuleContext(InicializacionContext.class,0);
		}
		public RestoListaVarsContext restoListaVars() {
			return getRuleContext(RestoListaVarsContext.class,0);
		}
		public ListaVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaVariablesContext listaVariables() throws RecognitionException {
		ListaVariablesContext _localctx = new ListaVariablesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listaVariables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			((ListaVariablesContext)_localctx).IDENT = match(IDENT);
			setState(171);
			((ListaVariablesContext)_localctx).inicializacion = inicializacion();
			setState(172);
			((ListaVariablesContext)_localctx).restoListaVars = restoListaVars();

			          ((ListaVariablesContext)_localctx).lista =  new ArrayList<>();
			          VariableDecl v = new VariableDecl(null, (((ListaVariablesContext)_localctx).IDENT!=null?((ListaVariablesContext)_localctx).IDENT.getText():null));
			          if (((ListaVariablesContext)_localctx).inicializacion.valor != null) v.setInit(((ListaVariablesContext)_localctx).inicializacion.valor);
			          _localctx.lista.add(v);
			          _localctx.lista.addAll(((ListaVariablesContext)_localctx).restoListaVars.lista);
			      
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
	public static class RestoListaVarsContext extends ParserRuleContext {
		public List<VariableDecl> lista;
		public Token IDENT;
		public InicializacionContext inicializacion;
		public RestoListaVarsContext restoListaVars;
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public InicializacionContext inicializacion() {
			return getRuleContext(InicializacionContext.class,0);
		}
		public RestoListaVarsContext restoListaVars() {
			return getRuleContext(RestoListaVarsContext.class,0);
		}
		public RestoListaVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restoListaVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRestoListaVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRestoListaVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRestoListaVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestoListaVarsContext restoListaVars() throws RecognitionException {
		RestoListaVarsContext _localctx = new RestoListaVarsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_restoListaVars);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(COMMA);
				setState(176);
				((RestoListaVarsContext)_localctx).IDENT = match(IDENT);
				setState(177);
				((RestoListaVarsContext)_localctx).inicializacion = inicializacion();
				setState(178);
				((RestoListaVarsContext)_localctx).restoListaVars = restoListaVars();

				          ((RestoListaVarsContext)_localctx).lista =  new ArrayList<>();
				          VariableDecl v = new VariableDecl(null, (((RestoListaVarsContext)_localctx).IDENT!=null?((RestoListaVarsContext)_localctx).IDENT.getText():null));
				          if (((RestoListaVarsContext)_localctx).inicializacion.valor != null) v.setInit(((RestoListaVarsContext)_localctx).inicializacion.valor);
				          _localctx.lista.add(v);
				          _localctx.lista.addAll(((RestoListaVarsContext)_localctx).restoListaVars.lista);
				      
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				 ((RestoListaVarsContext)_localctx).lista =  new ArrayList<>(); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class InicializacionContext extends ParserRuleContext {
		public String valor;
		public ValorSimpleContext valorSimple;
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public ValorSimpleContext valorSimple() {
			return getRuleContext(ValorSimpleContext.class,0);
		}
		public InicializacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInicializacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInicializacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitInicializacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicializacionContext inicializacion() throws RecognitionException {
		InicializacionContext _localctx = new InicializacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inicializacion);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(ASSIGN);
				setState(185);
				((InicializacionContext)_localctx).valorSimple = valorSimple();
				 ((InicializacionContext)_localctx).valor =  ((InicializacionContext)_localctx).valorSimple.val; 
				}
				break;
			case COMMA:
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				 ((InicializacionContext)_localctx).valor =  null; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaConstantesContext extends ParserRuleContext {
		public Token IDENT;
		public ValorSimpleContext valorSimple;
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public ValorSimpleContext valorSimple() {
			return getRuleContext(ValorSimpleContext.class,0);
		}
		public ListaConstantesContext listaConstantes() {
			return getRuleContext(ListaConstantesContext.class,0);
		}
		public ListaConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaConstantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaConstantesContext listaConstantes() throws RecognitionException {
		ListaConstantesContext _localctx = new ListaConstantesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listaConstantes);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(COMMA);
				setState(192);
				((ListaConstantesContext)_localctx).IDENT = match(IDENT);
				setState(193);
				match(ASSIGN);
				setState(194);
				((ListaConstantesContext)_localctx).valorSimple = valorSimple();
				 trad.addDefine((((ListaConstantesContext)_localctx).IDENT!=null?((ListaConstantesContext)_localctx).IDENT.getText():null), ((ListaConstantesContext)_localctx).valorSimple.val); 
				setState(196);
				listaConstantes();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorSimpleContext extends ParserRuleContext {
		public String val;
		public Token NUM_INT_CONST;
		public Token NUM_REAL_CONST;
		public Token STRING_CONST;
		public Token NUM_INT_CONST_B;
		public Token NUM_INT_CONST_O;
		public Token NUM_INT_CONST_H;
		public Token CONST_BOOL;
		public TerminalNode NUM_INT_CONST() { return getToken(gramaticaParser.NUM_INT_CONST, 0); }
		public TerminalNode NUM_REAL_CONST() { return getToken(gramaticaParser.NUM_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(gramaticaParser.STRING_CONST, 0); }
		public TerminalNode NUM_INT_CONST_B() { return getToken(gramaticaParser.NUM_INT_CONST_B, 0); }
		public TerminalNode NUM_INT_CONST_O() { return getToken(gramaticaParser.NUM_INT_CONST_O, 0); }
		public TerminalNode NUM_INT_CONST_H() { return getToken(gramaticaParser.NUM_INT_CONST_H, 0); }
		public TerminalNode CONST_BOOL() { return getToken(gramaticaParser.CONST_BOOL, 0); }
		public ValorSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterValorSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitValorSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitValorSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorSimpleContext valorSimple() throws RecognitionException {
		ValorSimpleContext _localctx = new ValorSimpleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valorSimple);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				((ValorSimpleContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				 ((ValorSimpleContext)_localctx).val =  (((ValorSimpleContext)_localctx).NUM_INT_CONST!=null?((ValorSimpleContext)_localctx).NUM_INT_CONST.getText():null); 
				}
				break;
			case NUM_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				((ValorSimpleContext)_localctx).NUM_REAL_CONST = match(NUM_REAL_CONST);
				 ((ValorSimpleContext)_localctx).val =  (((ValorSimpleContext)_localctx).NUM_REAL_CONST!=null?((ValorSimpleContext)_localctx).NUM_REAL_CONST.getText():null); 
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				((ValorSimpleContext)_localctx).STRING_CONST = match(STRING_CONST);
				 ((ValorSimpleContext)_localctx).val =  toCLiteral((((ValorSimpleContext)_localctx).STRING_CONST!=null?((ValorSimpleContext)_localctx).STRING_CONST.getText():null)); 
				}
				break;
			case NUM_INT_CONST_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				((ValorSimpleContext)_localctx).NUM_INT_CONST_B = match(NUM_INT_CONST_B);

				          String raw = (((ValorSimpleContext)_localctx).NUM_INT_CONST_B!=null?((ValorSimpleContext)_localctx).NUM_INT_CONST_B.getText():null);
				          ((ValorSimpleContext)_localctx).val =  "0b" + raw.substring(2, raw.length() - 1);
				      
				}
				break;
			case NUM_INT_CONST_O:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				((ValorSimpleContext)_localctx).NUM_INT_CONST_O = match(NUM_INT_CONST_O);

				          String raw = (((ValorSimpleContext)_localctx).NUM_INT_CONST_O!=null?((ValorSimpleContext)_localctx).NUM_INT_CONST_O.getText():null);
				          ((ValorSimpleContext)_localctx).val =  "0o" + raw.substring(2, raw.length() - 1);
				      
				}
				break;
			case NUM_INT_CONST_H:
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
				((ValorSimpleContext)_localctx).NUM_INT_CONST_H = match(NUM_INT_CONST_H);

				          String raw = (((ValorSimpleContext)_localctx).NUM_INT_CONST_H!=null?((ValorSimpleContext)_localctx).NUM_INT_CONST_H.getText():null);
				          ((ValorSimpleContext)_localctx).val =  "0x" + raw.substring(2, raw.length() - 1);
				      
				}
				break;
			case CONST_BOOL:
				enterOuterAlt(_localctx, 7);
				{
				setState(213);
				((ValorSimpleContext)_localctx).CONST_BOOL = match(CONST_BOOL);
				 ((ValorSimpleContext)_localctx).val =  (((ValorSimpleContext)_localctx).CONST_BOOL!=null?((ValorSimpleContext)_localctx).CONST_BOOL.getText():null).equals(".TRUE.") ? "1" : "0"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorSimpleOpcContext extends ParserRuleContext {
		public String val;
		public ValorSimpleContext valorSimple;
		public ValorSimpleContext valorSimple() {
			return getRuleContext(ValorSimpleContext.class,0);
		}
		public ValorSimpleOpcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorSimpleOpc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterValorSimpleOpc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitValorSimpleOpc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitValorSimpleOpc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorSimpleOpcContext valorSimpleOpc() throws RecognitionException {
		ValorSimpleOpcContext _localctx = new ValorSimpleOpcContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_valorSimpleOpc);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case CONST_BOOL:
			case NUM_REAL_CONST:
			case NUM_INT_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				((ValorSimpleOpcContext)_localctx).valorSimple = valorSimple();
				 ((ValorSimpleOpcContext)_localctx).val =  ((ValorSimpleOpcContext)_localctx).valorSimple.val; 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				 ((ValorSimpleOpcContext)_localctx).val =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfazContext extends ParserRuleContext {
		public CuerpoInterfazContext cuerpoInterfaz() {
			return getRuleContext(CuerpoInterfazContext.class,0);
		}
		public InterfazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInterfaz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInterfaz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitInterfaz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfazContext interfaz() throws RecognitionException {
		InterfazContext _localctx = new InterfazContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaz);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(T__9);
				setState(224);
				cuerpoInterfaz();
				setState(225);
				match(T__1);
				setState(226);
				match(T__9);
				}
				break;
			case T__16:
			case T__17:
			case T__18:
			case CALL:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class CuerpoInterfazContext extends ParserRuleContext {
		public ElementoInterfazContext elementoInterfaz() {
			return getRuleContext(ElementoInterfazContext.class,0);
		}
		public RestoInterfazContext restoInterfaz() {
			return getRuleContext(RestoInterfazContext.class,0);
		}
		public CuerpoInterfazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpoInterfaz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCuerpoInterfaz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCuerpoInterfaz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCuerpoInterfaz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoInterfazContext cuerpoInterfaz() throws RecognitionException {
		CuerpoInterfazContext _localctx = new CuerpoInterfazContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cuerpoInterfaz);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				elementoInterfaz();
				setState(232);
				restoInterfaz();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class RestoInterfazContext extends ParserRuleContext {
		public ElementoInterfazContext elementoInterfaz() {
			return getRuleContext(ElementoInterfazContext.class,0);
		}
		public RestoInterfazContext restoInterfaz() {
			return getRuleContext(RestoInterfazContext.class,0);
		}
		public RestoInterfazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restoInterfaz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRestoInterfaz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRestoInterfaz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRestoInterfaz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestoInterfazContext restoInterfaz() throws RecognitionException {
		RestoInterfazContext _localctx = new RestoInterfazContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_restoInterfaz);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				elementoInterfaz();
				setState(238);
				restoInterfaz();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementoInterfazContext extends ParserRuleContext {
		public CabeceraProcedimientoContext cabeceraProcedimiento() {
			return getRuleContext(CabeceraProcedimientoContext.class,0);
		}
		public CabeceraFuncionContext cabeceraFuncion() {
			return getRuleContext(CabeceraFuncionContext.class,0);
		}
		public ElementoInterfazContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoInterfaz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterElementoInterfaz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitElementoInterfaz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitElementoInterfaz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoInterfazContext elementoInterfaz() throws RecognitionException {
		ElementoInterfazContext _localctx = new ElementoInterfazContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elementoInterfaz);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				cabeceraProcedimiento();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				cabeceraFuncion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaSubprogramasContext extends ParserRuleContext {
		public CuerpoSubrutinaContext cuerpoSubrutina() {
			return getRuleContext(CuerpoSubrutinaContext.class,0);
		}
		public ListaSubprogramasContext listaSubprogramas() {
			return getRuleContext(ListaSubprogramasContext.class,0);
		}
		public CuerpoFuncionContext cuerpoFuncion() {
			return getRuleContext(CuerpoFuncionContext.class,0);
		}
		public ListaSubprogramasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaSubprogramas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaSubprogramas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaSubprogramas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaSubprogramas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaSubprogramasContext listaSubprogramas() throws RecognitionException {
		ListaSubprogramasContext _localctx = new ListaSubprogramasContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_listaSubprogramas);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				cuerpoSubrutina();
				setState(248);
				listaSubprogramas();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				cuerpoFuncion();
				setState(251);
				listaSubprogramas();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class CabeceraProcedimientoContext extends ParserRuleContext {
		public Token n1;
		public ListaParamsFormalesContext listaParamsFormales;
		public ListaDecParamsSubContext listaDecParamsSub;
		public Token n2;
		public ListaParamsFormalesContext listaParamsFormales() {
			return getRuleContext(ListaParamsFormalesContext.class,0);
		}
		public ListaDecParamsSubContext listaDecParamsSub() {
			return getRuleContext(ListaDecParamsSubContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(gramaticaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(gramaticaParser.IDENT, i);
		}
		public CabeceraProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabeceraProcedimiento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCabeceraProcedimiento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCabeceraProcedimiento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCabeceraProcedimiento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabeceraProcedimientoContext cabeceraProcedimiento() throws RecognitionException {
		CabeceraProcedimientoContext _localctx = new CabeceraProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cabeceraProcedimiento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__10);
			setState(257);
			((CabeceraProcedimientoContext)_localctx).n1 = match(IDENT);
			setState(258);
			((CabeceraProcedimientoContext)_localctx).listaParamsFormales = listaParamsFormales();
			setState(259);
			((CabeceraProcedimientoContext)_localctx).listaDecParamsSub = listaDecParamsSub();
			setState(260);
			match(T__1);
			setState(261);
			match(T__10);
			setState(262);
			((CabeceraProcedimientoContext)_localctx).n2 = match(IDENT);

			          String nomInicio = (((CabeceraProcedimientoContext)_localctx).n1!=null?((CabeceraProcedimientoContext)_localctx).n1.getText():null);
			          String nomFin    = (((CabeceraProcedimientoContext)_localctx).n2!=null?((CabeceraProcedimientoContext)_localctx).n2.getText():null);
			          if (!nomInicio.equals(nomFin))
			              throw new RuntimeException("Error semántico: los identificadores de " +
			                  "SUBROUTINE no coinciden: '" + nomInicio + "' vs '" + nomFin + "'");
			          for (int i = 0; i < ((CabeceraProcedimientoContext)_localctx).listaParamsFormales.lista.size(); i++) {
			              Parametro p = ((CabeceraProcedimientoContext)_localctx).listaParamsFormales.lista.get(i);
			              Parametro q = ((CabeceraProcedimientoContext)_localctx).listaDecParamsSub.lista.get(i);
			              p.tipo = q.tipo;
			              p.esPorRef = q.esPorRef;
			          }
			          trad.addDecFun("void", nomInicio, ((CabeceraProcedimientoContext)_localctx).listaParamsFormales.lista);
			      
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
	public static class CabeceraFuncionContext extends ParserRuleContext {
		public Token n1;
		public ListaNombresParamsContext listaNombresParams;
		public TipoDatoContext tipoDato;
		public Token n2;
		public ListaDecParamsFunContext listaDecParamsFun;
		public Token n3;
		public ListaNombresParamsContext listaNombresParams() {
			return getRuleContext(ListaNombresParamsContext.class,0);
		}
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gramaticaParser.SEMI, 0); }
		public ListaDecParamsFunContext listaDecParamsFun() {
			return getRuleContext(ListaDecParamsFunContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(gramaticaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(gramaticaParser.IDENT, i);
		}
		public CabeceraFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabeceraFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCabeceraFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCabeceraFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCabeceraFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabeceraFuncionContext cabeceraFuncion() throws RecognitionException {
		CabeceraFuncionContext _localctx = new CabeceraFuncionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cabeceraFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__11);
			setState(266);
			((CabeceraFuncionContext)_localctx).n1 = match(IDENT);
			setState(267);
			match(T__7);
			setState(268);
			((CabeceraFuncionContext)_localctx).listaNombresParams = listaNombresParams();
			setState(269);
			match(T__8);
			setState(270);
			((CabeceraFuncionContext)_localctx).tipoDato = tipoDato();
			setState(271);
			match(T__3);
			setState(272);
			((CabeceraFuncionContext)_localctx).n2 = match(IDENT);
			setState(273);
			match(SEMI);
			setState(274);
			((CabeceraFuncionContext)_localctx).listaDecParamsFun = listaDecParamsFun();
			setState(275);
			match(T__1);
			setState(276);
			match(T__11);
			setState(277);
			((CabeceraFuncionContext)_localctx).n3 = match(IDENT);

			          String nomFun = (((CabeceraFuncionContext)_localctx).n1!=null?((CabeceraFuncionContext)_localctx).n1.getText():null);
			          String nomRetVar = (((CabeceraFuncionContext)_localctx).n2!=null?((CabeceraFuncionContext)_localctx).n2.getText():null);
			          String nomFin = (((CabeceraFuncionContext)_localctx).n3!=null?((CabeceraFuncionContext)_localctx).n3.getText():null);
			          if (!nomFun.equals(nomFin))
			              throw new RuntimeException("Error semántico: los identificadores de " +
			                  "FUNCTION no coinciden: '" + nomFun + "' vs '" + nomFin + "'");
			          if (!nomFun.equals(nomRetVar))
			              throw new RuntimeException("Error semántico: la variable de retorno '" +
			                  nomRetVar + "' no coincide con el nombre de la función '" + nomFun + "'");
			          for (int i = 0; i < ((CabeceraFuncionContext)_localctx).listaNombresParams.lista.size(); i++) {
			              Parametro p = ((CabeceraFuncionContext)_localctx).listaNombresParams.lista.get(i);
			              Parametro q = ((CabeceraFuncionContext)_localctx).listaDecParamsFun.lista.get(i);
			              p.tipo = q.tipo;
			              p.esPorRef = q.esPorRef;
			          }
			          trad.addDecFun(((CabeceraFuncionContext)_localctx).tipoDato.tipoC, nomFun, ((CabeceraFuncionContext)_localctx).listaNombresParams.lista);
			      
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
	public static class CuerpoSubrutinaContext extends ParserRuleContext {
		public Token n1;
		public ListaParamsFormalesContext listaParamsFormales;
		public ListaDecParamsSubContext listaDecParamsSub;
		public BloqueDeclaracionesContext bloqueDeclaraciones;
		public BloqueSentenciasContext bloqueSentencias;
		public Token n2;
		public ListaParamsFormalesContext listaParamsFormales() {
			return getRuleContext(ListaParamsFormalesContext.class,0);
		}
		public ListaDecParamsSubContext listaDecParamsSub() {
			return getRuleContext(ListaDecParamsSubContext.class,0);
		}
		public BloqueDeclaracionesContext bloqueDeclaraciones() {
			return getRuleContext(BloqueDeclaracionesContext.class,0);
		}
		public BloqueSentenciasContext bloqueSentencias() {
			return getRuleContext(BloqueSentenciasContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(gramaticaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(gramaticaParser.IDENT, i);
		}
		public CuerpoSubrutinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpoSubrutina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCuerpoSubrutina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCuerpoSubrutina(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCuerpoSubrutina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoSubrutinaContext cuerpoSubrutina() throws RecognitionException {
		CuerpoSubrutinaContext _localctx = new CuerpoSubrutinaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cuerpoSubrutina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__10);
			setState(281);
			((CuerpoSubrutinaContext)_localctx).n1 = match(IDENT);
			setState(282);
			((CuerpoSubrutinaContext)_localctx).listaParamsFormales = listaParamsFormales();
			setState(283);
			((CuerpoSubrutinaContext)_localctx).listaDecParamsSub = listaDecParamsSub();
			setState(284);
			((CuerpoSubrutinaContext)_localctx).bloqueDeclaraciones = bloqueDeclaraciones();
			setState(285);
			((CuerpoSubrutinaContext)_localctx).bloqueSentencias = bloqueSentencias();
			setState(286);
			match(T__1);
			setState(287);
			match(T__10);
			setState(288);
			((CuerpoSubrutinaContext)_localctx).n2 = match(IDENT);

			          String nomInicio = (((CuerpoSubrutinaContext)_localctx).n1!=null?((CuerpoSubrutinaContext)_localctx).n1.getText():null);
			          String nomFin = (((CuerpoSubrutinaContext)_localctx).n2!=null?((CuerpoSubrutinaContext)_localctx).n2.getText():null);
			          if (!nomInicio.equals(nomFin))
			              throw new RuntimeException("Error semántico: los identificadores de " +
			                  "SUBROUTINE no coinciden: '" + nomInicio + "' vs '" + nomFin + "'");
			          for (int i = 0; i < ((CuerpoSubrutinaContext)_localctx).listaParamsFormales.lista.size(); i++) {
			              Parametro p = ((CuerpoSubrutinaContext)_localctx).listaParamsFormales.lista.get(i);
			              Parametro q = ((CuerpoSubrutinaContext)_localctx).listaDecParamsSub.lista.get(i);
			              p.tipo = q.tipo;
			              p.esPorRef = q.esPorRef;
			          }
			          trad.getContexto().entrarProcedimiento(nomInicio);
			          trad.addProcedimiento(nomInicio, ((CuerpoSubrutinaContext)_localctx).listaParamsFormales.lista,
			                                ((CuerpoSubrutinaContext)_localctx).bloqueDeclaraciones.listaVars, ((CuerpoSubrutinaContext)_localctx).bloqueSentencias.codigo);
			          trad.getContexto().salir();
			      
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
	public static class CuerpoFuncionContext extends ParserRuleContext {
		public Token n1;
		public ListaNombresParamsContext listaNombresParams;
		public TipoDatoContext tipoDato;
		public Token n2;
		public ListaDecParamsFunContext listaDecParamsFun;
		public BloqueDeclaracionesContext bloqueDeclaraciones;
		public BloqueSentenciasContext bloqueSentencias;
		public Token n4;
		public ListaNombresParamsContext listaNombresParams() {
			return getRuleContext(ListaNombresParamsContext.class,0);
		}
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gramaticaParser.SEMI, 0); }
		public ListaDecParamsFunContext listaDecParamsFun() {
			return getRuleContext(ListaDecParamsFunContext.class,0);
		}
		public BloqueDeclaracionesContext bloqueDeclaraciones() {
			return getRuleContext(BloqueDeclaracionesContext.class,0);
		}
		public BloqueSentenciasContext bloqueSentencias() {
			return getRuleContext(BloqueSentenciasContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(gramaticaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(gramaticaParser.IDENT, i);
		}
		public CuerpoFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpoFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCuerpoFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCuerpoFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCuerpoFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoFuncionContext cuerpoFuncion() throws RecognitionException {
		CuerpoFuncionContext _localctx = new CuerpoFuncionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cuerpoFuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__11);
			setState(292);
			((CuerpoFuncionContext)_localctx).n1 = match(IDENT);
			setState(293);
			match(T__7);
			setState(294);
			((CuerpoFuncionContext)_localctx).listaNombresParams = listaNombresParams();
			setState(295);
			match(T__8);
			setState(296);
			((CuerpoFuncionContext)_localctx).tipoDato = tipoDato();
			setState(297);
			match(T__3);
			setState(298);
			((CuerpoFuncionContext)_localctx).n2 = match(IDENT);
			setState(299);
			match(SEMI);
			setState(300);
			((CuerpoFuncionContext)_localctx).listaDecParamsFun = listaDecParamsFun();

			          // Activar contexto ANTES de parsear el cuerpo para que las asignaciones
			          // al nombre de la funcion se conviertan en 'return'
			          String nomFun0 = (((CuerpoFuncionContext)_localctx).n1!=null?((CuerpoFuncionContext)_localctx).n1.getText():null);
			          String nomRetVar0 = (((CuerpoFuncionContext)_localctx).n2!=null?((CuerpoFuncionContext)_localctx).n2.getText():null);
			          if (!nomFun0.equals(nomRetVar0))
			              throw new RuntimeException("Error semántico: la variable de retorno '" +
			                  nomRetVar0 + "' no coincide con el nombre de la función '" + nomFun0 + "'");
			          for (int i = 0; i < ((CuerpoFuncionContext)_localctx).listaNombresParams.lista.size(); i++) {
			              Parametro p = ((CuerpoFuncionContext)_localctx).listaNombresParams.lista.get(i);
			              Parametro q = ((CuerpoFuncionContext)_localctx).listaDecParamsFun.lista.get(i);
			              p.tipo = q.tipo;
			              p.esPorRef = q.esPorRef;
			          }
			          trad.getContexto().entrarFuncion(nomFun0, ((CuerpoFuncionContext)_localctx).tipoDato.tipoC);
			      
			setState(302);
			((CuerpoFuncionContext)_localctx).bloqueDeclaraciones = bloqueDeclaraciones();
			setState(303);
			((CuerpoFuncionContext)_localctx).bloqueSentencias = bloqueSentencias();
			setState(304);
			match(T__1);
			setState(305);
			match(T__11);
			setState(306);
			((CuerpoFuncionContext)_localctx).n4 = match(IDENT);

			          String nomFun = (((CuerpoFuncionContext)_localctx).n1!=null?((CuerpoFuncionContext)_localctx).n1.getText():null);
			          String nomFin = (((CuerpoFuncionContext)_localctx).n4!=null?((CuerpoFuncionContext)_localctx).n4.getText():null);
			          if (!nomFun.equals(nomFin))
			              throw new RuntimeException("Error semántico: los identificadores de " +
			                  "FUNCTION no coinciden: '" + nomFun + "' vs '" + nomFin + "'");
			          trad.addFuncion(nomFun, ((CuerpoFuncionContext)_localctx).tipoDato.tipoC, ((CuerpoFuncionContext)_localctx).listaNombresParams.lista,
			                          ((CuerpoFuncionContext)_localctx).bloqueDeclaraciones.listaVars, ((CuerpoFuncionContext)_localctx).bloqueSentencias.codigo);
			          trad.getContexto().salir();
			      
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
	public static class ListaParamsFormalesContext extends ParserRuleContext {
		public List<Parametro> lista;
		public ListaNombresParamsContext listaNombresParams;
		public ListaNombresParamsContext listaNombresParams() {
			return getRuleContext(ListaNombresParamsContext.class,0);
		}
		public ListaParamsFormalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParamsFormales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaParamsFormales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaParamsFormales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaParamsFormales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParamsFormalesContext listaParamsFormales() throws RecognitionException {
		ListaParamsFormalesContext _localctx = new ListaParamsFormalesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_listaParamsFormales);
		try {
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(T__7);
				setState(310);
				((ListaParamsFormalesContext)_localctx).listaNombresParams = listaNombresParams();
				setState(311);
				match(T__8);
				 ((ListaParamsFormalesContext)_localctx).lista =  ((ListaParamsFormalesContext)_localctx).listaNombresParams.lista; 
				}
				break;
			case T__1:
			case T__4:
			case T__5:
			case T__6:
			case T__16:
			case T__17:
			case T__18:
			case CALL:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				 ((ListaParamsFormalesContext)_localctx).lista =  new ArrayList<>(); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaNombresParamsContext extends ParserRuleContext {
		public List<Parametro> lista;
		public Token IDENT;
		public RestoNombresParamsContext restoNombresParams;
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public RestoNombresParamsContext restoNombresParams() {
			return getRuleContext(RestoNombresParamsContext.class,0);
		}
		public ListaNombresParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaNombresParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaNombresParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaNombresParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaNombresParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaNombresParamsContext listaNombresParams() throws RecognitionException {
		ListaNombresParamsContext _localctx = new ListaNombresParamsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_listaNombresParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			((ListaNombresParamsContext)_localctx).IDENT = match(IDENT);
			setState(318);
			((ListaNombresParamsContext)_localctx).restoNombresParams = restoNombresParams();

			          ((ListaNombresParamsContext)_localctx).lista =  new ArrayList<>();
			          _localctx.lista.add(new Parametro(null, (((ListaNombresParamsContext)_localctx).IDENT!=null?((ListaNombresParamsContext)_localctx).IDENT.getText():null), false));
			          _localctx.lista.addAll(((ListaNombresParamsContext)_localctx).restoNombresParams.lista);
			      
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
	public static class RestoNombresParamsContext extends ParserRuleContext {
		public List<Parametro> lista;
		public ListaNombresParamsContext listaNombresParams;
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public ListaNombresParamsContext listaNombresParams() {
			return getRuleContext(ListaNombresParamsContext.class,0);
		}
		public RestoNombresParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restoNombresParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRestoNombresParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRestoNombresParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRestoNombresParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestoNombresParamsContext restoNombresParams() throws RecognitionException {
		RestoNombresParamsContext _localctx = new RestoNombresParamsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_restoNombresParams);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(COMMA);
				setState(322);
				((RestoNombresParamsContext)_localctx).listaNombresParams = listaNombresParams();
				 ((RestoNombresParamsContext)_localctx).lista =  ((RestoNombresParamsContext)_localctx).listaNombresParams.lista; 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				 ((RestoNombresParamsContext)_localctx).lista =  new ArrayList<>(); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaDecParamsSubContext extends ParserRuleContext {
		public List<Parametro> lista;
		public TipoDatoContext tipoDato;
		public DireccionParamContext direccionParam;
		public Token IDENT;
		public ListaDecParamsSubContext listaDecParamsSub;
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public DireccionParamContext direccionParam() {
			return getRuleContext(DireccionParamContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode SEMI() { return getToken(gramaticaParser.SEMI, 0); }
		public ListaDecParamsSubContext listaDecParamsSub() {
			return getRuleContext(ListaDecParamsSubContext.class,0);
		}
		public ListaDecParamsSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDecParamsSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaDecParamsSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaDecParamsSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaDecParamsSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDecParamsSubContext listaDecParamsSub() throws RecognitionException {
		ListaDecParamsSubContext _localctx = new ListaDecParamsSubContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_listaDecParamsSub);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				((ListaDecParamsSubContext)_localctx).tipoDato = tipoDato();
				setState(329);
				match(COMMA);
				setState(330);
				match(T__12);
				setState(331);
				match(T__7);
				setState(332);
				((ListaDecParamsSubContext)_localctx).direccionParam = direccionParam();
				setState(333);
				match(T__8);
				setState(334);
				((ListaDecParamsSubContext)_localctx).IDENT = match(IDENT);
				setState(335);
				match(SEMI);
				setState(336);
				((ListaDecParamsSubContext)_localctx).listaDecParamsSub = listaDecParamsSub();

				          ((ListaDecParamsSubContext)_localctx).lista =  new ArrayList<>();
				          boolean porRef = ((ListaDecParamsSubContext)_localctx).direccionParam.esPorRef;
				          Parametro p;
				          if (((ListaDecParamsSubContext)_localctx).tipoDato.tipoC.equals("char") && ((ListaDecParamsSubContext)_localctx).tipoDato.longitud > 0)
				              p = new Parametro("char[" + ((ListaDecParamsSubContext)_localctx).tipoDato.longitud + "]", (((ListaDecParamsSubContext)_localctx).IDENT!=null?((ListaDecParamsSubContext)_localctx).IDENT.getText():null), porRef);
				          else
				              p = new Parametro(((ListaDecParamsSubContext)_localctx).tipoDato.tipoC, (((ListaDecParamsSubContext)_localctx).IDENT!=null?((ListaDecParamsSubContext)_localctx).IDENT.getText():null), porRef);
				          _localctx.lista.add(p);
				          _localctx.lista.addAll(((ListaDecParamsSubContext)_localctx).listaDecParamsSub.lista);
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 ((ListaDecParamsSubContext)_localctx).lista =  new ArrayList<>(); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaDecParamsFunContext extends ParserRuleContext {
		public List<Parametro> lista;
		public TipoDatoContext tipoDato;
		public Token IDENT;
		public ListaDecParamsFunContext listaDecParamsFun;
		public TipoDatoContext tipoDato() {
			return getRuleContext(TipoDatoContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode SEMI() { return getToken(gramaticaParser.SEMI, 0); }
		public ListaDecParamsFunContext listaDecParamsFun() {
			return getRuleContext(ListaDecParamsFunContext.class,0);
		}
		public ListaDecParamsFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDecParamsFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaDecParamsFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaDecParamsFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaDecParamsFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDecParamsFunContext listaDecParamsFun() throws RecognitionException {
		ListaDecParamsFunContext _localctx = new ListaDecParamsFunContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_listaDecParamsFun);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				((ListaDecParamsFunContext)_localctx).tipoDato = tipoDato();
				setState(343);
				match(COMMA);
				setState(344);
				match(T__12);
				setState(345);
				match(T__7);
				setState(346);
				match(T__13);
				setState(347);
				match(T__8);
				setState(348);
				((ListaDecParamsFunContext)_localctx).IDENT = match(IDENT);
				setState(349);
				match(SEMI);
				setState(350);
				((ListaDecParamsFunContext)_localctx).listaDecParamsFun = listaDecParamsFun();

				          ((ListaDecParamsFunContext)_localctx).lista =  new ArrayList<>();
				          Parametro p;
				          if (((ListaDecParamsFunContext)_localctx).tipoDato.tipoC.equals("char") && ((ListaDecParamsFunContext)_localctx).tipoDato.longitud > 0)
				              p = new Parametro("char[" + ((ListaDecParamsFunContext)_localctx).tipoDato.longitud + "]", (((ListaDecParamsFunContext)_localctx).IDENT!=null?((ListaDecParamsFunContext)_localctx).IDENT.getText():null), false);
				          else
				              p = new Parametro(((ListaDecParamsFunContext)_localctx).tipoDato.tipoC, (((ListaDecParamsFunContext)_localctx).IDENT!=null?((ListaDecParamsFunContext)_localctx).IDENT.getText():null), false);
				          _localctx.lista.add(p);
				          _localctx.lista.addAll(((ListaDecParamsFunContext)_localctx).listaDecParamsFun.lista);
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 ((ListaDecParamsFunContext)_localctx).lista =  new ArrayList<>(); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class DireccionParamContext extends ParserRuleContext {
		public boolean esPorRef;
		public DireccionParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direccionParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDireccionParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDireccionParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDireccionParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DireccionParamContext direccionParam() throws RecognitionException {
		DireccionParamContext _localctx = new DireccionParamContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_direccionParam);
		try {
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				match(T__13);
				 ((DireccionParamContext)_localctx).esPorRef =  false; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(T__14);
				 ((DireccionParamContext)_localctx).esPorRef =  true;  
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(360);
				match(T__15);
				 ((DireccionParamContext)_localctx).esPorRef =  true;  
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

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueSentenciasContext extends ParserRuleContext {
		public String codigo;
		public SentenciaContext sentencia;
		public RestoBloqueStmtsContext restoBloqueStmts;
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public RestoBloqueStmtsContext restoBloqueStmts() {
			return getRuleContext(RestoBloqueStmtsContext.class,0);
		}
		public BloqueSentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueSentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterBloqueSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitBloqueSentencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitBloqueSentencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueSentenciasContext bloqueSentencias() throws RecognitionException {
		BloqueSentenciasContext _localctx = new BloqueSentenciasContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bloqueSentencias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			((BloqueSentenciasContext)_localctx).sentencia = sentencia();
			setState(365);
			((BloqueSentenciasContext)_localctx).restoBloqueStmts = restoBloqueStmts();
			 ((BloqueSentenciasContext)_localctx).codigo =  ((BloqueSentenciasContext)_localctx).sentencia.codigo + ((BloqueSentenciasContext)_localctx).restoBloqueStmts.codigo; 
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
	public static class RestoBloqueStmtsContext extends ParserRuleContext {
		public String codigo;
		public SentenciaContext sentencia;
		public RestoBloqueStmtsContext restoBloqueStmts;
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public RestoBloqueStmtsContext restoBloqueStmts() {
			return getRuleContext(RestoBloqueStmtsContext.class,0);
		}
		public RestoBloqueStmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restoBloqueStmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRestoBloqueStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRestoBloqueStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRestoBloqueStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestoBloqueStmtsContext restoBloqueStmts() throws RecognitionException {
		RestoBloqueStmtsContext _localctx = new RestoBloqueStmtsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_restoBloqueStmts);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case T__18:
			case CALL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				((RestoBloqueStmtsContext)_localctx).sentencia = sentencia();
				setState(369);
				((RestoBloqueStmtsContext)_localctx).restoBloqueStmts = restoBloqueStmts();
				 ((RestoBloqueStmtsContext)_localctx).codigo =  ((RestoBloqueStmtsContext)_localctx).sentencia.codigo + ((RestoBloqueStmtsContext)_localctx).restoBloqueStmts.codigo; 
				}
				break;
			case T__1:
			case T__19:
			case T__21:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				 ((RestoBloqueStmtsContext)_localctx).codigo =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public String codigo;
		public AsignacionOLlamadaContext asignacionOLlamada;
		public CondicionContext condicion;
		public RamaSiContext ramaSi;
		public SentDoContext sentDo;
		public ExpresionContext expresion;
		public ListaCasosContext listaCasos;
		public AsignacionOLlamadaContext asignacionOLlamada() {
			return getRuleContext(AsignacionOLlamadaContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public RamaSiContext ramaSi() {
			return getRuleContext(RamaSiContext.class,0);
		}
		public SentDoContext sentDo() {
			return getRuleContext(SentDoContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ListaCasosContext listaCasos() {
			return getRuleContext(ListaCasosContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_sentencia);
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				((SentenciaContext)_localctx).asignacionOLlamada = asignacionOLlamada();
				 ((SentenciaContext)_localctx).codigo =  ((SentenciaContext)_localctx).asignacionOLlamada.codigo + "\n"; 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(T__16);
				setState(379);
				match(T__7);
				setState(380);
				((SentenciaContext)_localctx).condicion = condicion();
				setState(381);
				match(T__8);
				setState(382);
				((SentenciaContext)_localctx).ramaSi = ramaSi();
				 String _s = "if(" + ((SentenciaContext)_localctx).condicion.codigo + ") " + ((SentenciaContext)_localctx).ramaSi.codigo;
				        ((SentenciaContext)_localctx).codigo =  _s.stripTrailing() + "\n"; 
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				match(T__17);
				setState(386);
				((SentenciaContext)_localctx).sentDo = sentDo();
				 ((SentenciaContext)_localctx).codigo =  ((SentenciaContext)_localctx).sentDo.codigo.stripTrailing() + "\n"; 
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				match(T__18);
				setState(390);
				match(T__19);
				setState(391);
				match(T__7);
				setState(392);
				((SentenciaContext)_localctx).expresion = expresion();
				setState(393);
				match(T__8);
				setState(394);
				((SentenciaContext)_localctx).listaCasos = listaCasos();
				setState(395);
				match(T__1);
				setState(396);
				match(T__18);

				          String _sw = "switch(" + ((SentenciaContext)_localctx).expresion.codigo + ") {\n"
				                  + trad.indent(((SentenciaContext)_localctx).listaCasos.codigo)
				                  + "}";
				          ((SentenciaContext)_localctx).codigo =  _sw.stripTrailing() + "\n";
				      
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionOLlamadaContext extends ParserRuleContext {
		public String codigo;
		public Token IDENT;
		public ExpresionContext expresion;
		public LlamadaProcedimientoContext llamadaProcedimiento;
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(gramaticaParser.SEMI, 0); }
		public LlamadaProcedimientoContext llamadaProcedimiento() {
			return getRuleContext(LlamadaProcedimientoContext.class,0);
		}
		public AsignacionOLlamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionOLlamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAsignacionOLlamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAsignacionOLlamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAsignacionOLlamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionOLlamadaContext asignacionOLlamada() throws RecognitionException {
		AsignacionOLlamadaContext _localctx = new AsignacionOLlamadaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_asignacionOLlamada);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				((AsignacionOLlamadaContext)_localctx).IDENT = match(IDENT);
				setState(402);
				match(ASSIGN);
				setState(403);
				((AsignacionOLlamadaContext)_localctx).expresion = expresion();
				setState(404);
				match(SEMI);

				          if (trad.getContexto().esAsignacionDeRetorno((((AsignacionOLlamadaContext)_localctx).IDENT!=null?((AsignacionOLlamadaContext)_localctx).IDENT.getText():null)))
				              ((AsignacionOLlamadaContext)_localctx).codigo =  "return " + ((AsignacionOLlamadaContext)_localctx).expresion.codigo + ";";
				          else
				              ((AsignacionOLlamadaContext)_localctx).codigo =  (((AsignacionOLlamadaContext)_localctx).IDENT!=null?((AsignacionOLlamadaContext)_localctx).IDENT.getText():null) + " = " + ((AsignacionOLlamadaContext)_localctx).expresion.codigo + ";";
				      
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				((AsignacionOLlamadaContext)_localctx).llamadaProcedimiento = llamadaProcedimiento();
				setState(408);
				match(SEMI);
				 ((AsignacionOLlamadaContext)_localctx).codigo =  ((AsignacionOLlamadaContext)_localctx).llamadaProcedimiento.codigo + ";"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentDoContext extends ParserRuleContext {
		public String codigo;
		public CondicionContext condicion;
		public BloqueSentenciasContext bloqueSentencias;
		public Token IDENT;
		public LimDoContext ini;
		public LimDoContext fin;
		public LimDoContext inc;
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public BloqueSentenciasContext bloqueSentencias() {
			return getRuleContext(BloqueSentenciasContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(gramaticaParser.ASSIGN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(gramaticaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(gramaticaParser.COMMA, i);
		}
		public List<LimDoContext> limDo() {
			return getRuleContexts(LimDoContext.class);
		}
		public LimDoContext limDo(int i) {
			return getRuleContext(LimDoContext.class,i);
		}
		public SentDoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentDo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSentDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSentDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSentDo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentDoContext sentDo() throws RecognitionException {
		SentDoContext _localctx = new SentDoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sentDo);
		try {
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(T__20);
				setState(414);
				match(T__7);
				setState(415);
				((SentDoContext)_localctx).condicion = condicion();
				setState(416);
				match(T__8);
				setState(417);
				((SentDoContext)_localctx).bloqueSentencias = bloqueSentencias();
				setState(418);
				match(T__21);

				          ((SentDoContext)_localctx).codigo =  "while(" + ((SentDoContext)_localctx).condicion.codigo + ") {\n"
				                  + trad.indent(((SentDoContext)_localctx).bloqueSentencias.codigo)
				                  + "}";
				      
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				((SentDoContext)_localctx).IDENT = match(IDENT);
				setState(422);
				match(ASSIGN);
				setState(423);
				((SentDoContext)_localctx).ini = limDo();
				setState(424);
				match(COMMA);
				setState(425);
				((SentDoContext)_localctx).fin = limDo();
				setState(426);
				match(COMMA);
				setState(427);
				((SentDoContext)_localctx).inc = limDo();
				setState(428);
				((SentDoContext)_localctx).bloqueSentencias = bloqueSentencias();
				setState(429);
				match(T__21);

				          String var = (((SentDoContext)_localctx).IDENT!=null?((SentDoContext)_localctx).IDENT.getText():null);
				          String ini = ((SentDoContext)_localctx).ini.val;
				          String fin = ((SentDoContext)_localctx).fin.val;
				          String inc = ((SentDoContext)_localctx).inc.val;
				          ((SentDoContext)_localctx).codigo =  "for(" + var + " = " + ini + "; "
				                           + var + " != " + fin + "; "
				                           + var + " = " + var + " + " + inc + ") {\n"
				                   + trad.indent(((SentDoContext)_localctx).bloqueSentencias.codigo)
				                  + "}";
				      
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

	@SuppressWarnings("CheckReturnValue")
	public static class LimDoContext extends ParserRuleContext {
		public String val;
		public Token NUM_INT_CONST;
		public Token IDENT;
		public TerminalNode NUM_INT_CONST() { return getToken(gramaticaParser.NUM_INT_CONST, 0); }
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public LimDoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limDo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLimDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLimDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitLimDo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimDoContext limDo() throws RecognitionException {
		LimDoContext _localctx = new LimDoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_limDo);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				((LimDoContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				 ((LimDoContext)_localctx).val =  (((LimDoContext)_localctx).NUM_INT_CONST!=null?((LimDoContext)_localctx).NUM_INT_CONST.getText():null); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				((LimDoContext)_localctx).IDENT = match(IDENT);
				 ((LimDoContext)_localctx).val =  (((LimDoContext)_localctx).IDENT!=null?((LimDoContext)_localctx).IDENT.getText():null); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class RamaSiContext extends ParserRuleContext {
		public String codigo;
		public SentenciaContext sentencia;
		public BloqueSentenciasContext bloqueSentencias;
		public RamaElseContext ramaElse;
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public BloqueSentenciasContext bloqueSentencias() {
			return getRuleContext(BloqueSentenciasContext.class,0);
		}
		public RamaElseContext ramaElse() {
			return getRuleContext(RamaElseContext.class,0);
		}
		public RamaSiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ramaSi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRamaSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRamaSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRamaSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RamaSiContext ramaSi() throws RecognitionException {
		RamaSiContext _localctx = new RamaSiContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ramaSi);
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case T__18:
			case CALL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				((RamaSiContext)_localctx).sentencia = sentencia();
				 ((RamaSiContext)_localctx).codigo =  "{\n" + trad.indent(((RamaSiContext)_localctx).sentencia.codigo) + "}\n"; 
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				match(T__22);
				setState(444);
				((RamaSiContext)_localctx).bloqueSentencias = bloqueSentencias();
				setState(445);
				((RamaSiContext)_localctx).ramaElse = ramaElse();
				 ((RamaSiContext)_localctx).codigo =  "{\n" + trad.indent(((RamaSiContext)_localctx).bloqueSentencias.codigo) + "}" + ((RamaSiContext)_localctx).ramaElse.codigo + "\n"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class RamaElseContext extends ParserRuleContext {
		public String codigo;
		public BloqueSentenciasContext bloqueSentencias;
		public BloqueSentenciasContext bloqueSentencias() {
			return getRuleContext(BloqueSentenciasContext.class,0);
		}
		public RamaElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ramaElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRamaElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRamaElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRamaElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RamaElseContext ramaElse() throws RecognitionException {
		RamaElseContext _localctx = new RamaElseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ramaElse);
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(T__23);
				 ((RamaElseContext)_localctx).codigo =  ""; 
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(T__24);
				setState(453);
				((RamaElseContext)_localctx).bloqueSentencias = bloqueSentencias();
				setState(454);
				match(T__23);
				 ((RamaElseContext)_localctx).codigo =  " else {\n" + trad.indent(((RamaElseContext)_localctx).bloqueSentencias.codigo) + "}"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaProcedimientoContext extends ParserRuleContext {
		public String codigo;
		public Token IDENT;
		public ListaArgsRealesContext listaArgsReales;
		public TerminalNode CALL() { return getToken(gramaticaParser.CALL, 0); }
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public ListaArgsRealesContext listaArgsReales() {
			return getRuleContext(ListaArgsRealesContext.class,0);
		}
		public LlamadaProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamadaProcedimiento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLlamadaProcedimiento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLlamadaProcedimiento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitLlamadaProcedimiento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamadaProcedimientoContext llamadaProcedimiento() throws RecognitionException {
		LlamadaProcedimientoContext _localctx = new LlamadaProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_llamadaProcedimiento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(CALL);
			setState(460);
			((LlamadaProcedimientoContext)_localctx).IDENT = match(IDENT);
			setState(461);
			((LlamadaProcedimientoContext)_localctx).listaArgsReales = listaArgsReales();
			 ((LlamadaProcedimientoContext)_localctx).codigo =  (((LlamadaProcedimientoContext)_localctx).IDENT!=null?((LlamadaProcedimientoContext)_localctx).IDENT.getText():null) + "(" + ((LlamadaProcedimientoContext)_localctx).listaArgsReales.lista + ")"; 
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
	public static class ListaArgsRealesContext extends ParserRuleContext {
		public String lista;
		public ExpresionContext expresion;
		public ListaExpresionesContext listaExpresiones;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ListaExpresionesContext listaExpresiones() {
			return getRuleContext(ListaExpresionesContext.class,0);
		}
		public ListaArgsRealesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgsReales; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaArgsReales(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaArgsReales(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaArgsReales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaArgsRealesContext listaArgsReales() throws RecognitionException {
		ListaArgsRealesContext _localctx = new ListaArgsRealesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_listaArgsReales);
		try {
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(T__7);
				setState(465);
				((ListaArgsRealesContext)_localctx).expresion = expresion();
				setState(466);
				((ListaArgsRealesContext)_localctx).listaExpresiones = listaExpresiones();
				setState(467);
				match(T__8);
				 ((ListaArgsRealesContext)_localctx).lista =  ((ListaArgsRealesContext)_localctx).expresion.codigo + ((ListaArgsRealesContext)_localctx).listaExpresiones.lista; 
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				 ((ListaArgsRealesContext)_localctx).lista =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public String codigo;
		public FactorContext factor;
		public RestoExpresionContext restoExpresion;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public RestoExpresionContext restoExpresion() {
			return getRuleContext(RestoExpresionContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			((ExpresionContext)_localctx).factor = factor();
			setState(474);
			((ExpresionContext)_localctx).restoExpresion = restoExpresion();
			 ((ExpresionContext)_localctx).codigo =  ((ExpresionContext)_localctx).factor.codigo + ((ExpresionContext)_localctx).restoExpresion.codigo; 
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
	public static class RestoExpresionContext extends ParserRuleContext {
		public String codigo;
		public OperadorAritContext operadorArit;
		public FactorContext factor;
		public RestoExpresionContext restoExpresion;
		public OperadorAritContext operadorArit() {
			return getRuleContext(OperadorAritContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public RestoExpresionContext restoExpresion() {
			return getRuleContext(RestoExpresionContext.class,0);
		}
		public RestoExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restoExpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRestoExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRestoExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRestoExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestoExpresionContext restoExpresion() throws RecognitionException {
		RestoExpresionContext _localctx = new RestoExpresionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_restoExpresion);
		try {
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				((RestoExpresionContext)_localctx).operadorArit = operadorArit();
				setState(478);
				((RestoExpresionContext)_localctx).factor = factor();
				setState(479);
				((RestoExpresionContext)_localctx).restoExpresion = restoExpresion();
				 ((RestoExpresionContext)_localctx).codigo =  " " + (((RestoExpresionContext)_localctx).operadorArit!=null?_input.getText(((RestoExpresionContext)_localctx).operadorArit.start,((RestoExpresionContext)_localctx).operadorArit.stop):null) + " " + ((RestoExpresionContext)_localctx).factor.codigo + ((RestoExpresionContext)_localctx).restoExpresion.codigo; 
				}
				break;
			case T__8:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case GE:
			case LE:
			case EQ:
			case NE:
			case GT:
			case LT:
			case COMMA:
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				 ((RestoExpresionContext)_localctx).codigo =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorAritContext extends ParserRuleContext {
		public OperadorAritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorArit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperadorArit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperadorArit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOperadorArit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorAritContext operadorArit() throws RecognitionException {
		OperadorAritContext _localctx = new OperadorAritContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_operadorArit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public String codigo;
		public ValorSimpleContext valorSimple;
		public ExpresionContext expresion;
		public Token IDENT;
		public SufijoPosibleFuncContext sufijoPosibleFunc;
		public ValorSimpleContext valorSimple() {
			return getRuleContext(ValorSimpleContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public SufijoPosibleFuncContext sufijoPosibleFunc() {
			return getRuleContext(SufijoPosibleFuncContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_factor);
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case CONST_BOOL:
			case NUM_REAL_CONST:
			case NUM_INT_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				((FactorContext)_localctx).valorSimple = valorSimple();
				 ((FactorContext)_localctx).codigo =  ((FactorContext)_localctx).valorSimple.val; 
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				match(T__7);
				setState(491);
				((FactorContext)_localctx).expresion = expresion();
				setState(492);
				match(T__8);
				 ((FactorContext)_localctx).codigo =  "(" + ((FactorContext)_localctx).expresion.codigo + ")"; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				((FactorContext)_localctx).IDENT = match(IDENT);
				setState(496);
				((FactorContext)_localctx).sufijoPosibleFunc = sufijoPosibleFunc();
				 ((FactorContext)_localctx).codigo =  (((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null) + ((FactorContext)_localctx).sufijoPosibleFunc.codigo; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class SufijoPosibleFuncContext extends ParserRuleContext {
		public String codigo;
		public ExpresionContext expresion;
		public ListaExpresionesContext listaExpresiones;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ListaExpresionesContext listaExpresiones() {
			return getRuleContext(ListaExpresionesContext.class,0);
		}
		public SufijoPosibleFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sufijoPosibleFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSufijoPosibleFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSufijoPosibleFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSufijoPosibleFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SufijoPosibleFuncContext sufijoPosibleFunc() throws RecognitionException {
		SufijoPosibleFuncContext _localctx = new SufijoPosibleFuncContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_sufijoPosibleFunc);
		try {
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				match(T__7);
				setState(502);
				((SufijoPosibleFuncContext)_localctx).expresion = expresion();
				setState(503);
				((SufijoPosibleFuncContext)_localctx).listaExpresiones = listaExpresiones();
				setState(504);
				match(T__8);
				 ((SufijoPosibleFuncContext)_localctx).codigo =  "(" + ((SufijoPosibleFuncContext)_localctx).expresion.codigo + ((SufijoPosibleFuncContext)_localctx).listaExpresiones.lista + ")"; 
				}
				break;
			case T__8:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case GE:
			case LE:
			case EQ:
			case NE:
			case GT:
			case LT:
			case COMMA:
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				 ((SufijoPosibleFuncContext)_localctx).codigo =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaExpresionesContext extends ParserRuleContext {
		public String lista;
		public ExpresionContext expresion;
		public ListaExpresionesContext listaExpresiones;
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ListaExpresionesContext listaExpresiones() {
			return getRuleContext(ListaExpresionesContext.class,0);
		}
		public ListaExpresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExpresiones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaExpresiones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaExpresiones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaExpresiones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaExpresionesContext listaExpresiones() throws RecognitionException {
		ListaExpresionesContext _localctx = new ListaExpresionesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_listaExpresiones);
		try {
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				match(COMMA);
				setState(511);
				((ListaExpresionesContext)_localctx).expresion = expresion();
				setState(512);
				((ListaExpresionesContext)_localctx).listaExpresiones = listaExpresiones();
				 ((ListaExpresionesContext)_localctx).lista =  ", " + ((ListaExpresionesContext)_localctx).expresion.codigo + ((ListaExpresionesContext)_localctx).listaExpresiones.lista; 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				 ((ListaExpresionesContext)_localctx).lista =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public String codigo;
		public FactorCondContext factorCond;
		public RestoCondicionContext restoCondicion;
		public FactorCondContext factorCond() {
			return getRuleContext(FactorCondContext.class,0);
		}
		public RestoCondicionContext restoCondicion() {
			return getRuleContext(RestoCondicionContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			((CondicionContext)_localctx).factorCond = factorCond();
			setState(519);
			((CondicionContext)_localctx).restoCondicion = restoCondicion();
			 ((CondicionContext)_localctx).codigo =  ((CondicionContext)_localctx).factorCond.codigo + ((CondicionContext)_localctx).restoCondicion.codigo; 
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
	public static class RestoCondicionContext extends ParserRuleContext {
		public String codigo;
		public OperadorLogicoContext operadorLogico;
		public FactorCondContext factorCond;
		public RestoCondicionContext restoCondicion;
		public OperadorLogicoContext operadorLogico() {
			return getRuleContext(OperadorLogicoContext.class,0);
		}
		public FactorCondContext factorCond() {
			return getRuleContext(FactorCondContext.class,0);
		}
		public RestoCondicionContext restoCondicion() {
			return getRuleContext(RestoCondicionContext.class,0);
		}
		public RestoCondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restoCondicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRestoCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRestoCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRestoCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestoCondicionContext restoCondicion() throws RecognitionException {
		RestoCondicionContext _localctx = new RestoCondicionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_restoCondicion);
		try {
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__30:
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				((RestoCondicionContext)_localctx).operadorLogico = operadorLogico();
				setState(523);
				((RestoCondicionContext)_localctx).factorCond = factorCond();
				setState(524);
				((RestoCondicionContext)_localctx).restoCondicion = restoCondicion();

				          ((RestoCondicionContext)_localctx).codigo =  " " + traducirOpLog((((RestoCondicionContext)_localctx).operadorLogico!=null?_input.getText(((RestoCondicionContext)_localctx).operadorLogico.start,((RestoCondicionContext)_localctx).operadorLogico.stop):null)) + " "
				                  + ((RestoCondicionContext)_localctx).factorCond.codigo
				                  + ((RestoCondicionContext)_localctx).restoCondicion.codigo;
				      
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				 ((RestoCondicionContext)_localctx).codigo =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorLogicoContext extends ParserRuleContext {
		public OperadorLogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorLogico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperadorLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperadorLogico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOperadorLogico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorLogicoContext operadorLogico() throws RecognitionException {
		OperadorLogicoContext _localctx = new OperadorLogicoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_operadorLogico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorCondContext extends ParserRuleContext {
		public String codigo;
		public ExpresionContext e1;
		public OperadorCompContext operadorComp;
		public ExpresionContext e2;
		public CondicionContext condicion;
		public FactorCondContext factorCond;
		public Token CONST_BOOL;
		public OperadorCompContext operadorComp() {
			return getRuleContext(OperadorCompContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public FactorCondContext factorCond() {
			return getRuleContext(FactorCondContext.class,0);
		}
		public TerminalNode CONST_BOOL() { return getToken(gramaticaParser.CONST_BOOL, 0); }
		public FactorCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFactorCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFactorCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFactorCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorCondContext factorCond() throws RecognitionException {
		FactorCondContext _localctx = new FactorCondContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_factorCond);
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				((FactorCondContext)_localctx).e1 = expresion();
				setState(533);
				((FactorCondContext)_localctx).operadorComp = operadorComp();
				setState(534);
				((FactorCondContext)_localctx).e2 = expresion();
				 ((FactorCondContext)_localctx).codigo =  ((FactorCondContext)_localctx).e1.codigo + " " + ((FactorCondContext)_localctx).operadorComp.texto + " " + ((FactorCondContext)_localctx).e2.codigo; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				match(T__7);
				setState(538);
				((FactorCondContext)_localctx).condicion = condicion();
				setState(539);
				match(T__8);
				 ((FactorCondContext)_localctx).codigo =  "(" + ((FactorCondContext)_localctx).condicion.codigo + ")"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
				match(T__33);
				setState(543);
				((FactorCondContext)_localctx).factorCond = factorCond();
				 ((FactorCondContext)_localctx).codigo =  "!" + ((FactorCondContext)_localctx).factorCond.codigo; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(546);
				((FactorCondContext)_localctx).CONST_BOOL = match(CONST_BOOL);
				 ((FactorCondContext)_localctx).codigo =  (((FactorCondContext)_localctx).CONST_BOOL!=null?((FactorCondContext)_localctx).CONST_BOOL.getText():null).equals(".TRUE.") ? "1" : "0"; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorCompContext extends ParserRuleContext {
		public String texto;
		public TerminalNode LT() { return getToken(gramaticaParser.LT, 0); }
		public TerminalNode GT() { return getToken(gramaticaParser.GT, 0); }
		public TerminalNode LE() { return getToken(gramaticaParser.LE, 0); }
		public TerminalNode GE() { return getToken(gramaticaParser.GE, 0); }
		public TerminalNode EQ() { return getToken(gramaticaParser.EQ, 0); }
		public TerminalNode NE() { return getToken(gramaticaParser.NE, 0); }
		public OperadorCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperadorComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperadorComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitOperadorComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorCompContext operadorComp() throws RecognitionException {
		OperadorCompContext _localctx = new OperadorCompContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_operadorComp);
		try {
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				match(LT);
				 ((OperadorCompContext)_localctx).texto =  "<"; 
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				match(GT);
				 ((OperadorCompContext)_localctx).texto =  ">"; 
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
				match(LE);
				 ((OperadorCompContext)_localctx).texto =  "<="; 
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 4);
				{
				setState(556);
				match(GE);
				 ((OperadorCompContext)_localctx).texto =  ">="; 
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(558);
				match(EQ);
				 ((OperadorCompContext)_localctx).texto =  "=="; 
				}
				break;
			case NE:
				enterOuterAlt(_localctx, 6);
				{
				setState(560);
				match(NE);
				 ((OperadorCompContext)_localctx).texto =  "!="; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaCasosContext extends ParserRuleContext {
		public String codigo;
		public RamaCasoContext ramaCaso;
		public RamaCasoContext ramaCaso() {
			return getRuleContext(RamaCasoContext.class,0);
		}
		public ListaCasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaCasos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaCasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaCasos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaCasos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaCasosContext listaCasos() throws RecognitionException {
		ListaCasosContext _localctx = new ListaCasosContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_listaCasos);
		try {
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				match(T__19);
				setState(565);
				((ListaCasosContext)_localctx).ramaCaso = ramaCaso();
				 ((ListaCasosContext)_localctx).codigo =  ((ListaCasosContext)_localctx).ramaCaso.codigo; 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				 ((ListaCasosContext)_localctx).codigo =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class RamaCasoContext extends ParserRuleContext {
		public String codigo;
		public EtiquetasCasoContext etiquetasCaso;
		public BloqueSentenciasContext bloqueSentencias;
		public ListaCasosContext listaCasos;
		public EtiquetasCasoContext etiquetasCaso() {
			return getRuleContext(EtiquetasCasoContext.class,0);
		}
		public BloqueSentenciasContext bloqueSentencias() {
			return getRuleContext(BloqueSentenciasContext.class,0);
		}
		public ListaCasosContext listaCasos() {
			return getRuleContext(ListaCasosContext.class,0);
		}
		public RamaCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ramaCaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRamaCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRamaCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRamaCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RamaCasoContext ramaCaso() throws RecognitionException {
		RamaCasoContext _localctx = new RamaCasoContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_ramaCaso);
		try {
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				match(T__7);
				setState(572);
				((RamaCasoContext)_localctx).etiquetasCaso = etiquetasCaso();
				setState(573);
				match(T__8);
				setState(574);
				((RamaCasoContext)_localctx).bloqueSentencias = bloqueSentencias();
				setState(575);
				((RamaCasoContext)_localctx).listaCasos = listaCasos();

				          StringBuilder sb = new StringBuilder();
				          for (String etiq : ((RamaCasoContext)_localctx).etiquetasCaso.lista)
				              sb.append("case ").append(etiq).append(":\n");
				          sb.append(trad.indent(((RamaCasoContext)_localctx).bloqueSentencias.codigo));
				          sb.append("break;\n");
				          sb.append(((RamaCasoContext)_localctx).listaCasos.codigo);
				          ((RamaCasoContext)_localctx).codigo =  sb.toString();
				      
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(578);
				match(T__34);
				setState(579);
				((RamaCasoContext)_localctx).bloqueSentencias = bloqueSentencias();

				          ((RamaCasoContext)_localctx).codigo =  "default:\n"
				                  + trad.indent(((RamaCasoContext)_localctx).bloqueSentencias.codigo);
				      
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

	@SuppressWarnings("CheckReturnValue")
	public static class EtiquetasCasoContext extends ParserRuleContext {
		public List<String> lista;
		public ValorSimpleContext valorSimple;
		public RestoEtiquetasContext restoEtiquetas;
		public ValorSimpleContext valorSimple() {
			return getRuleContext(ValorSimpleContext.class,0);
		}
		public RestoEtiquetasContext restoEtiquetas() {
			return getRuleContext(RestoEtiquetasContext.class,0);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public EtiquetasCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetasCaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEtiquetasCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEtiquetasCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitEtiquetasCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtiquetasCasoContext etiquetasCaso() throws RecognitionException {
		EtiquetasCasoContext _localctx = new EtiquetasCasoContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_etiquetasCaso);
		try {
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case CONST_BOOL:
			case NUM_REAL_CONST:
			case NUM_INT_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				((EtiquetasCasoContext)_localctx).valorSimple = valorSimple();
				setState(585);
				((EtiquetasCasoContext)_localctx).restoEtiquetas = restoEtiquetas();

				          ((EtiquetasCasoContext)_localctx).lista =  new ArrayList<>();
				          String v = ((EtiquetasCasoContext)_localctx).valorSimple.val;
				          if (((EtiquetasCasoContext)_localctx).restoEtiquetas.esRango) {
				              String fin = ((EtiquetasCasoContext)_localctx).restoEtiquetas.valFin;
				              if (fin.isEmpty())
				                  _localctx.lista.add("> " + v);
				              else
				                  _localctx.lista.add(v + " to " + fin);
				          } else {
				              _localctx.lista.add(v);
				              _localctx.lista.addAll(((EtiquetasCasoContext)_localctx).restoEtiquetas.lista);
				          }
				      
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				match(COLON);
				setState(589);
				((EtiquetasCasoContext)_localctx).valorSimple = valorSimple();

				          ((EtiquetasCasoContext)_localctx).lista =  new ArrayList<>();
				          _localctx.lista.add("< " + ((EtiquetasCasoContext)_localctx).valorSimple.val);
				      
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

	@SuppressWarnings("CheckReturnValue")
	public static class RestoEtiquetasContext extends ParserRuleContext {
		public List<String> lista;
		public boolean esRango;
		public String valFin;
		public MasEtiquetasContext masEtiquetas;
		public ValorSimpleOpcContext valorSimpleOpc;
		public MasEtiquetasContext masEtiquetas() {
			return getRuleContext(MasEtiquetasContext.class,0);
		}
		public TerminalNode COLON() { return getToken(gramaticaParser.COLON, 0); }
		public ValorSimpleOpcContext valorSimpleOpc() {
			return getRuleContext(ValorSimpleOpcContext.class,0);
		}
		public RestoEtiquetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restoEtiquetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRestoEtiquetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRestoEtiquetas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRestoEtiquetas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestoEtiquetasContext restoEtiquetas() throws RecognitionException {
		RestoEtiquetasContext _localctx = new RestoEtiquetasContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_restoEtiquetas);
		try {
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				((RestoEtiquetasContext)_localctx).masEtiquetas = masEtiquetas();
				 ((RestoEtiquetasContext)_localctx).lista =  ((RestoEtiquetasContext)_localctx).masEtiquetas.lista; ((RestoEtiquetasContext)_localctx).esRango =  false; ((RestoEtiquetasContext)_localctx).valFin =  ""; 
				}
				break;
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				match(COLON);
				setState(598);
				((RestoEtiquetasContext)_localctx).valorSimpleOpc = valorSimpleOpc();
				 ((RestoEtiquetasContext)_localctx).lista =  new ArrayList<>(); ((RestoEtiquetasContext)_localctx).esRango =  true; ((RestoEtiquetasContext)_localctx).valFin =  ((RestoEtiquetasContext)_localctx).valorSimpleOpc.val; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class MasEtiquetasContext extends ParserRuleContext {
		public List<String> lista;
		public ValorSimpleContext valorSimple;
		public MasEtiquetasContext masEtiquetas;
		public TerminalNode COMMA() { return getToken(gramaticaParser.COMMA, 0); }
		public ValorSimpleContext valorSimple() {
			return getRuleContext(ValorSimpleContext.class,0);
		}
		public MasEtiquetasContext masEtiquetas() {
			return getRuleContext(MasEtiquetasContext.class,0);
		}
		public MasEtiquetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_masEtiquetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMasEtiquetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMasEtiquetas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitMasEtiquetas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MasEtiquetasContext masEtiquetas() throws RecognitionException {
		MasEtiquetasContext _localctx = new MasEtiquetasContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_masEtiquetas);
		try {
			setState(609);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				match(COMMA);
				setState(604);
				((MasEtiquetasContext)_localctx).valorSimple = valorSimple();
				setState(605);
				((MasEtiquetasContext)_localctx).masEtiquetas = masEtiquetas();

				          ((MasEtiquetasContext)_localctx).lista =  new ArrayList<>();
				          _localctx.lista.add(((MasEtiquetasContext)_localctx).valorSimple.val);
				          _localctx.lista.addAll(((MasEtiquetasContext)_localctx).masEtiquetas.lista);
				      
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				 ((MasEtiquetasContext)_localctx).lista =  new ArrayList<>(); 
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
		"\u0004\u00018\u0264\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0082\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0098\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a2\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a9\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b7\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00be\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c8\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00d8\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00de\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00e6"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00ec"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00f2"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00f6\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00ff\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u013c\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u0147\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0155\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0163\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u016b\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0176\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0190\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u019c\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u01b1\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u01b7\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u01c1\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0003#\u01ca\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01d8\b%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01e4"+
		"\b\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u01f4\b)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0003*\u01fd\b*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0003+\u0205\b+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0003-\u0211\b-\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u0225\b/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u0233\b0\u0001"+
		"1\u00011\u00011\u00011\u00011\u00031\u023a\b1\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u0247\b2\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00033\u0251\b3\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u025a\b4\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00035\u0262\b5\u00015\u0000\u00006\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhj\u0000\u0002\u0001\u0000"+
		"\u001a\u001d\u0001\u0000\u001e!\u0265\u0000l\u0001\u0000\u0000\u0000\u0002"+
		"y\u0001\u0000\u0000\u0000\u0004\u0081\u0001\u0000\u0000\u0000\u0006\u0083"+
		"\u0001\u0000\u0000\u0000\b\u0097\u0001\u0000\u0000\u0000\n\u00a1\u0001"+
		"\u0000\u0000\u0000\f\u00a8\u0001\u0000\u0000\u0000\u000e\u00aa\u0001\u0000"+
		"\u0000\u0000\u0010\u00b6\u0001\u0000\u0000\u0000\u0012\u00bd\u0001\u0000"+
		"\u0000\u0000\u0014\u00c7\u0001\u0000\u0000\u0000\u0016\u00d7\u0001\u0000"+
		"\u0000\u0000\u0018\u00dd\u0001\u0000\u0000\u0000\u001a\u00e5\u0001\u0000"+
		"\u0000\u0000\u001c\u00eb\u0001\u0000\u0000\u0000\u001e\u00f1\u0001\u0000"+
		"\u0000\u0000 \u00f5\u0001\u0000\u0000\u0000\"\u00fe\u0001\u0000\u0000"+
		"\u0000$\u0100\u0001\u0000\u0000\u0000&\u0109\u0001\u0000\u0000\u0000("+
		"\u0118\u0001\u0000\u0000\u0000*\u0123\u0001\u0000\u0000\u0000,\u013b\u0001"+
		"\u0000\u0000\u0000.\u013d\u0001\u0000\u0000\u00000\u0146\u0001\u0000\u0000"+
		"\u00002\u0154\u0001\u0000\u0000\u00004\u0162\u0001\u0000\u0000\u00006"+
		"\u016a\u0001\u0000\u0000\u00008\u016c\u0001\u0000\u0000\u0000:\u0175\u0001"+
		"\u0000\u0000\u0000<\u018f\u0001\u0000\u0000\u0000>\u019b\u0001\u0000\u0000"+
		"\u0000@\u01b0\u0001\u0000\u0000\u0000B\u01b6\u0001\u0000\u0000\u0000D"+
		"\u01c0\u0001\u0000\u0000\u0000F\u01c9\u0001\u0000\u0000\u0000H\u01cb\u0001"+
		"\u0000\u0000\u0000J\u01d7\u0001\u0000\u0000\u0000L\u01d9\u0001\u0000\u0000"+
		"\u0000N\u01e3\u0001\u0000\u0000\u0000P\u01e5\u0001\u0000\u0000\u0000R"+
		"\u01f3\u0001\u0000\u0000\u0000T\u01fc\u0001\u0000\u0000\u0000V\u0204\u0001"+
		"\u0000\u0000\u0000X\u0206\u0001\u0000\u0000\u0000Z\u0210\u0001\u0000\u0000"+
		"\u0000\\\u0212\u0001\u0000\u0000\u0000^\u0224\u0001\u0000\u0000\u0000"+
		"`\u0232\u0001\u0000\u0000\u0000b\u0239\u0001\u0000\u0000\u0000d\u0246"+
		"\u0001\u0000\u0000\u0000f\u0250\u0001\u0000\u0000\u0000h\u0259\u0001\u0000"+
		"\u0000\u0000j\u0261\u0001\u0000\u0000\u0000lm\u0005\u0001\u0000\u0000"+
		"mn\u0003\u0002\u0001\u0000no\u0005.\u0000\u0000op\u0003\u0004\u0002\u0000"+
		"pq\u0003\u001a\r\u0000qr\u00038\u001c\u0000rs\u0005\u0002\u0000\u0000"+
		"st\u0005\u0001\u0000\u0000tu\u0003\u0002\u0001\u0000uv\u0003\"\u0011\u0000"+
		"vw\u0005\u0000\u0000\u0001wx\u0006\u0000\uffff\uffff\u0000x\u0001\u0001"+
		"\u0000\u0000\u0000yz\u0005%\u0000\u0000z{\u0006\u0001\uffff\uffff\u0000"+
		"{\u0003\u0001\u0000\u0000\u0000|}\u0003\u0006\u0003\u0000}~\u0003\u0004"+
		"\u0002\u0000~\u007f\u0006\u0002\uffff\uffff\u0000\u007f\u0082\u0001\u0000"+
		"\u0000\u0000\u0080\u0082\u0006\u0002\uffff\uffff\u0000\u0081|\u0001\u0000"+
		"\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0005\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0003\n\u0005\u0000\u0084\u0085\u0003\b\u0004"+
		"\u0000\u0085\u0086\u0006\u0003\uffff\uffff\u0000\u0086\u0007\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005-\u0000\u0000\u0088\u0089\u0005\u0003\u0000"+
		"\u0000\u0089\u008a\u0005\u0004\u0000\u0000\u008a\u008b\u0005%\u0000\u0000"+
		"\u008b\u008c\u0005/\u0000\u0000\u008c\u008d\u0003\u0016\u000b\u0000\u008d"+
		"\u008e\u0006\u0004\uffff\uffff\u0000\u008e\u008f\u0003\u0014\n\u0000\u008f"+
		"\u0090\u0005.\u0000\u0000\u0090\u0091\u0006\u0004\uffff\uffff\u0000\u0091"+
		"\u0098\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0004\u0000\u0000\u0093"+
		"\u0094\u0003\u000e\u0007\u0000\u0094\u0095\u0005.\u0000\u0000\u0095\u0096"+
		"\u0006\u0004\uffff\uffff\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097"+
		"\u0087\u0001\u0000\u0000\u0000\u0097\u0092\u0001\u0000\u0000\u0000\u0098"+
		"\t\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0005\u0000\u0000\u009a\u00a2"+
		"\u0006\u0005\uffff\uffff\u0000\u009b\u009c\u0005\u0006\u0000\u0000\u009c"+
		"\u00a2\u0006\u0005\uffff\uffff\u0000\u009d\u009e\u0005\u0007\u0000\u0000"+
		"\u009e\u009f\u0003\f\u0006\u0000\u009f\u00a0\u0006\u0005\uffff\uffff\u0000"+
		"\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u0099\u0001\u0000\u0000\u0000"+
		"\u00a1\u009b\u0001\u0000\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000"+
		"\u00a2\u000b\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\b\u0000\u0000\u00a4"+
		"\u00a5\u00055\u0000\u0000\u00a5\u00a6\u0005\t\u0000\u0000\u00a6\u00a9"+
		"\u0006\u0006\uffff\uffff\u0000\u00a7\u00a9\u0006\u0006\uffff\uffff\u0000"+
		"\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a9\r\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005%\u0000\u0000\u00ab"+
		"\u00ac\u0003\u0012\t\u0000\u00ac\u00ad\u0003\u0010\b\u0000\u00ad\u00ae"+
		"\u0006\u0007\uffff\uffff\u0000\u00ae\u000f\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005-\u0000\u0000\u00b0\u00b1\u0005%\u0000\u0000\u00b1\u00b2\u0003"+
		"\u0012\t\u0000\u00b2\u00b3\u0003\u0010\b\u0000\u00b3\u00b4\u0006\b\uffff"+
		"\uffff\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b7\u0006\b\uffff"+
		"\uffff\u0000\u00b6\u00af\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u0011\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005/\u0000"+
		"\u0000\u00b9\u00ba\u0003\u0016\u000b\u0000\u00ba\u00bb\u0006\t\uffff\uffff"+
		"\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00be\u0006\t\uffff\uffff"+
		"\u0000\u00bd\u00b8\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000"+
		"\u0000\u00be\u0013\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005-\u0000\u0000"+
		"\u00c0\u00c1\u0005%\u0000\u0000\u00c1\u00c2\u0005/\u0000\u0000\u00c2\u00c3"+
		"\u0003\u0016\u000b\u0000\u00c3\u00c4\u0006\n\uffff\uffff\u0000\u00c4\u00c5"+
		"\u0003\u0014\n\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c7\u00bf\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c8\u0015\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005"+
		"5\u0000\u0000\u00ca\u00d8\u0006\u000b\uffff\uffff\u0000\u00cb\u00cc\u0005"+
		"4\u0000\u0000\u00cc\u00d8\u0006\u000b\uffff\uffff\u0000\u00cd\u00ce\u0005"+
		"6\u0000\u0000\u00ce\u00d8\u0006\u000b\uffff\uffff\u0000\u00cf\u00d0\u0005"+
		"0\u0000\u0000\u00d0\u00d8\u0006\u000b\uffff\uffff\u0000\u00d1\u00d2\u0005"+
		"1\u0000\u0000\u00d2\u00d8\u0006\u000b\uffff\uffff\u0000\u00d3\u00d4\u0005"+
		"2\u0000\u0000\u00d4\u00d8\u0006\u000b\uffff\uffff\u0000\u00d5\u00d6\u0005"+
		"3\u0000\u0000\u00d6\u00d8\u0006\u000b\uffff\uffff\u0000\u00d7\u00c9\u0001"+
		"\u0000\u0000\u0000\u00d7\u00cb\u0001\u0000\u0000\u0000\u00d7\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d7\u00cf\u0001\u0000\u0000\u0000\u00d7\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d8\u0017\u0001\u0000\u0000\u0000\u00d9\u00da\u0003"+
		"\u0016\u000b\u0000\u00da\u00db\u0006\f\uffff\uffff\u0000\u00db\u00de\u0001"+
		"\u0000\u0000\u0000\u00dc\u00de\u0006\f\uffff\uffff\u0000\u00dd\u00d9\u0001"+
		"\u0000\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u0019\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0005\n\u0000\u0000\u00e0\u00e1\u0003\u001c"+
		"\u000e\u0000\u00e1\u00e2\u0005\u0002\u0000\u0000\u00e2\u00e3\u0005\n\u0000"+
		"\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e5\u00df\u0001\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e6\u001b\u0001\u0000\u0000\u0000\u00e7\u00e8\u0003 \u0010\u0000"+
		"\u00e8\u00e9\u0003\u001e\u000f\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u001d\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0003 \u0010\u0000\u00ee\u00ef\u0003\u001e\u000f\u0000\u00ef"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1"+
		"\u00ed\u0001\u0000\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		"\u001f\u0001\u0000\u0000\u0000\u00f3\u00f6\u0003$\u0012\u0000\u00f4\u00f6"+
		"\u0003&\u0013\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f6!\u0001\u0000\u0000\u0000\u00f7\u00f8\u0003(\u0014"+
		"\u0000\u00f8\u00f9\u0003\"\u0011\u0000\u00f9\u00ff\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0003*\u0015\u0000\u00fb\u00fc\u0003\"\u0011\u0000\u00fc"+
		"\u00ff\u0001\u0000\u0000\u0000\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe"+
		"\u00f7\u0001\u0000\u0000\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fd\u0001\u0000\u0000\u0000\u00ff#\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0005\u000b\u0000\u0000\u0101\u0102\u0005%\u0000\u0000\u0102\u0103\u0003"+
		",\u0016\u0000\u0103\u0104\u00032\u0019\u0000\u0104\u0105\u0005\u0002\u0000"+
		"\u0000\u0105\u0106\u0005\u000b\u0000\u0000\u0106\u0107\u0005%\u0000\u0000"+
		"\u0107\u0108\u0006\u0012\uffff\uffff\u0000\u0108%\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0005\f\u0000\u0000\u010a\u010b\u0005%\u0000\u0000\u010b"+
		"\u010c\u0005\b\u0000\u0000\u010c\u010d\u0003.\u0017\u0000\u010d\u010e"+
		"\u0005\t\u0000\u0000\u010e\u010f\u0003\n\u0005\u0000\u010f\u0110\u0005"+
		"\u0004\u0000\u0000\u0110\u0111\u0005%\u0000\u0000\u0111\u0112\u0005.\u0000"+
		"\u0000\u0112\u0113\u00034\u001a\u0000\u0113\u0114\u0005\u0002\u0000\u0000"+
		"\u0114\u0115\u0005\f\u0000\u0000\u0115\u0116\u0005%\u0000\u0000\u0116"+
		"\u0117\u0006\u0013\uffff\uffff\u0000\u0117\'\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0005\u000b\u0000\u0000\u0119\u011a\u0005%\u0000\u0000\u011a\u011b"+
		"\u0003,\u0016\u0000\u011b\u011c\u00032\u0019\u0000\u011c\u011d\u0003\u0004"+
		"\u0002\u0000\u011d\u011e\u00038\u001c\u0000\u011e\u011f\u0005\u0002\u0000"+
		"\u0000\u011f\u0120\u0005\u000b\u0000\u0000\u0120\u0121\u0005%\u0000\u0000"+
		"\u0121\u0122\u0006\u0014\uffff\uffff\u0000\u0122)\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0005\f\u0000\u0000\u0124\u0125\u0005%\u0000\u0000\u0125"+
		"\u0126\u0005\b\u0000\u0000\u0126\u0127\u0003.\u0017\u0000\u0127\u0128"+
		"\u0005\t\u0000\u0000\u0128\u0129\u0003\n\u0005\u0000\u0129\u012a\u0005"+
		"\u0004\u0000\u0000\u012a\u012b\u0005%\u0000\u0000\u012b\u012c\u0005.\u0000"+
		"\u0000\u012c\u012d\u00034\u001a\u0000\u012d\u012e\u0006\u0015\uffff\uffff"+
		"\u0000\u012e\u012f\u0003\u0004\u0002\u0000\u012f\u0130\u00038\u001c\u0000"+
		"\u0130\u0131\u0005\u0002\u0000\u0000\u0131\u0132\u0005\f\u0000\u0000\u0132"+
		"\u0133\u0005%\u0000\u0000\u0133\u0134\u0006\u0015\uffff\uffff\u0000\u0134"+
		"+\u0001\u0000\u0000\u0000\u0135\u0136\u0005\b\u0000\u0000\u0136\u0137"+
		"\u0003.\u0017\u0000\u0137\u0138\u0005\t\u0000\u0000\u0138\u0139\u0006"+
		"\u0016\uffff\uffff\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u013c"+
		"\u0006\u0016\uffff\uffff\u0000\u013b\u0135\u0001\u0000\u0000\u0000\u013b"+
		"\u013a\u0001\u0000\u0000\u0000\u013c-\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0005%\u0000\u0000\u013e\u013f\u00030\u0018\u0000\u013f\u0140\u0006\u0017"+
		"\uffff\uffff\u0000\u0140/\u0001\u0000\u0000\u0000\u0141\u0142\u0005-\u0000"+
		"\u0000\u0142\u0143\u0003.\u0017\u0000\u0143\u0144\u0006\u0018\uffff\uffff"+
		"\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0147\u0006\u0018\uffff"+
		"\uffff\u0000\u0146\u0141\u0001\u0000\u0000\u0000\u0146\u0145\u0001\u0000"+
		"\u0000\u0000\u01471\u0001\u0000\u0000\u0000\u0148\u0149\u0003\n\u0005"+
		"\u0000\u0149\u014a\u0005-\u0000\u0000\u014a\u014b\u0005\r\u0000\u0000"+
		"\u014b\u014c\u0005\b\u0000\u0000\u014c\u014d\u00036\u001b\u0000\u014d"+
		"\u014e\u0005\t\u0000\u0000\u014e\u014f\u0005%\u0000\u0000\u014f\u0150"+
		"\u0005.\u0000\u0000\u0150\u0151\u00032\u0019\u0000\u0151\u0152\u0006\u0019"+
		"\uffff\uffff\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0155\u0006"+
		"\u0019\uffff\uffff\u0000\u0154\u0148\u0001\u0000\u0000\u0000\u0154\u0153"+
		"\u0001\u0000\u0000\u0000\u01553\u0001\u0000\u0000\u0000\u0156\u0157\u0003"+
		"\n\u0005\u0000\u0157\u0158\u0005-\u0000\u0000\u0158\u0159\u0005\r\u0000"+
		"\u0000\u0159\u015a\u0005\b\u0000\u0000\u015a\u015b\u0005\u000e\u0000\u0000"+
		"\u015b\u015c\u0005\t\u0000\u0000\u015c\u015d\u0005%\u0000\u0000\u015d"+
		"\u015e\u0005.\u0000\u0000\u015e\u015f\u00034\u001a\u0000\u015f\u0160\u0006"+
		"\u001a\uffff\uffff\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u0163"+
		"\u0006\u001a\uffff\uffff\u0000\u0162\u0156\u0001\u0000\u0000\u0000\u0162"+
		"\u0161\u0001\u0000\u0000\u0000\u01635\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0005\u000e\u0000\u0000\u0165\u016b\u0006\u001b\uffff\uffff\u0000\u0166"+
		"\u0167\u0005\u000f\u0000\u0000\u0167\u016b\u0006\u001b\uffff\uffff\u0000"+
		"\u0168\u0169\u0005\u0010\u0000\u0000\u0169\u016b\u0006\u001b\uffff\uffff"+
		"\u0000\u016a\u0164\u0001\u0000\u0000\u0000\u016a\u0166\u0001\u0000\u0000"+
		"\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b7\u0001\u0000\u0000\u0000"+
		"\u016c\u016d\u0003<\u001e\u0000\u016d\u016e\u0003:\u001d\u0000\u016e\u016f"+
		"\u0006\u001c\uffff\uffff\u0000\u016f9\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u0003<\u001e\u0000\u0171\u0172\u0003:\u001d\u0000\u0172\u0173\u0006\u001d"+
		"\uffff\uffff\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174\u0176\u0006"+
		"\u001d\uffff\uffff\u0000\u0175\u0170\u0001\u0000\u0000\u0000\u0175\u0174"+
		"\u0001\u0000\u0000\u0000\u0176;\u0001\u0000\u0000\u0000\u0177\u0178\u0003"+
		">\u001f\u0000\u0178\u0179\u0006\u001e\uffff\uffff\u0000\u0179\u0190\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0005\u0011\u0000\u0000\u017b\u017c\u0005"+
		"\b\u0000\u0000\u017c\u017d\u0003X,\u0000\u017d\u017e\u0005\t\u0000\u0000"+
		"\u017e\u017f\u0003D\"\u0000\u017f\u0180\u0006\u001e\uffff\uffff\u0000"+
		"\u0180\u0190\u0001\u0000\u0000\u0000\u0181\u0182\u0005\u0012\u0000\u0000"+
		"\u0182\u0183\u0003@ \u0000\u0183\u0184\u0006\u001e\uffff\uffff\u0000\u0184"+
		"\u0190\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u0013\u0000\u0000\u0186"+
		"\u0187\u0005\u0014\u0000\u0000\u0187\u0188\u0005\b\u0000\u0000\u0188\u0189"+
		"\u0003L&\u0000\u0189\u018a\u0005\t\u0000\u0000\u018a\u018b\u0003b1\u0000"+
		"\u018b\u018c\u0005\u0002\u0000\u0000\u018c\u018d\u0005\u0013\u0000\u0000"+
		"\u018d\u018e\u0006\u001e\uffff\uffff\u0000\u018e\u0190\u0001\u0000\u0000"+
		"\u0000\u018f\u0177\u0001\u0000\u0000\u0000\u018f\u017a\u0001\u0000\u0000"+
		"\u0000\u018f\u0181\u0001\u0000\u0000\u0000\u018f\u0185\u0001\u0000\u0000"+
		"\u0000\u0190=\u0001\u0000\u0000\u0000\u0191\u0192\u0005%\u0000\u0000\u0192"+
		"\u0193\u0005/\u0000\u0000\u0193\u0194\u0003L&\u0000\u0194\u0195\u0005"+
		".\u0000\u0000\u0195\u0196\u0006\u001f\uffff\uffff\u0000\u0196\u019c\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0003H$\u0000\u0198\u0199\u0005.\u0000"+
		"\u0000\u0199\u019a\u0006\u001f\uffff\uffff\u0000\u019a\u019c\u0001\u0000"+
		"\u0000\u0000\u019b\u0191\u0001\u0000\u0000\u0000\u019b\u0197\u0001\u0000"+
		"\u0000\u0000\u019c?\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u0015\u0000"+
		"\u0000\u019e\u019f\u0005\b\u0000\u0000\u019f\u01a0\u0003X,\u0000\u01a0"+
		"\u01a1\u0005\t\u0000\u0000\u01a1\u01a2\u00038\u001c\u0000\u01a2\u01a3"+
		"\u0005\u0016\u0000\u0000\u01a3\u01a4\u0006 \uffff\uffff\u0000\u01a4\u01b1"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005%\u0000\u0000\u01a6\u01a7\u0005"+
		"/\u0000\u0000\u01a7\u01a8\u0003B!\u0000\u01a8\u01a9\u0005-\u0000\u0000"+
		"\u01a9\u01aa\u0003B!\u0000\u01aa\u01ab\u0005-\u0000\u0000\u01ab\u01ac"+
		"\u0003B!\u0000\u01ac\u01ad\u00038\u001c\u0000\u01ad\u01ae\u0005\u0016"+
		"\u0000\u0000\u01ae\u01af\u0006 \uffff\uffff\u0000\u01af\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b0\u019d\u0001\u0000\u0000\u0000\u01b0\u01a5\u0001\u0000"+
		"\u0000\u0000\u01b1A\u0001\u0000\u0000\u0000\u01b2\u01b3\u00055\u0000\u0000"+
		"\u01b3\u01b7\u0006!\uffff\uffff\u0000\u01b4\u01b5\u0005%\u0000\u0000\u01b5"+
		"\u01b7\u0006!\uffff\uffff\u0000\u01b6\u01b2\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b7C\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0003<\u001e\u0000\u01b9\u01ba\u0006\"\uffff\uffff\u0000\u01ba\u01c1"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005\u0017\u0000\u0000\u01bc\u01bd"+
		"\u00038\u001c\u0000\u01bd\u01be\u0003F#\u0000\u01be\u01bf\u0006\"\uffff"+
		"\uffff\u0000\u01bf\u01c1\u0001\u0000\u0000\u0000\u01c0\u01b8\u0001\u0000"+
		"\u0000\u0000\u01c0\u01bb\u0001\u0000\u0000\u0000\u01c1E\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0005\u0018\u0000\u0000\u01c3\u01ca\u0006#\uffff\uffff"+
		"\u0000\u01c4\u01c5\u0005\u0019\u0000\u0000\u01c5\u01c6\u00038\u001c\u0000"+
		"\u01c6\u01c7\u0005\u0018\u0000\u0000\u01c7\u01c8\u0006#\uffff\uffff\u0000"+
		"\u01c8\u01ca\u0001\u0000\u0000\u0000\u01c9\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c9\u01c4\u0001\u0000\u0000\u0000\u01caG\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cc\u0005$\u0000\u0000\u01cc\u01cd\u0005%\u0000\u0000\u01cd\u01ce\u0003"+
		"J%\u0000\u01ce\u01cf\u0006$\uffff\uffff\u0000\u01cfI\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d1\u0005\b\u0000\u0000\u01d1\u01d2\u0003L&\u0000\u01d2"+
		"\u01d3\u0003V+\u0000\u01d3\u01d4\u0005\t\u0000\u0000\u01d4\u01d5\u0006"+
		"%\uffff\uffff\u0000\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6\u01d8\u0006"+
		"%\uffff\uffff\u0000\u01d7\u01d0\u0001\u0000\u0000\u0000\u01d7\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d8K\u0001\u0000\u0000\u0000\u01d9\u01da\u0003R)"+
		"\u0000\u01da\u01db\u0003N\'\u0000\u01db\u01dc\u0006&\uffff\uffff\u0000"+
		"\u01dcM\u0001\u0000\u0000\u0000\u01dd\u01de\u0003P(\u0000\u01de\u01df"+
		"\u0003R)\u0000\u01df\u01e0\u0003N\'\u0000\u01e0\u01e1\u0006\'\uffff\uffff"+
		"\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000\u01e2\u01e4\u0006\'\uffff\uffff"+
		"\u0000\u01e3\u01dd\u0001\u0000\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e4O\u0001\u0000\u0000\u0000\u01e5\u01e6\u0007\u0000\u0000\u0000"+
		"\u01e6Q\u0001\u0000\u0000\u0000\u01e7\u01e8\u0003\u0016\u000b\u0000\u01e8"+
		"\u01e9\u0006)\uffff\uffff\u0000\u01e9\u01f4\u0001\u0000\u0000\u0000\u01ea"+
		"\u01eb\u0005\b\u0000\u0000\u01eb\u01ec\u0003L&\u0000\u01ec\u01ed\u0005"+
		"\t\u0000\u0000\u01ed\u01ee\u0006)\uffff\uffff\u0000\u01ee\u01f4\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f0\u0005%\u0000\u0000\u01f0\u01f1\u0003T*"+
		"\u0000\u01f1\u01f2\u0006)\uffff\uffff\u0000\u01f2\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f3\u01e7\u0001\u0000\u0000\u0000\u01f3\u01ea\u0001\u0000\u0000"+
		"\u0000\u01f3\u01ef\u0001\u0000\u0000\u0000\u01f4S\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f6\u0005\b\u0000\u0000\u01f6\u01f7\u0003L&\u0000\u01f7\u01f8"+
		"\u0003V+\u0000\u01f8\u01f9\u0005\t\u0000\u0000\u01f9\u01fa\u0006*\uffff"+
		"\uffff\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01fd\u0006*\uffff"+
		"\uffff\u0000\u01fc\u01f5\u0001\u0000\u0000\u0000\u01fc\u01fb\u0001\u0000"+
		"\u0000\u0000\u01fdU\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005-\u0000\u0000"+
		"\u01ff\u0200\u0003L&\u0000\u0200\u0201\u0003V+\u0000\u0201\u0202\u0006"+
		"+\uffff\uffff\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0205\u0006"+
		"+\uffff\uffff\u0000\u0204\u01fe\u0001\u0000\u0000\u0000\u0204\u0203\u0001"+
		"\u0000\u0000\u0000\u0205W\u0001\u0000\u0000\u0000\u0206\u0207\u0003^/"+
		"\u0000\u0207\u0208\u0003Z-\u0000\u0208\u0209\u0006,\uffff\uffff\u0000"+
		"\u0209Y\u0001\u0000\u0000\u0000\u020a\u020b\u0003\\.\u0000\u020b\u020c"+
		"\u0003^/\u0000\u020c\u020d\u0003Z-\u0000\u020d\u020e\u0006-\uffff\uffff"+
		"\u0000\u020e\u0211\u0001\u0000\u0000\u0000\u020f\u0211\u0006-\uffff\uffff"+
		"\u0000\u0210\u020a\u0001\u0000\u0000\u0000\u0210\u020f\u0001\u0000\u0000"+
		"\u0000\u0211[\u0001\u0000\u0000\u0000\u0212\u0213\u0007\u0001\u0000\u0000"+
		"\u0213]\u0001\u0000\u0000\u0000\u0214\u0215\u0003L&\u0000\u0215\u0216"+
		"\u0003`0\u0000\u0216\u0217\u0003L&\u0000\u0217\u0218\u0006/\uffff\uffff"+
		"\u0000\u0218\u0225\u0001\u0000\u0000\u0000\u0219\u021a\u0005\b\u0000\u0000"+
		"\u021a\u021b\u0003X,\u0000\u021b\u021c\u0005\t\u0000\u0000\u021c\u021d"+
		"\u0006/\uffff\uffff\u0000\u021d\u0225\u0001\u0000\u0000\u0000\u021e\u021f"+
		"\u0005\"\u0000\u0000\u021f\u0220\u0003^/\u0000\u0220\u0221\u0006/\uffff"+
		"\uffff\u0000\u0221\u0225\u0001\u0000\u0000\u0000\u0222\u0223\u00053\u0000"+
		"\u0000\u0223\u0225\u0006/\uffff\uffff\u0000\u0224\u0214\u0001\u0000\u0000"+
		"\u0000\u0224\u0219\u0001\u0000\u0000\u0000\u0224\u021e\u0001\u0000\u0000"+
		"\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0225_\u0001\u0000\u0000\u0000"+
		"\u0226\u0227\u0005+\u0000\u0000\u0227\u0233\u00060\uffff\uffff\u0000\u0228"+
		"\u0229\u0005*\u0000\u0000\u0229\u0233\u00060\uffff\uffff\u0000\u022a\u022b"+
		"\u0005\'\u0000\u0000\u022b\u0233\u00060\uffff\uffff\u0000\u022c\u022d"+
		"\u0005&\u0000\u0000\u022d\u0233\u00060\uffff\uffff\u0000\u022e\u022f\u0005"+
		"(\u0000\u0000\u022f\u0233\u00060\uffff\uffff\u0000\u0230\u0231\u0005)"+
		"\u0000\u0000\u0231\u0233\u00060\uffff\uffff\u0000\u0232\u0226\u0001\u0000"+
		"\u0000\u0000\u0232\u0228\u0001\u0000\u0000\u0000\u0232\u022a\u0001\u0000"+
		"\u0000\u0000\u0232\u022c\u0001\u0000\u0000\u0000\u0232\u022e\u0001\u0000"+
		"\u0000\u0000\u0232\u0230\u0001\u0000\u0000\u0000\u0233a\u0001\u0000\u0000"+
		"\u0000\u0234\u0235\u0005\u0014\u0000\u0000\u0235\u0236\u0003d2\u0000\u0236"+
		"\u0237\u00061\uffff\uffff\u0000\u0237\u023a\u0001\u0000\u0000\u0000\u0238"+
		"\u023a\u00061\uffff\uffff\u0000\u0239\u0234\u0001\u0000\u0000\u0000\u0239"+
		"\u0238\u0001\u0000\u0000\u0000\u023ac\u0001\u0000\u0000\u0000\u023b\u023c"+
		"\u0005\b\u0000\u0000\u023c\u023d\u0003f3\u0000\u023d\u023e\u0005\t\u0000"+
		"\u0000\u023e\u023f\u00038\u001c\u0000\u023f\u0240\u0003b1\u0000\u0240"+
		"\u0241\u00062\uffff\uffff\u0000\u0241\u0247\u0001\u0000\u0000\u0000\u0242"+
		"\u0243\u0005#\u0000\u0000\u0243\u0244\u00038\u001c\u0000\u0244\u0245\u0006"+
		"2\uffff\uffff\u0000\u0245\u0247\u0001\u0000\u0000\u0000\u0246\u023b\u0001"+
		"\u0000\u0000\u0000\u0246\u0242\u0001\u0000\u0000\u0000\u0247e\u0001\u0000"+
		"\u0000\u0000\u0248\u0249\u0003\u0016\u000b\u0000\u0249\u024a\u0003h4\u0000"+
		"\u024a\u024b\u00063\uffff\uffff\u0000\u024b\u0251\u0001\u0000\u0000\u0000"+
		"\u024c\u024d\u0005,\u0000\u0000\u024d\u024e\u0003\u0016\u000b\u0000\u024e"+
		"\u024f\u00063\uffff\uffff\u0000\u024f\u0251\u0001\u0000\u0000\u0000\u0250"+
		"\u0248\u0001\u0000\u0000\u0000\u0250\u024c\u0001\u0000\u0000\u0000\u0251"+
		"g\u0001\u0000\u0000\u0000\u0252\u0253\u0003j5\u0000\u0253\u0254\u0006"+
		"4\uffff\uffff\u0000\u0254\u025a\u0001\u0000\u0000\u0000\u0255\u0256\u0005"+
		",\u0000\u0000\u0256\u0257\u0003\u0018\f\u0000\u0257\u0258\u00064\uffff"+
		"\uffff\u0000\u0258\u025a\u0001\u0000\u0000\u0000\u0259\u0252\u0001\u0000"+
		"\u0000\u0000\u0259\u0255\u0001\u0000\u0000\u0000\u025ai\u0001\u0000\u0000"+
		"\u0000\u025b\u025c\u0005-\u0000\u0000\u025c\u025d\u0003\u0016\u000b\u0000"+
		"\u025d\u025e\u0003j5\u0000\u025e\u025f\u00065\uffff\uffff\u0000\u025f"+
		"\u0262\u0001\u0000\u0000\u0000\u0260\u0262\u00065\uffff\uffff\u0000\u0261"+
		"\u025b\u0001\u0000\u0000\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0262"+
		"k\u0001\u0000\u0000\u0000\'\u0081\u0097\u00a1\u00a8\u00b6\u00bd\u00c7"+
		"\u00d7\u00dd\u00e5\u00eb\u00f1\u00f5\u00fe\u013b\u0146\u0154\u0162\u016a"+
		"\u0175\u018f\u019b\u01b0\u01b6\u01c0\u01c9\u01d7\u01e3\u01f3\u01fc\u0204"+
		"\u0210\u0224\u0232\u0239\u0246\u0250\u0259\u0261";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}