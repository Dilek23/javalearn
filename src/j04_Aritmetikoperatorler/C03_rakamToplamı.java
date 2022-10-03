package j04_Aritmetikoperatorler;

import java.util.Scanner;

public class C03_rakamToplamı {
    public static void main(String[] args) {
        // kullanıcıdan alınan 3 basamaklı bir sayının rakamları toplamını print eden cod?
        Scanner sc=new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz:");

        int sayi= sc.nextInt();
        int a=sayi/100;
        int b=(sayi/10)%10;
        int c=sayi%10;
        System.out.println("Gİrdiğiniz sayının birler basamağı= " + c);
        System.out.println("Girdiğiniz sayının onlar basamağı = " + b);
        System.out.println("Girdiğiniz sayının yüzler basamağı = " + a);




    }
}
