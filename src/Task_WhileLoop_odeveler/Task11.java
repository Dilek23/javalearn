package Task_WhileLoop_odeveler;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int num= sc.nextInt();

        int sayiadet=0;
        int toplam=0;
      while (num!=0){
          toplam+=num;
          System.out.print("Bir sayı giriniz:");
          num= sc.nextInt();
          sayiadet++;
      }
        System.out.println("Girilen sayıların toplAMI="+toplam+"  topladıgnız sayı adeti "+sayiadet);




    }
}
