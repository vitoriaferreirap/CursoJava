package lista_6_matriz;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Criando uma matriz e adicionando dados.
 * Imprimindo a matriz e recuperando o tamanho das linhas e colunas.
 * Trabalhando com incremento para validar uma condição.
 * Verificando números pares, contando a quantidade de pares e somando-os.
 * Imprimindo os números pares da matriz.
 */

public class Exercicio_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int linhas = 3;
    int colunas = 3;

    int[][] matriz = new int[linhas][colunas];

    int num = 0;
    System.out.println("Adicione numeros a matriz: 3x3");
    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < colunas; j++) {
        num = sc.nextInt();
        matriz[i][j] = num;
      }
    }
    System.out.println();

    System.out.printf("Nossa Matriz:\n");
    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < colunas; j++) {
        System.out.printf(matriz[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println();

    int numLinhas = 0;
    int numColunas = 0;

    for (int i = 0; i <= linhas; i++) {
      for (int j = 0; j <= colunas; j++) {
        numColunas = +i;
      }
      numLinhas = +i;
    }
    System.out.printf("nº linhas: %d\nnº colunas: %d\n", numLinhas, numColunas);

    int maiorNumero = matriz[0][0];// evita que ultrapasse o limite do array na ultima posiçao
    System.out.printf("\nMaior numero da matriz:");
    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < colunas; j++) {
        if (matriz[i][j] > maiorNumero) {
          maiorNumero = matriz[i][j];
        }
      }
    }
    System.out.println(maiorNumero);
    int numPraresExpressos = 0;
    int numPares = 0;

    ArrayList<Integer> numerosPares = new ArrayList<>();

    for (int i = 0; i < linhas; i++) {
      for (int j = 0; j < colunas; j++) {
        if (matriz[i][j] % 2 == 0) {
          numPares++; // incrementa 1 a cada volta
          numPraresExpressos = numPraresExpressos + matriz[i][j];// pega valor atual + novo;
          numerosPares.add(matriz[i][j]);// adiciona os pares em uma arrayList

        }
      }
    }
    System.out.printf(
        "Quantidade dos nº pares da matriz:" + numPares + " \nSoma dos nº pares da matriz:" + numPraresExpressos);

    System.out.printf("\nnº pares da matriz: ");
    for (int i = 0; i < numerosPares.size(); i++) {
      System.out.printf(numerosPares.get(i) + ", ");
    }

    sc.close();
  }

}
