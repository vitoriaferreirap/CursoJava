package lista_8_funcao;

import java.util.Scanner;

/*
 * Crie um programa que recebe três notas de um aluno e calcula a média.
 * O programa deve ter:
 * Uma função para calcular a média.
 * Uma função para mostrar o resultado.
 * A função principal (main) para receber os valores e chamar as funções.
 */

public class Exercicio_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double nota1;
    double nota2;

    System.out.println("Digite a nota 1 e 2: ");
    nota1 = sc.nextDouble();
    nota2 = sc.nextDouble();

    double mediaTotal = funcaoMedia(nota1, nota2);
    mostrarResultado(mediaTotal);

    sc.close();
  }

  public static double funcaoMedia(double nota1, double nota2) {
    double media = 0.0;
    media = (nota1 + nota2) / 2;
    return media;

  }

  public static void mostrarResultado(double resultado) {
    System.out.println("A média é: " + resultado);
  }
}
