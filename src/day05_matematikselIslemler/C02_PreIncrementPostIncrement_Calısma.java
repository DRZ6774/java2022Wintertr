package day05_matematikselIslemler;

public class C02_PreIncrementPostIncrement_Calısma {

    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++;

        System.out.println(sayi2); //10
        System.out.println(sayi1); //11

        sayi3=++sayi1;

        System.out.println(sayi3); //12
        System.out.println(sayi1);  //12
    }
}
