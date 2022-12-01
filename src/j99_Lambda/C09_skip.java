package j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış return eder.
public class C09_skip {
    public static void main(String[] args) {
        List<String> menu=new ArrayList<String>(Arrays.asList("küşleme","soganlı","küşleme","trilece","soganlı","bicibici","buryan","cacix","menemen","yaglama","guvec"));
        System.out.println("\n***");





    }//main sonu
    //Task: list elemanlarnı son harfine göre sıralayıp ilk iki eleman hariç kalan elemanlarını print ediniz

    public static void ilkIkiHrcSonHrfSıralıElPrint(List<String> menu) {
        System.out.println(
                Arrays.asList(
                        menu.
                                stream().
                                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).//akısdaki elelmanların son karakrerine göre sıralanadı
                                skip(2).//akısdaki ilk 2 eleman akısdan atıldı
                                toArray()//akıs elelmalanrı bir arraya atanadı
                )
        );

        menu.
                stream().
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).//akısdaki elelmanların son karakrerine göre sıralanadı
                skip(2).forEach(t-> System.out.print(t+" "));//akısdaki ilk 2 eleman akısdan atıldı


    }


}
