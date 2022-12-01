package j35_Collections;

import java.util.Arrays;
import java.util.LinkedList;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
        LinkedList.....
        1- LindkedListte elemanlar data  ve adres olamak üzere 2 kısımdan oluşur ve eleman yerine node olarak tanımlanır
        2- LindkedListte ilk node data barındırmayan sadece adres bulunduran head node tanımlanmıştır
        3- LindkedListte son node adres barındırmayan adres kısmı null olan sadece data  barındıran tail noed tanımlanmıştır
        4- ArrayLisst search,ng Linkedlist eleman bulmada ve eklemede daha basarılıdır Linkedlist eleman bulmada index yapısı olmadıgı için
        5- LindkedListte tren vagon bağlantısı vardır
        6- Collection obje tanımlanırken cons Clas(LinkedList,ArrayList...olmalı interface(Lİst,Qeue..) olmamasına dikkat edilmeli ancak obj DataType olarak
        parent interface tanımlanabilir.
        7- LinkedList class iki tane parent interface'den (ListQueue)implement etmiştir.S
         */

        LinkedList<String>ll1=new LinkedList<>(Arrays.asList("Tugba","Gülsüm","Merve","Tugba"));
        // Linkedlist
        System.out.println("ll1 = " + ll1);
        ll1.add("Ugur");
        System.out.println("ll1 = " + ll1);

   ll1.add(2,"Ragıp");
        System.out.println("ll1 = " + ll1);
        ll1.addFirst("Javacan");
        System.out.println("ll1 = " + ll1);
        ll1.addLast("Yasin");
        System.out.println("ll1 = " + ll1);
      LinkedList<String>ll2=new LinkedList<>(Arrays.asList("Fatih","Erol","Nur"));
      ll1.addAll(ll2);
      //ll1.addAll(Collections"agam");// CTE verir
        System.out.println("ll1 = " + ll1);
        ll1.addAll(3,ll2);
        System.out.println("ll1 = " + ll1);


    }
}
