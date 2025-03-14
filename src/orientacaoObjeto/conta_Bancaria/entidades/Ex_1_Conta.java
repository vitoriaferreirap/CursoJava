package ex_com_pacotes.conta_Bancaria.entidades;

public class Ex_1_Conta {

  // **Encapsulamento**: Os atributos são privados para proteger os dados da
  // classe
  private Integer numeroConta;
  private String nomeCliente;
  private Double saldo;

  // **Construtor padrão**: Inicializa um objeto sem definir valores iniciais
  public Ex_1_Conta() {
  }

  // **Construtor**: Permite criar uma conta já com valores definidos
  public Ex_1_Conta(Integer numeroConta, String nomeCliente, Double saldo) {
    this.numeroConta = numeroConta;
    this.nomeCliente = nomeCliente;
    this.saldo = saldo;
  }

  // **Métodos Getters e Setters** (Acesso e modificação dos atributos de forma
  // controlada)
  public Integer getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(Integer numeroConta) {
    this.numeroConta = numeroConta;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  // Método para sacar dinheiro da conta
  public void sacar(Double valorSaque) {
    if (valorSaque > 0) {
      saldo += valorSaque;
    } else {
      System.out.println("Sem dinheiro para depositos");
    }
  }

  public void depositar(Double valorDeposito) {
    this.saldo += valorDeposito;

  }
}
