package day05_matematikselIslemler;

public class C05_WrapperClass_Calısma {
    public static void main(String[] args) {

        short sayi=20;
        Short sayi2=30;

        sayi=sayi2;

        System.out.println(sayi);  //30

        System.out.println(Short.MAX_VALUE); //32767
        System.out.println(Short.MIN_VALUE); //-32768
        System.out.println(Short.BYTES);  //2 Byte


    }
}
