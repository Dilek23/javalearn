package j08_ifStatment_TernaryOperatör;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /*
girilen bir yılın artık olmasını kontrol eden code create ediniz..
    artık yıl:
    Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
    Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
    Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
 */
        Scanner sc=new Scanner(System.in);
        System.out.print("lütfen bir yıl giriniz:");
        int yıl= sc.nextInt();
        if(yıl%4==0 && yıl%100!=0|| yıl%400==0){
            System.out.println("girdiğiniz yıl artık yıl");
        }
        else {
            System.out.println("artık yıl değildir:(");
        }


    }
}
