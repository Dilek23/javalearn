package i01_interviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
   /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
   public static void main(String[] args) {
       /*
       Scanner sc=new Scanner(System.in);
       System.out.print("String bir ifade giriniz:");
       String str=sc.nextLine();
       String [] arr=str.split("");// split ile her bir hiçlikle ayırdık karakteri ayırdık
       System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
       int counter=0;
       // karakterleri karşılaştırmak için for
       for (int i =1; i <arr.length;i++) {
           if (arr[i-1].equals(arr[i])) { //birden fazla sayidaki karakter icin
               counter++;
           } else {
               System.out.println(arr[i - 1] + "sayisi" + (counter + 1));
               counter = 0; // tek karakteri görünce bir tane sayıp tekrar sıfırlaması için counter=0yaptık
           }

           if (i == arr.length - 1) {
               System.out.println(arr[i] + "sayisi" + (counter + 1));
           }


       }


        */

       Scanner sc=new Scanner(System.in);
       System.out.print("String bir ifade giriniz:");
       String str=sc.nextLine();
       String arr[]=str.split("");
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
       int counter=0;

       for (int i =1; i < arr.length ; i++) {
           if(arr[i-1].equals(arr[i])){
               counter++;
           }else
               System.out.println(arr[i-1]+ "sayisi" + (counter + 1)+" tane var...") ;
           counter=0;

           if (i==arr.length-1){
               System.out.println(arr[i] + " sayisi" + counter);


           }
       }




         }
       }





