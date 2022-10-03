package j04_Aritmetikoperatorler.Task3;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*     /*    kullanıcıdan alınan 4 tane int
         toplamını print eden code create ediniz. */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen dört tane sayı giriniz:");
        int sayi1= sc.nextInt();
        int sayi2= sc.nextInt();
        int sayi3= sc.nextInt();
        int sayi4= sc.nextInt();

        System.out.println("sayi1+sayi2+sayi3+sayi4="+(sayi1+sayi2+sayi3+sayi4));



    }
}
