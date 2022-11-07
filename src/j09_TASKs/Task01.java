package j09_TASKs;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
       /* System.out.print("Sayi = ");
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
*/
        System.out.println("Bir sayi giriniz= ");
        int sayi= sc.nextInt();
        int onlrbsmgi=(sayi/10)%10;
        switch (onlrbsmgi) {
            case 0:
                System.out.println("onlar basamağı  'sıfır'");
                break;
            case 1:
                System.out.println("onlar basamağı  'Bir'");
                break;

            case 2:
                System.out.println("onlar basamağı  'İki'");
                break;

            case 3:
                System.out.println("onlar basamağı  'üç'");
                break;

            case 4:
                System.out.println("onlar basamağı  'dört'");
                break;

            case 5:
                System.out.println("onlar basamağı  'beş'");
                break;
            case 6:
                System.out.println("onlar basamağı  'altı'");
                break;

            case 7:
                System.out.println("onlar basamağı  'yedi'");
                break;

            case 8:
                System.out.println("onlar basamağı  'sekiz'");
                break;
            case 9:
                System.out.println("onlar basamağı  'dokuz'");
                break;
            default:
                System.out.println("Yanlış deger girdiiniz...");
        }



    }
}
