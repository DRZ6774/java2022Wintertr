package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException_Calısma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasınızı giriniz");
        int yas= scan.nextInt();

        if (yas<=0 || yas>120){
           //System.out.println("Lütfen gecerli bir yas giriniz");
            throw new IllegalArgumentException();
        }else{
            System.out.println("uygun yas girdiniz tesekkur edriz");
        }
    }
}
