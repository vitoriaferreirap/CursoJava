package lista_5_array_arrayList;

import java.util.Scanner;

/*Fazer um programa, onde é digitado um numero N de pessoas, e depois verifica qual das N pessoas
é a mais velha
*/

public class Exercicio_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numeroPessoas;
    int idadePessoa = 0;

    System.out.printf("Digite a quantidade de pessoas que ira adicionar.");
    numeroPessoas = sc.nextInt();

    // criando array que recebe nomes e idades; qtd de posicoes add de forma
    // dinâmica
    String[] arrayNome = new String[numeroPessoas];
    int[] arrayIdade = new int[numeroPessoas];

    // for recepitor
    for (int i = 0; i < numeroPessoas; i++) {
      System.out.printf("Dados %da primeira pessoa: \n", i + 1);
      System.out.println("Nome: ");
      arrayNome[i] = sc.next(); // armazena o nome da posição atual do vetor no loop
      System.out.println("Idade: ");
      arrayIdade[i] = sc.nextInt();
    }

    int maiorPosicao = 0;
    for (int i = 0; i < numeroPessoas; i++) {
      if (arrayIdade[i] > arrayIdade[maiorPosicao]) {
        maiorPosicao = i;
      }
    }

    System.out.printf("A MAIOR IDADE ESTÁ NA POSICÃO : %d do array\n", maiorPosicao);
    System.out.printf("O NOME DA PESSOA QUE TEM A MAIOR IDADE É: %s\n", arrayNome[maiorPosicao]);
    System.out.printf("A IDADE DA PESSOA MAIS VELHA É : %d\n", arrayIdade[maiorPosicao]);

    sc.close();
  }

}