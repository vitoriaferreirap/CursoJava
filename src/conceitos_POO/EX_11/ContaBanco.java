package conceitos_POO.EX_11;

import conceitos_POO.EX_6.ContaBancaria;

public class ContaBanco {

  public int numConta;
  protected String tipo;
  private String titular;
  private double saldo;
  private boolean status;

  public ContaBanco() {

  }

  public ContaBanco(int numConta, String tipo, String titular) {
    this.numConta = numConta;
    this.titular = titular;
    this.tipo = tipo;
    this.setSaldo(0.0);
    this.setStatus(false);
  }

  public void abrirNovaConta(String tipo) {
    double mensalidade = 0.0;

    setTipo(tipo);// configurando o tipo em relacao ao que vem do teclado
    System.out.println(getTitular());
    setStatus(true);// config valor logico

    // .equals = compara string
    if (tipo.equals("CP")) {
      setSaldo(100.00);
      mensalidade = 20.00;
      System.out.printf("Conta aberta com sucesso! Saldo inicial: %.2f\n", getSaldo());
      pagarMensalidade(mensalidade);
      // saldo += 100.00;
    } else if (tipo.equals("CC")) {
      setSaldo(50.00);
      mensalidade = 12.00;
      System.out.printf("Conta aberta com sucesso! Saldo inicial: %.2f\n", getSaldo());
      pagarMensalidade(mensalidade);

      // saldo += 50.00;
    }

  }

  public void fecharConta() {
    if (getSaldo() < 0) {
      System.out.println("NÃO PODE FECHAR CONTA.Saldo negativo");
    } else if (getSaldo() > 0) {
      System.out.println("NÃO PODE FECHAR CONTA. Existe saldo na conta: " + saldo);
    } else {
      setStatus(false);
    }

  }

  public void depositar(double deposito) {
    if (getStatus() == true) {
      setSaldo(getSaldo() + deposito);// modifica o saldo para(saldoAtual + deposito) MELHOR SOLUÇÃO
      // saldo += deposito;
      System.out.printf("Saldo apos deposito: %.2f\n", getSaldo());
    } else {
      System.out.println("Impossivel depositar");
    }

  }

  public void sacar(double saque) {

    if (getStatus() == true) {// conta ativa
      if (getSaldo() >= saque) {// tem dinheiro para sacar?
        setSaldo(getSaldo() - saque);
        System.out.printf("Saldo apos saque: %.2f\n", getSaldo());
      } else {
        System.out.println("Impossivel depositar");
      }
    } else {
      System.out.println("Impossivel sacar de uma conta fechada");
    }
  }

  public void pagarMensalidade(double mensalidade) {

    if (getStatus() == true) {// conta ativa
      if (getSaldo() >= mensalidade) {// tenho valor para pagar mensalidade?
        setSaldo(getSaldo() - mensalidade);
        System.out.printf("Seu saldo após pagar mensalidade: %.2f\n", getSaldo());
      } else {
        System.out.println("Erro ao cobrar mensalidade");
      }
    } else {
      System.out.println("Impossivel pagar com uma conta fechada ");
    }

  }

  // Argumento é o valor que você passa para a função ou método quando chama ela.
  // Parâmetro é uma variável declarada em uma função ou método.
  public int getNumConta() {
    return numConta;
  }

  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
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

  public boolean getStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

}