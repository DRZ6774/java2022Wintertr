package day16_methodCreation;





public class C03_Overloading {
    public static void main(String[] args) {
        // verilen iki sayiyi toplayip yazdiran bir method olusturalim
        int sayi1 = 10;
        int sayi2 = 20;

        ikiSayiToplam(sayi1, sayi2);

        //iki double sayının toplamını yazdıran bir method olusturalım

        double sayı3 = 15.2;
        double sayı4 = 10.3;
        ikiSayiToplam(sayı3,sayı4);


        ikiSayiToplam(15,25);    //40   double secmemize ragmen iki int sayıyı topladı

        ikiSayiToplam(10.2,10.3);  //20.5   int secmemize ragmen yine topladı java akıllı

        //bir integer ile bir double sayının toplamını yazdıran bir method olusturalım

        int sayı5=3;
        double sayı6=3.2;


        ikiSayiToplam(sayı5,sayı6);    //6.2   data casting auto widening


    }


    private static void ikiSayiToplam(int sayı3, double sayı4) {
        System.out.println("bir integer bir double toplamı :" +(sayı3+sayı4));

    }
    private static void ikiSayiToplam(double sayı3, double sayı4) {
        System.out.println("iki double toplamı :" +(sayı3+sayı4));
    }


    private static void ikiSayiToplam(int sayi1, int sayi2) {
        System.out.println("iki integer toplamı :" +(sayi1+sayi2));
    }
}
