package lista_2_if_else;

import java.util.Scanner;
/*Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais. 
*/

public class Exercicio_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o salário: ");
    double salario = sc.nextDouble();
    double descontoPorcentagem = 0;

    if (salario >= 0 && salario <= 2000.00) {
      System.out.println("Isento");

    } else if (salario <= 3000.00) {
      descontoPorcentagem = (salario - 2000.00) * 0.08; // é so a diferença que conta
      System.out.printf("%.2f", descontoPorcentagem);

    } else if (salario <= 4500.00) {
      descontoPorcentagem = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
      System.out.printf("%.2f", descontoPorcentagem);
    } else if (salario > 4500.00) {
      descontoPorcentagem = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08; // 500 reais considerado
      System.out.printf("%.2f", descontoPorcentagem);
    }

    sc.close();
  }

}