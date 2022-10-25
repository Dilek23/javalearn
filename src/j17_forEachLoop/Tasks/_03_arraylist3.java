package j17_forEachLoop.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {
        ArrayList< String>cİty=new ArrayList<>(List.of("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));
        System.out.println("getLength(cİty) = " + getLength(cİty));

    }

    private static ArrayList<Integer> getLength(ArrayList<String> a) {
        ArrayList<Integer>list=new ArrayList<>();

        for (String value:a ) {
           list.add(value.length() );

        }
        return list;
    }
}