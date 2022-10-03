package j08_ifStatment_TernaryOperatör;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {

/*
TASK :
 Girilrn bir pozitif tamsayı pozitif tamsayı 4 basamaklı ise  "4 Basamaklı" print eden
 4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "4 basamaklı olmayan tek sayı yazdırın."
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("bir tam sayı girin");
        int sayi= sc.nextInt();
        System.out.println((sayi>999&& sayi<10000)?"4 basamaklı":sayi%2==0?"dört basamaklı olmayan çift sayı":"4 basamaklı olmayan tek sayı yazdırın.");




    }
}
