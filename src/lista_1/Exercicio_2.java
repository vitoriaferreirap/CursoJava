package lista_1;

import java.util.Scanner;

/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio ao quadrado
Considere o valor de π = 3.14159
*/
public class Exercicio_2 {
  /*
   * -O método main precisa ser estático porque é chamado pelo Java sem a
   * necessidade de criar um objeto da classe
   * -O tipo de retorno do método main. No caso, void significa que o método não
   * retorna nenhum valor.
   * -O parâmetro String[] args é uma convenção em Java e não está relacionado ao
   * tipo de dados com o qual você vai trabalhar dentro do seu programa. Ele serve
   * apenas para capturar parâmetros passados via linha de comando.
   */

  public static void main(String[] args) { // esse método main
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor do raio: ");
    double raio = sc.nextDouble();
    double area = 3.14159 * (raio * raio);

    System.out.printf("A área desse circulo é : %.4f", area);

    sc.close();

  }
}