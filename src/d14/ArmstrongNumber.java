package d14;

import java.util.Scanner;

public class ArmstrongNumber {    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız
          *** 3 basamaklı sayilar için gecerli çözüm...

          */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("sayi giriiniz:");
        int sayi= sc.nextInt();

        armstrong(sayi);
        girilenSAyiyaKadarAmstrong(sayi);

    }

    private static void girilenSAyiyaKadarAmstrong(int sayi) {
        for (int i = 0; i <sayi ; i++) {
         armstrong(i);
        }


    }

    private static void armstrong(int sayi) {
     int sayininKupleriTop=0;
     int basmaktakiSayi=0;
             int girilensayi=sayi;
     while (sayi>0){
         basmaktakiSayi=sayi%10;// her bir rakma erişmek için
         sayininKupleriTop+=basmaktakiSayi*basmaktakiSayi*basmaktakiSayi;
         sayi=sayi/10;
     }
        if (girilensayi==sayininKupleriTop) {
            System.out.println(girilensayi+"  sayisi amstrong sayidir...");
        }else System.out.println(+girilensayi+"amstrong sayi degildir..");

    }
}
