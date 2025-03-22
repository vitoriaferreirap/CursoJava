package conceitos_poo.EX_10;

public class Main {
  public static void main(String[] args) {
    Prateleira p1 = new Prateleira("NIC", 1.50, "AMARELA");

    // acessando direto o atributo p1.modelo = "Bic";
    // acessando com metodo acessor passando o dado para o arg do meu set
    // p1.setModelo("BIC");
    // p1.setAltura(1.50);

    p1.status();
    System.out.println("Modelo da prateleira: " + p1.getModelo());

  }
}
