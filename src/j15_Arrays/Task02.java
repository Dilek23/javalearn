package j15_Arrays;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        // girilen int array elemanlarını  toplamını print een code creat ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.print("kaç elemanlı aray istediğinizi giriniz");
        //int arrBoyut=sc.nextInt();
        int arr[] = new int[sc.nextInt()];
        int toplam=0;
       // for (int i = 0; i < arr.length; i++) {

       //   System.out.println(i + ". index elemanı giriniz: ");
       //   arr[i] = sc.nextInt();

       //   toplam += arr[i];

       //   System.out.println("elemanları toplamı: " + toplam);
        for (int a: arr  ) {
         toplam+=a;

        }
        System.out.println("toplam = " + toplam);
        }



    }

