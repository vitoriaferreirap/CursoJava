package conceitos_POO.EX_11;

import java.util.Scanner;

public class Ex_11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("O que deseja fazer?");
    System.out.println("1 - Crir conta\n2 - Depositar\n3 - Sacar");
    int num = sc.nextInt();

    int numConta;
    String tipo;
    String titular;

    System.out.println("Qual o nome do titular?");
    titular = sc.next();
    System.out.println("Qual o tipo da conta?");
    tipo = sc.next();
    System.out.println("Qual o numero da conta?");
    numConta = sc.nextInt();

    ContaBanco conta = new ContaBanco(numConta, tipo, titular);
    conta.abrirNovaConta();

    System.out.println("Qual valor deseja depositar?\n");
    double deposito = sc.nextDouble();
    conta.depositar(deposito);

    System.out.println("Qual valor deseja sacar?");
    double saque = sc.nextDouble();
    conta.sacar(saque);

    System.out.println("Deseja fechar a conta?");
    conta.fecharConta();

    sc.close();

  }
}
