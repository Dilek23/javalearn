package j11_MethodCreation;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
    // girilen iki sayının eşitliğini kontrol eden metot creat ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı1= sc.nextInt();
        System.out.println("ikinci sayı giriniz");
        int sayı2= sc.nextInt();
    esitKontrol(sayı1,sayı2);
esitKontrol2(3,5);
esitKontrol2(33,33);
esitKontrol2(61,61);
esitKontrol2(sayı1,sayı2);

    }// main dışı

    public static boolean esitKontrol(int sayı1, int sayı2) {
        boolean esitMi=false;
       if(sayı1==sayı2){
esitMi=true;
       }else esitMi=false;
return esitMi;
    }
public static void esitKontrol2(int a,int b){
        if (a==b){
            System.out.println("sayılar esit:)");
        }else System.out.println("sayılar eşit degil:(");

}

}







