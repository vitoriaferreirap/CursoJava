package conceitos_poo.EX_1;

/*
 * Minha classe com o metodo principal main
 * Instanciando: criando um objeto da classe Caneta
 * Interligando nosso objeto com os atibutos da classe Caneta
 */
public class Ex_1 {
  public static void main(String[] args) {
    // criando objeto c1, da classe caneta
    Caneta c1 = new Caneta();
    c1.modelo = "BIC Cristal";// public
    c1.cor = "Azul";
    // c1.ponta = 0.5; private
    // c1.carga = 80;
    // c1.tampada = true; protected, nao tem herança por isso nao acessa

    // c1.tampar();
    c1.status(); // referencia metodo
    c1.rabiscar();

    System.out.println();

    Caneta c2 = new Caneta();
    c2.modelo = "vic";
    c2.cor = "Vermelho";
    // c2.ponta = 0.2;

    c2.destampar();
    c2.status();
    c2.rabiscar();
  }

}
