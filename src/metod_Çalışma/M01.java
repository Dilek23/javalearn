package metod_Çalışma;

import java.util.Scanner;

public class M01 {
    public static void main(String[] args) {

     /*
       // girilen ifadenin polindrome olmasını kontorl eden metod creat ediiniz.
        // polindrome her iki yonde okundugunda esit olan ifadeler.
     // ey edip adanada pide ye.
girilen iki sayı arasındaki çift sayıları print eden code

   */
      /*  Scanner sc= new Scanner(System.in);

        System.out.println("lütfen bir sayı  giriniz");
        int sayi1 = sc.nextInt();
        System.out.println("lütfen ikinci sayı  giriniz");
        int sayi2 = sc.nextInt();
       if(sayi1<sayi2){
           for (int i=sayi1;i<sayi2;i++){
               if(i%2==0){
                   System.out.print(i+" ");
               }

       */





    }// main dısı

    public static void convert(String birim, int miktar) {

        switch(birim) {

            case "saat":

                System.out.println(miktar * 60 * 60);

                break;

            case "mil":

                System.out.println(miktar * 1.6);

                break;

            case "kilogram":

                System.out.println(miktar * 1000);

                break;

            default:

                System.out.println("saat, mil ve kilogram dışında bir birim girmeyiniz");
        }
        }

    }





