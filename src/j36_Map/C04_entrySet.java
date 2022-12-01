package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class C04_entrySet {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        // map.entrySet ()->Girilen map in key value tüm datalarını sete atayıp return eder
        hm.put("Amazon","296 Euro");// key null deger kabul eder

        hm.put("Ebay",null);// value degeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("apple store","333 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.entrySet() = " + hm.entrySet());

        for (Map.Entry<String, String> e: hm.entrySet()  ) {// Entry yaprak stringe cevirdik Map.Entry yaptık
            System.out.println("e.getValue() = " + e.getValue());// entryset ile gelen key value loop için entry value data
            System.out.println("e.getValue() = " + e.getValue());


        }




    }
}
