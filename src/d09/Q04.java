package d09;

import java.util.Arrays;

public class Q04 {
    public static void main(String[] args) {
        /*
Verilen Stringi array e cevirerek unlu harflerin sayisini bulan prgram yazin
String s= Apex,nesne yonelimli bir programlama dilidir"       */
        String s= "Apex,nesne yonelimli bir programlama dilidir";
       s=s.replace(",","").replace(" ","");

        String arr[]=s.split("");
        System.out.println(Arrays.toString(arr));

     String sesliHarfler[]={"a","e","i","o","u"};
        System.out.println(Arrays.toString(sesliHarfler));
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < sesliHarfler.length ; j++) {
                if(arr[i].equalsIgnoreCase(sesliHarfler[j])){
                    count++;
                }
            }
            
        }
        System.out.println("count = " + count);
    }
}
