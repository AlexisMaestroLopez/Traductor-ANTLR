PROGRAM subprogramas;
INTEGER :: resultado;
INTERFACE
  FUNCTION cuadrado(n)
    INTEGER :: cuadrado;
    INTEGER, INTENT(IN) n;
  END FUNCTION cuadrado
  SUBROUTINE imprimir(v, w)
    INTEGER, INTENT(IN) v;
    INTEGER, INTENT(OUT) w;
  END SUBROUTINE imprimir
END INTERFACE
resultado = cuadrado(5);
CALL imprimir(resultado, resultado);
END PROGRAM subprogramas

FUNCTION cuadrado(n)
  INTEGER :: cuadrado;
  INTEGER, INTENT(IN) n;
  cuadrado = n * n;
END FUNCTION cuadrado

SUBROUTINE imprimir(v, w)
  INTEGER, INTENT(IN) v;
  INTEGER, INTENT(OUT) w;
  w = v + 1;
END SUBROUTINE imprimir