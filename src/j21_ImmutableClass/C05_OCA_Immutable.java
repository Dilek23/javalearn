package j21_ImmutableClass;

import java.util.ArrayList;

public class C05_OCA_Immutable {
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        //list.add(7);  CTE verir

        for (String s : list) System.out.println(s);

    }
}