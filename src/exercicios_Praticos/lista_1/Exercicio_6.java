package lista_1;

import java.util.Scanner;

/*
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.  base * altura / 2
b) a área do círculo de raio C. (pi = 3.14159) PI * raio ao quadrado
c) a área do trapézio que tem A e B por bases e C por altura. (b1 + b2) * altura / 2
d) a área do quadrado que tem lado B. altura ao quadrado
e) a área do retângulo que tem lados A e B. base * altura
 */

public class Exercicio_6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite três valores decimais: ");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();

    double areaTrianguloRetangulo = a * c / 2;
    double areaCirculo = 3.14159 * (c * c);
    double areaTrapezio = (a + b) * c / 2;
    double areaQuadrado = b * b;
    double areaRetangulo = a * b;

    System.out.printf("Triangulo: %.3f \n", areaTrianguloRetangulo);
    System.out.printf("Circulo: %.3f \n", areaCirculo);
    System.out.printf("Trapezio: %.3f \n", areaTrapezio);
    System.out.printf("Quadrado: %.3f \n", areaQuadrado);
    System.out.printf("Retangulo: %.3f \n", areaRetangulo);

    sc.close();

  }
}
