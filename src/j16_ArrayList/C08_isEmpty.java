package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty {
    public static void main(String[] args) {
        //is Empty listin bos olmasını kontorl eder true/ false return eder.
        // elemanları siler.
        ArrayList<String> listSehir=new ArrayList<>(List.of("Stockholm","LosAngeles","Londra","Munih","Angara","Elazig"));
        System.out.println(listSehir);
        System.out.println(listSehir.isEmpty());// list boslugu kontrol edildi
        listSehir.clear();// list temizlendi
        System.out.println("listSehir = " + listSehir);
        System.out.println(listSehir.isEmpty());

    }
}
