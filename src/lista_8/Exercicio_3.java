package lista_8;

import java.util.Scanner;

/* Crie um programa que recebe um número e verifica se ele é primo.
 * Crie uma função que retorna true se for primo e false se não for.
 * No main, peça ao usuário para inserir um número e exiba o resultado.
 */

public class Exercicio_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;
    System.out.println("Escolha um numero: ");
    num = sc.nextInt();

    boolean numerosPrimos = funcaoPrimos(num);
    mostrarResultado(numerosPrimos);

    sc.close();
  }

  public static boolean funcaoPrimos(int num) {

    if (num <= 1) {
      return false;
    }
    for (int i = 2; i < num; i++) {
      if (num % i != 0) {
        return true;
      }
    }
    return true;
  }

  public static void mostrarResultado(boolean resultado) {
    System.out.println(resultado);
  }

}
