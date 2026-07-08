// Generated from C:/Users/Alexis/Documents/UNI/Tercero/Lenguajes/P2Obligatoria/entrega_po_pl/src/gramatica.g4 by ANTLR 4.13.2

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#nombreProg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombreProg(gramaticaParser.NombreProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#bloqueDeclaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueDeclaraciones(gramaticaParser.BloqueDeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(gramaticaParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#especDeclaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEspecDeclaracion(gramaticaParser.EspecDeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#tipoDato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoDato(gramaticaParser.TipoDatoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#longitudChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongitudChar(gramaticaParser.LongitudCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaVariables(gramaticaParser.ListaVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#restoListaVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestoListaVars(gramaticaParser.RestoListaVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#inicializacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacion(gramaticaParser.InicializacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaConstantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaConstantes(gramaticaParser.ListaConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#valorSimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorSimple(gramaticaParser.ValorSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#valorSimpleOpc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorSimpleOpc(gramaticaParser.ValorSimpleOpcContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#interfaz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaz(gramaticaParser.InterfazContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cuerpoInterfaz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpoInterfaz(gramaticaParser.CuerpoInterfazContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#restoInterfaz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestoInterfaz(gramaticaParser.RestoInterfazContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#elementoInterfaz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoInterfaz(gramaticaParser.ElementoInterfazContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaSubprogramas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaSubprogramas(gramaticaParser.ListaSubprogramasContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cabeceraProcedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabeceraProcedimiento(gramaticaParser.CabeceraProcedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cabeceraFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabeceraFuncion(gramaticaParser.CabeceraFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cuerpoSubrutina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpoSubrutina(gramaticaParser.CuerpoSubrutinaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#cuerpoFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpoFuncion(gramaticaParser.CuerpoFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaParamsFormales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParamsFormales(gramaticaParser.ListaParamsFormalesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaNombresParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaNombresParams(gramaticaParser.ListaNombresParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#restoNombresParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestoNombresParams(gramaticaParser.RestoNombresParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaDecParamsSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDecParamsSub(gramaticaParser.ListaDecParamsSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaDecParamsFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDecParamsFun(gramaticaParser.ListaDecParamsFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#direccionParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDireccionParam(gramaticaParser.DireccionParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#bloqueSentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueSentencias(gramaticaParser.BloqueSentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#restoBloqueStmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestoBloqueStmts(gramaticaParser.RestoBloqueStmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(gramaticaParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#asignacionOLlamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionOLlamada(gramaticaParser.AsignacionOLlamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sentDo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentDo(gramaticaParser.SentDoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#limDo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimDo(gramaticaParser.LimDoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#ramaSi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRamaSi(gramaticaParser.RamaSiContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#ramaElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRamaElse(gramaticaParser.RamaElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#llamadaProcedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamadaProcedimiento(gramaticaParser.LlamadaProcedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaArgsReales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgsReales(gramaticaParser.ListaArgsRealesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(gramaticaParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#restoExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestoExpresion(gramaticaParser.RestoExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#operadorArit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorArit(gramaticaParser.OperadorAritContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sufijoPosibleFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSufijoPosibleFunc(gramaticaParser.SufijoPosibleFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaExpresiones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaExpresiones(gramaticaParser.ListaExpresionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(gramaticaParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#restoCondicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestoCondicion(gramaticaParser.RestoCondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#operadorLogico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorLogico(gramaticaParser.OperadorLogicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#factorCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorCond(gramaticaParser.FactorCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#operadorComp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorComp(gramaticaParser.OperadorCompContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaCasos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaCasos(gramaticaParser.ListaCasosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#ramaCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRamaCaso(gramaticaParser.RamaCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#etiquetasCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiquetasCaso(gramaticaParser.EtiquetasCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#restoEtiquetas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestoEtiquetas(gramaticaParser.RestoEtiquetasContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#masEtiquetas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasEtiquetas(gramaticaParser.MasEtiquetasContext ctx);
}