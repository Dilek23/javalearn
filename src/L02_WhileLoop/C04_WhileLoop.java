package L02_WhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        int sayi1=sc.nextInt();
        System.out.println("Bir tamsayı daha giriniz:");
        int sayi2=sc.nextInt();

        for (int i=sayi1;i<sayi2;i++){

            System.out.print(i+" ");
        }
        System.out.println();



    }
}
