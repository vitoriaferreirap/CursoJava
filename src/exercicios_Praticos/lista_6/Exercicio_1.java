package lista_6;

import java.util.Scanner;

/*Matriz transposta:
 */

public class Exercicio_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] matriz = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    // usando .length
    System.out.println("Dados sistema:");
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz.length; j++) {
        System.out.printf(matriz[i][j] + " ");
      }
      System.out.println();
    }

    System.out.printf("Matriz transposta usando .lenght, com dados ja no sistema.\n");
    for (int j = 0; j < matriz.length; j++) {
      for (int i = 0; i < matriz.length; i++) {
        System.out.printf(matriz[i][j] + " ");

      }
      System.out.println();
    }

    int linhas;
    int colunas;
    int numeroMatriz = 0;

    System.out.println("\nDigite numero de linhas:");
    linhas = sc.nextInt();
    System.out.println("Digite o numero de colunas:");
    colunas = sc.nextInt();

    int matrizTransposta[][] = new int[colunas][linhas];

    System.out.println("Digite os numeros da sua matriz:");

    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < colunas; j++) {
        numeroMatriz = sc.nextInt();
        matrizTransposta[i][j] = numeroMatriz;
      }
    }

    System.out.printf("Matriz transposta usando entrada do user e criação de matriz dinâmica.\n");
    for (int j = 0; j < colunas; j++) {
      for (int i = 0; i < linhas; i++) {
        System.out.printf(matrizTransposta[i][j] + " ");
      }
      System.out.println();
    }

    sc.close();
  }

}
