package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_set {
    public static void main(String[] args) {
        // set metodu listin itenen elemanını istenen indexe update eder.
        ArrayList<String> listSehir=new ArrayList<>(List.of("Stockholm","LosAngeles","Londra","Munih"));
        System.out.println(listSehir.set(3, "Angara"));
        System.out.println(listSehir);
       // System.out.println(listSehir.set(11, "pataGonya"));olmayan index set edilirse rte verir
        //System.out.println(listSehir);


    }
}
