package day40_overriding_polymorphism;

public class C04_Exceptions_Calısma {

    public static void main(String[] args) {


        String str = "1234a";







        try {
            int sayi = Integer.parseInt(str);
            System.out.println("girilen sayının iki katı : "+sayi*2);
        } catch (Exception e) {
            System.out.println("giridiğiniz elemanlarda string ifade var");;
        }

    }
}