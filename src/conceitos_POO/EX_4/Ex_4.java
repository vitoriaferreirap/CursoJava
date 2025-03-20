package conceitos_POO.EX_4;

public class Ex_4 {
  public static void main(String[] args) {

    Reserva r1 = new Reserva();
    r1.codigoReserva = 111;
    r1.setCheckIn("16/03/2025");// chamando um metodo e passando um dado como argumento
    r1.setCheckOut("18/03/2025");

    r1.status();

    System.out.println();

    Reserva r2 = new Reserva();
    r2.codigoReserva = 131;
    r2.setCheckIn("16/03/2025");
    r2.setCheckOut("16/03/2025");

    r2.status();

    System.out.println();

    Reserva r3 = new Reserva();
    r3.codigoReserva = 101;
    r3.setCheckIn("18/03/2025");
    r3.setCheckOut("16/03/2025");

    r3.status();

  }
}