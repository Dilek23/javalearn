package j20_PassByValeue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        java non- primitive data turlerinde objen,n kendisi degilde dataları degisirse obj referans ve kendisi
        degismedigi dataları degisikligini kalıcı yapar.
         */
         //Task-> list elemanşarı 24,20,87 iki farklı metod ile list elemanlarını update edip prit et.
        // 1. metod for each 2. metod set()
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(24,23,70));
        listUpdate1(list);
        listUpdate2(list);

        System.out.println("metod sonrası list=" + list);


    }//main
    public static void listUpdate1(ArrayList<Integer> list){
        for (Integer v:list  ) {
           v*=2;
            System.out.println("v = " + v);

        }
        System.out.println();
    }
    public static void listUpdate2(ArrayList<Integer> list){
        for (int i = 0; i <list.size() ; i++) {
list.set(i, list.get(i)*2);
        }
        System.out.println("list = " + list);
    }

}
