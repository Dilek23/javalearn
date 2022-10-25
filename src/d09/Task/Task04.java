package d09.Task;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
   static Scanner scan =new Scanner(System.in);
    public static void main(String[] args) {

			  /*
    aşağıdaki örnekte olduğu gibi 1 den 10 a kadar sayılar oluşan dizide eksik olan sayıyı döndüren metodu oluşturunuz.

     ([1, 2, 3, 5, 6, 7, 8, 10,9]) ➞ 4
    ([7, 2, 3, 10, 5, 9, 1, 4, 8]) ➞ 6
    ([7, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 10

     */

        int nums1[]={1,2,3,4,5,6,7,8,9,10};
       int nums2[]=new int[9];

        System.out.println( Arrays.toString(nums2));
        System.out.print("1'den 10'a kadar sayılari giriniz:");
      eKsikSayıbul(nums1,nums2);


        }//main



    private static void eKsikSayıbul(int[] nums1, int[] nums2) {
      for (int i=0;i<9; i++){
          nums2[i]=scan.nextInt();
      }
        System.out.println(Arrays.toString(nums2));
      int toplam=0;
        for (int i = 0; i <10 ; i++) {
            toplam+=nums2[i];
        }
        System.out.println(Arrays.toString(nums1));
        System.out.println("girdiginiz eksik sayi= "+(55-toplam));
    }


}



