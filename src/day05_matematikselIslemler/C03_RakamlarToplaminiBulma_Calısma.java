package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma_Calısma {

    // kullanicidan aldiginiz 4 basamakli bir sayinin
    // basamaklardaki rakamlar toplamini bulunuz

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("4 basamaklı bir sayı giriniz");
        int sayi=scan.nextInt();

        int rakam=0;
        int rakamlarToplami=0;
        //sayi=7532 olsun

        rakam=sayi%10;  //2
        rakamlarToplami+=rakam;  //2
        sayi/=10; //753

        rakam=sayi%10; //3
        rakamlarToplami+=rakam;  //3+2=5
        sayi/=10;  //75

        rakam=sayi%10; //5
        rakamlarToplami+=rakam; //5+5=10
        sayi/=10; //7

        rakam=sayi%10; //7
        rakamlarToplami+=rakam;  //7+10=17
        sayi/=10; //7/10=0,7 ==> 0

        System.out.println(rakamlarToplami);


    }


}
