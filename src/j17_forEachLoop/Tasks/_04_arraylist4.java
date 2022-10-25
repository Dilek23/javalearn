package j17_forEachLoop.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {
        ArrayList<String>color=new ArrayList<>(List.of("yellow" , "red" , "blue" , "red" , "blue"));
      String s1="blue";
        String s2="yellow";

        System.out.println("changeInArraylist( color,s1,s2) = " + changeInArraylist(color, s1, s2));


    }

    private static ArrayList <String> changeInArraylist(ArrayList<String> a, String s1, String s2) {
        ArrayList<String>list=new ArrayList<>();
        for (String value:a) {
            if(value==s1){
                System.out.println(list.add(s2));
            }else if(value!=s1) System.out.println(s1);

        }
        return list;
    }
}
