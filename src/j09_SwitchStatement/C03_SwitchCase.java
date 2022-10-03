package j09_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
  // girilen ay numarasına göre kaç gün çektiğni print et.
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir rakam giriniz:");
        int ayNo = sc.nextInt();
        switch (ayNo) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girilen ay 31 gün içerir");
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girilen ay 30 gün içerir");
                break;
            case 2:
                System.out.println("yılınızı giriniz:");
                int yil= sc.nextInt();
                if (yil%4==0) {
                    System.out.println("şubat ayı 29 çeker");
                } else
                        System.out.println("şubat ayı 28 çeker");
                 break;








            default:
                System.out.println("olmadı bir daha:)");
        }
    }
}
