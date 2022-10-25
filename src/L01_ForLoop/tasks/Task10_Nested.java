package L01_ForLoop.tasks;

import java.util.Scanner;

public class Task10_Nested {
    public static void main(String[] args) {
/*
girilen bir ifadenin istenen harf sayısını print edn cod.
input:selam javacanlar
output:a sayısı:3
 */
/*
        Scanner sc=new Scanner(System.in);
        System.out.println("bir ifade giriniz:");
      String cumle=sc.nextLine();
        System.out.println("cumle içinden sayılacak harfi gir");
        char harf=sc.next().charAt(0);
        int HarfSayısı=0;// ilk deger 0 atandıki saymada etki etmesin
        for(int i=0;i<=cumle.length()-1;i++){
            if(cumle.charAt(i)==harf){
                HarfSayısı++;

            }
        }
        System.out.println("girdiğiniz cumle:"+cumle+"de istediginiz harf:"+harf+HarfSayısı+"kadar var");
        */
        Scanner sc=new Scanner(System.in);
        System.out.println("bir ifade giriniz:");
        String cumle=sc.nextLine();
        System.out.println("cumle içinden sayılacak harfi gir");
        char harf=sc.next().charAt(0);
        int HarfSayisi=0;
        for(int i=0;i<=cumle.length()-1;i++){
          if(cumle.charAt(i)==harf){
              HarfSayisi++;
          }
        }
        System.out.println("Girilen cumle içinde "+HarfSayisi+ " tane "+harf+ "  harfi vardır..!");

    }
}
