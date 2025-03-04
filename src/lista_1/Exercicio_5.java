package lista_1;

import java.util.Scanner;

/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
 */

public class Exercicio_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Codigo da peça 1");
    int codigoPeca1 = sc.nextInt();
    System.out.println("Numero de peças 1");
    int qtdPeça1 = sc.nextInt();
    System.out.println("Valor da unidade de cada peça 1");
    double valorUnidade1 = sc.nextDouble();

    System.out.println("Codigo da peça 2");
    int codigoPeca2 = sc.nextInt();
    System.out.println("Numero de peças 2");
    int qtdPeça2 = sc.nextInt();
    System.out.println("Valor da unidade de cada peça 2");
    double valorUnidade2 = sc.nextDouble();

    double valorTotalPeca1 = valorUnidade1 * qtdPeça1;
    double valorTotalPeca2 = valorUnidade2 * qtdPeça2;

    double valorApagar = valorTotalPeca1 + valorTotalPeca2;

    System.out.printf("Valor a pagar: %.2f", valorApagar);

    sc.close();
  }
}
