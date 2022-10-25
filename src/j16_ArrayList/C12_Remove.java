package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_Remove {
    public static void main(String[] args) {
        // remove list ten istenen elemeanı siler.
        ArrayList<String> listSehir=new ArrayList<>(List.of("Stockholm","LosAngeles","Londra","Munih"));
        System.out.println("listSehir.remove(\"angara\") = " + listSehir.remove("angara"));
        System.out.println("listSehir.remove(\"Londra\") = " + listSehir.remove("Londra"));
        System.out.println("listSehir.remove(\"1\") = " + listSehir.remove(1));
        System.out.println("listSehir = " + listSehir);
        
        listSehir.add("Münih");
        listSehir.add("Angara");
        listSehir.add("Münih");
        System.out.println("listSehir = " + listSehir);
        listSehir.remove("Münih");//  tekrarlı eleman varsa soldan ilk index elemanını siler digerlerini silmez
        System.out.println("listSehir = " + listSehir);
        ArrayList<String>listUlke=new ArrayList<>(List.of("Almanya","America","Isvec"));
        listSehir.addAll(listUlke);
        System.out.println("listSehir = " + listSehir);
listSehir.removeAll(listUlke);// sehir listten ulke list cıkarıldı.Removeall içinden bir eleman degil liste cıkartır.
        System.out.println("listSehir = " + listSehir);
        listUlke.removeAll(listSehir);
        System.out.println("listUlke = " + listUlke);// ulke listine sehir olmadıgı için list degismez


    }
}
