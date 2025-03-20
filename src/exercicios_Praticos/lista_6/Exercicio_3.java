package lista_6;

import java.util.Scanner;
/*
 * Matriz Identidade
 * Crie um programa que gere e exiba uma matriz identidade de ordem N x N, onde N é informado pelo usuário.
 * linha == coluna (recebe 1)
 * diagonal sempre 1.
 * matriz sempre ao quadrado de N
 */

public class Exercicio_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um numero para sua matriz:");
    int num = sc.nextInt();

    int[][] matriz = new int[num][num];

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        if (i == j) {
          matriz[i][j] = 1;
        }
      }

    }

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        System.out.printf(matriz[i][j] + " ");
      }
      System.out.println();
    }

    sc.close();
  }

}