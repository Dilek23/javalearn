package j09_TASKs;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi = sc.nextInt();
      int onlarBas=(sayi/10)%10;
      switch (onlarBas){
          case 1:
              System.out.println("Sayının onlar basamağı 'Bir' ");
          break;

          case 2:
              System.out.println("Sayının onlar basamağı 'İki' ");
              break;

          case 3:
              System.out.println("Sayının onlar basamağı 'Üç' ");
              break;

          case 4:
              System.out.println("Sayının onlar basamağı 'Dört' ");
              break;

          case 5:
              System.out.println("Sayının onlar basamağı 'Beş' ");
              break;

          case 6:
              System.out.println("Sayının onlar basamağı 'Altı' ");
              break;

          case 7:
              System.out.println("Sayının onlar basamağı 'Yedi' ");
              break;
          case 8:
              System.out.println("Sayının onlar basamağı 'Sekiz' ");
              break;

          case 9:
              System.out.println("Sayının onlar basamağı 'dokuz' ");
              break;
          case 0:
              System.out.println("Sayının onlar basamağı 'Sıfır' ");
              break;
          default:
              System.out.println("yanlış deger girdiniz!!!");
        }




    }
}
