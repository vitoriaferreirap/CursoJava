package lista_2_if_else;

import java.util.Scanner;

/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não */

public class Exercicio_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um numero:");
    int n = sc.nextInt();

    if (n >= 0) {
      System.out.println("Numero não negativo");
    } else {
      System.out.println("Negativo");
    }

    sc.close();
  }

}
