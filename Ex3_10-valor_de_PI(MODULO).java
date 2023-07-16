//O valor de Pi pode ser calculado pela série de Gregory conforme apresentado a seguir: Π/4 = 1/1−1/3+1/5−1/7+1/9...
//Escreva o método calcularPi que recebe o parâmetro n. O método deverá retornar o valor de Π usando n elementos da série de Gregory.

public static double calcularPi(int n) {

    double soma = 0; 
    double soma_2 = 0;
    double pi = 0;
    
    for (int x = 1; x<=n; x++) {
        soma =  Math.pow(-1, x+1)/(2*x-1);
        soma_2 += soma;
    }
    pi = 4*soma_2;
    return pi;
}
