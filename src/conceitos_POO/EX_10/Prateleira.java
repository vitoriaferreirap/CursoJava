package conceitos_POO.EX_10;

public class Prateleira {
  private String modelo;
  private double altura;
  private boolean frete;
  private String cor;

  // contrutor, programa inicia com essas configs
  public Prateleira(String modeloP, double alturaP, String corP) {
    this.freteGratis();
    this.modelo = modeloP;
    this.altura = alturaP;
    this.cor = corP;

  }

  public void freteGratis() {
    this.frete = true;
  }

  public void fretePago() {
    this.frete = false;
  }

  public void status() {
    System.out.println("Modelo da prateleira: " + this.modelo);
    System.out.println("Altura da prateleira: " + getAltura());
    System.out.println("Com frete gratis? " + this.frete);
    System.out.println("Cor da prateleira: " + this.cor);
  }

  // metodos acessor
  public String getModelo() {
    return modelo;
  }

  // metodo modificador
  public void setModelo(String modeloArgs) {
    this.modelo = modeloArgs;
  }

  public double getAltura() {
    return this.altura;
  }

  public void setAltura(double alturaArgs) {
    this.altura = alturaArgs;
  }
}
