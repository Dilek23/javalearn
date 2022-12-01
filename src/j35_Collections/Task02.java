package j35_Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {

    public static void main(String[] args) {
        // İnterview question: girilen String datanıın karakterlerini alfabetik print et-> treesete atanır
        //hashSet ve TreeSet tanımlayıp run sürelerini karşılaştırnız
        //trick run suresi için System.current timeMilles meth call ediniz
        HashSet<String>hs1= new HashSet<>();
        hs1.add("elazığ");
        hs1.add("elaz");
        hs1.add("ela");
        long hs1Basla=System.currentTimeMillis();
        long hs2Bitir=System.currentTimeMillis();
        System.out.println("hs2Bitir-hs1Basla = " + (hs2Bitir - hs1Basla));

        System.out.println("****");
        TreeSet<String>ts=new TreeSet<>();// treeset dah yavas calısır
       ts.add("tugba");
       ts.add("ragıp");
       ts.add("re");
       ts.add("dsds");
       ts.add("dsd");
       long tsBasla=System.currentTimeMillis();

       long tsBitir=System.currentTimeMillis();

        System.out.println("tsBitir-tsBasla = " + (tsBitir - tsBasla));

    }//main
}
