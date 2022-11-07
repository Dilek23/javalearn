package Proje02_kullanıcıGiriş;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayıt {

     ArrayList<Kullanici>kullaniciKişiler= new ArrayList<>();// kullanıcı clasdan oluşturulacak obj. lerin tutulacagı boş list.


    public ArrayList<Kullanici> kyitAl(){//Kullanıcı classdan getirerek oluşturulacak obje için kullanıcı listeledik
         Scanner sc = new Scanner(System.in);
         System.out.print("Adınızı giriniz:");
        String ad= sc.nextLine();//Kullanıcı obj. için name alındı.
         Kullanici k1=new Kullanici(ad,LocalDateTime.now());// k1 obj.name kullanıcıdan kayıt zamanını localdatetime.now dan alacak
      kullaniciKişiler.add(k1);//oluşturulan k1 obj.liste eklendi.

       return kullaniciKişiler;

              }
public void sanslıKullanici( ArrayList<Kullanici>kllObj) {// kulllanıcı listindeki objelerin kayıt zamanının
    for (Kullanici k : kllObj) {// kulllanıcı classdan üretilen kayıtAl metod ile uretlp liste atılan objler dönguye alındı.
        if (k.kayitzamani.getSecond()<=10) {//döngüye giren her bir kullanıcı objsnin kytzamani 10 ddan kçk olma sartını sagladı
            System.out.println(k.name + "Şanslı kişisiniz...Sisteme giriş zamanınız: )" + k.kayitzamani);
        } else System.out.println(k.name + "maalesef  kayıt suresini gectiniz...:(" + k.kayitzamani);

    }
}
public void listele(ArrayList<Kullanici>kllObj){
        System.out.println(kllObj);
    }
}










