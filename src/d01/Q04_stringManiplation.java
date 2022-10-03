package d01;

import java.util.Scanner;

public class Q04_stringManiplation {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili

         *
         * input = el
         * output = el
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir kelime giriniz:");
        String kelime= sc.nextLine();
        if(kelime.length()>=3){
         String soniki=kelime.substring(kelime.length()-2) ;
            System.out.print(soniki+soniki+soniki);
        }else System.out.println("Girilen kelime:"+kelime);



    }
}
