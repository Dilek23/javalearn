package j08_ifStatment_TernaryOperatör;

import java.util.Scanner;

public class C05_TernaryOpertor {
    public static void main(String[] args) {
// TASK-> girilen bir tamsayı çiftse yarısını değilse
// "girilen sayı tek oldugu için yarısı tamsayı değildir" print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("bir tam sayı girin");
        int sayi= sc.nextInt();
       // String sonuc=(sayi%2==0?sayi/2:"girilen sayı tek oldugu için yarısı tamsayı değildir")
    /*
    TRICK-> ternary iki durum (T/F)için iki frklı data typa çıktısı veriyorsa variable atama yapılmalı
    yada ternary çıktıı aynı data tip cast edilmeli...

     */
        System.out.println(sayi%2==0? sayi/2:"girilen sayı tek olduğu için yarısı tam sayı deldir");

    }
}
