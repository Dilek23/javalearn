package deneme1;

import java.util.ArrayList;

public class Iterator02 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();

        list.add("X");

        list.add("Y");

        list.add("Z");



        for(String w : list) {

            w = w + "!";

        }

        System.out.println(list);

    }

}