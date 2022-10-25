package j17_forEachLoop.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _07_arraylist7 {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {
        ArrayList<Integer>sayi1=new ArrayList<>(List.of(8,7,9,6,7));
        ArrayList<Integer>sayi2=new ArrayList<Integer>(List.of(12,3,9,6,7,1));

        System.out.println(common_values(sayi1, sayi2));


    }

    private static List<Integer> common_values(ArrayList<Integer> sayi1, ArrayList<Integer> sayi2) {
        List<Integer> common = new ArrayList<>();
        for (int i = 0; i < sayi1.size(); i++) {
            for (int j = 0; j < sayi2.size(); j++) {
                if (sayi1.get(i) == sayi2.get(j) && !common.contains(sayi1.get(i))) {
                    common.add((sayi1.get(i)));
                }
            }
        }
        return common;
    }

    }


