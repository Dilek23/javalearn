package j04_Aritmetikoperatorler.Task3;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /*    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         bölümünü print eden code create ediniz. */
        Scanner sc=new Scanner(System.in);
        System.out.println("İki tane sayı giriniz:" );
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("num1/num2 = " +(num1/num2));


    }
}
