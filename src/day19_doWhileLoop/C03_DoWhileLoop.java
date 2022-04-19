package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan pozitif tamsayı alıp
        // While ile sayıdan kücük pozitif tamsayıları yazdırın

        int input=3;
        int sayı=1;


        while(sayı<input){
            System.out.println(sayı);
            sayı++;
        }

     //aynı soruyu do while ile ile yapın

        sayı=1;


        do {
            System.out.println(sayı);
            sayı++;
        }while(sayı<input);

    }
}
