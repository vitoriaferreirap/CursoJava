package conceitos_POO.EX_5;

public class Carro {
  // atributos
  public String marca;
  public String modelo;
  public int ano;

  // contrutor para incializar os atributos
  public Carro(String marcaCarro, String modeloCarro, int anoCarro) {
    this.marca = marcaCarro;
    this.modelo = modeloCarro;
    this.ano = anoCarro;
  };

  public void exibirInformacao() {
    System.out.printf("Marca: %s  Modelo: %s  Ano: %d\n", marca, modelo, ano);
  }

}
