package Task6;

public class C04_Contains {
    public static void main(String[] args) {
        /*
        String iersinde istene stringini varlığını kontrol eder boolean return eder..

         */
      /*  String s1="Enise Hanım başarılı bir Qa tester team lead";

        System.out.println(s1.contains("hanım"));//false
        System.out.println(s1.contains("E"));//true
        System.out.println(s1.contains(" "));//true


        String s2="Qa";

        System.out.println(s1.contains(s2));//true
        System.out.println(s2.contains(s1));//false
// task-> girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz->ternary kullanınız
*/
String diller="ingilizce,fransızca,ispanyolca,türkçe";
        System.out.println(diller.contains("arapça"));
        System.out.println(diller.trim());
       // System.out.println(diller.replace("ispanyolca","arapça"));
        //String bilgi=" ben javayı sevmiyorum";
        // System.out.println(bilgi.replace("sevmiyorum","seviyorum"));
        // System.out.println(bilgi.replace(" ",""));
        String isim1="beyza";
        String isim2="ali";
        System.out.println(isim1.compareTo(isim2));// yazılan ilk string ile 2.Stringi karşılaştırır. alfabe sıralamasına göre
        //ilk st, 2. stringden önce geliyorsa konsolda negatif değer cıkar. 2. str ilk strden önce ise pozitif deger çıkar eşit ise sonuç 0 çıkar.



    }

}
