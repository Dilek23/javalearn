package j12_Loops.L01_ForLoop.tasks;

import java.util.Scanner;

public class Task04_ {
    public static void main(String[] args) {
/*
girilen iki sayı arasındaki çift sayıları print eden code

 */
        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir sayı  giriniz");
        int sayi1 = sc.nextInt();
        System.out.println("lütfen ikinci sayı  giriniz");
        int sayi2 = sc.nextInt();
       if(sayi1<sayi2) {
        for (int i=sayi1;i<sayi2 ;i++){
            if(i%2==0){

                System.out.print(i+" ");
            }
        }


       }else System.out.println("hatalı giriş yaptınız");




    }//main dısı




        }




