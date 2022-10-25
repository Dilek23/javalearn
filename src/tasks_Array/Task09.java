package tasks_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println(" 5 adet sayı sayı giriniz:");
        int sayi[]= new int[5];
        for (int i = 0; i <=sayi.length-1 ; i++) {
            System.out.println(i+". elemanı giriniz");
            sayi[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(sayi));
        for (int i =sayi.length-1; i>=0 ; i--) {
            System.out.print(sayi[i]+" ,");
        }
    }
}
