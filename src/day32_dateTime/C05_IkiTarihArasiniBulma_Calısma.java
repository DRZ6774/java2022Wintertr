package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma_Calısma {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dogumgunu=LocalDate.of(1987,07,20);
        System.out.println(Period.between(dogumgunu,bugun));  //P34Y8M14D

        System.out.println(Period.between(dogumgunu,bugun).getYears()); //34



    }
}
