package j35_Collections;

import java.util.LinkedList;

public class C02_LinkesList {
    public static void main(String[] args) {
        LinkedList <Object> list = new LinkedList<>();// Datatype Object ->ne olursan ol gel
        //Bad practice app.yi çok yavaşlatır tavsiye edilmez
        list.add("Nazım");
        list.add('$');
        list.add(1453);
        System.out.println("list = " + list);

    }
}
