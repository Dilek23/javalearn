package J03_ScannerClass_typeCasting.Task2;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen gunde kaç saat uyduğunuzu girin: ");
        int uyku= sc.nextInt();
        System.out.println("Ayda: " +(uyku*30)+"yılda:"+((uyku*30)*365)+"40 yılda:"+((uyku*30)*365*40) +" "+"Gününüz uykuda geçiyor!!!");

    }
}
