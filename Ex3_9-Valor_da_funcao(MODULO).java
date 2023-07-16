//Considere a seguinte função: f(a,b,c)=a+∑bd=1(c.d)
//Escreva o método obterValorFuncao que possui os parâmetros a, b, c (nesta ordem). O método deverá retornar o valor da função f(a, b, c).

public static int obterValorFuncao(int a, int b, int c) {
    // digite o codigo do metodo aqui
    int funcao = 0;
    int resultado = a;
    int d = 1;
    do {
        funcao = c * d;
        resultado += funcao;
        d++;
    } while (d <= b);
    return resultado;
}
