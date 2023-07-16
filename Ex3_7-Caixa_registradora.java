//Escreva um algoritmo para simular uma caixa registradora de supermercado.
//O caixa deve digitar a quantidade comprada e o preço unitário de cada item.
//O algoritmo deve mostrar:  o total da compra e a quantidade de volumes comprados.

//Observação: não se sabe previamente quantos volumes cada pessoa tem no seu carrinho.
//Assim, ao digitar quantidade comprada = 0 (zero)  indica que não há mais itens e a compra pode ser totalizada.

import java.util.Scanner;
public class Programa {
  public static void main(String[] args) {
    // ENTRADAS
    
    Scanner teclado1 = new Scanner(System.in);
    int quantidade = 0;
    float valor = 0;
    float soma = 0;
    int contador = 0;
    float mult = 0;
    int quantidade_total = 0;
    // PROCESSAMENTO E SAÍDA
    do {
      quantidade = teclado1.nextInt();
      if (quantidade != 0) {
      valor = teclado1.nextFloat();
      quantidade_total += quantidade;
      mult = valor*quantidade;
      soma += mult;
      }
      contador++;
    } while (quantidade != 0);

    System.out.printf("Total: %.1f\n", soma);
    System.out.print("Quantidade: "+quantidade_total);
  }
} 
