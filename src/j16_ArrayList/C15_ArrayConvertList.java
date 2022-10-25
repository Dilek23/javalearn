package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {
        // King of Trick: Arraydan cevirilen list aray kaynaklı oldugu için array davranısı gösterir.boyut sabittir.remove add metod calısmaz.
        String arrjavaCan[] = {"Akif", "Gamze", "Musty", "Sevdenur"};
        List<String> listJavaTar = Arrays.asList(arrjavaCan);
        System.out.println(listJavaTar);
        System.out.println("listJavaTar.size() = " + listJavaTar.size());
        // listJavaTar.add("sefilCan Haluk");// arraya eleman eklenmez:(RTe htası verir
        // Kral Trick->list data type Arraylist tanımlanırsa Rte vermez kaynagı arrayde olsa list davranır byut esnekligi yapar.
        ArrayList<String> listJavaTar1 = new ArrayList<>(Arrays.asList(arrjavaCan));
        listJavaTar1.add("sefil haluk");
        System.out.println("listJavaTar1 = " + listJavaTar1);
        
        
    }
    }

