package lista_2;

import java.util.Scanner;
/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
1 cachorro quente - 4,00
2 x-salada - 4,50
3 x-bacon - 5,00
4 torrada simples - 2,00
5 refrigerante - 1,50
 */

public class Exercicio_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o codigo do item: ");
    int codigoItem = sc.nextInt();
    System.out.println("Digite o quantidade deste item: ");
    int qtdItem = sc.nextInt();

    double valorTotal = 0;

    switch (codigoItem) {

      case 1:
        double cachorroQuente = 4.00;
        valorTotal = qtdItem * cachorroQuente;
        break;

      case 2:
        double xSalada = 4.50;
        valorTotal = qtdItem * xSalada;
        break;

      case 3:
        double xBacon = 5.00;
        valorTotal = qtdItem * xBacon;
        break;

      case 4:
        double torrada = 2.00;
        valorTotal = qtdItem * torrada;
        break;

      case 5:
        double refrigerante = 1.50;
        valorTotal = qtdItem * refrigerante;
        break;
      default:
        break;
    }

    if (valorTotal > 0) {
      System.out.printf("Valor total: R$ %.2f\n", valorTotal);
    }

    sc.close();
  }
}
