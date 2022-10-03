package j08_ifStatment_TernaryOperatör;

import java.util.Scanner;

public class Ex05 {
    /*
    TASK->girilen iki sayıyı seçilen dört işlemden birine uygulayıp sonucu print eden code creat et.


     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("birinci  sayıyı giriniz:");
        double sayi1 = sc.nextDouble();
        System.out.print("ikinci  sayıyı giriniz:");
        double sayi2 = sc.nextDouble();
        System.out.println("+ için -> 1 seciniz \n- için -> 2 seçiniz \n* için -> 3 seciniz\n/ için -> 4 seciniz");

        int secim = sc.nextInt();

        if (secim == 1) {
            System.out.println("toplama sonucu : " + sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
        } else if (secim == 2) {
            System.out.println("cıkarma sonucu : " + sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
        } else if (secim == 3) {
            System.out.println("carpma sonucu : " + sayi1 + "*" + sayi2 + "=" + (sayi1 * sayi2));
        } else if (secim == 4) {
            System.out.println("bolme sonucu : " + sayi1 + "/" + sayi2 + "=" + (sayi1 / sayi2));

        } else System.out.println("agam ne istiyon adam akıllı bişey gir işlemini yapalım");


    }
}
