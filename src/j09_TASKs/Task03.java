package j09_TASKs;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo = ");
        int gunNo = oku.nextInt();
        switch (gunNo){
            case 1:
                System.out.println("Girilen gun pazartesi");
            break;

            case 2:
                System.out.println("Girilen gun SALI");
                break;

            case 3:
                System.out.println("Girilen gun ÇARŞAMBA");
                break;

            case 4:
                System.out.println("Girilen gun PERŞEMBE");
                break;
            case 5:
                System.out.println("Girilen gun CUMA");
                break;

            case 6:
                System.out.println("Girilen gun CUMARTESİ");
                break;

            case 7:
                System.out.println("Girilen gun PAZAR");
                break;

            default:
                System.out.println("Yanlış deger girdiniz!!!");
        }



    }
}
