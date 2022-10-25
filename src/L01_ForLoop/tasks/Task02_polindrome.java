package L01_ForLoop.tasks;

import java.util.Scanner;

public class Task02_polindrome {
    public static void main(String[] args) {
     // girilen ifadenin polindrome olmasını kontorl eden metod creat ediiniz.
        // polindrome her iki yonde okundugunda esit olan ifadeler.
     // ey edip adanada pide ye.

        Scanner sc= new Scanner(System.in);
        System.out.println("lütfen metin giriniz");
    String str= sc.nextLine();
        polindrome(str);// String prametreli method call


    }// main dışı

    private static void polindrome(String str) {
    String tersStr="";// bos bir String kutu
    for(int i=str.length()-1;i>=0;i--){
        System.out.println(tersStr += str.charAt(i));
    }
        System.out.println("girilen ifadenin tersi:"+tersStr);
if(str.equalsIgnoreCase(tersStr)){
    System.out.println("girilen ifade polindrome");
}else System.out.println("girilen ifade polindrome degil");


    }
}
