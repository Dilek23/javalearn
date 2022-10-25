package j17_forEachLoop.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
        ArrayList<String>cİty=new ArrayList<>(List.of("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
        System.out.println("rotateList(cİty) = " + rotateList(cİty));

    }

    private static  ArrayList<String> rotateList(ArrayList<String> cİty) {
        ArrayList<String>list=new ArrayList<>();
        Collections.reverse(cİty);

        list.add(String.valueOf(cİty));
      return list;
    }
}

