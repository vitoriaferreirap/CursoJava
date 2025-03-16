package lista_4;

import java.util.Scanner;

/* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.


formula média ponderada:  M = (v1*p1)+(v2*p2) / p1+p2 */

public class Exercicio_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    for (int i = 0; i < num; i++) {
      double valor1 = sc.nextDouble();
      double valor2 = sc.nextDouble();
      double valor3 = sc.nextDouble();

      double media = (valor1 * 2.0 + valor2 * 3.0 + valor3 * 5.0) / 10.0;
      System.out.printf("%.1f\n", media);
    }

    sc.close();
  }
}