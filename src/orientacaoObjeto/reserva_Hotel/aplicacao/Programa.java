package orientacaoObjeto.reserva_Hotel.aplicacao;

import java.util.Scanner;

import orientacaoObjeto.reserva_Hotel.entidades.Reserva;

/* Reserva de hotel:
 * Nome cliente, data de check-in e data de check-out
 * quando o usuario digita uma data, temque ser uma variavel string para receber nao só numeros inteiros mas também o /,
 * logo, o simpleDateFormat , permite que peguemos esses dados de entrada  com uma formataçao atequada para data;
 *SimpleDateFormat: Usado para formatar as datas de entrada do usuário, transformando-as em objetos Date.
 * */

public class Programa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Numero da reserva: ");
    int numeroReserva = sc.nextInt();
    System.out.println("Data de check-in: ");
    String dataCheckIn = sc.next();
    System.out.println("Data de check-out: ");
    String dataCheckOut = sc.next();

    // Envia dados ao criar a instância de Reserva
    Reserva reserva = new Reserva(numeroReserva, dataCheckIn, dataCheckOut);

    // Recebe dados ao chamar o método verificaReserva()
    String imprimirRetorno = reserva.verificaReserva();

    System.out.println("Reserva: " + imprimirRetorno);

    sc.close();
  }

}
