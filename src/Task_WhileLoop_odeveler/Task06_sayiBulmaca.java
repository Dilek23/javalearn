package Task_WhileLoop_odeveler;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        /*
        Random rand = new Random();
        int sayı = rand.nextInt(100);
        int tsayısı = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sayı tahmini giriniz: ");
        int tahmin = scan.nextInt();

        while (tahmin != sayı) {
            if (sayı < tahmin) {
                System.out.println("sayiyi kucult");
            } else {
                System.out.println("sayiyi arttir");
            }
            tahmin = scan.nextInt();
            tsayısı++;
        }
        System.out.println("sayiyi " + tsayısı + " denemede buldunuz.");
*/
     Random rand=new Random();
     int sayi= rand.nextInt(100);
     int thmSayi=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen sayı tahmini giriniz: ");
        int tahmin = scan.nextInt();
     while (tahmin != sayi) {
         if (sayi < tahmin) {
             System.out.println("Tahmininizi küçültün!!");
         } else {
             System.out.println("tahmininizi büyütün!!");

         }
         tahmin = scan.nextInt();
         thmSayi++;
     }
        System.out.println("Tebrikler sayıyı "+thmSayi+". tahminde buldunuz!!!");
    }

}
