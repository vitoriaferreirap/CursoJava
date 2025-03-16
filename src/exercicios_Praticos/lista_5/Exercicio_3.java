package lista_5;

import java.util.Scanner;
/* Escrever um programa de cadastro do usuario: NOME, IDADE, SEXO; Depois verificar quantas mulheres 
 * estão cadastradas e quantos homens, e também os maiores e menores de idade.
 */

public class Exercicio_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numeroUsuarios;
    int maiorIdade = 0;
    int menorIdade = 0;
    int qtdMulheres = 0;
    String nomeMulheres = " "; // recupera pela posicao
    String menores = " ";

    System.out.println("Quantas pessoas deseja cadastrar? ");
    numeroUsuarios = sc.nextInt();

    String[] arrayNomeUser = new String[numeroUsuarios];
    int[] arrayIdadeUser = new int[numeroUsuarios];
    char[] arraySexoUser = new char[numeroUsuarios];

    for (int i = 0; i < numeroUsuarios; i++) {
      System.out.println("Nome: ");
      arrayNomeUser[i] = sc.next();
      System.out.println("Idade: ");
      arrayIdadeUser[i] = sc.nextInt();
      System.out.println("Sexo: ");
      arraySexoUser[i] = sc.next().charAt(0);
    }

    for (int i = 0; i < numeroUsuarios; i++) {
      if (arraySexoUser[i] == 'F') {
        qtdMulheres++;
        nomeMulheres += arrayNomeUser[i] + ", ";
      }
    }

    for (int i = 0; i < numeroUsuarios; i++) {
      if (arrayIdadeUser[i] >= 18) {
        maiorIdade++;
      } else {
        menorIdade++;
        menores += arrayNomeUser[i] + ", ";
      }
    }

    System.out.printf("Quantidade de mulheres: %d\nNome das mulheres cadastradas: %s\nPessoas menores de idade: %s",
        qtdMulheres,
        nomeMulheres, menores);

    sc.close();
  }
}
