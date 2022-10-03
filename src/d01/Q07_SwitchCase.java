package d01;

import java.util.Scanner;

public class Q07_SwitchCase {
    public static void main(String[] args) {
// Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.
        Scanner sc=new Scanner(System.in);
        System.out.println("üç haneli bir sayı giriniz");
       int sayi= sc.nextInt();
       int yuzlerbas=sayi/100,onlarBas=(sayi/10)%10,birlerBas=sayi%10;

       if (sayi>99&&sayi<1000){
           switch (yuzlerbas){
               case 0: System.out.println(""); break;
               case 1: System.out.println("yuz"); break;
               case 2: System.out.println("ikiyuz"); break;
               case 3: System.out.println("ucyuz"); break;
               case 4: System.out.println("dortyuz"); break;
               case 5: System.out.println("besyuz"); break;
               case 6: System.out.println("altiyuz"); break;
               case 7: System.out.println("yediyuz"); break;
               case 8: System.out.println("sekizyuz"); break;
               case 9: System.out.println("dokuzyuz"); break;
           }
         switch (onlarBas){
             case 0: System.out.println(""); break;
             case 1: System.out.println("on"); break;
             case 2: System.out.println("yirmi"); break;
             case 3: System.out.println("otuz"); break;
             case 4: System.out.println("kırk"); break;
             case 5: System.out.println("elli"); break;
             case 6: System.out.println("altmış"); break;
             case 7: System.out.println("yetmiş"); break;
             case 8: System.out.println("seksen"); break;
             case 9: System.out.println("doksan"); break;


         }
         switch (birlerBas){
             case 0: System.out.println(""); break;
             case 1: System.out.println("bir"); break;
             case 2: System.out.println("iki"); break;
             case 3: System.out.println("üç"); break;
             case 4: System.out.println("dört"); break;
             case 5: System.out.println("bes"); break;
             case 6: System.out.println("altı"); break;
             case 7: System.out.println("yedi"); break;
             case 8: System.out.println("sekiz"); break;
             case 9: System.out.println("dokuz"); break;


         }

       }



    }
}
