package day03_scanner;

import java.util.Scanner;

public class C07_Scanner_Calısma {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lütfen isminizin bas harfini giriniz");
        String basHarf= scan.next();
        System.out.println("isim -basHarf : " + isim + " " + basHarf);
    }
}
