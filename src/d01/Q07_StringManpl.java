package d01;

import java.util.Scanner;

public class Q07_StringManpl {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
       String s="abcdxyzi";
       boolean xyziçerirmi=false;
       if (s.contains("xyz")){
           xyziçerirmi=true;

       }else {
           xyziçerirmi=false;
           System.out.println(xyziçerirmi);
       }
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 kelime giriniz");
        String s = scanner.next();
        System.out.println(s.contains("xyz"));



        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.next().toLowerCase();
        System.out.println(s.contains("xyz") ? "true" : "false");

*/
    }
}
