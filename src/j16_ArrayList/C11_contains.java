package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {
        // contains istenen eşemanın varlıgını control eder T/F verir

        ArrayList<String> listSehir=new ArrayList<>(List.of("Stockholm","LosAngeles","Londra","Munih"));
        System.out.println("listSehir.contains(\"Londra\") = " + listSehir.contains("Londra"));
        System.out.println("listSehir.contains(\"ankara\") = " + listSehir.contains("Ankara"));


    }
}
