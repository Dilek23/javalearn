package j36_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
         /*
    ismi update() olan bir method oluşturun.
    Parametreleri , Integer -String HashMap,  int ve String olmalı. (3ayrı parametre)
    return tipi  Integer - String HashMap
    Eğer HashMap, int olan parametreyi içeriyorsa,
    int değerinde var olan String'i güncelleyin.
    Örnek :
     Hash map:
    1, "New jersey"
    2, "New York"
    3, "London"
    4, "Paris"
​
    int = 3
    String = Miami
    cevap aşağıdaki gibi olmalı:
    1, "New jersey"
    2, "New York"
    3, "Miami"
    4, "Paris"
     */

        Map<Integer,String>hm=new HashMap<>();
        hm.put(1,"New jersey");
        hm.put(2,"New york");
        hm.put(3,"Paris");
        hm.put(4,"London");
        Scanner sc=new Scanner(System.in);
        System.out.print("sayi gir:");
        int sayi=sc.nextInt();
        System.out.print("sehir gir: ");
        String sehir=sc.next();
        System.out.println("update(sayi,sehir,hm) = " + update(sayi, sehir, hm));

    }// mainsonu

    private static  Map<Integer,String>update(int sayi, String sehir, Map<Integer, String> hm) {
        if(hm.containsKey(sayi))
        hm.put(sayi, sehir);
        return hm;
    }


}
