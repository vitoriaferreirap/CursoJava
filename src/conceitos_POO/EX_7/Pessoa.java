package conceitos_POO.EX_7;

public class Pessoa {

  public String nome;
  public int idade;
  public Carro carro;

  // construtor
  public Pessoa(String nomePessoa, int idadePessoa, Carro carroPessoa) {
    this.nome = nomePessoa;
    this.idade = idadePessoa;
    this.carro = carroPessoa;
  }

  public void mostrarDadosPessoa() {
    System.out.printf("Detalhes da pessoa: %s, %d\n", nome, idade);

    carro.mostrarDadosCarro();// chama classe carro

  }

}
