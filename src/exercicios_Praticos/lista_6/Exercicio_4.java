package lista_6;

import java.util.Scanner;

/*
 * Soma de duas matrizes;
 * A soma de duas matrizes A e B resulta em uma nova matriz C, onde cada elemento de C é a soma dos elementos correspondentes de A e B.
 * Para que seja possível somar duas matrizes, ambas precisam ter o mesmo número de linhas e colunas.
 */

public class Exercicio_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] matrizA = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    int[][] matrizB = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    int[][] matrizC = new int[3][3];

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {

        matrizC[i][j] = matrizA[i][j] + matrizB[i][j];

      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.printf(matrizC[i][j] + " ");
      }
      System.out.println();
    }

    sc.close();

  }
}
