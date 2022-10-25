package Task_WhileLoop_odeveler;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */
Scanner sc=new Scanner(System.in);

        int toplam=0;
        int adet=0;
        while (toplam<=333){
            System.out.print("lütfen bir sayı gir=");
            int sayi= sc.nextInt();
            toplam+=sayi;
            adet++;
        }
        System.out.println("Girdiginiz sayıların toplamı:"+toplam+"\nsayı adedi :"+adet);
    }
}
