package d07;

import java.util.Scanner;

public class Task_Break {
    public static void main(String[] args) {
         /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir pozitif sayı giriniz:");
        int sayi= sc.nextInt();
        boolean asalMi=true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i ==1) {
                System.out.println("sayı asaldır");
                asalMi=true;
                break;
            }else System.out.println("sayı asal değildir");

             break;
        }



    }
}
