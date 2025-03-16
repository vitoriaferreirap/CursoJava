package lista_1;

import java.util.Scanner;

/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio ao quadrado
Considere o valor de π = 3.14159
*/
public class Exercicio_2 {

  public static void main(String[] args) { // esse método main
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor do raio: ");
    double raio = sc.nextDouble();
    double area = 3.14159 * (raio * raio);

    System.out.printf("A área desse circulo é : %.4f", area);

    sc.close();

  }
}