package j15_Arrays.Tasks_Arrayeasy.Odevler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task12_Manav {


    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
ArrayList<Integer>fruitlist=new ArrayList<>(Arrays.asList(5,3,4,8,7));
double toplm=0;
int urun;
double kG=0;
Scanner sc=new Scanner(System.in);
int dvm=1;
while (dvm==1){
    System.out.print("Almak istediginiz urunu sec : portakal=0,elma=1,limon=2,muz=3,kiwi=4 tuslayınız: ");
   urun= sc.nextInt();
    System.out.print("kaç kg aldıgınız yazın? ");
    kG= sc.nextDouble();
   toplm+=fruitlist.get(urun)*kG;
    System.out.println("başka urun almak istiyorsanız EVEt:1 istemiyorsanız HAYIR:2");
    dvm= sc.nextInt();
    if(dvm==2){
        System.out.println("Ödemeniz gereken toplam tutar " + toplm);
    }


}



    }




}

