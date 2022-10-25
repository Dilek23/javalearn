package j11_MethodCreation;

import java.io.SyncFailedException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // girilen iki sayıyı "secilen" dört işleme göre hesaplayan metod creat ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("birinci sayı  gir");
       int sayı1 = (int) sc.nextDouble();
        System.out.print("2. sayıyı giriniz : ");
   int sayı2 = (int) sc.nextDouble();
        System.out.print("işleminizi giriniz : ");
        char islem = sc.next().charAt(0);
islemMEnusu(islem,(int) sayı1,(int) sayı2);

    }// main sonu
public static void islemMEnusu(char ch,int x,int y){
     switch (ch){
         case '+':
             topla(x,y);
          break;
         case '-':cıkar(x,y);
             break;

         case '*':carp(x,y);
             break;
         case '/':bol(x,y);
             break;
         default:
             System.out.println("hatalı secim");
     }



}
    public static void topla(int a, int b) {
        System.out.println("a+b= " + (a + b));
    }

    public static void carp(int a, int b) {
        System.out.println("a*b= " + (a * b));

    }

    public static void cıkar(int a, int b) {
        System.out.println("a-b= " + (a - b));
    }

    public static void bol(int a, int b) {
        System.out.println("a/b= " + (a / b));
    }

}