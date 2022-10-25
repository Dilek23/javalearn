package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_size {
    public static void main(String[] args) {
        // size-> listin eleman sayısını return eder.
        ArrayList<String> listSehir=new ArrayList<>(List.of("Stockholm","LosAngeles","Londra","Munih"));
        System.out.println(listSehir.size());//4 indexi degil o yuzden sıfırdan saymaz 4. elemanı yazar


    }
}
