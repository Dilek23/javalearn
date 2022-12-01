package j35_Collections.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {
        /*
        Queue coll interface oldugu için child class olan lisnkedlist ve priorityQueue
        ile obje uretilir. eczane yemekhane vs belirli sart ile aksiyon olan elamnlar için kulllanılır.cons. secimine göre queue
        obj özellikleri belirlenir
        FİFO
         firts in firs out->ilk giren eleman ilk çıkar

         */
        Queue<String> q1 = new LinkedList<>(Arrays.asList("Cebrail", "Sumeyra", "Dilek", "Muharrem"));
        System.out.println("q1 = " + q1);// [Cebrail, Sumeyra, Dilek, Muharrem]
        q1.add("Erol");
        System.out.println("q1 = " + q1);//Cebrail, Sumeyra, Dilek, Muharrem, Erol]

        Queue<String> q2 = new PriorityQueue<>(Arrays.asList("javaCan", "javaSu", "javaNaz"));
        System.out.println("q2 = " + q2);//[javaCan, javaSu, javaNaz]
        q2.add("java");
        System.out.println("q2 = " + q2); //[java, javaCan, javaNaz, javaSu]
        System.out.println("q1.element() = " + q1.element());// ilk elemanı verir
        System.out.println("q1.peek() = " + q1.peek());//ilk elemanı verir

        System.out.println("q1.remove() = " + q1.remove());// ilk elemanı kaldırır bu sıra boşsa exception verir
        System.out.println("q1.poll() = " + q1.poll());// ilk elemanı kaldırır bu sıra boşsa null degeri verir

// peeek() copy paste gibi ilk elemanı return eder ama silmez
        // pool-> cut pate gibi ilk elemanı siler ve return edeer
        //element()-> ilk elemanı silmeden return eder
        // ilk elemanı siler ve return eder.
        // pool ve remove farkı -> eger q ueue boş ile exc. fıratır. remove null return

        q1.clear();
        System.out.println("q1 = " + q1);
        System.out.println("q1.size() = " + q1.size());
        System.out.println("q1.poll() = " + q1.poll());
        System.out.println("q1 = " + q1);
       // System.out.println("q1.remove() = " + q1.remove());//.NoSuchElementException hatası fırlattı

        //offer()-> eleman eklemek için kullanılır
        System.out.println("q2.offer(\"küşleme\") = " + q2.offer("küşleme"));
// Trick: offer ve add farkı-> eger queue coll. elemen kısıtlaması yapışmıs ie moetod exc. fırlatır.offer ise true false return eder.

    }
}
