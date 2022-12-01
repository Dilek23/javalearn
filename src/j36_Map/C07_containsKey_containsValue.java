package j36_Map;

import java.util.HashMap;

public class C07_containsKey_containsValue {
    public static void main(String[] args) {

        HashMap<String,String> hm=new HashMap<>();
        // map.containsKey ()->Girilen ket degerinin map varlıgını kontrol eder
        // map.containsvalue ()->Girilen map i istenen mapa ekler


        hm.put("Amazon","296 Euro");// key null deger kabul eder

        hm.put("Ebay",null);// value degeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("apple store","333 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.containsKey(\"Saturn\") = " + hm.containsKey("Saturn"));
        System.out.println("hm.containsKey(\"saturn\") = " + hm.containsKey("saturn"));

        System.out.println("hm.containsValue(\"111 Euro\") = " + hm.containsValue("111 Euro"));
        System.out.println("hm.containsValue(\"ebikgabık\") = " + hm.containsValue("ebikgabık"));




    }

}
