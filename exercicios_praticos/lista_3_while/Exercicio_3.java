package lista_3_while;

import java.util.Scanner;

/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo. */

public class Exercicio_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // meus contadores
    int alcool = 0;
    int gasolina = 0;
    int disel = 0;

    System.out.println("Digite um codigo: ");
    int num = sc.nextInt();

    while (num != 4) {
      if (num == 1) {
        alcool = alcool + 1;
      } else if (num == 2) {
        gasolina = gasolina + 1;
      } else if (num == 3) {
        disel = disel + 1;
      }
      System.out.println("Digite outro codigo: ");
      num = sc.nextInt();
    }
    System.out.printf("Muito obrigada\n");
    System.out.printf("ALCOOL:%d\n", alcool);
    System.out.printf("GASOLINA:%d\n", gasolina);
    System.out.printf("DISEL:%d\n", disel);

    sc.close();
  }

}
