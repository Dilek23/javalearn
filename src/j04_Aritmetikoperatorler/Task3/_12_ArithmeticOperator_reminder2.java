package j04_Aritmetikoperatorler.Task3;

import java.util.Scanner;

public class _12_ArithmeticOperator_reminder2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında (num1 ve num2),
            num1'in num2'ye bölümünden kalanı int sonuc'a eşitleyiniz.
            int sonuc'u yazdırınız.  */

        Scanner input=new Scanner(System.in);
        System.out.println("bir numara giriniz: ");
        int num= input.nextInt();
        System.out.println("bir numara daha giriniz: ");
        int num1=input.nextInt();
        System.out.println("bölümünden kalan = " + (num%num1));



    }
}
