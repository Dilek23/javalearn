package j36_Map;

import java.util.HashMap;

public class C08_replace {
    public static void main(String[] args) {
        HashMap<String,String> hm1=new HashMap<>();
        // map.replace ()->Girilenvalue degeri ilgili key de update edilip return edilir

        hm1.put("küfteci yusuf","296 Euro");// key null deger kabul eder

        hm1.put("starbucks",null);// value degeri null atanabilir
        hm1.put("gülllüoglu","cennet camuru");
        hm1.put("Clarusway","111 Euro");
        hm1.put("nusret","333 Euro");



        System.out.println("hm = " + hm1);
        System.out.println("hm1.replace(\"starbucks\",\"314$\") = " + hm1.replace("starbucks", "314$"));
        System.out.println("hm1 = " + hm1);

        System.out.println("hm1.replace(\"sefil\",\"haluk\") = " + hm1.replace("sefil", "haluk"));
    }
}
