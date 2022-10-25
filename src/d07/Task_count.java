package d07;

import java.util.Scanner;

public class Task_count {
    public static void main(String[] args) {

        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir string ifade giriniz:");
        String s= sc.nextLine();
        System.out.println("girdiğiniz metinde saydırmak istediginiz harfi giriniz:");
        char harf=sc.next().charAt(0);
        int adet=0;
        for (int i =0; i <s.length() ; i++) {

            if (s.charAt(i)==harf) {

              adet++;
            }
        }
        System.out.println("girilen cumlede istenen "+harf+" harf "+adet+" tane var...");
    }
}
