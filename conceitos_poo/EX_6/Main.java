package conceitos_poo.EX_6;

public class Main {
  public static void main(String[] args) {

    // instanciando classe criando objeto
    ContaBancaria contaA = new ContaBancaria("João");

    contaA.depositar(150.00);
    contaA.sacar(50.00);

    contaA.exibirSaldo();

    // instanciando classe criando objeto
    ContaBancaria contaB = new ContaBancaria("Vitoria");

    contaB.depositar(50.00);
    contaB.sacar(200.00);

    contaB.exibirSaldo();
  }
}
