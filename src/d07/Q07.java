package d07;

import java.util.Scanner;

public class Q07 {
/*
 Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
 ve x girildiğinde ise "Program bitti" yazan programı yazınız.
 */
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    char c;
    do{
        System.out.print("bir harf giriiniz");
        c=sc.next().toLowerCase().charAt(0);
        System.out.println("Program çalışıyor");

    }while (c!='x');
    System.out.println("program bitti");
}
}
