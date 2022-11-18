package d10;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_RandomCarp {
    public static void main(String[] args) {
        /*
        kullanıcıdan istenilen boyutta random sayı alarak bir liste olusturunuz ve
         bu listedeki tum cift sayıların carpımını return eden bir method yazınız...
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("oluşturmk istediğiniz boyutu giriniz:");
        int boyut= sc.nextInt();
        ArrayList<Integer>listRandom=new ArrayList<>();
        for (int i = 0; i <boyut ; i++) {
            listRandom.add((int) (Math.random()*100+1));
            
        }
        System.out.println("listRandom = " + listRandom);

        System.out.println("evenNumber(listRandom) = " + evenNumber(listRandom));


    }//mainsonu

    private static int evenNumber(ArrayList<Integer> listRandom) {
   int carpim=1;
   int count=0;
        for (int value:listRandom) {
           if(value%2==0){
               carpim*=value;
               count++;
           }

        }
     if(count==0){
         System.out.println("listede çift sayı yok");
         carpim=0;
     }
       return carpim;
    }


}
