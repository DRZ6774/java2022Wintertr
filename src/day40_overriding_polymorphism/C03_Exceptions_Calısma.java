package day40_overriding_polymorphism;

import java.util.Scanner;

public class C03_Exceptions_Calısma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int kontrol=0;
        while (kontrol !=2){System.out.println("Bölmek istediğiniz sayıyı yazınız");
            int sayı1=scan.nextInt();

            System.out.println("Kaca bölmek istediğiniz sayıyı yazınız");
            int sayı2=scan.nextInt();

            try {
                System.out.println("sonuc = "+sayı1/sayı2);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
            }

            System.out.println("devam etmek için 1\nbitirmek için 2 ye basın");
            kontrol= scan.nextInt();
        }

       /* if (sayı2==0){
            System.out.println("Sayı /0 tanımsızdır");
        }else
        System.out.println("sonuc = "+sayı1/sayı2);
*/
    }

}
