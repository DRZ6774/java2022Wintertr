package day03_scanner;

import java.util.Scanner;

public class C04_Scanner_Calısma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kullanıcı adı giriniz");
        String kullanıcı=scan.next();

        System.out.println("kullanıcı = " + kullanıcı);

    }
}
