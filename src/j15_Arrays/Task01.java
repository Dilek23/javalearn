package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
   // Task-> kullanıcıdan alınan degerlerle bir int array elemanlarını buyukten küçüğe print eden cod creat et.
        Scanner sc=new Scanner(System.in);
        System.out.print("kaç elemanlı aray istediğinizi giriniz");
        int arrBoyut=sc.nextInt();
        int arr[]=new int[arrBoyut];// boyutu belirlenmiş boş int array
        for (int i = 0; i <arrBoyut ; i++) {
            System.out.println(i+" . elemanı giriniz");
            arr[i]= sc.nextInt();
        }
        System.out.println("istediğin array : "+Arrays.toString(arr));
       Arrays.sort(arr);// kucukten buyuge sort edildi
        for (int i =arr.length-1; i>=0;  i--) {
            System.out.print(arr[i] + " ");

        }





    }
}
