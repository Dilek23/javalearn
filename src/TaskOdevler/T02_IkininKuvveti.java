package TaskOdevler;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir data giriniz");
        int data = sc.nextInt();
        System.out.println(PowersofTwo(data));
      int üst=0;

    }//main

    private static boolean PowersofTwo(int num) {
        while (num > 2) {
            num /= 2;

        }
        return num % 2 == 0;


    }

}

