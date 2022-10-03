package d01;

import java.util.Scanner;

public class Q01_StringManupulation {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
        Scanner sc=new Scanner(System.in);
        System.out.println("ismini ve soyismini gir");
        String firstName= sc.nextLine(),lastName= sc.nextLine();
        String fulname=firstName.concat(" "+lastName).toUpperCase();

        System.out.println("fulname = " + fulname);




    }
}
