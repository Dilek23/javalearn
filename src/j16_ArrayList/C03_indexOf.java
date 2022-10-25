package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        // indexof();  list içinde istenen elamanın index degerini return dder.
        ArrayList<String> listUlke=new ArrayList<>(List.of("Almanya","America","Isvec"));
        ArrayList<String> listSehir=new ArrayList<>(List.of("Stockholm","LosAngeles","Londra","Munih"));
    listSehir.indexOf("londra");
        System.out.println("listSehir.indexOf(\"Londra\") = " + listSehir.indexOf("Londra"));
    listUlke.add("America");
        System.out.println("listSehir = " + listSehir);
        System.out.println(listUlke.indexOf("America"));// tekrarlı elemanlarda ilk bulunan elemanı return eder.
        System.out.println(listUlke.lastIndexOf("America"));// sagdan sondan ilk bulunan elamanı indexi yazar


    }
}
