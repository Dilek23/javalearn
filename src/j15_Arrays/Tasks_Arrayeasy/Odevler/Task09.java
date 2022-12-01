package j15_Arrays.Tasks_Arrayeasy.Odevler;

import java.util.ArrayList;
import java.util.Arrays;

public class Task09 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
ArrayList<Integer>numList=new ArrayList<>( Arrays.asList(1,10,4,6,4,8,9));

        ArrayList<Integer>krleriList=new ArrayList<>();
        int krtoplm=0;
        for (int i = 0; i < numList.size() ; i++) {
            krleriList.add(numList.get(i)* numList.get(i));
            krtoplm+=numList.get(i)* numList.get(i);

        }
        System.out.println("sayıların karelerinin listesi= "+krleriList);
        System.out.println("sayıların kareleri toplamı= "+krtoplm);
    }
}

