package J03_ScannerClass_typeCasting.Task2;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("a sayısını giriniz:");
        double a = sc.nextDouble();
        System.out.println("b sayısını giriniz:");
        double b = sc.nextDouble();
        System.out.println("c sayısnı giriniz:");
        double c = sc.nextDouble();

        String sonuc = sc.nextLine();
        System.out.println("sonuc=(a^2-b^2)/3*c");

        System.out.println("işlem sonucunuz=" + ((a * a) - (b * b)) / (3 * c));




    }
}





