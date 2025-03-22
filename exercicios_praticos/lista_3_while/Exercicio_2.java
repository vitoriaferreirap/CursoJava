package lista_3_while;

import java.util.Scanner;

/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */

public class Exercicio_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();

    while (x != 0 || y != 0) {
      if (x == 0 && y == 0) {
        System.out.println("Origem");
      } else if (x > 0 && y > 0) {
        System.out.println("primeira");
      } else if (x < 0 && y > 0) {
        System.out.println("segundo");
      } else if (x < 0 && y < 0) {
        System.out.println("terceiro");
      } else if (x > 0 && y < 0) {
        System.out.println("quarta");
      }
      x = sc.nextInt(); // temque ter para não dar loop infinito
      y = sc.nextInt();
    }

    sc.close();
  }

}
