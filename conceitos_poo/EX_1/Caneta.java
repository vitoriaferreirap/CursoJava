package conceitos_poo.EX_1;

/*
 * Criar classe caneta;
 * criar seus atributos e metodos;
 */

public class Caneta {
  // atributos
  public String modelo;
  public String cor;
  private double ponta;
  public int carga;
  protected boolean tampada;

  // metodos
  public void status() {
    System.out.println("Modelo da caneta: " + this.modelo);
    System.out.println("Cor da caneta: " + this.cor);
    System.out.println("Ponta da caneta: " + this.ponta);
    System.out.println("A caneta está tampada ? " + this.tampada);
  }

  public void rabiscar() {
    if (this.tampada == true) {
      System.out.println("ERRO!Não posso rabiscar!Caneta tampada");
    } else {
      System.out.println("Estou rabiscando!Caneta destampada");
    }

  }

  protected void tampar() {
    this.tampada = true;

  }

  protected void destampar() {
    this.tampada = false;

  }

}
