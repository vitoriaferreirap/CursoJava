package conceitos_poo.EX_6;

/*Criando Métodos e Encapsulamento 
 * protege os dados de uma classe, permitindo que sejam acessados 
 * e modificados apenas de forma controlada.
 * Atributos private  → Protegem os dados.
 * Métodos get e set  → Controlam o acesso aos dados.
*/

public class ContaBancaria {

  private String titular;// so acessa dentro dessa classe
  private double saldo;

  // contrutor
  public ContaBancaria(String titular) {
    this.titular = titular;
    this.saldo = 0.0;

  }

  public void depositar(double valor) {
    if (valor > 0) {
      saldo += valor;
      System.err.printf("Titular: %s Você depositou: %.2f  Você tem: %.2f\n", this.titular, valor, getSaldo());
    }
  }

  public void sacar(double valor) {
    if (valor > 0 && valor <= saldo) {
      saldo -= valor;
      System.err.printf("Titular: %s Você sacou: %.2f  Você tem: %.2f\n ", this.titular, valor, getSaldo());
    } else {
      System.out.printf("Valor de saque não autorizado. Valor em conta: %.2f\n", getSaldo());
    }
  }

  public void exibirSaldo() {
    getSaldo();

  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

}
