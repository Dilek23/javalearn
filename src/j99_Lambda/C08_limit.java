package j99_Lambda;

import java.util.*;
import java.util.stream.Stream;

public class C08_limit {
    public static void main(String[] args) {
        //limit(a)akışdan çıkan eelemanları a parametresani gore ilk elemanı alır
        List<String> menu=new ArrayList<String>(Arrays.asList("küşleme","soganlı","küşleme","trilece","soganlı","bicibici","buryan","cacix","menemen","yaglama","guvec"));
        krktrSayisiEnbyk(     menu);
        System.out.println("\n***");
    }//main sonu
    //Task: Karakter sayisi en büyük elamanı yazdirin.
public static void krktrSayisiEnbyk(    List<String> menu){
       Stream<String> enBykKrktr=menu.stream()
                .sorted(Comparator.comparing(String::length).reversed()).limit(1);//akıştaki ilk ! eleman alındı
  //  System.out.println(enBykKrktr);// biza referans degerini yazdırır.->limt metod bir sstream akış returnder
    //dolayısıyla dogrudan sout ile print edilemez.limit çıktısı list veya array gibi bir coll
  //  System.out.println(enBykKrktr);// biza referans degerini yazdırır.
    System.out.println(Arrays.toString(enBykKrktr.toArray()));
    System.out.println("   ***   ");


    Object[] enbykKrktrarr = menu.
            stream().
            sorted(Comparator.comparing(String::length).reversed()).
            limit(1).//akısdaki ilk 1 eleman alındı
                    toArray();//akısdaki elemanlar array'a atandı

    System.out.println(Arrays.toString(enbykKrktrarr));

    Optional<String> enBykKarktr2 = menu.
            stream().
            sorted(Comparator.comparing(String::length).reversed()).
            findFirst();//akısdaki ilk 1 eleman alındı
}

}
