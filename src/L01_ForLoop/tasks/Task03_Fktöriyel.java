package L01_ForLoop.tasks;

import java.util.Scanner;

public class Task03_Fktöriyel {
    public static void main(String[] args) {
        /*
        Task girilen sayının faktöriyelini hesalayan metod creat ediniz.

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen bir sayı  giriniz");
        int sayi = sc.nextInt();
        System.out.println(fakToriyel(sayi));

    }

    private static int fakToriyel(int sayi) {
        int faktoriyel=1;
for(int i=1;i<=sayi;i++){
    faktoriyel *=i;

}
return faktoriyel;
       // System.out.println("faktoriyel = " + faktoriyel);
    }
}