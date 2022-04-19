package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_iterator_Calısma {
    public static void main(String[] args) {


        List<Integer> liste=new ArrayList<Integer>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);

        Iterator itr=liste.iterator();

        System.out.println(itr.hasNext()); // true  (yanında element varmı)

        System.out.println(itr.next()); //5    (ataldıgı elemanı yazdırır)

        System.out.println(itr.next());  //7

        System.out.println(itr.next());  //8

        System.out.println(itr.next());  //6

        System.out.println(itr.next());  //9

        itr.remove(); //üst üste iki defa remove kullanılamaz
        System.out.println(liste);  //[5, 7, 8, 6]   (itr yanındakini sildi)








    }
}
