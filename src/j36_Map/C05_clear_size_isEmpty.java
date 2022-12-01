package j36_Map;

import java.util.HashMap;

public class C05_clear_size_isEmpty {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        // map.size ()->Girilen map in entry giriş eleman sayısını retur eder
        // map.clear ()->Girilen map inelemanlarını siler boolean retur eder
        // map.isEmpty ()->Girilen map in varlığını kontrol eder boolean return eder..
        hm.put("Amazon","296 Euro");// key null deger kabul eder

        hm.put("Ebay",null);// value degeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("apple store","333 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.size() = " + hm.size());
        System.out.println("hm.isEmpty() = " + hm.isEmpty());
        hm.clear();
        System.out.println("hm.isEmpty() = " + hm.isEmpty());
        System.out.println("hm.size() = " + hm.size());
    }
}
