package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash_Calısma {
    public static void main(String[] args) {

        String str1= "Java cok guzel";
        System.out.println(str1.hashCode());  //-481588044

        String str2= "Hava cok guzel";
        System.out.println(str2.hashCode()); //529529206

        Set<Integer> sayiKümesi = new HashSet<>();

        System.out.println(sayiKümesi.hashCode()); //0



        sayiKümesi.add(10);
        System.out.println(sayiKümesi.hashCode()); //10

        sayiKümesi.add(20);
        System.out.println(sayiKümesi.hashCode()); //30
    }
}
