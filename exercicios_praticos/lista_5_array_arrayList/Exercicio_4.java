package lista_5_array_arrayList;

import java.util.Scanner;

/*Operações com vetores:
*1º Situação Hipotética: Professor tem 2 provas, quer colocar todos as notas da prova UM , de todos os alunos
depois quer colocar todas as notas da prova 2, e no fim ter a media completa de cada aluno.
 */
public class Exercicio_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int qtdAlunos;
    double media = 0;

    System.out.println("Qual a quantidade de alunos?");
    qtdAlunos = sc.nextInt();

    double[] provaUm = new double[qtdAlunos];
    double[] provaDois = new double[qtdAlunos];

    for (int i = 0; i < qtdAlunos; i++) {
      System.out.println("nota 1º prova: ");
      provaUm[i] = sc.nextDouble();
      System.out.println("nota 2º prova: ");
      provaDois[i] = sc.nextDouble();
    }
    for (int i = 0; i < qtdAlunos; i++) {
      media = (provaUm[i] + provaDois[i]) / 2;
      System.out.printf("\nMédia: %.2f  Posicao:%d\n ", media, i);
    }

    sc.close();
  }
}