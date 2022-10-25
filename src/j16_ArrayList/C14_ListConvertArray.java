package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class C14_ListConvertArray {
    public static void main(String[] args) {
        // listi arraya cevirme; toArray();
        // 1. yontem->toArray();parametre olarak String[0]olarak yapılır
        ArrayList<String> listUlke=new ArrayList<>(List.of("Almanya","America","Isvec"));
        String arrUlke[]=listUlke.toArray(new String[0]);

        System.out.println(Arrays.toString(arrUlke));
      // 2. yontem oluşturulan Arrayin dat type Object olarak tanır.
      // Object class javada tum clasların parenti (atası)
       // object Class javada parenti olamayan tek classdır.tum vagonları ceken classdır
       // String Integer Classlar Object Class child oldugu için istenen durumlarda data type object class kullanılır


        Object arrUlkeler[]=listUlke.toArray();

        System.out.println(Arrays.toString(arrUlkeler));

    }

}
