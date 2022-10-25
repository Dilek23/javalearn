package j15_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
// girilen bir int array elemanlarından ortalamadan buyuk olan eleman sayısını print et
        Scanner sc=new Scanner(System.in);
        System.out.print("agam kaç elemanlı array istirsen : ");
        //int arrBoyut = sc.nextInt();

        int arr[] = new int[sc.nextInt()];//boyutu belirlenmiş boş int array

        for (int i = 0; i < arr.length; i++) {//bu loop array elamanlrını alıp atama yapar
            System.out.print(i + ". index  elemanı giriniz : ");
            arr[i] = sc.nextInt();
        }
        System.out.printf("agam istedgin array : %s%n", Arrays.toString(arr));
        int arrToplam = 0;//local var.


       for (int i = 0; i < arr.length; i++) {//bu lopp array elemalarını toplar
           arrToplam += arr[i];
       }
       System.out.println("array eleman toplamları : "+arrToplam);

       // ortalama=sayı toplamı/ sayı adedi ->arrToplam/arr.lenth
       int arrOrtlama=arrToplam/arr.length;

       System.out.println("agam arrayın ortlaması :"+arrOrtlama);

       int ortlamayıGecenElemnSayısı=0;
       for (int i = 0; i < arr.length; i++) {

           if (arr[i]>arrOrtlama){
               ortlamayıGecenElemnSayısı++;
           }
       }
       System.out.println("agam giridigin array elamlarından ortlamayı geçen eleman sayısı :"+ortlamayıGecenElemnSayısı);
    }
}
