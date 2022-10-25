package Taskodevler_forloop;

import java.util.Scanner;

public class Odev03 {
    public static void main(String[] args) {



        /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
         * bir method create ediniz.
         *
         *  getAsalMi(int sayi)
         *  	return true/false

         * */
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = sc.nextInt();
        System.out.println(asAlMi(sayi));


    }//main sonu

    private static boolean asAlMi(int a) {
        boolean asal = false;
        if (a == 2) {
            asal = true;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i != 0) {
                    asal = true;
                }else
                    return false;
            }

        }
        return asal;
    }

}