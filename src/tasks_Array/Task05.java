package tasks_Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
            /*
        String s = String.valueOf(a);
        String  rakamArr[] = s.split("");
        //System.out.println(Arrays.toString(rakamArr));
        for (int i=rakamArr.length-1; i>=0; i--){
            System.out.print(rakamArr[i]);
        }
*/

        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int a= sc.nextInt();
        String s= String.valueOf(a);
        String sayiArr[]=s.split("");
        System.out.println(Arrays.toString(sayiArr));
        for (int i =sayiArr.length-1; i>=0 ; i--) {
            System.out.print(sayiArr[i]);
        }

    }
  
}
