package conceitos_poo.EX_2;

public class Produto {
  public String nomeProduto;
  public double precoProduto;
  public double qtdProduto;

  public void status() {
    System.out.println("Produto: " + this.nomeProduto);
    System.out.println("Preço: " + this.precoProduto);
    System.out.println("Quantidade: " + this.qtdProduto);

  }

  public void somaProdutos() {
    this.qtdProduto = qtdProduto;
    this.precoProduto = precoProduto;

    double soma = qtdProduto * precoProduto;
    System.out.printf("A soma de : %.0f  %s é:  %.2f", this.qtdProduto, this.nomeProduto, soma);

  }

}
