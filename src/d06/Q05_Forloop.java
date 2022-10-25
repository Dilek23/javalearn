package d06;

import java.util.Scanner;

public class Q05_Forloop {
    public static void main(String[] args) {
        /*
   Get the number of rows and columns from user.
   Create a rectangle.
   rows = 3 and column = 5 ==> * * * * *
                               * * * * *
                               * * * * *
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("satır sayısı giriiniz:");
        int sayi1=sc.nextInt();
        System.out.println("Sütun sayısı giriiniz:");
        int sayi2=sc.nextInt();
     for(int i=1;i<=sayi1;i++) {

         for (int j = 1; j <= sayi2; j++) {
             System.out.print("* ");
         }
         System.out.println();
     }
    }
}
