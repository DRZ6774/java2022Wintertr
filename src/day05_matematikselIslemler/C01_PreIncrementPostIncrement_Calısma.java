package day05_matematikselIslemler;

public class C01_PreIncrementPostIncrement_Calısma {

    public static void main(String[] args) {

        int sayi=10;

        sayi++;

        System.out.println(sayi);  //11

        sayi++;

        System.out.println(sayi);  //12

        sayi=sayi++;

        System.out.println(sayi); //12

        sayi=++sayi;

        System.out.println(sayi); //13



    }
}
