//Realizou-se uma pesquisa com 3 pessoas que responderam à seguinte pergunta:
//Quantos filhos você tem?
//Escreva um algoritmo para processar essa pesquisa informando quantas pessoas possuem até 2 filhos e quantas possuem mais de 2 filhos.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    int filhos;
    int n = 0;
    int soma1 = 0;
    int soma2 = 0;
    // PROCESSAMENTO E SAÍDA
    do {
    filhos = teclado1.nextInt();
        if (filhos <= 2) {
           soma1 += 1;
        } else if (filhos > 2) {
            soma2 += 1;
        }
    n += 1;
    } while (n <= 2);
    System.out.println("Ate dois filhos: " +soma1);
    System.out.println("Mais de dois filhos: " +soma2);
  }
} 
