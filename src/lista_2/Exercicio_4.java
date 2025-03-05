package lista_2;

import java.util.Scanner;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */

public class Exercicio_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Hora inicial do jogo: ");
    int horaInicio = sc.nextInt();
    System.out.println("Hora final do jogo: ");
    int horaFinal = sc.nextInt();

    int duracaoJogo;

    if (horaFinal > horaInicio) {
      duracaoJogo = horaFinal - horaInicio;
    } else if (horaInicio > horaFinal) {
      duracaoJogo = (24 - horaInicio) + horaFinal;
    } else {
      duracaoJogo = 24;
    }

    System.out.printf("O jogo durou: %d horas\n", duracaoJogo);

    sc.close();
  }
}
