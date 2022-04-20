package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList_Calısma {
    public static void main(String[] args) {

        Deque<Integer> ll1=new LinkedList<>();
        ll1.addFirst(10); // basa ekler
        ll1.addLast(20); // sona ekler
        System.out.println(ll1);//[10, 20]

        System.out.println(ll1.element()); // ilk elementi getirir
        System.out.println(ll1); //10

        System.out.println(ll1.getLast()); //20 son element
        System.out.println(ll1.getFirst()); //10 ilk element

        ll1.offer(30);
        System.out.println(ll1 ); //[10, 20, 30] sona ekledi
        ll1.offerLast(40);
        System.out.println(ll1 ); //[10, 20, 30, 40] sona ekledi
        ll1.offerFirst(50);
        System.out.println(ll1 ); //[50, 10, 20, 30, 40] basa ekledi

        System.out.println(ll1.peek()); //50

        System.out.println(ll1.poll()); //50


    }
}
