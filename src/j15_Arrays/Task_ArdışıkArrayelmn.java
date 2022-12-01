package j15_Arrays;

import java.util.ArrayList;

public class Task_ArdışıkArrayelmn {
    public static void main(String[] args) {
           /* If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
                */
      int arr[]= { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
        ArrayList<Integer>list=new ArrayList<Integer>();
        arrTopla(arr,list);


    }

    private static void arrTopla(int[] arr, ArrayList<Integer> list) {
       int toplam=0; int sayac=1;
      int  j=0;
       for(int i=0;i<arr.length;i++) {
           toplam=0;
           for (j=i;j< arr.length&&j<i+sayac;j++) {
               toplam+=arr[j];
           }
           list.add(toplam);
           sayac++;
           i=j;
       }
        System.out.println(list);
    }
}
