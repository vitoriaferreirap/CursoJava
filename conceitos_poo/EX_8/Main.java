package conceitos_poo.EX_8;

/*Herança e Polimorfismo
Crie uma classe base chamada Animal e duas subclasses (Cachorro e Gato).
Requisitos:
-Animal tem um método fazerSom() (pode ser abstrato).
-Cachorro sobrescreve esse método e imprime "O cachorro late!".
-Gato sobrescreve esse método e imprime "O gato mia!".
*/
public class Main {
  public static void main(String[] args) {

    // criando objtos
    Cachorro cachorro = new Cachorro("DUDU");
    Gato gato = new Gato("BIBI");

    cachorro.informacaoAnimal();
    cachorro.fazerSom();

    gato.informacaoAnimal();
    gato.fazerSom();
  }
}
