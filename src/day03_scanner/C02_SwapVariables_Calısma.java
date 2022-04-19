package day03_scanner;

public class C02_SwapVariables_Calısma {
    public static void main(String[] args) {
         /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        bir program yaziniz
	     Orn 	: sayi1=10 ve sayi2=20;
		  kod calistiktan sonra
		 sayi1=20 ve sayi2=10

         */

        int sayi1=10;
        int sayi2=20;
        int tempsayi;

        tempsayi=sayi1;
        sayi1=sayi2;
        sayi2=tempsayi;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
    }
}
