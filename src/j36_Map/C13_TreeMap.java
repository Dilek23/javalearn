package j36_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {
        /*
        tree map->
        1-TreeMap keylerde null degeer kabul etmez.fakat value null deger tanımlanabilir.
        2-TreeeMap elemanlarını key naturel ordera göre tanımlar.
        3-TreeeMap senkronized ve thread-safe degildir.
        4-TreeeMap en yavas map turudur. kullanırken coookk dikkat edilmeli...app hızı için
         */
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(101,"Ugur");
        tm.put(102,"Enise");
        tm.put(103,"Kevser");
        tm.put(104,"Fatih");
        System.out.println("tm = " + tm);
       // tm.put(null,"Fatih");
        tm.put(104,"Huma");

       // tm.put(106,null);NULL pointerExcepiton
      //  tm.put(107,null);Null pointerExcepiton
        System.out.println("tm = " + tm);


        HashMap<String,String> hm=new HashMap<>();
        // map.put ()->
        hm.put("Amazon","296 Euro");// key null deger kabul eder

        hm.put("Ebay",null);// value degeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        System.out.println("hm = " + hm);
        TreeMap<String,String>tm1=new TreeMap<>(hm);
        System.out.println("tm1 = " + tm1);

        System.out.println("tm.ceilingKey(103) = " + tm.ceilingKey(103));

        System.out.println("tm.ceilingKey(108) = " + tm.ceilingKey(108));//null
        System.out.println("tm.ceilingKey(100) = " + tm.ceilingKey(100));//100 den byk en kucuk key 101 yazdırır
        System.out.println("tm.ceilingKey(1) = " + tm.ceilingKey(1));// 1-den büyük em küçük deger 101 getirir

        //ascending order-> artan sıralama
        // descending order-> azalan sıralama
        System.out.println("tm.descendingKeySet() = " + tm.descendingKeySet());
        System.out.println("tm.keySet() = " + tm.keySet());
        System.out.println("tm.firstKey() = " + tm.firstKey());
        System.out.println("tm.lastKey() = " + tm.lastKey());


    }
}
