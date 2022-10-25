package d07;

import java.util.Scanner;

public class Task_Continue {
    public static void main(String[] args) {
  /*
    Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
    atlar ve loop’un bir sonraki değerinden devam eder.
     */
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir string ifade giriniz:");
        String s= sc.nextLine();

        for (int i=0;i<=s.length()-1;i++){
            if (s.charAt(i)=='a'||s.charAt(i)==' ')continue;
            System.out.println(s.charAt(i));

        }



    }
}
