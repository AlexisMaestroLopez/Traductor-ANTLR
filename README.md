# Fortran-like to C Translator 

Un compilador/traductor completo de código desarrollado en **Java** utilizando **ANTLR4**. El sistema realiza el análisis léxico, sintáctico ascendente/descendente y la traducción dirigida por la sintaxis (TDS) para transformar un lenguaje de cálculo científico de tipo **Fortran** a código C equivalente y ejecutable.

---

## Características y Capacidades del Lenguaje

El traductor procesa la gramática del lenguaje fuente y genera código C optimizado manejando las siguientes construcciones:

* **Sintaxis y Tipado:** Soporte de constantes numéricas (enteras, reales en notación exponencial/punto fijo), bases alternativas (binario, octal, hexadecimal), constantes lógicas y constantes globales (`PARAMETER`).
* **Estructuras de Control:** Conversión de bucles y condicionales ampliados (`IF-THEN-ELSE`, bloques condicionales anidados).
* **Gestión de Funciones y Procedimientos:** Definición y traducción de subrutinas (`SUBROUTINE`) y funciones (`FUNCTION`).
* **Paso de Parámetros por Referencia:** Manejo semántico de argumentos de entrada/salida (`OUT`), traduciéndolos automáticamente a punteros en el código C generado.
* **Sistema de Recuperación de Errores:** Notificador de errores léxicos, sintácticos y semánticos contextualizado en español con indicación precisa de línea y columna.

---

## Arquitectura e Implementación Técnica

### 1. Transformación de la Gramática a LL(1)
Para evitar bucles infinitos y ambigüedades en el parsing descendente:
* **Eliminación de la Recursividad por la Izquierda:** Transformación de reglas recursivas (como listas de sentencias o expresiones aritméticas) mediante la introducción de símbolos auxiliares.
* **Factorización por la Izquierda:** Unificación de prefijos comunes en producciones de un mismo símbolo no terminal (distinción entre identificadores, llamadas a función y asignaciones).

### 2. Generación de Código Diferida
El motor no escribe el código C directamente al vuelo; acumula el árbol de sintaxis abstracta y el contexto semántico mediante estructuras intermedias para orquestar la cabecera, inclusión de librerías, firmas de funciones y el cuerpo `main` de forma estructurada.

### 3. Gestión del Ámbito Semántico (Contexto)
Control estricto de la tabla de símbolos y ámbito (`Contexto.java`, `VariableDecl.java`, `Parametro.java`) para validar el tipo de variables, dimensiones y detectar asignaciones de retorno no válidas.

---

## Stack Tecnológico

* **Lenguaje:** Java 17
* **Generador de Analizadores:** ANTLR4
* **Lenguaje Fuente:** Lenguaje de cálculo científico estilo Fortran (`.for`)
* **Lenguaje Destino:** C ANSI/C99 (`.c`)

---

## Desarrollo

Proyecto desarrollado en el marco de la asignatura **Procesadores de Lenguajes** de la **Universidad Rey Juan Carlos (URJC)**

---

## Uso del Traductor

### Requisitos
* Java JDK 17
* ANTLR 4 instalado o incluido en el classpath.

### Compilación y Ejecución
1. Generar los lexers/parsers de ANTLR4 a partir de la gramática:
   ```bash
   antlr4 -no-listener -visitor gramatica.g4
