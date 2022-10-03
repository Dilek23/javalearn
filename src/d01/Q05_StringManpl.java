package d01;

import java.util.Scanner;

public class Q05_StringManpl {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner sc=new Scanner(System.in);
        System.out.println(" dort tane kelime giriniz:");String word1= sc.next();
        System.out.println(" dort tane kelime giriniz:");String word2= sc.next();
        System.out.println(" dort tane kelime giriniz:");String word3= sc.next();
        System.out.println(" dort tane kelime giriniz:");String word4= sc.next();
        System.out.println(word1.substring(0,1).toUpperCase()+word1.substring(1)+" "+word2+" "+word3+" "+word4+".");






    }
}
