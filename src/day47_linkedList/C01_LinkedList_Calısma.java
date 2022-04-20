package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList_Calısma {
    public static void main(String[] args) {

        LinkedList<Integer> ll1 = new LinkedList<>();

        ll1.add(10);  //ekler
        System.out.println(ll1); //[10]   add ekleme

        // Sadece List interface'inden ozellikler kullanmak istersek
        List<Integer> ll2 = new LinkedList<>();
        ll2 .add(10); //[10] ekler
        ll2.remove(0); // 0. indeksi siler

        Deque<Integer> ll3 = new LinkedList<>();
        ll3.addLast(20); //[15, 20]  sona ekler
        ll3.addFirst(15); //[15, 20] basa ekler
        System.out.println(ll3);
        ll3.addLast(40); //[15, 20]
        System.out.println(ll3); //[15, 20, 40] sona ekler

          }
}
