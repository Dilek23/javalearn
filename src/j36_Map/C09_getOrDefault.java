package j36_Map;

import java.util.HashMap;

public class C09_getOrDefault {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        // map.getOrDefault ()->Girilen  key mapdevarsa keye ait value yoksa default deger return eder

        hm.put("Amazon","296 Euro");// key null deger kabul eder

        hm.put("Ebay","234Euro");// value degeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("apple store","333 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.getOrDefault(\"Ebay\",\"ebikGabık\") = " + hm.getOrDefault("Ebay", "ebikGabık"));
        System.out.println("hm.getOrDefault(\"ebik\",\"gabık\") = " + hm.getOrDefault("ebik", "gabık"));

    }
}
