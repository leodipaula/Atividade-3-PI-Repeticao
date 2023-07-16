//Implemente um algoritmo que leia um número inteiro N e depois imprima os N primeiros números naturais ÍMPARES em uma linha e os N primeiros PARES em outra linha.
//Inclua um caractere espaço entre cada número impresso.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    int n = teclado1.nextInt();
    int n2 = n;
    // PROCESSAMENTO E SAÍDA
   for (int x=1; x<=n*2; x+=2) {
       System.out.print(x+ " ");
   }
    System.out.println("");
   for (int y=0; y<=n2*2; y+=2) {
       System.out.print(y+ " ");
   }
  }
} 
