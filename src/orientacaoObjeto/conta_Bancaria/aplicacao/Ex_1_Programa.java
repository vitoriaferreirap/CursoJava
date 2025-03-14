package ex_com_pacotes.conta_Bancaria.aplicacao;

import java.util.Scanner;

import ex_com_pacotes.conta_Bancaria.entidades.Ex_1_Conta;

public class Ex_1_Programa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o numero da conta: ");
    int numeroConta = sc.nextInt();
    System.out.println("Digite o nome do Cliente: ");
    String nomeCliente = sc.next();
    System.out.println("Digite o valor para abrir a conta: ");
    double saldo = sc.nextDouble();

    // Criando a conta com os dados informados pelo usuário
    Ex_1_Conta conta = new Ex_1_Conta(numeroConta, nomeCliente, saldo);

    System.out.println("Digite o valor que deseja depositar: ");
    double valorDeposito = sc.nextDouble();

    System.out.println("Saldo inicial: " + conta.getSaldo());

    // realizar deposito
    conta.depositar(valorDeposito);

    System.out.println("Numero da conta: " + conta.getNumeroConta());
    System.out.println("Nome cliente: " + conta.getNomeCliente());
    System.out.println("Saldo apos deposito: " + conta.getSaldo());

    sc.close();

  }

}
