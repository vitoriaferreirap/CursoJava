package conceitos_POO.EX_11;

public class ContaBanco {

  public int numConta;
  protected String tipo;
  public String titular;
  public double saldo;
  public boolean status;

  public ContaBanco(int numConta, String tipo, String titular) {
    this.numConta = numConta;
    this.titular = titular;
    this.tipo = tipo;
    this.saldo = saldo;
    this.status = status;
  }

  public void abrirNovaConta() {
    double mensalidade = 0.0;
    this.status = true;
    // .equals = compara string
    if (tipo.equals("cp")) {
      saldo += 100.00;
      mensalidade = 20.00;
    } else if (tipo.equals("cc")) {
      saldo += 50.00;
      mensalidade = 12.00;

    }
    pagarMensalidade(mensalidade);

  }

  public void pagarMensalidade(double mensalidade) {
    System.out.printf("Conta aberta? %b, TIPO: %s, SALDO ATUAL: %.2f\n", status, tipo, saldo);
    System.out.printf("Sua mensalidade é de: %.2f\n", mensalidade);
    saldo -= mensalidade;
    System.out.printf("Saldo apos mensalidade:%.2f\n", saldo);
  }

  public void fecharConta() {
    if (saldo < 0) {
      System.out.println("NÃO PODE FECHAR CONTA.Saldo negativo");
    } else if (saldo > 0) {
      System.out.println("NÃO PODE FECHAR CONTA. Existe saldo na conta: " + saldo);
    }

  }

  public void depositar(double deposito) {
    saldo += deposito;
    System.out.printf("Saldo apos deposito: %.2f\n", getSaldo());

  }

  public void sacar(double saque) {
    saldo -= saque;
    System.out.printf("Saldo apos saque: %.2f\n", getSaldo());

  }

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