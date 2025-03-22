package conceitos_poo.EX_3;

public class Mala {
  public String marca;
  public String cor;
  public double preco;
  public boolean rodas;

  public void status() {
    System.out.println("Marca da mala: " + this.marca);
    System.out.println("Cor da mala: " + this.cor);
    System.out.println("Preço mala: " + this.preco);
    System.out.println("Tem rodas? " + this.rodas);
  }

  public void rodas() {
    this.rodas = true;
  }

}
