package j36_Map;

import java.util.HashMap;

public class C10_remove {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        // map.remove ()->Girilen  rntry mapdevarsa  siler ve true return eder yoksa false
  // parametre olarak entry degil sadece key deger girilirse key varsasiler ve key valuesi return eder,yoksa null return eder
        hm.put("Amazon","296 Euro");// key null deger kabul eder

        hm.put("Ebay","234Euro");// value degeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("apple store","333 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.remove(\"Amazon\",\"296Euro\") = " + hm.remove("Amazon", "296Euro"));
        System.out.println("hm.remove(\"Amazon\",\"Ebik\") = " + hm.remove("Amazon", "Ebik"));
        System.out.println("hm.remove(\"Ebay\") = " + hm.remove("Ebay"));


    }
}
