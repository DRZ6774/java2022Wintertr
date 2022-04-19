package day40_overriding_polymorphism;

import java.util.Scanner;

public class C05_Exception_Calısma {

    // Kullanicidan istedigi kadar sayiyi alip toplayan bir program yaziniz
    // toplam 500'u gecerse programi bitirsin veya
    // kullanici bitirmek istediginde Q'ya basmalidir

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        do{
            System.out.println("Lütfen toplamak istediğiniz sayıyı giriniz\n bitirmak için Q ya basınız");
            int sayi= 0;
            try {
                sayi = scan.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }
            toplam+=sayi;
        }while (toplam<500);


    }
}