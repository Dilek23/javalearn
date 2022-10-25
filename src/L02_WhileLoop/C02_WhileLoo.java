package L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoo {
    public static void main(String[] args) {
        // girilen tam sayının rakamları toplamını print eden METHOD creat et.
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz");
        int sayi = sc.nextInt();
        System.out.println(raKAmTopla(sayi));


    }//Main

    private static int raKAmTopla(int sayi) {
        int RaKamtoplamı = 0;
        while (sayi > 0){
            RaKamtoplamı += sayi % 10;
        sayi /= 10;
    }
        return RaKamtoplamı;
}
}








 



