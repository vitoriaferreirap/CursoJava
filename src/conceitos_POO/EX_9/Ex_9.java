package conceitos_POO.EX_9;

/*Interface e Implementação 
 * Interfaces: são usadas para definir um conjunto de métodos, é um tipo especial de classe que não pode ter implementação de métodos (exceto métodos padrão ou estáticos).
 * Não se pode criar um objeto diretamente de uma interface. V
*/

public class Ex_9 {
  public static void main(String[] args) {

    Moto moto = new Moto();
    Carro carro = new Carro();

    moto.acelerar();
    carro.acelerar();// classe carro e moto implementam o metodo que foi declarado na inrterface

  }

}
