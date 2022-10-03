package j08_ifStatment_TernaryOperatör;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
         /*
 TASK :
Kullanicidan bir sayi aliniz
Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.iç içe girmiş ternry var
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("bir tam sayı girin");
        int sayi= sc.nextInt();

        System.out.println( sayi>=0?(sayi<10?"Rakam":"pozitif sayı"):"Negtif sayı");// iki soru işareti iki : var



    }
}
