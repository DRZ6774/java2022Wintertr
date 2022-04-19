package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime_Calısma {
    public static void main(String[] args) {

        LocalDateTime tarihSaat1= LocalDateTime.now(); //şimdiki tarih ve saati verir
        System.out.println(tarihSaat1);   //2022-04-02T12:16:52.924088500

        System.out.println(tarihSaat1.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5)); //2025-06-12T17:24:27.521401600

    }
}
