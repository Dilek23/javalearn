package tasks_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz.
        /*
        Scanner sc = new Scanner(System.in);

        System.out.print("agam kaç elemanlı array istirsen : ");
        //int arrBoyut = sc.nextInt();

        int arr[] = new int[sc.nextInt()];//boyutu belirlenmiş boş int array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ". index  elemanı giriniz : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("agam istedgin array : " + Arrays.toString(arr));
        int arrToplam = 0;//local var.


        for (int i = 0; i < arr.length; i++) {
            arrToplam += arr[i];
        }
        System.out.println("array eleman toplamları : "+arrToplam);

         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Array boyutunu giriniz<: ");
        int boyut= sc.nextInt();
        int arr[]=new int[sc.nextInt()];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i+".elemanı giriniz:  ");
            arr[i]= sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
        toplam+=arr[i];

        }
        System.out.println(toplam);
    }
}
