package i01_interviewQuestions;

import java.util.Scanner;

public class Q05_CertainCharacterCount {
    /*
    * Kullanicidan bir cumle ve bir harf alin,
    * Cumlede harfin kac kere
    * kullanildigini bulup, yazdirin
    * ORNEK:
    * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
    *
    * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
    */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("cümle giriniz ");
        String cumle=sc.nextLine();
        System.out.println("bulmak istediginiz harfi girin: ");
        /*
        char harf=sc.next().toLowerCase().charAt(0);
        int sayac=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if(cumle.charAt(i)==harf){
                sayac++;
            }


        }
        System.out.println(harf+ " harfi sayısi = " + sayac);

         */
  char harf=sc.next().toLowerCase().charAt(0);
  int counter=0;
        for (int i = 0; i <cumle.length() ; i++) {
           if(cumle.charAt(i)==harf){
               counter++;
           }
        }

        System.out.println(harf+" harfi sayisi= "+counter);


    }


}
