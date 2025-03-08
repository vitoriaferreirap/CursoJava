package lista_5;

import java.util.ArrayList;
import java.util.Scanner;

/*Operações com vetores:
*2 º Situação Hipotética: Um supermercado precisa registrar o preço de N produtos
e depois calcular o total da compra de um cliente que leva M produtos escolhidos..
 */

public class Exercicio_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<String> nomes = new ArrayList<>();
    ArrayList<Integer> qtds = new ArrayList<>();
    ArrayList<Double> precos = new ArrayList<>();
    ArrayList<Double> total = new ArrayList<>();

    String nomeProduto;
    int qtdProduto;
    double precoProduto;

    System.out.println("Digite o nome do produto (ou '0' para finalizar qualquer momento):");

    while (true) {
      System.out.println("Nome produto:");
      nomeProduto = sc.next();

      // equals() para comparar as strings
      if (nomeProduto.equals("0")) {
        break;
      }
      sc.nextLine();

      System.out.println("Quantidade produto:");
      qtdProduto = sc.nextInt();
      if (qtdProduto == 0) {
        break;
      }

      System.out.println("Preço produto:");
      precoProduto = sc.nextDouble();

      // equals() para comparar as strings
      if (precoProduto == 0.0) {
        break;
      }

      nomes.add(nomeProduto);
      qtds.add(qtdProduto);
      precos.add(precoProduto);

      double valorTotal = precoProduto * qtdProduto;
      total.add(valorTotal);

    }
    System.out.println("Produtos cadastrados:");

    for (int i = 0; i < nomes.size(); i++) {
      System.out.printf("Produto:" + nomes.get(i) + " Quatidade:" + qtds.get(i) + " Preço Unidade:" + precos.get(i)
          + " Valor total:" + total.get(i) + "\n");

    }

    sc.close();
  }
}
