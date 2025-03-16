package lista_4;

import java.util.Scanner;

/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo */

public class Exercicio_7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    int quadrado = 0;
    int cubo = 0;
    int primeiro = 0;

    for (int i = 1; i <= num; i++) {
      primeiro = i;
      quadrado = i * i;
      cubo = i * i * i;
      System.out.printf("%d %d %d\n", primeiro, quadrado, cubo);
    }

    sc.close();
  }
}
