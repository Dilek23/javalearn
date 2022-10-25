package d09;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q05 {
    public static void main(String[] args) {
       /*
   Find the middle element in an integer array ortanca elemanı yazdır
   Example:  (10, 5, 6) ==> (5, 6, 10) ==> Output=8
             (16, 5, 8, 10) ==> (5, 8, 10, 16) ==> Output=(8+10)/2 = 9
*/
      int arr[]={16,5,8,10};
        Arrays.sort(arr);
        int ortnca=arr.length/2;
        if(arr.length%2!=0){// arr lenght tek ise
            System.out.println(arr[ortnca]);
        }else {// arr in lenght cift ise
            ortnca=(arr[ortnca]+arr[ortnca-1])/2;
            System.out.println("ortnca = " + ortnca);
        }
    }
}
