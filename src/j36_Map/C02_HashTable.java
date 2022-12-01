package j36_Map;

import java.util.Hashtable;

public class C02_HashTable {
    public static void main(String[] args) {
        /*
        HashTable->
        hashmapte kullanılan tüm metodlar hashtable da call edilir
        1-hashMAp ve TreeMap thread-safe ve syncvronized olmadıgı için maplar arasında thrad-safe ve senkroniza
        bir map e ihtiyac oldugundan HashTable tanımlanmıştır
        2-HashTable hashmapa göred daha yavastır
        3-HashTable key ve valuelarde null degere izin vermez
        4-Hashtable eleman ataması yapılırken Hashmap gibi random rastgele sıralama yapar.

         */
        Hashtable<String,String>ht=new Hashtable<>();
        ht.put("kebap","adana");
        ht.put("döner","sivas");
        ht.put("köfte","tekirdag");
        ht.put("corba","beyran");
        ht.put("sögus","");

        System.out.println("ht = " + ht);
        ht.put("döner","dönerse senindir :)");// döner key update edilir key2 de
        System.out.println("ht = " + ht);

       // ht.put(null,"trilece");RTE verir
      //  ht.put("kahve",null);RTE verir
        System.out.println("selametle devam ke ");

        Hashtable<String,String>ht1=new Hashtable<>();
        ht1.put("salata","patlıcan közleme");
        ht1.put("arasicak","icli köftee");
        System.out.println("ht1 = " + ht1);

        ht.putAll(ht1);
        System.out.println("ht = " + ht);
        System.out.println("ht1 = " + ht1);
    }
}
