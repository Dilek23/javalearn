package d01;

import java.util.Scanner;

public class Q02_modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("beş basamaklı bir sayı giriniz:");
        int sayi= sc.nextInt();
        int ilkIki =sayi/1000; //12
        int sonIki = sayi%100; //45
        int ilkIkiTop = (ilkIki/10) + (ilkIki%10); //1+2
        System.out.println("ilkIkiTop = " + ilkIkiTop);
        int sonIkiTop = (sonIki/10) + ( sonIki%10); //4+5
        System.out.println("sonIkiTop = " + sonIkiTop);
        System.out.println("esas toplam = " + (ilkIkiTop + sonIkiTop));





    }
}
