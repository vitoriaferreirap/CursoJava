package lista_8;

import java.util.Scanner;
/*Crie uma função que receba um número e retorne "Par" se for par e "Ímpar" se for ímpar. */

public class Exercicio_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num;
    System.out.println("Digite um numero");
    num = sc.nextInt();

    int chamadaFuncao = funcaoParImpar(num);
    mostrarResultado(chamadaFuncao);

    sc.close();
  }

  public static int funcaoParImpar(int num) {

    if (num % 2 == 0) {
      return 0;
    } else {
      return 1;
    }

  }

  public static void mostrarResultado(int num) {
    if (num == 0) {
      System.out.println("Numero par");
    } else {
      System.out.println("Numero impar");
    }

  }

}
