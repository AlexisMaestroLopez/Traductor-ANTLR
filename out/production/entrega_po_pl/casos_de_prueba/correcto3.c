int cuadrado(int n);
void imprimir(int v, int *w);

int cuadrado(int n) {
    return n * n;
}

void imprimir(int v, int *w) {
    w = v + 1;
}

void main(void) {
    int resultado;

    resultado = cuadrado(5);
    imprimir(resultado, resultado);
}
