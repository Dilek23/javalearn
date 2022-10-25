package d10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10_ArrayList {
    public static void main(String[] args) {
        /*
A list has elements "H", "G" and "E"
Ask user to enter a letter
If the letter exists in list convert it to "Got it"
otherwise add it to the list.
Example : [H, G, E]
                Enter a letter :  h
                [Got It, G, E]
                Enter a letter :  a
                [H, G, E, A]
      */


        List<String>list=new ArrayList<>();
        list.add("H");
        list.add("G");
        list.add("E");
        System.out.println("list = " + list);

        Scanner sc=new Scanner(System.in);
        System.out.println("bir harf giriniz");
        String letter=sc.next().trim().substring(0,1).toLowerCase();
        if(list.contains(letter)){
            list.set(list.indexOf(letter),"Got it" );
        }else
            list.add(letter);
        System.out.println(list);
    }


}
