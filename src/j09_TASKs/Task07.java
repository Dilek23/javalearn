package j09_TASKs;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı sayıyı kelime olarak print eden code create ediniz..

        Scanner scan = new Scanner(System.in);
        System.out.print(" Lütfen üç basamaklı sayi giriniz :");
        int sayi = scan.nextInt();
        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yüzler=(sayi/100);
        switch (yüzler){
            case 1:
                System.out.println("yüz");
            break;
            case 2:
                System.out.println(" ikiyüz");
            case 3:
                System.out.println(" üçyüz");
                break;
            case 4:
                System.out.println(" dörtyüz");
                break;

            case 5:
                System.out.println("beşyüz");
                break;

            case 6:
                System.out.println("altıyüz");
                break;

            case 7:
                System.out.println("yediyüz");
                break;
            case 8:
                System.out.println("sekizyüz");
                break;
            case 9:
                System.out.println("dokuzyüz");
                break;}
       switch (onlar){
            case 1:
                System.out.println("on");
                break;
            case 2:
                System.out.println("yirmi");
                break;
            case 3:
                System.out.println("otuz");
                break;
            case 4:
                System.out.println("kırk");
                break;
            case 5:
                System.out.println("elli");
                break;

            case 6:
                System.out.println("atmiş");
                break;

            case 7:
                System.out.println("yetmiş");
                break;

            case 8:
                System.out.println("seksen");
                break;

            case 9:
                System.out.println("doksan");
                break;

            case 0:

                break;  }
              switch (birler){
                  case 1:
                      System.out.println("bir");
                      break;
                  case 2:
                      System.out.println(" iki");
                  case 3:
                      System.out.println(" üç");
                      break;
                  case 4:
                      System.out.println(" dört");
                      break;

                  case 5:
                      System.out.println("beş");
                      break;

                  case 6:
                      System.out.println("altı");
                      break;

                  case 7:
                      System.out.println("yedi");
                      break;
                  case 8:
                      System.out.println("sekiz");
                      break;
                  case 9:
                      System.out.println("dokuz");
                      break;
                  case 0:

                     break;}






    }
}
