package Task_WhileLoop_odeveler;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz:");
       int sayi1= sc.nextByte();
        System.out.println("Bir tamsayı daha giriniz:");
        int sayi2= sc.nextByte();
        int sayiadedi=0;
    for(int i=sayi1;i<sayi2;i++){
        System.out.print(i+" ");
        sayiadedi++;
    }
        System.out.println("\niki tam sayı arasındaki sayı adedi="+sayiadedi);
    }
}
