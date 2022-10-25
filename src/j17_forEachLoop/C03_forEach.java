package j17_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_forEach {
    public static void main(String[] args) {
        //Task-> iki string rray in elemanlarnın oratk olmasını kontorl eden kod creat et.
       /* String arr1[]={"nazım","gülsüm","dilek","erol","çigdem"};
        String arr2[]={"musty","gülsüm","ayse","enise","cüneyt","çigdem"};
        List<String>ortakIsim=new ArrayList<>();

        for (String s:arr1) {
            for (String b: arr2 ) {
           if(s.equalsIgnoreCase(b)){
               ortakIsim.add(b);
           }

            }

        }

if (ortakIsim.isEmpty()){
    System.out.println("Ortak isim yok= "+ortakIsim);
}else System.out.println("ortakIsim = " + ortakIsim);
*/
        String arr1[]={"nazım","gülsüm","dilek","erol","çigdem","cüneyt"};
        String arr2[]={"musty","gülsüm","ayse","enise","cüneyt","çigdem"};
        List<String>ortkname=new ArrayList<>();
        for (String s:arr1) {
            for (String s2:arr2  ) {
               if(s.equalsIgnoreCase(s2)){
                   ortkname.add(s);
               }
                
            }   
            
        }
       if(ortkname.isEmpty()){
           System.out.println("Ortak isim yok= "+ortkname);
       }else
           System.out.println("ortkname = " + ortkname);

    }
}
