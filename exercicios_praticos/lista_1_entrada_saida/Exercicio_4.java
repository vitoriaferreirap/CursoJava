package lista_1_entrada_saida;

import java.util.Scanner;

/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */

public class Exercicio_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Codigo funcionario: ");
    int codigoFuncionarios = sc.nextInt();
    System.out.println("Numero de horas trabalhadas: ");
    int horasTrabalhadas = sc.nextInt();
    System.out.println("Valor por hora: ");
    double valorHora = sc.nextDouble();

    double salario = valorHora * horasTrabalhadas;
    System.out.printf("Salário funcionario: %.2f", salario);

    sc.close();

  }
}
