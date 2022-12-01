package j36_Map;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        // map.putAll ()->Girilen map i istenen mapa ekler

        hm.put("Amazon","296 Euro");// key null deger kabul eder

        hm.put("Ebay",null);// value degeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("apple store","333 Euro");

        System.out.println("hm = " + hm);


        HashMap<String,String> hm1=new HashMap<>();
        // map.putAll ()->Girilen map i istenen mapa ekler

        hm1.put("küfteci yusuf","296 Euro");// key null deger kabul eder

        hm1.put("starbucks",null);// value degeri null atanabilir
        hm1.put("gülllüoglu","cennet camuru");
        hm1.put("Clarusway","111 Euro");
        hm1.put("nusret","333 Euro");

        hm.putAll(hm1);

        System.out.println("hm = " + hm);
        System.out.println("hm1 = " + hm1);


        //cincix code
        HashMap<String,String> hm2=new HashMap<>(hm1);
        System.out.println("hm2 = " + hm2);
    }
}
