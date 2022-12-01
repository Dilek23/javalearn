package j36_Map;

import java.util.HashMap;

public class C03_get {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        // map..get (key)->girilen key degerinin valuesini return eder

        hm.put("Amazon","296 Euro");// key null deger kabul eder



        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("apple store","333 Euro");

        hm.put("MediaMarkt","183 Euro");
        System.out.println("hm = " + hm);

        System.out.println("hm.get(\"Amazon\") = " + hm.get("Amazon"));
        System.out.println("hm.get(\"haluk\") = " + hm.get("haluk"));// olmaayan key için null return eder.

    }
}
