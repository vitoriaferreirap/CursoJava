package lista_7;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/*
 * Usando API java.time, para manipular datas e horários de forma eficiente e sem problemas de fuso horário.
 * Instant - Representa um ponto específico no tempo atual.
 * LocalDate - Representa apenas datas: dia/mes/ano dd/MM/yyyy. Não trabalho com horários
 * DateTimeFormatter - Permite formatar e converter datas para diferentes padrões
 * Z - está no horário de Greenwich 
 * parse() - Método é utilizado para converter uma string em um objeto de data/hora.
 * .withZone(ZoneId.systemDefault()) - Converte a data para o fuso horário do sistema local
 */
public class Exercicio_1 {
  public static void main(String[] args) {

    LocalDate horaLocal = LocalDate.now();
    LocalDateTime horaLocal2 = LocalDateTime.now();

    System.out.println("Hora local: " + horaLocal.toString());
    System.out.println("Hora local 2: " + horaLocal2);

    Instant dataLondresGnt = Instant.now();
    System.out.println("Hora Londres GNT: " + dataLondresGnt);

    Instant fusoBrasil = Instant.parse("1998-04-06T12:00:30-03:00");
    System.out.println("Hora com fuso Brasil, transformado: " + fusoBrasil);

    DateTimeFormatter formatarData1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate dataInterpretada = LocalDate.parse("06/04/1998", formatarData1);
    System.out.println("Formatando formato da data: " + dataInterpretada);

    DateTimeFormatter formatarData2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    LocalDate dataInterpretada2 = LocalDate.parse("06/04/1998 13:00", formatarData2);
    System.out.println("Formatando formato da data 2: " + dataInterpretada2);

    LocalDate dataIsolado = LocalDate.of(1998, 04, 6);
    System.out.println("Dados isolados: " + dataIsolado);

    // fazendo converçao ISO para String
    LocalDate convercaoIso = LocalDate.parse("1998-04-06");
    DateTimeFormatter formDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println("Dados convertidos de padrao ISO para String: " + formDate.format(convercaoIso));

    // formartar data/hora, considerando o fuso horário do sistema local do pc
    Instant dataFuso = Instant.parse("2025-03-12T15:00:00Z");
    DateTimeFormatter formDate2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
    System.out.println("Data + fuso horário: " + formDate2.format(dataFuso));
  }
}