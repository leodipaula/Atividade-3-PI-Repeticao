//Construir um algoritmo que leia um número inteiro maior que zero e imprima a sequência: 1, 2, 4, 8, 16, 32,... enquanto o valor for menor ou igual ao valor lido.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    
    Scanner teclado1 = new Scanner(System.in);
    int numero = 0;
    
    // PROCESSAMENTO E SAÍDA
    numero = teclado1.nextInt();
    
    for (int x = 1; x<=numero; x+=x) {
        System.out.print(x+ ", ");
    }
  }
} 
