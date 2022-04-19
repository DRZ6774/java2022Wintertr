package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate_Calısma {
    public static void main(String[] args) {

        LocalDate tarih=LocalDate.now();           //objenn olustugu tarih
        System.out.println(tarih );                //2022-04-02
        LocalDate tarih2=LocalDate.of(1987,7,20); //istedğimiz yıl ay gun olusturur
        System.out.println(tarih2);                 //1987-07-20

        //get metodu ile tarih detayları alınır

        System.out.println(tarih2.getDayOfMonth());  // 20     ayın gününü verir
        System.out.println(tarih2.getDayOfWeek());  // Monday     haftanın gününü verir
        System.out.println(tarih2.getMonthValue());  // 7    ayı verir
        System.out.println(tarih2.getYear());  // 1987    yılı verir

        //bir tarihten istediğimiz kadar ileri geri gidebiliriz

        System.out.println(tarih.minusWeeks(20));  //2021-11-13        20 hafta öncesi
        System.out.println(tarih.minusWeeks(5).minusDays(3));  // 2022-02-23       5 hafta 3 gün öncesi

        System.out.println(tarih.plusMonths(9).plusDays(10));//2023-01-12     9 ay 10 gün sonrası

        //tarih dile göre istediğimiz tarihini elde etmek istersek

        LocalDate tarihZone=LocalDate.now(ZoneId.of("Japan"));
        System.out.println(tarihZone);    //2022-04-02      japonyada tarih

        LocalDate tarihZone1=LocalDate.now(ZoneId.of("Turkey"));
        System.out.println(tarihZone);    //2022-04-02      türkiyede tarih

        //is ile baslayan metholar bolean olarak döner
        System.out.println(LocalDate.now().isLeapYear()); //false    bu yıl subat 28 cekti 29 olsa idi true verirdi


        System.out.println(tarih.isAfter(tarih2));  //true   tarih 2 tarih birin öncesinde

        LocalDate tarih3=LocalDate.of(1897,7,20);
        LocalDate tarih4=LocalDate.of(1899,2,15);
        System.out.println(tarih3.isAfter(tarih4));  //false  sonrasında degıldır
        System.out.println(tarih4.isAfter(tarih3));  //true   sonrasındadır

    }
}
