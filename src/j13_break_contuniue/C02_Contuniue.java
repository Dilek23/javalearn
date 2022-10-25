package j13_break_contuniue;

import java.util.Scanner;

public class C02_Contuniue {
    public static void main(String[] args) {
        /*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.

 */

// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("bir mail hesabı giriniz");
        String mail=sc.nextLine();
        for(int i=0;i<mail.length();i++){
            char c=mail.charAt(i);
            if(c==' ')continue;
            System.out.print(c);
        }


    }
}
