package d07;

import java.util.Scanner;

public class ex01_BaklavaDİlimi {
    public static void main(String[] args) {

        /*
        aşağıdaki şekli print eden code create ediniz

             *
            * *
           * * *
          * * * *
         * * * * *
          * * * *
           * * *
            * *
             *
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("baklava dilimi için bir boyut giriniz");
        int boyut= scan.nextInt();
        for (int i = 0; i <=boyut ; i++) {
           for(int j=boyut;j>i;j--){
               System.out.print(" ");
           }
            for (int j =1; j <=i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }// baklavadiliminin alt kısmı
        for (int i = 0; i <=boyut ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int j = boyut; j >i ; j--) {//yıldız kontrolu
                System.out.print("*"+" ");
            }
            System.out.println();
            }

        }





    }

