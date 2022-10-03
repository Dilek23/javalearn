package d01;

import java.util.Scanner;

public class Q02_StringManpl {
    public static void main(String[] args) {

//Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

//yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("String 1");
        String str1= sc.nextLine();
        System.out.println("String 2");
        String str2= sc.nextLine();
        System.out.println("1. method ile birleşim:" +str1+" "+ str2);
        System.out.println("2.method ile birleşim:"+str1.concat(" "+str2));
        String str1Ilksiz= str1.substring(1);
        String str2Ilksiz=str2.substring(1);
        System.out.println("ilk harf olmadan birleşimi:"+str1Ilksiz+" "+str2Ilksiz);




    }
}
