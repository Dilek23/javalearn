package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_nCopy {
    public static void main(String[] args) {
        ArrayList<String> listUlke=new ArrayList<>(List.of("Almanya","America","Isvec"));
        ArrayList<String> listSehir=new ArrayList<>(List.of("Stockholm","LosAngeles","Londra","Munih"));

//nCopies(int,obj); int elemanlı bir 
        ArrayList<String> yeniList=new ArrayList<>(Collections.nCopies(3,"javaCAN"));
        System.out.println("yeniList = " + yeniList);
    //addAll(); bir liste diger şisti oldugu gibi ekler.
        listUlke.addAll(listSehir);// ulke list sonuna sehir list tamamen ekler
        System.out.println("listUlke = " + listUlke);
listSehir.addAll(3,listUlke);// 3. indexteki itibaren ulke sehir liste tamamen eklendi
        System.out.println("listSehir = " + listSehir);
// Task-> 1 den 10 a kadar sayılara bir liste tayıp print eden code creat et.
       ArrayList<Integer>listSayi=new ArrayList<>();
       for(int i=1;i<=10;i++){
           listSayi.add(i);
       }
        System.out.println("listSayi = " + listSayi);   
    }
}
