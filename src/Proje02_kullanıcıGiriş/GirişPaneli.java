package Proje02_kullanıcıGiriş;

import java.util.ArrayList;
import java.util.Scanner;

public class GirişPaneli {

    public static void giriş(){
        Scanner sc=new Scanner(System.in);

        Kayıt yeniKayıt=new Kayıt();//kayıt clasa erişim için prmrsiz cons ile yeni obj uretildi.

        // kayıt classdan obj olmadan metod call etmek için
        ArrayList<Kullanici> kişi=new ArrayList<>();//kullanici clasdan uretien obj tutulacagi bos list

        boolean cıkılsınMı=true;// cıkılsınmı false olna kadar döner
        while (cıkılsınMı){
            System.out.println("Ne yapmak istersiniz\n1->Kullanıcı kayıt al\n2-> sanslı kişi bul\n3-> Listele\n4->Çıkış");
            int tercih=sc.nextInt();
            switch (tercih){
                case 1:
                    kişi= yeniKayıt.kyitAl();// kayıt class dan yenikayt obj ile yenikyt metod call
                    break;
                case 2:
                    yeniKayıt.sanslıKullanici(kişi);
                    break;
                case 3:
                    yeniKayıt.listele(kişi);
                    break;

                case 4:

                    cıkılsınMı=false;
                    break;
                default:
                    System.out.println("Hatalı secim yaptınız...");
            }
        }

    }


}
