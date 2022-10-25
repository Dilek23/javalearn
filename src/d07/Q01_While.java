package d07;

import java.util.Scanner;

public class Q01_While {
// girilen sayının basamaklarındaki rakamların toplamını bulunuz.
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Bir sayı giriniz:");
    int sayi=sc.nextInt();
    System.out.println(basamaktopla(sayi));

}

    private static int basamaktopla(int sayi) {
    int toplam=0;
    while (sayi!=0){
        toplam+=sayi%10;
        sayi/=10;
    }
        return toplam;

    }
// do while ve for ile çözüm



}


