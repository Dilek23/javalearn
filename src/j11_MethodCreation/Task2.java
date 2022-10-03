package j11_MethodCreation;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
   // girilen ad ve soyadın ilk harfleri buyuk digerlerini kucuk yapan metod creat ediiniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("adınızı giriiniz");
        String ad= sc.nextLine();
        System.out.println("soyadınızı girşiniz");
        String soyad= sc.nextLine();
 isimSoyisimKontrol( ad, soyad);


    }// main sonu

    private static void isimSoyisimKontrol (String ad, String soyad) {
        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println("ad soyas = " + ad+" "+soyad);


    }


}
