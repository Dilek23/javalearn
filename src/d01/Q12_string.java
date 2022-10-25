package d01;

import java.util.Scanner;

public class Q12_string {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
// ve girilen kelimeyi tersten yazdirin
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str= sc.nextLine().toLowerCase();
        System.out.println(xyzVarmi(str));



    }

    private static boolean xyzVarmi(String str) {
        if (str.contains("xyz")){
            return true;
        }else
            return  false;

    }
}
