package j35_Collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
        Task->

         */
        LinkedList<String>ll1=new LinkedList<>(Arrays.asList("Tugba","Gülsüm","Merve"));
        Scanner sc=new Scanner(System.in);
        System.out.println("aradıgınız ismi girin");
        String kişi=sc.next();
        if (ll1.remove(kişi)){// true-> istenen node var ve silindi
            System.out.println("\"Elelman silindi...\" = " + "Elelman silindi...");
            System.out.println(ll1);
        }else System.out.println("Aradıgınnız kişi yok");
    }
}
