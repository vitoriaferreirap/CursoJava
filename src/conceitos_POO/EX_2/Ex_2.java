package conceitos_POO.EX_2;

public class Ex_2 {
  public static void main(String[] args) {

    Produto p1 = new Produto();// 1º objeto
    p1.nomeProduto = "Porta";
    p1.precoProduto = 40.00;
    p1.qtdProduto = 3;

    p1.status();
    p1.somaProdutos();

    System.out.println();

    Produto p2 = new Produto();// 2ºobjeto
    p2.nomeProduto = "Janela";
    p2.precoProduto = 50.00;
    p2.qtdProduto = 5;

    p2.status();
    p2.somaProdutos();

  }
}
