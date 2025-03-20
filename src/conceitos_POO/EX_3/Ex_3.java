package conceitos_POO.EX_3;

public class Ex_3 {
  public static void main(String[] args) {

    Mala m1 = new Mala();
    m1.marca = "A";
    m1.cor = "preta";
    m1.preco = 101.00;

    m1.rodas();
    m1.status();

    System.out.println();

    Mala m2 = new Mala();
    m2.marca = "B";
    m2.cor = "vermelha";
    m2.preco = 200.00;
    m2.rodas = false;

    m2.status();
  }
}
