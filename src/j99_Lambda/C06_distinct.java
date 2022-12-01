package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_distinct {
    public static void main(String[] args) {
        List<String> menu=new ArrayList<String>(Arrays.asList("küşleme","soganlı","küşleme","trilece","soganlı","bicibici","buryan","cacix","menemen","yaglama","guvec"));
        bykTekrarsz(menu);
        System.out.println("\n***");
        krktTerssSrl( menu);
        System.out.println("\n***");
        kcktnByge( menu);
        System.out.println("\n***");
        sonHarf( menu);
    }//Main sonu
//Task: List elemanlarını alfabetik buyuk harf ve tekrarsız print ediniz.
    public static void bykTekrarsz(List<String> menu){
        menu.stream().
                map(String::toUpperCase).sorted().// hepsini byk harf yapıp alfabetik sıraladık
                distinct().forEach(t-> System.out.print(t+" "));//distinc benzer elemanları siler tekrarsız sıralar


    }
//Task-> list elemanlarını karakter sayısını ters sıralı olarak tekrarsız print et.
    public static void krktTerssSrl(List<String> menu){
       menu.stream().
       map(String::length).// string elemanlar karakter sayısına updae edildi.
        sorted(Comparator.reverseOrder()).
               distinct().forEach(t-> System.out.print(t+" "));

    }
// Task-> list elemanlarını karakter sayisina göre k->b göre sırala
public static void kcktnByge(List<String> menu){
      menu.stream().sorted(Comparator.comparing(String::length)).//akıstaki string elemanların lenghtine göre doğla sıralandı
              forEach(t-> System.out.print(t+" "));

}
//Task-> list elemanlarını son harfine göre ters sıralı printt et

    public static void sonHarf(List<String> menu){
        menu.stream().
                sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).forEach(t-> System.out.print(t+" "));
    }
   // Task->: listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...
   public static void charKaresiCiftElSirala(List<String> menu) {
       menu.
               stream().//akısa alndı
               map(t -> t.length() * t.length()).//akısdaki string elemanları boyutlarının karesine update edildi
               filter(C01_LambdaExpression::ciftMi).//cift elelmalar filtrelendi
               distinct().//tekrarsız yapıldı
               sorted(Comparator.reverseOrder()).//ters b->k sıra yapıldı
               forEach(C01_LambdaExpression::yazdir);// print edildi
   }


}
