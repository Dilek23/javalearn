package j08_ifStatment_TernaryOperatör;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
       /* Kullanicidan bir sayi alin

        Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
        Eger 10 dan buyuk ise "Buyuksun!" yazdirin
        Eger 10 dan kucuk ise "Normalsin!" yazdirin

        Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
        Eger -10 dan buyuk ise "Negatifsin!" yazdirin
        Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin */
        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= sc.nextInt();
        System.out.println(sayi>0?(sayi<=10?"Normalsin..":"buyuksun..."):(sayi>=-10?"Negatifsin":"Coook Negaitfsin..."));
    }
}