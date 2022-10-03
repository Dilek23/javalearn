package j10_StringManipulation;

import java.util.Scanner;

public class C09_Replace_Replaceall {
    public static void main(String[] args) {
   /* replace içerisindeki karakter yada bir parçasını karakter yada metinle değiştirir.

    */
        String str="javaCAN'lara selam olsun java ile bolcana offer";
        System.out.println(str.replace('a', '@'));
        System.out.println(str.replace("can","kan"));
        System.out.println(str.replaceFirst("a","@"));
        System.out.println(str.replaceAll("CAN","gül"));

// replaceAll() method u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
//(Regular Expressions)
//   \\s bosluk (
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (a z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler
str="    javaCAN'lara selam olsun:)  java ile 1234566644 offer ***   ";
        System.out.println(str.replaceAll("\\s","+"));
        System.out.println(str.replaceAll("\\S","+"));
        System.out.println(str.replaceAll("\\w","+"));
        System.out.println(str.replaceAll("\\W","+"));
        System.out.println(str.replaceAll("\\d","+"));
        System.out.println(str.replaceAll("\\D","+"));
        /*
        girilen ismini soyismini ve 16 haneli kedi kartı no bilgilerini print et.
        isim soyisim:m*** b***
        kart no*******
         */
     String isim="Cigdem";
     String soyad="Şen";
   String karTno="1234567890123456";
    String yeniIsim= isim.charAt(0)+isim.substring(1).replaceAll("\\w","*");
    String yeNiSoyad=soyad.charAt(0)+soyad.substring(1).replaceAll("\\w","*");
String yeniKart="**** **** **** ****"+karTno.substring(12);

        System.out.println("isim-soyisim"+yeniIsim+yeNiSoyad+"kart no:"+yeniKart);

    }
}
