package conceitos_poo.EX_8;

/*É uma superclasse: é abstrata porque não precisa ter uma implementação concreta de todos os métodos
 * Outras classes irao herdar atributos e métodos daqui.
 * abstract = A classe Animal é abstrata, o que significa que ela não pode ser instanciada diretamente. Ou seja, você não pode criar um objeto do tipo Animal.
 * método fazerSom() é abstrato porque a classe Animal não sabe como o som de um animal deve ser feito — isso vai depender do tipo de animal.
 * Animal define a assinatura do método (public abstract void fazerSom();), mas não implementa o comportamento. Isso fica a cargo das classes que herdam de Animal.
 * Método abstrato fazerSom(): Embora a classe Animal não tenha um comportamento para o método fazerSom(), ela declara que todas as subclasses devem ter esse método. 
 */
abstract class Animal {

  public String nome;

  public Animal(String nomeAnimal) {
    this.nome = nomeAnimal;
  }

  public abstract void fazerSom();

  public void informacaoAnimal() {
    System.out.println(nome);

  };

}
