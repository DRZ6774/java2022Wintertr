package day09_ternary_Switch;

import java.util.Scanner;

public class C02__Ternary {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz");
        int sayı=scan.nextInt();

        if (sayı%2==0){
            System.out.println("sayı çift");
        }else {
            System.out.println("sayı tek");
        }

        System.out.println(sayı%2==0 ? "sayı çift" : "sayı tek");








    }}
