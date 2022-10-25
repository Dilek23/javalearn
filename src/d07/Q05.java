package d07;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        /* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */
        Scanner sc=new Scanner(System.in);

        int sayitoplam=0;
        int count=0;
        for (int i = 0; i <100 ; i++) {
            System.out.print("Bir sayı giriniz:");

            count++;
            int sayi=sc.nextInt();
         sayitoplam+=sayi;
         if (sayitoplam>100){
             System.out.println(count+ "kere sayi girdin. Bu kadar sayi yeter");
             break;
         }
            System.out.println("sayı toplam= " +sayitoplam);
        }

    }
}
