package J03_ScannerClass_typeCasting.Task2;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("İsim ve Soyisminizi giriniz:");
        String adSoyad= sc.nextLine();
        System.out.println("Lütfen yaşınızı giriniz:");
        int yas= sc.nextInt();
        System.out.println("Lütfen boyunuzu giriniz:" );
        double boy= sc.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz:");
        double kilo= sc.nextDouble();
        System.out.println("Clarusway spor salonuna kaç ay devam edeceksiniz:");
        int ay= sc.nextInt();
        String ucret= sc.nextLine();
        System.out.println("ucret = " + "20$");




        ;









    }
}
