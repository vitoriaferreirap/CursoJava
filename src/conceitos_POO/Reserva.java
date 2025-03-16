package conceitos_POO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reserva {
  public Date checkIn;
  public Date checkOut;
  public int codigoReserva;

  SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");

  public void status() {
    System.out.println("Codigo de reserva: " + this.codigoReserva);
    System.out.println("Check-In:" + formatarData.format(this.checkIn));
    System.out.println("Check-Out:" + formatarData.format(this.checkOut));

  }

  // Métodos para definir as datas recebendo String e convertendo para Date
  public void setCheckIn(String data) {
    try {
      this.checkIn = formatarData.parse(data);
    } catch (ParseException e) {
      System.out.println("Erro ao converter a data de Check-In!");
    }
  }

  public void setCheckOut(String data) {
    try {
      this.checkOut = formatarData.parse(data);

      if (!checkOut.after(checkIn)) {
        System.out.println("Data de checkout precisa ser posterior a do checkin");
      } else if (checkOut.after(checkIn)) {
        System.out.println("Reserva finalizada.");
      }

    } catch (ParseException e) {
      System.out.println("Erro ao converter a data de Check-Out!");
    }
  }

}