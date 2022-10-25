package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_sublist {
    public static void main(String[] args) {
        ArrayList<String> listSehir=new ArrayList<>(List.of("Stockholm","LosAngeles","Londra","Munih","Angara","Elazig"));
        System.out.println(listSehir.subList(3, 5));// 3 ve 4 . index elemanları
ArrayList<String>city=new ArrayList<>(listSehir.subList(2,5));
        System.out.println("city = " + city);

    }
}
