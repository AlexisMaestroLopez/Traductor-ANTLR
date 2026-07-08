// Generated from C:/Users/Alexis/Documents/UNI/Tercero/Lenguajes/P2Obligatoria/entrega_po_pl/src/gramatica.g4 by ANTLR 4.13.2

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#nombreProg}.
	 * @param ctx the parse tree
	 */
	void enterNombreProg(gramaticaParser.NombreProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#nombreProg}.
	 * @param ctx the parse tree
	 */
	void exitNombreProg(gramaticaParser.NombreProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#bloqueDeclaraciones}.
	 * @param ctx the parse tree
	 */
	void enterBloqueDeclaraciones(gramaticaParser.BloqueDeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#bloqueDeclaraciones}.
	 * @param ctx the parse tree
	 */
	void exitBloqueDeclaraciones(gramaticaParser.BloqueDeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(gramaticaParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(gramaticaParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#especDeclaracion}.
	 * @param ctx the parse tree
	 */
	void enterEspecDeclaracion(gramaticaParser.EspecDeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#especDeclaracion}.
	 * @param ctx the parse tree
	 */
	void exitEspecDeclaracion(gramaticaParser.EspecDeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void enterTipoDato(gramaticaParser.TipoDatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void exitTipoDato(gramaticaParser.TipoDatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#longitudChar}.
	 * @param ctx the parse tree
	 */
	void enterLongitudChar(gramaticaParser.LongitudCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#longitudChar}.
	 * @param ctx the parse tree
	 */
	void exitLongitudChar(gramaticaParser.LongitudCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaVariables}.
	 * @param ctx the parse tree
	 */
	void enterListaVariables(gramaticaParser.ListaVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaVariables}.
	 * @param ctx the parse tree
	 */
	void exitListaVariables(gramaticaParser.ListaVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#restoListaVars}.
	 * @param ctx the parse tree
	 */
	void enterRestoListaVars(gramaticaParser.RestoListaVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#restoListaVars}.
	 * @param ctx the parse tree
	 */
	void exitRestoListaVars(gramaticaParser.RestoListaVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void enterInicializacion(gramaticaParser.InicializacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void exitInicializacion(gramaticaParser.InicializacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaConstantes}.
	 * @param ctx the parse tree
	 */
	void enterListaConstantes(gramaticaParser.ListaConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaConstantes}.
	 * @param ctx the parse tree
	 */
	void exitListaConstantes(gramaticaParser.ListaConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#valorSimple}.
	 * @param ctx the parse tree
	 */
	void enterValorSimple(gramaticaParser.ValorSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#valorSimple}.
	 * @param ctx the parse tree
	 */
	void exitValorSimple(gramaticaParser.ValorSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#valorSimpleOpc}.
	 * @param ctx the parse tree
	 */
	void enterValorSimpleOpc(gramaticaParser.ValorSimpleOpcContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#valorSimpleOpc}.
	 * @param ctx the parse tree
	 */
	void exitValorSimpleOpc(gramaticaParser.ValorSimpleOpcContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#interfaz}.
	 * @param ctx the parse tree
	 */
	void enterInterfaz(gramaticaParser.InterfazContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#interfaz}.
	 * @param ctx the parse tree
	 */
	void exitInterfaz(gramaticaParser.InterfazContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cuerpoInterfaz}.
	 * @param ctx the parse tree
	 */
	void enterCuerpoInterfaz(gramaticaParser.CuerpoInterfazContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cuerpoInterfaz}.
	 * @param ctx the parse tree
	 */
	void exitCuerpoInterfaz(gramaticaParser.CuerpoInterfazContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#restoInterfaz}.
	 * @param ctx the parse tree
	 */
	void enterRestoInterfaz(gramaticaParser.RestoInterfazContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#restoInterfaz}.
	 * @param ctx the parse tree
	 */
	void exitRestoInterfaz(gramaticaParser.RestoInterfazContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#elementoInterfaz}.
	 * @param ctx the parse tree
	 */
	void enterElementoInterfaz(gramaticaParser.ElementoInterfazContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#elementoInterfaz}.
	 * @param ctx the parse tree
	 */
	void exitElementoInterfaz(gramaticaParser.ElementoInterfazContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaSubprogramas}.
	 * @param ctx the parse tree
	 */
	void enterListaSubprogramas(gramaticaParser.ListaSubprogramasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaSubprogramas}.
	 * @param ctx the parse tree
	 */
	void exitListaSubprogramas(gramaticaParser.ListaSubprogramasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cabeceraProcedimiento}.
	 * @param ctx the parse tree
	 */
	void enterCabeceraProcedimiento(gramaticaParser.CabeceraProcedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cabeceraProcedimiento}.
	 * @param ctx the parse tree
	 */
	void exitCabeceraProcedimiento(gramaticaParser.CabeceraProcedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cabeceraFuncion}.
	 * @param ctx the parse tree
	 */
	void enterCabeceraFuncion(gramaticaParser.CabeceraFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cabeceraFuncion}.
	 * @param ctx the parse tree
	 */
	void exitCabeceraFuncion(gramaticaParser.CabeceraFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cuerpoSubrutina}.
	 * @param ctx the parse tree
	 */
	void enterCuerpoSubrutina(gramaticaParser.CuerpoSubrutinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cuerpoSubrutina}.
	 * @param ctx the parse tree
	 */
	void exitCuerpoSubrutina(gramaticaParser.CuerpoSubrutinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#cuerpoFuncion}.
	 * @param ctx the parse tree
	 */
	void enterCuerpoFuncion(gramaticaParser.CuerpoFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#cuerpoFuncion}.
	 * @param ctx the parse tree
	 */
	void exitCuerpoFuncion(gramaticaParser.CuerpoFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaParamsFormales}.
	 * @param ctx the parse tree
	 */
	void enterListaParamsFormales(gramaticaParser.ListaParamsFormalesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaParamsFormales}.
	 * @param ctx the parse tree
	 */
	void exitListaParamsFormales(gramaticaParser.ListaParamsFormalesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaNombresParams}.
	 * @param ctx the parse tree
	 */
	void enterListaNombresParams(gramaticaParser.ListaNombresParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaNombresParams}.
	 * @param ctx the parse tree
	 */
	void exitListaNombresParams(gramaticaParser.ListaNombresParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#restoNombresParams}.
	 * @param ctx the parse tree
	 */
	void enterRestoNombresParams(gramaticaParser.RestoNombresParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#restoNombresParams}.
	 * @param ctx the parse tree
	 */
	void exitRestoNombresParams(gramaticaParser.RestoNombresParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaDecParamsSub}.
	 * @param ctx the parse tree
	 */
	void enterListaDecParamsSub(gramaticaParser.ListaDecParamsSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaDecParamsSub}.
	 * @param ctx the parse tree
	 */
	void exitListaDecParamsSub(gramaticaParser.ListaDecParamsSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaDecParamsFun}.
	 * @param ctx the parse tree
	 */
	void enterListaDecParamsFun(gramaticaParser.ListaDecParamsFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaDecParamsFun}.
	 * @param ctx the parse tree
	 */
	void exitListaDecParamsFun(gramaticaParser.ListaDecParamsFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#direccionParam}.
	 * @param ctx the parse tree
	 */
	void enterDireccionParam(gramaticaParser.DireccionParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#direccionParam}.
	 * @param ctx the parse tree
	 */
	void exitDireccionParam(gramaticaParser.DireccionParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#bloqueSentencias}.
	 * @param ctx the parse tree
	 */
	void enterBloqueSentencias(gramaticaParser.BloqueSentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#bloqueSentencias}.
	 * @param ctx the parse tree
	 */
	void exitBloqueSentencias(gramaticaParser.BloqueSentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#restoBloqueStmts}.
	 * @param ctx the parse tree
	 */
	void enterRestoBloqueStmts(gramaticaParser.RestoBloqueStmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#restoBloqueStmts}.
	 * @param ctx the parse tree
	 */
	void exitRestoBloqueStmts(gramaticaParser.RestoBloqueStmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(gramaticaParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(gramaticaParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#asignacionOLlamada}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionOLlamada(gramaticaParser.AsignacionOLlamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#asignacionOLlamada}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionOLlamada(gramaticaParser.AsignacionOLlamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sentDo}.
	 * @param ctx the parse tree
	 */
	void enterSentDo(gramaticaParser.SentDoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sentDo}.
	 * @param ctx the parse tree
	 */
	void exitSentDo(gramaticaParser.SentDoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#limDo}.
	 * @param ctx the parse tree
	 */
	void enterLimDo(gramaticaParser.LimDoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#limDo}.
	 * @param ctx the parse tree
	 */
	void exitLimDo(gramaticaParser.LimDoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#ramaSi}.
	 * @param ctx the parse tree
	 */
	void enterRamaSi(gramaticaParser.RamaSiContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ramaSi}.
	 * @param ctx the parse tree
	 */
	void exitRamaSi(gramaticaParser.RamaSiContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#ramaElse}.
	 * @param ctx the parse tree
	 */
	void enterRamaElse(gramaticaParser.RamaElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ramaElse}.
	 * @param ctx the parse tree
	 */
	void exitRamaElse(gramaticaParser.RamaElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#llamadaProcedimiento}.
	 * @param ctx the parse tree
	 */
	void enterLlamadaProcedimiento(gramaticaParser.LlamadaProcedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#llamadaProcedimiento}.
	 * @param ctx the parse tree
	 */
	void exitLlamadaProcedimiento(gramaticaParser.LlamadaProcedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaArgsReales}.
	 * @param ctx the parse tree
	 */
	void enterListaArgsReales(gramaticaParser.ListaArgsRealesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaArgsReales}.
	 * @param ctx the parse tree
	 */
	void exitListaArgsReales(gramaticaParser.ListaArgsRealesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(gramaticaParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(gramaticaParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#restoExpresion}.
	 * @param ctx the parse tree
	 */
	void enterRestoExpresion(gramaticaParser.RestoExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#restoExpresion}.
	 * @param ctx the parse tree
	 */
	void exitRestoExpresion(gramaticaParser.RestoExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operadorArit}.
	 * @param ctx the parse tree
	 */
	void enterOperadorArit(gramaticaParser.OperadorAritContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operadorArit}.
	 * @param ctx the parse tree
	 */
	void exitOperadorArit(gramaticaParser.OperadorAritContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(gramaticaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sufijoPosibleFunc}.
	 * @param ctx the parse tree
	 */
	void enterSufijoPosibleFunc(gramaticaParser.SufijoPosibleFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sufijoPosibleFunc}.
	 * @param ctx the parse tree
	 */
	void exitSufijoPosibleFunc(gramaticaParser.SufijoPosibleFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaExpresiones}.
	 * @param ctx the parse tree
	 */
	void enterListaExpresiones(gramaticaParser.ListaExpresionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaExpresiones}.
	 * @param ctx the parse tree
	 */
	void exitListaExpresiones(gramaticaParser.ListaExpresionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(gramaticaParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(gramaticaParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#restoCondicion}.
	 * @param ctx the parse tree
	 */
	void enterRestoCondicion(gramaticaParser.RestoCondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#restoCondicion}.
	 * @param ctx the parse tree
	 */
	void exitRestoCondicion(gramaticaParser.RestoCondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operadorLogico}.
	 * @param ctx the parse tree
	 */
	void enterOperadorLogico(gramaticaParser.OperadorLogicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operadorLogico}.
	 * @param ctx the parse tree
	 */
	void exitOperadorLogico(gramaticaParser.OperadorLogicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#factorCond}.
	 * @param ctx the parse tree
	 */
	void enterFactorCond(gramaticaParser.FactorCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#factorCond}.
	 * @param ctx the parse tree
	 */
	void exitFactorCond(gramaticaParser.FactorCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operadorComp}.
	 * @param ctx the parse tree
	 */
	void enterOperadorComp(gramaticaParser.OperadorCompContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operadorComp}.
	 * @param ctx the parse tree
	 */
	void exitOperadorComp(gramaticaParser.OperadorCompContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaCasos}.
	 * @param ctx the parse tree
	 */
	void enterListaCasos(gramaticaParser.ListaCasosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaCasos}.
	 * @param ctx the parse tree
	 */
	void exitListaCasos(gramaticaParser.ListaCasosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#ramaCaso}.
	 * @param ctx the parse tree
	 */
	void enterRamaCaso(gramaticaParser.RamaCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#ramaCaso}.
	 * @param ctx the parse tree
	 */
	void exitRamaCaso(gramaticaParser.RamaCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#etiquetasCaso}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetasCaso(gramaticaParser.EtiquetasCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#etiquetasCaso}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetasCaso(gramaticaParser.EtiquetasCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#restoEtiquetas}.
	 * @param ctx the parse tree
	 */
	void enterRestoEtiquetas(gramaticaParser.RestoEtiquetasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#restoEtiquetas}.
	 * @param ctx the parse tree
	 */
	void exitRestoEtiquetas(gramaticaParser.RestoEtiquetasContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#masEtiquetas}.
	 * @param ctx the parse tree
	 */
	void enterMasEtiquetas(gramaticaParser.MasEtiquetasContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#masEtiquetas}.
	 * @param ctx the parse tree
	 */
	void exitMasEtiquetas(gramaticaParser.MasEtiquetasContext ctx);
}