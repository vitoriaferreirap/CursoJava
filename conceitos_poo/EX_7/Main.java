package conceitos_poo.EX_7;

/*Relacionamento Entre Classes
 * A classe Pessoa deve ter nome e idade.
 * Deve ter um atributo do tipo Carro.
 *  -Atributo do tipo Carro significa que eu estou criando um objeto dentro de outro objeto.
 *  -O valor desse atributo é um objeto da classe Carro.
 *
 */
public class Main {
  public static void main(String[] args) {

    // instanciando e criando objetos das classes
    // argumentos passados para os args do contrutor
    Carro carro = new Carro("Volks", "Gol", 2010);
    Pessoa pessoa = new Pessoa("Vitoria", 26, carro);

    pessoa.mostrarDadosPessoa();// chama classe pessoa
  }

}
