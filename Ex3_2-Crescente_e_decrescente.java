//Faça um programa que leia um número inteiro positivo N e imprima todos os números naturais de 0 até N em ordem CRESCENTE em uma linha;
//Depois, imprima esses números em ordem DECRESCENTE em outra linha.
//Inclua um caractere espaço entre cada número impresso.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    int n = teclado1.nextInt();
    int n2 = n;
    // PROCESSAMENTO E SAÍDA
   for (int x=0; x<=n; x+=1) {
       System.out.print(x+ " ");
   }
    System.out.println("");
   for (int y=n2; y>=0; y-=1) {
       System.out.print(y+ " ");
   }
  }
} 
