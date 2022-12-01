package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_match {
    public static void main(String[] args) {


        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "soganlı", "küşleme", "trilece", "soganlı", "bicibici", "buryan", "cacix", "menemen", "yaglama", "guvec"));
        hrfSayisi7denAzKntrl(   menu );
        System.out.println("\n***");
        xİleBaslayanKontrol( menu );
//anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
//allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
//noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
//Task List elemanlarının karakter sayısını 7 ve 7 den az olmadurumunu kontrol ediniz.->(allmatch)


    }
    public static void hrfSayisi7denAzKntrl(  List<String> menu ){
      boolean kontrol= menu.stream().allMatch(t->t.length()<=7);
      if (kontrol){
          System.out.println("Menüdekiler 7ve daha az karakterden oluşuyor...");
      }else System.out.println("menüdekiler 7 karakterden fazla:(");
    }


//Task-> list elemanlarının "w" ile başlamasını kontorl edin-> noneMatch

public static void wİleBaslayanKontrol(List<String> menu ){


}


//Task: List elemenalarının "x"ile biten enaz bir elemanını kontrol eden
public static void xİleBaslayanKontrol(List<String> menu ) {
    System.out.println(menu.stream().anyMatch(t->t.toLowerCase().endsWith("x"))?"cacix olmaz":"x ile biten kelime yok");
}
}
