package d08;

import java.util.Arrays;

public class Q01_Arrays {
    public static void main(String[] args) {
        /*
      given an int array and find the squares of the elements
      (Verilen bir int dizisi icin elemanlarin karelerini bulun )
      Example:{2,6,4,5,8,9}
      output:{4,36,16,25,64,81}
      */
        int arr[]={2,6,4,5,8,9};
        for (int i = 0; i <arr.length ; i++) {
            arr[i]*=arr[i];

        }
        System.out.println("Elemanların karesi = " +Arrays.toString(arr));
      //  int arr[]={2,6,4,5,8,9};
        //System.out.println("Array'deki elemanlariniz" + Arrays.toString(arr));
        //for (int i=0;i<arr.length;i++){
          //  System.out.println(i+1+". elemanin karesi--->"+arr[i]*arr[i]);

    }
}
