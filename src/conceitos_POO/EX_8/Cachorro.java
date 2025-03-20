package conceitos_POO.EX_8;

//herdando classe animal com extends
public class Cachorro extends Animal {
  public Cachorro(String nomeAnimal) {
    super(nomeAnimal);
  }

  public void fazerSom() {
    System.out.println("AUAU");
  }

}
