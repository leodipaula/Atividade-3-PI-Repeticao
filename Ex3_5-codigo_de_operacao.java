//Implemente um algoritmo que leia um Código de Operação: 
//1: soma dois números (a + b); 2: soma três números (a + b + c); 3: multiplicação de dois números (a * b); 0: sair. 

//Se o usuário digitar a operação SAIR (0), o programa mostra o MENOR resultado obtido, considerando SOMENTE as operações realizadas, e ENCERRA.
//Entretanto, se nenhuma operação for realizada e a operação SAIR (0) seja selecionada, a seguinte mensagem deve ser impressa "Nenhum calculo foi realizado!". 
//Caso contrário (operação <=3 e !=0), o sistema deve solicitar a ENTRADA dos números (a e b OU a, b e c) e imprimirá o resultado da operação (soma ou multiplicação).
//Após isso, o programa volta a SOLICITAR o Código de Operação para o usuário digitar uma NOVA OPERAÇÃO.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
//ENTRADAS
        Scanner teclado = new Scanner(System.in);
        int operador, a, b, c, resultado = 0;
        int menorResultado = 0;

        int primeiraExecucao = 1;
        int execucoes = 0;

        //PROCESSAMENTO E SAÍDA
        do {
            operador = teclado.nextInt();

            if (operador == 1) {
                a = teclado.nextInt();
                b = teclado.nextInt();

                resultado = a + b;
                System.out.println("(a+b) = " + resultado);
            } else if (operador == 2) {
                a = teclado.nextInt();
                b = teclado.nextInt();
                c = teclado.nextInt();

                resultado = a+b+c;
                System.out.println("(a+b+c) = " + resultado);
            } else if (operador == 3) {
                a = teclado.nextInt();
                b = teclado.nextInt();

                resultado = a * b;
                System.out.println("(a*b) = " + resultado);
            }

            execucoes++;


            if (operador == 0 && execucoes == primeiraExecucao) {
                System.out.println("Nenhum calculo foi realizado!");
            }

            if (execucoes == primeiraExecucao || resultado < menorResultado) {
                menorResultado = resultado;
            }

            if (operador == 0 && execucoes != primeiraExecucao) {
                System.out.println("Menor resultado: " + menorResultado);
            }

        } while (operador <= 3 && operador != 0);
    }

  }
