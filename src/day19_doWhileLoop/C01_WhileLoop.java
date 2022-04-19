package day19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        int input=20;

        int bolen=1;
        int sayac=0;

        while(bolen<=input){
            if (input% bolen==0){
                System.out.print(bolen +" ");
                sayac++;
            }
            bolen++;
        }
        System.out.println("");
        System.out.println(input + " sayısını bolen " + sayac +" adet sayı vardır");

    }
}
