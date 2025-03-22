package conceitos_poo.EX_7;

public class Carro {

  public String modelo;
  public String marca;
  public int ano;

  // construtor
  public Carro(String modeloCarro, String marcaCarro, int anoCarro) {
    this.modelo = modeloCarro;
    this.marca = marcaCarro;
    this.ano = anoCarro;

  }

  public void mostrarDadosCarro() {
    System.out.printf("Detalhes do carro: %s, %s, %d", modelo, marca, ano);
  }

}
