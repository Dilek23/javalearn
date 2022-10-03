package j10_StringManipulation;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
/* Task->
Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("Adınızı  giriniz :");
        String ad= sc.nextLine();
        System.out.println("Soyadınızı girin");
        String soyad= sc.nextLine();
        String yeniad=ad.substring(0,1).toUpperCase()+ad.substring(1);
        System.out.println("Adınız = " + yeniad);
       String yenİsOyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1);
        System.out.println("Soyadınız = " + yenİsOyad);



    }
}
