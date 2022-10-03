package j04_Aritmetikoperatorler.Task3;

import java.util.Scanner;

public class _11_ArithmeticOperator_reminder1 {

    public static void main(String[] args) {

        /*  Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.

           int sonucu yazdırın.  */
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir numara giriniz:");
        int num1= sc.nextInt();
        System.out.println("bir numara daha giriniz:");
        int num2= sc.nextInt();
        int b=(num1%num2);
        int kalan=b;
        System.out.println(" bölümünden kalan = " + kalan);


    }
}
