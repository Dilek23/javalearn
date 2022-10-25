package d09.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */

        ArrayList<String>names=new ArrayList<>(List.of("ayse","fatma","hayriye"));
        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen bir isim giriniz:");
        String isim= sc.nextLine().toLowerCase().trim().replace(" ","");
        if(!names.contains(isim)){
            System.out.println(isim);
            names.add(isim);
            System.out.println(names);
        }else
            System.out.println(isim+(int)(Math.random()*100));







    }

}
