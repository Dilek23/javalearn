package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String>listIsim=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String>aolamayan=new ArrayList<>();
        for (int i = 0; i < listIsim.size() ; i++) {
            if(!listIsim.get(i).toLowerCase().contains("a")){
                aolamayan.add(listIsim.get(i));
            }

        }

        System.out.println("aolamayan = " + aolamayan);
listIsim.clear();// list isim boşaltıldı.
        listIsim.addAll(aolamayan);
        System.out.println("listIsim = " + listIsim);// biz yeni bir aolmayan list oluşturduk ancak bizden listisim istiyor.

    }
}
