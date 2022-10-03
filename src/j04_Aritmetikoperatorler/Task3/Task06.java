package j04_Aritmetikoperatorler.Task3;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen üç basamaklı bir sayı giriniz:");
        int sayi= sc.nextInt();
        int a=sayi/100;
        int b=(sayi/10)%10;
        int c=sayi%10;
        System.out.println("Gİrdiğiniz sayının birler basamağı= " + c);
        System.out.println("Girdiğiniz sayının onlar basamağı = " + b);
        System.out.println("Girdiğiniz sayının yüzler basamağı = " + a);




    }
}
