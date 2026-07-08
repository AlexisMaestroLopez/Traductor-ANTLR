grammar gramatica;

@header {
    import java.util.*;
}

@members {
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
}

programa
    : 'PROGRAM' nombreProg SEMI
      bloqueDeclaraciones
      interfaz
      bloqueSentencias
      'END' 'PROGRAM' nombreProg
      listaSubprogramas
      EOF
      {
          trad.getContexto().entrarMain();
          trad.generarMain($bloqueDeclaraciones.listaVars, $bloqueSentencias.codigo);
          trad.getContexto().salir();
          System.out.print(trad.generarPrograma());
      }
    ;

nombreProg returns [String nombre]
    : IDENT { $nombre = $IDENT.text; }
    ;

bloqueDeclaraciones returns [List<VariableDecl> listaVars]
    : declaracion bloqueDeclaraciones
      {
          $listaVars = new ArrayList<>();
          $listaVars.addAll($declaracion.listaVars);
          $listaVars.addAll($bloqueDeclaraciones.listaVars);
      }
    | { $listaVars = new ArrayList<>(); }
    ;

declaracion returns [List<VariableDecl> listaVars]
    : tipoDato especDeclaracion
      {
          $listaVars = $especDeclaracion.listaVars;
          for (VariableDecl v : $listaVars) {
              v.tipo = $tipoDato.tipoC;
              if ($tipoDato.tipoC.equals("char") && $tipoDato.longitud > 0)
                  v.setDimension($tipoDato.longitud);
          }
      }
    ;

especDeclaracion returns [List<VariableDecl> listaVars]
    : COMMA 'PARAMETER' '::' IDENT ASSIGN valorSimple { trad.addDefine($IDENT.text, $valorSimple.val); } listaConstantes SEMI
      {
          $listaVars = new ArrayList<>();
      }
    | '::' listaVariables SEMI
      {
          $listaVars = $listaVariables.lista;
      }
    ;

tipoDato returns [String tipoC, int longitud]
    : 'INTEGER' { $tipoC = "int"; $longitud = -1; }
    | 'REAL' { $tipoC = "float"; $longitud = -1; }
    | 'CHARACTER' longitudChar { $tipoC = "char";  $longitud = $longitudChar.longitud; }
    ;

longitudChar returns [int longitud]
    : '(' NUM_INT_CONST ')' { $longitud = Integer.parseInt($NUM_INT_CONST.text); }
    | { $longitud = -1; }
    ;

listaVariables returns [List<VariableDecl> lista]
    : IDENT inicializacion restoListaVars
      {
          $lista = new ArrayList<>();
          VariableDecl v = new VariableDecl(null, $IDENT.text);
          if ($inicializacion.valor != null) v.setInit($inicializacion.valor);
          $lista.add(v);
          $lista.addAll($restoListaVars.lista);
      }
    ;

restoListaVars returns [List<VariableDecl> lista]
    : COMMA IDENT inicializacion restoListaVars
      {
          $lista = new ArrayList<>();
          VariableDecl v = new VariableDecl(null, $IDENT.text);
          if ($inicializacion.valor != null) v.setInit($inicializacion.valor);
          $lista.add(v);
          $lista.addAll($restoListaVars.lista);
      }
    | { $lista = new ArrayList<>(); }
    ;

inicializacion returns [String valor]
    : ASSIGN valorSimple { $valor = $valorSimple.val; }
    | { $valor = null; }
    ;

listaConstantes
    : COMMA IDENT ASSIGN valorSimple { trad.addDefine($IDENT.text, $valorSimple.val); } listaConstantes
    |
    ;

valorSimple returns [String val]
    : NUM_INT_CONST { $val = $NUM_INT_CONST.text; }
    | NUM_REAL_CONST { $val = $NUM_REAL_CONST.text; }
    | STRING_CONST { $val = toCLiteral($STRING_CONST.text); }
    | NUM_INT_CONST_B
      {
          String raw = $NUM_INT_CONST_B.text;
          $val = "0b" + raw.substring(2, raw.length() - 1);
      }
    | NUM_INT_CONST_O
      {
          String raw = $NUM_INT_CONST_O.text;
          $val = "0o" + raw.substring(2, raw.length() - 1);
      }
    | NUM_INT_CONST_H
      {
          String raw = $NUM_INT_CONST_H.text;
          $val = "0x" + raw.substring(2, raw.length() - 1);
      }
    | CONST_BOOL
      { $val = $CONST_BOOL.text.equals(".TRUE.") ? "1" : "0"; }
    ;

valorSimpleOpc returns [String val]
    : valorSimple { $val = $valorSimple.val; }
    | { $val = ""; }
    ;

interfaz
    : 'INTERFACE' cuerpoInterfaz 'END' 'INTERFACE'
    |
    ;

cuerpoInterfaz
    : elementoInterfaz restoInterfaz
    |
    ;

restoInterfaz
    : elementoInterfaz restoInterfaz
    |
    ;

elementoInterfaz
    : cabeceraProcedimiento
    | cabeceraFuncion
    ;

listaSubprogramas
    : cuerpoSubrutina listaSubprogramas
    | cuerpoFuncion   listaSubprogramas
    |
    ;

cabeceraProcedimiento
    : 'SUBROUTINE' n1=IDENT listaParamsFormales listaDecParamsSub 'END' 'SUBROUTINE' n2=IDENT
      {
          String nomInicio = $n1.text;
          String nomFin    = $n2.text;
          if (!nomInicio.equals(nomFin))
              throw new RuntimeException("Error semántico: los identificadores de " +
                  "SUBROUTINE no coinciden: '" + nomInicio + "' vs '" + nomFin + "'");
          for (int i = 0; i < $listaParamsFormales.lista.size(); i++) {
              Parametro p = $listaParamsFormales.lista.get(i);
              Parametro q = $listaDecParamsSub.lista.get(i);
              p.tipo = q.tipo;
              p.esPorRef = q.esPorRef;
          }
          trad.addDecFun("void", nomInicio, $listaParamsFormales.lista);
      }
    ;

cabeceraFuncion
    : 'FUNCTION' n1=IDENT '(' listaNombresParams ')' tipoDato '::' n2=IDENT SEMI
      listaDecParamsFun 'END' 'FUNCTION' n3=IDENT
      {
          String nomFun = $n1.text;
          String nomRetVar = $n2.text;
          String nomFin = $n3.text;
          if (!nomFun.equals(nomFin))
              throw new RuntimeException("Error semántico: los identificadores de " +
                  "FUNCTION no coinciden: '" + nomFun + "' vs '" + nomFin + "'");
          if (!nomFun.equals(nomRetVar))
              throw new RuntimeException("Error semántico: la variable de retorno '" +
                  nomRetVar + "' no coincide con el nombre de la función '" + nomFun + "'");
          for (int i = 0; i < $listaNombresParams.lista.size(); i++) {
              Parametro p = $listaNombresParams.lista.get(i);
              Parametro q = $listaDecParamsFun.lista.get(i);
              p.tipo = q.tipo;
              p.esPorRef = q.esPorRef;
          }
          trad.addDecFun($tipoDato.tipoC, nomFun, $listaNombresParams.lista);
      }
    ;

cuerpoSubrutina
    : 'SUBROUTINE' n1=IDENT listaParamsFormales listaDecParamsSub
      {
          // Activar contexto ANTES de parsear el cuerpo para que las asignaciones
          // a parámetros OUT/INOUT se traduzcan con '*' (paso por referencia).
          for (int i = 0; i < $listaParamsFormales.lista.size(); i++) {
              Parametro p = $listaParamsFormales.lista.get(i);
              Parametro q = $listaDecParamsSub.lista.get(i);
              p.tipo = q.tipo;
              p.esPorRef = q.esPorRef;
          }
          trad.getContexto().entrarProcedimiento($n1.text);
          for (Parametro p : $listaParamsFormales.lista) {
              if (p.esPorRef) trad.getContexto().registrarParamPorRef(p.nombre);
          }
      }
      bloqueDeclaraciones bloqueSentencias
      'END' 'SUBROUTINE' n2=IDENT
      {
          String nomInicio = $n1.text;
          String nomFin = $n2.text;
          if (!nomInicio.equals(nomFin))
              throw new RuntimeException("Error semántico: los identificadores de " +
                  "SUBROUTINE no coinciden: '" + nomInicio + "' vs '" + nomFin + "'");
          trad.addProcedimiento(nomInicio, $listaParamsFormales.lista,
                                $bloqueDeclaraciones.listaVars, $bloqueSentencias.codigo);
          trad.getContexto().salir();
      }
    ;

cuerpoFuncion
    : 'FUNCTION' n1=IDENT '(' listaNombresParams ')' tipoDato '::' n2=IDENT SEMI
      listaDecParamsFun
      {
          // Activar contexto ANTES de parsear el cuerpo para que las asignaciones
          // al nombre de la funcion se conviertan en 'return'
          String nomFun0 = $n1.text;
          String nomRetVar0 = $n2.text;
          if (!nomFun0.equals(nomRetVar0))
              throw new RuntimeException("Error semántico: la variable de retorno '" +
                  nomRetVar0 + "' no coincide con el nombre de la función '" + nomFun0 + "'");
          for (int i = 0; i < $listaNombresParams.lista.size(); i++) {
              Parametro p = $listaNombresParams.lista.get(i);
              Parametro q = $listaDecParamsFun.lista.get(i);
              p.tipo = q.tipo;
              p.esPorRef = q.esPorRef;
          }
          trad.getContexto().entrarFuncion(nomFun0, $tipoDato.tipoC);
          for (Parametro p : $listaNombresParams.lista) {
              if (p.esPorRef) trad.getContexto().registrarParamPorRef(p.nombre);
          }
      }
      bloqueDeclaraciones bloqueSentencias
      'END' 'FUNCTION' n4=IDENT
      {
          String nomFun = $n1.text;
          String nomFin = $n4.text;
          if (!nomFun.equals(nomFin))
              throw new RuntimeException("Error semántico: los identificadores de " +
                  "FUNCTION no coinciden: '" + nomFun + "' vs '" + nomFin + "'");
          trad.addFuncion(nomFun, $tipoDato.tipoC, $listaNombresParams.lista,
                          $bloqueDeclaraciones.listaVars, $bloqueSentencias.codigo);
          trad.getContexto().salir();
      }
    ;

listaParamsFormales returns [List<Parametro> lista]
    : '(' listaNombresParams ')' { $lista = $listaNombresParams.lista; }
    | { $lista = new ArrayList<>(); }
    ;

listaNombresParams returns [List<Parametro> lista]
    : IDENT restoNombresParams
      {
          $lista = new ArrayList<>();
          $lista.add(new Parametro(null, $IDENT.text, false));
          $lista.addAll($restoNombresParams.lista);
      }
    ;

restoNombresParams returns [List<Parametro> lista]
    : COMMA listaNombresParams { $lista = $listaNombresParams.lista; }
    | { $lista = new ArrayList<>(); }
    ;

listaDecParamsSub returns [List<Parametro> lista]
    : tipoDato COMMA 'INTENT' '(' direccionParam ')' IDENT SEMI listaDecParamsSub
      {
          $lista = new ArrayList<>();
          boolean porRef = $direccionParam.esPorRef;
          Parametro p;
          if ($tipoDato.tipoC.equals("char") && $tipoDato.longitud > 0)
              p = new Parametro("char[" + $tipoDato.longitud + "]", $IDENT.text, porRef);
          else
              p = new Parametro($tipoDato.tipoC, $IDENT.text, porRef);
          $lista.add(p);
          $lista.addAll($listaDecParamsSub.lista);
      }
    | { $lista = new ArrayList<>(); }
    ;

listaDecParamsFun returns [List<Parametro> lista]
    : tipoDato COMMA 'INTENT' '(' 'IN' ')' IDENT SEMI listaDecParamsFun
      {
          $lista = new ArrayList<>();
          Parametro p;
          if ($tipoDato.tipoC.equals("char") && $tipoDato.longitud > 0)
              p = new Parametro("char[" + $tipoDato.longitud + "]", $IDENT.text, false);
          else
              p = new Parametro($tipoDato.tipoC, $IDENT.text, false);
          $lista.add(p);
          $lista.addAll($listaDecParamsFun.lista);
      }
    | { $lista = new ArrayList<>(); }
    ;

direccionParam returns [boolean esPorRef]
    : 'IN' { $esPorRef = false; }
    | 'OUT' { $esPorRef = true;  }
    | 'INOUT' { $esPorRef = true;  }
    ;

bloqueSentencias returns [String codigo]
    : sentencia restoBloqueStmts
      { $codigo = $sentencia.codigo + $restoBloqueStmts.codigo; }
    ;

restoBloqueStmts returns [String codigo]
    : sentencia restoBloqueStmts
      { $codigo = $sentencia.codigo + $restoBloqueStmts.codigo; }
    | { $codigo = ""; }
    ;

sentencia returns [String codigo]
    : asignacionOLlamada
      { $codigo = $asignacionOLlamada.codigo + "\n"; }
    | 'IF' '(' condicion ')' ramaSi
      { String _s = "if(" + $condicion.codigo + ") " + $ramaSi.codigo;
        $codigo = _s.stripTrailing() + "\n"; }
    | 'DO' sentDo
      { $codigo = $sentDo.codigo.stripTrailing() + "\n"; }
    | 'SELECT' 'CASE' '(' expresion ')' listaCasos 'END' 'SELECT'
      {
          String _sw = "switch(" + $expresion.codigo + ") {\n"
                  + trad.indent($listaCasos.codigo)
                  + "}";
          $codigo = _sw.stripTrailing() + "\n";
      }
    ;

asignacionOLlamada returns [String codigo]
    : IDENT ASSIGN expresion SEMI
      {
          if (trad.getContexto().esAsignacionDeRetorno($IDENT.text))
              $codigo = "return " + $expresion.codigo + ";";
          else if (trad.getContexto().esPorReferencia($IDENT.text))
              $codigo = "*" + $IDENT.text + " = " + $expresion.codigo + ";";
          else
              $codigo = $IDENT.text + " = " + $expresion.codigo + ";";
      }
    | llamadaProcedimiento SEMI
      { $codigo = $llamadaProcedimiento.codigo + ";"; }
    ;

sentDo returns [String codigo]
    : 'WHILE' '(' condicion ')' bloqueSentencias 'ENDDO'
      {
          $codigo = "while(" + $condicion.codigo + ") {\n"
                  + trad.indent($bloqueSentencias.codigo)
                  + "}";
      }
    | IDENT ASSIGN ini=limDo COMMA fin=limDo COMMA inc=limDo bloqueSentencias 'ENDDO'
      {
          String var = $IDENT.text;
          String ini = $ini.val;
          String fin = $fin.val;
          String inc = $inc.val;
          $codigo = "for(" + var + " = " + ini + "; "
                           + var + " != " + fin + "; "
                           + var + " = " + var + " + " + inc + ") {\n"
                   + trad.indent($bloqueSentencias.codigo)
                  + "}";
      }
    ;

limDo returns [String val]
    : NUM_INT_CONST { $val = $NUM_INT_CONST.text; }
    | IDENT { $val = $IDENT.text; }
    ;

ramaSi returns [String codigo]
    : sentencia
      { $codigo = "{\n" + trad.indent($sentencia.codigo) + "}\n"; }
    | 'THEN' bloqueSentencias ramaElse
      { $codigo = "{\n" + trad.indent($bloqueSentencias.codigo) + "}" + $ramaElse.codigo + "\n"; }
    ;

ramaElse returns [String codigo]
    : 'ENDIF'
      { $codigo = ""; }
    | 'ELSE' bloqueSentencias 'ENDIF'
      { $codigo = " else {\n" + trad.indent($bloqueSentencias.codigo) + "}"; }
    ;

llamadaProcedimiento returns [String codigo]
    : CALL IDENT listaArgsReales
      { $codigo = $IDENT.text + "(" + $listaArgsReales.lista + ")"; }
    ;

listaArgsReales returns [String lista]
    : '(' expresion listaExpresiones ')'
      { $lista = $expresion.codigo + $listaExpresiones.lista; }
    | { $lista = ""; }
    ;

expresion returns [String codigo]
    : factor restoExpresion
      { $codigo = $factor.codigo + $restoExpresion.codigo; }
    ;

restoExpresion returns [String codigo]
    : operadorArit factor restoExpresion
      { $codigo = " " + $operadorArit.text + " " + $factor.codigo + $restoExpresion.codigo; }
    | { $codigo = ""; }
    ;

operadorArit : '+' | '-' | '*' | '/' ;

factor returns [String codigo]
    : valorSimple
      { $codigo = $valorSimple.val; }
    | '(' expresion ')'
      { $codigo = "(" + $expresion.codigo + ")"; }
    | IDENT sufijoPosibleFunc
      { $codigo = $IDENT.text + $sufijoPosibleFunc.codigo; }
    ;

sufijoPosibleFunc returns [String codigo]
    : '(' expresion listaExpresiones ')'
      { $codigo = "(" + $expresion.codigo + $listaExpresiones.lista + ")"; }
    | { $codigo = ""; }
    ;

listaExpresiones returns [String lista]
    : COMMA expresion listaExpresiones
      { $lista = ", " + $expresion.codigo + $listaExpresiones.lista; }
    | { $lista = ""; }
    ;

condicion returns [String codigo]
    : factorCond restoCondicion
      { $codigo = $factorCond.codigo + $restoCondicion.codigo; }
    ;

restoCondicion returns [String codigo]
    : operadorLogico factorCond restoCondicion
      {
          $codigo = " " + traducirOpLog($operadorLogico.text) + " "
                  + $factorCond.codigo
                  + $restoCondicion.codigo;
      }
    | { $codigo = ""; }
    ;

operadorLogico : '.OR.' | '.AND.' | '.EQV.' | '.NEQV.' ;

factorCond returns [String codigo]
    : e1=expresion operadorComp e2=expresion
      { $codigo = $e1.codigo + " " + $operadorComp.texto + " " + $e2.codigo; }
    | '(' condicion ')'
      { $codigo = "(" + $condicion.codigo + ")"; }
    | '.NOT.' factorCond
      { $codigo = "!" + $factorCond.codigo; }
    | CONST_BOOL
      { $codigo = $CONST_BOOL.text.equals(".TRUE.") ? "1" : "0"; }
    ;

operadorComp returns [String texto]
    : LT { $texto = "<"; }
    | GT { $texto = ">"; }
    | LE { $texto = "<="; }
    | GE { $texto = ">="; }
    | EQ { $texto = "=="; }
    | NE { $texto = "!="; }
    ;

listaCasos returns [String codigo]
    : 'CASE' ramaCaso { $codigo = $ramaCaso.codigo; }
    | { $codigo = ""; }
    ;

ramaCaso returns [String codigo]
    : '(' etiquetasCaso ')' bloqueSentencias listaCasos
      {
          StringBuilder sb = new StringBuilder();
          for (String etiq : $etiquetasCaso.lista)
              sb.append("case ").append(etiq).append(":\n");
          sb.append(trad.indent($bloqueSentencias.codigo));
          sb.append("break;\n");
          sb.append($listaCasos.codigo);
          $codigo = sb.toString();
      }
    | 'DEFAULT' bloqueSentencias
      {
          $codigo = "default:\n"
                  + trad.indent($bloqueSentencias.codigo);
      }
    ;

etiquetasCaso returns [List<String> lista]
    : valorSimple restoEtiquetas
      {
          $lista = new ArrayList<>();
          String v = $valorSimple.val;
          if ($restoEtiquetas.esRango) {
              String fin = $restoEtiquetas.valFin;
              if (fin.isEmpty())
                  $lista.add("> " + v);
              else
                  $lista.add(v + " to " + fin);
          } else {
              $lista.add(v);
              $lista.addAll($restoEtiquetas.lista);
          }
      }
    | COLON valorSimple
      {
          $lista = new ArrayList<>();
          $lista.add("< " + $valorSimple.val);
      }
    ;

restoEtiquetas returns [List<String> lista, boolean esRango, String valFin]
    : masEtiquetas
      { $lista = $masEtiquetas.lista; $esRango = false; $valFin = ""; }
    | COLON valorSimpleOpc
      { $lista = new ArrayList<>(); $esRango = true; $valFin = $valorSimpleOpc.val; }
    ;

masEtiquetas returns [List<String> lista]
    : COMMA valorSimple masEtiquetas
      {
          $lista = new ArrayList<>();
          $lista.add($valorSimple.val);
          $lista.addAll($masEtiquetas.lista);
      }
    | { $lista = new ArrayList<>(); }
    ;

CALL : 'CALL' ;

IDENT : [a-zA-Z] [a-zA-Z0-9_]* ;

GE : '>=' ;
LE : '<=' ;
EQ : '==' ;
NE : '/=' ;
GT : '>'  ;
LT : '<'  ;

COLON : ':' ;
COMMA : ',' ;
SEMI : ';' ;
ASSIGN : '=' ;

NUM_INT_CONST_B : 'b' '\'' [0-1]+   '\'' ;
NUM_INT_CONST_O : 'o' '\'' [0-7]+   '\'' ;
NUM_INT_CONST_H : 'z' '\'' [0-9A-F]+ '\'' ;

CONST_BOOL : '.TRUE.' | '.FALSE.' ;

NUM_REAL_CONST
    : '-'? [0-9]+ '.' [0-9]+ ( [eE] '-'? [0-9]+ )?
    | '-'? [0-9]+ [eE] '-'? [0-9]+
    ;

NUM_INT_CONST : '-'? [0-9]+ ;

STRING_CONST
    : '\'' ( ~['] | '\'\'' )* '\''
    | '"'  ( ~["] | '""'   )* '"'
    ;

COMMENT : '!' ~[\r\n]* -> skip ;
WS : [ \t\r\n]+   -> skip ;