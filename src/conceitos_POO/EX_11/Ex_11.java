package conceitos_POO.EX_11;

import conceitos_POO.EX_6.ContaBancaria;
import java.util.Scanner;
/*REGRAS
 * CC = conta corrente (incia c/ 50,00) CP = conta poupança (incia c/ 150,00)
 * Ideia é mostrar criando varios objetos, e manipulado e reutilizando metodos,
 * para termos o mesmo resultado. 
 * Vemos duas contas sendo criadas com dados inseridos no codigo;
 * e depois um meno que possibilita a pessoa inserir dados via teclado e os mesmos serem adicionados, assim como fazer operações de forma 
 * que o usuario preferir
 */

public class Ex_11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // dados inseridos
    ContaBanco conta2 = new ContaBanco();
    conta2.setNumConta(111);
    conta2.setTitular("Vitoria");
    conta2.abrirNovaConta("CP");
    conta2.depositar(300.00);

    ContaBanco conta3 = new ContaBanco();
    conta3.setNumConta(222);
    conta3.setTitular("Maria");
    // conta3.sacar(20.00);//a conta ainda nao foi aberta
    conta3.abrirNovaConta("CC");
    conta3.sacar(20.00);

    // conta2.statusGeral();
    System.out.println("\nO que deseja fazer?\n");
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
    conta.abrirNovaConta(tipo);

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
