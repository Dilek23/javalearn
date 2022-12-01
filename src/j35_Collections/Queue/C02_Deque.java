package j35_Collections.Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {
        /*
        deque: doublle ended Queue-> Queue lerde FİFO deque'lerde hem FİFO hem LİFO gecerli
        LİFO: Last in Fisrt out
         */
        Deque<String>dq1= new LinkedList<>(Arrays.asList("küşleme","önKol","börek yatagi","ezme"));
        System.out.println("dq1 = " + dq1);
        dq1.add("humus");// linkedlisti humusu sona ekler
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.getFirst() = " + dq1.getFirst());
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.getLast() = " + dq1.getLast());
        System.out.println("dq1 = " + dq1);

        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());
        System.out.println("dq1 = " + dq1);

        System.out.println("dq1.peekLast() = " + dq1.peekLast());
        System.out.println("dq1 = " + dq1);
        /*
        TRİCK: getFirst metod deque coll. boş ise exception fırlatır
        peekfirst metod boş ise null return eder
         */
        dq1.clear();
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());
      //  System.out.println("dq1.getFirst() = " + dq1.getFirst());RTE verir
        System.out.println("Applications run oldu ");


        Deque<String>dq2= new LinkedList<>(Arrays.asList("trileçe","kazandibi","börek yatagi","ezme"));
        System.out.println("dq2.poll() = " + dq2.poll());

        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());

        System.out.println("dq2.pollLast() = " + dq2.pollLast());

        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());

        System.out.println("dq2.removeLast() = " + dq2.removeLast());

    }

}
