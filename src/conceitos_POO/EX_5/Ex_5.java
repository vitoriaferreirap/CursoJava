package conceitos_POO.EX_5;

import java.util.Scanner;

public class Ex_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String marcaCarro = sc.next();
    String modeloCarro = sc.next();
    int anoCarro = sc.nextInt();

    // instanciando minha classe e criando meu objeto, manda os args para o
    // construtor
    Carro carro1 = new Carro(marcaCarro, modeloCarro, anoCarro);
    carro1.exibirInformacao();

    Carro carro2 = new Carro(marcaCarro, modeloCarro, anoCarro);
    carro2.marca = "Volkswagen";
    carro2.modelo = "Gol";
    carro2.ano = 2010;

    carro2.exibirInformacao();

    sc.close();

  }
}
