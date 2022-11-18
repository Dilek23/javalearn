package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {
        ArrayList<Integer>l1 = new ArrayList<>(Arrays.asList(24,23,65,9,11,7,27));
        System.out.println("l1 lis ilk hali: "+l1);
   /*
   tekrarda son elemandan baslayan işlemler için pointer en sona götürülmeli
   bunun için pointeri sona götüren has(next() calışmalı
    */
        ListIterator<Integer>it1=l1.listIterator();
        while (it1.hasNext()){// bastan sona pointer sürekli sona dogru ilerler.
            it1.next();
        }
        while (it1.hasPrevious()){// sondan basa pointer surekli başa dogru ilerler
            System.out.print(it1.previous() + " ");
        }
        System.out.println();
ArrayList<String>l2=new ArrayList<>(Arrays.asList("tugba","ragıp","yasin","yunus"));
        // l2 elemanlarının sonuncusuna :-) ekleyip print et
        System.out.println("lititerator öncesi l2 :"+l2);

        ListIterator<String>it2=l2.listIterator();
        while (it2.hasNext()){
           String s= it2.next();
            if(!it2.hasNext()) {
                it2.set(s + ":-)");
            }
        }
        System.out.println(l2);
    }
    /*
    hasPrevious metod için mutlaka kesinlikle hasnext ve next çalıştırılıarak pointer en sona getirilmeli

    ITERATOR ile LİSTİn farkları
    1- Iterator sadece has next ,next ,remove mth. calışır
      Lİstiterator has next,next,remove, hasprevious,add,set metodlar calısır
    2- LİSTİTERATOR-> sadece list yapılarda tanımlanır.
    3-ITERATİOR sadece bstan sona tekrarlar
    Lİstiterator bastan sona ileri geri çift yonlu calışır

    4-ITERATOR ->kapsamı geniş ama aksiyonu az

    Listiterator kapsamı dar ama aksiyonu çok
     */
}
