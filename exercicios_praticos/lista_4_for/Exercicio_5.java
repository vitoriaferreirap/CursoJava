package lista_4_for;

import java.util.Scanner;

/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */

public class Exercicio_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    int fatoria = 1;

    for (int i = 1; i <= num; i++) {
      fatoria = fatoria * i;
    }
    System.out.println(fatoria);

    sc.close();
  }

}
