package d14;

import java.util.Scanner;

public class ArmstrongRakam_4Digit {
     /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız
          ***4 basamak ve dah fazlası için
         *** Amstrogn sayi kaç haneli ise o sayının o kada katı alınır. ornegirn 4 haneli bir sayi için her basamagın 4 .ncü katı
          */
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("sayi giriiniz:");
         String strSayi = sc.next();
         ArmstrongMethod(strSayi);



     }

    private static void ArmstrongMethod(String strSayi) {


         String []basmak=strSayi.split("");
         int toplam=0;
        for (int i = 0; i < basmak.length ; i++) {
            toplam+=Math.pow(Integer.parseInt(basmak[i]), basmak.length);

        }
        System.out.println(Integer.parseInt(strSayi)==toplam?"bu sayi amstrong bir sayidir...":"sayı amstrong deigldir.");
    }


}
