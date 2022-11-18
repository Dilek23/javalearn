package j35_Collections;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("Tugba","Gülsüm","Merve","Ebubekir","javacan"));
      // LinkedList remove...
        System.out.println("ll1 = " + ll1);
        System.out.println("ll1.remove() = " + ll1.remove());
        System.out.println("ll1 = " + ll1);

        System.out.println("ll1.remove(3) = " + ll1.remove(3));
        System.out.println("ll1 = " + ll1);

        System.out.println("ll1.remove(\"Merve\") = " + ll1.remove("Merve"));// eleman varsa true
        System.out.println("ll1.remove(\"javatar\") = " + ll1.remove("javatar"));// olmayan eleman için flse
        System.out.println("ll1 = " + ll1);


        ll1.removeFirstOccurrence("Ebubekir");
        System.out.println("ll1 = " + ll1);
        System.out.println("ll1.element() = " + ll1.element());// ilk node return eder


        LinkedList<String> ll2=new LinkedList<>(Arrays.asList("Tugba","Gülsüm","Merve","Ebubekir","javacan"));
        LinkedList<String> ll3=new LinkedList<>(Arrays.asList("Hsan","Harun","Haluk"));
        ll2.addAll(ll3);
        System.out.println("ll2 = " + ll2);
        System.out.println("ll2.remove(ll3) = " + ll2.removeAll(ll3));
        System.out.println("ll2 = " + ll2);

        System.out.println("ll2.get(2) = " + ll2.get(2));
        System.out.println("ll2.getFirst() = " + ll2.getFirst());
        System.out.println("ll2.getLast() = " + ll2.getLast());
        System.out.println("ll3.getLast() = " + ll3.getLast());


    }
}
