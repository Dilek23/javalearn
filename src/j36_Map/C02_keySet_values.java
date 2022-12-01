package j36_Map;

import java.util.HashMap;

public class C02_keySet_values {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        // map.keySet ()->map key degerlerini sete atayıp return eder.
        //map.values-> map value degerlerini coll atayıp retturn
        hm.put("Amazon","296 Euro");// key null deger kabul eder



        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("apple store","333 Euro");

        hm.put("MediaMarkt","183 Euro");
        System.out.println("hm = " + hm);


        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());//  [300 Euro, 183 Euro, 296 Euro, 111 Euro, 333 Euro] koşeli parantez coll.
        System.out.println("***");
    // hashmap key ve value degerlerini satır satır print et.with loop (for each)
        for (String s: hm.keySet() ) {// key

            System.out.println(s+" ");
        }
        System.out.println();
        for (String w: hm.values()   ) {//value

            System.out.println(w+"");
        }
    }
}
