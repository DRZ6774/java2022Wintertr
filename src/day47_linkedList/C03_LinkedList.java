package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {


        Deque<Integer> ll1=new LinkedList<>();

        //System.out.println(ll1.element()); //excepsion fırlatır

        System.out.println(ll1.peek()); //nul

        System.out.println(ll1.poll()); //null
        System.out.println(ll1.pollLast()); //null
        System.out.println(ll1.pollFirst()); //null

        // System.out.println(ll1.pop()); ekception fırlatır

        ll1.push(30);
        ll1.push(20);
        System.out.println(ll1); //[20, 30]

        System.out.println(ll1.remove());

        ll1.push(40);
        ll1.push(50);
        ll1.remove(50);
        ll1.push(30); //[30, 40, 30]
        System.out.println(ll1);
        ll1.removeLastOccurrence(30);
        System.out.println(ll1); //[30, 40]

    }
}
