//Implemente um algoritmo que mostre uma contagem regressiva na tela, iniciando em NUM e terminando em 0 (inclua um caractere espaço entre cada número impresso).
//Vale ressaltar que NUM é definido pelo usuário e deve ser >=0, sendo que o programa deve ser finalizado SOMENTE quando o usuário digitar o NUM>=0.
//Além disso, uma mensagem "O numero deve ser >=0!" deve ser impressa, caso NUM<0. 
//Por fim, uma mensagem “FIM!” será mostrada após a contagem.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    Scanner teclado1 = new Scanner(System.in);
    int num;
    // PROCESSAMENTO E SAÍDA
    do {
        System.out.println("O numero deve ser >=0!");
        num = teclado1.nextInt();
    } while (num <0);
    for (int num2 = num; num2 >=0; num2--) {
        System.out.print(num2+ " ");
    }
    System.out.println("");
    System.out.println("FIM!");
  }
} 
