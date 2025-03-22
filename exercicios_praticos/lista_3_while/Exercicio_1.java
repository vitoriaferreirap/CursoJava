package lista_3_while;

import java.util.Scanner;

/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002 */

public class Exercicio_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int senha = 2002;
    System.out.println("Digite uma senha:");
    int num = sc.nextInt();

    while (num != senha) { // booleana true ou false
      System.out.println("Senha Invalida");
      num = sc.nextInt();
    }
    System.out.println("Acesso Permitido");

    sc.close();
  }

}
