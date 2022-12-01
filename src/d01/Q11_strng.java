package d01;

import java.util.Scanner;

public class Q11_strng {
    public static void main(String[] args) {
// Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        Scanner sc=new Scanner(System.in);
        System.out.println("isim gir:");
        String name= sc.nextLine();
        System.out.println("Soyisim gir:");
        String surname= sc.nextLine();
        System.out.println(name.length()>surname.length()?"adınız soyadınızdan uzun":"soyadınız adınızdan uzun");


    }
}
