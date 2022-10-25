package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {
//get(); listte istenen elemanı return edder.
        ArrayList<String> listSehir=new ArrayList<>(List.of("Stockholm","LosAngeles","Londra","Munih"));
        System.out.println(listSehir.get(1));
        //System.out.println(listSehir.get(11));olmayan index elemanı RTE verir.
    }
}
