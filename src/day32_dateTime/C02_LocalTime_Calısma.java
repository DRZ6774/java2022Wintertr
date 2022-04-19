package day32_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime_Calısma {
    public static void main(String[] args) {

        LocalTime saat1=LocalTime.now();
        System.out.println(saat1);  //12:05:16.759880900

        int sayi=0;
        for (int i = 0; i <100000; i++) {
            sayi+=i;
        }
        LocalTime saat2=LocalTime.now();
        System.out.println(saat2);  //12:05:16.759880900

        //ileri veya geriye gidebiliriz
        System.out.println(saat1.plusMinutes(1000));  //04:34:44.721511   1000 dk önce

        //zonid kullanarak istedğimiz ülkenn saatini öğrenebiliriz

        LocalTime saat3=LocalTime.now(ZoneId.of("Japan"));
        System.out.println(saat3);    //17:59:43.729438400     japonyada saat

    }
}
