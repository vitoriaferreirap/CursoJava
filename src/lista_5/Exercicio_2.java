package lista_5;

import java.util.Scanner;

/*Fazer um programa, onde é digitado um numero N de alunos e nota no primeiro semestre e do segundo de cada aluno,
depois mostrar os alunos APROVADOS , alunos REPROVAODS, e a média de cada um. Media para passar é 6.0
*/

public class Exercicio_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int qtdAlunos;
    double media = 0.0;

    System.out.println("Quantos alunos você precisa cadastrar?");
    qtdAlunos = sc.nextInt();

    String[] arrayNomeAlunos = new String[qtdAlunos];
    double[] arrayPrimeiroSemestre = new double[qtdAlunos];
    double[] arraySegundoSemestre = new double[qtdAlunos];

    // FOI 1 = pega dados e os coloca no array
    for (int i = 0; i < qtdAlunos; i++) {
      System.out.printf("Digite o nome %do primeiro aluno:", i + 1);
      arrayNomeAlunos[i] = sc.next();
      System.out.println("Digite a nota do 1º semestre do aluno:");
      arrayPrimeiroSemestre[i] = sc.nextDouble();
      System.out.println("Digite a nota do 2º semestre do aluno:");
      arraySegundoSemestre[i] = sc.nextDouble();
    }

    // FOR 2 = tira a media das notas e ve quem está aprovado ou não
    for (int i = 0; i < qtdAlunos; i++) {
      media = (arrayPrimeiroSemestre[i] + arrayPrimeiroSemestre[i]) / 2.0;
      if (media >= 6.0) {
        System.out.printf("Aluno %s  APROVADO, com média: %.2f \n", arrayNomeAlunos[i], media);
      } else {
        System.out.printf("Aluno %s  REPROVADO, com média: %.2f ", arrayNomeAlunos[i], media);
      }

    }

    sc.close();
  }

}
