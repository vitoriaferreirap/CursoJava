package lista_4;

import java.util.Scanner;
/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". */

public class Exercicio_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double num = sc.nextDouble();

    for (int i = 0; i < num; i++) {
      double parteUm = sc.nextDouble();
      double parteDois = sc.nextDouble();

      if (parteDois == 0) {
        System.out.println("Divisão impossivel");
      } else {
        double divisao = parteUm / parteDois;
        System.out.println(divisao);
      }
    }

    sc.close();
  }
}
