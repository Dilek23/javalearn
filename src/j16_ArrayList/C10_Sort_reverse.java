package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C10_Sort_reverse {
    public static void main(String[] args) {
       // collections.sort(list) verilen listeyi naturel sıralama yapar.
       // Collections.reverse(list) verilen listin ters sıralamasını return eder.
        ArrayList<String> listSehir=new ArrayList<>(List.of("Stockholm","LosAngeles","Londra","Munih"));
        System.out.println("listSehir = " + listSehir);// sıralama öncesi
        Collections.sort(listSehir);// sort metodu sout içinde çalışmaz
        System.out.println("listSehir = " + listSehir);// sıralaama sonrası Alfabetik sıralar.
     Collections.reverse(listSehir);
        System.out.println("listSehir = " + listSehir);// ters sıra sonrası
        ArrayList<String> listUlke=new ArrayList<>(List.of("Almanya","America","Isvec"));
        System.out.println("listUlke = " + listUlke);// ters öncesi = [Almanya, America, Isvec]
        Collections.reverse(listUlke);
        System.out.println("listUlke = " + listUlke);// ters sıralama sonrası [Isvec, America, Almanya]
        // ters sıralamada küçük harfli varsa önce küçük harfliyi koyar
    }
}
