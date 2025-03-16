package conceitos_POO;

/*
 * Minha classe com o metodo principal main
 * Instanciando: criando um objeto da classe Caneta
 * interligando nosso objeto com os atibutos da classe Caneta
 */
public class Ex_1 {
  public static void main(String[] args) {

    Caneta c1 = new Caneta();
    c1.modelo = "bic";
    c1.cor = "Azul";
    c1.ponta = 0.5;// referencia a atributo

    c1.tampar();
    c1.status(); // referenci a metodo
    c1.rabiscar();

    System.out.println();

    Caneta c2 = new Caneta();
    c2.modelo = "vic";
    c2.cor = "Vermelho";
    c2.ponta = 0.2;

    c2.destampar();
    c2.status();
    c2.rabiscar();
  }

}
