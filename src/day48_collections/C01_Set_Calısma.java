package day48_collections;

import java.util.HashSet;
import java.util.Set;

public class C01_Set_Calısma {
    public static void main(String[] args) {

        // verilen bir array'in tekrar eden elementlerini
        // sadece bir kere yazdiran bir method olusturun

        Integer arr[]= {3,5,4,6,3,1,2,7,8,6,1,4,2,8};
        arayiTekrarsizYazdir(arr);
    }

    private static void arayiTekrarsizYazdir(Integer[] arr) {

        Set<Integer> tekrarsızElementKümesi = new HashSet<>();

        for (Integer each:arr
             ) {
            tekrarsızElementKümesi.add(each);
        }
        System.out.println(tekrarsızElementKümesi);  //[1, 2, 3, 4, 5, 6, 7, 8]
    }
}
