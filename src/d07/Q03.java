package d07;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
    girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
   */
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi=sc.nextInt();
        int adet=0;
        for(int i=0;i<=sayi;i++){
            if(sayi%2==1){
                System.out.print(sayi+" ");
                adet++;

            }
            System.out.println();
            System.out.println("adet :"+adet);
        }


    }
}
