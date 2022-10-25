package tasks_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
        Scanner sc=new Scanner(System.in);
       int num[]=new int[8];
        for (int i = 0; i <8 ; i++) {
            System.out.println(i+" . elemanı giriniz:");
           num[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(num));
        int count=0;
        for (int i = 0; i <num.length ; i++) {
            if(num[i]%3==0){
              count++;
                System.out.print(num[i]+" ");
            }

        }
        System.out.println();
        System.out.println(count+"tane sayi 3 ile bölünebiliyor.");
    }

}
