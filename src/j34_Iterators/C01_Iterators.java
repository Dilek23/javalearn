package j34_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {
     ArrayList <String> l1=new ArrayList<>(Arrays.asList("Nur","Gamze","erol","Bekir"));
        System.out.println("listin ilk hali"+l1);
        // l1 elemanlarını for loop ile prin et.
        for (int i = 0; i < l1.size() ; i++) {
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();
        System.out.println("******");

        // for each ile
        for (String a:l1   ) {
            System.out.print(" " + a);

        }
        System.out.println();
        System.out.println("****");


        // l1 in her alamanını :-) for loop ile update et.
        for (int i = 0; i < l1.size() ; i++) {
            l1.set(i, l1.get(i)+":-)");

        }
        System.out.println("l1:-) update sonrası"+l1);
        System.out.println();
        System.out.println("  ***   ");
         // herbir elemanı for each loop ile update :-( et
        for (String w:l1  ) {// for each loop update sonrası degişmez indeks olmadıgı için set metodu calışmaz
           w+=":-(";

        }
        System.out.println("Update sonraası :-("+l1);
            /*
    index desteklemeyen yapılarda tekrarlayan aksiyon için for-each loop update yapamayabilir yukarıdda oldugu gibi asık surat
    update edilemedi.bu durmda jav ıterator intarface'den tanımlancak variable ile tekrarlayan aksiyonlar index olmadan yapılır.
     */
        System.out.println();
        System.out.println("****  Iterator   ****");
        Iterator<String>it1= l1.iterator();// ıterotor variable tanımlandı
         while (it1.hasNext()){//it 1 elemamları için pointer oldgu yerde eleman varsa true yoksa false verir ve bir sonrsaki elemanı önüne koya
       it1.next();//next metodu listin  pointer önündeki elemanını     return eder
             System.out.print(it1.next()+" ");
         }
        System.out.println();
        ArrayList <String> l2=new ArrayList<>(Arrays.asList("tugba","ragıp","yasin","yunus"));
         // l2 elemanlarını ıterator ile silip print ediniz->l2[]
        System.out.println("iterator öncesi l2" + l2);
        Iterator<String>it2=l2.iterator();
        while (it2.hasNext()) {
            it2.next();// tekrardaki pointer önündeki elemanı verir
            it2.remove();// next() ile gelen elemanı siler
        }
        System.out.println("iterator sonrası l2" + l2);
        System.out.println();
        ArrayList <String> l3=new ArrayList<>(Arrays.asList("tugba","ragıp","yasin","yunus"));
        //" elemanlrını ıterator ile :-) set edip prin et.

        System.out.println("iterator öncesi l3" + l3);
        ListIterator<String>it3= l3.listIterator();// tekrar iterator tannımlandı
        while (it3.hasNext()){

            it3.set( it3.next().toUpperCase().charAt(0)+"***");// tekrardki next ile elemanı :-) ile concat ederek update
       //l3[T***, R***, Y***, Y***] çıktısı
        }


        System.out.println("iterator sonrası l3" + l3);
        System.out.println();

        ArrayList <String> l4=new ArrayList<>(Arrays.asList("tugba","ragıp","yasin","yunus"));
// l3 elemanlarının ilk harfi büyük kalan 3 harfı *** karktri ve 14 listi ekle print et
        ListIterator<String>it4= l3.listIterator();
        System.out.println("iterator öncesi l3" + l3);
         while (it4.hasNext()){
             it4.set(it4.next().toUpperCase().charAt(0)+"***");
             it4.add(l4.toString());// tekrardaki update edilen l3 e l4 eklendi
         }

        System.out.println("listliterator sonrası set ve add sonrsi :+l3"+l3);







    }

}
