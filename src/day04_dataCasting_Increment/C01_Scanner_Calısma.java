package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner_Calısma {
    public static void main(String[] args) {
        // Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz");
        char harf=scan.next().charAt(0);

        System.out.println("harf = " + harf);
    }
}
