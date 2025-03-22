package lista_8_funcao;

import java.util.Scanner;

/*
 * Programa deve receber 3 valores do usuario e mostrar qual dos três é maior.
 * Criar uma funçao, que fará a verificaçao dos numeros
 * FUNÇAO É UM MÉTODO
 * Passos para criar funçoes:
 * 1 - definir modificadores = public,private,protected, ou sem modificador
 * 2 - definir o retorno (VOID é para métodos que nao retornam nada) se retornar colocar o TIPO
 * 3 - nomear o método
 * 4- Definir parâmetros - se precisar receber valores externos
 * IMPORTANTE : NÃO ESQUECER DO RETURN
 */

public class Exercicio_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1;
    int num2;
    int num3;

    System.out.println("Digite três valores: ");

    num1 = sc.nextInt();
    num2 = sc.nextInt();
    num3 = sc.nextInt();

    int funcaoNumeroMaior = maiorNumero(num1, num2, num3);
    mostrarResultado(funcaoNumeroMaior);

    sc.close();
  }

  // Criando as funções
  public static int maiorNumero(int a, int b, int c) { // a,b,c sao argumentos que trazem -> num1,num2,num3
    int maior = 0;

    if (a > b && a > c) {
      maior = a;
    } else if (b > c) {
      maior = b;
    } else {
      maior = c;
    }
    return maior;
  }

  public static void mostrarResultado(int value) { // value é argumento que traz o valor retornado dentro do maior
    System.out.println("O numero maior é : " + value);
  }
}
