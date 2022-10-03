package J03_ScannerClass_typeCasting.Task2;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */
        Scanner scn=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (cm) olarak giriniz:");
      int boy= scn.nextInt();

        System.out.println("Lütfen kilonuzu (kg) olarak giriniz:");
      int kilo= scn.nextInt();
        double vki=kilo/(boy*boy);
        System.out.println("vki = " +(int) vki);
        System.out.println("vki = " + vki);
        
        
       
        
    }
}
