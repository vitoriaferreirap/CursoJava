package lista_2_if_else;

import java.util.Scanner;

/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */

public class Exercicio_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um numero: ");
    int num = sc.nextInt();

    if (num % 2 == 0) {
      System.out.printf("Numero par %d", num);
    } else {
      System.out.printf("Numero impar %d", num);
    }

    sc.close();
  }

}
