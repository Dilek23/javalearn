package L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
// girilen sayı 17 den küçük ise kazandınız degilse kaybettiniz
        // do while ile
        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriiniz");
        int sayi= sc.nextInt();
       do{

           System.out.println(sayi+" için kazandınız");
           sayi++;
       }while (sayi<=17);

        System.out.println("kaybettiniz...");


    }
}
