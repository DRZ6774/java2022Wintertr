package day03_scanner;

import java.util.Scanner;

public class C06_Scanner_Calısma {
    public static void main(String[] args) {

        // Soru 6) Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
        //		Isim – soyisim : Mehmet Bulutluoz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isim ve soyisim giriniz");
        String isim = scan.next();
        String soyisim = scan.next();

        System.out.println("isim = " + isim+"  soyisim = " + soyisim);

    }
}
