package day06_concatenation_Operators;

public class C01_Concatenation_Calısma {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;

        System.out.println(str1+sayi1+str2); //Java5Guzel

        System.out.println((sayi1-sayi2)+str2+sayi1*sayi2);  //2Guzel15

        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));  // Java22

        System.out.println(sayi1+(sayi2+str2));  // 53Guzel



    }

}
