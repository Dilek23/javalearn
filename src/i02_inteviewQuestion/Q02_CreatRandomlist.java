package i02_inteviewQuestion;

import java.util.ArrayList;

public class Q02_CreatRandomlist {
    // int array list oluşturun 10 elemandan oluşmalı
// random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
// bu metod array list içinde 0' dan 20 ye kadar değer atasın.
// eğer çift sayı atarsa o elemanının yerine 111 yazsın
// eğer çift sayı yoksa çift sayı yoktur mesajını versin.
    public static void main(String[] args) {
    /*
    ArrayList<Integer> list= new ArrayList<>()  ;

randomEkle(list);




}//main
public static void randomEkle( ArrayList<Integer> a){
    for (int i = 0; i <10 ; i++) {
        a.add((int) (Math.random()*20));// 0 ile 20 arasında sayı eklemiş olduk

    }
    System.out.println(a);
    int counter=0;
    for (int i = 0; i <a.size() ; i++) {
        counter++;
        if (a.get(i)%2==0){
            a.set(i,111);
        }
    }
    System.out.println(a);
    if(counter==0){
        System.out.println("cift sayi yoktur...");
    }

     */
        ArrayList<Integer> list = new ArrayList<>();
        ranDomEKle(list);


    }

    private static void ranDomEKle(ArrayList<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 20));

        }
        System.out.println("Random list = " + list);
        int counter=0;
        for (int i = 0; i < list.size(); i++) {
          counter++;
          if(list.get(i)%2==0){
              list.set(i,111);
          }


        }
        System.out.println(list);
        if(counter==0){
            System.out.println("çift sayi yok");
        }

    }
}
