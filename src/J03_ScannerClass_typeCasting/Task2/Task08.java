package J03_ScannerClass_typeCasting.Task2;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen vize1 notunuzu giriniz:");
        int vize1= sc.nextInt();
        System.out.println("Lütfen vize2 notunuzu giriniz:" );
        int vize2= sc.nextInt();
        System.out.println("Lütfen final notunuzu giriniz:");
        int fnl=sc.nextInt();
        System.out.println("Geçme notunuz = " +((vize1)*0.3+(vize2)*0.3+(fnl)*0.7));

    }
}
