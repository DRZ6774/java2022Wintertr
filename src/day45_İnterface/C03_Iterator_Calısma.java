package day45_İnterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03_Iterator_Calısma {

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        System.out.println(liste);

        for (Integer each:liste
             ) {
            each=each+2;
        }
        System.out.println(liste);

        Iterator itr=liste.iterator();




    }

}
