//Escreva um programa que leia um número inteiro e calcule a soma de todos os divisores desse número, com exceção dele próprio.
//Exemplo: a soma dos divisores do número 66 é 1 + 2 + 3 + 6 + 11 + 22 + 33 = 78.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    
    Scanner teclado1 = new Scanner(System.in);
    int num = teclado1.nextInt();
    int metade = num/2;
    int soma = 0;
    int resto = 0;
    // PROCESSAMENTO E SAÍDA
    
    for (int x = 1; x<num; x++) {
        resto = num%x;
        
        if (resto == 0) {
            soma += x;
        }

    }
    System.out.print(soma);
  }
} 
