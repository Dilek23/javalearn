package j35_Collections;

import java.util.TreeSet;

public class Deneme {
    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>();

        tSet.add("C");

        tSet.add("B");

        tSet.add("C");

        tSet.add("A");

        for (String w : tSet){

            System.out.print(w + " ");

        }
    }
}
