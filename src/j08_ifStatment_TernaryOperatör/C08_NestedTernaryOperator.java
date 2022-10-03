package j08_ifStatment_TernaryOperatör;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {
/*
 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("ürün miktarı girin:");
        int ürünmktr= sc.nextInt();
        System.out.println("ürün fiytı girin:");
        int fiyat= sc.nextInt();
        double fatura=ürünmktr>100?(ürünmktr*fiyat*0.67):ürünmktr*fiyat;
        System.out.println("fatura = " + fatura);

    }
}
