package d12;

import java.time.LocalDate;
import java.util.Scanner;

public class Q04_NumberOfDaysinMonth {
    public static void main(String[] args) {
        /*
Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

INPUT:
Ay Numarasi:
2
Yil :
2016
OUTPUT :
Subat 2016 29 Gundur.
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("Ay no giriniz:");
        int ay=sc.nextInt();
        System.out.println("yılı giriniz:");
       int year=sc.nextInt();
        LocalDate date=LocalDate.of(year,ay,1);
        System.out.println(date.getMonth()+" "+date.getYear()+" "+date.lengthOfMonth());
    }
}
