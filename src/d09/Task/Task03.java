package d09.Task;

import javax.security.sasl.SaslClient;
import java.util.*;

public class Task03 {
    public static void main(String[] args) {
         /*
		A list has elements “H”, “G” and “E”
		Ask user to enter a letter
		If the letter exists in list convert it to "Got it"
		otherwise add it to the list.
		Example : [H, G, E]
                  Enter a letter :  h
                  [Got It, G, E]
                  Enter a letter :  a
                  [H, G, E, A]
        */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a letter : ");
        String harf=sc.nextLine().toUpperCase();

        List <String> str=new ArrayList<>(List.of("H","G","E"));

        if (!str.contains(harf)) {
            str.add(harf);
            System.out.println(str);
        }
        else {
            Collections.replaceAll(str,harf,"Got it");
            System.out.println(str);

          }
        }
        }




