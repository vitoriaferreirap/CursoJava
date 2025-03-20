package conceitos_POO.EX_8;

public class Gato extends Animal {
  public Gato(String nomeAnimal) {
    super(nomeAnimal);// é utilizado para chamar o construtor da classe pai (superclasse).
  }

  public void fazerSom() {
    System.out.println("MIAU");
  }

}
