package Task8;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
Scanner sc=new Scanner(System.in);
        System.out.print("lütfen mailinizi giriniz:");
    String mail= sc.nextLine();
   kontrol(mail);


    }
    public static String kontrol(String hesap){
        if(hesap.contains("@")&&hesap.contains(".")){
            System.out.println("mail adresi geçerli");
        }else System.out.println("geçersiz mail girdiniz");
return hesap;
    }



}