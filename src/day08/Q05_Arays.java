package day08;

import java.util.Scanner;

public class Q05_Arays {
    public static void main(String[] args) {
/*
  Kullanicidan aldigimiz 8 elemanli arrayin icinde
  kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
 */
        Scanner sc=new Scanner(System.in)   ;
       int count=0;
        int arr []= new int[8];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i+ ". elemanı yazın ");
            arr[i]= sc.nextInt();
            if(arr[i]%3==0){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("3' e bölünemilen sayılar = " + count);

    }
}
