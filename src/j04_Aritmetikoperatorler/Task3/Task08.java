package j04_Aritmetikoperatorler.Task3;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        /*
        double sayı1 = 15.613;

        int sayı2 = (int)sayı1;

        System.out.println(sayı2);
        int num1 = 12;

        int num2 = 15;

        num1*=3;

        num2/=3;

        System.out.println(num1 +num2);
        int sayi1 = 7;

        int sayi2 = 2;

        int sonuc = sayi1 / sayi2;

        System.out.println(sonuc) ;

        int a = 12;

        int b = 18;

        a*=2;

        b/=3;

        a++;

        b--;

        System.out.println(a+b);
        String s1="Ahmet";

        String s2="Seref";

        System.out.println(s1 + "Seref");
        if ( 0 > 5 && 7 > 6 ) {

            System.out.println("apple");

        }else{

            System.out.println("banana");

        }

         */
 int sayi=50;
        if ( sayi>100 ) {

            System.out.println("apple");

        }if ( sayi>75){

            System.out.println("banana");

        }
        int aci1 =150, aci2 = 20, aci3 = 10;

        boolean valid = (aci1+aci2+aci3) ==180;



        if(valid) {

            System.out.println("it's a valid triangle");

        } else
        if(true) {

            System.out.println("Today is Friday");

            System.out.println("Tomorrow is day off");

            System.out.println("there is no java class tomorrow");

        }else if(false)

            System.out.println("Today is Saturday");
       int i = 10;

        int j = 20;

        int k = j += i/5;

        i--;

        j++;

        System.out.println(i+"-"+j+"-"+k);
        int num = 9;

        if(++num < 10) {

            System.out.println(num+"Hello Wolrd");

        } else {

            System.out.println(num +"Hello Universe");

        }



        System.out.println(++num);
        int a = 5;

        int b = 9;

        int c = 0;

        if (a > b) {

            c = a;

            a = b;

            b = c;

        }

        System.out.println(b + "," + a);

    }


    }

