package day32_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter_Calısma {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println(tarihSaat);  //2022-04-03T01:00:38.194192100

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(formatter.format(tarihSaat));  //03/04/2022

        DateTimeFormatter formatterSaat=DateTimeFormatter.ofPattern("HH:mm:ss: a");
        System.out.println(formatterSaat.format(tarihSaat));  //01:13:22: ÖÖ

    }
}
