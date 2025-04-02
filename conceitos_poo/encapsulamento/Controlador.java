package conceitos_poo.encapsulamento;

//somente metodos e sempre abstratos
interface Controlador {
  public abstract void ligar();

  public abstract void desligar();

  public abstract void abrirMenu();

  public abstract void desligarMenu();

  public abstract void maisVolume();

  public abstract void menorVolume();

  public abstract void ligarMudo();

  public abstract void desligarMudo();

  public abstract void play();

  public abstract void pause();
}