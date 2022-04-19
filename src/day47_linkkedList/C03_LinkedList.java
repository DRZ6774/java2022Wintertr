package day47_linkkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList  {
    public static void main(String[] args) {

        Deque<Integer> ll1=new LinkedList<>();

        System.out.println(ll1.peek());

        //System.out.println(ll1.element());

        System.out.println(ll1.poll());
        System.out.println(ll1.pollFirst());
        System.out.println(ll1.pollLast());

        //ll1.pop();

        ll1.push(30);
        ll1.push(20);
        System.out.println(ll1);

        ll1.remove();
        System.out.println(ll1);

        ll1.push(40);
        ll1.push(50);
        ll1.remove(50);
        System.out.println(ll1);

        ll1.push(30);
        System.out.println(ll1);

        ll1.removeLastOccurrence(30);
        System.out.println(ll1);



    }
}
