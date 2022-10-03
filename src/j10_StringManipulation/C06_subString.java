package j10_StringManipulation;

import java.util.Scanner;

public class C06_subString {
    public static void main(String[] args) {
/*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */
  String str="Java bilen sırtı yere gelmez : )";
        System.out.println(str.substring(10));// sırtı yere gelmez:)
        // son on karakterini print ediniz.
        System.out.println(str.substring(str.length() - 10));

        // ilk on karakterini print ediniz.
        System.out.println(str.substring(0,10 ));

        // ilk karakteri nsıl olur
        System.out.println(str.substring(0,1));

// girilen 4 harfli kelimeyi tersten yazdırınız.

        Scanner sc=new Scanner(System.in);
        System.out.print("4 harfli kelime giriniz:");
        String kelime= sc.next();
        if(kelime.length()!=4){
            System.out.println("4 harfli kelime gir...");
        }else {
            System.out.print(( kelime.substring(kelime.length()-1)));
            System.out.println((kelime.substring(2,3)));
            System.out.print(kelime.substring(1,2));
            System.out.print(kelime.substring(0,1) );
        }





    }
}
