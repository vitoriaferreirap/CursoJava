package lista_9_excesao;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
 *  Lê uma linha de texto com palavras separadas por espaço, usando sc.nextLine(), e divide essa linha em um array de strings com o método split(" ").
 * 
 * ArrayIndexOutOfBoundsException  - Essa exceção ocorre quando você tenta acessar um índice de um array que está fora dos limites válidos.
 * usar sempre que quizer verificar se o índice está dentro dos limites do array:
 * 
 * InputMismatchException -  Essa exceção ocorre quando você tenta ler um valor de entrada que não corresponde ao tipo de dado esperado. 
 * É comumente lançada quando você usa o Scanner para ler dados do teclado e o tipo de entrada fornecido pelo usuário não é compatível com o tipo que o programa espera.
 * 
 * O método printStackTrace() é usado para imprimir o "rastreamento da pilha" (stack trace) da exceção no console. Isso mostra onde a exceção ocorreu no código e pode ajudar no diagnóstico do problema.
 * 
 * Papel do E: você define um nome de variável (como e neste caso) que irá representar a exceção capturada.O catch pega a exceção lançada e você pode manipulá-la ou imprimir informações sobre ela.
 */

public class Exercicio_1 {
  public static void main(String[] args) {
    funcaoUm();
    System.out.println("Fim de programa");
  }

  public static void funcaoUm() {
    System.out.println("Funcão um sendo chamada!");
    funcaoDois();
    System.out.println("Fim da função um");
  }

  public static void funcaoDois() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Funcão dois sendo chamada!");
    try {
      System.out.println("Digite uma frase: ");
      String[] vetorString = sc.nextLine().split(" ");
      int posicao;

      System.out.println("Digite um numero inteiro representando indice do array de string: ");
      posicao = sc.nextInt();
      System.out.println(vetorString[posicao]);

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Posição invalida");
      e.printStackTrace();
      sc.next();

    } catch (InputMismatchException e) {
      System.out.println("Erro no input");

    }

    sc.close();
    System.out.println("Fim da função Dois");
  }
}
