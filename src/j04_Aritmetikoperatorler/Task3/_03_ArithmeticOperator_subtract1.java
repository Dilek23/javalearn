package j04_Aritmetikoperatorler.Task3;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*     /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen iki adet numara giriniz:");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("girdiğiniz iki sayının farkı : " + (num2-num1));



    }
}
