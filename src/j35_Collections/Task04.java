package j35_Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task04 {
    public static void main(String[] args) {
        /*
    Task->
   return tipi linkedhashset olan removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.

    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i return et.
     */
        LinkedHashSet<String>lhs= new LinkedHashSet<>(Arrays.asList("Germany","France","Usa","Canada","Mexico","Brazil"));
        String str1="Germany";
        String str2="Usa";

        System.out.println("removing(lhs,str1,str2) = " + removing(lhs, str1, str2));


    }

    private static LinkedHashSet removing(LinkedHashSet<String> lhs, String str1, String str2) {
        if (lhs.contains(str1) || lhs.contains(str2)){
            lhs.remove(str1);
            lhs.remove(str2);

        }else System.out.println("Aradığınız String set'te bulunmamaktadır.");
        return lhs;




        }

    }



