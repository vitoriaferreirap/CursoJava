package lista_5_array_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*Operações com vetores:
*3º Situação Hipotética: Um sistema de banco precisa registrar o saldo inicial e os valores de transações 
(depósitos e saques) de N clientes.No final, mostrar o saldo final de cada cliente. NOME, NUMERO CONTA, SALDO
 */

public class Exercicio_6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // criando arrays
    ArrayList<String> nomes = new ArrayList<>();
    ArrayList<Integer> numContas = new ArrayList<>();
    ArrayList<Double> saldoContas = new ArrayList<>();

    // array que armazenam operações
    ArrayList<Double> depositos = new ArrayList<>();
    ArrayList<Double> saques = new ArrayList<>();

    // criando variaveis que receberam entrada dos dados do arrays
    String nomeCliente;
    int numeroContaCliente;
    double saldoCliente;

    int num = sc.nextInt();
    for (int i = 0; i < num; i++) {
      System.out.println("Nome cliente: ");
      nomeCliente = sc.next();
      System.out.println("Numero conta cliente: ");
      numeroContaCliente = sc.nextInt();
      System.out.println("Saldo inicial da conta: ");
      saldoCliente = sc.nextDouble();

      // add aos array os dados de entrada
      nomes.add(nomeCliente);
      numContas.add(numeroContaCliente);
      saldoContas.add(saldoCliente);
    }

    for (int i = 0; i < numContas.size(); i++) {
      System.out.printf("Posicao: %d, A conta de nº: %d, Tem saldo atual de: %.2f \n", i, numContas.get(i),
          saldoContas.get(i));
    }

    while (true) {
      System.out.println("O que quer fazer agora? 1 - DEPOSITAR\n2 2 - SACAR\n 3 -EXTRATO\n 0 -SAIR\n");
      int opcao = sc.nextInt();
      double deposito;
      double saque;
      int nConta = 0;

      if (opcao == 0) {
        System.out.println("Saindo do sistema...");
        break; // Sai do loop e finaliza o programa
      }
      switch (opcao) {
        case 1:
          System.out.println("Digite o numero da conta:");
          nConta = sc.nextInt();
          // descobro qual a posição do valor da conta.
          int index = numContas.indexOf(nConta);

          System.out.println("Digite o valor do deposito:");
          deposito = sc.nextDouble();
          depositos.add(deposito);

          saldoContas.set(index, saldoContas.get(index) + deposito);
          System.out.printf("Valor em conta apos deposito: %.2f", saldoContas.get(index));

          break;
        case 2:
          System.out.println("Digite o numero da conta:");
          nConta = sc.nextInt();
          // descobro qual a posição do valor da conta.
          int index2 = numContas.indexOf(nConta);

          System.out.println("Digite o valor do saque:");
          saque = sc.nextDouble();
          saques.add(saque);

          saldoContas.set(index2, saldoContas.get(index2) - saque);
          System.out.printf("Valor em conta apos saque: %.2f", saldoContas.get(index2));

          break;

        case 3:
          for (int i = 0; i < depositos.size(); i++) {
            System.out.printf("Depositos feitos: %.2f\n", depositos.get(i));
          }

          for (int i = 0; i < saques.size(); i++) {
            System.out.printf("Saquess feitos: %.2f\n", saques.get(i));
          }

          break;
        default:
      }
    }

    sc.close();
  }
}
