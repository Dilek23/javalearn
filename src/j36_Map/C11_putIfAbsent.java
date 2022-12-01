package j36_Map;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        // map.putıfabsent ()->Girilen key map de yoksa entry key value mapa ekler ve null return eder yoksa girilen key
        // var ise key 'e ait value return eder.
        hm.put("Amazon","296 Euro");// key null deger kabul eder

        hm.put("Ebay","234Euro");// value degeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("apple store","333 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.putIfAbsent(\"ebik\",\"gabik\") = " + hm.putIfAbsent("ebik", "gabik"));
        System.out.println("hm = " + hm);
        System.out.println("hm.putIfAbsent(\"Ebay\",\"javaNaz\") = " + hm.putIfAbsent("Ebay", "javaNaz"));

    }
}
