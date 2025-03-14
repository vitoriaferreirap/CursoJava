package orientacaoObjeto.reserva_Hotel.entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Os métodos after() e before() são usados para comparar objetos do tipo Date em Java. 
 * Eles verificam se uma data ocorre depois (after) ou antes (before) de outra data.
 */
import java.util.concurrent.TimeUnit;

public class Reserva {

  private Integer numeroReserva;
  private Date checkIn;
  private Date checkOut;

  SimpleDateFormat formatarStringData = new SimpleDateFormat("dd/MM/yyyy");

  public Reserva() {
  }

  /*
   * O construtor recebe os dados passados como argumentos ao criar o
   * objeto(instância) e liga esses dados aos atributos da classe
   */
  public Reserva(int numeroReserva, String dataCheckIn, String dataCheckOut) {
    try {
      this.numeroReserva = numeroReserva;
      this.checkIn = formatarStringData.parse(dataCheckIn);
      this.checkOut = formatarStringData.parse(dataCheckOut);/*
                                                              * O argumento 'dataCheckIn' é convertido para Date e
                                                              * atribuído ao atributo 'checkOut'
                                                              */
    } catch (ParseException e) {
      System.out.println("Erro ao processar a data." + e.getMessage());
    }
  }

  public String verificaReserva() {
    long qtdDias;

    if (!checkOut.after(checkIn)) {
      return "Data do check-out precisa ser posterior a do check-in";
    } else if (checkOut.after(checkIn)) {
      return "Data do check-out é APÓS o check-in";
    } else {

    }

  }
}
