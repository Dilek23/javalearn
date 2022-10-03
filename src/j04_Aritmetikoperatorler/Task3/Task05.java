package j04_Aritmetikoperatorler.Task3;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("lütfen bir saat degeri giriniz:");
        int saat= sc.nextInt();

        System.out.println("Girdiginiz saat degeri= "+saat*60+"dakika" + saat*3600 + " saniye yapar");



    }

}
