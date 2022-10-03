package j08_ifStatment_TernaryOperatör;

import java.util.Scanner;

public class C04_TerenaryOperator {
    public static void main(String[] args) {
// TASK-> girilen bir pozitif tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı girin:");
        int sayi= sc.nextInt();
       // System.out.println(sayi>9?"sayı iki veya daha fazla basamaklı":"sayı tek basamaklı");
        String sonuc=sayi>9? "sayı iki veya daha fazla basamaklı":"sayı tek basmaklı";
        System.out.println(sonuc);

    }
}
