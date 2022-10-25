package d09.Task;

import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
        	 /*
     If the list has 12 as element, change all 12s to 21
     Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
 */
        ArrayList<Integer>numslist=new ArrayList<>(List.of(12, 11, 12, 15, 12, 34, 43));
        System.out.println(numslist);
        for (int i = 0; i < numslist.size() ; i++) {
            if(numslist.get(i)==12){
                numslist.set(i, 21);
            }

        }
        System.out.println("12 degeri 21 olarak degiştirildi:  " + numslist);


    }
}
