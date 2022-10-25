package L02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        // girilen tamsayıın tam bölen sayısını print eden code create et.
        // 20->1,2,3,4,5,10,20 nin 6 tane tam böleni vardır
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz");
        int sayi=sc.nextInt();
        int boLEnSayi=1;
      int Tambolnsysı=0;
      while (boLEnSayi<=sayi){
          if (sayi%boLEnSayi==0){
          Tambolnsysı++;

          }
        boLEnSayi++;
      }
        System.out.println("Girdiginiz sayının "+Tambolnsysı+" tane tam böleni var...!");
       }
          //   bolen sayısı , sayıyaa esit olana kadar 1 artırarak gider
     }





