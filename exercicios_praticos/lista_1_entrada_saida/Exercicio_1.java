package lista_1_entrada_saida;

import java.util.Scanner;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
*/

public class Exercicio_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite dois numeros inteiro");
    int x = sc.nextInt();
    int y = sc.nextInt();
    int soma = x + y;

    System.out.println("Soma dos numeros é: " + soma);
    System.out.println("O Y é :" + y + (" E o X é :") + x);

    sc.close();
  }
}