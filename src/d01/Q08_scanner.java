package d01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q08_scanner {
    public static void main(String[] args) {
        // kullanıcıdan 2 tam sayı alılm bu tam sayıları topla
        Scanner sc=new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz:");
        int sayi1= sc.nextInt();
        System.out.print("ikinci sayıyı gırın:");
        int sayi2= sc.nextInt();
        int sum=sayi1 + sayi2;
        System.out.println("sum = " + sum);
        
        
    }
}
