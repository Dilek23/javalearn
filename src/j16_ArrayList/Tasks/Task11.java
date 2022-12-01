package j16_ArrayList.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        // kullanıcıdaqn tek seferde alacagınız 2 kelimelik ad soyadı 2 ayrı kelime olarak yaz
        Scanner sc=new Scanner(System.in);
        System.out.print("ad soyad giriniz: ");
        String adsyd=sc.nextLine();

String ad=adsyd.substring(0,adsyd.indexOf(" "));
String soyad=adsyd.substring(adsyd.indexOf(" "));
        System.out.println(ad);
        System.out.println(soyad);

    }



    }


