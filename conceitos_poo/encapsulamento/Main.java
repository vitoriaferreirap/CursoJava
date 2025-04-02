package conceitos_poo.encapsulamento;

public class Main {
  public static void main(String[] args) {
    // Instânciando classe controleRemoto e criando meu objeto
    ControleRemoto controle1 = new ControleRemoto();
    controle1.ligar();
    controle1.maisVolume();
    controle1.ligarMudo();
    controle1.abrirMenu();

  }
}