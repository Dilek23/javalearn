package j08_ifStatment_TernaryOperatör;

import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class C03_TernaryOperator {
    public static void main(String[] args) {

/* Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
 ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
 Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
 daha basic code'lar bulunur.

 */
        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        Scanner sc= new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz:");
        int sayi= sc.nextInt();
        System.out.println("**** if-else ***");
         if(sayi%2==0){
             System.out.println("sayi çift");
         }else System.out.println("sayi tek");

        System.out.println("*** ternary ***");
      // String sonuc= ( sayi%2==0? "sayimiz çift":"sayimiz TEK");
        //System.out.println("sonuc = " + sonuc);
        System.out.println( sayi%2==0? "sayimiz çift":"sayimiz TEK");
/*
 ternary operatör işlem sonucunda true veya false göre çıktı verir.
 Eğer bu çıktı type göre bir variable atanmazsa sout ile doğrudan print edilmeli.
 */
        // TASK02 -> girilen bir tamsayının negatif olmasını kontrol eden code create ediniz.


    }
}
