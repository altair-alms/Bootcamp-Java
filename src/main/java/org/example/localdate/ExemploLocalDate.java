package org.example.localdate;

import java.time.LocalDateTime;
import java.time.LocalDate;


public class ExemploLocalDate {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println("Dia da Semana " + date.getDayOfWeek().name() );
        System.out.println("Mes: " + date.getMonthValue());
        System.out.println("Mes: " + date.getMonth());
        System.out.println("Ano: " + date.getYear());
        System.out.println("Hora: " + date.getHour());
        System.out.println("Minutos: " + date.getMinute());
        System.out.println("Segundos: " + date.getSecond());


        LocalDate outraData = LocalDate.of(2025,3,26);
        System.out.println(outraData);
        System.out.println(outraData.isLeapYear());
        System.out.println(outraData.lengthOfMonth());








    }
}
